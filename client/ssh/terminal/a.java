package com.server.auditor.ssh.client.ssh.terminal;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.widget.Toast;
import com.crystalnix.terminal.view.TerminalView;
import com.server.auditor.ssh.client.R;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements sm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f38925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ClipboardManager f38926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TerminalView f38927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC0600a f38928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Runnable f38929e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Handler f38930f;

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.ssh.terminal.a$a, reason: collision with other inner class name */
    public interface InterfaceC0600a {
        void a();
    }

    public a(Context context, TerminalView terminalView) {
        this.f38925a = context;
        this.f38927c = terminalView;
        this.f38926b = (ClipboardManager) context.getSystemService("clipboard");
    }

    private CharSequence f(ClipData clipData) {
        return (clipData == null || clipData.getItemCount() <= 0) ? "" : clipData.getItemAt(0).coerceToText(this.f38925a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(String str) {
        this.f38927c.f0(str);
    }

    private void h() {
        InterfaceC0600a interfaceC0600a = this.f38928d;
        if (interfaceC0600a != null) {
            interfaceC0600a.a();
        }
    }

    @Override // sm.c
    public void a(int i10, String str) {
        if (!TextUtils.isEmpty(str)) {
            String string = this.f38925a.getString(R.string.serverfault_search_link, str);
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(string));
            if (intent.resolveActivity(this.f38925a.getPackageManager()) != null) {
                this.f38925a.startActivity(intent);
            } else {
                new be.b(this.f38925a).setTitle(R.string.message_could_not_open_browser).setMessage(string).setPositiveButton(android.R.string.ok, null).show();
            }
        }
        this.f38927c.postInvalidate();
        h();
        this.f38927c.setCopyMode(false);
    }

    @Override // sm.c
    public void b(int i10, CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.f38926b.setPrimaryClip(ClipData.newPlainText(null, charSequence));
            Context context = this.f38925a;
            Toast.makeText(context, context.getString(R.string.copy_finished), 1).show();
        }
        this.f38927c.postInvalidate();
        h();
        this.f38927c.setCopyMode(false);
    }

    @Override // sm.c
    public void c(int i10, String str) {
        if (!TextUtils.isEmpty(str)) {
            String string = this.f38925a.getString(R.string.google_search_link, str);
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(string));
            if (intent.resolveActivity(this.f38925a.getPackageManager()) != null) {
                this.f38925a.startActivity(intent);
            } else {
                new be.b(this.f38925a).setTitle(R.string.message_could_not_open_browser).setMessage(string).setPositiveButton(android.R.string.ok, null).show();
            }
        }
        this.f38927c.postInvalidate();
        h();
        this.f38927c.setCopyMode(false);
    }

    @Override // sm.c
    public void d() {
        if (this.f38926b.hasPrimaryClip()) {
            String strReplaceAll = f(this.f38926b.getPrimaryClip()).toString().replaceAll("\\r?\\n", "\r");
            this.f38927c.setCopyMode(false);
            this.f38927c.f0(strReplaceAll);
        }
        h();
    }

    public void i(final String str) {
        if (this.f38926b.hasPrimaryClip()) {
            this.f38927c.setCopyMode(false);
            this.f38930f = new Handler();
            Runnable runnable = new Runnable() { // from class: nm.u0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f66983a.g(str);
                }
            };
            this.f38929e = runnable;
            this.f38930f.postDelayed(runnable, 10L);
        }
        h();
    }

    public void j(InterfaceC0600a interfaceC0600a) {
        this.f38928d = interfaceC0600a;
    }
}
