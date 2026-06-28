package com.server.auditor.ssh.client.repositories.team;

import android.net.Uri;
import androidx.appcompat.widget.RtlSpacingHelper;
import androidx.lifecycle.f0;
import com.server.auditor.ssh.client.database.Column;
import com.server.auditor.ssh.client.models.TeamMemberInvitationStatus;
import com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository;
import com.server.auditor.ssh.client.synchronization.api.models.teams.TeamMemberRole;
import hv.e0;
import hv.o;
import hv.p;
import io.split.android.client.dtos.SerializableEvent;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import ju.k;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import lv.d2;
import lv.h1;
import lv.i;
import lv.i2;
import lv.n0;
import lv.s2;
import lv.x2;
import su.s;
import ut.m0;
import ut.n;
import ut.r;
import vt.v;
import wu.i0;
import wu.j;
import zu.w;

/* JADX INFO: loaded from: classes4.dex */
public final class TeamMembersOnlineCacheRepository {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f38728h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f38729i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final il.c f38730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kp.b f38731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final kp.a f38732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ug.c f38733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayList f38734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f38735f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w f38736g;

    @p
    public static final class ClientOnlineInfo {
        public static final int $stable = 0;
        public static final b Companion = new b(null);
        private final String clientId;
        private final OnlineInfoEntity onlineInfoEntity;

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f38737a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f38738b;
            private static final jv.f descriptor;

            static {
                a aVar = new a();
                f38737a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository.ClientOnlineInfo", aVar, 2);
                i2Var.r("clientId", false);
                i2Var.r("onlineInfoEntity", false);
                descriptor = i2Var;
                f38738b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ClientOnlineInfo deserialize(kv.e eVar) {
                String strB;
                OnlineInfoEntity onlineInfoEntity;
                int i10;
                t.f(eVar, "decoder");
                jv.f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                s2 s2Var = null;
                if (cVarD.l()) {
                    strB = cVarD.B(fVar, 0);
                    onlineInfoEntity = (OnlineInfoEntity) cVarD.i(fVar, 1, OnlineInfoEntity.a.f38741a, null);
                    i10 = 3;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    strB = null;
                    OnlineInfoEntity onlineInfoEntity2 = null;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else if (iD == 0) {
                            strB = cVarD.B(fVar, 0);
                            i11 |= 1;
                        } else {
                            if (iD != 1) {
                                throw new e0(iD);
                            }
                            onlineInfoEntity2 = (OnlineInfoEntity) cVarD.i(fVar, 1, OnlineInfoEntity.a.f38741a, onlineInfoEntity2);
                            i11 |= 2;
                        }
                    }
                    onlineInfoEntity = onlineInfoEntity2;
                    i10 = i11;
                }
                cVarD.b(fVar);
                return new ClientOnlineInfo(i10, strB, onlineInfoEntity, s2Var);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, ClientOnlineInfo clientOnlineInfo) {
                t.f(fVar, "encoder");
                t.f(clientOnlineInfo, SerializableEvent.VALUE_FIELD);
                jv.f fVar2 = descriptor;
                kv.d dVarD = fVar.d(fVar2);
                ClientOnlineInfo.write$Self$Termius_app_googleProductionRelease(clientOnlineInfo, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{x2.f64817a, OnlineInfoEntity.a.f38741a};
            }

            @Override // hv.c, hv.r, hv.b
            public final jv.f getDescriptor() {
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
                return a.f38737a;
            }

            public /* synthetic */ b(k kVar) {
                this();
            }
        }

        public /* synthetic */ ClientOnlineInfo(int i10, String str, OnlineInfoEntity onlineInfoEntity, s2 s2Var) {
            if (3 != (i10 & 3)) {
                d2.a(i10, 3, a.f38737a.getDescriptor());
            }
            this.clientId = str;
            this.onlineInfoEntity = onlineInfoEntity;
        }

        public static /* synthetic */ ClientOnlineInfo copy$default(ClientOnlineInfo clientOnlineInfo, String str, OnlineInfoEntity onlineInfoEntity, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = clientOnlineInfo.clientId;
            }
            if ((i10 & 2) != 0) {
                onlineInfoEntity = clientOnlineInfo.onlineInfoEntity;
            }
            return clientOnlineInfo.copy(str, onlineInfoEntity);
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(ClientOnlineInfo clientOnlineInfo, kv.d dVar, jv.f fVar) {
            dVar.f(fVar, 0, clientOnlineInfo.clientId);
            dVar.o(fVar, 1, OnlineInfoEntity.a.f38741a, clientOnlineInfo.onlineInfoEntity);
        }

        public final String component1() {
            return this.clientId;
        }

        public final OnlineInfoEntity component2() {
            return this.onlineInfoEntity;
        }

