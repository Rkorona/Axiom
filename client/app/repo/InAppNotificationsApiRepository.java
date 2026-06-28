package com.server.auditor.ssh.client.app.repo;

import androidx.appcompat.widget.RtlSpacingHelper;
import com.crystalnix.termius.libtermius.sftp.File;
import com.server.auditor.ssh.client.app.repo.InAppNotificationsApiRepository;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.models.h;
import com.server.auditor.ssh.client.models.l;
import com.server.auditor.ssh.client.models.w;
import com.server.auditor.ssh.client.models.y;
import com.server.auditor.ssh.client.models.z;
import com.server.auditor.ssh.client.synchronization.api.models.CommonApiErrorResponse;
import com.server.auditor.ssh.client.synchronization.retrofit.SyncRestApiClientFactory;
import com.server.auditor.ssh.client.synchronization.retrofit.SyncRestInterface;
import hg.b2;
import hv.e0;
import hv.o;
import hv.p;
import io.split.android.client.dtos.SerializableEvent;
import java.util.List;
import ju.k;
import ju.t;
import jv.f;
import kotlin.coroutines.jvm.internal.m;
import kv.e;
import lv.d2;
import lv.i;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.w0;
import lv.x2;
import ut.m0;
import ut.n;
import ut.r;
import ut.s;
import ut.x;
import wu.g0;
import wu.i0;

/* JADX INFO: loaded from: classes2.dex */
public final class InAppNotificationsApiRepository {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f21448c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f21449d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SyncRestApiClientFactory f21450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g0 f21451b;

    @p
    public static final class InAppMessageAttributes {
        public static final int $stable = 0;
        public static final b Companion = new b(null);

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final int f21452id;
        private final String userFullName;
        private final String username;

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f21453a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f21454b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f21453a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.app.repo.InAppNotificationsApiRepository.InAppMessageAttributes", aVar, 3);
                i2Var.r("user_pk", true);
                i2Var.r("user_email", true);
                i2Var.r("full_name", true);
                descriptor = i2Var;
                f21454b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InAppMessageAttributes deserialize(e eVar) {
                int iE;
                int i10;
                String str;
                String str2;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                if (cVarD.l()) {
                    iE = cVarD.e(fVar, 0);
                    String strB = cVarD.B(fVar, 1);
                    str2 = (String) cVarD.v(fVar, 2, x2.f64817a, null);
                    str = strB;
                    i10 = 7;
                } else {
                    boolean z10 = true;
                    iE = 0;
                    String strB2 = null;
                    String str3 = null;
                    int i11 = 0;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else if (iD == 0) {
                            iE = cVarD.e(fVar, 0);
                            i11 |= 1;
                        } else if (iD == 1) {
                            strB2 = cVarD.B(fVar, 1);
                            i11 |= 2;
                        } else {
                            if (iD != 2) {
                                throw new e0(iD);
                            }
                            str3 = (String) cVarD.v(fVar, 2, x2.f64817a, str3);
                            i11 |= 4;
                        }
                    }
                    i10 = i11;
                    str = strB2;
                    str2 = str3;
                }
                int i12 = iE;
                cVarD.b(fVar);
                return new InAppMessageAttributes(i10, i12, str, str2, (s2) null);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, InAppMessageAttributes inAppMessageAttributes) {
                t.f(fVar, "encoder");
                t.f(inAppMessageAttributes, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                kv.d dVarD = fVar.d(fVar2);
                InAppMessageAttributes.write$Self$Termius_app_googleProductionRelease(inAppMessageAttributes, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final hv.c[] childSerializers() {
                x2 x2Var = x2.f64817a;
                return new hv.c[]{w0.f64808a, x2Var, iv.a.u(x2Var)};
            }

            @Override // hv.c, hv.r, hv.b
            public final f getDescriptor() {
                return descriptor;
            }

            @Override // lv.n0
            public hv.c[] typeParametersSerializers() {
                return n0.a.a(this);
            }
        }

        public static final class b {
            private b() {
            }

            public final hv.c serializer() {
                return a.f21453a;
            }

            public /* synthetic */ b(k kVar) {
                this();
            }
        }

        public InAppMessageAttributes() {
            this(0, (String) null, (String) null, 7, (k) null);
        }

        public static /* synthetic */ InAppMessageAttributes copy$default(InAppMessageAttributes inAppMessageAttributes, int i10, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = inAppMessageAttributes.f21452id;
            }
            if ((i11 & 2) != 0) {
                str = inAppMessageAttributes.username;
            }
            if ((i11 & 4) != 0) {
                str2 = inAppMessageAttributes.userFullName;
            }
            return inAppMessageAttributes.copy(i10, str, str2);
        }

        @o("user_pk")
        public static /* synthetic */ void getId$annotations() {
        }

        @o("full_name")
        public static /* synthetic */ void getUserFullName$annotations() {
        }

        @o("user_email")
        public static /* synthetic */ void getUsername$annotations() {
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(InAppMessageAttributes inAppMessageAttributes, kv.d dVar, f fVar) {
            if (dVar.E(fVar, 0) || inAppMessageAttributes.f21452id != -1) {
                dVar.t(fVar, 0, inAppMessageAttributes.f21452id);
            }
            if (dVar.E(fVar, 1) || !t.b(inAppMessageAttributes.username, "")) {
                dVar.f(fVar, 1, inAppMessageAttributes.username);
            }
            if (!dVar.E(fVar, 2) && t.b(inAppMessageAttributes.userFullName, "")) {
                return;
            }
            dVar.v(fVar, 2, x2.f64817a, inAppMessageAttributes.userFullName);
        }

        public final int component1() {
            return this.f21452id;
        }

        public final String component2() {
            return this.username;
        }

        public final String component3() {
            return this.userFullName;
        }

        public final InAppMessageAttributes copy(int i10, String str, String str2) {
            t.f(str, "username");
            return new InAppMessageAttributes(i10, str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InAppMessageAttributes)) {
                return false;
            }
            InAppMessageAttributes inAppMessageAttributes = (InAppMessageAttributes) obj;
            return this.f21452id == inAppMessageAttributes.f21452id && t.b(this.username, inAppMessageAttributes.username) && t.b(this.userFullName, inAppMessageAttributes.userFullName);
        }

        public final int getId() {
            return this.f21452id;
        }

        public final String getUserFullName() {
            return this.userFullName;
        }

        public final String getUsername() {
            return this.username;
        }

        public int hashCode() {
            int iHashCode = ((Integer.hashCode(this.f21452id) * 31) + this.username.hashCode()) * 31;
            String str = this.userFullName;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "InAppMessageAttributes(id=" + this.f21452id + ", username=" + this.username + ", userFullName=" + this.userFullName + ")";
        }

        public /* synthetic */ InAppMessageAttributes(int i10, int i11, String str, String str2, s2 s2Var) {
            this.f21452id = (i10 & 1) == 0 ? -1 : i11;
            if ((i10 & 2) == 0) {
                this.username = "";
            } else {
                this.username = str;
            }
            if ((i10 & 4) == 0) {
                this.userFullName = "";
            } else {
                this.userFullName = str2;
            }
        }

        public InAppMessageAttributes(int i10, String str, String str2) {
            t.f(str, "username");
            this.f21452id = i10;
            this.username = str;
            this.userFullName = str2;
        }

        public /* synthetic */ InAppMessageAttributes(int i10, String str, String str2, int i11, k kVar) {
            this((i11 & 1) != 0 ? -1 : i10, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? "" : str2);
        }
    }

