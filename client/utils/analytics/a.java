package com.server.auditor.ssh.client.utils.analytics;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.crystalnix.termius.libtermius.Keygen;
import com.crystalnix.termius.libtermius.wrappers.SessionManager;
import com.crystalnix.termius.libtermius.wrappers.VaultAnalyticsHelper;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.app.TermiusApplication;
import com.server.auditor.ssh.client.billing.BillingSubscriptionType;
import com.server.auditor.ssh.client.billing.ProSubscriptionType;
import com.server.auditor.ssh.client.database.SQLiteHelper;
import com.server.auditor.ssh.client.database.models.GroupDBModel;
import com.server.auditor.ssh.client.database.models.HostDBModel;
import com.server.auditor.ssh.client.database.models.IdentityDBModel;
import com.server.auditor.ssh.client.database.models.RuleDBModel;
import com.server.auditor.ssh.client.database.models.SnippetDBModel;
import com.server.auditor.ssh.client.database.models.SnippetPackageDBModel;
import com.server.auditor.ssh.client.database.models.SshConfigIdentityDBModel;
import com.server.auditor.ssh.client.database.models.SshKeyDBModel;
import com.server.auditor.ssh.client.database.models.config.SshRemoteConfigDBModel;
import com.server.auditor.ssh.client.models.ChainingHost;
import com.server.auditor.ssh.client.models.DowngradeToPlanType;
import com.server.auditor.ssh.client.models.ExpiredSubscriptionScreenType;
import com.server.auditor.ssh.client.models.Host;
import com.server.auditor.ssh.client.models.Identity;
import com.server.auditor.ssh.client.models.account.AppleSingleSignOnAuthentication;
import com.server.auditor.ssh.client.models.account.AuthenticationModel;
import com.server.auditor.ssh.client.models.account.EmailAuthentication;
import com.server.auditor.ssh.client.models.account.EnterpriseSingleSignOnAuthentication;
import com.server.auditor.ssh.client.models.account.GoogleSingleSignOnAuthentication;
import com.server.auditor.ssh.client.models.connections.Connection;
import com.server.auditor.ssh.client.models.connections.ConnectionType;
import com.server.auditor.ssh.client.models.properties.SshProperties;
import com.server.auditor.ssh.client.models.snippet.SnippetSourceOrigin;
import com.server.auditor.ssh.client.synchronization.api.models.user.UserPlanModel;
import com.server.auditor.ssh.client.ui.auth.welcome.domain.WelcomeFlowViewModel;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import cp.e;
import dq.b0;
import hg.b2;
import hg.d;
import hg.f;
import il.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Pattern;
import np.g;
import org.json.JSONException;
import org.json.JSONObject;
import rg.l;
import ti.a;
import tl.l2;
import to.c1;
import tp.h1;
import tp.p0;
import vk.r0;
import wp.c;

