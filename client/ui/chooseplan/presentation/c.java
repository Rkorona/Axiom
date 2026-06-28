package com.server.auditor.ssh.client.ui.chooseplan.presentation;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.k1;
import com.server.auditor.ssh.client.R;
import java.io.Serializable;
import java.util.Calendar;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    public static class a implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f39943a;

        @Override // androidx.navigation.k1
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (this.f39943a.containsKey("grantedUntilDate")) {
                Calendar calendar = (Calendar) this.f39943a.get("grantedUntilDate");
                if (!Parcelable.class.isAssignableFrom(Calendar.class) && calendar != null) {
                    if (Serializable.class.isAssignableFrom(Calendar.class)) {
                        bundle.putSerializable("grantedUntilDate", (Serializable) Serializable.class.cast(calendar));
                        return bundle;
                    }
                    throw new UnsupportedOperationException(Calendar.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                bundle.putParcelable("grantedUntilDate", (Parcelable) Parcelable.class.cast(calendar));
            }
            return bundle;
        }

        @Override // androidx.navigation.k1
        public int b() {
            return R.id.action_endOfTrialCreateTeamTrialProgressScreen_to_endOfTrialTeamTrialStartedScreen;
        }

        public Calendar c() {
            return (Calendar) this.f39943a.get("grantedUntilDate");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f39943a.containsKey("grantedUntilDate") != aVar.f39943a.containsKey("grantedUntilDate")) {
                return false;
            }
            if (c() == null ? aVar.c() == null : c().equals(aVar.c())) {
                return b() == aVar.b();
            }
            return false;
        }

        public int hashCode() {
            return (((c() != null ? c().hashCode() : 0) + 31) * 31) + b();
        }

        public String toString() {
            return "ActionEndOfTrialCreateTeamTrialProgressScreenToEndOfTrialTeamTrialStartedScreen(actionId=" + b() + "){grantedUntilDate=" + c() + "}";
        }

        private a(Calendar calendar) {
            HashMap map = new HashMap();
            this.f39943a = map;
            if (calendar == null) {
                throw new IllegalArgumentException("Argument \"grantedUntilDate\" is marked as non-null but was passed a null value.");
            }
            map.put("grantedUntilDate", calendar);
        }
    }

    public static k1 a() {
        return new androidx.navigation.a(R.id.action_endOfTrialCreateTeamTrialProgressScreen_to_endOfTrialOopsScreen);
    }

    public static a b(Calendar calendar) {
        return new a(calendar);
    }
}
