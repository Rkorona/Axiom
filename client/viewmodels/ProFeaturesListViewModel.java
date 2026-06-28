package com.server.auditor.ssh.client.viewmodels;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.f0;
import androidx.lifecycle.k0;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.navigation.a3;
import hg.b2;
import hg.d;
import hj.f;
import il.m;
import java.util.ArrayList;
import jl.c;
import ju.k;
import ju.t;
import tp.g0;
import tp.r;

/* JADX INFO: loaded from: classes4.dex */
public final class ProFeaturesListViewModel extends AndroidViewModel {
    private static final boolean isPremiumActiveByDefault = true;
    private final k0 _features;
    private final c accountUserTypeLocalInfoRepository;
    private final r featureToggleHelper;
    private final f0 features;
    private final d insensitiveKeyValueRepository;
    private final com.server.auditor.ssh.client.app.a termiusStorage;
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProFeaturesListViewModel(Application application) {
        super(application);
        t.f(application, "application");
        com.server.auditor.ssh.client.app.a aVarN = com.server.auditor.ssh.client.app.a.N();
        this.termiusStorage = aVarN;
        d dVarM = aVarN.M();
        this.insensitiveKeyValueRepository = dVarM;
        t.e(aVarN, "termiusStorage");
        b2 b2Var = b2.f52944a;
        g0 g0VarY1 = b2Var.y1();
        t.e(dVarM, "insensitiveKeyValueRepository");
        f fVar = new f(dVarM);
        t.e(dVarM, "insensitiveKeyValueRepository");
        this.accountUserTypeLocalInfoRepository = new c(aVarN, g0VarY1, fVar, new m(dVarM, b2Var.s1()), new com.server.auditor.ssh.client.interactors.a(b2Var.y1()));
        k0 k0Var = new k0();
        this._features = k0Var;
        this.features = k0Var;
        this.featureToggleHelper = new r();
        prepareFeatures(isPremiumActiveByDefault);
    }

    private final void prepareFeatures(boolean z10) {
        Application application = getApplication();
        ArrayList arrayList = new ArrayList();
        a3 a3VarB = a3.b(z10 ? application.getString(R.string.termius_basic_features_header) : application.getString(R.string.termius_basic_features_header_expired));
        t.e(a3VarB, "newHeaderInstance(...)");
        arrayList.add(a3VarB);
        a3 a3VarA = a3.a();
        t.e(a3VarA, "newBaseFeatureInstance(...)");
        arrayList.add(a3VarA);
        a3 a3VarB2 = a3.b(z10 ? application.getString(R.string.termius_premium_features_header) : application.getString(R.string.termius_premium_features_header_expired));
        t.e(a3VarB2, "newHeaderInstance(...)");
        arrayList.add(a3VarB2);
        a3 a3VarC = a3.c(application.getString(R.string.termius_premium_features_sync_title), application.getString(R.string.termius_premium_features_sync_subtitle), z10);
        t.e(a3VarC, "newPremiumFeatureInstance(...)");
        arrayList.add(a3VarC);
        a3 a3VarC2 = a3.c(application.getString(R.string.termius_premium_features_serial_title), application.getString(R.string.termius_premium_features_serial_subtitle), z10);
        t.e(a3VarC2, "newPremiumFeatureInstance(...)");
        arrayList.add(a3VarC2);
        a3 a3VarC3 = a3.c(application.getString(R.string.termius_premium_features_dns_discover_title), application.getString(R.string.termius_premium_features_dns_discover_subtitle), z10);
        t.e(a3VarC3, "newPremiumFeatureInstance(...)");
        arrayList.add(a3VarC3);
        a3 a3VarC4 = a3.c(application.getString(R.string.termius_premium_features_proxy_title), application.getString(R.string.termius_premium_features_proxy_subtitle), z10);
        t.e(a3VarC4, "newPremiumFeatureInstance(...)");
        arrayList.add(a3VarC4);
        a3 a3VarC5 = a3.c(application.getString(R.string.termius_premium_features_startup_snippets_title), application.getString(R.string.termius_premium_features_startup_snippets_subtitle), z10);
        t.e(a3VarC5, "newPremiumFeatureInstance(...)");
        arrayList.add(a3VarC5);
        a3 a3VarC6 = a3.c(application.getString(R.string.termius_premium_features_aws_import_title), application.getString(R.string.termius_premium_features_aws_import_subtitle), z10);
        t.e(a3VarC6, "newPremiumFeatureInstance(...)");
        arrayList.add(a3VarC6);
        a3 a3VarC7 = a3.c(application.getString(R.string.termius_premium_features_ssh_agent_title), application.getString(R.string.termius_premium_features_ssh_agent_subtitle), z10);
        t.e(a3VarC7, "newPremiumFeatureInstance(...)");
        arrayList.add(a3VarC7);
        a3 a3VarC8 = a3.c(application.getString(R.string.termius_premium_features_jump_host_title), application.getString(R.string.termius_premium_features_jump_host_subtitle), z10);
        t.e(a3VarC8, "newPremiumFeatureInstance(...)");
        arrayList.add(a3VarC8);
        this._features.n(arrayList);
    }

    public final f0 getFeatures() {
        return this.features;
    }

    public final f0 getUserTypeLiveData() {
        return this.accountUserTypeLocalInfoRepository.d();
    }
}
