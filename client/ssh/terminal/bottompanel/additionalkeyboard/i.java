package com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard;

import com.crystalnix.termius.libtermius.wrappers.LibTermiusSshClient;
import com.server.auditor.ssh.client.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final HashMap f39004a;

    static {
        HashMap map = new HashMap();
        f39004a = map;
        map.put("AC", new Integer[]{Integer.valueOf(R.drawable.ic_autocomplete_disabled), Integer.valueOf(R.drawable.ic_autocomplete_enabled)});
        map.put("Left", new Integer[]{Integer.valueOf(R.drawable.arrow_left_float)});
        map.put("Right", new Integer[]{Integer.valueOf(R.drawable.arrow_right_float)});
        map.put("Up", new Integer[]{Integer.valueOf(R.drawable.arrow_up_float)});
        map.put("Down", new Integer[]{Integer.valueOf(R.drawable.arrow_down_float)});
        map.put("Snippets", new Integer[]{Integer.valueOf(R.drawable.ic_additional_snippets)});
        map.put(LibTermiusSshClient.SFTP_TAG, new Integer[]{Integer.valueOf(R.drawable.ic_folder_sftp)});
        map.put("Back Space", new Integer[]{Integer.valueOf(R.drawable.ic_backspace)});
        map.put("Arrows", new Integer[]{Integer.valueOf(R.drawable.all_arrows_btn)});
        map.put("QC", new Integer[]{Integer.valueOf(R.drawable.ic_quick_connect_plus)});
        map.put("Fullscreen", new Integer[]{Integer.valueOf(R.drawable.ic_fullscreen)});
        map.put("Paste_password", new Integer[]{Integer.valueOf(R.drawable.ic_password_paste)});
        map.put("AI", new Integer[]{Integer.valueOf(R.drawable.ic_wand)});
    }

    public static Integer[] a(String str) {
        HashMap map = f39004a;
        return map.containsKey(str) ? (Integer[]) map.get(str) : new Integer[0];
    }
}
