package com.server.auditor.ssh.client.synchronization;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.annotation.Keep;
import androidx.lifecycle.k0;
import com.crystalnix.termius.libtermius.wrappers.NewConnectionFlowActivity;
import com.crystalnix.termius.libtermius.wrappers.SessionManager;
import com.server.auditor.ssh.client.app.TermiusApplication;
import com.server.auditor.ssh.client.interactors.HistorySyncProcessInteractor;
import com.server.auditor.ssh.client.interactors.a0;
import com.server.auditor.ssh.client.interactors.a1;
import com.server.auditor.ssh.client.interactors.f0;
import com.server.auditor.ssh.client.interactors.n0;
import com.server.auditor.ssh.client.interactors.o0;
import com.server.auditor.ssh.client.interactors.r0;
import com.server.auditor.ssh.client.navigation.RequireTwoFactorAuthActivity;
import com.server.auditor.ssh.client.repositories.team.TeamMembersOnlineCacheRepository;
import com.server.auditor.ssh.client.synchronization.SyncConstants;
import com.server.auditor.ssh.client.synchronization.api.adapters.UnauthorizedApiResponseEvent;
import com.server.auditor.ssh.client.synchronization.api.models.ApiKey;
import com.server.auditor.ssh.client.synchronization.api.models.changepassword.ChangePasswordModel;
import com.server.auditor.ssh.client.synchronization.api.models.user.CustomerSurveyAction;
import com.server.auditor.ssh.client.synchronization.handleresponse.SyncResultReceiver;
import com.server.auditor.ssh.client.synchronization.merge.exceptions.FailedToDecryptBulkModel;
import com.server.auditor.ssh.client.synchronization.retrofit.SyncRestApiClientFactory;
import com.server.auditor.ssh.client.ui.sessionlogs.domain.d;
import com.server.auditor.ssh.client.ui.sshid.data.remote.repository.SshIdGetInfoApiRepository;
import com.server.auditor.ssh.client.ui.sshid.domain.RequestSshIdDataFromBackendUseCase;
import com.server.auditor.ssh.client.ui.user.domain.UserAvatarDownloadAttemptTimestampRepository;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import cp.b;
import cp.d;
import cp.e;
import cp.f;
import dq.x;
import gp.e;
import gp.v;
import hg.b2;
import il.d0;
import il.u0;
import io.sentry.a1;
import io.sentry.h7;
import io.sentry.i4;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import jg.d;
import jg.s;
import ju.t;
import og.w;
import po.b;
import po.c;
import qi.a;
import qi.g;
import to.c1;
import to.h2;
import to.j2;
import to.l2;
import to.n2;
import to.y;
import ut.m0;
import vl.a;
import vl.b;
import vl.d;
import vl.e;
import vl.f;
import vo.a0;
import vo.u;
import wu.i0;
import wu.j1;
import yg.a;
import yg.d;

/* JADX INFO: loaded from: classes4.dex */
public final class SyncIntentService extends IntentService {
    public static final String DEFAULT_LAST_ACTIVATED_APP_VERSION = "";
    public static final String DEFAULT_LAST_SYNC_TIME = "";
    private static final String NAME_SYNC_INTENT_SERVICE = "SyncIntentService";
    public static final int NETWORK_ERROR_CODE = -100;
    public static final int UNKNOWN_ERROR_CODE = -1;
    private String action;
    private ApiKey apiKey;
    private final k0 bulkAccountResultLiveData;
    private final gp.d clearSshIdDataUseCase;
    private final ut.n collectNotSyncedSessionLogsUseCase$delegate;
    private final gp.g createEncryptByAnnotationCryptorUseCase;
    private final com.server.auditor.ssh.client.interactors.h createRemoteAnnotationCryptorUseCase;
    private final com.server.auditor.ssh.client.interactors.i createRemoteCryptorUseCase;
    private final com.server.auditor.ssh.client.interactors.j createTeamAnnotationCryptorsUseCase;
    private final ut.n historySyncProcessInteractor$delegate;
    private final y historySyncRevisionRepository;
    private final ut.n hostInteractionDaoRepository$delegate;
    private final hg.d insensitiveKeyValueRepository;
    private final mv.b jsonConverter;
    private final ut.n lastConnectionsDaoRepository$delegate;
    private final a0 lastSyncTimeInteractor;
    private final n0 postHistoryConnectionsApiInteractor;
    private final r0 requestHistoryConnectionsApiInteractor;
    private final RequestSshIdDataFromBackendUseCase requestSshIdDataFromBackendUseCase;
    private ResultReceiver resultReceiver;
    private final ut.n sessionLogFileUploadingWorkerRepository$delegate;
    private final ut.n sessionLogsAndLastConnectionsDaoRepository$delegate;
    private final ut.n sessionLogsBookmarksSyncingWorkerRepository$delegate;
    private final ut.n sessionLogsDaoRepository$delegate;
    private final ut.n sessionLogsStorageRepository$delegate;
    private final v shouldRegeneratePasskeysUseCase;
    private final zo.b sshIdDatabaseInteractor;
    private final k0 syncInProgressLiveData;
    private final com.server.auditor.ssh.client.app.a termiusStorage;
    private final ut.n uploadNotSyncedSessionLogsUseCase$delegate;
    private final ut.n vaultLogsSettingsDaoRepository$delegate;
    private final ut.n vaultsApiCoroutineHelper$delegate;
    private final gj.b vaultsDbInteractor;
    private final pl.q vaultsKeyringRepository;
    private final vl.g vaultsRepository;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(ju.k kVar) {
            this();
        }

