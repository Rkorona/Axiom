package com.server.auditor.ssh.client.contracts.snippets;

import android.text.Editable;
import com.server.auditor.ssh.client.models.SnippetItem;
import com.server.auditor.ssh.client.models.snippet.SnippetSourceOrigin;
import com.server.auditor.ssh.client.presenters.snippets.SnippetVariableSetupPresenter;
import com.server.auditor.ssh.client.widget.textview.TextRoundedBgAnnotation;
import moxy.MvpView;

/* JADX INFO: loaded from: classes2.dex */
public interface b extends MvpView {
    void E6(Editable editable);

    void O6(boolean z10);

    void Ob(SnippetItem snippetItem, int i10, boolean z10, SnippetSourceOrigin snippetSourceOrigin);

    void a();

    void c4();

    void h7(boolean z10);

    void ma(boolean z10);

    void r3(boolean z10);

    void we(SnippetVariableSetupPresenter.b bVar);

    void z5();

    void zb(TextRoundedBgAnnotation textRoundedBgAnnotation, boolean z10, boolean z11);
}
