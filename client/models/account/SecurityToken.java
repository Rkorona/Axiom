package com.server.auditor.ssh.client.models.account;

import android.os.Parcel;
import android.os.Parcelable;
import com.server.auditor.ssh.client.models.account.SecurityToken;
import hv.c;
import hv.m;
import hv.p;
import java.lang.annotation.Annotation;
import ju.k;
import ju.n0;
import ju.t;
import qu.b;
import ut.n;
import ut.o;
import ut.r;

/* JADX INFO: loaded from: classes3.dex */
@p
public abstract class SecurityToken implements Parcelable {
    public static final int $stable = 0;
    private final String token;
    public static final a Companion = new a(null);
    private static final n $cachedSerializer$delegate = o.b(r.f82638b, new iu.a() { // from class: oj.b
        @Override // iu.a
        public final Object a() {
            return SecurityToken._init_$_anonymous_();
        }
    });

    public static final class PlayIntegrityToken extends SecurityToken {
        private final String token;
        public static final Parcelable.Creator<PlayIntegrityToken> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PlayIntegrityToken createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                return new PlayIntegrityToken(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final PlayIntegrityToken[] newArray(int i10) {
                return new PlayIntegrityToken[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PlayIntegrityToken(String str) {
            super(str, null);
            t.f(str, "token");
            this.token = str;
        }

        public static /* synthetic */ PlayIntegrityToken copy$default(PlayIntegrityToken playIntegrityToken, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = playIntegrityToken.token;
            }
            return playIntegrityToken.copy(str);
        }

        public final String component1() {
            return this.token;
        }

        public final PlayIntegrityToken copy(String str) {
            t.f(str, "token");
            return new PlayIntegrityToken(str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PlayIntegrityToken) && t.b(this.token, ((PlayIntegrityToken) obj).token);
        }

        @Override // com.server.auditor.ssh.client.models.account.SecurityToken
        public String getToken() {
            return this.token;
        }

        public int hashCode() {
            return this.token.hashCode();
        }

        public String toString() {
            return "PlayIntegrityToken(token=" + this.token + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            parcel.writeString(this.token);
        }
    }

    public static final class ReCaptchaToken extends SecurityToken {
        private final String token;
        public static final Parcelable.Creator<ReCaptchaToken> CREATOR = new a();
        public static final int $stable = 8;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ReCaptchaToken createFromParcel(Parcel parcel) {
                t.f(parcel, "parcel");
                return new ReCaptchaToken(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ReCaptchaToken[] newArray(int i10) {
                return new ReCaptchaToken[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReCaptchaToken(String str) {
            super(str, null);
            t.f(str, "token");
            this.token = str;
        }

        public static /* synthetic */ ReCaptchaToken copy$default(ReCaptchaToken reCaptchaToken, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = reCaptchaToken.token;
            }
            return reCaptchaToken.copy(str);
        }

        public final String component1() {
            return this.token;
        }

        public final ReCaptchaToken copy(String str) {
            t.f(str, "token");
            return new ReCaptchaToken(str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ReCaptchaToken) && t.b(this.token, ((ReCaptchaToken) obj).token);
        }

        @Override // com.server.auditor.ssh.client.models.account.SecurityToken
        public String getToken() {
            return this.token;
        }

        public int hashCode() {
            return this.token.hashCode();
        }

        public String toString() {
            return "ReCaptchaToken(token=" + this.token + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            t.f(parcel, "dest");
            parcel.writeString(this.token);
        }
    }

    public static final class a {
        private a() {
        }

        private final /* synthetic */ c a() {
            return (c) SecurityToken.$cachedSerializer$delegate.getValue();
        }

        public final c serializer() {
            return a();
        }

        public /* synthetic */ a(k kVar) {
            this();
        }
    }

    public /* synthetic */ SecurityToken(String str, k kVar) {
        this(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ c _init_$_anonymous_() {
        return new m("com.server.auditor.ssh.client.models.account.SecurityToken", n0.b(SecurityToken.class), new b[0], new c[0], new Annotation[0]);
    }

    public String getToken() {
        return this.token;
    }

    private SecurityToken(String str) {
        this.token = str;
    }
}
