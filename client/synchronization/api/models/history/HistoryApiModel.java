package com.server.auditor.ssh.client.synchronization.api.models.history;

import com.crystalnix.termius.libtermius.sftp.File;
import com.crystalnix.termius.libtermius.wrappers.options.SshOptions;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.database.Table;
import com.server.auditor.ssh.client.database.models.HostDBModel;
import com.server.auditor.ssh.client.synchronization.api.models.history.HistoryApiModel;
import hv.c;
import hv.p;
import iu.a;
import java.util.List;
import ju.k;
import ju.t;
import kv.d;
import lv.f;
import lv.h1;
import lv.i;
import lv.s2;
import lv.w0;
import lv.x2;
import tl.u;
import ut.n;
import ut.o;
import ut.r;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class HistoryApiModel extends ApiVersionedModel {
    public static final String CONNECTION_STATUS_SERIAL_NAME = "connection_status";
    public static final String ERROR_MESSAGE_SERIAL_NAME = "error_message";
    public static final int VERSION_CODE = 1;
    private String charset;
    private String colorScheme;
    private int connectionStatus;
    private String connectionType;
    private String environmenVariables;
    private String errorMessage;
    private String host;
    private String hostOsName;
    private Long hostRemoteId;
    private Boolean isUseMosh;
    private String localShellArgc;
    private String localShellPath;
    private String moshServerCommand;
    private Integer port;
    private HistoryCommandSessionLogFileMetaData sessionLogData;
    private String startupCommand;
    private List<String> tags;
    private String title;
    private String userName;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final n[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, o.b(r.f82638b, new a() { // from class: an.a
        @Override // iu.a
        public final Object a() {
            return HistoryApiModel._childSerializers$_anonymous_();
        }
    })};

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final c serializer() {
            return HistoryApiModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ HistoryApiModel(int i10, int i11, String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool, String str11, int i12, String str12, String str13, HistoryCommandSessionLogFileMetaData historyCommandSessionLogFileMetaData, Long l10, List list, s2 s2Var) {
        super(i10, i11, s2Var);
        if ((i10 & 2) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i10 & 4) == 0) {
            this.userName = null;
        } else {
            this.userName = str2;
        }
        if ((i10 & 8) == 0) {
            this.host = null;
        } else {
            this.host = str3;
        }
        if ((i10 & 16) == 0) {
            this.port = null;
        } else {
            this.port = num;
        }
        if ((i10 & 32) == 0) {
            this.connectionType = null;
        } else {
            this.connectionType = str4;
        }
        if ((i10 & 64) == 0) {
            this.startupCommand = null;
        } else {
            this.startupCommand = str5;
        }
        if ((i10 & 128) == 0) {
            this.colorScheme = null;
        } else {
            this.colorScheme = str6;
        }
        if ((i10 & 256) == 0) {
            this.charset = null;
        } else {
            this.charset = str7;
        }
        if ((i10 & File.FLAG_O_TRUNC) == 0) {
            this.localShellPath = null;
        } else {
            this.localShellPath = str8;
        }
        if ((i10 & File.FLAG_O_APPEND) == 0) {
            this.localShellArgc = null;
        } else {
            this.localShellArgc = str9;
        }
        if ((i10 & 2048) == 0) {
            this.moshServerCommand = null;
        } else {
            this.moshServerCommand = str10;
        }
        if ((i10 & 4096) == 0) {
            this.isUseMosh = Boolean.FALSE;
        } else {
            this.isUseMosh = bool;
        }
        if ((i10 & 8192) == 0) {
            this.hostOsName = null;
        } else {
            this.hostOsName = str11;
        }
        this.connectionStatus = (i10 & 16384) == 0 ? 0 : i12;
        if ((32768 & i10) == 0) {
            this.errorMessage = null;
        } else {
            this.errorMessage = str12;
        }
        if ((65536 & i10) == 0) {
            this.environmenVariables = null;
        } else {
            this.environmenVariables = str13;
        }
        if ((131072 & i10) == 0) {
            this.sessionLogData = null;
        } else {
            this.sessionLogData = historyCommandSessionLogFileMetaData;
        }
        if ((262144 & i10) == 0) {
            this.hostRemoteId = null;
        } else {
            this.hostRemoteId = l10;
        }
        if ((i10 & 524288) == 0) {
            this.tags = null;
        } else {
            this.tags = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_() {
        return new f(x2.f64817a);
    }

    @hv.o(Column.CHARSET)
    public static /* synthetic */ void getCharset$annotations() {
    }

    @hv.o("color_scheme")
    public static /* synthetic */ void getColorScheme$annotations() {
    }

    @hv.o("connection_status")
    public static /* synthetic */ void getConnectionStatus$annotations() {
    }

    @hv.o(SshOptions.EXTRA_CONNECTION_TYPE)
    public static /* synthetic */ void getConnectionType$annotations() {
    }

    @hv.o(Column.ENVIRONMENT_VARIABLES)
    public static /* synthetic */ void getEnvironmenVariables$annotations() {
    }

    @hv.o("error_message")
    public static /* synthetic */ void getErrorMessage$annotations() {
    }

    @hv.o("host")
    public static /* synthetic */ void getHost$annotations() {
    }

    @hv.o("host_os_name")
    public static /* synthetic */ void getHostOsName$annotations() {
    }

    @hv.o(Column.HOST_ID)
    public static /* synthetic */ void getHostRemoteId$annotations() {
    }

    @hv.o(Column.LOCAL_SHELL_ARGC)
    public static /* synthetic */ void getLocalShellArgc$annotations() {
    }

    @hv.o(Column.LOCAL_SHELL_PATH)
    public static /* synthetic */ void getLocalShellPath$annotations() {
    }

    @hv.o(Column.MOSH_SERVER_COMMAND)
    public static /* synthetic */ void getMoshServerCommand$annotations() {
    }

    @hv.o(Column.PORT)
    public static /* synthetic */ void getPort$annotations() {
    }

    @hv.o("session_log_data")
    public static /* synthetic */ void getSessionLogData$annotations() {
    }

    @hv.o("startup_command")
    public static /* synthetic */ void getStartupCommand$annotations() {
    }

    @hv.o(Table.TAG)
    public static /* synthetic */ void getTags$annotations() {
    }

    @hv.o("title")
    public static /* synthetic */ void getTitle$annotations() {
    }

    @hv.o("user_name")
    public static /* synthetic */ void getUserName$annotations() {
    }

    @hv.o(SshOptions.EXTRA_SSH_USE_MOSH)
    public static /* synthetic */ void isUseMosh$annotations() {
    }

    private final HistoryCommandSessionLogFileMetaData prepareSessionLogData(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        return new HistoryCommandSessionLogFileMetaData(str, str2);
    }

    public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(HistoryApiModel historyApiModel, d dVar, jv.f fVar) {
        ApiVersionedModel.write$Self(historyApiModel, dVar, fVar);
        n[] nVarArr = $childSerializers;
        if (dVar.E(fVar, 1) || historyApiModel.title != null) {
            dVar.v(fVar, 1, x2.f64817a, historyApiModel.title);
        }
        if (dVar.E(fVar, 2) || historyApiModel.userName != null) {
            dVar.v(fVar, 2, x2.f64817a, historyApiModel.userName);
        }
        if (dVar.E(fVar, 3) || historyApiModel.host != null) {
            dVar.v(fVar, 3, x2.f64817a, historyApiModel.host);
        }
        if (dVar.E(fVar, 4) || historyApiModel.port != null) {
            dVar.v(fVar, 4, w0.f64808a, historyApiModel.port);
        }
        if (dVar.E(fVar, 5) || historyApiModel.connectionType != null) {
            dVar.v(fVar, 5, x2.f64817a, historyApiModel.connectionType);
        }
        if (dVar.E(fVar, 6) || historyApiModel.startupCommand != null) {
            dVar.v(fVar, 6, x2.f64817a, historyApiModel.startupCommand);
        }
        if (dVar.E(fVar, 7) || historyApiModel.colorScheme != null) {
            dVar.v(fVar, 7, x2.f64817a, historyApiModel.colorScheme);
        }
        if (dVar.E(fVar, 8) || historyApiModel.charset != null) {
            dVar.v(fVar, 8, x2.f64817a, historyApiModel.charset);
        }
        if (dVar.E(fVar, 9) || historyApiModel.localShellPath != null) {
            dVar.v(fVar, 9, x2.f64817a, historyApiModel.localShellPath);
        }
        if (dVar.E(fVar, 10) || historyApiModel.localShellArgc != null) {
            dVar.v(fVar, 10, x2.f64817a, historyApiModel.localShellArgc);
        }
        if (dVar.E(fVar, 11) || historyApiModel.moshServerCommand != null) {
            dVar.v(fVar, 11, x2.f64817a, historyApiModel.moshServerCommand);
        }
        if (dVar.E(fVar, 12) || !t.b(historyApiModel.isUseMosh, Boolean.FALSE)) {
            dVar.v(fVar, 12, i.f64704a, historyApiModel.isUseMosh);
        }
        if (dVar.E(fVar, 13) || historyApiModel.hostOsName != null) {
            dVar.v(fVar, 13, x2.f64817a, historyApiModel.hostOsName);
        }
        if (dVar.E(fVar, 14) || historyApiModel.connectionStatus != 0) {
            dVar.t(fVar, 14, historyApiModel.connectionStatus);
        }
        if (dVar.E(fVar, 15) || historyApiModel.errorMessage != null) {
            dVar.v(fVar, 15, x2.f64817a, historyApiModel.errorMessage);
        }
        if (dVar.E(fVar, 16) || historyApiModel.environmenVariables != null) {
            dVar.v(fVar, 16, x2.f64817a, historyApiModel.environmenVariables);
        }
        if (dVar.E(fVar, 17) || historyApiModel.sessionLogData != null) {
            dVar.v(fVar, 17, HistoryCommandSessionLogFileMetaData$$serializer.INSTANCE, historyApiModel.sessionLogData);
        }
        if (dVar.E(fVar, 18) || historyApiModel.hostRemoteId != null) {
            dVar.v(fVar, 18, h1.f64699a, historyApiModel.hostRemoteId);
        }
        if (!dVar.E(fVar, 19) && historyApiModel.tags == null) {
            return;
        }
        dVar.v(fVar, 19, (hv.r) nVarArr[19].getValue(), historyApiModel.tags);
    }

    public final String getCharset() {
        return this.charset;
    }

    public final String getColorScheme() {
        return this.colorScheme;
    }

    public final int getConnectionStatus() {
        return this.connectionStatus;
    }

    public final String getConnectionType() {
        return this.connectionType;
    }

    public final String getEnvironmenVariables() {
        return this.environmenVariables;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getHost() {
        return this.host;
    }

    public final String getHostOsName() {
        return this.hostOsName;
    }

    public final Long getHostRemoteId() {
        return this.hostRemoteId;
    }

    public final String getLocalShellArgc() {
        return this.localShellArgc;
    }

    public final String getLocalShellPath() {
        return this.localShellPath;
    }

    public final String getMoshServerCommand() {
        return this.moshServerCommand;
    }

    public final Integer getPort() {
        return this.port;
    }

    public final HistoryCommandSessionLogFileMetaData getSessionLogData() {
        return this.sessionLogData;
    }

    public final String getStartupCommand() {
        return this.startupCommand;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUserName() {
        return this.userName;
    }

    public final Boolean isUseMosh() {
        return this.isUseMosh;
    }

    public final void setCharset(String str) {
        this.charset = str;
    }

    public final void setColorScheme(String str) {
        this.colorScheme = str;
    }

    public final void setConnectionStatus(int i10) {
        this.connectionStatus = i10;
    }

    public final void setConnectionType(String str) {
        this.connectionType = str;
    }

    public final void setEnvironmenVariables(String str) {
        this.environmenVariables = str;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setHost(String str) {
        this.host = str;
    }

    public final void setHostOsName(String str) {
        this.hostOsName = str;
    }

    public final void setHostRemoteId(Long l10) {
        this.hostRemoteId = l10;
    }

    public final void setLocalShellArgc(String str) {
        this.localShellArgc = str;
    }

    public final void setLocalShellPath(String str) {
        this.localShellPath = str;
    }

    public final void setMoshServerCommand(String str) {
        this.moshServerCommand = str;
    }

    public final void setPort(Integer num) {
        this.port = num;
    }

    public final void setSessionLogData(HistoryCommandSessionLogFileMetaData historyCommandSessionLogFileMetaData) {
        this.sessionLogData = historyCommandSessionLogFileMetaData;
    }

    public final void setStartupCommand(String str) {
        this.startupCommand = str;
    }

    public final void setTags(List<String> list) {
        this.tags = list;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setUseMosh(Boolean bool) {
        this.isUseMosh = bool;
    }

    public final void setUserName(String str) {
        this.userName = str;
    }

    private final Long getHostRemoteId(Long l10, String str) {
        HostDBModel itemByLocalId;
        if (l10 == null || (itemByLocalId = hg.f.p().i().getItemByLocalId(l10.longValue())) == null) {
            return null;
        }
        if (!t.b(str, "local")) {
            return Long.valueOf(itemByLocalId.getIdOnServer());
        }
        Long lValueOf = Long.valueOf(itemByLocalId.getIdOnServer());
        if (lValueOf.longValue() >= 0) {
            return lValueOf;
        }
        return null;
    }

    public HistoryApiModel(u uVar) {
        t.f(uVar, "lastConnection");
        this.isUseMosh = Boolean.FALSE;
        setVersionCode(1);
        this.title = uVar.H();
        this.userName = uVar.J();
        this.host = uVar.m();
        this.port = uVar.u();
        this.connectionType = uVar.g();
        this.startupCommand = uVar.E();
        this.colorScheme = uVar.e();
        this.charset = uVar.d();
        this.localShellPath = uVar.s();
        this.localShellArgc = uVar.r();
        this.moshServerCommand = uVar.t();
        this.isUseMosh = Boolean.valueOf(uVar.Q());
        this.hostOsName = uVar.o();
        this.environmenVariables = uVar.k();
        this.connectionStatus = uVar.f();
        this.errorMessage = uVar.l();
        this.sessionLogData = prepareSessionLogData(uVar.D(), uVar.B());
        this.hostRemoteId = getHostRemoteId(uVar.n(), uVar.g());
        this.tags = uVar.i();
    }
}
