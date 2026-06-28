package com.server.auditor.ssh.client.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.server.auditor.ssh.client.models.ImportOptionType;
import java.util.List;
import qg.j5;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 extends RecyclerView.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f21267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final iu.l f21268e;

    public b0(List list, iu.l lVar) {
        ju.t.f(list, "importContainers");
        ju.t.f(lVar, "onImportOptionClickListener");
        this.f21267d = list;
        this.f21268e = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void z(com.server.auditor.ssh.client.fragments.viewholder.i iVar, int i10) {
        ju.t.f(iVar, "holder");
        com.server.auditor.ssh.client.fragments.viewholder.c.R(iVar, (ImportOptionType) this.f21267d.get(i10), false, false, 6, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public com.server.auditor.ssh.client.fragments.viewholder.i B(ViewGroup viewGroup, int i10) {
        ju.t.f(viewGroup, "parent");
        j5 j5VarC = j5.c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        ju.t.e(j5VarC, "inflate(...)");
        return new com.server.auditor.ssh.client.fragments.viewholder.i(j5VarC, this.f21268e);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int i() {
        return this.f21267d.size();
    }
}
