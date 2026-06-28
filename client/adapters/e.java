package com.server.auditor.ssh.client.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.adapters.e;
import com.server.auditor.ssh.client.models.b;
import com.server.auditor.ssh.client.synchronization.api.models.UserDeviceType;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends RecyclerView.h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f21284f = new b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f21285g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final SimpleDateFormat f21286h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final a f21287i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final iu.l f21288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.recyclerview.widget.d f21289e;

    public static final class a extends j.f {
        a() {
        }

        @Override // androidx.recyclerview.widget.j.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(com.server.auditor.ssh.client.models.a aVar, com.server.auditor.ssh.client.models.a aVar2) {
            ju.t.f(aVar, "oldItem");
            ju.t.f(aVar2, "newItem");
            return ju.t.b(aVar, aVar2);
        }

        @Override // androidx.recyclerview.widget.j.f
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean b(com.server.auditor.ssh.client.models.a aVar, com.server.auditor.ssh.client.models.a aVar2) {
            ju.t.f(aVar, "oldItem");
            ju.t.f(aVar2, "newItem");
            return aVar.d() == aVar2.d();
        }

        @Override // androidx.recyclerview.widget.j.f
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Object c(com.server.auditor.ssh.client.models.a aVar, com.server.auditor.ssh.client.models.a aVar2) {
            ju.t.f(aVar, "oldItem");
            ju.t.f(aVar2, "newItem");
            if (ju.t.b(aVar.g(), aVar2.g())) {
                return null;
            }
            return "StateChangedPayloadEvent";
        }
    }

    public static final class b {
        public /* synthetic */ b(ju.k kVar) {
            this();
        }

        private b() {
        }
    }

    public final class c extends RecyclerView.e0 {

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private final qg.h f21290u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private final iu.l f21291v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ e f21292w;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f21293a;

            static {
                int[] iArr = new int[UserDeviceType.values().length];
                try {
                    iArr[UserDeviceType.IPHONE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[UserDeviceType.AMAZON.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[UserDeviceType.CHROME.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[UserDeviceType.GOOGLE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[UserDeviceType.DESKTOP.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[UserDeviceType.ACCOUNT_MANAGEMENT.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[UserDeviceType.FIDO.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[UserDeviceType.UNKNOWN.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                f21293a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e eVar, qg.h hVar, iu.l lVar) {
            super(hVar.b());
            ju.t.f(hVar, "binding");
            ju.t.f(lVar, "onSignOutClicked");
            this.f21292w = eVar;
            this.f21290u = hVar;
            this.f21291v = lVar;
        }

        private final String R(Date date) {
            if (date == null) {
                return null;
            }
            try {
                return e.f21286h.format(date);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void U(c cVar, com.server.auditor.ssh.client.models.a aVar, View view) {
            cVar.f21291v.invoke(aVar);
        }

        public final void S(com.server.auditor.ssh.client.models.a aVar) {
            ju.t.f(aVar, "device");
            com.server.auditor.ssh.client.models.b bVarG = aVar.g();
            if (ju.t.b(bVarG, b.a.f27895a)) {
                this.f21290u.f72584g.setVisibility(ju.t.b(aVar.i(), Boolean.TRUE) ? 0 : 4);
                AppCompatImageView appCompatImageView = this.f21290u.f72581d;
                ju.t.e(appCompatImageView, "errorIcon");
                appCompatImageView.setVisibility(8);
                ProgressBar progressBar = this.f21290u.f72583f;
                ju.t.e(progressBar, "progressBar");
                progressBar.setVisibility(8);
                return;
            }
            if (ju.t.b(bVarG, b.C0446b.f27896a)) {
                this.f21290u.f72584g.setVisibility(4);
                AppCompatImageView appCompatImageView2 = this.f21290u.f72581d;
                ju.t.e(appCompatImageView2, "errorIcon");
                appCompatImageView2.setVisibility(0);
                ProgressBar progressBar2 = this.f21290u.f72583f;
                ju.t.e(progressBar2, "progressBar");
                progressBar2.setVisibility(8);
                return;
            }
            if (!ju.t.b(bVarG, b.c.f27897a)) {
                throw new ut.s();
            }
            this.f21290u.f72584g.setVisibility(4);
            AppCompatImageView appCompatImageView3 = this.f21290u.f72581d;
            ju.t.e(appCompatImageView3, "errorIcon");
            appCompatImageView3.setVisibility(8);
            ProgressBar progressBar3 = this.f21290u.f72583f;
            ju.t.e(progressBar3, "progressBar");
            progressBar3.setVisibility(0);
        }

        public final void T(final com.server.auditor.ssh.client.models.a aVar) {
            String string;
            String string2;
            int i10;
            ju.t.f(aVar, "item");
            Context context = this.f21290u.b().getContext();
            String strF = aVar.f();
            if (strF.length() == 0) {
                strF = context.getString(R.string.active_devices_holder_unknown_device_title);
                ju.t.e(strF, "getString(...)");
            }
            this.f21290u.f72585h.setText(strF);
            this.f21290u.f72585h.setTooltipText(strF);
            AppCompatTextView appCompatTextView = this.f21290u.f72580c;
            if (aVar.j()) {
                string = context.getString(R.string.active_devices_holder_this_device_description);
            } else {
                String strR = R(aVar.e());
                if (strR == null || (string2 = context.getString(R.string.active_devices_holder_last_active_placeholder, strR)) == null) {
                    string = context.getString(R.string.active_devices_holder_last_active_unknown);
                    ju.t.e(string, "getString(...)");
                } else {
                    string = string2;
                }
            }
            appCompatTextView.setText(string);
            switch (a.f21293a[aVar.c().ordinal()]) {
                case 1:
                    i10 = R.drawable.ic_iphone_mobile;
                    break;
                case 2:
                case 3:
                case 4:
                    i10 = R.drawable.ic_android_mobile;
                    break;
                case 5:
                    i10 = R.drawable.ic_laptop;
                    break;
                case 6:
                    i10 = R.drawable.ic_account_management;
                    break;
                case 7:
                    i10 = R.drawable.ic_hardware_key;
                    break;
                case 8:
                    i10 = R.drawable.ic_unknown_device;
                    break;
                default:
                    throw new ut.s();
            }
            this.f21290u.f72582e.setImageResource(i10);
            S(aVar);
            this.f21290u.f72584g.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.adapters.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    e.c.U(this.f21299a, aVar, view);
                }
            });
        }
    }

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd, yyy", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        f21286h = simpleDateFormat;
        f21287i = new a();
    }

    public e(iu.l lVar) {
        ju.t.f(lVar, "onSignOutClicked");
        this.f21288d = lVar;
        this.f21289e = new androidx.recyclerview.widget.d(this, f21287i);
        I(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public void z(c cVar, int i10) {
        ju.t.f(cVar, "holder");
        com.server.auditor.ssh.client.models.a aVar = (com.server.auditor.ssh.client.models.a) this.f21289e.a().get(i10);
        ju.t.c(aVar);
        cVar.T(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public void A(c cVar, int i10, List list) {
        ju.t.f(cVar, "holder");
        ju.t.f(list, "payloads");
        com.server.auditor.ssh.client.models.a aVar = (com.server.auditor.ssh.client.models.a) this.f21289e.a().get(i10);
        if (list.isEmpty()) {
            super.A(cVar, i10, list);
        }
        if (list.contains("StateChangedPayloadEvent")) {
            ju.t.c(aVar);
            cVar.S(aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public c B(ViewGroup viewGroup, int i10) {
        ju.t.f(viewGroup, "parent");
        qg.h hVarC = qg.h.c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        ju.t.e(hVarC, "inflate(...)");
        return new c(this, hVarC, this.f21288d);
    }

    public final void P(List list) {
        ju.t.f(list, "data");
        this.f21289e.d(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int i() {
        return this.f21289e.a().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long j(int i10) {
        try {
            return Integer.hashCode(((com.server.auditor.ssh.client.models.a) this.f21289e.a().get(i10)).d());
        } catch (IndexOutOfBoundsException unused) {
            return -1L;
        }
    }
}
