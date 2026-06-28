package com.server.auditor.ssh.client.ui.sessionlogs.domain;

import com.server.auditor.ssh.client.ui.sessionlogs.domain.SessionLogsPromoBannerRepository;

/* JADX INFO: loaded from: classes4.dex */
public interface c {

    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f40633a = new a();

        private a() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -1879089730;
        }

        public String toString() {
            return "Invisible";
        }
    }

    public static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SessionLogsPromoBannerRepository.SessionLogsPromoBannerType f40634a;

        public b(SessionLogsPromoBannerRepository.SessionLogsPromoBannerType sessionLogsPromoBannerType) {
            this.f40634a = sessionLogsPromoBannerType;
        }

        public final SessionLogsPromoBannerRepository.SessionLogsPromoBannerType a() {
            return this.f40634a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f40634a == ((b) obj).f40634a;
        }

        public int hashCode() {
            SessionLogsPromoBannerRepository.SessionLogsPromoBannerType sessionLogsPromoBannerType = this.f40634a;
            if (sessionLogsPromoBannerType == null) {
                return 0;
            }
            return sessionLogsPromoBannerType.hashCode();
        }

        public String toString() {
            return "Visible(currentPromotion=" + this.f40634a + ")";
        }
    }
}