    @p
    public static final class InAppMessageData {
        public static final int $stable = 0;
        public static final b Companion = new b(null);
        private final String action;
        private final InAppMessageAttributes attributes;
        private final String body;
        private final String buttonName;
        private final String createdAt;
        private final boolean forceToDoAction;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final int f21455id;
        private final boolean isDismissible;
        private final boolean isSeen;
        private final String title;
        private final String type;

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f21456a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f21457b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f21456a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.app.repo.InAppNotificationsApiRepository.InAppMessageData", aVar, 11);
                i2Var.r("action", false);
                i2Var.r("body", false);
                i2Var.r("button_name", true);
                i2Var.r(Column.CREATED_AT, false);
                i2Var.r("message_attributes", true);
                i2Var.r("force_to_do_action", false);
                i2Var.r("id", false);
                i2Var.r("is_dismissible", false);
                i2Var.r("is_seen", false);
                i2Var.r("title", false);
                i2Var.r(Column.TYPE, true);
                descriptor = i2Var;
                f21457b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InAppMessageData deserialize(e eVar) {
                boolean z10;
                String str;
                InAppMessageAttributes inAppMessageAttributes;
                String str2;
                int i10;
                boolean z11;
                boolean z12;
                String str3;
                String str4;
                String str5;
                String str6;
                char c10;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                int i11 = 10;
                int i12 = 9;
                int i13 = 0;
                if (cVarD.l()) {
                    String strB = cVarD.B(fVar, 0);
                    String strB2 = cVarD.B(fVar, 1);
                    x2 x2Var = x2.f64817a;
                    String str7 = (String) cVarD.v(fVar, 2, x2Var, null);
                    String strB3 = cVarD.B(fVar, 3);
                    InAppMessageAttributes inAppMessageAttributes2 = (InAppMessageAttributes) cVarD.v(fVar, 4, InAppMessageAttributes.a.f21453a, null);
                    boolean zH = cVarD.H(fVar, 5);
                    int iE = cVarD.e(fVar, 6);
                    boolean zH2 = cVarD.H(fVar, 7);
                    boolean zH3 = cVarD.H(fVar, 8);
                    String strB4 = cVarD.B(fVar, 9);
                    String str8 = (String) cVarD.v(fVar, 10, x2Var, null);
                    i13 = 2047;
                    str3 = strB;
                    str = str8;
                    str6 = strB4;
                    z10 = zH2;
                    i10 = iE;
                    z11 = zH;
                    str5 = strB3;
                    z12 = zH3;
                    inAppMessageAttributes = inAppMessageAttributes2;
                    str2 = str7;
                    str4 = strB2;
                } else {
                    boolean z13 = true;
                    boolean zH4 = false;
                    boolean zH5 = false;
                    boolean zH6 = false;
                    String str9 = null;
                    InAppMessageAttributes inAppMessageAttributes3 = null;
                    String str10 = null;
                    String strB5 = null;
                    String strB6 = null;
                    String strB7 = null;
                    String strB8 = null;
                    int iE2 = 0;
                    while (z13) {
                        int iD = cVarD.D(fVar);
                        switch (iD) {
                            case -1:
                                z13 = false;
                                i11 = 10;
                                break;
                            case 0:
                                strB5 = cVarD.B(fVar, 0);
                                i13 |= 1;
                                i11 = 10;
                                i12 = 9;
                                break;
                            case 1:
                                strB6 = cVarD.B(fVar, 1);
                                i13 |= 2;
                                i11 = 10;
                                i12 = 9;
                                break;
                            case 2:
                                str10 = (String) cVarD.v(fVar, 2, x2.f64817a, str10);
                                i13 |= 4;
                                i11 = 10;
                                i12 = 9;
                                break;
                            case 3:
                                c10 = 4;
                                strB7 = cVarD.B(fVar, 3);
                                i13 |= 8;
                                i11 = 10;
                                break;
                            case 4:
                                c10 = 4;
                                inAppMessageAttributes3 = (InAppMessageAttributes) cVarD.v(fVar, 4, InAppMessageAttributes.a.f21453a, inAppMessageAttributes3);
                                i13 |= 16;
                                i11 = 10;
                                break;
                            case 5:
                                zH5 = cVarD.H(fVar, 5);
                                i13 |= 32;
                                break;
                            case 6:
                                iE2 = cVarD.e(fVar, 6);
                                i13 |= 64;
                                break;
                            case 7:
                                zH4 = cVarD.H(fVar, 7);
                                i13 |= 128;
                                break;
                            case 8:
                                zH6 = cVarD.H(fVar, 8);
                                i13 |= 256;
                                break;
                            case 9:
                                strB8 = cVarD.B(fVar, i12);
                                i13 |= File.FLAG_O_TRUNC;
                                break;
                            case 10:
                                str9 = (String) cVarD.v(fVar, i11, x2.f64817a, str9);
                                i13 |= File.FLAG_O_APPEND;
                                break;
                            default:
                                throw new e0(iD);
                        }
                    }
                    z10 = zH4;
                    str = str9;
                    inAppMessageAttributes = inAppMessageAttributes3;
                    str2 = str10;
                    i10 = iE2;
                    z11 = zH5;
                    z12 = zH6;
                    str3 = strB5;
                    str4 = strB6;
                    str5 = strB7;
                    str6 = strB8;
                }
                int i14 = i13;
                cVarD.b(fVar);
                return new InAppMessageData(i14, str3, str4, str2, str5, inAppMessageAttributes, z11, i10, z10, z12, str6, str, (s2) null);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, InAppMessageData inAppMessageData) {
                t.f(fVar, "encoder");
                t.f(inAppMessageData, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                kv.d dVarD = fVar.d(fVar2);
                InAppMessageData.write$Self$Termius_app_googleProductionRelease(inAppMessageData, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final hv.c[] childSerializers() {
                x2 x2Var = x2.f64817a;
                hv.c cVarU = iv.a.u(x2Var);
                hv.c cVarU2 = iv.a.u(InAppMessageAttributes.a.f21453a);
                hv.c cVarU3 = iv.a.u(x2Var);
                i iVar = i.f64704a;
                return new hv.c[]{x2Var, x2Var, cVarU, x2Var, cVarU2, iVar, w0.f64808a, iVar, iVar, x2Var, cVarU3};
            }

            @Override // hv.c, hv.r, hv.b
            public final f getDescriptor() {
                return descriptor;
            }

            @Override // lv.n0
            public hv.c[] typeParametersSerializers() {
                return n0.a.a(this);
            }
        }

        public static final class b {
            private b() {
            }

            public final hv.c serializer() {
                return a.f21456a;
            }

            public /* synthetic */ b(k kVar) {
                this();
            }
        }

        public /* synthetic */ InAppMessageData(int i10, String str, String str2, String str3, String str4, InAppMessageAttributes inAppMessageAttributes, boolean z10, int i11, boolean z11, boolean z12, String str5, String str6, s2 s2Var) {
            if (1003 != (i10 & 1003)) {
                d2.a(i10, 1003, a.f21456a.getDescriptor());
            }
            this.action = str;
            this.body = str2;
            if ((i10 & 4) == 0) {
                this.buttonName = null;
            } else {
                this.buttonName = str3;
            }
            this.createdAt = str4;
            if ((i10 & 16) == 0) {
                this.attributes = null;
            } else {
                this.attributes = inAppMessageAttributes;
            }
            this.forceToDoAction = z10;
            this.f21455id = i11;
            this.isDismissible = z11;
            this.isSeen = z12;
            this.title = str5;
            if ((i10 & File.FLAG_O_APPEND) == 0) {
                this.type = null;
            } else {
                this.type = str6;
            }
        }

        public static /* synthetic */ InAppMessageData copy$default(InAppMessageData inAppMessageData, String str, String str2, String str3, String str4, InAppMessageAttributes inAppMessageAttributes, boolean z10, int i10, boolean z11, boolean z12, String str5, String str6, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = inAppMessageData.action;
            }
            if ((i11 & 2) != 0) {
                str2 = inAppMessageData.body;
            }
            if ((i11 & 4) != 0) {
                str3 = inAppMessageData.buttonName;
            }
            if ((i11 & 8) != 0) {
                str4 = inAppMessageData.createdAt;
            }
            if ((i11 & 16) != 0) {
                inAppMessageAttributes = inAppMessageData.attributes;
            }
            if ((i11 & 32) != 0) {
                z10 = inAppMessageData.forceToDoAction;
            }
            if ((i11 & 64) != 0) {
                i10 = inAppMessageData.f21455id;
            }
            if ((i11 & 128) != 0) {
                z11 = inAppMessageData.isDismissible;
            }
            if ((i11 & 256) != 0) {
                z12 = inAppMessageData.isSeen;
            }
            if ((i11 & File.FLAG_O_TRUNC) != 0) {
                str5 = inAppMessageData.title;
            }
            if ((i11 & File.FLAG_O_APPEND) != 0) {
                str6 = inAppMessageData.type;
            }
            String str7 = str5;
            String str8 = str6;
            boolean z13 = z11;
            boolean z14 = z12;
            boolean z15 = z10;
            int i12 = i10;
            InAppMessageAttributes inAppMessageAttributes2 = inAppMessageAttributes;
            String str9 = str3;
            return inAppMessageData.copy(str, str2, str9, str4, inAppMessageAttributes2, z15, i12, z13, z14, str7, str8);
        }

        @o("action")
        public static /* synthetic */ void getAction$annotations() {
        }

        @o("message_attributes")
        public static /* synthetic */ void getAttributes$annotations() {
        }

        @o("body")
        public static /* synthetic */ void getBody$annotations() {
        }

        @o("button_name")
        public static /* synthetic */ void getButtonName$annotations() {
        }

        @o(Column.CREATED_AT)
        public static /* synthetic */ void getCreatedAt$annotations() {
        }

        @o("force_to_do_action")
        public static /* synthetic */ void getForceToDoAction$annotations() {
        }

        @o("id")
        public static /* synthetic */ void getId$annotations() {
        }

        @o("title")
        public static /* synthetic */ void getTitle$annotations() {
        }

        @o(Column.TYPE)
        public static /* synthetic */ void getType$annotations() {
        }

        @o("is_dismissible")
        public static /* synthetic */ void isDismissible$annotations() {
        }

        @o("is_seen")
        public static /* synthetic */ void isSeen$annotations() {
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(InAppMessageData inAppMessageData, kv.d dVar, f fVar) {
            dVar.f(fVar, 0, inAppMessageData.action);
            dVar.f(fVar, 1, inAppMessageData.body);
            if (dVar.E(fVar, 2) || inAppMessageData.buttonName != null) {
                dVar.v(fVar, 2, x2.f64817a, inAppMessageData.buttonName);
            }
            dVar.f(fVar, 3, inAppMessageData.createdAt);
            if (dVar.E(fVar, 4) || inAppMessageData.attributes != null) {
                dVar.v(fVar, 4, InAppMessageAttributes.a.f21453a, inAppMessageData.attributes);
            }
            dVar.u(fVar, 5, inAppMessageData.forceToDoAction);
            dVar.t(fVar, 6, inAppMessageData.f21455id);
            dVar.u(fVar, 7, inAppMessageData.isDismissible);
            dVar.u(fVar, 8, inAppMessageData.isSeen);
            dVar.f(fVar, 9, inAppMessageData.title);
            if (!dVar.E(fVar, 10) && inAppMessageData.type == null) {
                return;
            }
            dVar.v(fVar, 10, x2.f64817a, inAppMessageData.type);
        }

        public final String component1() {
            return this.action;
        }

        public final String component10() {
            return this.title;
        }

        public final String component11() {
            return this.type;
        }

        public final String component2() {
            return this.body;
        }

        public final String component3() {
            return this.buttonName;
        }

        public final String component4() {
            return this.createdAt;
        }

        public final InAppMessageAttributes component5() {
            return this.attributes;
        }

        public final boolean component6() {
            return this.forceToDoAction;
        }

        public final int component7() {
            return this.f21455id;
        }

        public final boolean component8() {
            return this.isDismissible;
        }

        public final boolean component9() {
            return this.isSeen;
        }

        public final InAppMessageData copy(String str, String str2, String str3, String str4, InAppMessageAttributes inAppMessageAttributes, boolean z10, int i10, boolean z11, boolean z12, String str5, String str6) {
            t.f(str, "action");
            t.f(str2, "body");
            t.f(str4, "createdAt");
            t.f(str5, "title");
            return new InAppMessageData(str, str2, str3, str4, inAppMessageAttributes, z10, i10, z11, z12, str5, str6);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InAppMessageData)) {
                return false;
            }
            InAppMessageData inAppMessageData = (InAppMessageData) obj;
            return t.b(this.action, inAppMessageData.action) && t.b(this.body, inAppMessageData.body) && t.b(this.buttonName, inAppMessageData.buttonName) && t.b(this.createdAt, inAppMessageData.createdAt) && t.b(this.attributes, inAppMessageData.attributes) && this.forceToDoAction == inAppMessageData.forceToDoAction && this.f21455id == inAppMessageData.f21455id && this.isDismissible == inAppMessageData.isDismissible && this.isSeen == inAppMessageData.isSeen && t.b(this.title, inAppMessageData.title) && t.b(this.type, inAppMessageData.type);
        }

