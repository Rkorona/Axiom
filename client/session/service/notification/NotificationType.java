package com.server.auditor.ssh.client.session.service.notification;

import com.server.auditor.ssh.client.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.server.auditor.ssh.client.session.service.notification.NotificationType, still in use, count: 1, list:
  (r0v0 com.server.auditor.ssh.client.session.service.notification.NotificationType) from 0x007a: IPUT 
  (wrap:int:SGET  A[WRAPPED] com.server.auditor.ssh.client.R.string.notification_start_connecting int)
  (r0v0 com.server.auditor.ssh.client.session.service.notification.NotificationType)
 com.server.auditor.ssh.client.session.service.notification.NotificationType.mTickerTextId int
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
public final class NotificationType {
    NOTIFICATION_START_CONNECTION,
    NOTIFICATION_CONNECT,
    NOTIFICATION_DISCONNECT,
    NOTIFICATION_CONNECTION_FAILED,
    NOTIFICATION_DESTROY_SERVICE,
    NOTIFICATION_CONNECTION_CLOSED,
    NOTIFICATION_START_PORT_FORWARDING,
    NOTIFICATION_STOP_PORT_FORWARDING,
    NOTIFICATION_START_SFTP_SESSION,
    NOTIFICATION_STOP_SFTP_SESSION,
    NOTIFICATION_NONE;

    private int mTickerTextId;

    static {
        new NotificationType().mTickerTextId = R.string.notification_start_connecting;
        new NotificationType().mTickerTextId = R.string.notification_connect;
        new NotificationType().mTickerTextId = R.string.notification_disconnect;
        new NotificationType().mTickerTextId = R.string.notification_connection_failed;
        new NotificationType().mTickerTextId = R.string.notification_connections_closed;
        new NotificationType().mTickerTextId = R.string.notification_close_connection;
        new NotificationType().mTickerTextId = R.string.notification_start_port_forwarding;
        new NotificationType().mTickerTextId = R.string.notification_stop_port_forwarding;
        new NotificationType().mTickerTextId = R.string.notification_start_sftp_session;
        new NotificationType().mTickerTextId = R.string.notification_stop_sftp_session;
        new NotificationType().mTickerTextId = 0;
    }

    private NotificationType() {
    }

    public static NotificationType valueOf(String str) {
        return (NotificationType) Enum.valueOf(NotificationType.class, str);
    }

    public static NotificationType[] values() {
        return (NotificationType[]) $VALUES.clone();
    }

    public int getTickerTextId() {
        return this.mTickerTextId;
    }
}
