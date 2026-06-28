package com.server.auditor.ssh.client.navigation.ui.compose.sftp.domain;

import androidx.appcompat.widget.RtlSpacingHelper;
import androidx.lifecycle.i1;
import androidx.lifecycle.j1;
import com.server.auditor.ssh.client.database.Column;
import ju.k;
import ju.t;
import kotlin.coroutines.jvm.internal.d;
import ut.m0;
import vt.v;
import zt.e;
import zu.f;
import zu.g;
import zu.g0;
import zu.h;
import zu.k0;
import zu.w;

/* JADX INFO: loaded from: classes3.dex */
public final class SftpPathViewModel extends i1 {
    private static final String ROOT_NAME = "Root";
    private final w _currentPath;
    private final k0 pathItems;
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f33322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f33323b;

        public b(String str, String str2) {
            t.f(str, Column.MULTI_KEY_NAME);
            t.f(str2, "path");
            this.f33322a = str;
            this.f33323b = str2;
        }

        public final String a() {
            return this.f33322a;
        }

        public final String b() {
            return this.f33323b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return t.b(this.f33322a, bVar.f33322a) && t.b(this.f33323b, bVar.f33323b);
        }

        public int hashCode() {
            return (this.f33322a.hashCode() * 31) + this.f33323b.hashCode();
        }

        public String toString() {
            return "PathItem(name=" + this.f33322a + ", path=" + this.f33323b + ")";
        }
    }

    public static final class c implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f33324a;

        public static final class a implements g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ g f33325a;

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.ui.compose.sftp.domain.SftpPathViewModel$c$a$a, reason: collision with other inner class name */
            public static final class C0512a extends d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f33326a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f33327b;

                public C0512a(e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f33326a = obj;
                    this.f33327b |= RtlSpacingHelper.UNDEFINED;
                    return a.this.emit(null, this);
                }
            }

            public a(g gVar) {
                this.f33325a = gVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // zu.g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r24, zt.e r25) {
                /*
                    Method dump skipped, instruction units count: 296
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.navigation.ui.compose.sftp.domain.SftpPathViewModel.c.a.emit(java.lang.Object, zt.e):java.lang.Object");
            }
        }

        public c(f fVar) {
            this.f33324a = fVar;
        }

        @Override // zu.f
        public Object collect(g gVar, e eVar) {
            Object objCollect = this.f33324a.collect(new a(gVar), eVar);
            return objCollect == au.b.f() ? objCollect : m0.f82633a;
        }
    }

    public SftpPathViewModel() {
        w wVarA = zu.m0.a("");
        this._currentPath = wVarA;
        this.pathItems = h.P(new c(wVarA), j1.a(this), g0.f88389a.c(), v.o());
    }

    public final k0 getPathItems() {
        return this.pathItems;
    }

    public final void setCurrentPath(String str) {
        Object value;
        t.f(str, "path");
        w wVar = this._currentPath;
        do {
            value = wVar.getValue();
        } while (!wVar.g(value, str));
    }
}
