package com.server.auditor.ssh.client.ui.chooseplan.presentation;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.k1;
import com.server.auditor.ssh.client.R;
import java.io.Serializable;
import java.util.Calendar;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b0 {

    public static class a implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f39942a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f39942a.containsKey("extendedByDays")) {
                bundle.putInt("extendedByDays", ((Integer) this.f39942a.get("extendedByDays")).intValue());
            }
            if (this.f39942a.containsKey("extendedUntilDate")) {
                Calendar calendar = (Calendar) this.f39942a.get("extendedUntilDate");
                if (!Parcelable.class.isAssignableFrom(Calendar.class) && calendar != null) {
                    if (Serializable.class.isAssignableFrom(Calendar.class)) {
                        bundle.putSerializable("extendedUntilDate", (Serializable) Serializable.class.cast(calendar));
                        return bundle;
                    }
                    throw new UnsupportedOperationException(Calendar.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                bundle.putParcelable("extendedUntilDate", (Parcelable) Parcelable.class.cast(calendar));
            }
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_teamTrialRequestExtensionScreen_to_teamTrialSuccessfullyExtendedScreen;
        }

        public int c() {
            return ((Integer) this.f39942a.get("extendedByDays")).intValue();
        }

        public Calendar d() {
            return (Calendar) this.f39942a.get("extendedUntilDate");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f39942a.containsKey("extendedByDays") != aVar.f39942a.containsKey("extendedByDays") || c() != aVar.c() || this.f39942a.containsKey("extendedUntilDate") != aVar.f39942a.containsKey("extendedUntilDate")) {
                return false;
            }
            if (d() == null ? aVar.d() == null : d().equals(aVar.d())) {
                return b() == aVar.b();
            }
            return false;
        }

        public int hashCode() {
            return ((((c() + 31) * 31) + (d() != null ? d().hashCode() : 0)) * 31) + b();
        }

        public String toString() {
            return "ActionTeamTrialRequestExtensionScreenToTeamTrialSuccessfullyExtendedScreen(actionId=" + b() + "){extendedByDays=" + c() + ", extendedUntilDate=" + d() + "}";
        }

        private a(int i10, Calendar calendar) {
            HashMap map = new HashMap();
            this.f39942a = map;
            map.put("extendedByDays", Integer.valueOf(i10));
            if (calendar == null) {
                throw new IllegalArgumentException("Argument \"extendedUntilDate\" is marked as non-null but was passed a null value.");
            }
            map.put("extendedUntilDate", calendar);
        }
    }

    public static k1 a() {
        return new androidx.navigation.a(R.id.action_teamTrialRequestExtensionScreen_to_endOfTrialOopsScreen);
    }

    public static k1 b() {
        return new androidx.navigation.a(R.id.action_teamTrialRequestExtensionScreen_to_teamTrialExtensionRejectedScreen);
    }

    public static a c(int i10, Calendar calendar) {
        return new a(i10, calendar);
    }
}