        public final String getAction() {
            return this.action;
        }

        public final InAppMessageAttributes getAttributes() {
            return this.attributes;
        }

        public final String getBody() {
            return this.body;
        }

        public final String getButtonName() {
            return this.buttonName;
        }

        public final String getCreatedAt() {
            return this.createdAt;
        }

        public final boolean getForceToDoAction() {
            return this.forceToDoAction;
        }

        public final int getId() {
            return this.f21455id;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            int iHashCode = ((this.action.hashCode() * 31) + this.body.hashCode()) * 31;
            String str = this.buttonName;
            int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.createdAt.hashCode()) * 31;
            InAppMessageAttributes inAppMessageAttributes = this.attributes;
            int iHashCode3 = (((((((((((iHashCode2 + (inAppMessageAttributes == null ? 0 : inAppMessageAttributes.hashCode())) * 31) + Boolean.hashCode(this.forceToDoAction)) * 31) + Integer.hashCode(this.f21455id)) * 31) + Boolean.hashCode(this.isDismissible)) * 31) + Boolean.hashCode(this.isSeen)) * 31) + this.title.hashCode()) * 31;
            String str2 = this.type;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean isDismissible() {
            return this.isDismissible;
        }

        public final boolean isSeen() {
            return this.isSeen;
        }

