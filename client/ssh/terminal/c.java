package com.server.auditor.ssh.client.ssh.terminal;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.m0;
import com.server.auditor.ssh.client.ssh.terminal.TypedSessionId;
import java.util.Iterator;
import java.util.List;
import ju.t;
import nk.y;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends m0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f39015j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final a f39016k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final SparseArray f39017l;

    public interface a {
        void a(int i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(FragmentManager fragmentManager, List list, a aVar) {
        super(fragmentManager);
        t.f(fragmentManager, "fm");
        t.f(list, "sessionIdsList");
        t.f(aVar, "onItemInstanceListener");
        this.f39015j = list;
        this.f39016k = aVar;
        this.f39017l = new SparseArray();
    }

    @Override // androidx.fragment.app.m0, androidx.viewpager.widget.a
    public void a(ViewGroup viewGroup, int i10, Object obj) {
        t.f(viewGroup, "container");
        t.f(obj, "object");
        this.f39017l.remove(i10);
        super.a(viewGroup, i10, obj);
    }

    @Override // androidx.viewpager.widget.a
    public int c() {
        return this.f39015j.size();
    }

    @Override // androidx.viewpager.widget.a
    public int d(Object obj) {
        t.f(obj, "terminalFragment");
        if (!(obj instanceof b)) {
            if (!(obj instanceof y)) {
                return -2;
            }
            Bundle arguments = ((y) obj).getArguments();
            int iIndexOf = this.f39015j.indexOf(new TypedSessionId.Sftp(arguments != null ? arguments.getInt("session_id_key", 0) : 0));
            SparseArray sparseArray = this.f39017l;
            return iIndexOf == sparseArray.keyAt(sparseArray.indexOfValue(obj)) ? -1 : -2;
        }
        Bundle arguments2 = ((b) obj).getArguments();
        int i10 = arguments2 != null ? arguments2.getInt("session_id_key", 0) : 0;
        Iterator it = this.f39015j.iterator();
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            TypedSessionId typedSessionId = (TypedSessionId) it.next();
            if ((typedSessionId instanceof TypedSessionId.Terminal) && typedSessionId.getSessionId() == i10) {
                break;
            }
            i++;
        }
        SparseArray sparseArray2 = this.f39017l;
        return i == sparseArray2.keyAt(sparseArray2.indexOfValue(obj)) ? -1 : -2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    @Override // androidx.viewpager.widget.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.CharSequence e(int r8) {
        /*
            r7 = this;
            java.util.List r0 = r7.f39015j
            int r0 = r0.size()
            java.lang.String r1 = ""
            if (r8 < r0) goto Lb
            return r1
        Lb:
            java.util.List r0 = r7.f39015j
            java.lang.Object r8 = r0.get(r8)
            com.server.auditor.ssh.client.ssh.terminal.TypedSessionId r8 = (com.server.auditor.ssh.client.ssh.terminal.TypedSessionId) r8
            boolean r0 = r8 instanceof com.server.auditor.ssh.client.ssh.terminal.TypedSessionId.Terminal
            r2 = 0
            if (r0 == 0) goto L25
            com.crystalnix.termius.libtermius.wrappers.SessionManager r0 = com.crystalnix.termius.libtermius.wrappers.SessionManager.getInstance()
            int r3 = r8.getSessionId()
            com.server.auditor.ssh.client.models.ActiveConnection r0 = r0.getActiveConnection(r3)
            goto L45
        L25:
            boolean r0 = r8 instanceof com.server.auditor.ssh.client.ssh.terminal.TypedSessionId.Sftp
            if (r0 == 0) goto L44
            com.crystalnix.termius.libtermius.wrappers.SessionManager r0 = com.crystalnix.termius.libtermius.wrappers.SessionManager.getInstance()
            int r3 = r8.getSessionId()
            zl.b r0 = r0.getLibTermiusSftpSession(r3)
            if (r0 == 0) goto L3c
            com.server.auditor.ssh.client.models.connections.Connection r0 = r0.c()
            goto L3d
        L3c:
            r0 = r2
        L3d:
            boolean r3 = r0 instanceof com.server.auditor.ssh.client.models.ActiveConnection
            if (r3 == 0) goto L44
            com.server.auditor.ssh.client.models.ActiveConnection r0 = (com.server.auditor.ssh.client.models.ActiveConnection) r0
            goto L45
        L44:
            r0 = r2
        L45:
            if (r0 == 0) goto L79
            long r3 = r0.getId()
            int r8 = r8.getSessionId()
            long r5 = (long) r8
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L79
            java.lang.Long r8 = r0.getHostId()
            if (r8 == 0) goto L6d
            long r3 = r8.longValue()
            hg.f r8 = hg.f.p()
            com.server.auditor.ssh.client.database.adapters.HostsDBAdapter r8 = r8.i()
            kj.a r8 = r8.getItemByLocalId(r3)
            com.server.auditor.ssh.client.database.models.HostDBModel r8 = (com.server.auditor.ssh.client.database.models.HostDBModel) r8
            goto L6e
        L6d:
            r8 = r2
        L6e:
            if (r8 == 0) goto L74
            java.lang.String r2 = r8.getTitle()
        L74:
            java.lang.String r8 = nm.y0.a(r0, r2)
            return r8
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.ssh.terminal.c.e(int):java.lang.CharSequence");
    }

    @Override // androidx.fragment.app.m0, androidx.viewpager.widget.a
    public Object g(ViewGroup viewGroup, int i10) {
        t.f(viewGroup, "container");
        Object objG = super.g(viewGroup, i10);
        t.d(objG, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        Fragment fragment = (Fragment) objG;
        this.f39017l.put(i10, fragment);
        this.f39016k.a(i10);
        return fragment;
    }

    @Override // androidx.fragment.app.m0
    public Fragment q(int i10) {
        if (this.f39015j.size() > i10) {
            return b.f38931u.a((TypedSessionId) this.f39015j.get(i10));
        }
        if (this.f39015j.size() <= 0) {
            return new b();
        }
        return b.f38931u.a((TypedSessionId) this.f39015j.get(r0.size() - 1));
    }

    public final int r(int i10) {
        Iterator it = this.f39015j.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (((TypedSessionId) it.next()).getSessionId() == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public final Fragment s(int i10) {
        return (Fragment) this.f39017l.get(i10);
    }

    public final void t(int i10) {
        this.f39015j.remove(i10);
        i();
    }

    public final void u(List list) {
        t.f(list, "sessionIds");
        this.f39015j.clear();
        this.f39015j.addAll(list);
        i();
    }
}
