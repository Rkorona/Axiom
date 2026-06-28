package com.server.auditor.ssh.client.synchronization;

import com.server.auditor.ssh.client.database.models.ChainHostsDBModel;
import com.server.auditor.ssh.client.database.models.GroupDBModel;
import com.server.auditor.ssh.client.database.models.IdentityDBModel;
import com.server.auditor.ssh.client.database.models.KnownHostsDBModel;
import com.server.auditor.ssh.client.database.models.MultiKeyDBModel;
import com.server.auditor.ssh.client.database.models.ProxyDBModel;
import com.server.auditor.ssh.client.database.models.RuleDBModel;
import com.server.auditor.ssh.client.database.models.SharedTelnetConfigIdentityDBModel;
import com.server.auditor.ssh.client.database.models.SnippetDBModel;
import com.server.auditor.ssh.client.database.models.SnippetHostDBModel;
import com.server.auditor.ssh.client.database.models.SnippetPackageDBModel;
import com.server.auditor.ssh.client.database.models.SshCertificateDBModel;
import com.server.auditor.ssh.client.database.models.SshConfigIdentityDBModel;
import com.server.auditor.ssh.client.database.models.SshKeyDBModel;
import com.server.auditor.ssh.client.database.models.TagDBModel;
import com.server.auditor.ssh.client.database.models.TagHostDBModel;
import com.server.auditor.ssh.client.database.models.TelnetConfigIdentityDBModel;
import com.server.auditor.ssh.client.database.models.config.SshRemoteConfigDBModel;
import com.server.auditor.ssh.client.database.models.config.TelnetRemoteConfigDBModel;
import com.server.auditor.ssh.client.database.models.credentialssharing.SharedSshConfigIdentityDBModel;
import com.server.auditor.ssh.client.synchronization.CryptoErrorCollector;
import com.server.auditor.ssh.client.synchronization.api.adapters.BulkApiAdapter;
import com.server.auditor.ssh.client.synchronization.api.adapters.HostBulkApiAdapter;
import com.server.auditor.ssh.client.synchronization.api.adapters.SnippetHostBulkApiAdapter;
import com.server.auditor.ssh.client.synchronization.api.adapters.SshCertificateBulkApiAdapter;
import com.server.auditor.ssh.client.synchronization.api.adapters.SshKeyBulkApiAdapter;
import com.server.auditor.ssh.client.synchronization.api.adapters.TagHostBulkApiAdapter;
import com.server.auditor.ssh.client.synchronization.api.converters.CertificateBulkCreator;
import com.server.auditor.ssh.client.synchronization.api.converters.ChainHostBulkCreator;
import com.server.auditor.ssh.client.synchronization.api.converters.ContentPatcher;
import com.server.auditor.ssh.client.synchronization.api.converters.GroupBulkCreator;
import com.server.auditor.ssh.client.synchronization.api.converters.HostBulkCreator;
import com.server.auditor.ssh.client.synchronization.api.converters.IdentityBulkCreator;
import com.server.auditor.ssh.client.synchronization.api.converters.KnownHostBulkCreator;
import com.server.auditor.ssh.client.synchronization.api.converters.MultiKeyBulkCreator;
import com.server.auditor.ssh.client.synchronization.api.converters.PackageBulkCreator;
import com.server.auditor.ssh.client.synchronization.api.converters.PortForwardingBulkCreator;
import com.server.auditor.ssh.client.synchronization.api.converters.ProxyBulkCreator;
import com.server.auditor.ssh.client.synchronization.api.converters.SharedSshConfigIdentityBulkCreator;
import com.server.auditor.ssh.client.synchronization.api.converters.SharedTelnetConfigIdentityBulkCreator;
import com.server.auditor.ssh.client.synchronization.api.converters.SnippetBulkCreator;
import com.server.auditor.ssh.client.synchronization.api.converters.SnippetHostBulkCreator;
import com.server.auditor.ssh.client.synchronization.api.converters.SshConfigBulkCreator;
import com.server.auditor.ssh.client.synchronization.api.converters.SshConfigIdentityBulkCreator;
import com.server.auditor.ssh.client.synchronization.api.converters.SshKeyBulkCreator;
import com.server.auditor.ssh.client.synchronization.api.converters.TagBulkCreator;
import com.server.auditor.ssh.client.synchronization.api.converters.TagHostBulkCreator;
import com.server.auditor.ssh.client.synchronization.api.converters.TelnetConfigBulkCreator;
import com.server.auditor.ssh.client.synchronization.api.converters.TelnetConfigIdentityBulkCreator;
import com.server.auditor.ssh.client.synchronization.api.models.RelevantVaultKeyIdRepository;
import com.server.auditor.ssh.client.synchronization.api.models.bulk.BulkModel;
import com.server.auditor.ssh.client.synchronization.api.models.bulk.DeleteSet;
import com.server.auditor.ssh.client.synchronization.api.models.chainhost.ChainHostBulk;
import com.server.auditor.ssh.client.synchronization.api.models.group.GroupBulk;
import com.server.auditor.ssh.client.synchronization.api.models.host.HostBulk;
import com.server.auditor.ssh.client.synchronization.api.models.identity.CertificateBulk;
import com.server.auditor.ssh.client.synchronization.api.models.identity.IdentityBulk;
import com.server.auditor.ssh.client.synchronization.api.models.identity.SharedSshConfigIdentityBulk;
import com.server.auditor.ssh.client.synchronization.api.models.identity.SharedTelnetConfigIdentityBulk;
import com.server.auditor.ssh.client.synchronization.api.models.identity.SshConfigIdentityBulk;
import com.server.auditor.ssh.client.synchronization.api.models.identity.TelnetConfigIdentityBulk;
import com.server.auditor.ssh.client.synchronization.api.models.knownhost.KnownHostBulk;
import com.server.auditor.ssh.client.synchronization.api.models.pfrule.RuleBulk;
import com.server.auditor.ssh.client.synchronization.api.models.proxy.ProxyBulk;
import com.server.auditor.ssh.client.synchronization.api.models.snippet.SnippetBulk;
import com.server.auditor.ssh.client.synchronization.api.models.snippet.snippetPackage.PackageBulk;
import com.server.auditor.ssh.client.synchronization.api.models.snippethost.SnippetHostBulk;
import com.server.auditor.ssh.client.synchronization.api.models.ssh.config.SshConfigBulk;
import com.server.auditor.ssh.client.synchronization.api.models.ssh.key.SshKeyBulk;
import com.server.auditor.ssh.client.synchronization.api.models.ssh.key.multi.MultiKeyBulk;
import com.server.auditor.ssh.client.synchronization.api.models.tag.TagBulk;
import com.server.auditor.ssh.client.synchronization.api.models.taghost.TagHostBulk;
import com.server.auditor.ssh.client.synchronization.api.models.telnet.config.TelnetConfigBulk;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import rg.v;
import tp.o0;
import ut.u;