        public String toString() {
            return "InAppMessageData(action=" + this.action + ", body=" + this.body + ", buttonName=" + this.buttonName + ", createdAt=" + this.createdAt + ", attributes=" + this.attributes + ", forceToDoAction=" + this.forceToDoAction + ", id=" + this.f21455id + ", isDismissible=" + this.isDismissible + ", isSeen=" + this.isSeen + ", title=" + this.title + ", type=" + this.type + ")";
        }

        public InAppMessageData(String str, String str2, String str3, String str4, InAppMessageAttributes inAppMessageAttributes, boolean z10, int i10, boolean z11, boolean z12, String str5, String str6) {
            t.f(str, "action");
            t.f(str2, "body");
            t.f(str4, "createdAt");
            t.f(str5, "title");
            this.action = str;
            this.body = str2;
            this.buttonName = str3;
            this.createdAt = str4;
            this.attributes = inAppMessageAttributes;
            this.forceToDoAction = z10;
            this.f21455id = i10;
            this.isDismissible = z11;
            this.isSeen = z12;
            this.title = str5;
            this.type = str6;
        }

        public /* synthetic */ InAppMessageData(String str, String str2, String str3, String str4, InAppMessageAttributes inAppMessageAttributes, boolean z10, int i10, boolean z11, boolean z12, String str5, String str6, int i11, k kVar) {
            this(str, str2, (i11 & 4) != 0 ? null : str3, str4, (i11 & 16) != 0 ? null : inAppMessageAttributes, z10, i10, z11, z12, str5, (i11 & File.FLAG_O_APPEND) != 0 ? null : str6);
        }
    }

