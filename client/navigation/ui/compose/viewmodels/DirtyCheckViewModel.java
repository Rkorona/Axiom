package com.server.auditor.ssh.client.navigation.ui.compose.viewmodels;

import androidx.lifecycle.i1;
import com.crystalnix.termius.libtermius.wrappers.SessionManager;
import zu.k0;
import zu.m0;

/* JADX INFO: loaded from: classes3.dex */
public final class DirtyCheckViewModel extends i1 {
    public static final int $stable = 8;
    private final zu.w _dirtyCheckHolder;
    private final k0 dirtyCheckHolder;
    private final tp.r featureToggleHelper;

    public DirtyCheckViewModel() {
        zu.w wVarA = m0.a(null);
        this._dirtyCheckHolder = wVarA;
        this.dirtyCheckHolder = zu.h.b(wVarA);
        this.featureToggleHelper = new tp.r();
    }

    public final k0 getDirtyCheckHolder() {
        return this.dirtyCheckHolder;
    }

    public final void registerDirtyCheck(String str, iu.l lVar) {
        ju.t.f(str, "editorInstanceId");
        ju.t.f(lVar, "lambda");
        if (this.featureToggleHelper.b() && ((Boolean) SessionManager.getInstance().terminalSessionHelper.isTabletLayout().getValue()).booleanValue()) {
            this._dirtyCheckHolder.setValue(new e(str, lVar));
        }
    }

    public final void unregisterDirtyCheck(String str) {
        ju.t.f(str, "editorInstanceId");
        if (this.featureToggleHelper.b()) {
            e eVar = (e) this._dirtyCheckHolder.getValue();
            if (ju.t.b(eVar != null ? eVar.a() : null, str)) {
                this._dirtyCheckHolder.setValue(null);
            }
        }
    }
}
