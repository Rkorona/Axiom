package com.server.auditor.ssh.client.ui.sshid.data.enums;

import androidx.annotation.Keep;
import bu.a;
import bu.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class StateOfGenerationPasskeys {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ StateOfGenerationPasskeys[] $VALUES;
    public static final StateOfGenerationPasskeys GETTING_DEVICE_LIST = new StateOfGenerationPasskeys("GETTING_DEVICE_LIST", 0);
    public static final StateOfGenerationPasskeys KEY_GENERATION_IN_PROGRESS = new StateOfGenerationPasskeys("KEY_GENERATION_IN_PROGRESS", 1);
    public static final StateOfGenerationPasskeys KEY_GENERATION_RETRY_NEEDED = new StateOfGenerationPasskeys("KEY_GENERATION_RETRY_NEEDED", 2);
    public static final StateOfGenerationPasskeys KEY_GENERATION_SUCCESS_MESSAGE = new StateOfGenerationPasskeys("KEY_GENERATION_SUCCESS_MESSAGE", 3);
    public static final StateOfGenerationPasskeys WAITING_FOR_OTHER_DEVICES = new StateOfGenerationPasskeys("WAITING_FOR_OTHER_DEVICES", 4);
    public static final StateOfGenerationPasskeys ALL_DEVICES_ARE_READY = new StateOfGenerationPasskeys("ALL_DEVICES_ARE_READY", 5);

    private static final /* synthetic */ StateOfGenerationPasskeys[] $values() {
        return new StateOfGenerationPasskeys[]{GETTING_DEVICE_LIST, KEY_GENERATION_IN_PROGRESS, KEY_GENERATION_RETRY_NEEDED, KEY_GENERATION_SUCCESS_MESSAGE, WAITING_FOR_OTHER_DEVICES, ALL_DEVICES_ARE_READY};
    }

    static {
        StateOfGenerationPasskeys[] stateOfGenerationPasskeysArr$values = $values();
        $VALUES = stateOfGenerationPasskeysArr$values;
        $ENTRIES = b.a(stateOfGenerationPasskeysArr$values);
    }

    private StateOfGenerationPasskeys(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static StateOfGenerationPasskeys valueOf(String str) {
        return (StateOfGenerationPasskeys) Enum.valueOf(StateOfGenerationPasskeys.class, str);
    }

    public static StateOfGenerationPasskeys[] values() {
        return (StateOfGenerationPasskeys[]) $VALUES.clone();
    }
}