/* JADX INFO: loaded from: classes4.dex */
public class BulkModelCreator {
    private final BulkModelCreatorInteractor bulkModelCreatorInteractor;
    private final rg.h defaultTeamCryptor;
    private final hg.f factory;
    private final RelevantVaultKeyIdRepository relevantVaultKeyIdRepository = new RelevantVaultKeyIdRepository(vl.g.f83702b.b());
    private final rg.h remoteEncryptByAnnotation;
    private final HashMap<Long, rg.h> teamEncryptByAnnotationMap;

    public BulkModelCreator(rg.h hVar, v vVar) {
        hg.f fVarP = hg.f.p();
        this.factory = fVarP;
        this.bulkModelCreatorInteractor = new BulkModelCreatorInteractor(fVarP, new BulkApiAdapter(fVarP.U(), getSshConfigIdentityBulkCreator()), new BulkApiAdapter(fVarP.g0(), getTelnetConfigIdentityBulkCreator()));
        this.remoteEncryptByAnnotation = hVar;
        this.teamEncryptByAnnotationMap = vVar.k();
        this.defaultTeamCryptor = vVar.w();
    }

    private void addIdentityToSyncIfConnectWithProxy(hg.f fVar, List<IdentityBulk> list, List<IdentityBulk> list2) {
        Iterator<ProxyDBModel> it = fVar.B().getItemList(null).iterator();
        while (it.hasNext()) {
            Long identityId = it.next().getIdentityId();
            for (IdentityBulk identityBulk : list2) {
                Long localId = identityBulk.getLocalId();
                if (localId != null && localId.equals(identityId) && !list.contains(identityBulk)) {
                    list.add(identityBulk);
                }
            }
        }
    }

    private void addIdentityToSyncIfSshConfigWasRemoved(hg.f fVar, List<IdentityBulk> list, List<IdentityBulk> list2) {
        Iterator<SharedSshConfigIdentityDBModel> it = fVar.E().getItemListDeleteFailed().iterator();
        while (it.hasNext()) {
            long identityId = it.next().getIdentityId();
            for (IdentityBulk identityBulk : list2) {
                Long localId = identityBulk.getLocalId();
                if (localId != null && identityId == localId.longValue() && !list.contains(identityBulk)) {
                    list.add(identityBulk);
                }
            }
        }
    }

