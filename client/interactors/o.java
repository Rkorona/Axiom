package com.server.auditor.ssh.client.interactors;

import com.server.auditor.ssh.client.R;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f27492a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List f27493b = vt.v.r(Integer.valueOf(R.drawable.ic_simple_avatar_1), Integer.valueOf(R.drawable.ic_simple_avatar_2), Integer.valueOf(R.drawable.ic_simple_avatar_3), Integer.valueOf(R.drawable.ic_simple_avatar_4), Integer.valueOf(R.drawable.ic_simple_avatar_5), Integer.valueOf(R.drawable.ic_simple_avatar_6), Integer.valueOf(R.drawable.ic_simple_avatar_7), Integer.valueOf(R.drawable.ic_simple_avatar_8), Integer.valueOf(R.drawable.ic_simple_avatar_9));

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    public final int a(long j10, String str) {
        ju.t.f(str, "username");
        return ((Number) f27493b.get(j10 != 0 ? (int) Math.abs(j10 % ((long) f27493b.size())) : Math.abs(str.length() % f27493b.size()))).intValue();
    }
}
