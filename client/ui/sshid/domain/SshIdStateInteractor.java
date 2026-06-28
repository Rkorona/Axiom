package com.server.auditor.ssh.client.ui.sshid.domain;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.widget.RtlSpacingHelper;
import cp.c;
import cp.d;
import cp.e;
import ju.k;
import ju.t;

/* JADX INFO: loaded from: classes4.dex */
public final class SshIdStateInteractor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.server.auditor.ssh.client.app.a f41083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f41084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f41085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f41086d;

    @Keep
    public static abstract class SshIdState implements Parcelable {
        public static final int $stable = 0;

        public static final class FinishSetupRequired extends SshIdState {
            public static final FinishSetupRequired INSTANCE = new FinishSetupRequired();
            public static final Parcelable.Creator<FinishSetupRequired> CREATOR = new a();
            public static final int $stable = 8;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final FinishSetupRequired createFromParcel(Parcel parcel) {
                    t.f(parcel, "parcel");
                    parcel.readInt();
                    return FinishSetupRequired.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final FinishSetupRequired[] newArray(int i10) {
                    return new FinishSetupRequired[i10];
                }
            }

            private FinishSetupRequired() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof FinishSetupRequired);
            }

            public int hashCode() {
                return 1746637276;
            }

            public String toString() {
                return "FinishSetupRequired";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                t.f(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        public static final class PasskeysRequired extends SshIdState {
            public static final PasskeysRequired INSTANCE = new PasskeysRequired();
            public static final Parcelable.Creator<PasskeysRequired> CREATOR = new a();
            public static final int $stable = 8;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final PasskeysRequired createFromParcel(Parcel parcel) {
                    t.f(parcel, "parcel");
                    parcel.readInt();
                    return PasskeysRequired.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final PasskeysRequired[] newArray(int i10) {
                    return new PasskeysRequired[i10];
                }
            }

            private PasskeysRequired() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof PasskeysRequired);
            }

            public int hashCode() {
                return -434438479;
            }

            public String toString() {
                return "PasskeysRequired";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                t.f(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        public static final class ReadyToUse extends SshIdState {
            public static final ReadyToUse INSTANCE = new ReadyToUse();
            public static final Parcelable.Creator<ReadyToUse> CREATOR = new a();
            public static final int $stable = 8;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ReadyToUse createFromParcel(Parcel parcel) {
                    t.f(parcel, "parcel");
                    parcel.readInt();
                    return ReadyToUse.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final ReadyToUse[] newArray(int i10) {
                    return new ReadyToUse[i10];
                }
            }

            private ReadyToUse() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof ReadyToUse);
            }

            public int hashCode() {
                return -81566378;
            }

            public String toString() {
                return "ReadyToUse";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                t.f(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        public static final class SetupRequired extends SshIdState {
            public static final SetupRequired INSTANCE = new SetupRequired();
            public static final Parcelable.Creator<SetupRequired> CREATOR = new a();
            public static final int $stable = 8;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final SetupRequired createFromParcel(Parcel parcel) {
                    t.f(parcel, "parcel");
                    parcel.readInt();
                    return SetupRequired.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final SetupRequired[] newArray(int i10) {
                    return new SetupRequired[i10];
                }
            }

            private SetupRequired() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof SetupRequired);
            }

            public int hashCode() {
                return -1993786897;
            }

            public String toString() {
                return "SetupRequired";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                t.f(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        public /* synthetic */ SshIdState(k kVar) {
            this();
        }

        private SshIdState() {
        }
    }

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f41087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f41088b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f41089c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f41090d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f41092f;

        a(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41090d = obj;
            this.f41092f |= RtlSpacingHelper.UNDEFINED;
            return SshIdStateInteractor.this.a(this);
        }
    }

    public SshIdStateInteractor(com.server.auditor.ssh.client.app.a aVar, e eVar, c cVar, d dVar) {
        t.f(aVar, "termiusStorage");
        t.f(eVar, "sshIdDaoRepository");
        t.f(cVar, "localDeviceBoundKeyDaoRepository");
        t.f(dVar, "remoteDeviceBoundKeyDaoRepository");
        this.f41083a = aVar;
        this.f41084b = eVar;
        this.f41085c = cVar;
        this.f41086d = dVar;
    }

    private final boolean b(boolean z10, boolean z11, boolean z12) {
        return z10 && z11 && z12;
    }

    private final boolean c(boolean z10, boolean z11, boolean z12) {
        if (z10) {
            return (z11 && z12) ? false : true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(zt.e r9) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ui.sshid.domain.SshIdStateInteractor.a(zt.e):java.lang.Object");
    }

    public /* synthetic */ SshIdStateInteractor(com.server.auditor.ssh.client.app.a aVar, e eVar, c cVar, d dVar, int i10, k kVar) {
        this((i10 & 1) != 0 ? com.server.auditor.ssh.client.app.a.N() : aVar, (i10 & 2) != 0 ? e.a.b(e.f46961d, null, 1, null) : eVar, (i10 & 4) != 0 ? c.a.b(c.f46918d, null, 1, null) : cVar, (i10 & 8) != 0 ? d.a.b(d.f46939d, null, 1, null) : dVar);
    }
}
