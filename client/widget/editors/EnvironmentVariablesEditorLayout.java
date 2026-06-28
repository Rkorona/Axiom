package com.server.auditor.ssh.client.widget.editors;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.i;
import com.server.auditor.ssh.client.adapters.x;
import com.server.auditor.ssh.client.widget.editors.EnvironmentVariablesEditorLayout;
import io.split.android.client.dtos.SerializableEvent;
import java.util.ArrayList;
import java.util.List;
import ju.k;
import ju.t;
import lq.j;
import mq.g;
import qg.z1;
import ut.s;
import ut.u;
import vt.v;

/* JADX INFO: loaded from: classes4.dex */
public final class EnvironmentVariablesEditorLayout extends LinearLayout implements mq.a, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f46694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private x f46695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private z1 f46696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f46697d;

    public interface a {
        void a(int i10);

        void b(u uVar, int i10);

        void c();
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f46698a;

        public b(List list) {
            t.f(list, "variables");
            this.f46698a = list;
        }

        public final List a() {
            return this.f46698a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && t.b(this.f46698a, ((b) obj).f46698a);
        }

        public int hashCode() {
            return this.f46698a.hashCode();
        }

        public String toString() {
            return "EnvironmentVariablesProperties(variables=" + this.f46698a + ")";
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EnvironmentVariablesEditorLayout(Context context) {
        this(context, null, 0, 6, null);
        t.f(context, "context");
    }

    private final void e() {
        setEnabled(false);
        getBinding().f74534b.setOnClickListener(null);
        getBinding().b().setOnClickListener(null);
    }

    private final void f() {
        getBinding().b().setOnClickListener(new View.OnClickListener() { // from class: lq.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EnvironmentVariablesEditorLayout.g(this.f64562a, view);
            }
        });
        getBinding().f74534b.setOnClickListener(new View.OnClickListener() { // from class: lq.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EnvironmentVariablesEditorLayout.h(this.f64564a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(EnvironmentVariablesEditorLayout environmentVariablesEditorLayout, View view) {
        a aVar = environmentVariablesEditorLayout.f46694a;
        if (aVar != null) {
            aVar.c();
        }
    }

    private final z1 getBinding() {
        z1 z1Var = this.f46696c;
        if (z1Var != null) {
            return z1Var;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(EnvironmentVariablesEditorLayout environmentVariablesEditorLayout, View view) {
        a aVar = environmentVariablesEditorLayout.f46694a;
        if (aVar != null) {
            aVar.c();
        }
    }

    private final void i() {
        k(this.f46697d.a());
    }

    private final void k(List list) {
        this.f46695b.P(list);
        this.f46695b.o();
    }

    @Override // mq.g
    public void a(int i10) {
        a aVar;
        if (i10 >= this.f46697d.a().size() || (aVar = this.f46694a) == null) {
            return;
        }
        aVar.a(i10);
    }

    @Override // mq.g
    public void b(int i10) {
        if (i10 < this.f46697d.a().size()) {
            u uVar = (u) this.f46697d.a().get(i10);
            a aVar = this.f46694a;
            if (aVar != null) {
                aVar.b(uVar, i10);
            }
        }
    }

    public final void j(b bVar) {
        t.f(bVar, SerializableEvent.PROPERTIES_FIELD);
        this.f46697d = bVar;
        i();
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        getBinding().f74534b.setEnabled(z10);
        getBinding().f74536d.setEnabled(z10);
        this.f46695b.O(z10);
        this.f46695b.o();
        getBinding().b().setClickable(z10);
        getBinding().f74534b.setClickable(z10);
    }

    public final void setEnvironmentVariablesEditorCallback(a aVar) {
        t.f(aVar, "callback");
        this.f46694a = aVar;
    }

    @Override // mq.a
    public void setState(j jVar) {
        t.f(jVar, "state");
        if (jVar instanceof j.a) {
            f();
        } else if (jVar instanceof j.b) {
            e();
        } else {
            if (!(jVar instanceof j.c)) {
                throw new s();
            }
            f();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EnvironmentVariablesEditorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        t.f(context, "context");
    }

    public /* synthetic */ EnvironmentVariablesEditorLayout(Context context, AttributeSet attributeSet, int i10, int i11, k kVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnvironmentVariablesEditorLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        t.f(context, "context");
        this.f46697d = new b(v.o());
        this.f46696c = z1.c(LayoutInflater.from(context), this, true);
        this.f46695b = new x(new ArrayList(), this);
        getBinding().f74536d.setAdapter(this.f46695b);
        getBinding().f74536d.setItemAnimator(new i());
        getBinding().f74536d.setLayoutManager(new LinearLayoutManager(context));
    }
}
