package com.server.auditor.ssh.client.models;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f27948b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27949a;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends u {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f27950c = new b();

        private b() {
            super(2, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 1831116618;
        }

        public String toString() {
            return "Invite";
        }
    }

    public static final class c extends u {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f27951c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f27952d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f27953e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f27954f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final String f27955g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f27956h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final Uri f27957i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final TeamMemberInvitationStatus f27958j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j10, String str, String str2, int i10, String str3, boolean z10, Uri uri, TeamMemberInvitationStatus teamMemberInvitationStatus) {
            super(1, null);
            ju.t.f(str, "username");
            ju.t.f(str2, "fullName");
            ju.t.f(str3, "avatarInitials");
            this.f27951c = j10;
            this.f27952d = str;
            this.f27953e = str2;
            this.f27954f = i10;
            this.f27955g = str3;
            this.f27956h = z10;
            this.f27957i = uri;
            this.f27958j = teamMemberInvitationStatus;
        }

        public final int b() {
            return this.f27954f;
        }

        public final String c() {
            return this.f27955g;
        }

        public final String d() {
            return this.f27953e;
        }

        public final Uri e() {
            return this.f27957i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f27951c == cVar.f27951c && ju.t.b(this.f27952d, cVar.f27952d) && ju.t.b(this.f27953e, cVar.f27953e) && this.f27954f == cVar.f27954f && ju.t.b(this.f27955g, cVar.f27955g) && this.f27956h == cVar.f27956h && ju.t.b(this.f27957i, cVar.f27957i) && this.f27958j == cVar.f27958j;
        }

        public final TeamMemberInvitationStatus f() {
            return this.f27958j;
        }

        public final String g() {
            return this.f27952d;
        }

        public final boolean h() {
            return this.f27956h;
        }

        public int hashCode() {
            int iHashCode = ((((((((((Long.hashCode(this.f27951c) * 31) + this.f27952d.hashCode()) * 31) + this.f27953e.hashCode()) * 31) + Integer.hashCode(this.f27954f)) * 31) + this.f27955g.hashCode()) * 31) + Boolean.hashCode(this.f27956h)) * 31;
            Uri uri = this.f27957i;
            int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
            TeamMemberInvitationStatus teamMemberInvitationStatus = this.f27958j;
            return iHashCode2 + (teamMemberInvitationStatus != null ? teamMemberInvitationStatus.hashCode() : 0);
        }

        public String toString() {
            return "Member(userId=" + this.f27951c + ", username=" + this.f27952d + ", fullName=" + this.f27953e + ", avatarColorResId=" + this.f27954f + ", avatarInitials=" + this.f27955g + ", isOnline=" + this.f27956h + ", imageUri=" + this.f27957i + ", invitationStatus=" + this.f27958j + ")";
        }
    }

    public static final class d extends u {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f27959c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f27960d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f27961e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f27962f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final String f27963g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f27964h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final Uri f27965i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j10, String str, String str2, int i10, String str3, boolean z10, Uri uri) {
            super(0, null);
            ju.t.f(str, "username");
            ju.t.f(str2, "fullName");
            ju.t.f(str3, "avatarInitials");
            this.f27959c = j10;
            this.f27960d = str;
            this.f27961e = str2;
            this.f27962f = i10;
            this.f27963g = str3;
            this.f27964h = z10;
            this.f27965i = uri;
        }

        public final int b() {
            return this.f27962f;
        }

        public final String c() {
            return this.f27963g;
        }

        public final String d() {
            return this.f27961e;
        }

        public final Uri e() {
            return this.f27965i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f27959c == dVar.f27959c && ju.t.b(this.f27960d, dVar.f27960d) && ju.t.b(this.f27961e, dVar.f27961e) && this.f27962f == dVar.f27962f && ju.t.b(this.f27963g, dVar.f27963g) && this.f27964h == dVar.f27964h && ju.t.b(this.f27965i, dVar.f27965i);
        }

        public final String f() {
            return this.f27960d;
        }

        public final boolean g() {
            return this.f27964h;
        }

        public int hashCode() {
            int iHashCode = ((((((((((Long.hashCode(this.f27959c) * 31) + this.f27960d.hashCode()) * 31) + this.f27961e.hashCode()) * 31) + Integer.hashCode(this.f27962f)) * 31) + this.f27963g.hashCode()) * 31) + Boolean.hashCode(this.f27964h)) * 31;
            Uri uri = this.f27965i;
            return iHashCode + (uri == null ? 0 : uri.hashCode());
        }

        public String toString() {
            return "Owner(userId=" + this.f27959c + ", username=" + this.f27960d + ", fullName=" + this.f27961e + ", avatarColorResId=" + this.f27962f + ", avatarInitials=" + this.f27963g + ", isOnline=" + this.f27964h + ", imageUri=" + this.f27965i + ")";
        }
    }

    public /* synthetic */ u(int i10, ju.k kVar) {
        this(i10);
    }

    public final int a() {
        return this.f27949a;
    }

    private u(int i10) {
        this.f27949a = i10;
    }
}
