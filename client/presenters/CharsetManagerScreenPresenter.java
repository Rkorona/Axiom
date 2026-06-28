package com.server.auditor.ssh.client.presenters;

import com.server.auditor.ssh.client.contracts.k0;
import com.server.auditor.ssh.client.database.SQLiteHelper;
import iu.p;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.SortedMap;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import mq.d;
import ut.m0;
import ut.x;
import wu.i0;
import wu.k;
import zt.e;

/* JADX INFO: loaded from: classes4.dex */
public final class CharsetManagerScreenPresenter extends MvpPresenter<k0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f35427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f35428c;

    public static final class a implements d {
        a() {
        }

        @Override // mq.d
        public void g2(String str) {
            CharsetManagerScreenPresenter.this.getViewState().g2(str);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35430a;

        b(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return CharsetManagerScreenPresenter.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35430a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            CharsetManagerScreenPresenter.this.f35428c.g2(null);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public CharsetManagerScreenPresenter(String str, String str2) {
        t.f(str2, "defaultCharset");
        this.f35426a = str;
        this.f35427b = str2;
        this.f35428c = new a();
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        getViewState().a();
        k0 viewState = getViewState();
        String str = this.f35426a;
        if (str == null) {
            str = SQLiteHelper.DEFAULT_CHARSET;
        }
        viewState.T7(str);
        getViewState().m6(this.f35427b);
        SortedMap<String, Charset> sortedMapAvailableCharsets = Charset.availableCharsets();
        t.e(sortedMapAvailableCharsets, "availableCharsets(...)");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(sortedMapAvailableCharsets.keySet());
        getViewState().Ac(arrayList, this.f35428c, this.f35426a);
    }

    public final void r2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(null), 3, null);
    }
}
