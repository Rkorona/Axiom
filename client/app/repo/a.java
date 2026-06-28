package com.server.auditor.ssh.client.app.repo;

import android.content.SharedPreferences;
import com.server.auditor.ssh.client.app.repo.InAppNotificationsApiRepository;
import hg.d;
import java.util.ArrayList;
import java.util.List;
import ju.k;
import ju.t;
import mv.b;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f21489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f21490b;

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.app.repo.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0322a {

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.app.repo.a$a$a, reason: collision with other inner class name */
        public static final class C0323a extends AbstractC0322a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Exception f21491a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0323a(Exception exc) {
                super(null);
                t.f(exc, "exception");
                this.f21491a = exc;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0323a) && t.b(this.f21491a, ((C0323a) obj).f21491a);
            }

            public int hashCode() {
                return this.f21491a.hashCode();
            }

            public String toString() {
                return "Error(exception=" + this.f21491a + ")";
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.app.repo.a$a$b */
        public static final class b extends AbstractC0322a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f21492a = new b();

            private b() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.app.repo.a$a$c */
        public static final class c extends AbstractC0322a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Object f21493a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Object obj) {
                super(null);
                t.f(obj, "result");
                this.f21493a = obj;
            }

            public final Object a() {
                return this.f21493a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && t.b(this.f21493a, ((c) obj).f21493a);
            }

            public int hashCode() {
                return this.f21493a.hashCode();
            }

            public String toString() {
                return "Success(result=" + this.f21493a + ")";
            }
        }

        public /* synthetic */ AbstractC0322a(k kVar) {
            this();
        }

        private AbstractC0322a() {
        }
    }

    public a(d dVar, b bVar) {
        t.f(dVar, "keyValueRepository");
        t.f(bVar, "jsonConverter");
        this.f21489a = dVar;
        this.f21490b = bVar;
    }

    public final void a() {
        this.f21489a.edit().remove("key_notifications_cache").apply();
    }

    public final void b(int i10) {
        AbstractC0322a abstractC0322aC = c();
        if (abstractC0322aC instanceof AbstractC0322a.c) {
            AbstractC0322a.c cVar = (AbstractC0322a.c) abstractC0322aC;
            List<InAppNotificationsApiRepository.InAppMessageData> objects = ((InAppNotificationsApiRepository.InAppMessageResponse) cVar.a()).getObjects();
            ArrayList arrayList = new ArrayList();
            for (Object obj : objects) {
                if (((InAppNotificationsApiRepository.InAppMessageData) obj).getId() != i10) {
                    arrayList.add(obj);
                }
            }
            d(new InAppNotificationsApiRepository.InAppMessageResponse(arrayList.isEmpty() ? new InAppNotificationsApiRepository.InAppMessageMeta(0, null, 0, null, ((InAppNotificationsApiRepository.InAppMessageResponse) cVar.a()).getMeta().getLimit(), "") : ((InAppNotificationsApiRepository.InAppMessageResponse) cVar.a()).getMeta(), arrayList));
        }
    }

    public final AbstractC0322a c() {
        String string = this.f21489a.getString("key_notifications_cache", "");
        if (string == null || string.length() == 0) {
            return AbstractC0322a.b.f21492a;
        }
        try {
            b bVar = this.f21490b;
            bVar.a();
            return new AbstractC0322a.c((InAppNotificationsApiRepository.InAppMessageResponse) bVar.b(InAppNotificationsApiRepository.InAppMessageResponse.Companion.serializer(), string));
        } catch (IllegalArgumentException e10) {
            return new AbstractC0322a.C0323a(e10);
        }
    }

    public final void d(InAppNotificationsApiRepository.InAppMessageResponse inAppMessageResponse) {
        t.f(inAppMessageResponse, "cache");
        SharedPreferences.Editor editorEdit = this.f21489a.edit();
        try {
            b bVar = this.f21490b;
            bVar.a();
            editorEdit.putString("key_notifications_cache", bVar.c(InAppNotificationsApiRepository.InAppMessageResponse.Companion.serializer(), inAppMessageResponse));
        } catch (IllegalArgumentException unused) {
        }
        editorEdit.apply();
    }
}
