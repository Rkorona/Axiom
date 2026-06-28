package com.server.auditor.ssh.client.synchronization;

import java.net.ConnectException;
import java.net.HttpRetryException;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import ju.n0;
import ju.t;
import vt.c1;

/* JADX INFO: loaded from: classes4.dex */
public final class NetworkExceptionChecker {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(ju.k kVar) {
            this();
        }

        public final boolean isNetworkRelatedException(Exception exc) {
            t.f(exc, "exception");
            return c1.i(n0.b(UnknownHostException.class), n0.b(ConnectException.class), n0.b(HttpRetryException.class), n0.b(MalformedURLException.class), n0.b(NoRouteToHostException.class), n0.b(PortUnreachableException.class), n0.b(ProtocolException.class), n0.b(SocketException.class), n0.b(SocketTimeoutException.class), n0.b(UnknownServiceException.class), n0.b(URISyntaxException.class), n0.b(SSLException.class), n0.b(SSLHandshakeException.class)).contains(n0.b(exc.getClass()));
        }

        private Companion() {
        }
    }
}
