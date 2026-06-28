package com.server.auditor.ssh.client.synchronization.api.converters;

import com.server.auditor.ssh.client.app.a;
import com.server.auditor.ssh.client.database.adapters.GroupDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SshConfigDBAdapter;
import com.server.auditor.ssh.client.database.adapters.TelnetConfigDBAdapter;
import com.server.auditor.ssh.client.database.models.GroupDBModel;
import com.server.auditor.ssh.client.database.models.HostDBModel;
import com.server.auditor.ssh.client.database.models.config.SshRemoteConfigDBModel;
import com.server.auditor.ssh.client.database.models.config.TelnetRemoteConfigDBModel;
import com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator;
import com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreatorKt;
import com.server.auditor.ssh.client.synchronization.api.models.IRelevantVaultKeyIdRepository;
import com.server.auditor.ssh.client.synchronization.api.models.host.HostBulk;
import com.server.auditor.ssh.client.synchronization.api.models.host.HostBulkV3;
import com.server.auditor.ssh.client.synchronization.api.models.host.HostBulkV5;
import com.server.auditor.ssh.client.synchronization.api.newcrypto.content.host.HostContent;
import com.server.auditor.ssh.client.synchronization.api.newcrypto.content.host.HostContentKt;
import ju.k;
import ju.t;
import mv.b;
import org.json.JSONException;
import org.json.JSONObject;
import tp.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class HostBulkCreator extends BaseBulkApiCreator<HostBulk, HostBulkV3, HostBulkV5, HostDBModel> {
    private static final String groupIdPrefix = "group_set/";
    private static final String sshConfigIdPrefix = "sshconfig_set/";
    private static final String telnetConfigIdPrefix = "telnetconfig_set/";
    private final ContentPatcher contentPatcher;
    private final GroupDBAdapter groupDBAdapter;
    private final SshConfigDBAdapter sshConfigDBAdapter;
    private final TelnetConfigDBAdapter telnetConfigDBAdapter;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HostBulkCreator(SshConfigDBAdapter sshConfigDBAdapter, TelnetConfigDBAdapter telnetConfigDBAdapter, GroupDBAdapter groupDBAdapter, a aVar, ContentPatcher contentPatcher, IRelevantVaultKeyIdRepository iRelevantVaultKeyIdRepository) {
        super(aVar, iRelevantVaultKeyIdRepository);
        t.f(sshConfigDBAdapter, "sshConfigDBAdapter");
        t.f(telnetConfigDBAdapter, "telnetConfigDBAdapter");
        t.f(groupDBAdapter, "groupDBAdapter");
        t.f(aVar, "termiusStorage");
        t.f(contentPatcher, "contentPatcher");
        t.f(iRelevantVaultKeyIdRepository, "relevantVaultKeyIdRepository");
        this.sshConfigDBAdapter = sshConfigDBAdapter;
        this.telnetConfigDBAdapter = telnetConfigDBAdapter;
        this.groupDBAdapter = groupDBAdapter;
        this.contentPatcher = contentPatcher;
    }

    private final String prepareBackspaceType(Boolean bool) {
        return t.b(bool, Boolean.TRUE) ? HostContentKt.BACKSPACE_TYPE_LEGACY : HostContentKt.BACKSPACE_TYPE_DEFAULT;
    }

    private final Object prepareParentGroupId(Long l10) {
        if (l10 == null) {
            return null;
        }
        GroupDBModel itemByRemoteId = this.groupDBAdapter.getItemByRemoteId(l10.longValue());
        if (itemByRemoteId != null) {
            return Long.valueOf(itemByRemoteId.getIdOnServer());
        }
        return groupIdPrefix + l10;
    }

    private final Object prepareSshConfigId(Long l10) {
        if (l10 == null) {
            return null;
        }
        SshRemoteConfigDBModel itemByRemoteId = this.sshConfigDBAdapter.getItemByRemoteId(l10.longValue());
        if (itemByRemoteId != null) {
            return Long.valueOf(itemByRemoteId.getIdOnServer());
        }
        return sshConfigIdPrefix + l10;
    }

    private final Object prepareTelnetConfigId(Long l10) {
        if (l10 == null) {
            return null;
        }
        TelnetRemoteConfigDBModel itemByRemoteId = this.telnetConfigDBAdapter.getItemByRemoteId(l10.longValue());
        if (itemByRemoteId != null) {
            return Long.valueOf(itemByRemoteId.getIdOnServer());
        }
        return telnetConfigIdPrefix + l10;
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator
    public HostBulkV3 createV3(HostDBModel hostDBModel) {
        t.f(hostDBModel, "dbModel");
        return new HostBulkV3(hostDBModel.getTitle(), hostDBModel.getAddress(), hostDBModel.getOsModelType().name(), d1.d(hostDBModel.getInteractionDate()), prepareBackspaceType(hostDBModel.getBackspaceType()), prepareSshConfigId(hostDBModel.getSshConfigId()), prepareTelnetConfigId(hostDBModel.getTelnetConfigId()), prepareParentGroupId(hostDBModel.getGroupId()), Long.valueOf(hostDBModel.getIdInDatabase()), prepareIdOnServer(hostDBModel.getIdOnServer()), hostDBModel.getUpdatedAtTime(), hostDBModel.getVaultKeyId().getId(), hostDBModel.getCredentialsMode());
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator
    public HostBulkV5 createV5(HostDBModel hostDBModel) throws JSONException {
        t.f(hostDBModel, "dbModel");
        String title = hostDBModel.getTitle();
        t.e(title, "getTitle(...)");
        String address = hostDBModel.getAddress();
        t.e(address, "getAddress(...)");
        HostContent hostContent = new HostContent(title, address, hostDBModel.getOsModelType().name(), prepareBackspaceType(hostDBModel.getBackspaceType()), d1.d(hostDBModel.getInteractionDate()), 0, 32, (k) null);
        String content = hostDBModel.getContent();
        b contentPatcherJson = ContentPatcher.Companion.getContentPatcherJson();
        contentPatcherJson.a();
        String strC = contentPatcherJson.c(HostContent.Companion.serializer(), hostContent);
        if (content != null) {
            strC = BaseBulkApiCreatorKt.patchToString(new JSONObject(content), new JSONObject(strC));
        }
        return new HostBulkV5(strC, prepareSshConfigId(hostDBModel.getSshConfigId()), prepareTelnetConfigId(hostDBModel.getTelnetConfigId()), prepareParentGroupId(hostDBModel.getGroupId()), Long.valueOf(hostDBModel.getIdInDatabase()), prepareIdOnServer(hostDBModel.getIdOnServer()), hostDBModel.getUpdatedAtTime(), hostDBModel.getVaultKeyId().getId(), hostDBModel.getCredentialsMode());
    }
}
