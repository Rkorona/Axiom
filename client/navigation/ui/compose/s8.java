package com.server.auditor.ssh.client.navigation.ui.compose;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.server.auditor.ssh.client.fragments.editors.choisemanagers.TypefaceModel;
import com.server.auditor.ssh.client.navigation.ui.compose.s8;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s8 {

    static final class a implements iu.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ProfileScreenViewModel f33108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.l5 f33109b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.l5 f33110c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.l5 f33111d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.l5 f33112e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.l5 f33113f;

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.s8$a$a, reason: collision with other inner class name */
        public static final class C0506a extends ju.u implements iu.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0506a f33114a = new C0506a();

            public C0506a() {
                super(1);
            }

            public final void b(Fragment fragment) {
            }

            @Override // iu.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Fragment) obj);
                return ut.m0.f82633a;
            }
        }

        a(ProfileScreenViewModel profileScreenViewModel, androidx.compose.runtime.l5 l5Var, androidx.compose.runtime.l5 l5Var2, androidx.compose.runtime.l5 l5Var3, androidx.compose.runtime.l5 l5Var4, androidx.compose.runtime.l5 l5Var5) {
            this.f33108a = profileScreenViewModel;
            this.f33109b = l5Var;
            this.f33110c = l5Var2;
            this.f33111d = l5Var3;
            this.f33112e = l5Var4;
            this.f33113f = l5Var5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 k(ProfileScreenViewModel profileScreenViewModel) {
            profileScreenViewModel.updateShowFontStyleDialog(false);
            return ut.m0.f82633a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 l(ProfileScreenViewModel profileScreenViewModel, Integer num, String str, TypefaceModel typefaceModel) {
            profileScreenViewModel.updateData(num, str, typefaceModel);
            return ut.m0.f82633a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 m(ProfileScreenViewModel profileScreenViewModel) {
            profileScreenViewModel.updateShowDebugPanel(false);
            return ut.m0.f82633a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 n(ProfileScreenViewModel profileScreenViewModel) {
            profileScreenViewModel.updateShowHelpAndFeedback(false);
            return ut.m0.f82633a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 o(ProfileScreenViewModel profileScreenViewModel) {
            profileScreenViewModel.updateShowNotificationsDialog(false);
            return ut.m0.f82633a;
        }

        public final void i(z.n0 n0Var, androidx.compose.runtime.m mVar, int i10) {
            int i11;
            ju.t.f(n0Var, "innerPaddings");
            if ((i10 & 6) == 0) {
                i11 = i10 | (mVar.V(n0Var) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && mVar.h()) {
                mVar.M();
                return;
            }
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(1556494723, i11, -1, "com.server.auditor.ssh.client.navigation.ui.compose.ProfileScreen.<anonymous> (ProfileScreen.kt:83)");
            }
            v1.m mVarL = androidx.compose.foundation.layout.c0.l(v1.m.f83247a, n0Var);
            mVar.C(1765406104);
            c5.a.a(bm.m.class, mVarL, c5.e.b(mVar, 0), Bundle.EMPTY, C0506a.f33114a, mVar, 0, 0);
            mVar.U();
            boolean zC = s8.c(this.f33109b);
            mVar.W(5004770);
            boolean zF = mVar.F(this.f33108a);
            final ProfileScreenViewModel profileScreenViewModel = this.f33108a;
            Object objD = mVar.D();
            if (zF || objD == androidx.compose.runtime.m.f5359a.a()) {
                objD = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.n8
                    @Override // iu.a
                    public final Object a() {
                        return s8.a.k(profileScreenViewModel);
                    }
                };
                mVar.t(objD);
            }
            iu.a aVar = (iu.a) objD;
            mVar.Q();
            String strD = s8.d(this.f33110c);
            String name = k9.d.f63270c.a().getName();
            mVar.W(5004770);
            boolean zF2 = mVar.F(this.f33108a);
            final ProfileScreenViewModel profileScreenViewModel2 = this.f33108a;
            Object objD2 = mVar.D();
            if (zF2 || objD2 == androidx.compose.runtime.m.f5359a.a()) {
                objD2 = new iu.q() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.o8
                    @Override // iu.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return s8.a.l(profileScreenViewModel2, (Integer) obj, (String) obj2, (TypefaceModel) obj3);
                    }
                };
                mVar.t(objD2);
            }
            mVar.Q();
            p1.c(zC, aVar, strD, name, (iu.q) objD2, null, null, mVar, 0, 96);
            boolean zE = s8.e(this.f33111d);
            mVar.W(5004770);
            boolean zF3 = mVar.F(this.f33108a);
            final ProfileScreenViewModel profileScreenViewModel3 = this.f33108a;
            Object objD3 = mVar.D();
            if (zF3 || objD3 == androidx.compose.runtime.m.f5359a.a()) {
                objD3 = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.p8
                    @Override // iu.a
                    public final Object a() {
                        return s8.a.m(profileScreenViewModel3);
                    }
                };
                mVar.t(objD3);
            }
            mVar.Q();
            g1.b(zE, (iu.a) objD3, null, mVar, 0, 4);
            boolean zF4 = s8.f(this.f33112e);
            mVar.W(5004770);
            boolean zF5 = mVar.F(this.f33108a);
            final ProfileScreenViewModel profileScreenViewModel4 = this.f33108a;
            Object objD4 = mVar.D();
            if (zF5 || objD4 == androidx.compose.runtime.m.f5359a.a()) {
                objD4 = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.q8
                    @Override // iu.a
                    public final Object a() {
                        return s8.a.n(profileScreenViewModel4);
                    }
                };
                mVar.t(objD4);
            }
            mVar.Q();
            d2.e(zF4, (iu.a) objD4, mVar, 0);
            boolean zG = s8.g(this.f33113f);
            mVar.W(5004770);
            boolean zF6 = mVar.F(this.f33108a);
            final ProfileScreenViewModel profileScreenViewModel5 = this.f33108a;
            Object objD5 = mVar.D();
            if (zF6 || objD5 == androidx.compose.runtime.m.f5359a.a()) {
                objD5 = new iu.a() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.r8
                    @Override // iu.a
                    public final Object a() {
                        return s8.a.o(profileScreenViewModel5);
                    }
                };
                mVar.t(objD5);
            }
            mVar.Q();
            h8.c(zG, (iu.a) objD5, mVar, 0);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }

        @Override // iu.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            i((z.n0) obj, (androidx.compose.runtime.m) obj2, ((Number) obj3).intValue());
            return ut.m0.f82633a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(com.server.auditor.ssh.client.navigation.ui.compose.ProfileScreenViewModel r19, androidx.compose.runtime.m r20, final int r21, final int r22) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.s8.b(com.server.auditor.ssh.client.navigation.ui.compose.ProfileScreenViewModel, androidx.compose.runtime.m, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(androidx.compose.runtime.l5 l5Var) {
        return ((Boolean) l5Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d(androidx.compose.runtime.l5 l5Var) {
        return (String) l5Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(androidx.compose.runtime.l5 l5Var) {
        return ((Boolean) l5Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(androidx.compose.runtime.l5 l5Var) {
        return ((Boolean) l5Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(androidx.compose.runtime.l5 l5Var) {
        return ((Boolean) l5Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 h(ProfileScreenViewModel profileScreenViewModel, int i10, int i11, androidx.compose.runtime.m mVar, int i12) {
        b(profileScreenViewModel, mVar, androidx.compose.runtime.e3.a(i10 | 1), i11);
        return ut.m0.f82633a;
    }
}