        public final ClientOnlineInfo copy(String str, OnlineInfoEntity onlineInfoEntity) {
            t.f(str, "clientId");
            t.f(onlineInfoEntity, "onlineInfoEntity");
            return new ClientOnlineInfo(str, onlineInfoEntity);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClientOnlineInfo)) {
                return false;
            }
            ClientOnlineInfo clientOnlineInfo = (ClientOnlineInfo) obj;
            return t.b(this.clientId, clientOnlineInfo.clientId) && t.b(this.onlineInfoEntity, clientOnlineInfo.onlineInfoEntity);
        }

        public final String getClientId() {
            return this.clientId;
        }

        public final OnlineInfoEntity getOnlineInfoEntity() {
            return this.onlineInfoEntity;
        }

        public int hashCode() {
            return (this.clientId.hashCode() * 31) + this.onlineInfoEntity.hashCode();
        }

        public String toString() {
            return "ClientOnlineInfo(clientId=" + this.clientId + ", onlineInfoEntity=" + this.onlineInfoEntity + ")";
        }

        public ClientOnlineInfo(String str, OnlineInfoEntity onlineInfoEntity) {
            t.f(str, "clientId");
            t.f(onlineInfoEntity, "onlineInfoEntity");
            this.clientId = str;
            this.onlineInfoEntity = onlineInfoEntity;
        }
    }

    @p
    public static final class OnlineInfoDevice {
        public static final int $stable = 0;
        public static final b Companion = new b(null);
        private final String type;

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f38739a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f38740b;
            private static final jv.f descriptor;

            static {
                a aVar = new a();
                f38739a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository.OnlineInfoDevice", aVar, 1);
                i2Var.r("device_type", false);
                descriptor = i2Var;
                f38740b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final OnlineInfoDevice deserialize(kv.e eVar) {
                String strB;
                t.f(eVar, "decoder");
                jv.f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                int i10 = 1;
                s2 s2Var = null;
                if (cVarD.l()) {
                    strB = cVarD.B(fVar, 0);
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    strB = null;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else {
                            if (iD != 0) {
                                throw new e0(iD);
                            }
                            strB = cVarD.B(fVar, 0);
                            i11 = 1;
                        }
                    }
                    i10 = i11;
                }
                cVarD.b(fVar);
                return new OnlineInfoDevice(i10, strB, s2Var);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, OnlineInfoDevice onlineInfoDevice) {
                t.f(fVar, "encoder");
                t.f(onlineInfoDevice, SerializableEvent.VALUE_FIELD);
                jv.f fVar2 = descriptor;
                kv.d dVarD = fVar.d(fVar2);
                OnlineInfoDevice.write$Self$Termius_app_googleProductionRelease(onlineInfoDevice, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{x2.f64817a};
            }

            @Override // hv.c, hv.r, hv.b
            public final jv.f getDescriptor() {
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
                return a.f38739a;
            }

            public /* synthetic */ b(k kVar) {
                this();
            }
        }

        public /* synthetic */ OnlineInfoDevice(int i10, String str, s2 s2Var) {
            if (1 != (i10 & 1)) {
                d2.a(i10, 1, a.f38739a.getDescriptor());
            }
            this.type = str;
        }

        public static /* synthetic */ OnlineInfoDevice copy$default(OnlineInfoDevice onlineInfoDevice, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = onlineInfoDevice.type;
            }
            return onlineInfoDevice.copy(str);
        }

        @o("device_type")
        public static /* synthetic */ void getType$annotations() {
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(OnlineInfoDevice onlineInfoDevice, kv.d dVar, jv.f fVar) {
            dVar.f(fVar, 0, onlineInfoDevice.type);
        }

        public final String component1() {
            return this.type;
        }

        public final OnlineInfoDevice copy(String str) {
            t.f(str, Column.TYPE);
            return new OnlineInfoDevice(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnlineInfoDevice) && t.b(this.type, ((OnlineInfoDevice) obj).type);
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        public String toString() {
            return "OnlineInfoDevice(type=" + this.type + ")";
        }

        public OnlineInfoDevice(String str) {
            t.f(str, Column.TYPE);
            this.type = str;
        }
    }

    @p
    public static final class OnlineInfoEntity {
        public static final int $stable = 0;
        public static final b Companion = new b(null);
        private final OnlineInfoDevice device;
        private final long userId;

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f38741a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f38742b;
            private static final jv.f descriptor;

            static {
                a aVar = new a();
                f38741a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository.OnlineInfoEntity", aVar, 2);
                i2Var.r("user_id", false);
                i2Var.r("device", false);
                descriptor = i2Var;
                f38742b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final OnlineInfoEntity deserialize(kv.e eVar) {
                long jO;
                int i10;
                OnlineInfoDevice onlineInfoDevice;
                t.f(eVar, "decoder");
                jv.f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                OnlineInfoDevice onlineInfoDevice2 = null;
                if (cVarD.l()) {
                    jO = cVarD.o(fVar, 0);
                    onlineInfoDevice = (OnlineInfoDevice) cVarD.i(fVar, 1, OnlineInfoDevice.a.f38739a, null);
                    i10 = 3;
                } else {
                    jO = 0;
                    boolean z10 = true;
                    int i11 = 0;
                    while (z10) {
                        int iD = cVarD.D(fVar);
                        if (iD == -1) {
                            z10 = false;
                        } else if (iD == 0) {
                            jO = cVarD.o(fVar, 0);
                            i11 |= 1;
                        } else {
                            if (iD != 1) {
                                throw new e0(iD);
                            }
                            onlineInfoDevice2 = (OnlineInfoDevice) cVarD.i(fVar, 1, OnlineInfoDevice.a.f38739a, onlineInfoDevice2);
                            i11 |= 2;
                        }
                    }
                    i10 = i11;
                    onlineInfoDevice = onlineInfoDevice2;
                }
                long j10 = jO;
                cVarD.b(fVar);
                return new OnlineInfoEntity(i10, j10, onlineInfoDevice, null);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, OnlineInfoEntity onlineInfoEntity) {
                t.f(fVar, "encoder");
                t.f(onlineInfoEntity, SerializableEvent.VALUE_FIELD);
                jv.f fVar2 = descriptor;
                kv.d dVarD = fVar.d(fVar2);
                OnlineInfoEntity.write$Self$Termius_app_googleProductionRelease(onlineInfoEntity, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            @Override // lv.n0
            public final hv.c[] childSerializers() {
                return new hv.c[]{h1.f64699a, OnlineInfoDevice.a.f38739a};
            }

            @Override // hv.c, hv.r, hv.b
            public final jv.f getDescriptor() {
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
                return a.f38741a;
            }

            public /* synthetic */ b(k kVar) {
                this();
            }
        }

        public /* synthetic */ OnlineInfoEntity(int i10, long j10, OnlineInfoDevice onlineInfoDevice, s2 s2Var) {
            if (3 != (i10 & 3)) {
                d2.a(i10, 3, a.f38741a.getDescriptor());
            }
            this.userId = j10;
            this.device = onlineInfoDevice;
        }

        public static /* synthetic */ OnlineInfoEntity copy$default(OnlineInfoEntity onlineInfoEntity, long j10, OnlineInfoDevice onlineInfoDevice, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = onlineInfoEntity.userId;
            }
            if ((i10 & 2) != 0) {
                onlineInfoDevice = onlineInfoEntity.device;
            }
            return onlineInfoEntity.copy(j10, onlineInfoDevice);
        }

        @o("device")
        public static /* synthetic */ void getDevice$annotations() {
        }

        @o("user_id")
        public static /* synthetic */ void getUserId$annotations() {
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(OnlineInfoEntity onlineInfoEntity, kv.d dVar, jv.f fVar) {
            dVar.q(fVar, 0, onlineInfoEntity.userId);
            dVar.o(fVar, 1, OnlineInfoDevice.a.f38739a, onlineInfoEntity.device);
        }

        public final long component1() {
            return this.userId;
        }

        public final OnlineInfoDevice component2() {
            return this.device;
        }

        public final OnlineInfoEntity copy(long j10, OnlineInfoDevice onlineInfoDevice) {
            t.f(onlineInfoDevice, "device");
            return new OnlineInfoEntity(j10, onlineInfoDevice);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnlineInfoEntity)) {
                return false;
            }
            OnlineInfoEntity onlineInfoEntity = (OnlineInfoEntity) obj;
            return this.userId == onlineInfoEntity.userId && t.b(this.device, onlineInfoEntity.device);
        }

        public final OnlineInfoDevice getDevice() {
            return this.device;
        }

        public final long getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return (Long.hashCode(this.userId) * 31) + this.device.hashCode();
        }

        public String toString() {
            return "OnlineInfoEntity(userId=" + this.userId + ", device=" + this.device + ")";
        }

        public OnlineInfoEntity(long j10, OnlineInfoDevice onlineInfoDevice) {
            t.f(onlineInfoDevice, "device");
            this.userId = j10;
            this.device = onlineInfoDevice;
        }
    }

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f38745a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f38746b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f38747c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f38748d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f38749e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f38750f;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f38751u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f38753w;

        b(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f38751u = obj;
            this.f38753w |= RtlSpacingHelper.UNDEFINED;
            return TeamMembersOnlineCacheRepository.this.o(null, this);
        }
    }

    public static final class c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return yt.a.e(Long.valueOf(((TeamUser) obj).getUserId()), Long.valueOf(((TeamUser) obj2).getUserId()));
        }
    }

    public static final class d implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return yt.a.e(Boolean.valueOf(((TeamUser) obj2).isOnline()), Boolean.valueOf(((TeamUser) obj).isOnline()));
        }
    }

    public static final class e implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return yt.a.e(Boolean.valueOf(((TeamUser) obj2).getUserId() != 0), Boolean.valueOf(((TeamUser) obj).getUserId() != 0));
        }
    }

    public static final class f implements Comparator {
        public f() {
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return yt.a.e(Boolean.valueOf(((TeamUser) obj2).getUserId() == ((long) TeamMembersOnlineCacheRepository.this.f38735f)), Boolean.valueOf(((TeamUser) obj).getUserId() == ((long) TeamMembersOnlineCacheRepository.this.f38735f)));
        }
    }

    static final class g extends m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f38755a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f38756b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f38757c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f38758d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f38759e;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ boolean f38761u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f38761u = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return TeamMembersOnlineCacheRepository.this.new g(this.f38761u, eVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0085 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0083 -> B:23:0x0086). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = au.b.f()
                int r1 = r6.f38759e
                r2 = 1
                if (r1 == 0) goto L23
                if (r1 != r2) goto L1b
                boolean r1 = r6.f38758d
                java.lang.Object r3 = r6.f38757c
                java.lang.Object r4 = r6.f38756b
                com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository r4 = (com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository) r4
                java.lang.Object r5 = r6.f38755a
                zu.w r5 = (zu.w) r5
                ut.x.b(r7)
                goto L86
            L1b:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L23:
                ut.x.b(r7)
                com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository r7 = com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository.this
                boolean r7 = com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository.d(r7)
                if (r7 == 0) goto L56
                com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository r7 = com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository.this
                ug.c r7 = com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository.b(r7)
                java.lang.String r0 = "7465616D5F6D656D626572735F6F6E6C696E655F6361636865"
                r7.f(r0)
                com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository r7 = com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository.this
                zu.w r7 = com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository.c(r7)
            L3f:
                java.lang.Object r0 = r7.getValue()
                r1 = r0
                java.util.List r1 = (java.util.List) r1
                java.util.List r1 = vt.v.o()
                boolean r0 = r7.g(r0, r1)
                if (r0 == 0) goto L3f
                r7 = 0
                java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.b.a(r7)
                return r7
            L56:
                com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository r7 = com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository.this
                zu.w r7 = com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository.c(r7)
                com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository r1 = com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository.this
                boolean r3 = r6.f38761u
                r5 = r7
                r4 = r1
                r1 = r3
            L63:
                java.lang.Object r3 = r5.getValue()
                r7 = r3
                java.util.List r7 = (java.util.List) r7
                if (r1 == 0) goto L6d
                goto L71
            L6d:
                java.util.List r7 = com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository.f(r4, r7)
            L71:
                java.util.List r7 = com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository.g(r4, r7)
                r6.f38755a = r5
                r6.f38756b = r4
                r6.f38757c = r3
                r6.f38758d = r1
                r6.f38759e = r2
                java.lang.Object r7 = com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository.e(r4, r7, r6)
                if (r7 != r0) goto L86
                return r0
            L86:
                java.util.List r7 = (java.util.List) r7
                boolean r7 = r5.g(r3, r7)
                if (r7 == 0) goto L63
                java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.b.a(r2)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public TeamMembersOnlineCacheRepository(il.c cVar, kp.b bVar, kp.a aVar, ug.c cVar2) {
        t.f(cVar, "avatarsCacheRepository");
        t.f(bVar, "getCachedTeamUsersUseCase");
        t.f(aVar, "cacheTeamUsersUseCase");
        t.f(cVar2, "keyValueStorage");
        this.f38730a = cVar;
        this.f38731b = bVar;
        this.f38732c = aVar;
        this.f38733d = cVar2;
        this.f38734e = new ArrayList();
        this.f38736g = zu.m0.a(v.o());
        n(com.server.auditor.ssh.client.app.a.N().q());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean m() {
        Iterable iterable = (Iterable) this.f38736g.getValue();
        ArrayList arrayList = new ArrayList(v.z(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((TeamUser) it.next()).getUserId()));
        }
        Set setI1 = v.i1(arrayList);
        ArrayList arrayList2 = this.f38734e;
        ArrayList arrayList3 = new ArrayList(v.z(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(Long.valueOf(((ClientOnlineInfo) it2.next()).getOnlineInfoEntity().getUserId()));
        }
        return !v.H0(arrayList3, setI1).isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x009c -> B:12:0x0048). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.util.List r22, zt.e r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r23
            boolean r2 = r1 instanceof com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository.b
            if (r2 == 0) goto L17
            r2 = r1
            com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository$b r2 = (com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository.b) r2
            int r3 = r2.f38753w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f38753w = r3
            goto L1c
        L17:
            com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository$b r2 = new com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository$b
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.f38751u
            java.lang.Object r3 = au.b.f()
            int r4 = r2.f38753w
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L53
            if (r4 != r6) goto L4b
            long r7 = r2.f38750f
            int r4 = r2.f38749e
            java.lang.Object r9 = r2.f38748d
            java.util.Collection r9 = (java.util.Collection) r9
            java.lang.Object r10 = r2.f38747c
            com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository$TeamUser r10 = (com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository.TeamUser) r10
            java.lang.Object r11 = r2.f38746b
            java.util.Iterator r11 = (java.util.Iterator) r11
            java.lang.Object r12 = r2.f38745a
            java.util.Collection r12 = (java.util.Collection) r12
            ut.x.b(r1)
            r19 = r7
            r7 = r9
            r8 = r19
            r19 = r12
        L48:
            r20 = r11
            goto La2
        L4b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L53:
            ut.x.b(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r4 = 10
            r7 = r22
            int r4 = vt.v.z(r7, r4)
            r1.<init>(r4)
            java.util.Iterator r4 = r7.iterator()
            r9 = r1
            r11 = r4
        L69:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto Lc2
            java.lang.Object r1 = r11.next()
            r10 = r1
            com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository$TeamUser r10 = (com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository.TeamUser) r10
            il.c r1 = r0.f38730a
            android.content.Context r4 = com.server.auditor.ssh.client.app.TermiusApplication.F()
            java.lang.String r7 = "getTermiusAppContext(...)"
            ju.t.e(r4, r7)
            long r7 = r10.getUserId()
            r2.f38745a = r9
            r2.f38746b = r11
            r2.f38747c = r10
            r2.f38748d = r9
            r2.f38749e = r5
            r12 = 0
            r2.f38750f = r12
            r2.f38753w = r6
            java.lang.Object r1 = r1.h(r4, r7, r2)
            if (r1 != r3) goto L9c
            return r3
        L9c:
            r4 = r5
            r7 = r9
            r19 = r7
            r8 = r12
            goto L48
        La2:
            if (r4 == 0) goto La6
            r12 = r6
            goto La7
        La6:
            r12 = r5
        La7:
            r14 = r1
            android.net.Uri r14 = (android.net.Uri) r14
            r17 = 223(0xdf, float:3.12E-43)
            r18 = 0
            r1 = r7
            r7 = r10
            r10 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository$TeamUser r4 = com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository.TeamUser.copy$default(r7, r8, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1.add(r4)
            r9 = r19
            r11 = r20
            goto L69
        Lc2:
            java.util.List r9 = (java.util.List) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository.o(java.util.List, zt.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List p(List list) {
        Object objPrevious;
        String type;
        OnlineInfoEntity onlineInfoEntity;
        OnlineInfoDevice device;
        ArrayList arrayList = new ArrayList(v.z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TeamUser teamUser = (TeamUser) it.next();
            ArrayList arrayList2 = this.f38734e;
            ListIterator listIterator = arrayList2.listIterator(arrayList2.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
                if (((ClientOnlineInfo) objPrevious).getOnlineInfoEntity().getUserId() == teamUser.getUserId()) {
                    break;
                }
            }
            ClientOnlineInfo clientOnlineInfo = (ClientOnlineInfo) objPrevious;
            boolean z10 = clientOnlineInfo != null;
            if (clientOnlineInfo == null || (onlineInfoEntity = clientOnlineInfo.getOnlineInfoEntity()) == null || (device = onlineInfoEntity.getDevice()) == null || (type = device.getType()) == null) {
                type = "";
            }
            arrayList.add(TeamUser.copy$default(teamUser, 0L, null, null, z10, type, null, null, null, 231, null));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List t(List list) {
        return v.R0(v.R0(v.R0(v.R0(list, new c()), new d()), new e()), new f());
    }

    private final boolean u(boolean z10) {
        return ((Boolean) j.b(null, new g(z10, null), 1, null)).booleanValue();
    }

    static /* synthetic */ boolean v(TeamMembersOnlineCacheRepository teamMembersOnlineCacheRepository, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return teamMembersOnlineCacheRepository.u(z10);
    }

    public static /* synthetic */ void y(TeamMembersOnlineCacheRepository teamMembersOnlineCacheRepository, List list, Integer num, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        teamMembersOnlineCacheRepository.x(list, num, z10);
    }

    public final void h() {
        Object value;
        this.f38733d.f("7465616D5F6D656D626572735F6F6E6C696E655F6361636865");
        this.f38734e.clear();
        w wVar = this.f38736g;
        do {
            value = wVar.getValue();
        } while (!wVar.g(value, v.o()));
    }

    public final Integer i() {
        if (!com.server.auditor.ssh.client.app.a.N().z0()) {
            return null;
        }
        Iterable iterable = (Iterable) this.f38736g.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (((TeamUser) obj).isOnline()) {
                arrayList.add(obj);
            }
        }
        return Integer.valueOf(arrayList.size());
    }

    public final f0 j() {
        return androidx.lifecycle.m.c(this.f38736g, null, 0L, 3, null);
    }

    public final List k() {
        return (List) this.f38736g.getValue();
    }

    public final boolean l() {
        return new String(ug.c.e(this.f38733d, "7465616D5F6D656D626572735F6F6E6C696E655F6361636865", null, 2, null), su.d.f78241b).length() > 0;
    }

    public final void n(Integer num) {
        Object value;
        List listA = this.f38731b.a();
        if (!listA.isEmpty()) {
            w wVar = this.f38736g;
            do {
                value = wVar.getValue();
            } while (!wVar.g(value, listA));
        }
        this.f38735f = num != null ? num.intValue() : 0;
        v(this, false, 1, null);
    }

    public final void q() {
        Object value;
        ArrayList arrayList;
        Object objPrevious;
        String type;
        OnlineInfoEntity onlineInfoEntity;
        OnlineInfoDevice device;
        w wVar = this.f38736g;
        do {
            value = wVar.getValue();
            List<TeamUser> list = (List) value;
            arrayList = new ArrayList(v.z(list, 10));
            for (TeamUser teamUser : list) {
                ArrayList arrayList2 = this.f38734e;
                ListIterator listIterator = arrayList2.listIterator(arrayList2.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        objPrevious = listIterator.previous();
                        if (((ClientOnlineInfo) objPrevious).getOnlineInfoEntity().getUserId() == teamUser.getUserId()) {
                            break;
                        }
                    } else {
                        objPrevious = null;
                        break;
                    }
                }
                ClientOnlineInfo clientOnlineInfo = (ClientOnlineInfo) objPrevious;
                if (clientOnlineInfo == null || (onlineInfoEntity = clientOnlineInfo.getOnlineInfoEntity()) == null || (device = onlineInfoEntity.getDevice()) == null || (type = device.getType()) == null) {
                    type = "";
                }
                arrayList.add(TeamUser.copy$default(teamUser, 0L, null, null, false, type, null, null, null, 231, null));
            }
        } while (!wVar.g(value, arrayList));
    }

    public final boolean r(ClientOnlineInfo clientOnlineInfo) {
        t.f(clientOnlineInfo, "onlineInfoEntity");
        if (!this.f38734e.contains(clientOnlineInfo)) {
            this.f38734e.add(clientOnlineInfo);
        }
        return v(this, false, 1, null);
    }

    public final void s(ClientOnlineInfo clientOnlineInfo) {
        t.f(clientOnlineInfo, "onlineInfoEntity");
        if (this.f38734e.contains(clientOnlineInfo)) {
            this.f38734e.remove(clientOnlineInfo);
        }
        v(this, false, 1, null);
    }

    public final boolean w(List list) {
        t.f(list, "presenceList");
        this.f38734e.clear();
        this.f38734e.addAll(list);
        return v(this, false, 1, null);
    }

    public final void x(List list, Integer num, boolean z10) {
        Object value;
        ArrayList arrayList;
        t.f(list, "users");
        w wVar = this.f38736g;
        do {
            value = wVar.getValue();
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (!s.m0(((TeamUser) obj).getUsername())) {
                    arrayList.add(obj);
                }
            }
        } while (!wVar.g(value, arrayList));
        this.f38732c.a(list);
        this.f38735f = num != null ? num.intValue() : 0;
        u(z10);
    }

    @p
    public static final class TeamUser {
        private static final n[] $childSerializers;
        private final Uri avatarUri;
        private final String device;
        private final String fullName;
        private final TeamMemberInvitationStatus invitationStatus;
        private final boolean isOnline;
        private final TeamMemberRole role;
        private final long userId;
        private final String username;
        public static final b Companion = new b(null);
        public static final int $stable = 8;

        public /* synthetic */ class a implements n0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f38743a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f38744b;
            private static final jv.f descriptor;

            static {
                a aVar = new a();
                f38743a = aVar;
                i2 i2Var = new i2("com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository.TeamUser", aVar, 7);
                i2Var.r("userId", false);
                i2Var.r("username", false);
                i2Var.r("full_name", true);
                i2Var.r("isOnline", false);
                i2Var.r("device", false);
                i2Var.r("role", false);
                i2Var.r("invitationStatus", true);
                descriptor = i2Var;
                f38744b = 8;
            }

            private a() {
            }

            @Override // hv.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TeamUser deserialize(kv.e eVar) {
                boolean z10;
                TeamMemberInvitationStatus teamMemberInvitationStatus;
                int i10;
                String str;
                String str2;
                String str3;
                TeamMemberRole teamMemberRole;
                long j10;
                t.f(eVar, "decoder");
                jv.f fVar = descriptor;
                kv.c cVarD = eVar.d(fVar);
                n[] nVarArr = TeamUser.$childSerializers;
                int i11 = 3;
                if (cVarD.l()) {
                    long jO = cVarD.o(fVar, 0);
                    String strB = cVarD.B(fVar, 1);
                    String strB2 = cVarD.B(fVar, 2);
                    boolean zH = cVarD.H(fVar, 3);
                    String strB3 = cVarD.B(fVar, 4);
                    TeamMemberRole teamMemberRole2 = (TeamMemberRole) cVarD.i(fVar, 5, (hv.b) nVarArr[5].getValue(), null);
                    teamMemberInvitationStatus = (TeamMemberInvitationStatus) cVarD.v(fVar, 6, (hv.b) nVarArr[6].getValue(), null);
                    str = strB;
                    z10 = zH;
                    str3 = strB3;
                    str2 = strB2;
                    i10 = 127;
                    teamMemberRole = teamMemberRole2;
                    j10 = jO;
                } else {
                    boolean z11 = true;
                    boolean zH2 = false;
                    String strB4 = null;
                    TeamMemberRole teamMemberRole3 = null;
                    long jO2 = 0;
                    int i12 = 0;
                    TeamMemberInvitationStatus teamMemberInvitationStatus2 = null;
                    String strB5 = null;
                    String strB6 = null;
                    while (z11) {
                        int iD = cVarD.D(fVar);
                        switch (iD) {
                            case -1:
                                z11 = false;
                                i11 = 3;
                                break;
                            case 0:
                                jO2 = cVarD.o(fVar, 0);
                                i12 |= 1;
                                i11 = 3;
                                break;
                            case 1:
                                strB5 = cVarD.B(fVar, 1);
                                i12 |= 2;
                                break;
                            case 2:
                                strB6 = cVarD.B(fVar, 2);
                                i12 |= 4;
                                break;
                            case 3:
                                zH2 = cVarD.H(fVar, i11);
                                i12 |= 8;
                                break;
                            case 4:
                                strB4 = cVarD.B(fVar, 4);
                                i12 |= 16;
                                break;
                            case 5:
                                teamMemberRole3 = (TeamMemberRole) cVarD.i(fVar, 5, (hv.b) nVarArr[5].getValue(), teamMemberRole3);
                                i12 |= 32;
                                break;
                            case 6:
                                teamMemberInvitationStatus2 = (TeamMemberInvitationStatus) cVarD.v(fVar, 6, (hv.b) nVarArr[6].getValue(), teamMemberInvitationStatus2);
                                i12 |= 64;
                                break;
                            default:
                                throw new e0(iD);
                        }
                    }
                    z10 = zH2;
                    teamMemberInvitationStatus = teamMemberInvitationStatus2;
                    i10 = i12;
                    str = strB5;
                    str2 = strB6;
                    str3 = strB4;
                    teamMemberRole = teamMemberRole3;
                    j10 = jO2;
                }
                cVarD.b(fVar);
                return new TeamUser(i10, j10, str, str2, z10, str3, teamMemberRole, teamMemberInvitationStatus, null);
            }

            @Override // hv.r
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(kv.f fVar, TeamUser teamUser) {
                t.f(fVar, "encoder");
                t.f(teamUser, SerializableEvent.VALUE_FIELD);
                jv.f fVar2 = descriptor;
                kv.d dVarD = fVar.d(fVar2);
                TeamUser.write$Self$Termius_app_googleProductionRelease(teamUser, dVarD, fVar2);
                dVarD.b(fVar2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // lv.n0
            public final hv.c[] childSerializers() {
                n[] nVarArr = TeamUser.$childSerializers;
                x2 x2Var = x2.f64817a;
                return new hv.c[]{h1.f64699a, x2Var, x2Var, i.f64704a, x2Var, nVarArr[5].getValue(), iv.a.u((hv.c) nVarArr[6].getValue())};
            }

            @Override // hv.c, hv.r, hv.b
            public final jv.f getDescriptor() {
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
                return a.f38743a;
            }

            public /* synthetic */ b(k kVar) {
                this();
            }
        }

        static {
            r rVar = r.f82638b;
            $childSerializers = new n[]{null, null, null, null, null, ut.o.b(rVar, new iu.a() { // from class: pl.n
                @Override // iu.a
                public final Object a() {
                    return TeamMembersOnlineCacheRepository.TeamUser._childSerializers$_anonymous_();
                }
            }), ut.o.b(rVar, new iu.a() { // from class: pl.o
                @Override // iu.a
                public final Object a() {
                    return TeamMembersOnlineCacheRepository.TeamUser._childSerializers$_anonymous_$0();
                }
            })};
        }

        public /* synthetic */ TeamUser(int i10, long j10, String str, String str2, boolean z10, String str3, TeamMemberRole teamMemberRole, TeamMemberInvitationStatus teamMemberInvitationStatus, s2 s2Var) {
            if (59 != (i10 & 59)) {
                d2.a(i10, 59, a.f38743a.getDescriptor());
            }
            this.userId = j10;
            this.username = str;
            if ((i10 & 4) == 0) {
                this.fullName = "";
            } else {
                this.fullName = str2;
            }
            this.isOnline = z10;
            this.device = str3;
            this.avatarUri = null;
            this.role = teamMemberRole;
            if ((i10 & 64) == 0) {
                this.invitationStatus = null;
            } else {
                this.invitationStatus = teamMemberInvitationStatus;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ hv.c _childSerializers$_anonymous_() {
            return TeamMemberRole.Companion.serializer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ hv.c _childSerializers$_anonymous_$0() {
            return TeamMemberInvitationStatus.Companion.serializer();
        }

        public static /* synthetic */ TeamUser copy$default(TeamUser teamUser, long j10, String str, String str2, boolean z10, String str3, Uri uri, TeamMemberRole teamMemberRole, TeamMemberInvitationStatus teamMemberInvitationStatus, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = teamUser.userId;
            }
            long j11 = j10;
            if ((i10 & 2) != 0) {
                str = teamUser.username;
            }
            String str4 = str;
            if ((i10 & 4) != 0) {
                str2 = teamUser.fullName;
            }
            String str5 = str2;
            if ((i10 & 8) != 0) {
                z10 = teamUser.isOnline;
            }
            return teamUser.copy(j11, str4, str5, z10, (i10 & 16) != 0 ? teamUser.device : str3, (i10 & 32) != 0 ? teamUser.avatarUri : uri, (i10 & 64) != 0 ? teamUser.role : teamMemberRole, (i10 & 128) != 0 ? teamUser.invitationStatus : teamMemberInvitationStatus);
        }

        public static /* synthetic */ void getAvatarUri$annotations() {
        }

        @o("device")
        public static /* synthetic */ void getDevice$annotations() {
        }

        @o("full_name")
        public static /* synthetic */ void getFullName$annotations() {
        }

        @o("invitationStatus")
        public static /* synthetic */ void getInvitationStatus$annotations() {
        }

        @o("role")
        public static /* synthetic */ void getRole$annotations() {
        }

        @o("userId")
        public static /* synthetic */ void getUserId$annotations() {
        }

        @o("username")
        public static /* synthetic */ void getUsername$annotations() {
        }

        @o("isOnline")
        public static /* synthetic */ void isOnline$annotations() {
        }

        public static final /* synthetic */ void write$Self$Termius_app_googleProductionRelease(TeamUser teamUser, kv.d dVar, jv.f fVar) {
            n[] nVarArr = $childSerializers;
            dVar.q(fVar, 0, teamUser.userId);
            dVar.f(fVar, 1, teamUser.username);
            if (dVar.E(fVar, 2) || !t.b(teamUser.fullName, "")) {
                dVar.f(fVar, 2, teamUser.fullName);
            }
            dVar.u(fVar, 3, teamUser.isOnline);
            dVar.f(fVar, 4, teamUser.device);
            dVar.o(fVar, 5, (hv.r) nVarArr[5].getValue(), teamUser.role);
            if (!dVar.E(fVar, 6) && teamUser.invitationStatus == null) {
                return;
            }
            dVar.v(fVar, 6, (hv.r) nVarArr[6].getValue(), teamUser.invitationStatus);
        }

        public final long component1() {
            return this.userId;
        }

        public final String component2() {
            return this.username;
        }

        public final String component3() {
            return this.fullName;
        }

        public final boolean component4() {
            return this.isOnline;
        }

        public final String component5() {
            return this.device;
        }

        public final Uri component6() {
            return this.avatarUri;
        }

        public final TeamMemberRole component7() {
            return this.role;
        }

        public final TeamMemberInvitationStatus component8() {
            return this.invitationStatus;
        }

        public final TeamUser copy(long j10, String str, String str2, boolean z10, String str3, Uri uri, TeamMemberRole teamMemberRole, TeamMemberInvitationStatus teamMemberInvitationStatus) {
            t.f(str, "username");
            t.f(str2, "fullName");
            t.f(str3, "device");
            t.f(teamMemberRole, "role");
            return new TeamUser(j10, str, str2, z10, str3, uri, teamMemberRole, teamMemberInvitationStatus);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TeamUser)) {
                return false;
            }
            TeamUser teamUser = (TeamUser) obj;
            return this.userId == teamUser.userId && t.b(this.username, teamUser.username) && t.b(this.fullName, teamUser.fullName) && this.isOnline == teamUser.isOnline && t.b(this.device, teamUser.device) && t.b(this.avatarUri, teamUser.avatarUri) && this.role == teamUser.role && this.invitationStatus == teamUser.invitationStatus;
        }

        public final Uri getAvatarUri() {
            return this.avatarUri;
        }

        public final String getDevice() {
            return this.device;
        }

        public final String getFullName() {
            return this.fullName;
        }

        public final TeamMemberInvitationStatus getInvitationStatus() {
            return this.invitationStatus;
        }

        public final TeamMemberRole getRole() {
            return this.role;
        }

        public final long getUserId() {
            return this.userId;
        }

        public final String getUsername() {
            return this.username;
        }

        public int hashCode() {
            int iHashCode = ((((((((Long.hashCode(this.userId) * 31) + this.username.hashCode()) * 31) + this.fullName.hashCode()) * 31) + Boolean.hashCode(this.isOnline)) * 31) + this.device.hashCode()) * 31;
            Uri uri = this.avatarUri;
            int iHashCode2 = (((iHashCode + (uri == null ? 0 : uri.hashCode())) * 31) + this.role.hashCode()) * 31;
            TeamMemberInvitationStatus teamMemberInvitationStatus = this.invitationStatus;
            return iHashCode2 + (teamMemberInvitationStatus != null ? teamMemberInvitationStatus.hashCode() : 0);
        }

        public final boolean isOnline() {
            return this.isOnline;
        }

        public String toString() {
            return "TeamUser(userId=" + this.userId + ", username=" + this.username + ", fullName=" + this.fullName + ", isOnline=" + this.isOnline + ", device=" + this.device + ", avatarUri=" + this.avatarUri + ", role=" + this.role + ", invitationStatus=" + this.invitationStatus + ")";
        }

        public TeamUser(long j10, String str, String str2, boolean z10, String str3, Uri uri, TeamMemberRole teamMemberRole, TeamMemberInvitationStatus teamMemberInvitationStatus) {
            t.f(str, "username");
            t.f(str2, "fullName");
            t.f(str3, "device");
            t.f(teamMemberRole, "role");
            this.userId = j10;
            this.username = str;
            this.fullName = str2;
            this.isOnline = z10;
            this.device = str3;
            this.avatarUri = uri;
            this.role = teamMemberRole;
            this.invitationStatus = teamMemberInvitationStatus;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ TeamUser(long r13, java.lang.String r15, java.lang.String r16, boolean r17, java.lang.String r18, android.net.Uri r19, com.server.auditor.ssh.client.synchronization.api.models.teams.TeamMemberRole r20, com.server.auditor.ssh.client.models.TeamMemberInvitationStatus r21, int r22, ju.k r23) {
            /*
                r12 = this;
                r0 = r22
                r1 = r0 & 4
                if (r1 == 0) goto La
                java.lang.String r1 = ""
                r6 = r1
                goto Lc
            La:
                r6 = r16
            Lc:
                r1 = r0 & 32
                r2 = 0
                if (r1 == 0) goto L13
                r9 = r2
                goto L15
            L13:
                r9 = r19
            L15:
                r0 = r0 & 128(0x80, float:1.8E-43)
                if (r0 == 0) goto L24
                r11 = r2
                r3 = r13
                r5 = r15
                r7 = r17
                r8 = r18
                r10 = r20
                r2 = r12
                goto L2f
            L24:
                r11 = r21
                r2 = r12
                r3 = r13
                r5 = r15
                r7 = r17
                r8 = r18
                r10 = r20
            L2f:
                r2.<init>(r3, r5, r6, r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository.TeamUser.<init>(long, java.lang.String, java.lang.String, boolean, java.lang.String, android.net.Uri, com.server.auditor.ssh.client.synchronization.api.models.teams.TeamMemberRole, com.server.auditor.ssh.client.models.TeamMemberInvitationStatus, int, ju.k):void");
        }
    }
}
