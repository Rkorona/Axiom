package com.server.auditor.ssh.client.ui.sessionlogs.presentation;

import com.server.auditor.ssh.client.ui.sessionlogs.domain.SessionLogsPromoBannerRepository;

/* JADX INFO: loaded from: classes4.dex */
interface i {

    public static final class a implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f40727a = new a();

        private a() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -4587925;
        }

        public String toString() {
            return "OnClearDismissedSessionLogsPromotionClick";
        }
    }

    public static final class b implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SessionLogsPromoBannerRepository.SessionLogsPromoBannerType f40728a;

        public b(SessionLogsPromoBannerRepository.SessionLogsPromoBannerType sessionLogsPromoBannerType) {
            this.f40728a = sessionLogsPromoBannerType;
        }

        public final SessionLogsPromoBannerRepository.SessionLogsPromoBannerType a() {
            return this.f40728a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f40728a == ((b) obj).f40728a;
        }

        public int hashCode() {
            SessionLogsPromoBannerRepository.SessionLogsPromoBannerType sessionLogsPromoBannerType = this.f40728a;
            if (sessionLogsPromoBannerType == null) {
                return 0;
            }
            return sessionLogsPromoBannerType.hashCode();
        }

        public String toString() {
            return "OnSetSessionLogsPromotion(promotion=" + this.f40728a + ")";
        }
    }

    public static final class c implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f40729a = new c();

        private c() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return -528597813;
        }

        public String toString() {
            return "OnSetSessionLogsPromotionClick";
        }
    }

    public static final class d implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f40730a = new d();

        private d() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return 141127274;
        }

        public String toString() {
            return "OnSetSessionLogsPromotionDialogDismissRequest";
        }
    }
}