/* JADX INFO: loaded from: classes4.dex */
public class a implements a.InterfaceC1245a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static a f46420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f46421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static String f46422f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Integer f46423u = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Integer f46424v = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static int f46425w = 1048576;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f46426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ti.a f46427b = new ti.a(new r(f.p().i(), f.p().h(), f.p().u(), f.p().S(), f.p().U(), f.p().e0(), f.p().g0(), f.p().n(), f.p().W(), f.p().B(), f.p().J(), f.p().E(), f.p().G()), f.p().h(), f.p().c(), this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final VaultAnalyticsHelper f46428c = SessionManager.getInstance().vaultAnalyticsHelper;

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.utils.analytics.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0660a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f46429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f46430b;

        static {
            int[] iArr = new int[SnippetSourceOrigin.values().length];
            f46430b = iArr;
            try {
                iArr[SnippetSourceOrigin.STARTUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46430b[SnippetSourceOrigin.AUTOCOMPLETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46430b[SnippetSourceOrigin.SNIPPETS_SCREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46430b[SnippetSourceOrigin.SNIPPETS_PANEL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f46430b[SnippetSourceOrigin.TERMINAL_HISTORY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[ConnectionType.values().length];
            f46429a = iArr2;
            try {
                iArr2[ConnectionType.ssh.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f46429a[ConnectionType.local.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f46429a[ConnectionType.telnet.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f46429a[ConnectionType.serial.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public a(Context context) {
        if (context != null) {
            this.f46426a = com.server.auditor.ssh.client.app.a.N().M();
        }
    }

    private Avo.IsSSHIdKey A(Connection connection) {
        return connection.IsSshIdKeyConnection() ? Avo.IsSSHIdKey.YES : Avo.IsSSHIdKey.NO;
    }

    private Avo.Mosh B(HostDBModel hostDBModel, SshRemoteConfigDBModel sshRemoteConfigDBModel, Connection connection) {
        if (hostDBModel == null) {
            return Avo.Mosh.NO;
        }
        String moshServerCommand = sshRemoteConfigDBModel != null ? sshRemoteConfigDBModel.getMoshServerCommand() : null;
        String moshServerCommand2 = connection.getSafeSshProperties().getMoshServerCommand();
        return (moshServerCommand == null || moshServerCommand.isEmpty()) ? hostDBModel.getGroupId() == null ? Avo.Mosh.NO : (moshServerCommand2 == null || moshServerCommand2.isEmpty()) ? Avo.Mosh.NO : Avo.Mosh.INHERITED : moshServerCommand.equals(moshServerCommand2) ? Avo.Mosh.YES : Avo.Mosh.INHERITED;
    }

    private SshRemoteConfigDBModel C(Long l10) {
        HostDBModel itemByLocalId;
        Long sshConfigId;
        if (l10 == null || (itemByLocalId = f.p().i().getItemByLocalId(l10.longValue())) == null || (sshConfigId = itemByLocalId.getSshConfigId()) == null) {
            return null;
        }
        return f.p().S().getItemByLocalId(sshConfigId.longValue());
    }

    private Avo.ParentGroup D(HostDBModel hostDBModel) {
        Long groupId;
        if (hostDBModel != null && (groupId = hostDBModel.getGroupId()) != null) {
            return E(groupId);
        }
        return Avo.ParentGroup.NONE;
    }

    private Avo.ParentGroup E(Long l10) {
        GroupDBModel itemByLocalId = f.p().h().getItemByLocalId(l10.longValue());
        return itemByLocalId == null ? Avo.ParentGroup.NONE : itemByLocalId.getParentGroupId() == null ? Avo.ParentGroup.ROOT : Avo.ParentGroup.NESTED;
    }

    private Avo.Plan F(String str) {
        if (str != null) {
            for (Avo.Plan plan : Avo.Plan.values()) {
                if (plan.toString().equalsIgnoreCase(str)) {
                    return plan;
                }
            }
        }
        return Avo.Plan.FREE;
    }

    private Avo.Port G(HostDBModel hostDBModel, SshRemoteConfigDBModel sshRemoteConfigDBModel, Connection connection) {
        if (hostDBModel == null) {
            return Avo.Port.NO;
        }
        Long groupId = hostDBModel.getGroupId();
        Integer port = sshRemoteConfigDBModel != null ? sshRemoteConfigDBModel.getPort() : null;
        if (groupId == null) {
            return port == null ? Avo.Port.NO : Avo.Port.YES;
        }
        if (port != null) {
            return Avo.Port.YES;
        }
        Integer port2 = connection.getSafeSshProperties().getPort();
        return (port2 == null || port2.intValue() == 22) ? Avo.Port.NO : Avo.Port.INHERITED;
    }

    private Avo.Proxy H(SshRemoteConfigDBModel sshRemoteConfigDBModel, Connection connection) {
        Avo.Proxy proxy = Avo.Proxy.NO;
        boolean z10 = false;
        boolean z11 = connection.getSafeSshProperties().getProxy() != null;
        if (sshRemoteConfigDBModel != null && sshRemoteConfigDBModel.getProxyId() != null) {
            z10 = true;
        }
        return (!z11 || z10) ? z11 ? Avo.Proxy.YES : proxy : Avo.Proxy.INHERITED;
    }

    private Avo.SEPKey I(String str) {
        if (str == null) {
            return null;
        }
        for (Avo.SEPKey sEPKey : Avo.SEPKey.values()) {
            if (sEPKey.toString().equals(str)) {
                return sEPKey;
            }
        }
        return null;
    }

    private Avo.IsSharedEntity J(String str) {
        if (str == null) {
            return null;
        }
        for (Avo.IsSharedEntity isSharedEntity : Avo.IsSharedEntity.values()) {
            if (isSharedEntity.toString().equals(str)) {
                return isSharedEntity;
            }
        }
        return null;
    }

    private Avo.Snippet K(HostDBModel hostDBModel, SshRemoteConfigDBModel sshRemoteConfigDBModel, Connection connection, String str) {
        Avo.Snippet snippet = Avo.Snippet.NO;
        boolean z10 = false;
        boolean z11 = connection.getSafeSshProperties().getStartupSnippet() != null;
        boolean z12 = (sshRemoteConfigDBModel == null || sshRemoteConfigDBModel.getStartupSnippetId() == null) ? false : true;
        if (hostDBModel != null && hostDBModel.hasGroup()) {
            z10 = true;
        }
        if (!z11 || z12) {
            return z11 ? Avo.Snippet.YES : snippet;
        }
        return !z10 ? Avo.Snippet.YES : Avo.Snippet.INHERITED;
    }

    private String L() {
        return "GooglePlay";
    }

    private Avo.Source M(String str) {
        if (str == null) {
            return null;
        }
        for (Avo.Source source : Avo.Source.values()) {
            if (source.toString().equalsIgnoreCase(str)) {
                return source;
            }
        }
        return null;
    }

    private void N1(boolean z10, Avo.DowngradeButtonLocation downgradeButtonLocation) {
        if (f46421e) {
            Avo.q3(z10 ? Avo.ExtensionOffer.YES : Avo.ExtensionOffer.NO, downgradeButtonLocation);
        }
    }

    private Avo.EventTeamRole P() {
        com.server.auditor.ssh.client.app.a aVarN = com.server.auditor.ssh.client.app.a.N();
        if (aVarN.z0()) {
            return aVarN.j() ? Avo.EventTeamRole.OWNER : d(aVarN);
        }
        return null;
    }

    private void P5(String str, String str2, Avo.TerminalThemeSource terminalThemeSource) {
        Avo.Y5(str, terminalThemeSource, str2);
    }

    private Avo.TeammateRole Q() {
        com.server.auditor.ssh.client.app.a aVarN = com.server.auditor.ssh.client.app.a.N();
        return aVarN.j() ? Avo.TeammateRole.OWNER : aVarN.z() ? Avo.TeammateRole.EDITOR : Avo.TeammateRole.MEMBER;
    }

    private Avo.Theme R(HostDBModel hostDBModel, SshRemoteConfigDBModel sshRemoteConfigDBModel, Connection connection) {
        if (hostDBModel == null) {
            return Avo.Theme.NO;
        }
        String colorScheme = sshRemoteConfigDBModel != null ? sshRemoteConfigDBModel.getColorScheme() : null;
        String colorScheme2 = connection.getColorScheme();
        String string = this.f46426a.getString("color_scheme_settings", k9.d.f63270c.a().getName());
        return colorScheme == null ? hostDBModel.getGroupId() == null ? Avo.Theme.NO : (colorScheme2 == null || string.equals(colorScheme2)) ? Avo.Theme.NO : Avo.Theme.INHERITED : colorScheme.equals(colorScheme2) ? string.equals(colorScheme2) ? Avo.Theme.NO : Avo.Theme.YES : Avo.Theme.INHERITED;
    }

    private Avo.Type T(Connection connection, String str, Map map) {
        if (!TextUtils.equals(str, Avo.Type.SSH.toString()) || connection.getSafeSshProperties().getStartupSnippet() == null) {
            return U((String) map.get("Type"));
        }
        return null;
    }

    private Avo.Type U(String str) {
        if (str == null) {
            return null;
        }
        for (Avo.Type type : Avo.Type.values()) {
            if (type.toString().equalsIgnoreCase(str)) {
                return type;
            }
        }
        return null;
    }

    private Avo.Username V(HostDBModel hostDBModel, List list, Connection connection) {
        Avo.Username username = hostDBModel == null ? Avo.Username.NO : null;
        if (username == null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Avo.Credentials credentials = (Avo.Credentials) it.next();
                if (username == null && credentials == Avo.Credentials.IDENTITY) {
                    username = Avo.Username.NO;
                }
            }
        }
        if (username != null) {
            return username;
        }
        Long sshConfigId = hostDBModel.getSshConfigId();
        SshConfigIdentityDBModel sshConfigIdentityDBModelFindItemBySshConfigId = sshConfigId != null ? f.p().U().findItemBySshConfigId(sshConfigId.longValue()) : null;
        Long lValueOf = sshConfigIdentityDBModelFindItemBySshConfigId != null ? Long.valueOf(sshConfigIdentityDBModelFindItemBySshConfigId.getIdentityId()) : null;
        Identity identity = connection.getSafeSshProperties().getIdentity();
        return lValueOf == null ? identity == null ? Avo.Username.NO : W(hostDBModel.hasGroup()) : identity == null ? Avo.Username.NO : identity.getId() == lValueOf.longValue() ? Avo.Username.YES : Avo.Username.INHERITED;
    }

    private Avo.Username W(boolean z10) {
        return !z10 ? Avo.Username.YES : Avo.Username.INHERITED;
    }

    private boolean X() {
        return !Arrays.equals(com.server.auditor.ssh.client.app.a.N().Q().d("70696E5F73637265656E5F6C6F636B5F636F6465", new byte[]{-3}), l.h("disabled_lock_pattern").getBytes(su.d.f78241b));
    }

    private boolean Y() {
        return !Arrays.equals(com.server.auditor.ssh.client.app.a.N().Q().d("70696E5F73637265656E5F696E74656E745F636F6465", new byte[]{-5}), l.i("disabled_pin_code").getBytes(su.d.f78241b));
    }

    private boolean Z() {
        return !Arrays.equals(com.server.auditor.ssh.client.app.a.N().Q().d("365F6C656E6774685F70696E5F636F6465", new byte[]{-4}), l.i("disabled_pin_code_6_length").getBytes(su.d.f78241b));
    }

    private void a(Identity identity, List list) {
        if (identity.isVisible()) {
            if (list.contains(Avo.Credentials.IDENTITY)) {
                return;
            }
            list.add(Avo.Credentials.INHERITED_IDENTITY);
            return;
        }
        if (identity.getSshIdMode() != null && !list.contains(Avo.Credentials.SSH_ID)) {
            list.add(Avo.Credentials.INHERITED_SSH_ID);
        }
        SshKeyDBModel sshKey = identity.getSshKey();
        if (sshKey != null) {
            if (f.p().Q().getCertificatesBySshKeyId(sshKey.getIdInDatabase()).isEmpty()) {
                if (!list.contains(Avo.Credentials.SSH_KEY)) {
                    list.add(Avo.Credentials.INHERITED_SSH_KEY);
                }
            } else if (!list.contains(Avo.Credentials.SSH_CERTIFICATE)) {
                list.add(Avo.Credentials.INHERITED_SSH_CERTIFICATE);
            }
        }
        if (identity.getPassword() == null || identity.getPassword().isEmpty() || list.contains(Avo.Credentials.PASSWORD)) {
            return;
        }
        list.add(Avo.Credentials.INHERITED_PASSWORD);
    }

    private void b(IdentityDBModel identityDBModel, List list) {
        if (identityDBModel.isVisible()) {
            list.add(Avo.Credentials.IDENTITY);
            return;
        }
        if (identityDBModel.getSshIdMode() != null) {
            list.add(Avo.Credentials.SSH_ID);
        }
        Long sshKeyId = identityDBModel.getSshKeyId();
        if (sshKeyId != null) {
            if (f.p().Q().getCertificatesBySshKeyId(sshKeyId.longValue()).isEmpty()) {
                list.add(Avo.Credentials.SSH_KEY);
            } else {
                list.add(Avo.Credentials.SSH_CERTIFICATE);
            }
        }
        if (identityDBModel.getPassword() == null || identityDBModel.getPassword().isEmpty()) {
            return;
        }
        list.add(Avo.Credentials.PASSWORD);
    }

    private boolean c(String str) {
        return (str == null || str.isEmpty() || "{}".equals(str)) ? false : true;
    }

    private boolean c0(Connection connection) {
        SshKeyDBModel sshKey;
        String privateKey;
        SshProperties sshProperties = connection.getSshProperties();
        if (sshProperties == null || (sshKey = sshProperties.getSshKey()) == null || (privateKey = sshKey.getPrivateKey()) == null) {
            return false;
        }
        int keyTypeFromPrivateKey = Keygen.getKeyTypeFromPrivateKey(privateKey);
        return keyTypeFromPrivateKey == 4 || keyTypeFromPrivateKey == 5;
    }

    private Avo.EventTeamRole d(com.server.auditor.ssh.client.app.a aVar) {
        return aVar.z() ? Avo.EventTeamRole.EDITOR : Avo.EventTeamRole.MEMBER;
    }

    private boolean d0(String str) {
        return (TextUtils.equals(str, "Local") || TextUtils.equals(str, "Telnet")) ? false : true;
    }

    private String e(Connection connection, boolean z10) {
        int i10 = C0660a.f46429a[connection.getType().ordinal()];
        if (i10 == 1) {
            SshProperties safeSshProperties = connection.getSafeSshProperties();
            if (z10) {
                return null;
            }
            return safeSshProperties.isUseMosh() ? Avo.Type.MOSH.toString() : safeSshProperties.isIsPortForwarding() == null ? false : safeSshProperties.isIsPortForwarding().booleanValue() ? Avo.Type.PORT_FORWARDING.toString() : Avo.Type.SSH.toString();
        }
        if (i10 == 2) {
            return Avo.Type.LOCAL.toString();
        }
        if (i10 == 3) {
            return Avo.Type.TELNET.toString();
        }
        if (i10 != 4) {
            return null;
        }
        return Avo.Type.SERIAL.toString();
    }

    private Avo.SSHidDefaultPasskeyType f(String str) {
        str.getClass();
        switch (str) {
            case "ED25519":
                return Avo.SSHidDefaultPasskeyType.ED25519;
            case "RSA":
                return Avo.SSHidDefaultPasskeyType.RSA;
            case "ECDSA":
                return Avo.SSHidDefaultPasskeyType.ECDSA;
            case "ECDSA-SK":
                return Avo.SSHidDefaultPasskeyType.ECDSAMINUS_S_K;
            default:
                return null;
        }
    }

    private int f0() {
        try {
            return Integer.parseInt(new String(com.server.auditor.ssh.client.app.a.N().Q().d("70696E5F636F64655F74696D65", "0".getBytes(su.d.f78241b))));
        } catch (NumberFormatException e10) {
            y9.a.f86838a.i(e10);
            return 0;
        }
    }

    private Avo.SSHidPasskeyType g(String str) {
        str.getClass();
        switch (str) {
            case "ED25519":
                return Avo.SSHidPasskeyType.ED25519;
            case "RSA":
                return Avo.SSHidPasskeyType.RSA;
            case "ECDSA":
                return Avo.SSHidPasskeyType.ECDSA;
            case "ECDSA-SK":
                return Avo.SSHidPasskeyType.ECDSAMINUS_S_K;
            default:
                return null;
        }
    }

    private Avo.IsBiometryEnabled g0() {
        return r0.a(new String(com.server.auditor.ssh.client.app.a.N().Q().d("7573655F746F7563685F6964", r0.b(false, "7573655F746F7563685F6964").getBytes(su.d.f78241b))), "7573655F746F7563685F6964", false) ? Avo.IsBiometryEnabled.YES : Avo.IsBiometryEnabled.NO;
    }

    private String h(String str) {
        if (TextUtils.isEmpty(str)) {
            return "unknown";
        }
        return Pattern.compile("^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$").matcher(str).matches() ? "IPv4" : Pattern.compile("(([0-9a-fA-F]{1,4}:){7,7}[0-9a-fA-F]{1,4}|([0-9a-fA-F]{1,4}:){1,7}:|([0-9a-fA-F]{1,4}:){1,6}:[0-9a-fA-F]{1,4}|([0-9a-fA-F]{1,4}:){1,5}(:[0-9a-fA-F]{1,4}){1,2}|([0-9a-fA-F]{1,4}:){1,4}(:[0-9a-fA-F]{1,4}){1,3}|([0-9a-fA-F]{1,4}:){1,3}(:[0-9a-fA-F]{1,4}){1,4}|([0-9a-fA-F]{1,4}:){1,2}(:[0-9a-fA-F]{1,4}){1,5}|[0-9a-fA-F]{1,4}:((:[0-9a-fA-F]{1,4}){1,6})|:((:[0-9a-fA-F]{1,4}){1,7}|:)|fe80:(:[0-9a-fA-F]{0,4}){0,4}%[0-9a-zA-Z]{1,}|::(ffff(:0{1,4}){0,1}:){0,1}((25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])\\.){3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])|([0-9a-fA-F]{1,4}:){1,4}:((25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])\\.){3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9]))").matcher(str).matches() ? "IPv6" : "hostname";
    }

    private void h0(Avo.SystemPlan systemPlan) {
        Avo.n5(null, systemPlan, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Avo.SystemSSHidSetUpCompleted.NO_SS_HID);
    }

    private Avo.AddressType i(String str) {
        if (str == null) {
            return null;
        }
        for (Avo.AddressType addressType : Avo.AddressType.values()) {
            if (addressType.toString().equalsIgnoreCase(str)) {
                return addressType;
            }
        }
        return null;
    }

    private Avo.AgentForwarding j(SshRemoteConfigDBModel sshRemoteConfigDBModel, Connection connection) {
        return (sshRemoteConfigDBModel == null || sshRemoteConfigDBModel.isUseAgentForwarding() == null || !sshRemoteConfigDBModel.isUseAgentForwarding().booleanValue()) ? connection.getSafeSshProperties().isUseAgentForwarding() != null && connection.getSafeSshProperties().isUseAgentForwarding().booleanValue() ? Avo.AgentForwarding.INHERITED : Avo.AgentForwarding.DISABLED : Avo.AgentForwarding.ENABLED;
    }

    private void j4(Long l10, Avo.LogBookmarkState logBookmarkState, boolean z10) {
        if (f46421e) {
            Avo.d4(l10 != null ? String.valueOf(l10) : "-1", logBookmarkState, z10 ? Avo.HasComment.YES : Avo.HasComment.NO);
        }
    }

    private Avo.Charset l(HostDBModel hostDBModel, SshRemoteConfigDBModel sshRemoteConfigDBModel, Connection connection) {
        if (hostDBModel == null) {
            return Avo.Charset.NO;
        }
        String charset = connection.getCharset();
        String charset2 = sshRemoteConfigDBModel != null ? sshRemoteConfigDBModel.getCharset() : null;
        if (charset2 != null) {
            return charset2.equals(charset) ? SQLiteHelper.DEFAULT_CHARSET.equals(charset) ? Avo.Charset.NO : Avo.Charset.YES : Avo.Charset.INHERITED;
        }
        if (hostDBModel.getGroupId() != null && !SQLiteHelper.DEFAULT_CHARSET.equals(charset)) {
            return Avo.Charset.INHERITED;
        }
        return Avo.Charset.NO;
    }

    private Avo.AppColorTheme m(int i10) {
        return (i10 < 0 || i10 >= Avo.AppColorTheme.values().length) ? Avo.AppColorTheme.LIGHT : Avo.AppColorTheme.values()[i10];
    }

    private Map n(Connection connection, String str) {
        ChainingHost chainHostAppModelByConfigId;
        HashMap map = new HashMap();
        SshProperties sshProperties = connection.getSshProperties();
        Long hostId = connection.getHostId();
        boolean zJ = com.server.auditor.ssh.client.app.a.N().j();
        if (hostId != null) {
            HostDBModel itemByLocalId = f.p().i().getItemByLocalId(hostId.longValue());
            if (itemByLocalId != null && itemByLocalId.isShared()) {
                map.put("Shared", "yes");
                if (zJ) {
                    map.put("isOwner", "yes");
                } else {
                    map.put("isOwner", "no");
                }
            } else if (itemByLocalId != null && !itemByLocalId.isShared()) {
                map.put("Shared", "no");
                if (zJ) {
                    map.put("isOwner", "yes");
                } else {
                    map.put("isOwner", "no");
                }
            }
        } else {
            map.put("Shared", "no");
            if (zJ) {
                map.put("isOwner", "yes");
            } else {
                map.put("isOwner", "no");
            }
        }
        if (sshProperties != null) {
            String host = connection.getHost();
            String str2 = (sshProperties.getSshKey() == null || sshProperties.getSshKey().getBiometricAlias() == null) ? "no" : "yes";
            String str3 = sshProperties.getProxy() != null ? "yes" : "no";
            String str4 = (!com.server.auditor.ssh.client.app.a.N().u0() || (chainHostAppModelByConfigId = f.p().c().getChainHostAppModelByConfigId(sshProperties.getDbId())) == null || chainHostAppModelByConfigId.getHostList().isEmpty()) ? "no" : "yes";
            String str5 = (sshProperties.isUseAgentForwarding() == null || !sshProperties.isUseAgentForwarding().booleanValue()) ? "disabled" : "enabled";
            if (d0(str)) {
                map.put("AgentForwarding", str5);
                map.put("HostChain", str4);
                map.put("Proxy", str3);
                map.put("SEPKEY", str2);
            }
            map.put("AddressType", h(host));
        } else {
            map.put("AddressType", "hostname");
        }
        map.put("Type", str);
        return map;
    }

    private Avo.CredentialsSharingMode o(Long l10) {
        Host hostS = f.p().j().s(l10);
        if (hostS == null || hostS.getGroup() == null) {
            return null;
        }
        return p(new p0().c(hostS));
    }

    private Avo.CredentialsSharingMode p(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
            case "credentials_sharing":
                return Avo.CredentialsSharingMode.CREDENTIALS;
            case "no_credentials_sharing":
                return Avo.CredentialsSharingMode.NO_CREDENTIALS;
            case "multikey":
                return Avo.CredentialsSharingMode.MULTI_KEY;
            default:
                return null;
        }
    }

    private List q(SshRemoteConfigDBModel sshRemoteConfigDBModel, Connection connection) {
        Identity identity;
        ArrayList arrayList = new ArrayList();
        SshConfigIdentityDBModel sshConfigIdentityDBModelFindItemBySshConfigId = sshRemoteConfigDBModel != null ? f.p().U().findItemBySshConfigId(sshRemoteConfigDBModel.getIdInDatabase()) : null;
        if (sshConfigIdentityDBModelFindItemBySshConfigId != null) {
            IdentityDBModel itemByLocalId = f.p().n().getItemByLocalId(sshConfigIdentityDBModelFindItemBySshConfigId.getIdentityId());
            if (itemByLocalId != null) {
                b(itemByLocalId, arrayList);
            }
        }
        if (connection != null && (identity = connection.getSafeSshProperties().getIdentity()) != null) {
            a(identity, arrayList);
        }
        return arrayList;
    }

    private Avo.TerminalFont r() {
        String string = com.server.auditor.ssh.client.app.a.N().M().getString("fontTerminal", "fonts/SourceCodePro-Medium.ttf");
        string.getClass();
        switch (string) {
            case "fonts/CascadiaCodePL.ttf":
                return Avo.TerminalFont.CASCADIA_CODE;
            case "fonts/PTM55FT.ttf":
                return Avo.TerminalFont.PT_MONO;
            case "fonts/DejaVuSansMono.ttf":
                return Avo.TerminalFont.DEJAVU_SANS_MONO;
            case "fonts/Fira-Code-Regular-Nerd-Font-Complete-Mono.ttf":
                return Avo.TerminalFont.FIRA_CODE;
            case "fonts/JetBrains-Mono-Regular-Nerd-Font-Complete-Mono.ttf":
                return Avo.TerminalFont.JETBRAINS_MONO;
            case "fonts/UbuntuMono-R.ttf":
                return Avo.TerminalFont.UBUNTU_MONO;
            case "fonts/MesloLGS-NF-Regular.ttf":
                return Avo.TerminalFont.MESLO;
            default:
                return Avo.TerminalFont.SOURCE_CODE_PRO_MEDIUM;
        }
    }

    private String s() {
        return this.f46426a.getString("color_scheme_settings", k9.d.f63270c.a().getName());
    }

    private Integer t(VaultKeyId vaultKeyId) {
        if (vaultKeyId == null) {
            return null;
        }
        return this.f46428c.getRemoteIdOfCustomVault(vaultKeyId);
    }

    private Avo.DeactivateTo u(DowngradeToPlanType downgradeToPlanType) {
        return downgradeToPlanType == DowngradeToPlanType.DowngradeToTeam.INSTANCE ? Avo.DeactivateTo.TEAM : Avo.DeactivateTo.INDIVIDUAL;
    }

    private Avo.EnvironmentVariables v(SshRemoteConfigDBModel sshRemoteConfigDBModel) {
        return c(sshRemoteConfigDBModel != null ? sshRemoteConfigDBModel.getEnvironmentVariables() : null) ? Avo.EnvironmentVariables.YES : Avo.EnvironmentVariables.NO;
    }

    private void w1(int i10, Avo.CESurveyResult cESurveyResult, String str) {
        Avo.h3(i10, cESurveyResult, str);
    }

    private Avo.HostChain x(String str) {
        if (str != null) {
            for (Avo.HostChain hostChain : Avo.HostChain.values()) {
                if (hostChain.toString().equalsIgnoreCase(str)) {
                    return hostChain;
                }
            }
        }
        return Avo.HostChain.NO;
    }

    public static synchronized a y() {
        try {
            if (com.server.auditor.ssh.client.app.a.N().M().getBoolean(TermiusApplication.F().getString(R.string.settings_key_enable_sending_ga), true) || !com.server.auditor.ssh.client.app.a.N().u0()) {
                f46421e = true;
            }
            if (f46420d == null) {
                f46420d = new a(TermiusApplication.F());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f46420d;
    }

    private Avo.IsSharedEntityOwner z(String str) {
        if (str == null) {
            return null;
        }
        for (Avo.IsSharedEntityOwner isSharedEntityOwner : Avo.IsSharedEntityOwner.values()) {
            if (isSharedEntityOwner.toString().equals(str)) {
                return isSharedEntityOwner;
            }
        }
        return null;
    }

    public void A0(boolean z10) {
        if (f46421e) {
            Avo.I2(z10 ? Avo.BuyNowButtonLocation.CHOOSE_PLAN_SCREEN : Avo.BuyNowButtonLocation.EXPIRED_SUBSCRIPTION_SCREEN, Avo.ProductID.BUSINESS, null, null);
        }
    }

    public void A1() {
        if (f46421e) {
            Avo.J4(Avo.BellNotificationAction.CUSTOMER_EXPERIENCE_SURVEY, null);
        }
    }

    public void A2(Long l10, boolean z10, boolean z11, boolean z12, boolean z13) {
        if (f46421e) {
            Avo.IsSharedEntity isSharedEntity = z10 ? Avo.IsSharedEntity.YES : Avo.IsSharedEntity.NO;
            String strValueOf = null;
            Avo.EventTeamRole eventTeamRole = z11 ? Avo.EventTeamRole.OWNER : z12 ? Avo.EventTeamRole.EDITOR : z13 ? Avo.EventTeamRole.MEMBER : null;
            if (l10 != null && l10.longValue() != 0 && l10.longValue() != -1) {
                strValueOf = String.valueOf(l10);
            }
            v6();
            Avo.L3(isSharedEntity, eventTeamRole, strValueOf);
        }
    }

    public void A3(String str) {
        if (f46421e) {
            Avo.T4(str);
        }
    }

    public void A4() {
        if (f46421e) {
            Avo.Y4(Avo.PromotionLocation.LOGS, Avo.PromotionType.BACK_UP_LOGS_WITH_ACCOUNT, null, null, null, null);
        }
    }

    public void A5() {
        if (f46421e) {
            Avo.Q5();
        }
    }

    public void B0(boolean z10) {
        if (f46421e) {
            Avo.I2(z10 ? Avo.BuyNowButtonLocation.CHOOSE_PLAN_SCREEN : Avo.BuyNowButtonLocation.EXPIRED_SUBSCRIPTION_SCREEN, Avo.ProductID.PREMIUM, null, Avo.Period.MONTHLY);
        }
    }

    public void B1() {
        if (f46421e) {
            Avo.i3(Avo.CustomizeKeyboardButtonLocation.SETTINGS);
        }
    }

    public void B2(Avo.HelpButtonType helpButtonType) {
        if (f46421e) {
            Avo.M3(helpButtonType);
        }
    }

    public void B3() {
        if (f46421e) {
            Avo.C4(Avo.PortForwardingFormType.WIZARD);
        }
    }

    public void B4() {
        if (f46421e) {
            Avo.Z4(Avo.PromotionLocation.LOGS, Avo.PromotionType.BACK_UP_LOGS_WITH_ACCOUNT);
        }
    }

    public void B5() {
        if (f46421e) {
            Avo.R5();
        }
    }

    public void C0() {
        if (f46421e) {
            Avo.I2(Avo.BuyNowButtonLocation.TEAM_DEACTIVATION_SCREEN, Avo.ProductID.PREMIUM, null, Avo.Period.MONTHLY);
        }
    }

    public void C1() {
        if (f46421e) {
            Avo.i3(Avo.CustomizeKeyboardButtonLocation.KEYBOARD_ADDON);
        }
    }

    public void C2() {
        if (f46421e) {
            Avo.N3(Avo.HintLevel.INFO, Avo.HintMessage.ADD_SNIPPETS_FROM_HISTORY, Avo.HintType.HINT);
        }
    }

    public void C3(String str, int i10) {
        if (f46421e) {
            Avo.U4(str, i10);
        }
    }

    public void C4() {
        if (f46421e) {
            Avo.a5(Avo.PromotionLocation.LOGS, Avo.PromotionType.BACK_UP_LOGS_WITH_ACCOUNT);
        }
    }

    public void C5(int i10, int i11) {
        if (f46421e) {
            Avo.T5(i10, Integer.valueOf(i11));
        }
    }

    public void D0() {
        if (f46421e) {
            Avo.I2(Avo.BuyNowButtonLocation.TRIAL_EXTENSION_OFFER_SCREEN, Avo.ProductID.PREMIUM, null, Avo.Period.MONTHLY);
        }
    }

    public void D1(DowngradeToPlanType downgradeToPlanType) {
        if (f46421e) {
            Avo.j3(u(downgradeToPlanType));
        }
    }

    public void D2() {
        if (f46421e) {
            Avo.O3(P());
        }
    }

    public void D3(boolean z10) {
        if (f46421e) {
            Avo.c5(Avo.Period.MONTHLY, Avo.ProductID.PREMIUM, z10 ? Avo.BuyNowButtonLocation.CHOOSE_PLAN_SCREEN : Avo.BuyNowButtonLocation.EXPIRED_SUBSCRIPTION_SCREEN, null);
        }
    }

    public void D4() {
        if (f46421e) {
            Avo.Z4(Avo.PromotionLocation.LOGS_SETTINGS, Avo.PromotionType.HIGHMINUSVOLUME_UNSYNCED_LOGS);
        }
    }

    public void D5(int i10) {
        if (f46421e) {
            Avo.U5(i10);
        }
    }

    public void E0(boolean z10) {
        if (f46421e) {
            Avo.I2(z10 ? Avo.BuyNowButtonLocation.CHOOSE_PLAN_SCREEN : Avo.BuyNowButtonLocation.EXPIRED_SUBSCRIPTION_SCREEN, Avo.ProductID.PREMIUM, null, Avo.Period.YEARLY);
        }
    }

    public void E1(String str, DowngradeToPlanType downgradeToPlanType) {
        if (f46421e) {
            Avo.k3(str, u(downgradeToPlanType), Avo.VaultDeactivationStep.FETCHING_DATA);
        }
    }

    public void E2(boolean z10, boolean z11, boolean z12, boolean z13) {
        if (f46421e) {
            Avo.IsSharedEntity isSharedEntity = z10 ? Avo.IsSharedEntity.YES : Avo.IsSharedEntity.NO;
            Avo.EventTeamRole eventTeamRole = z11 ? Avo.EventTeamRole.OWNER : z12 ? Avo.EventTeamRole.EDITOR : z13 ? Avo.EventTeamRole.MEMBER : null;
            v6();
            Avo.P3(isSharedEntity, eventTeamRole, f46423u.intValue());
        }
    }

    public void E3() {
        if (f46421e) {
            Avo.c5(Avo.Period.MONTHLY, Avo.ProductID.PREMIUM, Avo.BuyNowButtonLocation.TEAM_DEACTIVATION_SCREEN, null);
        }
    }

    public void E4() {
        if (f46421e) {
            Avo.i4();
        }
    }

    public void E5(int i10) {
        if (f46421e) {
            Avo.V5(i10);
        }
    }

    public void F0() {
        if (f46421e) {
            Avo.I2(Avo.BuyNowButtonLocation.TEAM_DEACTIVATION_SCREEN, Avo.ProductID.PREMIUM, null, Avo.Period.YEARLY);
        }
    }

    public void F1(String str, DowngradeToPlanType downgradeToPlanType) {
        if (f46421e) {
            Avo.k3(str, u(downgradeToPlanType), Avo.VaultDeactivationStep.FETCHING_KEYS);
        }
    }

    public void F2() {
        if (f46421e) {
            Avo.W3();
        }
    }

    public void F3() {
        if (f46421e) {
            Avo.I2(Avo.BuyNowButtonLocation.DOWNGRADE_FROM_PRO_SCREEN, Avo.ProductID.PREMIUM, null, null);
        }
    }

    public void F4(Avo.AuthMethod authMethod) {
        if (f46421e) {
            Avo.l5(authMethod);
        }
    }

    public void F5(String str, boolean z10) {
        if (f46421e) {
            Avo.W5(z10 ? Avo.OpenedFrom.CHOOSE_PLAN_SCREEN : Avo.OpenedFrom.EXPIRED_SUBSCRIPTION_SCREEN, str, Avo.TeamTrialPlan.TEAM);
        }
    }

    public void G0() {
        if (f46421e) {
            Avo.I2(Avo.BuyNowButtonLocation.TRIAL_EXTENSION_OFFER_SCREEN, Avo.ProductID.PREMIUM, null, Avo.Period.YEARLY);
        }
    }

    public void G1(String str, DowngradeToPlanType downgradeToPlanType) {
        if (f46421e) {
            Avo.k3(str, u(downgradeToPlanType), Avo.VaultDeactivationStep.PERFORMING_DEACTIVATION);
        }
    }

    public void G2(boolean z10) {
        Avo.KeychainItemLocation keychainItemLocation;
        Avo.KeychainItem keychainItem;
        if (f46421e) {
            if (z10) {
                keychainItemLocation = Avo.KeychainItemLocation.SEPKEY;
                keychainItem = Avo.KeychainItem.BIOMETRIC_KEY;
            } else {
                keychainItemLocation = Avo.KeychainItemLocation.LOCAL;
                keychainItem = Avo.KeychainItem.SSH_KEY;
            }
            Avo.Y3(keychainItemLocation, keychainItem);
        }
    }

    public void G3() {
        if (f46421e) {
            Avo.X4();
        }
    }

    public void G4() {
        if (f46421e) {
            Avo.d5(Avo.OnScreen.SETTINGS);
        }
    }

    public void G5() {
        if (f46421e) {
            Avo.L5(Avo.ExpiredScreenType.TEAM_TRIAL_OWNER_AWAITING_DOWNGRADE);
        }
    }

    public void H0(boolean z10) {
        if (f46421e) {
            Avo.I2(z10 ? Avo.BuyNowButtonLocation.CHOOSE_PLAN_SCREEN : Avo.BuyNowButtonLocation.EXPIRED_SUBSCRIPTION_SCREEN, Avo.ProductID.TEAM, null, null);
        }
    }

    public void H1(String str, DowngradeToPlanType downgradeToPlanType) {
        if (f46421e) {
            Avo.k3(str, u(downgradeToPlanType), Avo.VaultDeactivationStep.PREPARING_CRYPTORS);
        }
    }

    public void H2(int i10, int i11, int i12, int i13, Avo.KeychainItemLocation keychainItemLocation, Avo.KeySource keySource, Avo.KeychainItem keychainItem) {
        if (f46421e) {
            Avo.a4(i10, i11, i12, keychainItemLocation, keySource, keychainItem, i13);
        }
    }

    public void H3() {
        if (f46421e) {
            Avo.W4();
        }
    }

    public void H4() {
        if (f46421e) {
            Avo.o5(Avo.SetupSyncLocation.SYNC_OVERVIEW_SCREEN);
        }
    }

    public void H5() {
        if (f46421e) {
            Avo.J3(Avo.GestureType.DOUBLE_TAP);
        }
    }

    public void I0() {
        if (f46421e) {
            Avo.I2(Avo.BuyNowButtonLocation.TEAM_DEACTIVATION_SCREEN, Avo.ProductID.TEAM, null, null);
        }
    }

    public void I1(String str, DowngradeToPlanType downgradeToPlanType) {
        if (f46421e) {
            Avo.k3(str, u(downgradeToPlanType), Avo.VaultDeactivationStep.REMINUSENCRYPTING_DATA);
        }
    }

    public void I2(int i10, int i11, int i12, Avo.KeychainItemLocation keychainItemLocation, Avo.KeychainItem keychainItem, int i13) {
        if (f46421e) {
            Avo.b4(i10, i11, i12, keychainItemLocation, keychainItem, i13);
        }
    }

    public void I3(boolean z10) {
        if (f46421e) {
            Avo.c5(Avo.Period.YEARLY, Avo.ProductID.PREMIUM, z10 ? Avo.BuyNowButtonLocation.CHOOSE_PLAN_SCREEN : Avo.BuyNowButtonLocation.EXPIRED_SUBSCRIPTION_SCREEN, null);
        }
    }

    public void I4() {
        if (f46421e) {
            Avo.o5(Avo.SetupSyncLocation.SECURITY_OVERVIEW_SCREEN);
        }
    }

    public void I5(String str) {
        Avo.TerminalFont terminalFont;
        if (f46421e) {
            terminalFont = Avo.TerminalFont.SOURCE_CODE_PRO_MEDIUM;
            str.getClass();
            switch (str) {
                case "Cascadia Code":
                    terminalFont = Avo.TerminalFont.CASCADIA_CODE;
                    break;
                case "FiraCode":
                    terminalFont = Avo.TerminalFont.FIRA_CODE;
                    break;
                case "Meslo":
                    terminalFont = Avo.TerminalFont.MESLO;
                    break;
                case "PT Mono":
                    terminalFont = Avo.TerminalFont.PT_MONO;
                    break;
                case "Ubuntu Mono":
                    terminalFont = Avo.TerminalFont.UBUNTU_MONO;
                    break;
                case "JetBrains Mono":
                    terminalFont = Avo.TerminalFont.JETBRAINS_MONO;
                    break;
                case "DejaVu Sans Mono":
                    terminalFont = Avo.TerminalFont.DEJAVU_SANS_MONO;
                    break;
            }
            Avo.X5(terminalFont);
        }
    }

    public void J0(wp.a aVar) {
        if (f46421e) {
            Avo.J2(aVar.b(), aVar.c(), aVar.e(), aVar.f(), aVar.a(), aVar.d());
        }
    }

    public void J1(DowngradeToPlanType downgradeToPlanType) {
        if (f46421e) {
            Avo.m6(u(downgradeToPlanType));
        }
    }

    public void J2(boolean z10) {
        if (f46421e) {
            Avo.h5(Avo.SendKeyButtonLocation.KEYCHAIN_MULTISELECT, z10 ? Avo.KeychainItem.BIOMETRIC_KEY : Avo.KeychainItem.SSH_KEY);
        }
    }

    public void J3() {
        if (f46421e) {
            Avo.c5(Avo.Period.YEARLY, Avo.ProductID.PREMIUM, Avo.BuyNowButtonLocation.TEAM_DEACTIVATION_SCREEN, null);
        }
    }

    public void J4(Avo.SetupSSHidSource setupSSHidSource, String str, int i10, int i11) {
        if (f46421e) {
            Avo.p5(setupSSHidSource, str, i10, i11);
        }
    }

    public void J5(List list) {
        if (f46421e) {
            Avo.Z3(list);
        }
    }

    public void K0(wp.b bVar) {
        if (f46421e) {
            Avo.K2(bVar.a(), bVar.d(), bVar.c(), bVar.b());
        }
    }

    public void K1(Avo.DependencyResolution dependencyResolution, c cVar) {
        if (f46421e) {
            Avo.m3(cVar.e(), dependencyResolution, cVar.a(), cVar.d(), cVar.c(), cVar.b());
        }
    }

    public void K2(boolean z10) {
        if (f46421e) {
            Avo.h5(Avo.SendKeyButtonLocation.KEYCHAIN_ITEM, z10 ? Avo.KeychainItem.BIOMETRIC_KEY : Avo.KeychainItem.SSH_KEY);
        }
    }

    public void K3(Avo.Reason reason) {
        if (f46421e && new tp.r().a()) {
            Avo.b5(reason, Avo.ProductID.PREMIUM, f46422f, null);
        }
    }

    public void K4() {
        if (f46421e) {
            Avo.a3(Avo.CreateTeamWizardStep.CREDENTIALS_MODE, Avo.Trial.YES);
        }
    }

    public void K5() {
        if (f46421e) {
            Avo.J3(Avo.GestureType.PINCH);
        }
    }

    public void L0(Avo.ChoosePlanSource choosePlanSource) {
        if (f46421e) {
            Avo.L2(choosePlanSource);
        }
    }

    public void L1(c cVar) {
        if (f46421e) {
            Avo.n3(cVar.e(), cVar.a(), cVar.d(), cVar.c(), cVar.b());
        }
    }

    public void L2() {
        if (f46421e) {
            Avo.e4(Avo.LoginType.DANGEROUS_LOGOUT);
        }
    }

    public void L3(BillingSubscriptionType billingSubscriptionType, Avo.BuyNowButtonLocation buyNowButtonLocation) {
        if (f46421e) {
            Avo.Period period = Avo.Period.YEARLY;
            if (billingSubscriptionType instanceof BillingSubscriptionType.Pro) {
                ProSubscriptionType type = ((BillingSubscriptionType.Pro) billingSubscriptionType).getType();
                if (!(type instanceof ProSubscriptionType.Annual) && !(type instanceof ProSubscriptionType.AnnualFreeTrial) && ((type instanceof ProSubscriptionType.Monthly) || (type instanceof ProSubscriptionType.MonthlyFreeTrial))) {
                    period = Avo.Period.MONTHLY;
                }
            }
            Avo.c5(period, Avo.ProductID.PREMIUM, buyNowButtonLocation, f46422f);
        }
    }

    public void L4(Avo.OpenedFrom openedFrom, String str) {
        if (f46421e) {
            Avo.W5(openedFrom, str, Avo.TeamTrialPlan.TEAM);
        }
    }

    public void L5() {
        if (f46421e) {
            Avo.J3(Avo.GestureType.SWIPE_DOWN);
        }
    }

    public void M0(String str) {
        if (f46421e) {
            Avo.M2(str, Avo.ConfirmAccessButtonLocation.NOTIFICATIONS_LIST);
        }
    }

    public void M1(boolean z10) {
        if (f46421e) {
            if (z10) {
                Avo.o3(Avo.Success.YES);
            } else {
                Avo.o3(Avo.Success.NO);
            }
        }
    }

    public void M2() {
        if (f46421e) {
            Avo.e4(Avo.LoginType.TOKEN_EXPIRED);
        }
    }

    public void M3() {
        if (f46421e) {
            Avo.R3(Avo.ImportSource.AWS);
        }
    }

    public void M4() {
        if (f46421e) {
            Avo.a3(Avo.CreateTeamWizardStep.INVITE_MEMBERS, Avo.Trial.YES);
        }
    }

    public void M5() {
        if (f46421e) {
            Avo.J3(Avo.GestureType.SWIPE_LEFT);
        }
    }

    public Avo.SystemPlan N(String str) {
        if (str != null) {
            for (Avo.SystemPlan systemPlan : Avo.SystemPlan.values()) {
                if (systemPlan.toString().equalsIgnoreCase(str)) {
                    return systemPlan;
                }
            }
        }
        return Avo.SystemPlan.FREE;
    }

    public void N0(String str) {
        if (f46421e) {
            Avo.M2(str, Avo.ConfirmAccessButtonLocation.POPMINUSUP_NOTIFICATION);
        }
    }

    public void N2() {
        if (f46421e) {
            Avo.f4();
        }
    }

    public void N3() {
        if (f46421e) {
            Avo.R3(Avo.ImportSource.CSV);
        }
    }

    public void N4() {
        if (f46421e) {
            Avo.a3(Avo.CreateTeamWizardStep.DESCRIPTION, Avo.Trial.YES);
        }
    }

    public void N5() {
        if (f46421e) {
            Avo.J3(Avo.GestureType.SWIPE_RIGHT);
        }
    }

    public Avo.SystemSSHidSetUpCompleted O() {
        e eVarA = e.f46961d.a(TermiusApplication.F());
        return eVarA.o() ? eVarA.r() ? Avo.SystemSSHidSetUpCompleted.SSHID_SETUP_COMPLETED : Avo.SystemSSHidSetUpCompleted.SSHID_SET_UP_IN_PROGRESS : Avo.SystemSSHidSetUpCompleted.NO_SS_HID;
    }

    public void O0(String str) {
        if (f46421e) {
            Avo.J4(Avo.BellNotificationAction.CONFIRM_ACCESS, str);
        }
    }

    public void O1(boolean z10) {
        if (f46421e) {
            N1(z10, Avo.DowngradeButtonLocation.DEACTIVATE_TEAM_SCREEN);
        }
    }

    public void O2() {
        if (f46421e) {
            Avo.k4();
        }
    }

    public void O3() {
        if (f46421e) {
            Avo.Q3(Avo.ImportButtonLocation.TIP_OF_THE_DAY);
        }
    }

    public void O4() {
        if (f46421e) {
            Avo.a3(Avo.CreateTeamWizardStep.CREDENTIALS_MODE, Avo.Trial.YES);
        }
    }

    public void O5() {
        if (f46421e) {
            Avo.J3(Avo.GestureType.SWIPE_UP);
        }
    }

    public void P0(String str) {
        if (f46421e) {
            Avo.K4(Avo.BellNotificationAction.CONFIRM_ACCESS, str);
        }
    }

    public void P1(boolean z10, boolean z11) {
        if (f46421e) {
            N1(z10, z11 ? Avo.DowngradeButtonLocation.CHOOSE_PLAN_SCREEN : Avo.DowngradeButtonLocation.EXPIRED_SUBSCRIPTION_SCREEN);
        }
    }

    public void P2() {
        if (f46421e) {
            Avo.l4();
        }
    }

    public void P3() {
        if (f46421e) {
            Avo.W2(Avo.Instruction.IMPORT);
        }
    }

    public void P4(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (f46421e) {
            Avo.H2(i10, i11, i12, i13, i14, Integer.valueOf(i17), Integer.valueOf(i16), Integer.valueOf(i15));
        }
    }

    public void Q0(String str) {
        if (f46421e) {
            Avo.F2(Avo.BellNotificationAction.CONFIRM_ACCESS, Avo.Auto.YES, str);
        }
    }

    public void Q1(boolean z10) {
        if (f46421e) {
            N1(z10, Avo.DowngradeButtonLocation.EXTENSION_OFFER_SCREEN);
        }
    }

    public void Q2() {
        if (f46421e) {
            Avo.m4();
        }
    }

    public void Q3() {
        if (f46421e) {
            Avo.R3(Avo.ImportSource.DIGITAL_OCEAN);
        }
    }

    public void Q4() {
        if (f46421e) {
            Avo.a3(Avo.CreateTeamWizardStep.SUCCESS, Avo.Trial.YES);
        }
    }

    public void Q5(String str) {
        if (f46421e) {
            P5(str, str, Avo.TerminalThemeSource.APP_PREFERENCES);
        }
    }

    public void R0() {
        if (f46421e) {
            Avo.N2();
        }
    }

    public void R1() {
        if (f46421e) {
            N1(false, Avo.DowngradeButtonLocation.DOWNGRADE_FROM_PRO_SCREEN);
        }
    }

    public void R2() {
        if (f46421e) {
            Avo.n4();
        }
    }

    public void R3() {
        if (f46421e) {
            Avo.K3(Avo.Instruction.IMPORT);
        }
    }

    public void R4(Avo.SharingButtonLocation sharingButtonLocation, Avo.SharedEntity sharedEntity) {
        if (f46421e) {
            Avo.u5(sharingButtonLocation, sharedEntity);
        }
    }

    public void R5(String str, String str2) {
        if (f46421e) {
            P5(str, str2, Avo.TerminalThemeSource.GROUP_EDIT);
        }
    }

    public Avo.From S(int i10) {
        if (i10 == 105) {
            return Avo.From.SYNC;
        }
        if (i10 == 118) {
            return Avo.From.SERIAL;
        }
        if (i10 == 127) {
            return Avo.From.AI_COMMAND_GENERATOR;
        }
        if (i10 == 129) {
            return Avo.From.SESSION_LOGS;
        }
        if (i10 == 109) {
            return Avo.From.WELCOME_SCREEN;
        }
        if (i10 == 110) {
            return Avo.From.NAV_PANEL;
        }
        switch (i10) {
            case 100:
                return Avo.From.STARTUP_SNIPPET;
            case 101:
                return Avo.From.AGENT_FORWARDING;
            case 102:
                return Avo.From.HOST_CHAINING;
            case 103:
                return Avo.From.PROXY;
            default:
                switch (i10) {
                    case 120:
                        return Avo.From.IMPORT_HOSTS;
                    case 121:
                        return Avo.From.BACK_UP_AND_SYNC;
                    case 122:
                        return Avo.From.ACCOUNT;
                    default:
                        return null;
                }
        }
    }

    public void S0(Connection connection, String str, Integer num) {
        if (f46421e) {
            Map mapN = n(connection, str);
            Long hostId = connection.getHostId();
            HostDBModel itemByLocalId = hostId != null ? f.p().i().getItemByLocalId(hostId.longValue()) : null;
            SshRemoteConfigDBModel sshRemoteConfigDBModelC = C(hostId);
            Avo.Type typeT = T(connection, str, mapN);
            Avo.ParentGroup parentGroupD = D(itemByLocalId);
            Avo.Port portG = G(itemByLocalId, sshRemoteConfigDBModelC, connection);
            Avo.Charset charsetL = l(itemByLocalId, sshRemoteConfigDBModelC, connection);
            Avo.EnvironmentVariables environmentVariablesV = v(sshRemoteConfigDBModelC);
            Avo.Theme themeR = R(itemByLocalId, sshRemoteConfigDBModelC, connection);
            Avo.Mosh moshB = B(itemByLocalId, sshRemoteConfigDBModelC, connection);
            List listQ = q(sshRemoteConfigDBModelC, connection);
            Avo.Username usernameV = V(itemByLocalId, listQ, connection);
            Avo.Snippet snippetK = K(itemByLocalId, sshRemoteConfigDBModelC, connection, str);
            Avo.HostChain hostChainX = x((String) mapN.get("HostChain"));
            Avo.Proxy proxyH = H(sshRemoteConfigDBModelC, connection);
            Avo.AgentForwarding agentForwardingJ = j(sshRemoteConfigDBModelC, connection);
            Avo.AddressType addressTypeI = i((String) mapN.get("AddressType"));
            Avo.IsSharedEntity isSharedEntityJ = J((String) mapN.get("Shared"));
            Avo.IsSharedEntityOwner isSharedEntityOwnerZ = z((String) mapN.get("isOwner"));
            Avo.SEPKey sEPKeyI = I((String) mapN.get("SEPKEY"));
            String uuid = connection.getUUID();
            int iW = w(connection.getHostId());
            if (iW != 0 && hostChainX == Avo.HostChain.NO) {
                hostChainX = Avo.HostChain.INHERITED;
            }
            if (uuid == null) {
                y9.a.f86838a.i(new h1());
                uuid = "";
            }
            String str2 = uuid;
            Avo.FIDO2BasedKey fIDO2BasedKey = Avo.FIDO2BasedKey.NO;
            if (c0(connection) || connection.isFido2SshIdKeyUsed()) {
                fIDO2BasedKey = Avo.FIDO2BasedKey.YES;
            }
            Avo.FIDO2BasedKey fIDO2BasedKey2 = fIDO2BasedKey;
            Integer numT = t(itemByLocalId != null ? itemByLocalId.getVaultKeyId() : null);
            if (isSharedEntityJ == null || isSharedEntityOwnerZ == null) {
                return;
            }
            Avo.R2(typeT, hostChainX, proxyH, agentForwardingJ, addressTypeI, isSharedEntityJ, isSharedEntityOwnerZ, null, sEPKeyI, snippetK, str2, fIDO2BasedKey2, parentGroupD, portG, charsetL, environmentVariablesV, listQ, usernameV, themeR, moshB, Avo.WindowsHelloKey.NO, numT, Avo.FailureReason.CANCELED, null, iW, num.intValue());
        }
    }

    public void S1() {
        if (f46421e) {
            Avo.s3(Avo.Entity.SEPKEY, Avo.EditButtonOrigin.ENTITY_CELL);
        }
    }

    public void S2() {
        if (f46421e) {
            Avo.o4();
        }
    }

    public void S3() {
        if (f46421e) {
            Avo.R3(Avo.ImportSource.MOBA_X_TERM);
        }
    }

    public void S4() {
        if (f46421e) {
            Avo.u5(Avo.SharingButtonLocation.GROUP_EDIT_SCREEN, Avo.SharedEntity.GROUP);
        }
    }

    public void S5(String str, String str2) {
        if (f46421e) {
            P5(str, str2, Avo.TerminalThemeSource.HOST_EDIT);
        }
    }

    public void T0(int i10, String str, long j10) {
        if (f46421e) {
            if (str == null) {
                y9.a.f86838a.i(new h1());
                str = "";
            }
            Avo.O2(i10, str, Double.valueOf(j10 / ((double) f46425w)));
            b2.f52944a.M1().handleSuccessAnalyticsSending(str);
        }
    }

    public void T1() {
        if (f46421e) {
            Avo.s3(Avo.Entity.GROUP, Avo.EditButtonOrigin.CONTEXT_MENU);
        }
    }

    public void T2() {
        if (f46421e) {
            Avo.p4();
        }
    }

    public void T3() {
        if (f46421e) {
            Avo.R3(Avo.ImportSource.PU_TT_Y);
        }
    }

    public void T4() {
        if (f46421e) {
            Avo.u5(Avo.SharingButtonLocation.HOST_EDIT_SCREEN, Avo.SharedEntity.HOST);
        }
    }

    public void T5(String str, String str2) {
        if (f46421e) {
            P5(str, str2, Avo.TerminalThemeSource.TERMINAL);
        }
    }

    public void U0(Avo.RequestedConnectionProperty requestedConnectionProperty, String str) {
        if (f46421e) {
            if (str == null) {
                y9.a.f86838a.i(new h1());
                str = "";
            }
            Avo.P2(requestedConnectionProperty, str);
        }
    }

    public void U1() {
        if (f46421e) {
            Avo.s3(Avo.Entity.HOST, Avo.EditButtonOrigin.CONTEXT_MENU);
        }
    }

    public void U2() {
        if (f46421e) {
            Avo.q4();
        }
    }

    public void U3() {
        if (f46421e) {
            Avo.R3(Avo.ImportSource.SECURE_CR_T);
        }
    }

    public void U4() {
        if (f46421e) {
            Avo.u5(Avo.SharingButtonLocation.KEYCHAIN_EDIT_SCREEN, Avo.SharedEntity.IDENTITY);
        }
    }

    public void U5() {
        if (f46421e) {
            Avo.l3(Avo.URLScheme.TERMIUS);
        }
    }

    public void V0(Connection connection, String str) {
        if (f46421e) {
            Map mapN = n(connection, str);
            Long hostId = connection.getHostId();
            HostDBModel itemByLocalId = hostId != null ? f.p().i().getItemByLocalId(hostId.longValue()) : null;
            SshRemoteConfigDBModel sshRemoteConfigDBModelC = C(hostId);
            Avo.Type typeT = T(connection, str, mapN);
            Avo.ParentGroup parentGroupD = D(itemByLocalId);
            Avo.Port portG = G(itemByLocalId, sshRemoteConfigDBModelC, connection);
            Avo.Charset charsetL = l(itemByLocalId, sshRemoteConfigDBModelC, connection);
            Avo.EnvironmentVariables environmentVariablesV = v(sshRemoteConfigDBModelC);
            Avo.Theme themeR = R(itemByLocalId, sshRemoteConfigDBModelC, connection);
            Avo.Mosh moshB = B(itemByLocalId, sshRemoteConfigDBModelC, connection);
            List listQ = q(sshRemoteConfigDBModelC, connection);
            Avo.Username usernameV = V(itemByLocalId, listQ, connection);
            Avo.Snippet snippetK = K(itemByLocalId, sshRemoteConfigDBModelC, connection, str);
            Avo.HostChain hostChainX = x((String) mapN.get("HostChain"));
            Avo.Proxy proxyH = H(sshRemoteConfigDBModelC, connection);
            Avo.AgentForwarding agentForwardingJ = j(sshRemoteConfigDBModelC, connection);
            Avo.AddressType addressTypeI = i((String) mapN.get("AddressType"));
            Avo.IsSharedEntity isSharedEntityJ = J((String) mapN.get("Shared"));
            Avo.IsSharedEntityOwner isSharedEntityOwnerZ = z((String) mapN.get("isOwner"));
            Avo.SEPKey sEPKeyI = I((String) mapN.get("SEPKEY"));
            String uuid = connection.getUUID();
            int iW = w(connection.getHostId());
            if (iW != 0 && hostChainX == Avo.HostChain.NO) {
                hostChainX = Avo.HostChain.INHERITED;
            }
            if (uuid == null) {
                y9.a.f86838a.i(new h1());
                uuid = "";
            }
            String str2 = uuid;
            Avo.FIDO2BasedKey fIDO2BasedKey = Avo.FIDO2BasedKey.NO;
            if (c0(connection) || connection.isFido2SshIdKeyUsed()) {
                fIDO2BasedKey = Avo.FIDO2BasedKey.YES;
            }
            Avo.FIDO2BasedKey fIDO2BasedKey2 = fIDO2BasedKey;
            Integer numT = t(itemByLocalId != null ? itemByLocalId.getVaultKeyId() : null);
            Avo.IsSSHIdKey isSSHIdKeyA = A(connection);
            if (isSharedEntityJ == null || isSharedEntityOwnerZ == null) {
                return;
            }
            Avo.Q2(typeT, hostChainX, proxyH, agentForwardingJ, addressTypeI, isSharedEntityJ, isSharedEntityOwnerZ, null, sEPKeyI, snippetK, str2, fIDO2BasedKey2, parentGroupD, portG, charsetL, environmentVariablesV, listQ, usernameV, themeR, moshB, Avo.WindowsHelloKey.NO, numT, iW, isSSHIdKeyA);
        }
    }

    public void V1(boolean z10) {
        if (f46421e) {
            Avo.h5(Avo.SendKeyButtonLocation.EDIT_KEY_CONTEXT, z10 ? Avo.KeychainItem.BIOMETRIC_KEY : Avo.KeychainItem.SSH_KEY);
        }
    }

    public void V2(Long l10) {
        if (f46421e) {
            if (l10.longValue() == 0) {
                Avo.r4(Avo.MFAProviderType.TOTP);
            } else if (l10.longValue() == 1) {
                Avo.r4(Avo.MFAProviderType.AUTHY);
            }
        }
    }

    public void V3() {
        if (f46421e) {
            Avo.R3(Avo.ImportSource.SSH_CONFIG);
        }
    }

    public void V4() {
        if (f46421e) {
            Avo.u5(Avo.SharingButtonLocation.PORT_FORWARDING_EDIT_SCREEN, Avo.SharedEntity.PORT_FORWARDING);
        }
    }

    public void V5(int i10) {
        if (f46421e) {
            Avo.Y4(Avo.PromotionLocation.VAULT_TAB, Avo.PromotionType.WHATS_NEW, null, null, null, Integer.valueOf(i10));
        }
    }

    public void W0(Connection connection, String str, int i10, Integer num, Integer num2) {
        if (f46421e) {
            Map mapN = n(connection, str);
            Long hostId = connection.getHostId();
            HostDBModel itemByLocalId = hostId != null ? f.p().i().getItemByLocalId(hostId.longValue()) : null;
            SshRemoteConfigDBModel sshRemoteConfigDBModelC = C(hostId);
            Avo.Type typeT = T(connection, str, mapN);
            Avo.ParentGroup parentGroupD = D(itemByLocalId);
            Avo.Port portG = G(itemByLocalId, sshRemoteConfigDBModelC, connection);
            Avo.Charset charsetL = l(itemByLocalId, sshRemoteConfigDBModelC, connection);
            Avo.EnvironmentVariables environmentVariablesV = v(sshRemoteConfigDBModelC);
            Avo.Theme themeR = R(itemByLocalId, sshRemoteConfigDBModelC, connection);
            Avo.Mosh moshB = B(itemByLocalId, sshRemoteConfigDBModelC, connection);
            List listQ = q(sshRemoteConfigDBModelC, connection);
            Avo.Username usernameV = V(itemByLocalId, listQ, connection);
            Avo.Snippet snippetK = K(itemByLocalId, sshRemoteConfigDBModelC, connection, str);
            Avo.HostChain hostChainX = x((String) mapN.get("HostChain"));
            Avo.Proxy proxyH = H(sshRemoteConfigDBModelC, connection);
            Avo.AgentForwarding agentForwardingJ = j(sshRemoteConfigDBModelC, connection);
            Avo.AddressType addressTypeI = i((String) mapN.get("AddressType"));
            Avo.IsSharedEntity isSharedEntityJ = J((String) mapN.get("Shared"));
            Avo.IsSharedEntityOwner isSharedEntityOwnerZ = z((String) mapN.get("isOwner"));
            Avo.SEPKey sEPKeyI = I((String) mapN.get("SEPKEY"));
            Avo.FailureReason failureReason = Avo.FailureReason.UNKNOWN_ERROR;
            if (i10 == 1) {
                failureReason = Avo.FailureReason.NETWORK_ERROR;
            } else if (i10 == 2) {
                failureReason = Avo.FailureReason.CONNECTION_ERROR;
            }
            Avo.FailureReason failureReason2 = failureReason;
            String uuid = connection.getUUID();
            int iW = w(connection.getHostId());
            if (iW != 0 && hostChainX == Avo.HostChain.NO) {
                hostChainX = Avo.HostChain.INHERITED;
            }
            if (uuid == null) {
                y9.a.f86838a.i(new h1());
                uuid = "";
            }
            String str2 = uuid;
            Avo.FIDO2BasedKey fIDO2BasedKey = Avo.FIDO2BasedKey.NO;
            if (c0(connection) || connection.isFido2SshIdKeyUsed()) {
                fIDO2BasedKey = Avo.FIDO2BasedKey.YES;
            }
            Avo.FIDO2BasedKey fIDO2BasedKey2 = fIDO2BasedKey;
            Integer numT = t(itemByLocalId != null ? itemByLocalId.getVaultKeyId() : null);
            if (isSharedEntityJ == null || isSharedEntityOwnerZ == null) {
                return;
            }
            Avo.R2(typeT, hostChainX, proxyH, agentForwardingJ, addressTypeI, isSharedEntityJ, isSharedEntityOwnerZ, null, sEPKeyI, snippetK, str2, fIDO2BasedKey2, parentGroupD, portG, charsetL, environmentVariablesV, listQ, usernameV, themeR, moshB, Avo.WindowsHelloKey.NO, numT, failureReason2, num, iW, num2.intValue());
        }
    }

    public void W1(boolean z10) {
        if (f46421e) {
            Avo.h5(Avo.SendKeyButtonLocation.EDIT_KEY_SCREEN, z10 ? Avo.KeychainItem.BIOMETRIC_KEY : Avo.KeychainItem.SSH_KEY);
        }
    }

    public void W2() {
        if (f46421e) {
            Avo.s4();
        }
    }

    public void W3(String str, Avo.DeviceHadPasskeysBeforeUpload deviceHadPasskeysBeforeUpload) {
        if (f46421e) {
            Avo.e5(deviceHadPasskeysBeforeUpload, str);
        }
    }

    public void W4() {
        if (f46421e) {
            Avo.u5(Avo.SharingButtonLocation.SNIPPET_EDIT_SCREEN, Avo.SharedEntity.SNIPPET);
        }
    }

    public void W5() {
        if (f46421e) {
            Avo.a5(Avo.PromotionLocation.VAULT_TAB, Avo.PromotionType.WHATS_NEW);
        }
    }

    public void X0(Connection connection, String str) {
        if (f46421e) {
            Map mapN = n(connection, str);
            Long hostId = connection.getHostId();
            HostDBModel itemByLocalId = hostId != null ? f.p().i().getItemByLocalId(hostId.longValue()) : null;
            SshRemoteConfigDBModel sshRemoteConfigDBModelC = C(hostId);
            Avo.Type typeT = T(connection, str, mapN);
            Avo.ParentGroup parentGroupD = D(itemByLocalId);
            Avo.Port portG = G(itemByLocalId, sshRemoteConfigDBModelC, connection);
            Avo.Charset charsetL = l(itemByLocalId, sshRemoteConfigDBModelC, connection);
            Avo.EnvironmentVariables environmentVariablesV = v(sshRemoteConfigDBModelC);
            Avo.Theme themeR = R(itemByLocalId, sshRemoteConfigDBModelC, connection);
            Avo.Mosh moshB = B(itemByLocalId, sshRemoteConfigDBModelC, connection);
            List listQ = q(sshRemoteConfigDBModelC, connection);
            Avo.Username usernameV = V(itemByLocalId, listQ, connection);
            Avo.Snippet snippetK = K(itemByLocalId, sshRemoteConfigDBModelC, connection, str);
            Avo.HostChain hostChainX = x((String) mapN.get("HostChain"));
            Avo.Proxy proxyH = H(sshRemoteConfigDBModelC, connection);
            Avo.AgentForwarding agentForwardingJ = j(sshRemoteConfigDBModelC, connection);
            Avo.AddressType addressTypeI = i((String) mapN.get("AddressType"));
            Avo.IsSharedEntity isSharedEntityJ = J((String) mapN.get("Shared"));
            Avo.IsSharedEntityOwner isSharedEntityOwnerZ = z((String) mapN.get("isOwner"));
            Avo.SEPKey sEPKeyI = I((String) mapN.get("SEPKEY"));
            int iL = com.server.auditor.ssh.client.app.a.N().L();
            String uuid = connection.getUUID();
            if (w(connection.getHostId()) != 0 && hostChainX == Avo.HostChain.NO) {
                hostChainX = Avo.HostChain.INHERITED;
            }
            if (uuid == null) {
                y9.a.f86838a.i(new h1());
                uuid = "";
            }
            String str2 = uuid;
            Avo.FIDO2BasedKey fIDO2BasedKey = Avo.FIDO2BasedKey.NO;
            if (c0(connection) || connection.isFido2SshIdKeyUsed()) {
                fIDO2BasedKey = Avo.FIDO2BasedKey.YES;
            }
            Avo.FIDO2BasedKey fIDO2BasedKey2 = fIDO2BasedKey;
            Avo.CredentialsSharingMode credentialsSharingModeO = o(connection.getHostId());
            Integer numT = t(itemByLocalId != null ? itemByLocalId.getVaultKeyId() : null);
            Avo.ConnectionOrigin connectionOrigin = connection.getConnectionOrigin();
            if (isSharedEntityJ == null || isSharedEntityOwnerZ == null) {
                return;
            }
            Avo.S2(typeT, hostChainX, proxyH, agentForwardingJ, addressTypeI, isSharedEntityJ, isSharedEntityOwnerZ, null, sEPKeyI, snippetK, str2, fIDO2BasedKey2, parentGroupD, portG, charsetL, environmentVariablesV, listQ, usernameV, themeR, moshB, Avo.WindowsHelloKey.NO, numT, connectionOrigin, iL, credentialsSharingModeO);
        }
    }

    public void X1() {
        if (f46421e) {
            Avo.s3(Avo.Entity.SNIPPET, Avo.EditButtonOrigin.CONTEXT_MENU);
        }
    }

    public void X2(String str) {
        if (f46421e) {
            Avo.j4(Avo.MagicButtonOrigin.TRY_AGAIN, str);
        }
    }

    public void X3(boolean z10, String str, boolean z11) {
        Avo.Edited edited = z10 ? Avo.Edited.YES : Avo.Edited.NO;
        Avo.AiCommandExecutedBy aiCommandExecutedBy = z11 ? Avo.AiCommandExecutedBy.ENTER : Avo.AiCommandExecutedBy.BUTTON;
        if (f46421e) {
            Avo.f5(edited, str, aiCommandExecutedBy, Avo.CommandActionType.RUN);
        }
    }

    public void X4() {
        if (f46421e) {
            Avo.u5(Avo.SharingButtonLocation.SNIPPET_PACKAGE_EDIT_SCREEN, Avo.SharedEntity.SNIPPET_PACKAGE);
        }
    }

    public void X5() {
        Avo.Source sourceM;
        if (!f46421e || (sourceM = M(L())) == null) {
            return;
        }
        Avo.Z5(sourceM, null);
        q0();
    }

    public void Y0(Connection connection, boolean z10) {
        if (f46421e) {
            String strE = e(connection, z10);
            Map mapN = n(connection, strE);
            Long hostId = connection.getHostId();
            HostDBModel itemByLocalId = hostId != null ? f.p().i().getItemByLocalId(hostId.longValue()) : null;
            SshRemoteConfigDBModel sshRemoteConfigDBModelC = C(hostId);
            Avo.Type typeT = T(connection, strE, mapN);
            Avo.ParentGroup parentGroupD = D(itemByLocalId);
            Avo.Port portG = G(itemByLocalId, sshRemoteConfigDBModelC, connection);
            Avo.Charset charsetL = l(itemByLocalId, sshRemoteConfigDBModelC, connection);
            Avo.EnvironmentVariables environmentVariablesV = v(sshRemoteConfigDBModelC);
            Avo.Theme themeR = R(itemByLocalId, sshRemoteConfigDBModelC, connection);
            Avo.Mosh moshB = B(itemByLocalId, sshRemoteConfigDBModelC, connection);
            List listQ = q(sshRemoteConfigDBModelC, connection);
            Avo.Username usernameV = V(itemByLocalId, listQ, connection);
            Avo.Snippet snippetK = K(itemByLocalId, sshRemoteConfigDBModelC, connection, strE);
            Avo.HostChain hostChainX = x((String) mapN.get("HostChain"));
            Avo.Proxy proxyH = H(sshRemoteConfigDBModelC, connection);
            Avo.AgentForwarding agentForwardingJ = j(sshRemoteConfigDBModelC, connection);
            Avo.AddressType addressTypeI = i((String) mapN.get("AddressType"));
            Avo.IsSharedEntity isSharedEntityJ = J((String) mapN.get("Shared"));
            Avo.IsSharedEntityOwner isSharedEntityOwnerZ = z((String) mapN.get("isOwner"));
            Avo.SEPKey sEPKeyI = I((String) mapN.get("SEPKEY"));
            int iL = com.server.auditor.ssh.client.app.a.N().L();
            String uuid = connection.getUUID();
            if (w(connection.getHostId()) != 0 && hostChainX == Avo.HostChain.NO) {
                hostChainX = Avo.HostChain.INHERITED;
            }
            if (uuid == null) {
                y9.a.f86838a.i(new h1());
                uuid = "";
            }
            String str = uuid;
            Avo.FIDO2BasedKey fIDO2BasedKey = Avo.FIDO2BasedKey.NO;
            if (c0(connection) || connection.isFido2SshIdKeyUsed()) {
                fIDO2BasedKey = Avo.FIDO2BasedKey.YES;
            }
            Avo.FIDO2BasedKey fIDO2BasedKey2 = fIDO2BasedKey;
            Avo.CredentialsSharingMode credentialsSharingModeO = o(connection.getHostId());
            Avo.ConnectionOrigin connectionOrigin = connection.getConnectionOrigin();
            Integer numT = t(itemByLocalId != null ? itemByLocalId.getVaultKeyId() : null);
            if (isSharedEntityJ == null || isSharedEntityOwnerZ == null) {
                return;
            }
            Avo.S2(typeT, hostChainX, proxyH, agentForwardingJ, addressTypeI, isSharedEntityJ, isSharedEntityOwnerZ, null, sEPKeyI, snippetK, str, fIDO2BasedKey2, parentGroupD, portG, charsetL, environmentVariablesV, listQ, usernameV, themeR, moshB, Avo.WindowsHelloKey.NO, numT, connectionOrigin, iL, credentialsSharingModeO);
        }
    }

    public void Y1() {
        if (f46421e) {
            Avo.s3(Avo.Entity.PRIVATE_KEY, Avo.EditButtonOrigin.ENTITY_CELL);
        }
    }

    public void Y2(String str) {
        if (f46421e) {
            if (str == null) {
                y9.a.f86838a.i(new h1());
                str = "";
            }
            Avo.j4(Avo.MagicButtonOrigin.KEYBOARD_ADDMINUSON, str);
        }
    }

    public void Y3() {
        if (f46421e) {
            Avo.q5();
        }
    }

    public void Y4() {
        if (f46421e) {
            Avo.u5(Avo.SharingButtonLocation.KEYCHAIN_EDIT_SCREEN, Avo.SharedEntity.SSH_KEY);
        }
    }

    public void Y5() {
        if (f46421e) {
            Avo.a6();
        }
    }

    public void Z0(String str) {
        U0(Avo.RequestedConnectionProperty.KEY, str);
    }

    public void Z1() {
        if (f46421e) {
            Avo.u3();
        }
    }

    public void Z2() {
        if (f46421e) {
            Avo.t4();
        }
    }

    public void Z3() {
        if (f46421e) {
            Avo.r5();
        }
    }

    public void Z4(Avo.CredentialsSharingMode credentialsSharingMode, String str) {
        if (f46421e) {
            Avo.c3(credentialsSharingMode, str);
        }
    }

    public void Z5(String str, Avo.From from, Avo.AuthMethod authMethod, boolean z10, String str2) {
        if (f46421e) {
            com.server.auditor.ssh.client.app.a.N().M().edit().putString("key_current_plan_type", "Trial").apply();
            Avo.Source sourceM = M(L());
            if (sourceM == null || from == null) {
                return;
            }
            b0();
            h0(N(com.server.auditor.ssh.client.app.a.N().Z()));
            if (f46422f == null) {
                f46422f = UUID.randomUUID().toString();
            }
            Avo.b6(str, from, sourceM, authMethod, z10 ? Avo.IntroductoryOffer.YES : Avo.IntroductoryOffer.NO, null, null, f46422f, str2);
        }
    }

    public void a0(String str) {
        if (f46421e) {
            Avo.gm.b(str);
        }
    }

    public void a1(String str) {
        U0(Avo.RequestedConnectionProperty.KEYBOARD_INTERACTIVE, str);
    }

    public void a2() {
        if (f46421e) {
            Avo.v3();
        }
    }

    public void a3(List list, int i10) {
        if (f46421e) {
            Avo.u4(list, i10);
        }
    }

    public void a4(Avo.SFTPTransferType sFTPTransferType) {
        if (f46421e) {
            Avo.s5(sFTPTransferType);
        }
    }

    public void a5(int i10, int i11) {
        if (f46421e) {
            v6();
            Avo.v5(i10, i11);
        }
    }

    public void a6(boolean z10) {
        if (f46421e) {
            Avo.c6(z10 ? Avo.KeychainItem.SSH_CERTIFICATE : Avo.KeychainItem.SSH_KEY);
        }
    }

    public void b0() {
        if (f46421e) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("Plan", com.server.auditor.ssh.client.app.a.N().Z());
            } catch (JSONException e10) {
                y9.a.f86838a.i(e10);
            }
            Avo.gm.a().D(jSONObject);
        }
    }

    public void b1(String str) {
        U0(Avo.RequestedConnectionProperty.PASSPHRASE, str);
    }

    public void b2() {
        if (f46421e) {
            Avo.w3();
        }
    }

    public void b3() {
        if (f46421e) {
            Avo.Z4(Avo.PromotionLocation.LOGS_SETTINGS, Avo.PromotionType.STORE_MORE_LOGS);
        }
    }

    public void b4(Avo.SFTPOnboardingSlideName sFTPOnboardingSlideName, Avo.SFTPSOnboardingSource sFTPSOnboardingSource) {
        if (f46421e) {
            Avo.t5(sFTPOnboardingSlideName, sFTPSOnboardingSource);
        }
    }

    public void b5() {
        if (f46421e) {
            Avo.e4(Avo.LoginType.LOGIN);
        }
    }

    public void b6() {
        if (f46421e) {
            Avo.I2(Avo.BuyNowButtonLocation.GRACE_PERIOD_NOTIFICATION, Avo.ProductID.TEAM, null, null);
        }
    }

    public void c1(String str) {
        U0(Avo.RequestedConnectionProperty.PASSWORD, str);
    }

    public void c2() {
        if (f46421e) {
            Avo.x3();
        }
    }

    public void c3(Avo.Auto auto) {
        if (f46421e) {
            Avo.F2(Avo.BellNotificationAction.NEW_ENCRYPTION, auto, null);
        }
    }

    public void c4(Avo.OnScreen onScreen) {
        if (!f46421e || onScreen == null) {
            return;
        }
        Avo.g5(onScreen);
    }

    public void c5(Avo.AuthMethod authMethod) {
        if (f46421e) {
            Avo.A3(authMethod);
        }
    }

    public void c6(Avo.UpgradeButtonLocation upgradeButtonLocation) {
        if (f46421e) {
            Avo.d6(upgradeButtonLocation, P());
        }
    }

    public void d1(String str) {
        U0(Avo.RequestedConnectionProperty.PORT, str);
    }

    public void d2(Avo.EncryptionMigrationWizardStep encryptionMigrationWizardStep) {
        if (f46421e) {
            Avo.y3(encryptionMigrationWizardStep);
        }
    }

    public void d3() {
        if (f46421e) {
            Avo.J4(Avo.BellNotificationAction.NEW_ENCRYPTION, null);
        }
    }

    public void d4(int i10) {
        if (f46421e) {
            Avo.V3(i10);
        }
    }

    public void d5(int i10) {
        if (f46421e) {
            Avo.CreateAccountScreenType createAccountScreenType = Avo.CreateAccountScreenType.WELCOME_SCREEN;
            if (i10 == 127) {
                createAccountScreenType = Avo.CreateAccountScreenType.TEXT_TO_COMMAND_WITH_AI;
            }
            Avo.X2(createAccountScreenType, f46422f);
        }
    }

    public void d6(Avo.From from, boolean z10) {
        if (f46421e) {
            f46422f = UUID.randomUUID().toString();
            Avo.e6(f46422f, z10 ? Avo.Trial.NO : Avo.Trial.YES, from);
        }
    }

    public void e0(Integer num) {
        if (f46421e) {
            com.server.auditor.ssh.client.app.a.N().X0(Avo.Plan.FREE.toString());
            b0();
            h0(Avo.SystemPlan.FREE);
            Avo.i6();
            j0();
            i0();
            Avo.IsHardwareKeyStorageAvailable isHardwareKeyStorageAvailable = Avo.IsHardwareKeyStorageAvailable.NO;
            if (com.server.auditor.ssh.client.app.a.N().M().getBoolean("is_hardware_key_storage_available", false)) {
                isHardwareKeyStorageAvailable = Avo.IsHardwareKeyStorageAvailable.YES;
            }
            if (num != null) {
                Avo.m5(num.toString());
            }
            Avo.C(Avo.FirstTime.NO, isHardwareKeyStorageAvailable);
        }
    }

    public void e1(String str) {
        U0(Avo.RequestedConnectionProperty.PROTOCOL, str);
    }

    public void e2(Avo.AuthMethod authMethod) {
        if (f46421e) {
            Avo.z3(authMethod);
        }
    }

    public void e3() {
        if (f46421e) {
            Avo.v4();
        }
    }

    public void e4(Avo.SendingOption sendingOption) {
        if (f46421e) {
            Avo.i5(sendingOption);
        }
    }

    public void e5(SnippetSourceOrigin snippetSourceOrigin, boolean z10, Long l10, int i10, String str) {
        if (f46421e) {
            int i11 = C0660a.f46430b[snippetSourceOrigin.ordinal()];
            Avo.SnippetSource snippetSource = i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? i11 != 5 ? null : Avo.SnippetSource.TERMINAL_HISTORY : Avo.SnippetSource.SNIPPETS_PANEL : Avo.SnippetSource.SNIPPETS_SCREEN : Avo.SnippetSource.AUTOCOMPLETE : Avo.SnippetSource.STARTUP;
            if (snippetSource != null) {
                Avo.IsSharedEntityOwner isSharedEntityOwner = Avo.IsSharedEntityOwner.NO;
                if (com.server.auditor.ssh.client.app.a.N().j()) {
                    isSharedEntityOwner = Avo.IsSharedEntityOwner.YES;
                }
                Avo.IsSharedEntityOwner isSharedEntityOwner2 = isSharedEntityOwner;
                Avo.IsSharedEntity isSharedEntity = Avo.IsSharedEntity.NO;
                if (z10) {
                    isSharedEntity = Avo.IsSharedEntity.YES;
                }
                Avo.IsSharedEntity isSharedEntity2 = isSharedEntity;
                int iIntValue = f46424v.intValue();
                if (l10 != null) {
                    iIntValue = l10.intValue();
                }
                Avo.w5(snippetSource, isSharedEntity2, isSharedEntityOwner2, Integer.valueOf(iIntValue), i10, str);
            }
        }
    }

    public void e6() {
        if (f46421e) {
            Avo.f6();
        }
    }

    public void f1(String str) {
        U0(Avo.RequestedConnectionProperty.USERNAME, str);
    }

    public void f2() {
        if (f46421e) {
            Avo.U2(Q());
        }
    }

    public void f3(boolean z10, boolean z11, boolean z12, boolean z13) {
        if (f46421e) {
            Avo.IsSharedEntity isSharedEntity = z10 ? Avo.IsSharedEntity.YES : Avo.IsSharedEntity.NO;
            Avo.EventTeamRole eventTeamRole = z11 ? Avo.EventTeamRole.OWNER : z12 ? Avo.EventTeamRole.EDITOR : z13 ? Avo.EventTeamRole.MEMBER : null;
            v6();
            Avo.w4(eventTeamRole, isSharedEntity);
        }
    }

    public void f4() {
        if (f46421e) {
            Avo.k5();
        }
    }

    public void f5(Avo.PackageOrigin packageOrigin, Avo.IsSharedEntity isSharedEntity) {
        if (f46421e) {
            Avo.x5(packageOrigin, f.p().J().getItemsCountWhichNotDeleted(), isSharedEntity);
        }
    }

    public void f6(String str, UserPlanModel userPlanModel, Avo.AuthMethod authMethod) {
        if (f46421e) {
            String planType = userPlanModel == null ? WelcomeFlowViewModel.planTypeFree : userPlanModel.getPlanType();
            Avo.SystemPlan systemPlanN = N(planType);
            Integer userId = userPlanModel == null ? null : userPlanModel.getUserId();
            String string = userId == null ? "" : userId.toString();
            b0();
            h0(systemPlanN);
            Avo.g6(string, str, F(planType), authMethod);
            q0();
        }
    }

    public void g1() {
        if (f46421e) {
            Avo.T2();
        }
    }

    public void g2() {
        if (f46421e) {
            Avo.X3();
        }
    }

    public void g3(Avo.HostCreationOrigin hostCreationOrigin) {
        if (f46421e) {
            Avo.y4(hostCreationOrigin);
        }
    }

    public void g4() {
        if (f46421e) {
            Avo.j5(null);
        }
    }

    public void g5(SnippetPackageDBModel snippetPackageDBModel) {
        if (f46421e) {
            int idInDatabase = (int) snippetPackageDBModel.getIdInDatabase();
            Avo.IsSharedEntity isSharedEntity = Avo.IsSharedEntity.NO;
            if (snippetPackageDBModel.isShared()) {
                isSharedEntity = Avo.IsSharedEntity.YES;
            }
            int itemsCountWhichNotDeleted = f.p().J().getItemsCountWhichNotDeleted();
            v6();
            Avo.y5(isSharedEntity, itemsCountWhichNotDeleted, idInDatabase);
        }
    }

    public void g6(String str) {
        if (f46421e) {
            Avo.h6(str, Avo.OnScreen.LOG_IN);
        }
    }

    public void h1() {
        if (f46421e) {
            Avo.V2();
        }
    }

    public void h2() {
        if (f46421e) {
            Avo.B3();
        }
    }

    public void h3(boolean z10, boolean z11, boolean z12, boolean z13, Avo.HostCreationOrigin hostCreationOrigin, Avo.HostCreationMethod hostCreationMethod) {
        if (f46421e) {
            Avo.IsSharedEntity isSharedEntity = z10 ? Avo.IsSharedEntity.YES : Avo.IsSharedEntity.NO;
            Avo.EventTeamRole eventTeamRole = z11 ? Avo.EventTeamRole.OWNER : z12 ? Avo.EventTeamRole.EDITOR : z13 ? Avo.EventTeamRole.MEMBER : null;
            v6();
            Avo.z4(isSharedEntity, eventTeamRole, hostCreationMethod, hostCreationOrigin);
        }
    }

    public void h4(Long l10, boolean z10) {
        if (f46421e) {
            j4(l10, Avo.LogBookmarkState.ENABLED, z10);
        }
    }

    public void h5(String str, int i10) {
        if (f46421e) {
            if (str == null) {
                Avo.z5("-1", Integer.valueOf(i10));
            } else {
                Avo.z5(str, Integer.valueOf(i10));
            }
        }
    }

    public void h6(Avo.KeychainItem keychainItem) {
        if (f46421e) {
            Avo.j6(keychainItem);
        }
    }

    public void i0() {
        if (f46421e) {
            Avo.gm.a().F("Enterprise", new ArrayList(0));
        }
    }

    public void i1() {
        if (f46421e) {
            Avo.A(Avo.Native.YES);
        }
    }

    public void i2() {
        if (f46421e) {
            Avo.L5(Avo.ExpiredScreenType.ENTERPRISE);
        }
    }

    public void i3(boolean z10) {
        if (f46421e) {
            Avo.A4(z10 ? Avo.NewKeyLocation.KEY_PICKER : Avo.NewKeyLocation.KEYCHAIN);
        }
    }

    public void i4(Long l10, boolean z10) {
        if (f46421e) {
            j4(l10, Avo.LogBookmarkState.DISABLED, z10);
        }
    }

    public void i5(String str, int i10, SnippetSourceOrigin snippetSourceOrigin) {
        if (f46421e) {
            int i11 = C0660a.f46430b[snippetSourceOrigin.ordinal()];
            Avo.SnippetSource snippetSource = i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? i11 != 5 ? null : Avo.SnippetSource.TERMINAL_HISTORY : Avo.SnippetSource.SNIPPETS_PANEL : Avo.SnippetSource.SNIPPETS_SCREEN : Avo.SnippetSource.AUTOCOMPLETE : Avo.SnippetSource.STARTUP;
            if (snippetSource != null) {
                Avo.A5(i10, str, snippetSource);
            }
        }
    }

    public void i6() {
        if (f46421e) {
            Avo.k6();
        }
    }

    public void j0() {
        if (f46421e) {
            Avo.gm.a().F("Team", new ArrayList(0));
        }
    }

    public void j1() {
        if (f46421e) {
            Avo.X2(Avo.CreateAccountScreenType.FEATURE_DESCRIPTION_SCREEN, f46422f);
        }
    }

    public void j2() {
        if (f46421e) {
            r5(ExpiredSubscriptionScreenType.ExpiredTeamMember.INSTANCE);
        }
    }

    public void j3(Avo.AddKeyOption addKeyOption, String str, Avo.NewKeyLocation newKeyLocation, Avo.KeychainItem keychainItem) {
        if (f46421e) {
            Avo.B4(addKeyOption, str, newKeyLocation, keychainItem);
        }
    }

    public void j5() {
        if (f46421e) {
            Avo.B5();
        }
    }

    public void j6(int i10, boolean z10) {
        if (f46421e) {
            Avo.l6(i10, z10 ? Avo.PersonalVaultSelected.YES : Avo.PersonalVaultSelected.NO);
        }
    }

    public Avo.AuthMethod k(AuthenticationModel authenticationModel) {
        if (authenticationModel instanceof EmailAuthentication) {
            return Avo.AuthMethod.EMAIL;
        }
        if (authenticationModel instanceof EnterpriseSingleSignOnAuthentication) {
            return Avo.AuthMethod.WORKOS_SSO;
        }
        if (authenticationModel instanceof AppleSingleSignOnAuthentication) {
            return Avo.AuthMethod.APPLE_AUTH;
        }
        if (authenticationModel instanceof GoogleSingleSignOnAuthentication) {
            return Avo.AuthMethod.GOOGLE_AUTH;
        }
        return null;
    }

    public void k0(String str) {
        if (f46421e) {
            Avo.y(Avo.AIRequestType.COMMAND, str);
        }
    }

    public void k1() {
        if (f46421e) {
            Avo.Y2();
        }
    }

    public void k2() {
        if (f46421e) {
            Avo.I2(Avo.BuyNowButtonLocation.EXPIRED_SUBSCRIPTION_SCREEN, Avo.ProductID.TEAM, null, null);
        }
    }

    public void k3(int i10) {
        if (f46421e) {
            Avo.D4(i10 != 1 ? i10 != 2 ? Avo.PortForwardingType.LOCAL : Avo.PortForwardingType.DYNAMIC : Avo.PortForwardingType.REMOTE);
        }
    }

    public void k4(Long l10, boolean z10) {
        if (f46421e) {
            j4(l10, Avo.LogBookmarkState.UPDATED, z10);
        }
    }

    public void k5() {
        if (f46421e) {
            Avo.D5();
        }
    }

    public void k6() {
        if (f46421e) {
            Avo.Z4(Avo.PromotionLocation.LOGS, Avo.PromotionType.BACK_UP_LOGS_WITH_ACCOUNT);
        }
    }

    public void l0(String str) {
        if (f46421e) {
            Avo.z(Avo.AIRequestType.COMMAND, str);
        }
    }

    public void l1(Avo.CreatePortForwardingWizardStep createPortForwardingWizardStep, Avo.PortForwardingType portForwardingType) {
        if (f46421e) {
            Avo.Z2(createPortForwardingWizardStep, portForwardingType);
        }
    }

    public void l2() {
        if (f46421e) {
            r5(ExpiredSubscriptionScreenType.ExpiredTeamOwner.INSTANCE);
        }
    }

    public void l3() {
        if (f46421e) {
            Avo.E4();
        }
    }

    public void l4() {
        if (f46421e) {
            Avo.C5(Avo.SortBy.BOOKMARK, Avo.OnScreen.LOGS);
        }
    }

    public void l5(String str, Avo.SSHidPasskeyActionType sSHidPasskeyActionType, String str2) {
        if (f46421e) {
            Avo.E5(g(str), sSHidPasskeyActionType, str2);
        }
    }

    public void l6() {
        if (f46421e) {
            Avo.Z4(Avo.PromotionLocation.LOGS, Avo.PromotionType.DOWNLOAD_DESKTOP);
        }
    }

    public void m0() {
        if (f46421e) {
            Avo.w();
        }
    }

    public void m1() {
        if (f46421e) {
            Avo.a3(Avo.CreateTeamWizardStep.INVITE_MEMBERS, Avo.Trial.YES);
        }
    }

    public void m2() {
        if (f46421e) {
            Avo.D3();
        }
    }

    public void m3(int i10, int i11, String str, boolean z10, int i12) {
        if (f46421e) {
            Avo.IsSharedEntity isSharedEntity = Avo.IsSharedEntity.NO;
            if (z10) {
                isSharedEntity = Avo.IsSharedEntity.YES;
            }
            int length = str.length();
            int length2 = str.split("\n").length;
            v6();
            Avo.F4(i10, isSharedEntity, i11, length, length2, i12);
        }
    }

    public void m4() {
        if (f46421e) {
            Avo.C5(Avo.SortBy.DATE, Avo.OnScreen.LOGS);
        }
    }

    public void m5(String str, String str2) {
        if (f46421e) {
            Avo.F5(f(str), g(str2));
        }
    }

    public void m6(boolean z10) {
        if (f46421e) {
            if (z10) {
                Avo.a5(Avo.PromotionLocation.LOGS, Avo.PromotionType.DOWNLOAD_DESKTOP);
            } else {
                Avo.a5(Avo.PromotionLocation.LOGS, Avo.PromotionType.BACK_UP_LOGS_WITH_ACCOUNT);
            }
        }
    }

    public void n0() {
        if (f46421e) {
            Avo.p3();
        }
    }

    public void n1() {
        if (f46421e) {
            Avo.a3(Avo.CreateTeamWizardStep.INVITE_MEMBERS, Avo.Trial.YES);
        }
    }

    public void n2() {
        if (f46421e) {
            Avo.E3();
        }
    }

    public void n3() {
        if (f46421e) {
            Avo.G4();
        }
    }

    public void n4() {
        if (f46421e) {
            Avo.Y4(Avo.PromotionLocation.LOGS, Avo.PromotionType.AUDITMINUSREADY_WITH_LOGS, null, null, null, null);
        }
    }

    public void n5(String str) {
        if (f46421e) {
            Avo.G5(str);
        }
    }

    public void n6() {
        if (f46421e) {
            Avo.W2(Avo.Instruction.INSTALL);
        }
    }

    public void o0(Avo.KeychainItem keychainItem, Avo.NewKeyLocation newKeyLocation) {
        if (f46421e) {
            Avo.c4(keychainItem, newKeyLocation);
        }
    }

    public void o1() {
        if (f46421e) {
            Avo.a3(Avo.CreateTeamWizardStep.DESCRIPTION_INVITE_PEOPLE, Avo.Trial.YES);
        }
    }

    public void o2(Avo.From from, boolean z10) {
        if (f46421e) {
            Avo.F3(from, null, f46422f, z10 ? Avo.Trial.NO : Avo.Trial.YES);
        }
    }

    public void o3(Avo.NewVaultSource newVaultSource) {
        if (f46421e) {
            Avo.H4(newVaultSource);
        }
    }

    public void o4() {
        if (f46421e) {
            Avo.Z4(Avo.PromotionLocation.LOGS, Avo.PromotionType.AUDITMINUSREADY_WITH_LOGS);
        }
    }

    public void o5(String str) {
        if (f46421e) {
            Avo.H5(str);
        }
    }

    public void o6() {
        if (f46421e) {
            Avo.K3(Avo.Instruction.INSTALL);
        }
    }

    public void p0(String str) {
        if (f46421e) {
            if (str == null) {
                Avo.x("-1");
            } else {
                Avo.x(str);
            }
        }
    }

    public void p1() {
        if (f46421e) {
            Avo.a3(Avo.CreateTeamWizardStep.SUCCESS, Avo.Trial.YES);
        }
    }

    public void p2(String str) {
        if (f46421e) {
            Avo.H3(str);
        }
    }

    public void p3() {
        if (f46421e) {
            Avo.I4();
        }
    }

    public void p4() {
        if (f46421e) {
            Avo.a5(Avo.PromotionLocation.LOGS, Avo.PromotionType.AUDITMINUSREADY_WITH_LOGS);
        }
    }

    public void p5(String str, Avo.SSHidSetUpStep sSHidSetUpStep, String str2) {
        if (f46421e) {
            Avo.I5(str, sSHidSetUpStep, str2);
        }
    }

    public void p6(boolean z10) {
        if (f46421e) {
            Avo.o6(z10 ? Avo.IsNewUser.YES : Avo.IsNewUser.NO);
        }
    }

    public void q0() {
        if (f46421e) {
            int remoteOnlyItemsCountWhichNotDeleted = f.p().i().getRemoteOnlyItemsCountWhichNotDeleted();
            int itemsCountWhichNotDeleted = f.p().h().getItemsCountWhichNotDeleted();
            int size = f.p().O().getAllPackageItems().size();
            int itemsCountWhichNotDeleted2 = f.p().J().getItemsCountWhichNotDeleted();
            int itemsCountWhichNotDeleted3 = f.p().W().getItemsCountWhichNotDeleted();
            int itemsCountWhichNotDeleted4 = f.p().Q().getItemsCountWhichNotDeleted();
            int visibleItemsCountWhichNotDeleted = f.p().n().getVisibleItemsCountWhichNotDeleted();
            int itemsCountWhichNotDeleted5 = f.p().z().getItemsCountWhichNotDeleted();
            int iL = com.server.auditor.ssh.client.app.a.N().L();
            int itemsCountWhichNotDeleted6 = f.p().r().getItemsCountWhichNotDeleted();
            String string = !TextUtils.isEmpty(this.f46426a.getString("TEAM_INFO_OWNER", "")) ? this.f46426a.getString("TEAM_INFO_OWNER", "") : null;
            Avo.SyncKeyPasswords syncKeyPasswords = Avo.SyncKeyPasswords.NO;
            if (this.f46426a.getBoolean("use_sync_keys_and_passwords", true)) {
                syncKeyPasswords = Avo.SyncKeyPasswords.YES;
            }
            Avo.HardwareKeyboard hardwareKeyboard = Avo.HardwareKeyboard.NO;
            if (xl.a.b(TermiusApplication.F())) {
                hardwareKeyboard = Avo.HardwareKeyboard.YES;
            }
            Avo.B(itemsCountWhichNotDeleted, itemsCountWhichNotDeleted3, visibleItemsCountWhichNotDeleted, itemsCountWhichNotDeleted5, iL, itemsCountWhichNotDeleted6, syncKeyPasswords, string, null, hardwareKeyboard, m(com.server.auditor.ssh.client.app.a.N().F()), itemsCountWhichNotDeleted2, remoteOnlyItemsCountWhichNotDeleted, size, s(), r(), itemsCountWhichNotDeleted4, String.valueOf(g.f67073b.a(new c1().k(TermiusApplication.F())).j()), com.server.auditor.ssh.client.app.a.N().M().getString("recent_used_input_method", ""));
        }
    }

    public void q1(String str, boolean z10, boolean z11) {
        Avo.CredentialsSharingMode credentialsSharingMode;
        if (f46421e) {
            str.getClass();
            switch (str) {
                case "credentials_sharing":
                    credentialsSharingMode = Avo.CredentialsSharingMode.CREDENTIALS;
                    break;
                case "no_credentials_sharing":
                    credentialsSharingMode = Avo.CredentialsSharingMode.NO_CREDENTIALS;
                    break;
                case "multikey":
                    credentialsSharingMode = Avo.CredentialsSharingMode.MULTI_KEY;
                    break;
                default:
                    credentialsSharingMode = null;
                    break;
            }
            Avo.SharingModeEntity sharingModeEntity = (z10 && z11) ? Avo.SharingModeEntity.ROOT_GROUP : z10 ? Avo.SharingModeEntity.CHILD_GROUP : z11 ? Avo.SharingModeEntity.HOST_WITHOUT_GROUP : Avo.SharingModeEntity.HOST_INSIDE_GROUP;
            if (credentialsSharingMode != null) {
                Avo.b3(credentialsSharingMode, sharingModeEntity);
            }
        }
    }

    public void q2(String str) {
        if (f46421e) {
            Avo.x4(Avo.FIDO2BasedKey.YES, Avo.KeySource.GENERATED, str, null);
        }
    }

    public void q3() {
        if (f46421e) {
            Avo.L4(Avo.OneTimePasswordPasteOrigin.KEYBOARD_INTERACTIVE);
        }
    }

    public void q4() {
        if (f46421e) {
            Avo.Y4(Avo.PromotionLocation.LOGS, Avo.PromotionType.TROUBLESHOOTING_IN_TEAM_WITH_LOGS, null, null, null, null);
        }
    }

    public void q5() {
        if (f46421e) {
            Avo.J5();
        }
    }

    public void q6() {
        Avo.Source sourceM;
        if (!f46421e || (sourceM = M(L())) == null) {
            return;
        }
        Avo.p6(sourceM);
    }

    public void r0(Avo.FirstTime firstTime, Avo.IsHardwareKeyStorageAvailable isHardwareKeyStorageAvailable) {
        if (f46421e) {
            Avo.C(firstTime, isHardwareKeyStorageAvailable);
        }
    }

    public void r1(Avo.CredentialsSharingMode credentialsSharingMode, String str) {
        if (f46421e) {
            Avo.c3(credentialsSharingMode, str);
        }
    }

    public void r2(String str) {
        if (f46421e) {
            Avo.G3(str);
        }
    }

    public void r3(Avo.Entity entity) {
        if (f46421e) {
            Avo.t3(entity);
        }
    }

    public void r4() {
        if (f46421e) {
            Avo.Z4(Avo.PromotionLocation.LOGS, Avo.PromotionType.TROUBLESHOOTING_IN_TEAM_WITH_LOGS);
        }
    }

    public void r5(ExpiredSubscriptionScreenType expiredSubscriptionScreenType) {
        Avo.ExpiredScreenType expiredScreenType;
        if (f46421e) {
            if (expiredSubscriptionScreenType instanceof ExpiredSubscriptionScreenType.ExpiredProTrial) {
                expiredScreenType = Avo.ExpiredScreenType.TRIAL;
            } else if (expiredSubscriptionScreenType instanceof ExpiredSubscriptionScreenType.ExpiredProPaid) {
                expiredScreenType = Avo.ExpiredScreenType.PREMIUM;
            } else if (expiredSubscriptionScreenType instanceof ExpiredSubscriptionScreenType.ExpiredTeamOwner) {
                expiredScreenType = Avo.ExpiredScreenType.TEAM_OWNER;
            } else if (expiredSubscriptionScreenType instanceof ExpiredSubscriptionScreenType.ExpiredTeamMember) {
                expiredScreenType = Avo.ExpiredScreenType.TEAM_MEMBER;
            } else if (expiredSubscriptionScreenType instanceof ExpiredSubscriptionScreenType.ExpiredGitHubStudent) {
                expiredScreenType = Avo.ExpiredScreenType.GITHUB_STUDENT;
            } else if (expiredSubscriptionScreenType instanceof ExpiredSubscriptionScreenType.ExpiredGitHubTeacher) {
                expiredScreenType = Avo.ExpiredScreenType.GITHUB_TEACHER;
            } else if (expiredSubscriptionScreenType instanceof ExpiredSubscriptionScreenType.ExpiredTrialTeamOwner) {
                ExpiredSubscriptionScreenType.ExpiredTrialTeamOwner expiredTrialTeamOwner = (ExpiredSubscriptionScreenType.ExpiredTrialTeamOwner) expiredSubscriptionScreenType;
                expiredScreenType = (expiredTrialTeamOwner.getHasMembers() || expiredTrialTeamOwner.getHasSharedGroups()) ? Avo.ExpiredScreenType.TRIAL_TEAM_OWNER : Avo.ExpiredScreenType.TRIAL_TEAM_OWNER_WITHOUT_MEMBERS_AND_SHARED_GROUPS;
            } else {
                if (!(expiredSubscriptionScreenType instanceof ExpiredSubscriptionScreenType.ExpiredProPaidAndTrialTeamOwner)) {
                    return;
                }
                ExpiredSubscriptionScreenType.ExpiredProPaidAndTrialTeamOwner expiredProPaidAndTrialTeamOwner = (ExpiredSubscriptionScreenType.ExpiredProPaidAndTrialTeamOwner) expiredSubscriptionScreenType;
                expiredScreenType = (expiredProPaidAndTrialTeamOwner.getHasMembers() || expiredProPaidAndTrialTeamOwner.getHasSharedGroups()) ? Avo.ExpiredScreenType.SUBSCRIBED_TRIAL_TEAM_OWNER : Avo.ExpiredScreenType.SUBSCRIBED_TRIAL_TEAM_OWNER_WITHOUT_MEMBERS_AND_SHARED_GROUPS;
            }
            Avo.L5(expiredScreenType);
        }
    }

    public void r6() {
        if (f46421e) {
            Avo.CreateAccountScreenType createAccountScreenType = Avo.CreateAccountScreenType.WELCOME_SCREEN;
            String string = UUID.randomUUID().toString();
            f46422f = string;
            Avo.X2(createAccountScreenType, string);
        }
    }

    public void s0(boolean z10, Integer num, Integer num2) {
        if (f46421e) {
            Avo.Success success = Avo.Success.NO;
            if (z10) {
                success = Avo.Success.YES;
            }
            Avo.B2(success, num, num2, Avo.SuggestionSource.HISTORY);
        }
    }

    public void s1(String str) {
        if (f46421e) {
            Avo.d3(str);
        }
    }

    public void s2(String str) {
        if (f46421e) {
            Avo.x4(Avo.FIDO2BasedKey.YES, Avo.KeySource.IMPORTED, str, null);
        }
    }

    public void s3(Avo.Leaked leaked) {
        if (f46421e) {
            Avo.M4(leaked);
        }
    }

    public void s4() {
        if (f46421e) {
            Avo.a5(Avo.PromotionLocation.LOGS, Avo.PromotionType.TROUBLESHOOTING_IN_TEAM_WITH_LOGS);
        }
    }

    public void s5() {
        if (f46421e) {
            Avo.f3();
        }
    }

    public void s6() {
        if (f46421e) {
            Avo.n6();
        }
    }

    public void t0(boolean z10, Integer num, Integer num2) {
        if (f46421e) {
            Avo.Success success = Avo.Success.NO;
            if (z10) {
                success = Avo.Success.YES;
            }
            Avo.B2(success, num, num2, Avo.SuggestionSource.SNIPPET);
        }
    }

    public void t1(Avo.Action action, Avo.Entity entity, Integer num, int i10) {
        if (f46421e) {
            if (entity != null) {
                Avo.e3(action, entity, num, i10);
            } else {
                y9.a.f86838a.i(new NullPointerException("Can't send the \"Crypto Error\" event. Entity is null"));
            }
        }
    }

    public void t2(String str) {
        if (f46421e) {
            Avo.B4(Avo.AddKeyOption.FIDO2_GENERATE, str, Avo.NewKeyLocation.KEYCHAIN, Avo.KeychainItem.SSH_KEY);
        }
    }

    public void t3() {
        if (f46421e) {
            Avo.N4();
        }
    }

    public void t4() {
        if (f46421e) {
            Avo.Y4(Avo.PromotionLocation.LOGS, Avo.PromotionType.KEEP_LOGS_IN_SYNC_WITH_PRO, null, null, null, null);
        }
    }

    public void t5() {
        if (f46421e) {
            Avo.I2(Avo.BuyNowButtonLocation.TEAM_DEACTIVATION_SCREEN, Avo.ProductID.PREMIUM, null, null);
        }
    }

    public void t6(int i10) {
        if (f46421e) {
            Avo.gm.a().I("Enterprise", Integer.valueOf(i10));
        }
    }

    public void u0() {
        if (f46421e) {
            Avo.W2(Avo.Instruction.BACKUP_AND_SYNC);
        }
    }

    public void u1(boolean z10) {
        if (f46421e) {
            Avo.IOSExperimentVariant iOSExperimentVariant = Avo.IOSExperimentVariant.BASELINE;
            if (z10) {
                iOSExperimentVariant = Avo.IOSExperimentVariant.RATE_US_BANNER;
            }
            Avo.C3(Avo.ExperimentName.RATE_US_V4, null, null, null, null, null, null, null, null, null, iOSExperimentVariant);
        }
    }

    public void u2(String str) {
        if (f46421e) {
            Avo.x4(Avo.FIDO2BasedKey.YES, Avo.KeySource.PASTED, str, null);
        }
    }

    public void u3(boolean z10, String str) {
        Avo.Edited edited = z10 ? Avo.Edited.YES : Avo.Edited.NO;
        if (f46421e) {
            Avo.f5(edited, str, Avo.AiCommandExecutedBy.BUTTON, Avo.CommandActionType.PASTE);
        }
    }

    public void u4() {
        if (f46421e) {
            Avo.Z4(Avo.PromotionLocation.LOGS, Avo.PromotionType.KEEP_LOGS_IN_SYNC_WITH_PRO);
        }
    }

    public void u5() {
        if (f46421e) {
            Avo.I2(Avo.BuyNowButtonLocation.TRIAL_EXTENSION_OFFER_SCREEN, Avo.ProductID.PREMIUM, null, null);
        }
    }

    public void u6(int i10) {
        if (f46421e) {
            Avo.gm.a().I("Team", Integer.valueOf(i10));
        }
    }

    public void v0() {
        if (f46421e) {
            Avo.r3();
        }
    }

    public void v1() {
        if (f46421e) {
            Avo.g3();
        }
    }

    public void v2(String str, int i10, Avo.AllDevicesHaveBiometry allDevicesHaveBiometry) {
        if (f46421e) {
            Avo.I3(str, i10, allDevicesHaveBiometry);
        }
    }

    public void v3() {
        if (f46421e) {
            Avo.O4();
        }
    }

    public void v4() {
        if (f46421e) {
            Avo.a5(Avo.PromotionLocation.LOGS, Avo.PromotionType.KEEP_LOGS_IN_SYNC_WITH_PRO);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v5(int r3, java.lang.String r4) {
        /*
            r2 = this;
            boolean r0 = com.server.auditor.ssh.client.utils.analytics.a.f46421e
            if (r0 == 0) goto L3f
            if (r4 == 0) goto L11
            java.lang.String r0 = "User does not have permission to create shared data."
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L11
            com.server.auditor.ssh.client.utils.analytics.Avo$FailReason r4 = com.server.auditor.ssh.client.utils.analytics.Avo.FailReason.TEAM_MEMBER_DOESNT_HAVE_ENOUGH_PERMISSIONS
            goto L3c
        L11:
            if (r4 == 0) goto L1e
            java.lang.String r0 = "Backend API isn't available - can't fetch user info for sync"
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L1e
            com.server.auditor.ssh.client.utils.analytics.Avo$FailReason r4 = com.server.auditor.ssh.client.utils.analytics.Avo.FailReason.BACKEND_API_ISNT_AVAILABLE_MINUS_CANT_FETCH_USER_INFO_FOR_SYNC
            goto L3c
        L1e:
            if (r4 == 0) goto L2b
            java.lang.String r0 = "Network Error"
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L2b
            com.server.auditor.ssh.client.utils.analytics.Avo$FailReason r4 = com.server.auditor.ssh.client.utils.analytics.Avo.FailReason.NETWORK_ERROR
            goto L3c
        L2b:
            if (r4 == 0) goto L3b
            com.server.auditor.ssh.client.utils.analytics.Avo$FailReason r0 = com.server.auditor.ssh.client.utils.analytics.Avo.FailReason.SERIALIZATION_ERROR
            java.lang.String r1 = r0.toString()
            boolean r4 = r4.contains(r1)
            if (r4 == 0) goto L3b
            r4 = r0
            goto L3c
        L3b:
            r4 = 0
        L3c:
            com.server.auditor.ssh.client.utils.analytics.Avo.O5(r3, r4)
        L3f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.utils.analytics.a.v5(int, java.lang.String):void");
    }

    public void v6() {
        if (f46421e) {
            f fVarP = f.p();
            b0.f47897a.e().size();
            List<HostDBModel> itemListWhichNotDeleted = fVarP.i().getItemListWhichNotDeleted();
            List<GroupDBModel> itemListWhichNotDeleted2 = fVarP.h().getItemListWhichNotDeleted();
            List<SnippetDBModel> itemListWhichNotDeleted3 = fVarP.J().getItemListWhichNotDeleted();
            List<SnippetPackageDBModel> itemListWhichNotDeleted4 = fVarP.O().getItemListWhichNotDeleted();
            List<RuleDBModel> itemListWhichNotDeleted5 = fVarP.z().getItemListWhichNotDeleted();
            ArrayList arrayList = new ArrayList();
            for (HostDBModel hostDBModel : itemListWhichNotDeleted) {
                if (hostDBModel.getLocalConfigId() == null) {
                    arrayList.add(hostDBModel);
                }
            }
            Iterator it = arrayList.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                if (((HostDBModel) it.next()).isShared()) {
                    i10++;
                }
            }
            Iterator<GroupDBModel> it2 = itemListWhichNotDeleted2.iterator();
            int i11 = 0;
            while (it2.hasNext()) {
                if (it2.next().isShared()) {
                    i11++;
                }
            }
            Iterator<SnippetDBModel> it3 = itemListWhichNotDeleted3.iterator();
            int i12 = 0;
            while (it3.hasNext()) {
                if (it3.next().isShared()) {
                    i12++;
                }
            }
            int size = arrayList.size();
            int size2 = itemListWhichNotDeleted2.size();
            int size3 = itemListWhichNotDeleted3.size();
            int size4 = itemListWhichNotDeleted4.size();
            int iC = b0.f47897a.c();
            int size5 = itemListWhichNotDeleted5.size();
            Integer numI = b2.f52944a.Q1().i();
            String strA = new up.b(new up.a(com.server.auditor.ssh.client.app.a.N().M())).a();
            SharedPreferences.Editor editorEdit = this.f46426a.edit();
            editorEdit.putInt("ANALYTICS_HOST_COUNT", size);
            editorEdit.putInt("ANALYTICS_SNIPPETS_COUNT", size3);
            editorEdit.putInt("ANALYTICS_GROUPS_COUNT", size2);
            editorEdit.putInt("ANALYTICS_SHARED_HOSTS_COUNT", i10);
            editorEdit.putInt("ANALYTICS_SHARED_GROUPS_COUNT", i11);
            editorEdit.putInt("ANALYTICS_SHARED_SNIPPETS_COUNT", i12);
            editorEdit.putInt("ANALYTICS_SHARED_SNIPPET_PACKAGES_COUNT", 0);
            editorEdit.putInt("ANALYTICS_PACKAGES_COUNT", size4);
            editorEdit.putInt("ANALYTICS_SHARED_VAULTS_COUNT", iC);
            editorEdit.putInt("ANALYTICS_PORT_FORWARDING_RULES_COUNT", size5);
            if (numI != null) {
                editorEdit.putInt("ANALYTICS_ONLINE_USERS_COUNT", numI.intValue());
            }
            editorEdit.apply();
            Avo.n5(null, null, null, null, Integer.valueOf(size), Integer.valueOf(size3), Integer.valueOf(size2), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), 0, Integer.valueOf(size4), Integer.valueOf(iC), Integer.valueOf(size5), numI, Avo.Platform.ANDROID, strA, O());
        }
    }

    int w(Long l10) {
        ChainingHost chainingHostC;
        if (l10 == null || (chainingHostC = this.f46427b.c(l10.longValue(), false)) == null) {
            return 0;
        }
        return chainingHostC.getHostList().size();
    }

    public void w0(boolean z10) {
        if (f46421e) {
            Avo.E2(z10 ? Avo.SyncKeysAndPasswordsOption.ENABLED : Avo.SyncKeysAndPasswordsOption.DISABLED, z10 ? Avo.SyncKeyPasswords.YES : Avo.SyncKeyPasswords.NO);
        }
    }

    public void w2() {
        if (f46421e) {
            Avo.Q3(Avo.ImportButtonLocation.HOSTS);
        }
    }

    public void w3() {
        if (f46421e) {
            int iF0 = f0();
            Avo.IsBiometryEnabled isBiometryEnabledG0 = g0();
            Avo.IsPinEnabled isPinEnabled = Avo.IsPinEnabled.NO;
            if (Y() || Z() || X()) {
                isPinEnabled = Avo.IsPinEnabled.YES;
            }
            Avo.P4(isPinEnabled, iF0, isBiometryEnabledG0);
        }
    }

    public void w4() {
        if (f46421e) {
            Avo.Z4(Avo.PromotionLocation.LOGS, Avo.PromotionType.HIGHMINUSVOLUME_UNSYNCED_LOGS);
        }
    }

    public void w5() {
        if (f46421e) {
            Avo.P5();
        }
    }

    public void x0() {
        if (f46421e) {
            Avo.D2(Avo.BackUpButtonLocation.NAVIGATION_BAR);
        }
    }

    public void x1(int i10) {
        if (f46421e) {
            w1(i10, Avo.CESurveyResult.DISMISSED, null);
        }
    }

    public void x2(String str) {
        if (f46421e) {
            if (f46422f == null) {
                f46422f = str;
            }
            Avo.F3(Avo.From.AI_COMMAND_GENERATOR, Avo.Feature.TEXT_TO_COMMAND_WITH_AI, f46422f, Avo.Trial.YES);
        }
    }

    public void x3() {
        if (f46421e) {
            Avo.Q4(f0(), g0());
        }
    }

    public void x4(l2 l2Var, boolean z10, String str) {
        if (f46421e) {
            Avo.g4(sp.a.f(l2Var) ? Avo.VaultType.PERSONAL : sp.a.g(l2Var) ? Avo.VaultType.TEAM : Avo.VaultType.SHARED, z10 ? Avo.LogsRetentionPolicy.ENABLED : Avo.LogsRetentionPolicy.DISABLED, str);
        }
    }

    public void x5() {
        if (f46421e) {
            Avo.S5();
        }
    }

    public void y0() {
        if (f46421e) {
            Avo.K3(Avo.Instruction.BACKUP_AND_SYNC);
        }
    }

    public void y1(int i10, String str) {
        if (f46421e) {
            w1(i10, Avo.CESurveyResult.FEEDBACK, str);
        }
    }

    public void y2() {
        if (f46421e) {
            Avo.M5();
        }
    }

    public void y3() {
        if (f46421e) {
            Avo.R4(Avo.PortForwardingFormType.FORM);
        }
    }

    public void y4() {
        if (f46421e) {
            Avo.h4();
        }
    }

    public void y5() {
        if (f46421e) {
            Avo.G2();
        }
    }

    public void z0(String str, boolean z10) {
        if (f46421e) {
            Avo.W5(z10 ? Avo.OpenedFrom.CHOOSE_PLAN_SCREEN : Avo.OpenedFrom.EXPIRED_SUBSCRIPTION_SCREEN, str, Avo.TeamTrialPlan.BUSINESS);
        }
    }

    public void z1(int i10) {
        if (f46421e) {
            w1(i10, Avo.CESurveyResult.REVIEW, null);
        }
    }

    public void z2() {
        if (f46421e) {
            Avo.N5();
        }
    }

    public void z3(String str, Avo.PortForwardingLinkResolution portForwardingLinkResolution) {
        if (f46421e) {
            Avo.S4(str, portForwardingLinkResolution);
        }
    }

    public void z4() {
        if (f46421e) {
            Avo.a5(Avo.PromotionLocation.LOGS, Avo.PromotionType.HIGHMINUSVOLUME_UNSYNCED_LOGS);
        }
    }

    public void z5(Boolean bool, String str) {
        if (f46421e) {
            if (bool.booleanValue()) {
                Avo.W5(Avo.OpenedFrom.INVITE_PEOPLE_BUTTON, str, Avo.TeamTrialPlan.TEAM);
            } else {
                Avo.V4(Avo.PresenceIconLocation.WHOS_IN_TERMIUS_SCREEN);
            }
        }
    }
}
