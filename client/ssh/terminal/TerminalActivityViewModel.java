package com.server.auditor.ssh.client.ssh.terminal;

import android.media.AudioAttributes;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Vibrator;
import androidx.lifecycle.i1;
import b9.i;
import com.server.auditor.ssh.client.app.TermiusApplication;
import com.server.auditor.ssh.client.ssh.terminal.d;
import java.util.ArrayList;
import ju.t;
import nm.z0;

/* JADX INFO: loaded from: classes4.dex */
public final class TerminalActivityViewModel extends i1 implements d {
    public static final int $stable = 8;
    private final ArrayList<i> completionList;
    private d.a fragmentTerminalView;
    private boolean hasFocus;
    private boolean isIgnoreTap;
    private boolean isNeedDrawCursor;
    private d.b mainTerminalView;
    private final Uri notificationUri;
    private Ringtone ringtone;
    private float scaledScreenDensity;
    private z0 terminalParameters;
    private Vibrator vibrator;

    public TerminalActivityViewModel() {
        Uri uri = Uri.parse("android.resource://" + TermiusApplication.F().getPackageName() + "/" + TerminalActivity.f38860c0.a());
        t.e(uri, "parse(...)");
        this.notificationUri = uri;
        this.terminalParameters = new z0(com.server.auditor.ssh.client.app.a.N().M());
        this.ringtone = RingtoneManager.getRingtone(TermiusApplication.F(), uri);
        Object systemService = TermiusApplication.F().getSystemService("vibrator");
        this.vibrator = systemService instanceof Vibrator ? (Vibrator) systemService : null;
        this.completionList = new ArrayList<>();
        this.isNeedDrawCursor = true;
        this.hasFocus = true;
        initRingtoneFlags();
    }

    private final void initRingtoneFlags() {
        Ringtone ringtone;
        if (!this.terminalParameters.g() || (ringtone = this.ringtone) == null) {
            return;
        }
        ringtone.setAudioAttributes(new AudioAttributes.Builder().setContentType(4).setUsage(5).build());
    }

    public void createMainView(d.b bVar) {
        t.f(bVar, "view");
        this.mainTerminalView = bVar;
        bVar.d();
    }

    public final ArrayList<i> getCompletionList() {
        return this.completionList;
    }

    public final boolean getHasFocus() {
        return this.hasFocus;
    }

    public final Ringtone getRingtone() {
        return this.ringtone;
    }

    @Override // com.server.auditor.ssh.client.ssh.terminal.d
    public float getScaledScreenDensity() {
        return this.scaledScreenDensity;
    }

    public final z0 getTerminalParameters() {
        return this.terminalParameters;
    }

    public final Vibrator getVibrator() {
        return this.vibrator;
    }

    public final boolean isIgnoreTap() {
        return this.isIgnoreTap;
    }

    public final boolean isNeedDrawCursor() {
        return this.isNeedDrawCursor;
    }

    public final void setHasFocus(boolean z10) {
        this.hasFocus = z10;
    }

    public final void setIgnoreTap(boolean z10) {
        this.isIgnoreTap = z10;
    }

    public final void setNeedDrawCursor(boolean z10) {
        this.isNeedDrawCursor = z10;
    }

    public final void setRingtone(Ringtone ringtone) {
        this.ringtone = ringtone;
    }

    public void setScaledScreenDensity(float f10) {
        this.scaledScreenDensity = f10;
    }

    public final void setTerminalParameters(z0 z0Var) {
        t.f(z0Var, "<set-?>");
        this.terminalParameters = z0Var;
    }

    public final void setVibrator(Vibrator vibrator) {
        this.vibrator = vibrator;
    }

    public void updateFragmentView(d.a aVar) {
        t.f(aVar, "view");
    }
}
