package com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
abstract class RepeatableOnKeyTouchListener implements View.OnTouchListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Runnable f38960b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f38962d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RepeatableKeyState f38959a = RepeatableKeyState.Idle;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f38961c = new Handler();

    private enum RepeatableKeyState {
        Idle,
        Pressed,
        Repeating
    }

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k f38963a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f38964b;

        a(k kVar, View view) {
            this.f38963a = kVar;
            this.f38964b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            RepeatableKeyState repeatableKeyState = RepeatableOnKeyTouchListener.this.f38959a;
            RepeatableKeyState repeatableKeyState2 = RepeatableKeyState.Pressed;
            if (repeatableKeyState == repeatableKeyState2 || RepeatableOnKeyTouchListener.this.f38959a == RepeatableKeyState.Repeating) {
                if (RepeatableOnKeyTouchListener.this.f38959a == repeatableKeyState2) {
                    RepeatableOnKeyTouchListener.this.g(this.f38963a.f39007b);
                }
                RepeatableOnKeyTouchListener.this.f38959a = RepeatableKeyState.Idle;
                RepeatableOnKeyTouchListener.this.f38960b = null;
                if (Arrays.asList(AdditionalPanelKeys.f38953m).contains(this.f38963a.f39007b)) {
                    return;
                }
                RepeatableOnKeyTouchListener.this.f38959a = RepeatableKeyState.Repeating;
                RepeatableOnKeyTouchListener.this.f(this.f38964b, this.f38963a);
                RepeatableOnKeyTouchListener.this.f38961c.postDelayed(this, RepeatableOnKeyTouchListener.this.f38962d);
            }
        }
    }

    RepeatableOnKeyTouchListener(long j10) {
        this.f38962d = j10;
    }

    abstract void f(View view, k kVar);

    abstract void g(String str);

    abstract void h(String str);

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (view.getTag() instanceof k) {
            k kVar = (k) view.getTag();
            RepeatableKeyState repeatableKeyState = this.f38959a;
            RepeatableKeyState repeatableKeyState2 = RepeatableKeyState.Idle;
            if (repeatableKeyState == repeatableKeyState2 && motionEvent.getAction() == 0) {
                this.f38959a = RepeatableKeyState.Pressed;
                view.setPressed(true);
                Runnable runnable = this.f38960b;
                if (runnable != null) {
                    this.f38961c.removeCallbacks(runnable);
                }
                if (kVar.f39006a >= 0) {
                    a aVar = new a(kVar, view);
                    this.f38960b = aVar;
                    this.f38961c.postDelayed(aVar, 500L);
                }
                return true;
            }
            if (motionEvent.getAction() == 1) {
                Runnable runnable2 = this.f38960b;
                if (runnable2 != null) {
                    this.f38961c.removeCallbacks(runnable2);
                }
                this.f38960b = null;
                if (this.f38959a == RepeatableKeyState.Pressed) {
                    h(kVar.f39007b);
                    f(view, kVar);
                }
                this.f38959a = repeatableKeyState2;
                view.setPressed(false);
                return true;
            }
            if (motionEvent.getAction() == 3) {
                this.f38959a = repeatableKeyState2;
                Runnable runnable3 = this.f38960b;
                if (runnable3 != null) {
                    this.f38961c.removeCallbacks(runnable3);
                }
                this.f38960b = null;
                view.setPressed(false);
            }
        }
        return false;
    }
}
