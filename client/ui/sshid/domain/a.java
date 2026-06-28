package com.server.auditor.ssh.client.ui.sshid.domain;

import android.content.Intent;
import androidx.activity.result.ActivityResult;
import com.server.auditor.ssh.client.navigation.MainActivity;
import com.server.auditor.ssh.client.synchronization.SyncIntentService;
import com.server.auditor.ssh.client.ui.sshid.domain.SshIdStateInteractor;
import com.server.auditor.ssh.client.ui.sshid.presentation.SshIdNavigationActivity;
import h.c;
import ju.t;
import wn.g;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MainActivity f41099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f41100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g.b f41101c;

    public a(MainActivity mainActivity, g gVar) {
        t.f(mainActivity, "mainActivity");
        t.f(gVar, "isAnyBlockingScreenDisplayedUseCase");
        this.f41099a = mainActivity;
        this.f41100b = gVar;
        this.f41101c = mainActivity.registerForActivityResult(new c(), new g.a() { // from class: gp.t
            @Override // g.a
            public final void a(Object obj) {
                com.server.auditor.ssh.client.ui.sshid.domain.a.d(this.f51435a, (ActivityResult) obj);
            }
        });
    }

    private final void b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(a aVar, ActivityResult activityResult) {
        aVar.b();
    }

    public final void c(SyncIntentService.SshIdAction sshIdAction) {
        t.f(sshIdAction, "sshIdAction");
        if ((sshIdAction instanceof SyncIntentService.SshIdAction.NoNeedActions) || (hg.a.f52933c.a() instanceof SshIdNavigationActivity) || this.f41100b.a()) {
            return;
        }
        Intent intent = new Intent(this.f41099a, (Class<?>) SshIdNavigationActivity.class);
        intent.setFlags(67108864);
        intent.putExtra("ssh_id_ca_to_generate_keys", sshIdAction);
        intent.putExtra("ssh_id_state_key", SshIdStateInteractor.SshIdState.PasskeysRequired.INSTANCE);
        this.f41101c.a(intent);
    }
}