    private void addIdentityToSyncIfTelnetConfigWasRemoved(hg.f fVar, List<IdentityBulk> list, List<IdentityBulk> list2) {
        Iterator<SharedTelnetConfigIdentityDBModel> it = fVar.G().getItemListDeleteFailed().iterator();
        while (it.hasNext()) {
            long identityId = it.next().getIdentityId();
            for (IdentityBulk identityBulk : list2) {
                Long localId = identityBulk.getLocalId();
                if (localId != null && identityId == localId.longValue() && !list.contains(identityBulk)) {
                    list.add(identityBulk);
                }
            }
        }
    }

    private void addKeyToSyncIfItConnectToProxiesIdentity(List<SshKeyBulk> list, List<SshKeyBulk> list2) {
        Iterator<IdentityDBModel> it = this.factory.n().getItemList(null).iterator();
        while (it.hasNext()) {
            Long sshKeyId = it.next().getSshKeyId();
            for (SshKeyBulk sshKeyBulk : list2) {
                Long localId = sshKeyBulk.getLocalId();
                if (sshKeyId != null && sshKeyId.equals(localId) && !list.contains(sshKeyBulk)) {
                    list.add(sshKeyBulk);
                }
            }
        }
    }

    private void addSharedIdentitiesToSyncList(List<IdentityBulk> list, List<IdentityBulk> list2) {
        for (IdentityBulk identityBulk : list2) {
            if (Boolean.TRUE.equals(identityBulk.getShared())) {
                list.add(identityBulk);
            }
        }
    }

    private void collectBulkModelsToEncrypt(List<?> list, List<u> list2) {
        for (Object obj : list) {
            if (this.bulkModelCreatorInteractor.isSharedBulkModel(obj)) {
                setCryptorForSharedBulkModel(obj, list2);
            } else {
                list2.add(new u(obj, this.remoteEncryptByAnnotation));
            }
        }
    }

    private void encryptBulkModelByCryptor(Object obj, rg.h hVar) throws IllegalAccessException, IllegalArgumentException, rg.r, FailedToEncryptException {
        hVar.G(obj, obj.getClass());
    }

    private void encryptBulkModelsBeforeSync(List<u> list) throws IllegalAccessException, IllegalArgumentException, rg.r, FailedToEncryptException {
        if (list.isEmpty()) {
            return;
        }
        CryptoErrorCollector cryptoErrorCollector = new CryptoErrorCollector();
        Iterator<u> it = list.iterator();
        while (it.hasNext()) {
            ((rg.h) it.next().d()).s0(cryptoErrorCollector);
        }
        for (u uVar : list) {
            encryptBulkModelByCryptor(uVar.c(), (rg.h) uVar.d());
        }
    }

    private BulkApiAdapter<ChainHostBulk, ChainHostsDBModel> getChainHostBulkApiAdapter() {
        return new BulkApiAdapter<>(this.factory.c(), new ChainHostBulkCreator(this.factory.i(), this.factory.S(), com.server.auditor.ssh.client.app.a.N(), this.relevantVaultKeyIdRepository));
    }

    private BulkApiAdapter<GroupBulk, GroupDBModel> getGroupBulkApiAdapter() {
        return new BulkApiAdapter<>(this.factory.h(), new GroupBulkCreator(this.factory.S(), this.factory.e0(), this.factory.h(), com.server.auditor.ssh.client.app.a.N(), this.relevantVaultKeyIdRepository, new ContentPatcher()));
    }

    private HostBulkApiAdapter getHostBulkApiAdapter() {
        return new HostBulkApiAdapter(this.factory.i(), new HostBulkCreator(this.factory.S(), this.factory.e0(), this.factory.h(), com.server.auditor.ssh.client.app.a.N(), new ContentPatcher(), this.relevantVaultKeyIdRepository));
    }

    private BulkApiAdapter<IdentityBulk, IdentityDBModel> getIdentityBulkApiAdapter() {
        return new BulkApiAdapter<>(this.factory.n(), new IdentityBulkCreator(this.factory.W(), com.server.auditor.ssh.client.app.a.N(), new ContentPatcher(), this.relevantVaultKeyIdRepository));
    }

    private BulkApiAdapter<KnownHostBulk, KnownHostsDBModel> getKnownHostsBulkApiAdapter() {
        return new BulkApiAdapter<>(this.factory.r(), new KnownHostBulkCreator(com.server.auditor.ssh.client.app.a.N(), new ContentPatcher(), this.relevantVaultKeyIdRepository));
    }

