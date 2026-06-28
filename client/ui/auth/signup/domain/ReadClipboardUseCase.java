package com.server.auditor.ssh.client.ui.auth.signup.domain;

import android.content.ClipData;
import androidx.annotation.Keep;
import com.server.auditor.ssh.client.help.c;
import ju.k;
import ju.t;
import sn.a;

/* JADX INFO: loaded from: classes4.dex */
public final class ReadClipboardUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f39291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f39292b;

    @Keep
    public interface Result {

        @Keep
        public static final class Empty implements Result {
            public static final int $stable = 0;
            public static final Empty INSTANCE = new Empty();

            private Empty() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Empty);
            }

            public int hashCode() {
                return -1367244508;
            }

            public String toString() {
                return "Empty";
            }
        }

        @Keep
        public static final class Unrecognized implements Result {
            public static final int $stable = 0;
            private final String content;

            /* JADX WARN: Multi-variable type inference failed */
            public Unrecognized() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ Unrecognized copy$default(Unrecognized unrecognized, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = unrecognized.content;
                }
                return unrecognized.copy(str);
            }

            public final String component1() {
                return this.content;
            }

            public final Unrecognized copy(String str) {
                t.f(str, "content");
                return new Unrecognized(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Unrecognized) && t.b(this.content, ((Unrecognized) obj).content);
            }

            public final String getContent() {
                return this.content;
            }

            public int hashCode() {
                return this.content.hashCode();
            }

            public String toString() {
                return "Unrecognized(content=" + this.content + ")";
            }

            public Unrecognized(String str) {
                t.f(str, "content");
                this.content = str;
            }

            public /* synthetic */ Unrecognized(String str, int i10, k kVar) {
                this((i10 & 1) != 0 ? "" : str);
            }
        }

        @Keep
        public static final class ValidCode implements Result {
            public static final int $stable = 0;
            private final String code;

            public ValidCode(String str) {
                t.f(str, "code");
                this.code = str;
            }

            public static /* synthetic */ ValidCode copy$default(ValidCode validCode, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = validCode.code;
                }
                return validCode.copy(str);
            }

            public final String component1() {
                return this.code;
            }

            public final ValidCode copy(String str) {
                t.f(str, "code");
                return new ValidCode(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ValidCode) && t.b(this.code, ((ValidCode) obj).code);
            }

            public final String getCode() {
                return this.code;
            }

            public int hashCode() {
                return this.code.hashCode();
            }

            public String toString() {
                return "ValidCode(code=" + this.code + ")";
            }
        }
    }

    public ReadClipboardUseCase(c cVar, a aVar) {
        t.f(cVar, "clipBoardRepository");
        t.f(aVar, "validateCodeByRegexUseCase");
        this.f39291a = cVar;
        this.f39292b = aVar;
    }

    public final Result a() {
        ClipData primaryClip = this.f39291a.a().getPrimaryClip();
        if (primaryClip == null || primaryClip.getItemCount() <= 0) {
            return Result.Empty.INSTANCE;
        }
        String string = primaryClip.getItemAt(0).getText().toString();
        return this.f39292b.a(string) ? new Result.ValidCode(string) : new Result.Unrecognized(string);
    }
}
