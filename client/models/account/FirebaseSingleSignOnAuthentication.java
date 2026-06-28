package com.server.auditor.ssh.client.models.account;

import android.os.Parcelable;
import com.server.auditor.ssh.client.models.account.AppleSingleSignOnAuthentication;
import com.server.auditor.ssh.client.models.account.GoogleSingleSignOnAuthentication;
import hv.c;
import hv.m;
import hv.p;
import java.lang.annotation.Annotation;
import ju.n0;
import qu.b;

/* JADX INFO: loaded from: classes3.dex */
@p
public interface FirebaseSingleSignOnAuthentication extends AuthenticationModel, Parcelable {
    public static final a Companion = a.f27892a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f27892a = new a();

        private a() {
        }

        public final c serializer() {
            return new m("com.server.auditor.ssh.client.models.account.FirebaseSingleSignOnAuthentication", n0.b(FirebaseSingleSignOnAuthentication.class), new b[]{n0.b(AppleSingleSignOnAuthentication.class), n0.b(GoogleSingleSignOnAuthentication.class)}, new c[]{AppleSingleSignOnAuthentication.a.f27885a, GoogleSingleSignOnAuthentication.a.f27893a}, new Annotation[0]);
        }
    }

    String getEmail();

    String getFirebaseToken();
}