    private BulkApiAdapter<MultiKeyBulk, MultiKeyDBModel> getMultiKeyBulkApiAdapter() {
        return new BulkApiAdapter<>(this.factory.x(), new MultiKeyBulkCreator(com.server.auditor.ssh.client.app.a.N(), new ContentPatcher(), this.relevantVaultKeyIdRepository));
    }

    private BulkApiAdapter<RuleBulk, RuleDBModel> getPFRuleBulkApiAdapter() {
        return new BulkApiAdapter<>(this.factory.z(), new PortForwardingBulkCreator(this.factory.i(), com.server.auditor.ssh.client.app.a.N(), new ContentPatcher(), this.relevantVaultKeyIdRepository));
    }

    private BulkApiAdapter<ProxyBulk, ProxyDBModel> getProxyBulkApiAdapter() {
        return new BulkApiAdapter<>(this.factory.B(), new ProxyBulkCreator(this.factory.n(), com.server.auditor.ssh.client.app.a.N(), new ContentPatcher(), new a(), this.relevantVaultKeyIdRepository));
    }

    private List<Long> getSharedCertificatesToDelete(hg.f fVar) {
        ArrayList arrayList = new ArrayList();
        for (Long l10 : fVar.Q().getDeletedRemoteId()) {
            if (fVar.Q().getItemByRemoteId(l10.longValue()).isShared()) {
                arrayList.add(l10);
            }
        }
        return arrayList;
    }

    private List<CertificateBulk> getSharedCertificatesToSync(BulkApiAdapter<CertificateBulk, SshCertificateDBModel> bulkApiAdapter) {
        List<CertificateBulk> updateModels = bulkApiAdapter.getUpdateModels();
        ArrayList arrayList = new ArrayList();
        for (CertificateBulk certificateBulk : updateModels) {
            if (Boolean.TRUE.equals(certificateBulk.getShared()) && !arrayList.contains(certificateBulk)) {
                arrayList.add(certificateBulk);
            }
        }
        return arrayList;
    }

    private List<Long> getSharedIdentitiesToDelete(hg.f fVar) {
        ArrayList arrayList = new ArrayList();
        for (Long l10 : fVar.n().getDeletedRemoteId()) {
            if (fVar.n().getItemByRemoteId(l10.longValue()).isShared()) {
                arrayList.add(l10);
            }
        }
        return arrayList;
    }

    private List<IdentityBulk> getSharedIdentitiesToSync(BulkApiAdapter<IdentityBulk, IdentityDBModel> bulkApiAdapter) {
        List<IdentityBulk> updateModels = bulkApiAdapter.getUpdateModels();
        ArrayList arrayList = new ArrayList();
        addSharedIdentitiesToSyncList(arrayList, updateModels);
        addIdentityToSyncIfSshConfigWasRemoved(this.factory, arrayList, updateModels);
        addIdentityToSyncIfTelnetConfigWasRemoved(this.factory, arrayList, updateModels);
        addIdentityToSyncIfConnectWithProxy(this.factory, arrayList, updateModels);
        return arrayList;
    }

    private BulkApiAdapter<SharedSshConfigIdentityBulk, SharedSshConfigIdentityDBModel> getSharedSshConfigIdentityBulkApiAdapter() {
        return new BulkApiAdapter<>(this.factory.E(), new SharedSshConfigIdentityBulkCreator(this.factory.S(), this.factory.n(), com.server.auditor.ssh.client.app.a.N(), this.relevantVaultKeyIdRepository));
    }

    private List<Long> getSharedSshKeysToDelete(hg.f fVar) {
        ArrayList arrayList = new ArrayList();
        for (Long l10 : fVar.W().getDeletedRemoteId()) {
            if (fVar.W().getItemByRemoteId(l10.longValue()).isShared()) {
                arrayList.add(l10);
            }
        }
        return arrayList;
    }

    private List<SshKeyBulk> getSharedSshKeysToSync(BulkApiAdapter<SshKeyBulk, SshKeyDBModel> bulkApiAdapter, List<IdentityBulk> list, List<ProxyBulk> list2) {
        List<SshKeyBulk> updateModels = bulkApiAdapter.getUpdateModels();
        ArrayList arrayList = new ArrayList();
        for (SshKeyBulk sshKeyBulk : updateModels) {
            if (Boolean.TRUE.equals(sshKeyBulk.getShared()) && !arrayList.contains(sshKeyBulk)) {
                arrayList.add(sshKeyBulk);
            }
        }
        for (SshKeyBulk sshKeyBulk2 : updateModels) {
            if (o0.f80986a.d(sshKeyBulk2, list2, list) && !arrayList.contains(sshKeyBulk2)) {
                arrayList.add(sshKeyBulk2);
            }
        }
        addKeyToSyncIfItConnectToProxiesIdentity(arrayList, updateModels);
        return arrayList;
    }

