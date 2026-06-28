package com.server.auditor.ssh.client.database.models.config;

import android.content.ContentValues;
import android.database.Cursor;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.models.IdentityDBModel;
import com.server.auditor.ssh.client.database.models.ProxyDBModel;
import com.server.auditor.ssh.client.database.models.SnippetDBModel;
import com.server.auditor.ssh.client.database.models.config.base.BaseRemoteConfigDBModel;
import com.server.auditor.ssh.client.models.SnippetItem;
import com.server.auditor.ssh.client.models.properties.SshProperties;
import com.server.auditor.ssh.client.models.proxy.Proxy;
import hg.f;
import rg.s;

/* JADX INFO: loaded from: classes3.dex */
public class SshRemoteConfigDBModel extends BaseRemoteConfigDBModel {
    private String mEnvironmentVariables;
    private Boolean mIsPortForwarding;
    private Boolean mIsUseAgentForwarding;
    private Boolean mIsUseMosh;
    private Integer mKeepAlivePackages;
    private String mMoshServerCommand;
    private Long mProxyId;
    private Long mStartupSnippetId;
    private Boolean mStrictCheckHostKey;
    private Integer mTimeout;
    private Boolean mUseSshKey;

    public SshRemoteConfigDBModel() {
        this.mStartupSnippetId = null;
        this.mProxyId = null;
        this.mEnvironmentVariables = null;
        this.mIsUseAgentForwarding = null;
    }

    public static SshRemoteConfigDBModel getSshConfigDBModelWithExternalReferences(Cursor cursor, s sVar) {
        ProxyDBModel itemByLocalId;
        SnippetDBModel itemByLocalId2;
        IdentityDBModel itemByLocalId3;
        SshRemoteConfigDBModel sshRemoteConfigDBModel = new SshRemoteConfigDBModel(cursor, sVar);
        if (sshRemoteConfigDBModel.mIdentityId != null && (itemByLocalId3 = f.p().n().getItemByLocalId(sshRemoteConfigDBModel.mIdentityId.longValue())) != null && itemByLocalId3.getIdOnServer() != -1) {
            sshRemoteConfigDBModel.setIdentityId(Long.valueOf(itemByLocalId3.getIdOnServer()));
        }
        if (sshRemoteConfigDBModel.mStartupSnippetId != null && (itemByLocalId2 = f.p().J().getItemByLocalId(sshRemoteConfigDBModel.mStartupSnippetId.longValue())) != null && itemByLocalId2.getIdOnServer() != -1) {
            sshRemoteConfigDBModel.setStartupSnippetId(Long.valueOf(itemByLocalId2.getIdOnServer()));
        }
        if (sshRemoteConfigDBModel.mProxyId != null && (itemByLocalId = f.p().B().getItemByLocalId(sshRemoteConfigDBModel.mProxyId.longValue())) != null && itemByLocalId.getIdOnServer() != -1) {
            sshRemoteConfigDBModel.setProxyId(Long.valueOf(itemByLocalId.getIdOnServer()));
        }
        return sshRemoteConfigDBModel;
    }

    public SshProperties convertToSshConfig() {
        ProxyDBModel itemByLocalId;
        SnippetDBModel itemByLocalId2;
        Proxy proxy = null;
        SnippetItem snippetItem = (this.mStartupSnippetId == null || (itemByLocalId2 = f.p().J().getItemByLocalId(this.mStartupSnippetId.longValue())) == null) ? null : new SnippetItem(itemByLocalId2);
        if (this.mProxyId != null && (itemByLocalId = f.p().B().getItemByLocalId(this.mProxyId.longValue())) != null) {
            proxy = new Proxy(itemByLocalId);
        }
        return new SshProperties(this.mPort, this.mColorScheme, this.mFontSize, this.mCharset, getIdentity(), Long.valueOf(this.mId), snippetItem, proxy, this.mIsUseMosh, this.mMoshServerCommand, this.mEnvironmentVariables, this.mIsUseAgentForwarding);
    }

