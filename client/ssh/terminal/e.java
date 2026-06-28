package com.server.auditor.ssh.client.ssh.terminal;

import a9.b;
import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.view.KeyEvent;
import com.crystalnix.termius.libtermius.wrappers.SessionManager;
import com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.KeyTextView;
import com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.f;

/* JADX INFO: loaded from: classes4.dex */
final class e implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f39018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kj.d f39019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a9.b f39020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f39021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a9.b f39022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a9.b f39023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f39024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f39025h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final f f39026i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f39027j;

    e(Context context, f fVar, kj.d dVar) {
        this.f39018a = context;
        this.f39026i = fVar;
        this.f39019b = dVar;
    }

    private void a(a9.f fVar, int i10) {
        if (this.f39026i.E() != null) {
            if (i10 == 0) {
                if (fVar == a9.f.Key_Alt) {
                    this.f39026i.E().setUseAlt(true, true);
                } else if (fVar == a9.f.Key_Ctrl) {
                    this.f39026i.E().setUseCtrl(true, true);
                }
                this.f39026i.x(fVar, KeyTextView.State.Hold);
                return;
            }
            if (i10 == 1) {
                if (fVar == a9.f.Key_Alt) {
                    this.f39026i.E().setUseAlt(false, false);
                } else if (fVar == a9.f.Key_Ctrl) {
                    this.f39026i.E().setUseCtrl(false, false);
                }
                this.f39026i.x(fVar, KeyTextView.State.Initial);
            }
        }
    }

    private void c() {
        if (this.f39026i.E() != null) {
            this.f39026i.E().onKey(this.f39026i.E(), 66, new KeyEvent(0, 66));
        }
    }

    private boolean d(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        int action = keyEvent.getAction();
        if (keyCode == 113 || keyCode == 114) {
            a(a9.f.Key_Ctrl, action);
            return true;
        }
        if (keyCode != 57) {
            return false;
        }
        a(a9.f.Key_Alt, action);
        return true;
    }

    private void f(a9.b bVar) {
        if (this.f39026i.E() != null) {
            if (bVar.d() != b.c.Control_Key) {
                if (bVar.d() == b.c.Terminal_Key && bVar.c() == a9.f.Key_Return) {
                    c();
                }
                g9.a aVarD = this.f39026i.D();
                if (aVarD != null) {
                    aVarD.z(bVar);
                    return;
                }
                return;
            }
            if (bVar.a() == b.a.Hide) {
                ((Activity) this.f39018a).finish();
                return;
            }
            if (bVar.a() == b.a.Close && this.f39026i.C() != null) {
                SessionManager.getInstance().disconnectTerminalSession(this.f39026i.C().intValue());
                return;
            }
            if (bVar.a() == b.a.IncreaseFontSize) {
                this.f39026i.E().J();
                return;
            }
            if (bVar.a() == b.a.DecreaseFontSize) {
                this.f39026i.E().A();
                return;
            }
            if (bVar.a() == b.a.SwipeRight) {
                this.f39019b.p();
                return;
            }
            if (bVar.a() == b.a.SwipeLeft) {
                this.f39019b.l();
            } else if (bVar.a() == b.a.ScrollUp) {
                this.f39026i.E().j0(-1, false);
            } else if (bVar.a() == b.a.ScrollDown) {
                this.f39026i.E().j0(1, true);
            }
        }
    }

    public boolean b(KeyEvent keyEvent) {
        if (d(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        g9.a aVarD = this.f39026i.D();
        if (keyCode == 25) {
            if (!this.f39022e.f()) {
                return false;
            }
            if (this.f39022e.d() == b.c.Terminal_Key) {
                a9.f fVarC = this.f39022e.c();
                if (fVarC != a9.f.Key_Ctrl && fVarC != a9.f.Key_Alt) {
                    if (keyEvent.getAction() == 0) {
                        if (fVarC == a9.f.Key_Return) {
                            c();
                            return true;
                        }
                        if (aVarD != null) {
                            aVarD.A(fVarC);
                        }
                    }
                    return true;
                }
                if (keyEvent.getAction() == 0 && !this.f39025h) {
                    this.f39025h = true;
                    a(fVarC, keyEvent.getAction());
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    this.f39025h = false;
                    a(fVarC, keyEvent.getAction());
                }
                return true;
            }
            if (keyEvent.getAction() == 0) {
                f(this.f39022e);
            }
            return true;
        }
        if (keyCode != 24 || !this.f39023f.f()) {
            return false;
        }
        if (this.f39023f.d() == b.c.Terminal_Key) {
            a9.f fVarC2 = this.f39023f.c();
            if (fVarC2 != a9.f.Key_Ctrl && fVarC2 != a9.f.Key_Alt) {
                if (keyEvent.getAction() == 0) {
                    if (fVarC2 == a9.f.Key_Return) {
                        c();
                        return true;
                    }
                    if (aVarD != null) {
                        aVarD.A(fVarC2);
                    }
                }
                return true;
            }
            if (keyEvent.getAction() == 0 && !this.f39024g) {
                this.f39024g = true;
                a(fVarC2, keyEvent.getAction());
                return true;
            }
            if (keyEvent.getAction() == 1) {
                this.f39024g = false;
                a(fVarC2, keyEvent.getAction());
            }
            return true;
        }
        if (keyEvent.getAction() == 0) {
            f(this.f39023f);
        }
        return true;
    }

    public boolean e(int i10) {
        return i10 == 25 ? this.f39022e.f() : i10 == 24 ? this.f39023f.f() : i10 == 4;
    }

    public void g(a9.b bVar, a9.b bVar2) {
        if (bVar2 == null || bVar == null) {
            throw new IllegalArgumentException("Terminal actions shouldn't be null");
        }
        this.f39022e = bVar2;
        this.f39023f = bVar;
    }

    public void h(a9.b bVar, double d10) {
        if (bVar == null) {
            throw new IllegalArgumentException("Shake action shouldn't be null");
        }
        this.f39020c = bVar;
        this.f39021d = d10;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (!this.f39020c.f() || this.f39026i.E() == null) {
            return;
        }
        float[] fArr = sensorEvent.values;
        double d10 = fArr[0] / 9.806650161743164d;
        double d11 = ((double) fArr[1]) / 9.806650161743164d;
        double d12 = ((double) fArr[2]) / 9.806650161743164d;
        if (Math.sqrt((d10 * d10) + (d11 * d11) + (d12 * d12)) > this.f39021d) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.f39027j + 500 > jCurrentTimeMillis) {
                return;
            }
            this.f39027j = jCurrentTimeMillis;
            f(this.f39020c);
        }
    }
}