    private BulkApiAdapter<SharedTelnetConfigIdentityBulk, SharedTelnetConfigIdentityDBModel> getSharedTelnetConfigIdentityBulkApiAdapter() {
        return new BulkApiAdapter<>(this.factory.G(), new SharedTelnetConfigIdentityBulkCreator(this.factory.e0(), this.factory.n(), com.server.auditor.ssh.client.app.a.N(), this.relevantVaultKeyIdRepository));
    }

    private BulkApiAdapter<SnippetBulk, SnippetDBModel> getSnippetBulkApiAdapter() {
        return new BulkApiAdapter<>(this.factory.J(), new SnippetBulkCreator(com.server.auditor.ssh.client.app.a.N(), this.factory.O(), new ContentPatcher(), this.relevantVaultKeyIdRepository));
    }

    private BulkApiAdapter<SnippetHostBulk, SnippetHostDBModel> getSnippetHostBulkApiAdapter() {
        return new SnippetHostBulkApiAdapter(this.factory.M(), this.factory.i(), new SnippetHostBulkCreator(this.factory.i(), this.factory.J(), com.server.auditor.ssh.client.app.a.N(), this.relevantVaultKeyIdRepository));
    }

    private BulkApiAdapter<PackageBulk, SnippetPackageDBModel> getSnippetPackageBulkApiAdapter() {
        return new BulkApiAdapter<>(this.factory.O(), new PackageBulkCreator(com.server.auditor.ssh.client.app.a.N(), new ContentPatcher(), this.relevantVaultKeyIdRepository));
    }

    private BulkApiAdapter<CertificateBulk, SshCertificateDBModel> getSshCertificateBulkApiAdapter() {
        return new SshCertificateBulkApiAdapter(this.factory.Q(), new CertificateBulkCreator(this.factory.W(), com.server.auditor.ssh.client.app.a.N(), new ContentPatcher(), this.relevantVaultKeyIdRepository), this.factory.W());
    }

    private BulkApiAdapter<SshConfigBulk, SshRemoteConfigDBModel> getSshConfigBulkApiAdapter() {
        return new BulkApiAdapter<>(this.factory.S(), new SshConfigBulkCreator(this.factory.B(), this.factory.J(), com.server.auditor.ssh.client.app.a.N(), new ContentPatcher(), this.relevantVaultKeyIdRepository));
    }

    private BulkApiAdapter<SshConfigIdentityBulk, SshConfigIdentityDBModel> getSshConfigIdentityBulkApiAdapter() {
        return new BulkApiAdapter<>(this.factory.U(), getSshConfigIdentityBulkCreator());
    }

    private SshConfigIdentityBulkCreator getSshConfigIdentityBulkCreator() {
        return new SshConfigIdentityBulkCreator(this.factory.S(), this.factory.n(), new a(), com.server.auditor.ssh.client.app.a.N(), this.relevantVaultKeyIdRepository);
    }

    private BulkApiAdapter<SshKeyBulk, SshKeyDBModel> getSshKeyBulkApiAdapter() {
        return new SshKeyBulkApiAdapter(this.factory.W(), new SshKeyBulkCreator(com.server.auditor.ssh.client.app.a.N(), new ContentPatcher(), this.relevantVaultKeyIdRepository));
    }

    private BulkApiAdapter<TagBulk, TagDBModel> getTagBulkApiAdapter() {
        return new BulkApiAdapter<>(this.factory.a0(), new TagBulkCreator(com.server.auditor.ssh.client.app.a.N(), new ContentPatcher(), this.relevantVaultKeyIdRepository));
    }

    private BulkApiAdapter<TagHostBulk, TagHostDBModel> getTagHostBulkApiAdapter() {
        return new TagHostBulkApiAdapter(this.factory.c0(), this.factory.i(), new TagHostBulkCreator(this.factory.i(), this.factory.a0(), com.server.auditor.ssh.client.app.a.N(), this.relevantVaultKeyIdRepository));
    }

    private rg.h getTeamCryptorByEncryptedWith(Long l10) {
        return this.teamEncryptByAnnotationMap.get(l10);
    }

    private rg.h getTeamCryptorForEntity(Object obj) {
        Long encryptedWithOfBulkModel = this.bulkModelCreatorInteractor.getEncryptedWithOfBulkModel(obj);
        return (encryptedWithOfBulkModel == null || encryptedWithOfBulkModel.equals(VaultKeyId.Companion.b().getId())) ? this.defaultTeamCryptor : getTeamCryptorByEncryptedWith(encryptedWithOfBulkModel);
    }

