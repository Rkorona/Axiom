package com.server.auditor.ssh.client.ui.sshid.presentation.viewmodels;

import androidx.lifecycle.i1;
import androidx.lifecycle.j1;
import com.server.auditor.ssh.client.ui.sshid.data.actions.SshIdShareLinkCardActions;
import ju.t;
import ut.m0;
import ut.x;
import wu.i0;
import zu.k0;
import zu.w;

/* JADX INFO: loaded from: classes4.dex */
public final class SshIdShareLinkCardViewModel extends i1 {
    private final yu.d _cardActionFlow;
    private final w _cardTitle;
    private final zu.f cardActionFlow;
    private final k0 cardTitle;
    private String sshIdKeyType;
    private String sshIdUsername = "";
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41360a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SshIdShareLinkCardViewModel.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f41360a;
            if (i10 == 0) {
                x.b(obj);
                yu.d dVar = SshIdShareLinkCardViewModel.this._cardActionFlow;
                SshIdShareLinkCardActions.a aVar = new SshIdShareLinkCardActions.a(SshIdShareLinkCardViewModel.this.sshIdUsername, SshIdShareLinkCardViewModel.this.sshIdKeyType);
                this.f41360a = 1;
                if (dVar.b(aVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public SshIdShareLinkCardViewModel() {
        w wVarA = zu.m0.a("");
        this._cardTitle = wVarA;
        this.cardTitle = wVarA;
        yu.d dVarB = yu.g.b(-2, null, null, 6, null);
        this._cardActionFlow = dVarB;
        this.cardActionFlow = zu.h.M(dVarB);
    }

    public final zu.f getCardActionFlow() {
        return this.cardActionFlow;
    }

    public final k0 getCardTitle() {
        return this.cardTitle;
    }

    public final void onHandleCardClicked() {
        wu.k.d(j1.a(this), null, null, new b(null), 3, null);
    }

    public final void updateCardData(String str, String str2) {
        t.f(str, "sshIdUsername");
        this.sshIdUsername = str;
        this.sshIdKeyType = str2;
        String str3 = "sshid.io/" + str;
        if (str2 != null) {
            str3 = ((Object) str3) + "/" + str2;
        }
        this._cardTitle.setValue(str3);
    }
}
