package com.server.auditor.ssh.client.fragments.hostngroups;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: loaded from: classes3.dex */
final class p1 extends Animation {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f25180e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final pu.e f25181f = pu.m.b(0.0f, 180.0f);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final pu.e f25182u = pu.m.b(180.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pu.e f25183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final iu.a f25184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final iu.l f25185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Camera f25186d;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private final Animation a(pu.e eVar, iu.a aVar, iu.l lVar) {
            p1 p1Var = new p1(eVar, aVar, lVar);
            p1Var.setDuration(320L);
            p1Var.setInterpolator(new e5.b());
            return p1Var;
        }

        public final Animation b(iu.a aVar, iu.l lVar) {
            ju.t.f(aVar, "calculateCenterX");
            ju.t.f(lVar, "updateDisplayedSide");
            return a(p1.f25181f, aVar, lVar);
        }

        public final Animation c(iu.a aVar, iu.l lVar) {
            ju.t.f(aVar, "calculateCenterX");
            ju.t.f(lVar, "updateDisplayedSide");
            return a(p1.f25182u, aVar, lVar);
        }

        private a() {
        }
    }

    public p1(pu.e eVar, iu.a aVar, iu.l lVar) {
        ju.t.f(eVar, "rotation");
        ju.t.f(aVar, "calculateCenterX");
        ju.t.f(lVar, "updateDisplayedSide");
        this.f25183a = eVar;
        this.f25184b = aVar;
        this.f25185c = lVar;
        this.f25186d = new Camera();
    }

    @Override // android.view.animation.Animation
    protected void applyTransformation(float f10, Transformation transformation) {
        ju.t.f(transformation, "transformation");
        float fFloatValue = ((Number) this.f25183a.b()).floatValue() + ((((Number) this.f25183a.d()).floatValue() - ((Number) this.f25183a.b()).floatValue()) * f10);
        Matrix matrix = transformation.getMatrix();
        float fFloatValue2 = ((Number) this.f25184b.a()).floatValue();
        this.f25186d.save();
        this.f25186d.rotateY(fFloatValue);
        this.f25186d.getMatrix(matrix);
        this.f25186d.restore();
        matrix.preTranslate(-fFloatValue2, 0.0f);
        matrix.postTranslate(fFloatValue2, 0.0f);
        DisplaySide displaySide = fFloatValue >= 90.0f ? DisplaySide.BACK : DisplaySide.FRONT;
        this.f25185c.invoke(displaySide);
        if (displaySide == DisplaySide.BACK) {
            matrix.preScale(-1.0f, 1.0f, fFloatValue2, 0.0f);
        }
    }
}