    private BulkApiAdapter<TelnetConfigBulk, TelnetRemoteConfigDBModel> getTelnetConfigBulkApiAdapter() {
        return new BulkApiAdapter<>(this.factory.e0(), new TelnetConfigBulkCreator(com.server.auditor.ssh.client.app.a.N(), new ContentPatcher(), this.relevantVaultKeyIdRepository));
    }

    private BulkApiAdapter<TelnetConfigIdentityBulk, TelnetConfigIdentityDBModel> getTelnetConfigIdentityBulkApiAdapter() {
        return new BulkApiAdapter<>(this.factory.g0(), getTelnetConfigIdentityBulkCreator());
    }

    private TelnetConfigIdentityBulkCreator getTelnetConfigIdentityBulkCreator() {
        return new TelnetConfigIdentityBulkCreator(this.factory.e0(), this.factory.n(), new a(), com.server.auditor.ssh.client.app.a.N(), this.relevantVaultKeyIdRepository);
    }

    private DeleteSet prepareDeleteSet(hg.f fVar) {
        return new DeleteSet(fVar.W().getDeletedRemoteId(), fVar.Q().getDeletedRemoteId(), fVar.c0().getDeletedRemoteId(), fVar.n().getDeletedRemoteId(), fVar.i().getDeletedRemoteId(), fVar.S().getDeletedRemoteId(), fVar.e0().getDeletedRemoteId(), fVar.B().getDeletedRemoteId(), fVar.O().getDeletedRemoteId(), fVar.J().getDeletedRemoteId(), fVar.z().getDeletedRemoteId(), fVar.h().getDeletedRemoteId(), fVar.a0().getDeletedRemoteId(), fVar.r().getDeletedRemoteId(), fVar.M().getDeletedRemoteId(), fVar.c().getDeletedRemoteId(), fVar.U().getDeletedRemoteId(), fVar.g0().getDeletedRemoteId(), new ArrayList(), fVar.E().getDeletedRemoteId(), fVar.G().getDeletedRemoteId());
    }

    private void setCryptorForSharedBulkModel(Object obj, List<u> list) {
        rg.h teamCryptorForEntity = getTeamCryptorForEntity(obj);
        if (teamCryptorForEntity != null && !this.bulkModelCreatorInteractor.isKeyInsideCryptorForViewOnly(teamCryptorForEntity)) {
            list.add(new u(obj, teamCryptorForEntity));
        } else {
            this.bulkModelCreatorInteractor.resetSharedParametersForBulkModel(obj);
            list.add(new u(obj, this.remoteEncryptByAnnotation));
        }
    }

