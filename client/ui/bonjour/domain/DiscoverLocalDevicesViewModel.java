package com.server.auditor.ssh.client.ui.bonjour.domain;

import android.app.Application;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.j1;
import com.server.auditor.ssh.client.fragments.quickconnect.suggestion.models.HostSuggestion;
import iu.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import ut.m0;
import ut.x;
import vt.v;
import wu.i0;
import wu.k;
import yh.d;
import zt.e;
import zu.g;
import zu.g0;
import zu.h;
import zu.k0;
import zu.w;

/* JADX INFO: loaded from: classes4.dex */
public final class DiscoverLocalDevicesViewModel extends AndroidViewModel {
    public static final int $stable = 8;
    private final w _foundHosts;
    private final w _isSearching;
    private final k0 foundHosts;
    private final k0 isSearching;
    private NsdManager.DiscoveryListener nsdDiscoveryListener;
    private d nsdLoader;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39662a;

        a(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return DiscoverLocalDevicesViewModel.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f39662a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            DiscoverLocalDevicesViewModel.this.startDiscovery();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(g gVar, e eVar) {
            return ((a) create(gVar, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public static final class b implements NsdManager.DiscoveryListener {
        b() {
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onDiscoveryStarted(String str) {
            Object value;
            t.f(str, "serviceType");
            w wVar = DiscoverLocalDevicesViewModel.this._isSearching;
            do {
                value = wVar.getValue();
                ((Boolean) value).getClass();
            } while (!wVar.g(value, Boolean.TRUE));
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onDiscoveryStopped(String str) {
            Object value;
            t.f(str, "serviceType");
            w wVar = DiscoverLocalDevicesViewModel.this._isSearching;
            do {
                value = wVar.getValue();
                ((Boolean) value).getClass();
            } while (!wVar.g(value, Boolean.FALSE));
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onServiceFound(NsdServiceInfo nsdServiceInfo) {
            Object next;
            Object value;
            t.f(nsdServiceInfo, "serviceInfo");
            com.server.auditor.ssh.client.fragments.quickconnect.suggestion.models.b bVar = new com.server.auditor.ssh.client.fragments.quickconnect.suggestion.models.b(nsdServiceInfo, 0);
            Iterator it = ((Iterable) DiscoverLocalDevicesViewModel.this._foundHosts.getValue()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (t.b(((HostSuggestion) next).f().toString(), bVar.f().toString())) {
                        break;
                    }
                }
            }
            if (((HostSuggestion) next) == null) {
                w wVar = DiscoverLocalDevicesViewModel.this._foundHosts;
                DiscoverLocalDevicesViewModel discoverLocalDevicesViewModel = DiscoverLocalDevicesViewModel.this;
                do {
                    value = wVar.getValue();
                } while (!wVar.g(value, new ArrayList(v.K0((Collection) discoverLocalDevicesViewModel._foundHosts.getValue(), bVar))));
            }
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onServiceLost(NsdServiceInfo nsdServiceInfo) {
            Object value;
            t.f(nsdServiceInfo, "serviceInfo");
            w wVar = DiscoverLocalDevicesViewModel.this._isSearching;
            do {
                value = wVar.getValue();
                ((Boolean) value).getClass();
            } while (!wVar.g(value, Boolean.FALSE));
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onStartDiscoveryFailed(String str, int i10) {
            t.f(str, "serviceType");
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onStopDiscoveryFailed(String str, int i10) {
            t.f(str, "serviceType");
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39665a;

        c(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return DiscoverLocalDevicesViewModel.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f39665a;
            if (i10 == 0) {
                x.b(obj);
                DiscoverLocalDevicesViewModel.this.nsdLoader = new d(DiscoverLocalDevicesViewModel.this.getApplication());
                DiscoverLocalDevicesViewModel discoverLocalDevicesViewModel = DiscoverLocalDevicesViewModel.this;
                this.f39665a = 1;
                if (discoverLocalDevicesViewModel.onNsdScannerStartRequested(this) == objF) {
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
        public final Object invoke(i0 i0Var, e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiscoverLocalDevicesViewModel(Application application) {
        super(application);
        t.f(application, "application");
        w wVarA = zu.m0.a(Boolean.FALSE);
        this._isSearching = wVarA;
        this.isSearching = h.b(wVarA);
        w wVarA2 = zu.m0.a(v.o());
        this._foundHosts = wVarA2;
        this.foundHosts = h.P(h.L(wVarA2, new a(null)), j1.a(this), g0.a.b(g0.f88389a, 5000L, 0L, 2, null), v.o());
    }

    private final NsdManager.DiscoveryListener getDiscoveryListener() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onNsdScannerStartRequested(e<? super m0> eVar) {
        this.nsdDiscoveryListener = getDiscoveryListener();
        d dVar = this.nsdLoader;
        if (dVar != null) {
            dVar.b(getDiscoveryListener());
        }
        return m0.f82633a;
    }

    public final k0 getFoundHosts() {
        return this.foundHosts;
    }

    public final k0 isSearching() {
        return this.isSearching;
    }

    public final void startDiscovery() {
        k.d(j1.a(this), null, null, new c(null), 3, null);
    }
}