    public String getEnvironmentVariables() {
        return this.mEnvironmentVariables;
    }

    public Integer getKeepAlivePackages() {
        return this.mKeepAlivePackages;
    }

    public String getMoshServerCommand() {
        return this.mMoshServerCommand;
    }

    public Long getProxyId() {
        return this.mProxyId;
    }

    public Long getStartupSnippetId() {
        return this.mStartupSnippetId;
    }

    public Integer getTimeout() {
        return this.mTimeout;
    }

    public Boolean isIsPortForwarding() {
        return this.mIsPortForwarding;
    }

    public Boolean isStrictCheckHostKey() {
        return this.mStrictCheckHostKey;
    }

    public Boolean isUseAgentForwarding() {
        return this.mIsUseAgentForwarding;
    }

    public Boolean isUseMosh() {
        return this.mIsUseMosh;
    }

    public Boolean isUseSshKey() {
        return this.mUseSshKey;
    }

    public void setEnvironmentVariables(String str) {
        this.mEnvironmentVariables = str;
    }

    public void setIsPortForwarding(Boolean bool) {
        this.mIsPortForwarding = bool;
    }

    public void setKeepAlivePackages(Integer num) {
        this.mKeepAlivePackages = num;
    }

    public void setMoshServerCommand(String str) {
        this.mMoshServerCommand = str;
    }

    public void setProxyId(Long l10) {
        this.mProxyId = l10;
    }

    public void setStartupSnippetId(Long l10) {
        this.mStartupSnippetId = l10;
    }

    public void setStrictCheckHostKey(Boolean bool) {
        this.mStrictCheckHostKey = bool;
    }

    public void setTimeout(Integer num) {
        this.mTimeout = num;
    }

    public void setUseAgentForwarding(Boolean bool) {
        this.mIsUseAgentForwarding = bool;
    }

    public void setUseMosh(Boolean bool) {
        this.mIsUseMosh = bool;
    }

    public void setUseSshKey(Boolean bool) {
        this.mUseSshKey = bool;
    }

    @Override // com.server.auditor.ssh.client.database.models.config.base.BaseRemoteConfigDBModel, com.server.auditor.ssh.client.database.models.config.base.BaseConfigDBModel, com.server.auditor.ssh.client.database.models.SyncableModel, kj.a
    public ContentValues toContentValues(s sVar) {
        ContentValues contentValues = super.toContentValues(sVar);
        contentValues.put(Column.STRICT_CHECK_HOST_KEY, this.mStrictCheckHostKey);
        contentValues.put(Column.USE_SSH_KEY, this.mUseSshKey);
        contentValues.put(Column.IS_FORWARD_PORT, this.mIsPortForwarding);
        contentValues.put(Column.TIMEOUT, this.mTimeout);
        contentValues.put(Column.KEEP_ALIVE_PACKAGES, this.mKeepAlivePackages);
        contentValues.put(Column.IS_USE_MOSH, this.mIsUseMosh);
        contentValues.put(Column.IS_USE_AGENT_FORWARDING, this.mIsUseAgentForwarding);
        contentValues.put(Column.MOSH_SERVER_COMMAND, this.mMoshServerCommand);
        contentValues.put(Column.START_UP_SNIPPET_ID, this.mStartupSnippetId);
        contentValues.put(Column.PROXY_ID, this.mProxyId);
        contentValues.put(Column.ENVIRONMENT_VARIABLES, this.mEnvironmentVariables);
        return contentValues;
    }

    public SshRemoteConfigDBModel(Integer num, Integer num2, Boolean bool, String str, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Integer num3, Integer num4, String str2, String str3, Long l10, Long l11, Long l12, String str4, Boolean bool6) {
        this(num, num2, bool, str, bool2, bool3, bool4, bool5, num3, num4, str2, str3, l10);
        this.mStartupSnippetId = l11;
        this.mProxyId = l12;
        this.mEnvironmentVariables = str4;
        this.mIsUseAgentForwarding = bool6;
    }