    @p
    public static final class InAppMessageMeta {
        public static final int $stable = 0;
        public static final b Companion = new b(null);
        private final String dotType;
        private final int limit;
        private final String next;
        private final int offset;
        private final String previous;
        private final int totalCount;

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f21458a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f21459b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f21458a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.app.repo.InAppNotificationsApiRepository.InAppMessageMeta", aVar, 6);
                i2Var.r("total_count", false);
                i2Var.r("previous", true);
                i2Var.r("offset", false);
                i2Var.r("next", true);
                i2Var.r("limit", false);
                i2Var.r("dot_type", true);
                descriptor = i2Var;
                f21459b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InAppMessageMeta deserialize(e eVar) {
                int iE;
                int i10;
                int i11;
                int i12;
                String str;
                String str2;
                String str3;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                if (cVarD.l()) {
                    iE = cVarD.e(fVar, 0);
                    x2 x2Var = x2.f64817a;
                    String str4 = (String) cVarD.v(fVar, 1, x2Var, null);
                    int iE2 = cVarD.e(fVar, 2);
                    String str5 = (String) cVarD.v(fVar, 3, x2Var, null);
                    int iE3 = cVarD.e(fVar, 4);
                    str3 = (String) cVarD.v(fVar, 5, x2Var, null);
                    str2 = str5;
                    i10 = iE3;
                    i11 = iE2;
                    str = str4;
                    i12 = 63;
                } else {
                    boolean z10 = true;
                    iE = 0;
                    int iE4 = 0;
                    int i13 = 0;
                    String str6 = null;
                    String str7 = null;
                    String str8 = null;
                    int iE5 = 0;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        switch (iD) {
                            case -1:
                                z10 = false;
                                continue;
                            case 0:
                                iE = cVarD.e(fVar, 0);
                                i13 |= 1;
                                continue;
                            case 1:
                                str6 = (String) cVarD.v(fVar, 1, x2.f64817a, str6);
                                i13 |= 2;
                                break;
                            case 2:
                                iE4 = cVarD.e(fVar, 2);
                                i13 |= 4;
                                break;
                            case 3:
                                str7 = (String) cVarD.v(fVar, 3, x2.f64817a, str7);
                                i13 |= 8;
                                break;
                            case 4:
                                iE5 = cVarD.e(fVar, 4);
                                i13 |= 16;
                                break;
                            case 5:
                                str8 = (String) cVarD.v(fVar, 5, x2.f64817a, str8);
                                i13 |= 32;
                                break;
                            default:
                                throw new e0(iD);
                        }
                    }
                    i10 = iE5;
                    i11 = iE4;
                    i12 = i13;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                }
                int i14 = iE;
                cVarD.b(fVar);
                return new InAppMessageMeta(i12, i14, str, i11, str2, i10, str3, (s2) null);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, InAppMessageMeta inAppMessageMeta) {
                t.f(fVar, "encoder");
                t.f(inAppMessageMeta, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                kv.d dVarD = fVar.d(fVar2);
                InAppMessageMeta.write$Self$Termius_app_googleProductionRelease(inAppMessageMeta, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final hv.c[] childSerializers() {
                x2 x2Var = x2.f64817a;
                hv.c cVarU = iv.a.u(x2Var);
                hv.c cVarU2 = iv.a.u(x2Var);
                hv.c cVarU3 = iv.a.u(x2Var);
                w0 w0Var = w0.f64808a;
                return new hv.c[]{w0Var, cVarU, w0Var, cVarU2, w0Var, cVarU3};
            }

            @Override // hv.c, hv.r, hv.b
            public final f getDescriptor() {
                return descriptor;
            }

            @Override // lv.n0
            public hv.c[] typeParametersSerializers() {
                return n0.a.a(this);
            }
        }

        public static final class b {
            private b() {
            }

            public final hv.c serializer() {
                return a.f21458a;
            }

            public /* synthetic */ b(k kVar) {
                this();
            }
        }

        public /* synthetic */ InAppMessageMeta(int i10, int i11, String str, int i12, String str2, int i13, String str3, s2 s2Var) {
            if (21 != (i10 & 21)) {
                d2.a(i10, 21, a.f21458a.getDescriptor());
            }
            this.totalCount = i11;
            if ((i10 & 2) == 0) {
                this.previous = null;
            } else {
                this.previous = str;
            }
            this.offset = i12;
            if ((i10 & 8) == 0) {
                this.next = null;
            } else {
                this.next = str2;
            }
            this.limit = i13;
            if ((i10 & 32) == 0) {
                this.dotType = null;
            } else {
                this.dotType = str3;
            }
        }

        public static /* synthetic */ InAppMessageMeta copy$default(InAppMessageMeta inAppMessageMeta, int i10, String str, int i11, String str2, int i12, String str3, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i10 = inAppMessageMeta.totalCount;
            }
            if ((i13 & 2) != 0) {
                str = inAppMessageMeta.previous;
            }
            if ((i13 & 4) != 0) {
                i11 = inAppMessageMeta.offset;
            }
            if ((i13 & 8) != 0) {
                str2 = inAppMessageMeta.next;
            }
            if ((i13 & 16) != 0) {
                i12 = inAppMessageMeta.limit;
            }
            if ((i13 & 32) != 0) {
                str3 = inAppMessageMeta.dotType;
            }
            int i14 = i12;
            String str4 = str3;
            return inAppMessageMeta.copy(i10, str, i11, str2, i14, str4);
        }

        @o("dot_type")
        public static /* synthetic */ void getDotType$annotations() {
        }

        @o("limit")
        public static /* synthetic */ void getLimit$annotations() {
        }

        @o("next")
        public static /* synthetic */ void getNext$annotations() {
        }

        @o("offset")
        public static /* synthetic */ void getOffset$annotations() {
        }

        @o("previous")
        public static /* synthetic */ void getPrevious$annotations() {
        }

        @o("total_count")
        public static /* synthetic */ void getTotalCount$annotations() {
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(InAppMessageMeta inAppMessageMeta, kv.d dVar, f fVar) {
            dVar.t(fVar, 0, inAppMessageMeta.totalCount);
            if (dVar.E(fVar, 1) || inAppMessageMeta.previous != null) {
                dVar.v(fVar, 1, x2.f64817a, inAppMessageMeta.previous);
            }
            dVar.t(fVar, 2, inAppMessageMeta.offset);
            if (dVar.E(fVar, 3) || inAppMessageMeta.next != null) {
                dVar.v(fVar, 3, x2.f64817a, inAppMessageMeta.next);
            }
            dVar.t(fVar, 4, inAppMessageMeta.limit);
            if (!dVar.E(fVar, 5) && inAppMessageMeta.dotType == null) {
                return;
            }
            dVar.v(fVar, 5, x2.f64817a, inAppMessageMeta.dotType);
        }

        public final int component1() {
            return this.totalCount;
        }

        public final String component2() {
            return this.previous;
        }

        public final int component3() {
            return this.offset;
        }

        public final String component4() {
            return this.next;
        }

        public final int component5() {
            return this.limit;
        }

        public final String component6() {
            return this.dotType;
        }

        public final InAppMessageMeta copy(int i10, String str, int i11, String str2, int i12, String str3) {
            return new InAppMessageMeta(i10, str, i11, str2, i12, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InAppMessageMeta)) {
                return false;
            }
            InAppMessageMeta inAppMessageMeta = (InAppMessageMeta) obj;
            return this.totalCount == inAppMessageMeta.totalCount && t.b(this.previous, inAppMessageMeta.previous) && this.offset == inAppMessageMeta.offset && t.b(this.next, inAppMessageMeta.next) && this.limit == inAppMessageMeta.limit && t.b(this.dotType, inAppMessageMeta.dotType);
        }

        public final String getDotType() {
            return this.dotType;
        }

        public final int getLimit() {
            return this.limit;
        }

        public final String getNext() {
            return this.next;
        }

        public final int getOffset() {
            return this.offset;
        }

        public final String getPrevious() {
            return this.previous;
        }

        public final int getTotalCount() {
            return this.totalCount;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.totalCount) * 31;
            String str = this.previous;
            int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.offset)) * 31;
            String str2 = this.next;
            int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.limit)) * 31;
            String str3 = this.dotType;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "InAppMessageMeta(totalCount=" + this.totalCount + ", previous=" + this.previous + ", offset=" + this.offset + ", next=" + this.next + ", limit=" + this.limit + ", dotType=" + this.dotType + ")";
        }

        public InAppMessageMeta(int i10, String str, int i11, String str2, int i12, String str3) {
            this.totalCount = i10;
            this.previous = str;
            this.offset = i11;
            this.next = str2;
            this.limit = i12;
            this.dotType = str3;
        }

        public /* synthetic */ InAppMessageMeta(int i10, String str, int i11, String str2, int i12, String str3, int i13, k kVar) {
            this(i10, (i13 & 2) != 0 ? null : str, i11, (i13 & 8) != 0 ? null : str2, i12, (i13 & 32) != 0 ? null : str3);
        }
    }

    @p
    public static final class InAppMessageResponse {
        private final InAppMessageMeta meta;
        private final List<InAppMessageData> objects;
        public static final b Companion = new b(null);
        public static final int $stable = 8;
        private static final n[] $childSerializers = {null, ut.o.b(r.f82638b, new iu.a() { // from class: og.l
            @Override // iu.a
            public final Object a() {
                return InAppNotificationsApiRepository.InAppMessageResponse._childSerializers$_anonymous_();
            }
        })};

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f21460a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f21461b;
            private static final f descriptor;

            static {
                a aVar = new a();
                f21460a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.app.repo.InAppNotificationsApiRepository.InAppMessageResponse", aVar, 2);
                i2Var.r("meta", false);
                i2Var.r("objects", false);
                descriptor = i2Var;
                f21461b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InAppMessageResponse deserialize(e eVar) {
                List list;
                InAppMessageMeta inAppMessageMeta;
                int i10;
                t.f(eVar, "decoder");
                f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                n[] nVarArr = InAppMessageResponse.$childSerializers;
                s2 s2Var = null;
                if (cVarD.l()) {
                    inAppMessageMeta = (InAppMessageMeta) cVarD.i(fVar, 0, InAppMessageMeta.a.f21458a, null);
                    list = (List) cVarD.i(fVar, 1, (hv.b) nVarArr[1].getValue(), null);
                    i10 = 3;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    List list2 = null;
                    InAppMessageMeta inAppMessageMeta2 = null;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else if (iD == 0) {
                            inAppMessageMeta2 = (InAppMessageMeta) cVarD.i(fVar, 0, InAppMessageMeta.a.f21458a, inAppMessageMeta2);
                            i11 |= 1;
                        } else {
                            if (iD != 1) {
                                throw new e0(iD);
                            }
                            list2 = (List) cVarD.i(fVar, 1, (hv.b) nVarArr[1].getValue(), list2);
                            i11 |= 2;
                        }
                    }
                    list = list2;
                    inAppMessageMeta = inAppMessageMeta2;
                    i10 = i11;
                }
                cVarD.b(fVar);
                return new InAppMessageResponse(i10, inAppMessageMeta, list, s2Var);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, InAppMessageResponse inAppMessageResponse) {
                t.f(fVar, "encoder");
                t.f(inAppMessageResponse, SerializableEvent.VALUE_FIELD);
                f fVar2 = descriptor;
                kv.d dVarD = fVar.d(fVar2);
                InAppMessageResponse.write$Self$Termius_app_googleProductionRelease(inAppMessageResponse, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{InAppMessageMeta.a.f21458a, InAppMessageResponse.$childSerializers[1].getValue()};
            }

            @Override // hv.c, hv.r, hv.b
            public final f getDescriptor() {
                return descriptor;
            }

            @Override // lv.n0
            public hv.c[] typeParametersSerializers() {
                return n0.a.a(this);
            }
        }

        public static final class b {
            private b() {
            }

            public final hv.c serializer() {
                return a.f21460a;
            }

            public /* synthetic */ b(k kVar) {
                this();
            }
        }

        public /* synthetic */ InAppMessageResponse(int i10, InAppMessageMeta inAppMessageMeta, List list, s2 s2Var) {
            if (3 != (i10 & 3)) {
                d2.a(i10, 3, a.f21460a.getDescriptor());
            }
            this.meta = inAppMessageMeta;
            this.objects = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ hv.c _childSerializers$_anonymous_() {
            return new lv.f(InAppMessageData.a.f21456a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InAppMessageResponse copy$default(InAppMessageResponse inAppMessageResponse, InAppMessageMeta inAppMessageMeta, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                inAppMessageMeta = inAppMessageResponse.meta;
            }
            if ((i10 & 2) != 0) {
                list = inAppMessageResponse.objects;
            }
            return inAppMessageResponse.copy(inAppMessageMeta, list);
        }

        @o("meta")
        public static /* synthetic */ void getMeta$annotations() {
        }

        @o("objects")
        public static /* synthetic */ void getObjects$annotations() {
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(InAppMessageResponse inAppMessageResponse, kv.d dVar, f fVar) {
            n[] nVarArr = $childSerializers;
            dVar.o(fVar, 0, InAppMessageMeta.a.f21458a, inAppMessageResponse.meta);
            dVar.o(fVar, 1, (hv.r) nVarArr[1].getValue(), inAppMessageResponse.objects);
        }

        public final InAppMessageMeta component1() {
            return this.meta;
        }

        public final List<InAppMessageData> component2() {
            return this.objects;
        }

        public final InAppMessageResponse copy(InAppMessageMeta inAppMessageMeta, List<InAppMessageData> list) {
            t.f(inAppMessageMeta, "meta");
            t.f(list, "objects");
            return new InAppMessageResponse(inAppMessageMeta, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InAppMessageResponse)) {
                return false;
            }
            InAppMessageResponse inAppMessageResponse = (InAppMessageResponse) obj;
            return t.b(this.meta, inAppMessageResponse.meta) && t.b(this.objects, inAppMessageResponse.objects);
        }

        public final InAppMessageMeta getMeta() {
            return this.meta;
        }

        public final List<InAppMessageData> getObjects() {
            return this.objects;
        }

        public int hashCode() {
            return (this.meta.hashCode() * 31) + this.objects.hashCode();
        }

        public String toString() {
            return "InAppMessageResponse(meta=" + this.meta + ", objects=" + this.objects + ")";
        }

        public InAppMessageResponse(InAppMessageMeta inAppMessageMeta, List<InAppMessageData> list) {
            t.f(inAppMessageMeta, "meta");
            t.f(list, "objects");
            this.meta = inAppMessageMeta;
            this.objects = list;
        }
    }

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    public static abstract class b {

        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Exception f21462a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Exception exc) {
                super(null);
                t.f(exc, "exception");
                this.f21462a = exc;
            }

            public final Exception a() {
                return this.f21462a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && t.b(this.f21462a, ((a) obj).f21462a);
            }

            public int hashCode() {
                return this.f21462a.hashCode();
            }

            public String toString() {
                return "Error(exception=" + this.f21462a + ")";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.app.repo.InAppNotificationsApiRepository$b$b, reason: collision with other inner class name */
        public static final class C0320b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f21463a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0320b(String str) {
                super(null);
                t.f(str, "error");
                this.f21463a = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0320b) && t.b(this.f21463a, ((C0320b) obj).f21463a);
            }

            public int hashCode() {
                return this.f21463a.hashCode();
            }

            public String toString() {
                return "Failed(error=" + this.f21463a + ")";
            }
        }

        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f21464a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -2113510155;
            }

            public String toString() {
                return "NetworkError";
            }
        }

        public static final class d extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final InAppMessageResponse f21465a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(InAppMessageResponse inAppMessageResponse) {
                super(null);
                t.f(inAppMessageResponse, "result");
                this.f21465a = inAppMessageResponse;
            }

            public final InAppMessageResponse a() {
                return this.f21465a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && t.b(this.f21465a, ((d) obj).f21465a);
            }

            public int hashCode() {
                return this.f21465a.hashCode();
            }

            public String toString() {
                return "Success(result=" + this.f21465a + ")";
            }
        }

        public /* synthetic */ b(k kVar) {
            this();
        }

        private b() {
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f21466a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f21468c;

        c(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f21466a = obj;
            this.f21468c |= RtlSpacingHelper.UNDEFINED;
            return InAppNotificationsApiRepository.this.b(this);
        }
    }

    static final class d extends m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f21469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SyncRestInterface f21470b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(SyncRestInterface syncRestInterface, zt.e eVar) {
            super(2, eVar);
            this.f21470b = syncRestInterface;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new d(this.f21470b, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f21469a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
                return obj;
            }
            x.b(obj);
            SyncRestInterface syncRestInterface = this.f21470b;
            this.f21469a = 1;
            Object objRequestInAppMessages = syncRestInterface.requestInAppMessages(0, 10, this);
            return objRequestInAppMessages == objF ? objF : objRequestInAppMessages;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public InAppNotificationsApiRepository(SyncRestApiClientFactory syncRestApiClientFactory, g0 g0Var) {
        t.f(syncRestApiClientFactory, "restApiClientFactory");
        t.f(g0Var, "networkDispatcher");
        this.f21450a = syncRestApiClientFactory;
        this.f21451b = g0Var;
    }

    private final b a(com.server.auditor.ssh.client.models.e eVar) {
        String string;
        Object objB;
        String errorMessage;
        if ((eVar instanceof h) || (eVar instanceof z)) {
            pv.e0 e0VarA = eVar.a();
            string = e0VarA != null ? e0VarA.toString() : null;
            return new b.C0320b(string != null ? string : "");
        }
        if (eVar instanceof w) {
            w wVar = (w) eVar;
            String strC = wVar.c();
            if (strC != null) {
                return new b.C0320b(strC);
            }
            pv.e0 e0VarA2 = wVar.a();
            string = e0VarA2 != null ? e0VarA2.toString() : null;
            return new b.C0320b(string != null ? string : "");
        }
        if (!(eVar instanceof com.server.auditor.ssh.client.models.m) && !(eVar instanceof y)) {
            if (eVar instanceof l) {
                return new b.C0320b("");
            }
            throw new s();
        }
        try {
            mv.b bVarS1 = b2.f52944a.s1();
            pv.e0 e0VarA3 = eVar.a();
            String strString = e0VarA3 != null ? e0VarA3.string() : null;
            if (strString == null) {
                strString = "";
            }
            bVarS1.a();
            objB = bVarS1.b(CommonApiErrorResponse.Companion.serializer(), strString);
        } catch (IllegalArgumentException unused) {
            objB = null;
        }
        CommonApiErrorResponse commonApiErrorResponse = (CommonApiErrorResponse) objB;
        if (commonApiErrorResponse != null && (errorMessage = commonApiErrorResponse.getErrorMessage()) != null) {
            return new b.C0320b(errorMessage);
        }
        pv.e0 e0VarA4 = eVar.a();
        string = e0VarA4 != null ? e0VarA4.toString() : null;
        return new b.C0320b(string != null ? string : "");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(zt.e r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.server.auditor.ssh.client.app.repo.InAppNotificationsApiRepository.c
            if (r0 == 0) goto L13
            r0 = r7
            com.server.auditor.ssh.client.app.repo.InAppNotificationsApiRepository$c r0 = (com.server.auditor.ssh.client.app.repo.InAppNotificationsApiRepository.c) r0
            int r1 = r0.f21468c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21468c = r1
            goto L18
        L13:
            com.server.auditor.ssh.client.app.repo.InAppNotificationsApiRepository$c r0 = new com.server.auditor.ssh.client.app.repo.InAppNotificationsApiRepository$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f21466a
            java.lang.Object r1 = au.b.f()
            int r2 = r0.f21468c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ut.x.b(r7)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L7c
            goto L57
        L29:
            r7 = move-exception
            goto L76
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            ut.x.b(r7)
            com.server.auditor.ssh.client.synchronization.retrofit.SyncRestApiClientFactory r7 = r6.f21450a
            com.server.auditor.ssh.client.synchronization.retrofit.SyncRestInterface r7 = r7.createAuthenticatedRestApiClient()
            if (r7 != 0) goto L46
            com.server.auditor.ssh.client.app.repo.InAppNotificationsApiRepository$b$b r7 = new com.server.auditor.ssh.client.app.repo.InAppNotificationsApiRepository$b$b
            java.lang.String r0 = ""
            r7.<init>(r0)
            return r7
        L46:
            wu.g0 r2 = r6.f21451b     // Catch: java.lang.Exception -> L29 java.io.IOException -> L7c
            com.server.auditor.ssh.client.app.repo.InAppNotificationsApiRepository$d r4 = new com.server.auditor.ssh.client.app.repo.InAppNotificationsApiRepository$d     // Catch: java.lang.Exception -> L29 java.io.IOException -> L7c
            r5 = 0
            r4.<init>(r7, r5)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L7c
            r0.f21468c = r3     // Catch: java.lang.Exception -> L29 java.io.IOException -> L7c
            java.lang.Object r7 = wu.i.g(r2, r4, r0)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L7c
            if (r7 != r1) goto L57
            return r1
        L57:
            retrofit2.Response r7 = (retrofit2.Response) r7     // Catch: java.lang.Exception -> L29 java.io.IOException -> L7c
            java.lang.Object r0 = r7.body()     // Catch: java.lang.Exception -> L29 java.io.IOException -> L7c
            com.server.auditor.ssh.client.app.repo.InAppNotificationsApiRepository$InAppMessageResponse r0 = (com.server.auditor.ssh.client.app.repo.InAppNotificationsApiRepository.InAppMessageResponse) r0     // Catch: java.lang.Exception -> L29 java.io.IOException -> L7c
            boolean r1 = r7.isSuccessful()     // Catch: java.lang.Exception -> L29 java.io.IOException -> L7c
            if (r1 == 0) goto L6d
            if (r0 == 0) goto L6d
            com.server.auditor.ssh.client.app.repo.InAppNotificationsApiRepository$b$d r7 = new com.server.auditor.ssh.client.app.repo.InAppNotificationsApiRepository$b$d     // Catch: java.lang.Exception -> L29 java.io.IOException -> L7c
            r7.<init>(r0)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L7c
            return r7
        L6d:
            com.server.auditor.ssh.client.models.e r7 = com.server.auditor.ssh.client.models.f.a(r7)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L7c
            com.server.auditor.ssh.client.app.repo.InAppNotificationsApiRepository$b r7 = r6.a(r7)     // Catch: java.lang.Exception -> L29 java.io.IOException -> L7c
            return r7
        L76:
            com.server.auditor.ssh.client.app.repo.InAppNotificationsApiRepository$b$a r0 = new com.server.auditor.ssh.client.app.repo.InAppNotificationsApiRepository$b$a
            r0.<init>(r7)
            goto L7e
        L7c:
            com.server.auditor.ssh.client.app.repo.InAppNotificationsApiRepository$b$c r0 = com.server.auditor.ssh.client.app.repo.InAppNotificationsApiRepository.b.c.f21464a
        L7e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.app.repo.InAppNotificationsApiRepository.b(zt.e):java.lang.Object");
    }
}
