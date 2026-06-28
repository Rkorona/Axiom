package com.server.auditor.ssh.client.synchronization.api.converters;

import com.server.auditor.ssh.client.app.a;
import com.server.auditor.ssh.client.database.adapters.GroupDBAdapter;
import com.server.auditor.ssh.client.database.adapters.SshConfigDBAdapter;
import com.server.auditor.ssh.client.database.adapters.TelnetConfigDBAdapter;
import com.server.auditor.ssh.client.database.models.GroupDBModel;
import com.server.auditor.ssh.client.database.models.config.SshRemoteConfigDBModel;
import com.server.auditor.ssh.client.database.models.config.TelnetRemoteConfigDBModel;
import com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator;
import com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreatorKt;
import com.server.auditor.ssh.client.synchronization.api.models.IRelevantVaultKeyIdRepository;
import com.server.auditor.ssh.client.synchronization.api.models.group.GroupBulk;
import com.server.auditor.ssh.client.synchronization.api.models.group.GroupBulkV3;
import com.server.auditor.ssh.client.synchronization.api.models.group.GroupBulkV5;
import com.server.auditor.ssh.client.synchronization.api.newcrypto.content.group.GroupContent;
import ju.k;
import ju.t;
import mv.b;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class GroupBulkCreator extends BaseBulkApiCreator<GroupBulk, GroupBulkV3, GroupBulkV5, GroupDBModel> {
    private static final String groupIdPrefix = "group_set/";
    private static final String sshConfigIdPrefix = "sshconfig_set/";
    private static final String telnetConfigIdPrefix = "telnetconfig_set/";
    private final GroupDBAdapter groupDBAdapter;
    private final ContentPatcher jsonContentPatcher;
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
    public GroupBulkCreator(SshConfigDBAdapter sshConfigDBAdapter, TelnetConfigDBAdapter telnetConfigDBAdapter, GroupDBAdapter groupDBAdapter, a aVar, IRelevantVaultKeyIdRepository iRelevantVaultKeyIdRepository, ContentPatcher contentPatcher) {
        super(aVar, iRelevantVaultKeyIdRepository);
        t.f(sshConfigDBAdapter, "sshConfigDBAdapter");
        t.f(telnetConfigDBAdapter, "telnetConfigDBAdapter");
        t.f(groupDBAdapter, "groupDBAdapter");
        t.f(aVar, "termiusStorage");
        t.f(iRelevantVaultKeyIdRepository, "relevantVaultKeyIdRepository");
        t.f(contentPatcher, "jsonContentPatcher");
        this.sshConfigDBAdapter = sshConfigDBAdapter;
        this.telnetConfigDBAdapter = telnetConfigDBAdapter;
        this.groupDBAdapter = groupDBAdapter;
        this.jsonContentPatcher = contentPatcher;
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
    public GroupBulkV3 createV3(GroupDBModel groupDBModel) {
        t.f(groupDBModel, "dbModel");
        String title = groupDBModel.getTitle();
        Object objPrepareSshConfigId = prepareSshConfigId(groupDBModel.getSshConfigId());
        Object objPrepareTelnetConfigId = prepareTelnetConfigId(groupDBModel.getTelnetConfigId());
        Object objPrepareParentGroupId = prepareParentGroupId(groupDBModel.getParentGroupId());
        long idInDatabase = groupDBModel.getIdInDatabase();
        long jPrepareIdOnServer = prepareIdOnServer(groupDBModel.getIdOnServer());
        String updatedAtTime = groupDBModel.getUpdatedAtTime();
        String sharingMode = groupDBModel.getSharingMode();
        String credentialsMode = groupDBModel.getCredentialsMode();
        return new GroupBulkV3(title, objPrepareSshConfigId, objPrepareTelnetConfigId, objPrepareParentGroupId, Long.valueOf(idInDatabase), jPrepareIdOnServer, updatedAtTime, groupDBModel.getVaultKeyId().getId(), sharingMode, credentialsMode);
    }

    @Override // com.server.auditor.ssh.client.synchronization.api.adapters.BaseBulkApiCreator
    public GroupBulkV5 createV5(GroupDBModel groupDBModel) throws JSONException {
        t.f(groupDBModel, "dbModel");
        String title = groupDBModel.getTitle();
        t.e(title, "getTitle(...)");
        GroupContent groupContent = new GroupContent(title, 0, 2, (k) null);
        String content = groupDBModel.getContent();
        b contentPatcherJson = ContentPatcher.Companion.getContentPatcherJson();
        contentPatcherJson.a();
        String strC = contentPatcherJson.c(GroupContent.Companion.serializer(), groupContent);
        if (content != null) {
            strC = BaseBulkApiCreatorKt.patchToString(new JSONObject(content), new JSONObject(strC));
        }
        String str = strC;
        Object objPrepareSshConfigId = prepareSshConfigId(groupDBModel.getSshConfigId());
        Object objPrepareTelnetConfigId = prepareTelnetConfigId(groupDBModel.getTelnetConfigId());
        Object objPrepareParentGroupId = prepareParentGroupId(groupDBModel.getParentGroupId());
        long idInDatabase = groupDBModel.getIdInDatabase();
        long jPrepareIdOnServer = prepareIdOnServer(groupDBModel.getIdOnServer());
        String updatedAtTime = groupDBModel.getUpdatedAtTime();
        String sharingMode = groupDBModel.getSharingMode();
        String credentialsMode = groupDBModel.getCredentialsMode();
        return new GroupBulkV5(str, objPrepareSshConfigId, objPrepareTelnetConfigId, objPrepareParentGroupId, Long.valueOf(idInDatabase), jPrepareIdOnServer, updatedAtTime, groupDBModel.getVaultKeyId().getId(), sharingMode, credentialsMode);
    }
}
