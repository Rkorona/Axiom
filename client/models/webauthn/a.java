package com.server.auditor.ssh.client.models.webauthn;

import hg.b2;
import hv.c;
import io.split.android.client.dtos.SerializableEvent;
import ju.t;
import jv.f;
import kv.e;
import mv.b;
import su.d;
import tp.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f27982a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final f f27983b = Fido2ClientData.Companion.serializer().getDescriptor();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f27984c = 8;

    private a() {
    }

    @Override // hv.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Fido2ClientData deserialize(e eVar) {
        t.f(eVar, "decoder");
        String str = new String(c0.d(eVar.x()), d.f78241b);
        b bVarS1 = b2.f52944a.s1();
        bVarS1.a();
        return (Fido2ClientData) bVarS1.b(Fido2ClientData.Companion.serializer(), str);
    }

    @Override // hv.r
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(kv.f fVar, Fido2ClientData fido2ClientData) {
        t.f(fVar, "encoder");
        t.f(fido2ClientData, SerializableEvent.VALUE_FIELD);
        Fido2ClientData.Companion.serializer().serialize(fVar, fido2ClientData);
    }

    @Override // hv.c, hv.r, hv.b
    public f getDescriptor() {
        return f27983b;
    }
}