    public BulkModel getBulkModel(boolean z10, String str) throws ow.k, IllegalAccessException, IllegalArgumentException, rg.r, FailedToEncryptException {
        List<SshKeyBulk> sharedSshKeysToSync;
        List<IdentityBulk> sharedIdentitiesToSync;
        List<CertificateBulk> sharedCertificatesToSync;
        DeleteSet deleteSet;
        BulkApiAdapter<SshKeyBulk, SshKeyDBModel> sshKeyBulkApiAdapter = getSshKeyBulkApiAdapter();
        BulkApiAdapter<IdentityBulk, IdentityDBModel> identityBulkApiAdapter = getIdentityBulkApiAdapter();
        BulkApiAdapter<CertificateBulk, SshCertificateDBModel> sshCertificateBulkApiAdapter = getSshCertificateBulkApiAdapter();
        List<SshKeyBulk> updateModels = sshKeyBulkApiAdapter.getUpdateModels();
        List<IdentityBulk> updateModels2 = identityBulkApiAdapter.getUpdateModels();
        List<CertificateBulk> updateModels3 = sshCertificateBulkApiAdapter.getUpdateModels();
        List<HostBulk> updateModels4 = getHostBulkApiAdapter().getUpdateModels();
        List<SshConfigBulk> updateModels5 = getSshConfigBulkApiAdapter().getUpdateModels();
        List<TelnetConfigBulk> updateModels6 = getTelnetConfigBulkApiAdapter().getUpdateModels();
        List<ProxyBulk> updateModels7 = getProxyBulkApiAdapter().getUpdateModels();
        List<PackageBulk> updateModels8 = getSnippetPackageBulkApiAdapter().getUpdateModels();
        List<SnippetBulk> updateModels9 = getSnippetBulkApiAdapter().getUpdateModels();
        List<TagBulk> updateModels10 = getTagBulkApiAdapter().getUpdateModels();
        List<TagHostBulk> updateModels11 = getTagHostBulkApiAdapter().getUpdateModels();
        List<SnippetHostBulk> updateModels12 = getSnippetHostBulkApiAdapter().getUpdateModels();
        List<ChainHostBulk> updateModels13 = getChainHostBulkApiAdapter().getUpdateModels();
        List<KnownHostBulk> updateModels14 = getKnownHostsBulkApiAdapter().getUpdateModels();
        List<RuleBulk> updateModels15 = getPFRuleBulkApiAdapter().getUpdateModels();
        List<GroupBulk> updateModels16 = getGroupBulkApiAdapter().getUpdateModels();
        getSshConfigIdentityBulkApiAdapter().getUpdateModels();
        List<SharedSshConfigIdentityBulk> arrayList = new ArrayList<>();
        getTelnetConfigIdentityBulkApiAdapter().getUpdateModels();
        List<SharedTelnetConfigIdentityBulk> arrayList2 = new ArrayList<>();
        List<MultiKeyBulk> updateModels17 = getMultiKeyBulkApiAdapter().getUpdateModels();
        DeleteSet deleteSetPrepareDeleteSet = prepareDeleteSet(this.factory);
        new ArrayList();
        new ArrayList();
        if (com.server.auditor.ssh.client.app.a.N().m()) {
            arrayList = getSharedSshConfigIdentityBulkApiAdapter().getUpdateModels();
            arrayList2 = getSharedTelnetConfigIdentityBulkApiAdapter().getUpdateModels();
        }
        List<SharedSshConfigIdentityBulk> list = arrayList;
        List<SharedTelnetConfigIdentityBulk> list2 = arrayList2;
        List<Long> deletedRemoteId = this.factory.E().getDeletedRemoteId();
        List<Long> deletedRemoteId2 = this.factory.G().getDeletedRemoteId();
        if (SyncServiceHelper.isIdentitySynced()) {
            sharedSshKeysToSync = updateModels;
            sharedIdentitiesToSync = updateModels2;
            sharedCertificatesToSync = updateModels3;
            deleteSet = deleteSetPrepareDeleteSet;
        } else {
            new ArrayList();
            new ArrayList();
            new ArrayList();
            sharedIdentitiesToSync = getSharedIdentitiesToSync(identityBulkApiAdapter);
            sharedSshKeysToSync = getSharedSshKeysToSync(sshKeyBulkApiAdapter, sharedIdentitiesToSync, updateModels7);
            sharedCertificatesToSync = getSharedCertificatesToSync(sshCertificateBulkApiAdapter);
            List<Long> sharedIdentitiesToDelete = getSharedIdentitiesToDelete(this.factory);
            List<Long> sharedSshKeysToDelete = getSharedSshKeysToDelete(this.factory);
            List<Long> sharedCertificatesToDelete = getSharedCertificatesToDelete(this.factory);
            new ArrayList();
            new ArrayList();
            deleteSet = new DeleteSet(sharedSshKeysToDelete, sharedCertificatesToDelete, this.factory.c0().getDeletedRemoteId(), sharedIdentitiesToDelete, this.factory.i().getDeletedRemoteId(), this.factory.S().getDeletedRemoteId(), this.factory.e0().getDeletedRemoteId(), this.factory.B().getDeletedRemoteId(), this.factory.O().getDeletedRemoteId(), this.factory.J().getDeletedRemoteId(), this.factory.z().getDeletedRemoteId(), this.factory.h().getDeletedRemoteId(), this.factory.a0().getDeletedRemoteId(), this.factory.r().getDeletedRemoteId(), this.factory.M().getDeletedRemoteId(), this.factory.c().getDeletedRemoteId(), new ArrayList(), new ArrayList(), new ArrayList(), deletedRemoteId, deletedRemoteId2);
        }
        CryptoErrorCollector cryptoErrorCollectorL = hg.f.p().v().l();
        if (!cryptoErrorCollectorL.getLocalDecryptErrors().isEmpty()) {
            com.server.auditor.ssh.client.utils.analytics.a aVarY = com.server.auditor.ssh.client.utils.analytics.a.y();
            for (CryptoErrorCollector.CryptoError.LocalDecryptError localDecryptError : cryptoErrorCollectorL.getLocalDecryptErrors()) {
                aVarY.t1(Avo.Action.LOCAL_DECRYPTION, localDecryptError.getType(), Integer.valueOf((int) localDecryptError.getRemoteId()), 3);
            }
            cryptoErrorCollectorL.clearLocalDecryptErrors();
            throw new ow.k();
        }
        ArrayList arrayList3 = new ArrayList();
        collectBulkModelsToEncrypt(updateModels9, arrayList3);
        collectBulkModelsToEncrypt(sharedSshKeysToSync, arrayList3);
        collectBulkModelsToEncrypt(sharedIdentitiesToSync, arrayList3);
        collectBulkModelsToEncrypt(updateModels5, arrayList3);
        collectBulkModelsToEncrypt(updateModels6, arrayList3);
        collectBulkModelsToEncrypt(updateModels7, arrayList3);
        collectBulkModelsToEncrypt(updateModels4, arrayList3);
        collectBulkModelsToEncrypt(updateModels15, arrayList3);
        collectBulkModelsToEncrypt(updateModels11, arrayList3);
        collectBulkModelsToEncrypt(updateModels12, arrayList3);
        collectBulkModelsToEncrypt(updateModels8, arrayList3);
        collectBulkModelsToEncrypt(updateModels14, arrayList3);
        collectBulkModelsToEncrypt(updateModels10, arrayList3);
        collectBulkModelsToEncrypt(updateModels16, arrayList3);
        collectBulkModelsToEncrypt(updateModels13, arrayList3);
        collectBulkModelsToEncrypt(updateModels17, arrayList3);
        collectBulkModelsToEncrypt(sharedCertificatesToSync, arrayList3);
        encryptBulkModelsBeforeSync(arrayList3);
        List<CertificateBulk> list3 = sharedCertificatesToSync;
        List<SshConfigIdentityBulk> listUpdateSshConfigIdentitiesDependsOfTeamKeys = this.bulkModelCreatorInteractor.updateSshConfigIdentitiesDependsOfTeamKeys(list, this.teamEncryptByAnnotationMap);
        List<TelnetConfigIdentityBulk> listUpdateTelnetConfigIdentitiesDependsOfTeamKeys = this.bulkModelCreatorInteractor.updateTelnetConfigIdentitiesDependsOfTeamKeys(list2, this.teamEncryptByAnnotationMap);
        BulkBadReferencesFilterKt.checkSshConfigsLocalReferences(updateModels5, updateModels7, updateModels9, this.factory.S());
        BulkBadReferencesFilterKt.checkHostsLocalReferences(updateModels4, updateModels5, updateModels6, updateModels16, this.factory.i());
        BulkBadReferencesFilterKt.checkGroupsLocalReferences(updateModels16, updateModels5, updateModels6, this.factory.h());
        BulkBadReferencesFilterKt.checkIdentitiesLocalReferences(sharedIdentitiesToSync, sharedSshKeysToSync, this.factory.n());
        BulkBadReferencesFilterKt.checkPortForwardingRulesLocalReferences(updateModels15, updateModels4, this.factory.z());
        BulkBadReferencesFilterKt.checkProxiesLocalReferences(updateModels7, sharedIdentitiesToSync, this.factory.B());
        BulkBadReferencesFilterKt.checkTagHostsLocalReferences(updateModels11, updateModels4, updateModels10, this.factory.c0());
        BulkBadReferencesFilterKt.checkSnippetHostsLocalReferences(updateModels12, updateModels4, updateModels9, this.factory.M());
        BulkBadReferencesFilterKt.checkChainHostsLocalReferences(updateModels13, updateModels5, this.factory.c());
        BulkBadReferencesFilterKt.checkSshConfigIdentitiesLocalReferences(listUpdateSshConfigIdentitiesDependsOfTeamKeys, updateModels5, sharedIdentitiesToSync, this.factory.U());
        BulkBadReferencesFilterKt.checkSharedSshConfigIdentitiesLocalReferences(list, updateModels5, sharedIdentitiesToSync, this.factory.E());
        BulkBadReferencesFilterKt.checkTelnetConfigIdentitiesLocalReferences(listUpdateTelnetConfigIdentitiesDependsOfTeamKeys, updateModels6, sharedIdentitiesToSync, this.factory.g0());
        BulkBadReferencesFilterKt.checkSharedTelnetConfigIdentitiesLocalReferences(list2, updateModels6, sharedIdentitiesToSync, this.factory.G());
        return new BulkModel(z10, updateModels4, updateModels5, updateModels6, updateModels7, updateModels8, updateModels9, sharedSshKeysToSync, list3, updateModels16, updateModels10, updateModels11, updateModels12, updateModels13, updateModels14, updateModels15, sharedIdentitiesToSync, listUpdateSshConfigIdentitiesDependsOfTeamKeys, listUpdateTelnetConfigIdentitiesDependsOfTeamKeys, updateModels17, list, list2, deleteSet, str);
    }
}
