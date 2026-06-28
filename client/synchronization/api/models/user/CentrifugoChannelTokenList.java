package com.server.auditor.ssh.client.synchronization.api.models.user;

import com.server.auditor.ssh.client.synchronization.api.models.user.CentrifugoChannelTokenList;
import hv.c;
import hv.p;
import iu.a;
import java.util.List;
import ju.k;
import ju.t;
import lv.d2;
import lv.f;
import lv.s2;
import ut.n;
import ut.o;
import ut.r;

/* JADX INFO: loaded from: classes4.dex */
@p
public final class CentrifugoChannelTokenList {
    private final List<CentrifugoChannelToken> channels;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final n[] $childSerializers = {o.b(r.f82638b, new a() { // from class: gn.b
        @Override // iu.a
        public final Object a() {
            return CentrifugoChannelTokenList._childSerializers$_anonymous_();
        }
    })};

    public static final class Companion {
        private Companion() {
        }

        public final c serializer() {
            return CentrifugoChannelTokenList$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ CentrifugoChannelTokenList(int i10, List list, s2 s2Var) {
        if (1 != (i10 & 1)) {
            d2.a(i10, 1, CentrifugoChannelTokenList$$serializer.INSTANCE.getDescriptor());
        }
        this.channels = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _childSerializers$_anonymous_() {
        return new f(CentrifugoChannelToken$$serializer.INSTANCE);
    }

    @hv.o("channels")
    public static /* synthetic */ void getChannels$annotations() {
    }

    public final List<CentrifugoChannelToken> getChannels() {
        return this.channels;
    }

    public CentrifugoChannelTokenList(List<CentrifugoChannelToken> list) {
        t.f(list, "channels");
        this.channels = list;
    }
}
