package com.server.auditor.ssh.client.models.account;

import android.os.Parcelable;
import com.server.auditor.ssh.client.models.account.AppleSingleSignOnAuthentication;
import com.server.auditor.ssh.client.models.account.EmailAuthentication;
import com.server.auditor.ssh.client.models.account.EnterpriseSingleSignOnAuthentication;
import com.server.auditor.ssh.client.models.account.GoogleSingleSignOnAuthentication;
import hv.c;
import hv.m;
import hv.p;
import java.lang.annotation.Annotation;
import ju.n0;
import qu.b;

/* JADX INFO: loaded from: classes3.dex */
@p
public interface AuthenticationModel extends Parcelable {
    public static final a Companion = a.f27887a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f27887a = new a();

        private a() {
        }

        public final c serializer() {
            return new m("com.server.auditor.ssh.client.models.account.AuthenticationModel", n0.b(AuthenticationModel.class), new b[]{n0.b(EmailAuthentication.class), n0.b(EnterpriseSingleSignOnAuthentication.class), n0.b(AppleSingleSignOnAuthentication.class), n0.b(GoogleSingleSignOnAuthentication.class)}, new c[]{EmailAuthentication.a.f27888a, EnterpriseSingleSignOnAuthentication.a.f27890a, AppleSingleSignOnAuthentication.a.f27885a, GoogleSingleSignOnAuthentication.a.f27893a}, new Annotation[0]);
        }
    }
}