    public SshRemoteConfigDBModel(Integer num, Integer num2, Boolean bool, String str, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Integer num3, Integer num4, String str2, String str3, Long l10) {
        super(num, num2, bool5, str2, str3, l10);
        this.mStartupSnippetId = null;
        this.mProxyId = null;
        this.mEnvironmentVariables = null;
        this.mIsUseAgentForwarding = null;
        this.mStrictCheckHostKey = bool2;
        this.mUseSshKey = bool3;
        this.mIsPortForwarding = bool4;
        this.mTimeout = num3;
        this.mKeepAlivePackages = num4;
        this.mIsUseMosh = bool;
        this.mMoshServerCommand = str;
    }

    public SshRemoteConfigDBModel(Cursor cursor, s sVar) {
        super(cursor, sVar);
        this.mStartupSnippetId = null;
        this.mProxyId = null;
        this.mEnvironmentVariables = null;
        this.mIsUseAgentForwarding = null;
        int columnIndex = cursor.getColumnIndex(Column.START_UP_SNIPPET_ID);
        int columnIndex2 = cursor.getColumnIndex(Column.PROXY_ID);
        int columnIndex3 = cursor.getColumnIndex(Column.ENVIRONMENT_VARIABLES);
        int columnIndex4 = cursor.getColumnIndex(Column.STRICT_CHECK_HOST_KEY);
        int columnIndex5 = cursor.getColumnIndex(Column.USE_SSH_KEY);
        int columnIndex6 = cursor.getColumnIndex(Column.IS_FORWARD_PORT);
        int columnIndex7 = cursor.getColumnIndex(Column.IS_USE_AGENT_FORWARDING);
        int columnIndex8 = cursor.getColumnIndex(Column.IS_USE_MOSH);
        int columnIndex9 = cursor.getColumnIndex(Column.MOSH_SERVER_COMMAND);
        int columnIndex10 = cursor.getColumnIndex(Column.TIMEOUT);
        int columnIndex11 = cursor.getColumnIndex(Column.KEEP_ALIVE_PACKAGES);
        if (!cursor.isNull(columnIndex4) && columnIndex4 >= 0) {
            this.mStrictCheckHostKey = Boolean.valueOf(1 == cursor.getInt(columnIndex4));
        }
        if (!cursor.isNull(columnIndex5) && columnIndex5 >= 0) {
            this.mUseSshKey = Boolean.valueOf(1 == cursor.getInt(columnIndex5));
        }
        if (!cursor.isNull(columnIndex6) && columnIndex6 >= 0) {
            this.mIsPortForwarding = Boolean.valueOf(1 == cursor.getInt(columnIndex6));
        }
        if (!cursor.isNull(columnIndex7) && columnIndex7 >= 0) {
            this.mIsUseAgentForwarding = Boolean.valueOf(1 == cursor.getInt(columnIndex7));
        }
        if (!cursor.isNull(columnIndex8) && columnIndex8 >= 0) {
            this.mIsUseMosh = Boolean.valueOf(1 == cursor.getInt(columnIndex8));
        }
        if (!cursor.isNull(columnIndex9) && columnIndex9 >= 0) {
            this.mMoshServerCommand = cursor.getString(columnIndex9);
        }
        if (!cursor.isNull(columnIndex10) && columnIndex10 >= 0) {
            this.mTimeout = Integer.valueOf(cursor.getInt(columnIndex10));
        }
        if (!cursor.isNull(columnIndex11) && columnIndex11 >= 0) {
            this.mKeepAlivePackages = Integer.valueOf(cursor.getInt(columnIndex11));
        }
        if (!cursor.isNull(columnIndex)) {
            this.mStartupSnippetId = Long.valueOf(cursor.getLong(columnIndex));
        }
        if (!cursor.isNull(columnIndex2)) {
            this.mProxyId = Long.valueOf(cursor.getLong(columnIndex2));
        }
        if (cursor.isNull(columnIndex3)) {
            return;
        }
        this.mEnvironmentVariables = cursor.getString(columnIndex3);
    }
}