        private Companion() {
        }
    }

    @Keep
    public static abstract class SshIdAction implements Parcelable {
        public static final int $stable = 0;

        public static final class CaRegeneration extends SshIdAction {
            public static final CaRegeneration INSTANCE = new CaRegeneration();
            public static final Parcelable.Creator<CaRegeneration> CREATOR = new Creator();
            public static final int $stable = 8;

            public static final class Creator implements Parcelable.Creator<CaRegeneration> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CaRegeneration createFromParcel(Parcel parcel) {
                    t.f(parcel, "parcel");
                    parcel.readInt();
                    return CaRegeneration.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CaRegeneration[] newArray(int i10) {
                    return new CaRegeneration[i10];
                }
            }

            private CaRegeneration() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof CaRegeneration);
            }

            public int hashCode() {
                return 1943415179;
            }

            public String toString() {
                return "CaRegeneration";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                t.f(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        public static final class NoNeedActions extends SshIdAction {
            public static final NoNeedActions INSTANCE = new NoNeedActions();
            public static final Parcelable.Creator<NoNeedActions> CREATOR = new Creator();
            public static final int $stable = 8;

            public static final class Creator implements Parcelable.Creator<NoNeedActions> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final NoNeedActions createFromParcel(Parcel parcel) {
                    t.f(parcel, "parcel");
                    parcel.readInt();
                    return NoNeedActions.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final NoNeedActions[] newArray(int i10) {
                    return new NoNeedActions[i10];
                }
            }

            private NoNeedActions() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof NoNeedActions);
            }

            public int hashCode() {
                return 268099652;
            }

            public String toString() {
                return "NoNeedActions";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                t.f(parcel, "dest");
                parcel.writeInt(1);
            }
        }

        public static final class PasskeysRegeneration extends SshIdAction {
            private final String caKey;
            public static final Parcelable.Creator<PasskeysRegeneration> CREATOR = new Creator();
            public static final int $stable = 8;

            public static final class Creator implements Parcelable.Creator<PasskeysRegeneration> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PasskeysRegeneration createFromParcel(Parcel parcel) {
                    t.f(parcel, "parcel");
                    return new PasskeysRegeneration(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PasskeysRegeneration[] newArray(int i10) {
                    return new PasskeysRegeneration[i10];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PasskeysRegeneration(String str) {
                super(null);
                t.f(str, "caKey");
                this.caKey = str;
            }

            public static /* synthetic */ PasskeysRegeneration copy$default(PasskeysRegeneration passkeysRegeneration, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = passkeysRegeneration.caKey;
                }
                return passkeysRegeneration.copy(str);
            }

            public final String component1() {
                return this.caKey;
            }

            public final PasskeysRegeneration copy(String str) {
                t.f(str, "caKey");
                return new PasskeysRegeneration(str);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PasskeysRegeneration) && t.b(this.caKey, ((PasskeysRegeneration) obj).caKey);
            }

            public final String getCaKey() {
                return this.caKey;
            }

            public int hashCode() {
                return this.caKey.hashCode();
            }

            public String toString() {
                return "PasskeysRegeneration(caKey=" + this.caKey + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                t.f(parcel, "dest");
                parcel.writeString(this.caKey);
            }
        }

        public /* synthetic */ SshIdAction(ju.k kVar) {
            this();
        }

        private SshIdAction() {
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.synchronization.SyncIntentService$performHistorySyncProcess$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "com.server.auditor.ssh.client.synchronization.SyncIntentService$performHistorySyncProcess$1", f = "SyncIntentService.kt", l = {1376}, m = "invokeSuspend")
    static final class C14701 extends kotlin.coroutines.jvm.internal.m implements iu.p {
        final /* synthetic */ dq.s $personalVaultKeyData;
        final /* synthetic */ List<x> $teamKeys;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.synchronization.SyncIntentService$performHistorySyncProcess$1$1, reason: invalid class name and collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.server.auditor.ssh.client.synchronization.SyncIntentService$performHistorySyncProcess$1$1", f = "SyncIntentService.kt", l = {1382}, m = "invokeSuspend")
        static final class C06021 extends kotlin.coroutines.jvm.internal.m implements iu.p {
            int label;
            final /* synthetic */ SyncIntentService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C06021(SyncIntentService syncIntentService, zt.e<? super C06021> eVar) {
                super(2, eVar);
                this.this$0 = syncIntentService;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e<m0> create(Object obj, zt.e<?> eVar) {
                return new C06021(this.this$0, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = au.b.f();
                int i10 = this.label;
                if (i10 == 0) {
                    ut.x.b(obj);
                    n2 uploadNotSyncedSessionLogsUseCase = this.this$0.getUploadNotSyncedSessionLogsUseCase();
                    Context contextF = TermiusApplication.F();
                    t.e(contextF, "getTermiusAppContext(...)");
                    this.label = 1;
                    if (uploadNotSyncedSessionLogsUseCase.a(contextF, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ut.x.b(obj);
                }
                return m0.f82633a;
            }

            @Override // iu.p
            public final Object invoke(i0 i0Var, zt.e<? super m0> eVar) {
                return ((C06021) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.synchronization.SyncIntentService$performHistorySyncProcess$1$2, reason: invalid class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.server.auditor.ssh.client.synchronization.SyncIntentService$performHistorySyncProcess$1$2", f = "SyncIntentService.kt", l = {}, m = "invokeSuspend")
        static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.m implements iu.p {
            int label;
            final /* synthetic */ SyncIntentService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(SyncIntentService syncIntentService, zt.e<? super AnonymousClass2> eVar) {
                super(2, eVar);
                this.this$0 = syncIntentService;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e<m0> create(Object obj, zt.e<?> eVar) {
                return new AnonymousClass2(this.this$0, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                au.b.f();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
                this.this$0.getSessionLogsBookmarksSyncingWorkerRepository().j();
                return m0.f82633a;
            }

            @Override // iu.p
            public final Object invoke(i0 i0Var, zt.e<? super m0> eVar) {
                return ((AnonymousClass2) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14701(dq.s sVar, List<x> list, zt.e<? super C14701> eVar) {
            super(2, eVar);
            this.$personalVaultKeyData = sVar;
            this.$teamKeys = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e<m0> create(Object obj, zt.e<?> eVar) {
            C14701 c14701 = SyncIntentService.this.new C14701(this.$personalVaultKeyData, this.$teamKeys, eVar);
            c14701.L$0 = obj;
            return c14701;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C14701 c14701;
            i0 i0Var;
            Object objF = au.b.f();
            int i10 = this.label;
            if (i10 == 0) {
                ut.x.b(obj);
                i0 i0Var2 = (i0) this.L$0;
                HistorySyncProcessInteractor historySyncProcessInteractor = SyncIntentService.this.getHistorySyncProcessInteractor();
                dq.s sVar = this.$personalVaultKeyData;
                List<x> list = this.$teamKeys;
                this.L$0 = i0Var2;
                this.label = 1;
                c14701 = this;
                Object objQ = HistorySyncProcessInteractor.q(historySyncProcessInteractor, null, sVar, list, 0, c14701, 9, null);
                if (objQ == objF) {
                    return objF;
                }
                i0Var = i0Var2;
                obj = objQ;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i0Var = (i0) this.L$0;
                ut.x.b(obj);
                c14701 = this;
            }
            HistorySyncProcessInteractor.HistorySyncProcessResultCode historySyncProcessResultCode = (HistorySyncProcessInteractor.HistorySyncProcessResultCode) obj;
            if (historySyncProcessResultCode instanceof HistorySyncProcessInteractor.HistorySyncProcessResultCode.Success) {
                wu.k.d(i0Var, null, null, new C06021(SyncIntentService.this, null), 3, null);
                wu.k.d(i0Var, null, null, new AnonymousClass2(SyncIntentService.this, null), 3, null);
            }
            tp.g.a().k(new oh.a());
            return historySyncProcessResultCode;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e<? super HistorySyncProcessInteractor.HistorySyncProcessResultCode> eVar) {
            return ((C14701) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.synchronization.SyncIntentService$refreshUserAvatar$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "com.server.auditor.ssh.client.synchronization.SyncIntentService$refreshUserAvatar$1", f = "SyncIntentService.kt", l = {1773}, m = "invokeSuspend")
    static final class C14711 extends kotlin.coroutines.jvm.internal.m implements iu.p {
        final /* synthetic */ com.server.auditor.ssh.client.interactors.n $getOrDownloadUserAvatarUseCase;
        final /* synthetic */ long $userId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14711(com.server.auditor.ssh.client.interactors.n nVar, long j10, zt.e<? super C14711> eVar) {
            super(2, eVar);
            this.$getOrDownloadUserAvatarUseCase = nVar;
            this.$userId = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e<m0> create(Object obj, zt.e<?> eVar) {
            return new C14711(this.$getOrDownloadUserAvatarUseCase, this.$userId, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
                return obj;
            }
            ut.x.b(obj);
            Context contextF = TermiusApplication.F();
            t.e(contextF, "getTermiusAppContext(...)");
            com.server.auditor.ssh.client.interactors.n nVar = this.$getOrDownloadUserAvatarUseCase;
            long j10 = this.$userId;
            this.label = 1;
            Object objD = nVar.d(contextF, j10, this);
            return objD == objF ? objF : objD;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e<? super Uri> eVar) {
            return ((C14711) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.synchronization.SyncIntentService$requestSshIdData$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "com.server.auditor.ssh.client.synchronization.SyncIntentService$requestSshIdData$1", f = "SyncIntentService.kt", l = {1396, 1403, 1405, 1409, 1417, 1422, 1423, 1424, 1426, 1427, 1428, 1436}, m = "invokeSuspend")
    static final class C14721 extends kotlin.coroutines.jvm.internal.m implements iu.p {
        final /* synthetic */ dq.s $personalVaultKeyData;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14721(dq.s sVar, zt.e<? super C14721> eVar) {
            super(2, eVar);
            this.$personalVaultKeyData = sVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$2(gp.e eVar, a1 a1Var) {
            io.sentry.f fVarB = y9.b.b("Error while clearing the SSH ID-related database", b.a.f70430c, c.C1098c.f70437b);
            fVarB.F(h7.ERROR);
            e.a aVar = (e.a) eVar;
            fVarB.E("Clearing SSH ID database step", aVar.b());
            fVarB.E("Clearing SSH ID database exception info", aVar.a());
            a1Var.b(fVarB);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e<m0> create(Object obj, zt.e<?> eVar) {
            return SyncIntentService.this.new C14721(this.$personalVaultKeyData, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:62:0x0160, code lost:
        
            if (r8.c(r7) != r0) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:85:0x01d6, code lost:
        
            if (r8 == r0) goto L86;
         */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00de  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00e8  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00f6  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00f9  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0125  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0152  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0167  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x018a  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x01b0  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x01bf  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                Method dump skipped, instruction units count: 566
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.synchronization.SyncIntentService.C14721.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e<? super SshIdAction> eVar) {
            return ((C14721) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.synchronization.SyncIntentService$vaultsListUpdateRequest$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "com.server.auditor.ssh.client.synchronization.SyncIntentService$vaultsListUpdateRequest$1", f = "SyncIntentService.kt", l = {660}, m = "invokeSuspend")
    static final class C14731 extends kotlin.coroutines.jvm.internal.m implements iu.p {
        int label;

        C14731(zt.e<? super C14731> eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e<m0> create(Object obj, zt.e<?> eVar) {
            return SyncIntentService.this.new C14731(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.label;
            if (i10 == 0) {
                ut.x.b(obj);
                VaultsApiCoroutineHelper vaultsApiCoroutineHelper = SyncIntentService.this.getVaultsApiCoroutineHelper();
                this.label = 1;
                if (vaultsApiCoroutineHelper.updateVaultsListBlocking(this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e<? super m0> eVar) {
            return ((C14731) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SyncIntentService() {
        super(NAME_SYNC_INTENT_SERVICE);
        this.action = "";
        com.server.auditor.ssh.client.app.a aVarN = com.server.auditor.ssh.client.app.a.N();
        this.termiusStorage = aVarN;
        hg.d dVarM = aVarN.M();
        t.e(dVarM, "getInsensitiveKeyValueRepository(...)");
        this.insensitiveKeyValueRepository = dVarM;
        b2 b2Var = b2.f52944a;
        this.jsonConverter = b2Var.s1();
        this.vaultLogsSettingsDaoRepository$delegate = ut.o.a(new iu.a() { // from class: com.server.auditor.ssh.client.synchronization.e
            @Override // iu.a
            public final Object a() {
                return SyncIntentService.vaultLogsSettingsDaoRepository_delegate$lambda$0();
            }
        });
        this.hostInteractionDaoRepository$delegate = ut.o.a(new iu.a() { // from class: com.server.auditor.ssh.client.synchronization.k
            @Override // iu.a
            public final Object a() {
                return SyncIntentService.hostInteractionDaoRepository_delegate$lambda$1();
            }
        });
        this.lastConnectionsDaoRepository$delegate = ut.o.a(new iu.a() { // from class: com.server.auditor.ssh.client.synchronization.l
            @Override // iu.a
            public final Object a() {
                return SyncIntentService.lastConnectionsDaoRepository_delegate$lambda$2();
            }
        });
        this.sessionLogsAndLastConnectionsDaoRepository$delegate = ut.o.a(new iu.a() { // from class: com.server.auditor.ssh.client.synchronization.m
            @Override // iu.a
            public final Object a() {
                return SyncIntentService.sessionLogsAndLastConnectionsDaoRepository_delegate$lambda$3();
            }
        });
        this.sessionLogsDaoRepository$delegate = ut.o.a(new iu.a() { // from class: com.server.auditor.ssh.client.synchronization.n
            @Override // iu.a
            public final Object a() {
                return SyncIntentService.sessionLogsDaoRepository_delegate$lambda$4();
            }
        });
        this.lastSyncTimeInteractor = new a0(dVarM);
        this.bulkAccountResultLiveData = aVarN.D();
        k0 k0VarP = aVarN.P();
        t.e(k0VarP, "getIsSyncingLiveData(...)");
        this.syncInProgressLiveData = k0VarP;
        j1 j1VarB1 = b2Var.B1();
        t.e(aVarN, "termiusStorage");
        pl.q qVar = new pl.q(j1VarB1, dVarM, k0VarP, aVarN, new pl.h(null, 1, 0 == true ? 1 : 0), new pp.b(b2Var.v1()), new d.a(), new a.C1401a());
        this.vaultsKeyringRepository = qVar;
        vl.g gVarB = vl.g.f83702b.b();
        this.vaultsRepository = gVarB;
        this.vaultsDbInteractor = new gj.b(gVarB);
        this.vaultsApiCoroutineHelper$delegate = ut.o.a(new iu.a() { // from class: com.server.auditor.ssh.client.synchronization.o
            @Override // iu.a
            public final Object a() {
                return SyncIntentService.vaultsApiCoroutineHelper_delegate$lambda$5(this.f39080a);
            }
        });
        t.e(aVarN, "termiusStorage");
        this.createRemoteCryptorUseCase = new com.server.auditor.ssh.client.interactors.i(aVarN);
        this.createRemoteAnnotationCryptorUseCase = new com.server.auditor.ssh.client.interactors.h();
        t.e(aVarN, "termiusStorage");
        this.createTeamAnnotationCryptorsUseCase = new com.server.auditor.ssh.client.interactors.j(aVarN);
        int i10 = 3;
        this.clearSshIdDataUseCase = new gp.d(0 == true ? 1 : 0, 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
        this.shouldRegeneratePasskeysUseCase = new v(0 == true ? 1 : 0, 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
        y yVar = new y(dVarM);
        this.historySyncRevisionRepository = yVar;
        this.postHistoryConnectionsApiInteractor = new n0(new d0(b2Var.O1(), b2Var.B1()), yVar);
        this.requestHistoryConnectionsApiInteractor = new r0(new il.i0(b2Var.O1(), b2Var.B1()), yVar);
        this.sessionLogsStorageRepository$delegate = ut.o.a(new iu.a() { // from class: com.server.auditor.ssh.client.synchronization.p
            @Override // iu.a
            public final Object a() {
                return SyncIntentService.sessionLogsStorageRepository_delegate$lambda$6();
            }
        });
        this.collectNotSyncedSessionLogsUseCase$delegate = ut.o.a(new iu.a() { // from class: com.server.auditor.ssh.client.synchronization.q
            @Override // iu.a
            public final Object a() {
                return SyncIntentService.collectNotSyncedSessionLogsUseCase_delegate$lambda$7(this.f39081a);
            }
        });
        this.sessionLogFileUploadingWorkerRepository$delegate = ut.o.a(new iu.a() { // from class: com.server.auditor.ssh.client.synchronization.f
            @Override // iu.a
            public final Object a() {
                return SyncIntentService.sessionLogFileUploadingWorkerRepository_delegate$lambda$8(this.f39073a);
            }
        });
        this.sessionLogsBookmarksSyncingWorkerRepository$delegate = ut.o.a(new iu.a() { // from class: com.server.auditor.ssh.client.synchronization.g
            @Override // iu.a
            public final Object a() {
                return SyncIntentService.sessionLogsBookmarksSyncingWorkerRepository_delegate$lambda$9();
            }
        });
        this.historySyncProcessInteractor$delegate = ut.o.a(new iu.a() { // from class: com.server.auditor.ssh.client.synchronization.i
            @Override // iu.a
            public final Object a() {
                return SyncIntentService.historySyncProcessInteractor_delegate$lambda$10(this.f39075a);
            }
        });
        this.uploadNotSyncedSessionLogsUseCase$delegate = ut.o.a(new iu.a() { // from class: com.server.auditor.ssh.client.synchronization.j
            @Override // iu.a
            public final Object a() {
                return SyncIntentService.uploadNotSyncedSessionLogsUseCase_delegate$lambda$11(this.f39076a);
            }
        });
        this.sshIdDatabaseInteractor = new zo.b(e.a.b(cp.e.f46961d, null, 1, null), f.a.b(cp.f.f47012b, null, 1, null), d.a.b(cp.d.f46939d, null, 1, null), b.a.b(cp.b.f46898d, null, 1, null), null, 16, null);
        this.requestSshIdDataFromBackendUseCase = new RequestSshIdDataFromBackendUseCase(new SshIdGetInfoApiRepository(b2Var.O1(), b2Var.B1()));
        t.e(aVarN, "termiusStorage");
        this.createEncryptByAnnotationCryptorUseCase = new gp.g(aVarN, qVar, b2Var.O1());
    }

    private final boolean abortSyncIfBulkResultFailedByOtherReasons(int i10, Bundle bundle) {
        if (i10 >= 200 && i10 < 300) {
            return false;
        }
        updateSyncingProgressState(false);
        if (i10 == -1) {
            sendSyncFailedEventCauseNetworkError();
        } else {
            sendSyncFailedEventCauseBackendUnavailable(i10);
        }
        bundle.putString(SyncConstants.Bundle.ACTION, this.action);
        ResultReceiver resultReceiver = this.resultReceiver;
        if (resultReceiver == null) {
            return true;
        }
        resultReceiver.send(i10, bundle);
        return true;
    }

    private final boolean abortSyncIfNotUnauthorized(int i10, Bundle bundle) {
        if (i10 != 401) {
            return false;
        }
        updateSyncingProgressState(false);
        ResultReceiver resultReceiver = this.resultReceiver;
        if (resultReceiver == null) {
            tp.g.a().k(new UnauthorizedApiResponseEvent());
            return true;
        }
        bundle.putString(SyncConstants.Bundle.ACTION, this.action);
        resultReceiver.send(SyncConstants.ResultCode.UNAUTHORIZED, bundle);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final to.k collectNotSyncedSessionLogsUseCase_delegate$lambda$7(SyncIntentService syncIntentService) {
        vl.b lastConnectionsDaoRepository = syncIntentService.getLastConnectionsDaoRepository();
        vl.e sessionLogsDaoRepository = syncIntentService.getSessionLogsDaoRepository();
        c1 sessionLogsStorageRepository = syncIntentService.getSessionLogsStorageRepository();
        vl.e sessionLogsDaoRepository2 = syncIntentService.getSessionLogsDaoRepository();
        com.server.auditor.ssh.client.app.a aVar = syncIntentService.termiusStorage;
        t.e(aVar, "termiusStorage");
        to.m mVar = new to.m(sessionLogsDaoRepository2, new to.b(aVar, syncIntentService.getLastConnectionsDaoRepository(), syncIntentService.getSessionLogsDaoRepository(), syncIntentService.getSessionLogsStorageRepository()));
        to.f fVar = new to.f();
        SessionManager sessionManager = SessionManager.getInstance();
        t.e(sessionManager, "getInstance(...)");
        return new to.k(lastConnectionsDaoRepository, sessionLogsDaoRepository, sessionLogsStorageRepository, mVar, fVar, sessionManager);
    }

    private final s.a createUserProfileApiInteractorCallback() {
        return new s.a() { // from class: com.server.auditor.ssh.client.synchronization.SyncIntentService.createUserProfileApiInteractorCallback.1
            @Override // jg.s.a
            public void requestFirstSync() throws IllegalAccessException, FailedToDecryptBulkModel, IOException, FailedToEncryptException {
                SyncIntentService.this.performFirstSyncAction(new Bundle());
            }

            @Override // jg.s.a
            public void sendResponseCodeNetworkError() {
                ResultReceiver resultReceiver = SyncIntentService.this.resultReceiver;
                if (resultReceiver != null) {
                    SyncIntentService syncIntentService = SyncIntentService.this;
                    Bundle bundle = new Bundle();
                    bundle.putString(SyncConstants.Bundle.ACTION, syncIntentService.action);
                    resultReceiver.send(-1, bundle);
                }
            }

            @Override // jg.s.a
            public void sendResponseCodeOutdated(String str) {
                t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
                ResultReceiver resultReceiver = SyncIntentService.this.resultReceiver;
                if (resultReceiver != null) {
                    SyncIntentService syncIntentService = SyncIntentService.this;
                    Bundle bundle = new Bundle();
                    bundle.putString(SyncConstants.Bundle.ACTION, syncIntentService.action);
                    bundle.putString(SyncConstants.Bundle.RESULT_OUTDATED_VERSION_MESSAGE, str);
                    resultReceiver.send(SyncConstants.ResultCode.MINIMAL_VERSION_ERROR, bundle);
                }
            }

            @Override // jg.s.a
            public void sendResponseCodeUnauthorized() {
                ResultReceiver resultReceiver = SyncIntentService.this.resultReceiver;
                if (resultReceiver == null) {
                    tp.g.a().k(new UnauthorizedApiResponseEvent());
                    return;
                }
                SyncIntentService syncIntentService = SyncIntentService.this;
                Bundle bundle = new Bundle();
                bundle.putString(SyncConstants.Bundle.ACTION, syncIntentService.action);
                resultReceiver.send(SyncConstants.ResultCode.UNAUTHORIZED, bundle);
            }

            @Override // jg.s.a
            public void sendResponseCodeUnexpectedError() {
                ResultReceiver resultReceiver = SyncIntentService.this.resultReceiver;
                if (resultReceiver != null) {
                    SyncIntentService syncIntentService = SyncIntentService.this;
                    Bundle bundle = new Bundle();
                    bundle.putString(SyncConstants.Bundle.ACTION, syncIntentService.action);
                    resultReceiver.send(0, bundle);
                }
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void generateAndStoreTeamSshKey() {
        /*
            r7 = this;
            com.server.auditor.ssh.client.app.a r0 = r7.termiusStorage
            byte[] r0 = r0.a0()
            r1 = 0
            if (r0 == 0) goto L13
            int r0 = r0.length
            r2 = 1
            if (r0 != 0) goto Lf
            r0 = r2
            goto L10
        Lf:
            r0 = r1
        L10:
            if (r0 != 0) goto L13
            goto L14
        L13:
            r2 = r1
        L14:
            hg.d r0 = r7.insensitiveKeyValueRepository
            java.lang.String r3 = "authorized_feature_generate_multi_key_pair"
            boolean r0 = r0.getBoolean(r3, r1)
            if (r2 == 0) goto L7f
            if (r0 != 0) goto L21
            goto L7f
        L21:
            lj.g0 r0 = new lj.g0
            r0.<init>()
            com.crystalnix.termius.libtermius.SshKey r0 = r0.c()
            if (r0 != 0) goto L2d
            goto L7f
        L2d:
            java.lang.String r2 = r0.getPublicKey()
            java.lang.String r0 = r0.getPrivateKey()
            il.s0 r4 = new il.s0
            hg.b2 r5 = hg.b2.f52944a
            com.server.auditor.ssh.client.synchronization.retrofit.SyncRestApiClientFactory r6 = r5.P1()
            wu.j1 r5 = r5.B1()
            r4.<init>(r6, r5)
            ju.t.c(r2)
            il.s0$a r2 = r4.c(r2)
            il.s0$a$d r4 = il.s0.a.d.f56690a
            boolean r2 = ju.t.b(r2, r4)
            if (r2 == 0) goto L7f
            com.server.auditor.ssh.client.app.a r2 = r7.termiusStorage
            ug.c r2 = r2.Q()
            ju.t.c(r0)
            java.nio.charset.Charset r4 = su.d.f78241b
            byte[] r0 = r0.getBytes(r4)
            java.lang.String r4 = "getBytes(...)"
            ju.t.e(r0, r4)
            java.lang.String r4 = "7465616D5F6465766963655F7373685F707269766174655F6B6579"
            r2.g(r4, r0)
            hg.d r0 = r7.insensitiveKeyValueRepository
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.putBoolean(r3, r1)
            r0.apply()
            com.server.auditor.ssh.client.utils.analytics.a r0 = com.server.auditor.ssh.client.utils.analytics.a.y()
            r0.q5()
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.synchronization.SyncIntentService.generateAndStoreTeamSshKey():void");
    }

    private final to.k getCollectNotSyncedSessionLogsUseCase() {
        return (to.k) this.collectNotSyncedSessionLogsUseCase$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HistorySyncProcessInteractor getHistorySyncProcessInteractor() {
        return (HistorySyncProcessInteractor) this.historySyncProcessInteractor$delegate.getValue();
    }

    private final vl.a getHostInteractionDaoRepository() {
        return (vl.a) this.hostInteractionDaoRepository$delegate.getValue();
    }

    private final vl.b getLastConnectionsDaoRepository() {
        return (vl.b) this.lastConnectionsDaoRepository$delegate.getValue();
    }

    private final u getSessionLogFileUploadingWorkerRepository() {
        return (u) this.sessionLogFileUploadingWorkerRepository$delegate.getValue();
    }

    private final vl.d getSessionLogsAndLastConnectionsDaoRepository() {
        return (vl.d) this.sessionLogsAndLastConnectionsDaoRepository$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final vo.a0 getSessionLogsBookmarksSyncingWorkerRepository() {
        return (vo.a0) this.sessionLogsBookmarksSyncingWorkerRepository$delegate.getValue();
    }

    private final vl.e getSessionLogsDaoRepository() {
        return (vl.e) this.sessionLogsDaoRepository$delegate.getValue();
    }

    private final c1 getSessionLogsStorageRepository() {
        return (c1) this.sessionLogsStorageRepository$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n2 getUploadNotSyncedSessionLogsUseCase() {
        return (n2) this.uploadNotSyncedSessionLogsUseCase$delegate.getValue();
    }

    private final com.server.auditor.ssh.client.ui.sessionlogs.domain.d getVaultLogsSettingsDaoRepository() {
        return (com.server.auditor.ssh.client.ui.sessionlogs.domain.d) this.vaultLogsSettingsDaoRepository$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VaultsApiCoroutineHelper getVaultsApiCoroutineHelper() {
        return (VaultsApiCoroutineHelper) this.vaultsApiCoroutineHelper$delegate.getValue();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void handleAction(String str, Bundle bundle, k0 k0Var) {
        try {
            switch (str.hashCode()) {
                case -2008766911:
                    if (str.equals(SyncConstants.Actions.ACTION_CHANGE_PASSWORD)) {
                        restChangePassword(bundle);
                    }
                    break;
                case -1525744923:
                    if (str.equals(SyncConstants.Actions.GET_BULK_WITH_LAST_SYNCED)) {
                        performGetBulkWithLastSyncedAction(bundle);
                    }
                    break;
                case -1225726139:
                    if (str.equals(SyncConstants.Actions.ACTION_FETCH_TEAM_MEMBERS)) {
                        performFetchTeamMembersAction(bundle);
                    }
                    break;
                case -1156628481:
                    if (str.equals(SyncConstants.Actions.ACTION_CHANGE_PASSWORD_V4_1)) {
                        restChangePasswordV41(bundle);
                    }
                    break;
                case -995529113:
                    if (str.equals(SyncConstants.Actions.ACTION_GET_USER_PROFILE)) {
                        restGetUserProfile();
                    }
                    break;
                case -508523253:
                    if (str.equals(SyncConstants.Actions.ACTION_FULL_PROFILE_BULK_SYNC)) {
                        performFullProfileBulkSyncAction(bundle);
                    }
                    break;
                case -135028862:
                    if (str.equals(SyncConstants.Actions.ACTION_FULL_SYNC)) {
                        performFullSyncAction(bundle);
                    }
                    break;
                case 4353724:
                    if (str.equals(SyncConstants.Actions.ACTION_PUT_APP_SETTINGS)) {
                        restPutSettings(bundle);
                    }
                    break;
                case 395782259:
                    if (str.equals(SyncConstants.Actions.ACTION_FIRST_SYNC)) {
                        performFirstSyncAction(bundle);
                    }
                    break;
                case 517087077:
                    if (str.equals(SyncConstants.Actions.ACTION_RELOAD_ALL_DATA)) {
                        restReloadAllData(bundle);
                    }
                    break;
                case 755437866:
                    if (str.equals(SyncConstants.Actions.ACTIVATE_DEVICE)) {
                        performActivateDeviceAction(bundle);
                    }
                    break;
                case 977456457:
                    if (str.equals(SyncConstants.Actions.ACTION_SEND_CUSTOMER_SURVEY_INTERACTION_DATA)) {
                        restSendCustomerSurveyInteractionData(bundle);
                    }
                    break;
                case 1334725555:
                    if (str.equals(SyncConstants.Actions.ACTION_LOGOUT)) {
                        performLogoutAction(bundle);
                    }
                    break;
                case 1519342803:
                    if (str.equals(SyncConstants.Actions.ACTION_UPDATE_SSHID_DATA)) {
                        updateSshIdData(new Bundle(), true);
                    }
                    break;
                case 2032167871:
                    if (str.equals(SyncConstants.Actions.ACTION_VERIFY_EMAIL)) {
                        restVerifyEmail(bundle);
                    }
                    break;
                case 2047097416:
                    if (str.equals(SyncConstants.Actions.ACTION_REGENERATE_CRYPTO_SPECS)) {
                        restRegenerateCryptoSpecs(bundle);
                    }
                    break;
            }
        } catch (IOException e10) {
            if (tp.i.b(this)) {
                y9.a.f86838a.i(e10);
            } else {
                k0Var.n("offline");
            }
            ResultReceiver resultReceiver = this.resultReceiver;
            if (resultReceiver != null) {
                bundle.putString(SyncConstants.Bundle.ACTION, str);
                resultReceiver.send(-100, bundle);
            }
        } catch (Exception e11) {
            if (e11 instanceof hv.q) {
                sendSyncFailedEventSerializationError();
            }
            io.sentry.f fVarC = y9.b.c(null, NAME_SYNC_INTENT_SERVICE, c.C1098c.f70437b, 1, null);
            fVarC.F(h7.ERROR);
            fVarC.E("action", str);
            y9.a aVar = y9.a.f86838a;
            aVar.a(fVarC);
            if (e11 instanceof po.a) {
                po.a aVar2 = (po.a) e11;
                Iterator it = aVar2.b().iterator();
                while (it.hasNext()) {
                    y9.a.f86838a.a((io.sentry.f) it.next());
                }
                y9.a aVar3 = y9.a.f86838a;
                Throwable cause = aVar2.getCause();
                if (cause == null) {
                    cause = e11;
                }
                aVar3.j(cause, new i4() { // from class: com.server.auditor.ssh.client.synchronization.h
                    @Override // io.sentry.i4
                    public final void a(a1 a1Var) {
                        SyncIntentService.handleAction$lambda$18(e11, a1Var);
                    }
                });
            } else {
                aVar.i(e11);
            }
            k0Var.n("failed");
            updateSyncingProgressState(false);
            ResultReceiver resultReceiver2 = this.resultReceiver;
            if (resultReceiver2 != null) {
                bundle.putString(SyncConstants.Bundle.ACTION, str);
                resultReceiver2.send(-1, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleAction$lambda$18(Exception exc, a1 a1Var) {
        t.f(a1Var, "scope");
        Iterator it = ((po.a) exc).a().iterator();
        while (it.hasNext()) {
            a1Var.O((io.sentry.b) it.next());
        }
    }

    private final void handleChangePasswordClientSessionInitErrorV41(ResultReceiver resultReceiver, Bundle bundle, a.AbstractC1138a.C1139a c1139a) {
        y9.a.f86838a.i(new ah.a(c1139a.a()));
        bundle.putString(SyncConstants.Bundle.ACTION, this.action);
        resultReceiver.send(0, bundle);
    }

    private final void handleChangePasswordNetworkErrorV41(ResultReceiver resultReceiver, Bundle bundle) {
        bundle.putString(SyncConstants.Bundle.ACTION, this.action);
        resultReceiver.send(-1, bundle);
    }

    private final void handleChangePasswordOtpTokenRequiredV41(ResultReceiver resultReceiver, Bundle bundle, a.AbstractC1138a.c cVar) {
        bundle.putString(SyncConstants.Bundle.OTP_TOKEN_ERROR_MESSAGE, cVar.a());
        bundle.putString(SyncConstants.Bundle.ACTION, this.action);
        resultReceiver.send(SyncConstants.ResultCode.OTP_CODE_ERROR, bundle);
    }

    private final void handleChangePasswordResponseV41(ResultReceiver resultReceiver, Bundle bundle, a.AbstractC1138a abstractC1138a) {
        if (abstractC1138a instanceof a.AbstractC1138a.d) {
            handleChangePasswordSuccessV41(resultReceiver, bundle, (a.AbstractC1138a.d) abstractC1138a);
            return;
        }
        if (abstractC1138a instanceof a.AbstractC1138a.c) {
            handleChangePasswordOtpTokenRequiredV41(resultReceiver, bundle, (a.AbstractC1138a.c) abstractC1138a);
            return;
        }
        if (abstractC1138a instanceof a.AbstractC1138a.b) {
            handleChangePasswordNetworkErrorV41(resultReceiver, bundle);
            return;
        }
        if (abstractC1138a instanceof a.AbstractC1138a.e) {
            handleChangePasswordThrottlingErrorV41(resultReceiver, bundle, (a.AbstractC1138a.e) abstractC1138a);
        } else if (abstractC1138a instanceof a.AbstractC1138a.f) {
            handleChangePasswordUnexpectedErrorV41(resultReceiver, bundle);
        } else {
            if (!(abstractC1138a instanceof a.AbstractC1138a.C1139a)) {
                throw new ut.s();
            }
            handleChangePasswordClientSessionInitErrorV41(resultReceiver, bundle, (a.AbstractC1138a.C1139a) abstractC1138a);
        }
    }

    private final void handleChangePasswordSuccessV41(ResultReceiver resultReceiver, Bundle bundle, a.AbstractC1138a.d dVar) {
        ApiKey apiKeyA = dVar.a();
        this.apiKey = apiKeyA;
        bundle.putParcelable(SyncConstants.Bundle.API_KEY, apiKeyA);
        bundle.putString(SyncConstants.Bundle.ACTION, this.action);
        resultReceiver.send(SyncConstants.ResultCode.CREATED, bundle);
    }

    private final void handleChangePasswordThrottlingErrorV41(ResultReceiver resultReceiver, Bundle bundle, a.AbstractC1138a.e eVar) {
        bundle.putInt(SyncConstants.Bundle.THROTTLING_SECONDS, eVar.a());
        bundle.putString(SyncConstants.Bundle.ACTION, this.action);
        resultReceiver.send(SyncConstants.ResultCode.THROTTLING_CODE_ERROR, bundle);
    }

    private final void handleChangePasswordUnexpectedErrorV41(ResultReceiver resultReceiver, Bundle bundle) {
        bundle.putString(SyncConstants.Bundle.ACTION, this.action);
        resultReceiver.send(0, bundle);
    }

    private final void handleGeneralUnauthorized(String str, Bundle bundle) {
        ResultReceiver resultReceiver = this.resultReceiver;
        if (resultReceiver != null) {
            bundle.putString(SyncConstants.Bundle.ACTION, str);
            resultReceiver.send(SyncConstants.ResultCode.UNAUTHORIZED, bundle);
        }
    }

    private final void handleIfLogoutAction(String str, Bundle bundle) {
        if (t.b(str, SyncConstants.Actions.ACTION_LOGOUT)) {
            restLogout(bundle.getBoolean(SyncConstants.Bundle.KEEP_BIOMETRIC_KEYS, false), bundle.getInt("LOGOUT_REQUEST_CODE_FIELD_NAME"));
        } else {
            handleGeneralUnauthorized(str, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HistorySyncProcessInteractor historySyncProcessInteractor_delegate$lambda$10(SyncIntentService syncIntentService) {
        com.server.auditor.ssh.client.app.a aVar = syncIntentService.termiusStorage;
        t.e(aVar, "termiusStorage");
        return new HistorySyncProcessInteractor(aVar, syncIntentService.requestHistoryConnectionsApiInteractor, syncIntentService.postHistoryConnectionsApiInteractor, syncIntentService.getLastConnectionsDaoRepository(), syncIntentService.getHostInteractionDaoRepository(), syncIntentService.getSessionLogsDaoRepository(), f.a.b(vl.f.f83698b, null, 1, null), syncIntentService.historySyncRevisionRepository, syncIntentService.createRemoteCryptorUseCase, syncIntentService.createRemoteAnnotationCryptorUseCase, syncIntentService.createTeamAnnotationCryptorsUseCase, new ho.f(), new h2(syncIntentService.getLastConnectionsDaoRepository(), syncIntentService.getSessionLogsStorageRepository()), new j2(syncIntentService.getSessionLogsAndLastConnectionsDaoRepository(), syncIntentService.getSessionLogsStorageRepository(), syncIntentService.getSessionLogsDaoRepository()), new to.q(), syncIntentService.jsonConverter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vl.a hostInteractionDaoRepository_delegate$lambda$1() {
        return a.C1333a.b(vl.a.f83631b, null, 1, null);
    }

    private final boolean isNotAbortingResultCode(int i10) {
        return i10 > 0 && i10 != 401;
    }

    private final boolean isSyncNotPermitted(Bundle bundle) {
        if (!this.insensitiveKeyValueRepository.contains("expired_screen_type")) {
            return false;
        }
        updateSyncingProgressState(false);
        ResultReceiver resultReceiver = this.resultReceiver;
        if (resultReceiver == null) {
            return true;
        }
        bundle.putString(SyncConstants.Bundle.ACTION, this.action);
        resultReceiver.send(SyncConstants.ResultCode.NOT_PERMITTED, bundle);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vl.b lastConnectionsDaoRepository_delegate$lambda$2() {
        return b.a.b(vl.b.f83635b, null, 1, null);
    }

    private final void performActivateDeviceAction(Bundle bundle) throws IllegalAccessException, FailedToDecryptBulkModel, IOException, FailedToEncryptException {
        if (bundle.getBoolean(SyncConstants.Bundle.IS_TRIAL, false)) {
            restPutSettings();
        }
        restSendDevice();
    }

    private final void performFetchTeamMembersAction(Bundle bundle) {
        requestTeamMembersAndInvitesList(bundle.getBoolean(SyncConstants.Bundle.FORCE_PULL_MEMBERS_LIST, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performFirstSyncAction(Bundle bundle) throws IllegalAccessException, FailedToDecryptBulkModel, IOException, FailedToEncryptException {
        if (shouldAbortSyncIfNoProMode(bundle)) {
            return;
        }
        restStartFirstSync(bundle);
        com.server.auditor.ssh.client.utils.analytics.a.y().v6();
    }

    private final void performFullProfileBulkSyncAction(Bundle bundle) throws IllegalAccessException, FailedToDecryptBulkModel, IOException, FailedToEncryptException {
        if (this.termiusStorage.m0()) {
            bundle.putString(SyncConstants.Bundle.ACTION, SyncConstants.Actions.ACTION_FULL_PROFILE_BULK_SYNC);
            ResultReceiver resultReceiver = this.resultReceiver;
            if (resultReceiver != null) {
                resultReceiver.send(0, bundle);
                return;
            }
            return;
        }
        if (RequireTwoFactorAuthActivity.f28500f.b()) {
            return;
        }
        reActivateDeviceOnNewAppVersion();
        int iRestGetUserProfile = restGetUserProfile();
        if (isSyncNotPermitted(bundle)) {
            updateSshIdData$default(this, bundle, false, 2, null);
            return;
        }
        boolean zU0 = this.termiusStorage.u0();
        if (iRestGetUserProfile >= 200 && iRestGetUserProfile < 300 && zU0 && !this.termiusStorage.B0()) {
            refreshUserAvatar();
            restSendBulkPut(bundle, Integer.valueOf(iRestGetUserProfile));
            return;
        }
        if (!zU0) {
            updateSyncingProgressState(false);
            bundle.putString(SyncConstants.Bundle.ACTION, SyncConstants.Actions.ACTION_FULL_PROFILE_BULK_SYNC);
            updateSshIdData$default(this, bundle, false, 2, null);
            ResultReceiver resultReceiver2 = this.resultReceiver;
            if (resultReceiver2 != null) {
                resultReceiver2.send(iRestGetUserProfile, bundle);
                return;
            }
            return;
        }
        updateSyncingProgressState(false);
        ResultReceiver resultReceiver3 = this.resultReceiver;
        if (resultReceiver3 != null) {
            bundle.putString(SyncConstants.Bundle.ACTION, SyncConstants.Actions.ACTION_FULL_PROFILE_BULK_SYNC);
            resultReceiver3.send(iRestGetUserProfile, bundle);
        } else if (iRestGetUserProfile == 401) {
            tp.g.a().k(new UnauthorizedApiResponseEvent());
        }
        if (iRestGetUserProfile == -1) {
            sendSyncFailedEventCauseNetworkError();
        }
    }

    private final void performFullSyncAction(Bundle bundle) throws IllegalAccessException, FailedToDecryptBulkModel, IOException, FailedToEncryptException {
        if (shouldAbortSyncIfNoProMode(bundle)) {
            return;
        }
        restSendBulkPut(bundle, null);
        com.server.auditor.ssh.client.utils.analytics.a.y().v6();
    }

    private final void performGetBulkWithLastSyncedAction(Bundle bundle) throws IllegalAccessException, FailedToDecryptBulkModel, IOException, FailedToEncryptException {
        if (shouldAbortSyncIfNoProMode(bundle)) {
            return;
        }
        int iRestGetUserProfile = restGetUserProfile();
        if (isSyncNotPermitted(bundle)) {
            return;
        }
        if (iRestGetUserProfile < 200 || iRestGetUserProfile >= 300) {
            sendSyncFailedEventCauseBackendUnavailable(iRestGetUserProfile);
            bundle.putString(SyncConstants.Bundle.ACTION, this.action);
            ResultReceiver resultReceiver = this.resultReceiver;
            if (resultReceiver != null) {
                resultReceiver.send(iRestGetUserProfile, bundle);
                return;
            }
            return;
        }
        if (restGetSettings()) {
            restSendBulkGetWithLastSynced(bundle);
            return;
        }
        bundle.putString(SyncConstants.Bundle.ACTION, this.action);
        ResultReceiver resultReceiver2 = this.resultReceiver;
        if (resultReceiver2 != null) {
            resultReceiver2.send(0, bundle);
        }
    }

    private final HistorySyncProcessInteractor.HistorySyncProcessResultCode performHistorySyncProcess(dq.s sVar, List<x> list) {
        return (HistorySyncProcessInteractor.HistorySyncProcessResultCode) wu.j.b(null, new C14701(sVar, list, null), 1, null);
    }

    private final void performLogoutAction(Bundle bundle) {
        restLogout(bundle.getBoolean(SyncConstants.Bundle.KEEP_BIOMETRIC_KEYS, false), bundle.getInt("LOGOUT_REQUEST_CODE_FIELD_NAME"));
    }

    private final void reActivateDeviceOnNewAppVersion() throws IOException {
        int iB;
        if (this.apiKey == null) {
            return;
        }
        String string = this.insensitiveKeyValueRepository.getString("last_activated_app_version", null);
        if (string == null) {
            string = "";
        }
        if (!t.b("7.6.0", string) && (iB = b2.f52944a.h1().b()) >= 200 && iB < 300) {
            SharedPreferences.Editor editorEdit = this.insensitiveKeyValueRepository.edit();
            editorEdit.putString("last_activated_app_version", "7.6.0");
            editorEdit.apply();
        }
    }

    private final void refreshUserAvatar() {
        Integer numQ = this.termiusStorage.q();
        if (numQ != null) {
            long jIntValue = numQ.intValue();
            b2 b2Var = b2.f52944a;
            il.c cVarR0 = b2Var.R0();
            rl.b bVar = new rl.b(b2Var.P1(), b2Var.B1());
            mv.b bVarS1 = b2Var.s1();
            hg.d dVarM = this.termiusStorage.M();
            t.e(dVarM, "getInsensitiveKeyValueRepository(...)");
            wu.j.b(null, new C14711(new com.server.auditor.ssh.client.interactors.n(cVarR0, bVar, new UserAvatarDownloadAttemptTimestampRepository(bVarS1, dVarM)), jIntValue, null), 1, null);
        }
    }

    private final String requestSecurityToken(ResultReceiver resultReceiver, Bundle bundle, byte[] bArr) {
        qi.g gVar = new qi.g(new lg.b(), new og.u());
        ApiKey apiKey = this.apiKey;
        t.c(apiKey);
        g.a aVarD = gVar.d(bArr, apiKey.getToken());
        if (aVarD instanceof g.a.h) {
            return ((g.a.h) aVarD).a();
        }
        if (aVarD instanceof g.a.C1146a) {
            bundle.putString(SyncConstants.Bundle.ACTION, this.action);
            resultReceiver.send(SyncConstants.ResultCode.MINIMAL_VERSION_ERROR, bundle);
            return null;
        }
        if (aVarD instanceof g.a.b) {
            bundle.putString(SyncConstants.Bundle.ACTION, this.action);
            resultReceiver.send(-2, bundle);
            return null;
        }
        if (aVarD instanceof g.a.f) {
            bundle.putString(SyncConstants.Bundle.ACTION, this.action);
            bundle.putString(SyncConstants.Bundle.CHANGE_PASSWORD_ERROR_MESSAGE, ((g.a.f) aVarD).a());
            resultReceiver.send(SyncConstants.ResultCode.BAD_REQUEST, bundle);
            return null;
        }
        if (aVarD instanceof g.a.C1147g) {
            bundle.putString(SyncConstants.Bundle.ACTION, this.action);
            resultReceiver.send(-1, bundle);
            return null;
        }
        if (aVarD instanceof g.a.i) {
            bundle.putString(SyncConstants.Bundle.ACTION, this.action);
            resultReceiver.send(SyncConstants.ResultCode.THROTTLING_CODE_ERROR, bundle);
            return null;
        }
        bundle.putString(SyncConstants.Bundle.ACTION, this.action);
        resultReceiver.send(0, bundle);
        return null;
    }

    private final SshIdAction requestSshIdData(dq.s sVar) {
        return (SshIdAction) wu.j.b(null, new C14721(sVar, null), 1, null);
    }

    private final void requestTeamMembersAndInvitesList(boolean z10) {
        if (this.insensitiveKeyValueRepository.getBoolean("authorized_feature_show_presence_effect", false)) {
            com.server.auditor.ssh.client.app.a aVar = this.termiusStorage;
            t.e(aVar, "termiusStorage");
            b2 b2Var = b2.f52944a;
            pl.j jVarX1 = b2Var.x1();
            pl.i iVarW1 = b2Var.w1();
            il.c cVarR0 = b2Var.R0();
            rl.b bVar = new rl.b(b2Var.P1(), b2Var.B1());
            mv.b bVarS1 = b2Var.s1();
            hg.d dVarM = this.termiusStorage.M();
            t.e(dVarM, "getInsensitiveKeyValueRepository(...)");
            com.server.auditor.ssh.client.interactors.n nVar = new com.server.auditor.ssh.client.interactors.n(cVarR0, bVar, new UserAvatarDownloadAttemptTimestampRepository(bVarS1, dVarM));
            TeamMembersOnlineCacheRepository teamMembersOnlineCacheRepositoryQ1 = b2Var.Q1();
            il.c cVarR02 = b2Var.R0();
            hg.d dVarM2 = this.termiusStorage.M();
            t.e(dVarM2, "getInsensitiveKeyValueRepository(...)");
            u0 u0Var = new u0(dVarM2);
            com.server.auditor.ssh.client.app.a aVar2 = this.termiusStorage;
            t.e(aVar2, "termiusStorage");
            hg.d dVarM3 = this.termiusStorage.M();
            t.e(dVarM3, "getInsensitiveKeyValueRepository(...)");
            new o0(aVar, jVarX1, iVarW1, teamMembersOnlineCacheRepositoryQ1, cVarR02, nVar, u0Var, new f0(aVar2, dVarM3), b2Var.c1()).j(z10);
        }
    }

    private final void resetSyncingProgressState() {
        if (this.insensitiveKeyValueRepository.getBoolean("sync_in_progress", false)) {
            updateSyncingProgressState(false);
        }
    }

    private final void restChangePassword(Bundle bundle) throws IOException {
        int iB;
        String string = bundle.getString(SyncConstants.Bundle.CHANGE_PASSWORD_OBJECT);
        ChangePasswordModel changePasswordModel = null;
        if (string != null) {
            if (string.length() <= 0) {
                string = null;
            }
            if (string != null) {
                try {
                    mv.b bVar = this.jsonConverter;
                    bVar.a();
                    changePasswordModel = (ChangePasswordModel) bVar.b(ChangePasswordModel.Companion.serializer(), string);
                } catch (IllegalArgumentException e10) {
                    y9.a.f86838a.i(e10);
                }
            }
        }
        if (changePasswordModel != null) {
            d.a aVarD = b2.f52944a.W0().d(changePasswordModel);
            if (aVarD instanceof d.a.b) {
                iB = SyncConstants.ResultCode.CREATED;
            } else if (aVarD instanceof d.a.c) {
                bundle.putInt(SyncConstants.Bundle.THROTTLING_SECONDS, ((d.a.c) aVarD).a());
                iB = SyncConstants.ResultCode.THROTTLING_CODE_ERROR;
            } else {
                if (!(aVarD instanceof d.a.C0923a)) {
                    throw new ut.s();
                }
                d.a.C0923a c0923a = (d.a.C0923a) aVarD;
                bundle.putString(SyncConstants.Bundle.ERROR_BODY, c0923a.a());
                iB = c0923a.b();
            }
        } else {
            iB = 0;
        }
        bundle.putString(SyncConstants.Bundle.ACTION, this.action);
        ResultReceiver resultReceiver = this.resultReceiver;
        if (resultReceiver != null) {
            resultReceiver.send(iB, bundle);
        }
    }

    private final void restChangePasswordV41(Bundle bundle) {
        String strRequestSecurityToken;
        ResultReceiver resultReceiver = this.resultReceiver;
        String string = bundle.getString(SyncConstants.Bundle.ENCRYPTED_PRIVATE_KEY);
        String string2 = bundle.getString(SyncConstants.Bundle.PUBLIC_KEY);
        String string3 = bundle.getString(SyncConstants.Bundle.OLD_SALT);
        String string4 = bundle.getString(SyncConstants.Bundle.OLD_HMAC_SALT);
        String string5 = bundle.getString(SyncConstants.Bundle.OTP_TOKEN);
        byte[] byteArray = bundle.getByteArray(SyncConstants.Bundle.OLD_PASSWORD);
        byte[] byteArray2 = bundle.getByteArray(SyncConstants.Bundle.NEW_PASSWORD);
        if (string == null || string2 == null || string3 == null || string4 == null || byteArray == null || byteArray2 == null || resultReceiver == null || (strRequestSecurityToken = requestSecurityToken(resultReceiver, bundle, byteArray)) == null) {
            return;
        }
        handleChangePasswordResponseV41(resultReceiver, bundle, b2.f52944a.V0().d(byteArray2, string, string2, string3, string4, strRequestSecurityToken, string5));
    }

    private final boolean restGetSettings() throws IOException {
        int iD = b2.f52944a.P0().d();
        return iD >= 200 && iD < 300;
    }

    private final int restGetUserProfile() throws IllegalAccessException, FailedToDecryptBulkModel, IOException, FailedToEncryptException {
        this.bulkAccountResultLiveData.n("processing");
        vaultsListUpdateRequest();
        s.b bVarD = b2.f52944a.T1().d(createUserProfileApiInteractorCallback());
        if (bVarD.b() == -1) {
            sendSyncFailedEventCauseNetworkError();
        } else if (bVarD.b() == 400 && (bVarD.a() instanceof hv.q)) {
            sendSyncFailedEventSerializationError();
        }
        return bVarD.b();
    }

    private final void restLogout(boolean z10, int i10) {
        b2.f52944a.z1().e();
        ResultReceiver resultReceiver = this.resultReceiver;
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putString(SyncConstants.Bundle.ACTION, SyncConstants.Actions.ACTION_LOGOUT);
            bundle.putBoolean(SyncConstants.Bundle.KEEP_BIOMETRIC_KEYS, z10);
            bundle.putInt("LOGOUT_REQUEST_CODE_FIELD_NAME", i10);
            resultReceiver.send(SyncConstants.ResultCode.NO_CONTENT, bundle);
        }
    }

    private final void restPutSettings(Bundle bundle) throws IOException {
        ResultReceiver resultReceiver;
        int iRestPutSettings = restPutSettings();
        if (iRestPutSettings < 200 || iRestPutSettings >= 300 || (resultReceiver = this.resultReceiver) == null) {
            return;
        }
        bundle.putString(SyncConstants.Bundle.ACTION, this.action);
        resultReceiver.send(iRestPutSettings, bundle);
    }

    private final void restRegenerateCryptoSpecs(Bundle bundle) throws IOException {
        int iC = b2.f52944a.I1().c();
        bundle.putString(SyncConstants.Bundle.ACTION, this.action);
        ResultReceiver resultReceiver = this.resultReceiver;
        if (resultReceiver != null) {
            resultReceiver.send(iC, bundle);
        }
    }

    private final void restReloadAllData(Bundle bundle) throws IllegalAccessException, FailedToDecryptBulkModel, IOException, FailedToEncryptException {
        hg.f fVarP = hg.f.p();
        fVarP.c().remove(null);
        fVarP.W().remove("biometric_alias IS NULL");
        fVarP.n().remove(null);
        fVarP.S().remove(null);
        fVarP.i().remove("local_config_id IS NULL");
        fVarP.h().remove(null);
        fVarP.a0().remove(null);
        fVarP.c0().remove(null);
        fVarP.M().remove(null);
        fVarP.J().remove(null);
        fVarP.e0().remove(null);
        fVarP.B().remove(null);
        fVarP.r().remove(null);
        fVarP.U().remove(null);
        fVarP.g0().remove(null);
        fVarP.x().remove(null);
        fVarP.O().remove(null);
        fVarP.Q().remove(null);
        fVarP.z().remove(null);
        fVarP.E().remove(null);
        fVarP.G().remove(null);
        restStartFirstSync(bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void restSendBulkGetWithLastSynced(android.os.Bundle r20) throws com.server.auditor.ssh.client.synchronization.merge.exceptions.FailedToDecryptBulkModel, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.synchronization.SyncIntentService.restSendBulkGetWithLastSynced(android.os.Bundle):void");
    }

    private final void restSendBulkPut(Bundle bundle, Integer num) throws IllegalAccessException, FailedToDecryptBulkModel, IOException, FailedToEncryptException {
        if (shouldAbortSyncIfNotAuthorized(bundle)) {
            return;
        }
        String string = this.insensitiveKeyValueRepository.getString(SyncConstants.LastSyncTime.PREFS_LAST_TIME_KEY, "");
        String str = string != null ? string : "";
        if (str.length() == 0) {
            updateSyncingProgressState(false);
            bundle.putString(SyncConstants.Bundle.ACTION, this.action);
            ResultReceiver resultReceiver = this.resultReceiver;
            if (resultReceiver != null) {
                resultReceiver.send(0, bundle);
                return;
            }
            return;
        }
        updateSyncingProgressState(true);
        int iIntValue = num != null ? num.intValue() : restGetUserProfile();
        if (isSyncNotPermitted(bundle) || abortSyncIfNotUnauthorized(iIntValue, bundle) || abortSyncIfBulkResultFailedByOtherReasons(iIntValue, bundle)) {
            return;
        }
        b2 b2Var = b2.f52944a;
        SyncRestApiClientFactory syncRestApiClientFactoryO1 = b2Var.O1();
        ApiKey apiKey = this.apiKey;
        t.c(apiKey);
        HistorySyncProcessInteractor.HistorySyncProcessResultCode historySyncProcessResultCodePerformHistorySyncProcess = null;
        pl.r rVar = (pl.r) wu.j.b(null, new SyncIntentService$restSendBulkPut$keyValidationResult$1(this, syncRestApiClientFactoryO1.createCustomApiKeyApiClient(apiKey), null), 1, null);
        if (shouldAbortSyncDueToInvalidKey(bundle, rVar)) {
            return;
        }
        dq.s sVarB = rVar.b();
        if (sVarB == null) {
            updateSyncingProgressState(false);
            bundle.putString(SyncConstants.Bundle.ACTION, this.action);
            ResultReceiver resultReceiver2 = this.resultReceiver;
            if (resultReceiver2 != null) {
                resultReceiver2.send(0, bundle);
                return;
            }
            return;
        }
        updateSshIdData(bundle, sVarB);
        w wVar = new w(syncRestApiClientFactoryO1, b2Var.B1());
        hg.d dVarM = this.termiusStorage.M();
        t.e(dVarM, "getInsensitiveKeyValueRepository(...)");
        com.server.auditor.ssh.client.utils.analytics.a aVarY = com.server.auditor.ssh.client.utils.analytics.a.y();
        t.e(aVarY, "getInstance(...)");
        a1.a aVar = (a1.a) wu.j.b(null, new SyncIntentService$restSendBulkPut$result$1(new com.server.auditor.ssh.client.interactors.a1(wVar, new BulkResponseHandler(dVarM, aVarY, y9.a.f86838a, this.jsonConverter), new BulkModelCreatorFactory(), this.createRemoteCryptorUseCase, this.createRemoteAnnotationCryptorUseCase, this.createTeamAnnotationCryptorsUseCase), str, sVarB, rVar, this, null), 1, null);
        updateSyncingProgressState(false);
        if (aVar instanceof a1.a.e) {
            this.lastSyncTimeInteractor.c();
            generateAndStoreTeamSshKey();
            historySyncProcessResultCodePerformHistorySyncProcess = performHistorySyncProcess(sVarB, rVar.d());
        } else if (aVar instanceof a1.a.b) {
            bundle.putString(SyncConstants.Bundle.RESULT_OUTDATED_VERSION_MESSAGE, ((a1.a.b) aVar).b().toString());
        } else if (aVar instanceof a1.a.c) {
            bundle.putString(SyncConstants.Bundle.REQUIRE_TWO_FACTOR_AUTH_FOR_TEAM_MEMBERS_MESSAGE, ((a1.a.c) aVar).b());
        } else if (aVar instanceof a1.a.C0430a) {
            bundle.putParcelable(SyncConstants.Bundle.BAD_REQUEST_ERROR, ((a1.a.C0430a) aVar).b());
        } else if (!(aVar instanceof a1.a.d) && !t.b(aVar, a1.a.f.f27273b) && !t.b(aVar, a1.a.g.f27274b)) {
            throw new ut.s();
        }
        bundle.putString(SyncConstants.Bundle.ACTION, this.action);
        bundle.putParcelable(SyncConstants.Bundle.HISTORY_SYNC_RESULT_CODE, historySyncProcessResultCodePerformHistorySyncProcess);
        ResultReceiver resultReceiver3 = this.resultReceiver;
        if (resultReceiver3 != null) {
            resultReceiver3.send(aVar.a(), bundle);
        }
    }

    private final void restSendCustomerSurveyInteractionData(Bundle bundle) {
        CustomerSurveyAction customerSurveyAction = (CustomerSurveyAction) bundle.getSerializable(SyncConstants.Bundle.CUSTOMER_SURVEY_ACTION_TYPE);
        if (customerSurveyAction == null) {
            b2.f52944a.L1().c(System.currentTimeMillis());
            return;
        }
        b2.f52944a.L1().b(customerSurveyAction, (Integer) bundle.getSerializable(SyncConstants.Bundle.CUSTOMER_SURVEY_SCORE), bundle.getLong(SyncConstants.Bundle.CUSTOMER_SURVEY_RATED_TIME_IN_MILLIS), bundle.getString(SyncConstants.Bundle.CUSTOMER_SURVEY_FEEDBACK));
    }

    private final void restSendDevice() throws IllegalAccessException, FailedToDecryptBulkModel, IOException, FailedToEncryptException {
        updateSyncingProgressState(true);
        int iB = b2.f52944a.h1().b();
        if (isNotAbortingResultCode(iB)) {
            iB = restGetUserProfile();
        }
        Bundle bundle = new Bundle();
        updateSshIdData$default(this, bundle, false, 2, null);
        ResultReceiver resultReceiver = this.resultReceiver;
        if (resultReceiver != null) {
            bundle.putString(SyncConstants.Bundle.ACTION, SyncConstants.Actions.ACTIVATE_DEVICE);
            resultReceiver.send(iB, bundle);
        }
    }

    private final void restStartFirstSync(Bundle bundle) throws IllegalAccessException, FailedToDecryptBulkModel, IOException, FailedToEncryptException {
        updateSyncingProgressState(true);
        sendBulkGet(bundle);
    }

    private final void restVerifyEmail(Bundle bundle) throws IOException {
        int iB = b2.f52944a.k1().b();
        ResultReceiver resultReceiver = this.resultReceiver;
        if (resultReceiver != null) {
            bundle.putString(SyncConstants.Bundle.ACTION, this.action);
            resultReceiver.send(iB, bundle);
        }
    }

    private final void sendBulkGet(Bundle bundle) throws IllegalAccessException, FailedToDecryptBulkModel, IOException, FailedToEncryptException {
        ApiKey apiKey = this.apiKey;
        if (apiKey == null) {
            updateSyncingProgressState(false);
            bundle.putString(SyncConstants.Bundle.ACTION, this.action);
            ResultReceiver resultReceiver = this.resultReceiver;
            if (resultReceiver != null) {
                resultReceiver.send(0, bundle);
                return;
            }
            return;
        }
        if (shouldAbortSyncIfNotAuthorized(bundle)) {
            return;
        }
        vaultsListUpdateRequest();
        b2 b2Var = b2.f52944a;
        pl.r rVar = (pl.r) wu.j.b(null, new SyncIntentService$sendBulkGet$keyValidationResult$1(this, b2Var.O1().createCustomApiKeyApiClient(apiKey), null), 1, null);
        if (shouldAbortSyncDueToInvalidKey(bundle, rVar)) {
            return;
        }
        dq.s sVarB = rVar.b();
        if (sVarB == null) {
            updateSyncingProgressState(false);
            bundle.putString(SyncConstants.Bundle.ACTION, this.action);
            ResultReceiver resultReceiver2 = this.resultReceiver;
            if (resultReceiver2 != null) {
                resultReceiver2.send(0, bundle);
                return;
            }
            return;
        }
        updateSshIdData(bundle, sVarB);
        refreshUserAvatar();
        w wVar = new w(b2Var.O1(), b2Var.B1());
        hg.d dVarM = this.termiusStorage.M();
        t.e(dVarM, "getInsensitiveKeyValueRepository(...)");
        com.server.auditor.ssh.client.utils.analytics.a aVarY = com.server.auditor.ssh.client.utils.analytics.a.y();
        t.e(aVarY, "getInstance(...)");
        a1.a aVar = (a1.a) wu.j.b(null, new SyncIntentService$sendBulkGet$result$1(new com.server.auditor.ssh.client.interactors.a1(wVar, new BulkResponseHandler(dVarM, aVarY, y9.a.f86838a, this.jsonConverter), new BulkModelCreatorFactory(), this.createRemoteCryptorUseCase, this.createRemoteAnnotationCryptorUseCase, this.createTeamAnnotationCryptorsUseCase), sVarB, rVar, this, null), 1, null);
        updateSyncingProgressState(false);
        if (aVar instanceof a1.a.e) {
            this.lastSyncTimeInteractor.c();
            this.action = SyncConstants.Actions.ACTION_FULL_SYNC;
            restSendBulkPut(bundle, null);
            return;
        }
        if (aVar instanceof a1.a.C0430a) {
            bundle.putParcelable(SyncConstants.Bundle.BAD_REQUEST_ERROR, ((a1.a.C0430a) aVar).b());
        } else if (aVar instanceof a1.a.c) {
            bundle.putString(SyncConstants.Bundle.REQUIRE_TWO_FACTOR_AUTH_FOR_TEAM_MEMBERS_MESSAGE, ((a1.a.c) aVar).b());
        }
        bundle.putString(SyncConstants.Bundle.ACTION, SyncConstants.Actions.ACTION_FIRST_SYNC);
        ResultReceiver resultReceiver3 = this.resultReceiver;
        if (resultReceiver3 != null) {
            resultReceiver3.send(aVar.a(), bundle);
        }
    }

    private final void sendSyncFailedEventCauseBackendUnavailable(int i10) {
        com.server.auditor.ssh.client.utils.analytics.a.y().v5(i10, SyncConstants.ErrorMessages.BACKEND_API_ISNT_AVAILABLE);
    }

    private final void sendSyncFailedEventCauseNetworkError() {
        com.server.auditor.ssh.client.utils.analytics.a.y().v5(-1, Avo.FailReason.NETWORK_ERROR.toString());
    }

    private final void sendSyncFailedEventSerializationError() {
        com.server.auditor.ssh.client.utils.analytics.a.y().v5(-1, Avo.FailReason.SERIALIZATION_ERROR.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u sessionLogFileUploadingWorkerRepository_delegate$lambda$8(SyncIntentService syncIntentService) {
        Context contextF = TermiusApplication.F();
        t.e(contextF, "getTermiusAppContext(...)");
        com.server.auditor.ssh.client.app.a aVarN = com.server.auditor.ssh.client.app.a.N();
        t.e(aVarN, "getInstance(...)");
        return new u(contextF, aVarN, syncIntentService.getLastConnectionsDaoRepository());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vl.d sessionLogsAndLastConnectionsDaoRepository_delegate$lambda$3() {
        return d.a.b(vl.d.f83673b, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vo.a0 sessionLogsBookmarksSyncingWorkerRepository_delegate$lambda$9() {
        return a0.a.b(vo.a0.f83840d, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vl.e sessionLogsDaoRepository_delegate$lambda$4() {
        return e.a.b(vl.e.f83685b, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c1 sessionLogsStorageRepository_delegate$lambda$6() {
        return new c1();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean shouldAbortSyncDueToInvalidKey(android.os.Bundle r10, pl.r r11) {
        /*
            r9 = this;
            rg.j r0 = new rg.j
            r7 = 63
            r8 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            com.server.auditor.ssh.client.app.a r1 = r9.termiusStorage
            byte[] r1 = r1.a0()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L22
            int r1 = r1.length
            if (r1 != 0) goto L1d
            r1 = r3
            goto L1e
        L1d:
            r1 = r2
        L1e:
            if (r1 != 0) goto L22
            r1 = r3
            goto L23
        L22:
            r1 = r2
        L23:
            com.server.auditor.ssh.client.app.a r4 = r9.termiusStorage
            byte[] r4 = r4.b0()
            if (r4 == 0) goto L35
            int r4 = r4.length
            if (r4 != 0) goto L30
            r4 = r3
            goto L31
        L30:
            r4 = r2
        L31:
            if (r4 != 0) goto L35
            r4 = r3
            goto L36
        L35:
            r4 = r2
        L36:
            if (r1 == 0) goto L3d
            if (r4 == 0) goto L3d
            r0.l()
        L3d:
            com.server.auditor.ssh.client.app.a r0 = r9.termiusStorage
            boolean r0 = r0.B0()
            if (r0 != 0) goto L4d
            boolean r11 = r11.c()
            if (r11 == 0) goto L4c
            goto L4d
        L4c:
            return r2
        L4d:
            r9.updateSyncingProgressState(r2)
            com.server.auditor.ssh.client.app.a r11 = r9.termiusStorage
            boolean r11 = r11.m()
            if (r11 == 0) goto L77
            com.server.auditor.ssh.client.app.a r11 = r9.termiusStorage
            boolean r11 = r11.j()
            if (r11 != 0) goto L77
            com.server.auditor.ssh.client.app.a r11 = r9.termiusStorage
            hg.d r11 = r11.M()
            java.lang.String r0 = "getInsensitiveKeyValueRepository(...)"
            ju.t.e(r11, r0)
            android.content.SharedPreferences$Editor r11 = r11.edit()
            java.lang.String r0 = "relogin_must_send_enable_sharing_screen_shown"
            r11.putBoolean(r0, r3)
            r11.apply()
        L77:
            android.os.ResultReceiver r11 = r9.resultReceiver
            if (r11 == 0) goto L87
            java.lang.String r0 = "bundle_action"
            java.lang.String r1 = r9.action
            r10.putString(r0, r1)
            r0 = 401(0x191, float:5.62E-43)
            r11.send(r0, r10)
        L87:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.synchronization.SyncIntentService.shouldAbortSyncDueToInvalidKey(android.os.Bundle, pl.r):boolean");
    }

    private final boolean shouldAbortSyncIfNoProMode(Bundle bundle) {
        if (com.server.auditor.ssh.client.app.a.N().u0()) {
            return false;
        }
        updateSyncingProgressState(false);
        bundle.putString(SyncConstants.Bundle.ACTION, this.action);
        ResultReceiver resultReceiver = this.resultReceiver;
        if (resultReceiver == null) {
            return true;
        }
        resultReceiver.send(SyncConstants.ResultCode.NOT_PERMITTED, bundle);
        return true;
    }

    private final boolean shouldAbortSyncIfNotAuthorized(Bundle bundle) {
        if (com.server.auditor.ssh.client.app.a.N().r0()) {
            return false;
        }
        updateSyncingProgressState(false);
        bundle.putString(SyncConstants.Bundle.ACTION, this.action);
        ResultReceiver resultReceiver = this.resultReceiver;
        if (resultReceiver == null) {
            return true;
        }
        resultReceiver.send(SyncConstants.ResultCode.UNAUTHORIZED, bundle);
        return true;
    }

    private final void updateSshIdData(Bundle bundle, boolean z10) {
        ResultReceiver resultReceiver;
        ApiKey apiKey = this.apiKey;
        if (apiKey != null) {
            dq.s sVarB = this.vaultsKeyringRepository.f(b2.f52944a.O1().createCustomApiKeyApiClient(apiKey)).b();
            if (sVarB == null) {
                return;
            }
            bundle.putParcelable(SyncConstants.Bundle.NEED_SSH_ID_LOCK_SCREEN, requestSshIdData(sVarB));
            if (!z10 || (resultReceiver = this.resultReceiver) == null) {
                return;
            }
            resultReceiver.send(SyncConstants.ResultCode.OK, bundle);
        }
    }

    static /* synthetic */ void updateSshIdData$default(SyncIntentService syncIntentService, Bundle bundle, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        syncIntentService.updateSshIdData(bundle, z10);
    }

    private final void updateSyncingProgressState(boolean z10) {
        SharedPreferences.Editor editorEdit = this.insensitiveKeyValueRepository.edit();
        editorEdit.putBoolean("sync_in_progress", z10);
        editorEdit.apply();
        this.syncInProgressLiveData.n(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n2 uploadNotSyncedSessionLogsUseCase_delegate$lambda$11(SyncIntentService syncIntentService) {
        return new n2(syncIntentService.getCollectNotSyncedSessionLogsUseCase(), syncIntentService.getSessionLogFileUploadingWorkerRepository());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.server.auditor.ssh.client.ui.sessionlogs.domain.d vaultLogsSettingsDaoRepository_delegate$lambda$0() {
        return d.a.b(com.server.auditor.ssh.client.ui.sessionlogs.domain.d.f40635b, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final VaultsApiCoroutineHelper vaultsApiCoroutineHelper_delegate$lambda$5(SyncIntentService syncIntentService) {
        com.server.auditor.ssh.client.app.a aVar = syncIntentService.termiusStorage;
        t.e(aVar, "termiusStorage");
        gj.b bVar = syncIntentService.vaultsDbInteractor;
        vl.g gVar = syncIntentService.vaultsRepository;
        int i10 = 1;
        pp.i iVar = new pp.i(null, i10, 0 == true ? 1 : 0);
        com.server.auditor.ssh.client.app.a aVar2 = syncIntentService.termiusStorage;
        t.e(aVar2, "termiusStorage");
        return new VaultsApiCoroutineHelper(aVar, bVar, gVar, iVar, new l2(aVar2, syncIntentService.vaultsRepository, syncIntentService.getVaultLogsSettingsDaoRepository(), new to.p(syncIntentService.getLastConnectionsDaoRepository(), syncIntentService.getSessionLogsDaoRepository(), syncIntentService.getSessionLogsStorageRepository())), new pp.g(0 == true ? 1 : 0, i10, 0 == true ? 1 : 0), new to.d(syncIntentService.getVaultLogsSettingsDaoRepository()), new to.c(syncIntentService.getVaultLogsSettingsDaoRepository()));
    }

    private final void vaultsListUpdateRequest() {
        wu.j.b(null, new C14731(null), 1, null);
    }

    @Override // android.app.IntentService, android.app.Service
    @ut.e
    public void onCreate() {
        super.onCreate();
        resetSyncingProgressState();
    }

    @Override // android.app.IntentService
    @ut.e
    protected void onHandleIntent(Intent intent) {
        Bundle extras;
        this.bulkAccountResultLiveData.n("");
        if (intent == null || (extras = intent.getExtras()) == null) {
            return;
        }
        this.resultReceiver = (ResultReceiver) androidx.core.content.b.a(intent, SyncResultReceiver.BUNDLE_RESULT_RECEIVER, ResultReceiver.class);
        String action = intent.getAction();
        this.action = action != null ? action : "";
        if (!tp.i.b(this)) {
            ResultReceiver resultReceiver = this.resultReceiver;
            if (resultReceiver != null) {
                extras.putString(SyncConstants.Bundle.ACTION, this.action);
                resultReceiver.send(-100, extras);
            }
            this.bulkAccountResultLiveData.n("offline");
            return;
        }
        if (this.termiusStorage.B0()) {
            handleIfLogoutAction(this.action, extras);
            return;
        }
        if (extras.containsKey(SyncConstants.Bundle.API_KEY)) {
            this.apiKey = (ApiKey) j4.c.a(extras, SyncConstants.Bundle.API_KEY, ApiKey.class);
        }
        String str = this.action;
        k0 k0Var = this.bulkAccountResultLiveData;
        t.e(k0Var, "bulkAccountResultLiveData");
        handleAction(str, extras, k0Var);
    }

    private final int restPutSettings() throws IOException {
        return b2.f52944a.P0().f();
    }

    private final void updateSshIdData(Bundle bundle, dq.s sVar) {
        bundle.putParcelable(SyncConstants.Bundle.NEED_SSH_ID_LOCK_SCREEN, requestSshIdData(sVar));
        ResultReceiver resultReceiver = this.resultReceiver;
        if (resultReceiver != null) {
            resultReceiver.send(SyncConstants.ResultCode.OK, bundle);
        }
    }
}
