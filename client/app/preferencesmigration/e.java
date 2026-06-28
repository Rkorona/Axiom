package com.server.auditor.ssh.client.app.preferencesmigration;

import android.content.SharedPreferences;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.app.TermiusApplication;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class e implements k {
    @Override // com.server.auditor.ssh.client.app.preferencesmigration.k
    public void a(SharedPreferences sharedPreferences) {
        List listAsList = Arrays.asList(TermiusApplication.F().getResources().getStringArray(R.array.FontValues));
        if (listAsList.contains(sharedPreferences.getString("fontTerminal", (String) listAsList.get(0)))) {
            return;
        }
        sharedPreferences.edit().putString("fontTerminal", (String) listAsList.get(0)).apply();
    }
}
