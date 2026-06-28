package com.server.auditor.ssh.client.navigation.ui.compose;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.navigation.ui.compose.viewmodels.HomeScreenViewModel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l8 {
    public static final void c(zu.f fVar, final iu.l lVar, androidx.compose.runtime.m mVar, final int i10) {
        int i11;
        final zu.f fVar2;
        ju.t.f(fVar, "flow");
        ju.t.f(lVar, "onError");
        androidx.compose.runtime.m mVarG = mVar.g(1724302980);
        if ((i10 & 6) == 0) {
            i11 = (mVarG.F(fVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= mVarG.F(lVar) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && mVarG.h()) {
            mVarG.M();
            fVar2 = fVar;
        } else {
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.b0(1724302980, i11, -1, "com.server.auditor.ssh.client.navigation.ui.compose.ObserveAndLaunchActionViewDownloadedItem (ObserveAndLaunchActionViewDownloadedItem.kt:23)");
            }
            final Context context = (Context) mVarG.n(AndroidCompositionLocals_androidKt.g());
            final String strB = z2.h.b(R.string.error_no_app_to_open_file, mVarG, 6);
            final String strB2 = z2.h.b(R.string.error_no_app_to_open_folder, mVarG, 6);
            mVarG.W(-1224400529);
            boolean zF = ((i11 & 112) == 32) | mVarG.F(context) | mVarG.V(strB) | mVarG.V(strB2);
            Object objD = mVarG.D();
            if (zF || objD == androidx.compose.runtime.m.f5359a.a()) {
                objD = new iu.l() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.j8
                    @Override // iu.l
                    public final Object invoke(Object obj) {
                        return l8.d(context, lVar, strB, strB2, (HomeScreenViewModel.b) obj);
                    }
                };
                mVarG.t(objD);
            }
            mVarG.Q();
            fVar2 = fVar;
            np.n.b(fVar2, null, null, (iu.l) objD, mVarG, i11 & 14, 6);
            if (androidx.compose.runtime.w.R()) {
                androidx.compose.runtime.w.a0();
            }
        }
        androidx.compose.runtime.z3 z3VarJ = mVarG.j();
        if (z3VarJ != null) {
            z3VarJ.a(new iu.p() { // from class: com.server.auditor.ssh.client.navigation.ui.compose.k8
                @Override // iu.p
                public final Object invoke(Object obj, Object obj2) {
                    return l8.e(fVar2, lVar, i10, (androidx.compose.runtime.m) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 d(Context context, iu.l lVar, String str, String str2, HomeScreenViewModel.b bVar) {
        v4.a aVarG;
        ju.t.f(bVar, "intent");
        if (bVar instanceof HomeScreenViewModel.b.a) {
            Uri uri = Uri.parse(((HomeScreenViewModel.b.a) bVar).a());
            if (uri != null && (aVarG = v4.a.g(context, uri)) != null && aVarG.e()) {
                aVarG.j();
                Intent intent = new Intent("android.intent.action.VIEW");
                String type = context.getContentResolver().getType(aVarG.j());
                if (type != null) {
                    intent.setDataAndType(uri, type);
                }
                intent.addFlags(1);
                try {
                    context.startActivity(intent);
                } catch (ActivityNotFoundException unused) {
                    lVar.invoke(str);
                }
            }
        } else {
            if (!(bVar instanceof HomeScreenViewModel.b.C0526b)) {
                throw new ut.s();
            }
            Uri uri2 = Uri.parse(((HomeScreenViewModel.b.C0526b) bVar).a());
            if (uri2 != null) {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setDataAndType(uri2, "vnd.android.document/directory");
                intent2.addFlags(1);
                try {
                    context.startActivity(intent2);
                } catch (ActivityNotFoundException unused2) {
                    lVar.invoke(str2);
                }
            }
        }
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 e(zu.f fVar, iu.l lVar, int i10, androidx.compose.runtime.m mVar, int i11) {
        c(fVar, lVar, mVar, androidx.compose.runtime.e3.a(i10 | 1));
        return ut.m0.f82633a;
    }
}
