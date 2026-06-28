package com.server.auditor.ssh.client.widget;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.server.auditor.ssh.client.R;
import hg.b2;

/* JADX INFO: loaded from: classes4.dex */
public class v0 extends com.google.android.material.bottomsheet.c {
    private final com.server.auditor.ssh.client.interactors.r A;
    private Button B;
    private final Context C;

    public v0(Context context) {
        super(context);
        this.A = b2.f52944a.n1();
        this.C = context;
        create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(View view) {
        r();
        hide();
    }

    private void r() {
        if (this.A.b()) {
            Uri uri = Uri.parse(this.C.getResources().getString(R.string.google_play_link));
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            if (intent.resolveActivity(this.C.getPackageManager()) != null) {
                this.C.startActivity(intent);
                return;
            } else {
                new be.b(this.C).setTitle(R.string.message_could_not_open_browser).setMessage(uri.toString()).setPositiveButton(android.R.string.ok, null).show();
                return;
            }
        }
        String string = this.C.getResources().getString(R.string.site_android_link);
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse(string));
        if (intent2.resolveActivity(this.C.getPackageManager()) != null) {
            this.C.startActivity(intent2);
        } else {
            new be.b(this.C).setTitle(R.string.message_could_not_open_browser).setMessage(string).setPositiveButton(android.R.string.ok, null).show();
        }
    }

    @Override // android.app.Dialog
    public void create() {
        View viewInflate = getLayoutInflater().inflate(R.layout.layout_update_bottom_sheet, (ViewGroup) null);
        setContentView(viewInflate);
        Button button = (Button) viewInflate.findViewById(R.id.enable_sync_button);
        this.B = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.widget.u0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46868a.q(view);
            }
        });
    }
}
