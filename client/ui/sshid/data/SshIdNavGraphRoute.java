package com.server.auditor.ssh.client.ui.sshid.data;

import androidx.annotation.Keep;
import com.server.auditor.ssh.client.ui.sshid.data.SshIdNavGraphRoute;
import hv.c;
import hv.p;
import iu.a;
import java.lang.annotation.Annotation;
import lv.w1;
import ut.n;
import ut.o;
import ut.r;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public interface SshIdNavGraphRoute {

    @p
    public static final class DetailsScreenRoute implements SshIdNavGraphRoute {
        public static final DetailsScreenRoute INSTANCE = new DetailsScreenRoute();
        private static final /* synthetic */ n $cachedSerializer$delegate = o.b(r.f82638b, new a() { // from class: yo.g
            @Override // iu.a
            public final Object a() {
                return SshIdNavGraphRoute.DetailsScreenRoute._init_$_anonymous_();
            }
        });
        public static final int $stable = 8;

        private DetailsScreenRoute() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ c _init_$_anonymous_() {
            return new w1("com.server.auditor.ssh.client.ui.sshid.data.SshIdNavGraphRoute.DetailsScreenRoute", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ c get$cachedSerializer() {
            return (c) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof DetailsScreenRoute);
        }

        public int hashCode() {
            return 1804424096;
        }

        public final c serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "DetailsScreenRoute";
        }
    }

    @p
    public static final class FinishSetupScreenRoute implements SshIdNavGraphRoute {
        public static final FinishSetupScreenRoute INSTANCE = new FinishSetupScreenRoute();
        private static final /* synthetic */ n $cachedSerializer$delegate = o.b(r.f82638b, new a() { // from class: yo.h
            @Override // iu.a
            public final Object a() {
                return SshIdNavGraphRoute.FinishSetupScreenRoute._init_$_anonymous_();
            }
        });
        public static final int $stable = 8;

        private FinishSetupScreenRoute() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ c _init_$_anonymous_() {
            return new w1("com.server.auditor.ssh.client.ui.sshid.data.SshIdNavGraphRoute.FinishSetupScreenRoute", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ c get$cachedSerializer() {
            return (c) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof FinishSetupScreenRoute);
        }

        public int hashCode() {
            return -1985877832;
        }

        public final c serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "FinishSetupScreenRoute";
        }
    }

    @p
    public static final class GreetingScreenRoute implements SshIdNavGraphRoute {
        public static final GreetingScreenRoute INSTANCE = new GreetingScreenRoute();
        private static final /* synthetic */ n $cachedSerializer$delegate = o.b(r.f82638b, new a() { // from class: yo.i
            @Override // iu.a
            public final Object a() {
                return SshIdNavGraphRoute.GreetingScreenRoute._init_$_anonymous_();
            }
        });
        public static final int $stable = 8;

        private GreetingScreenRoute() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ c _init_$_anonymous_() {
            return new w1("com.server.auditor.ssh.client.ui.sshid.data.SshIdNavGraphRoute.GreetingScreenRoute", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ c get$cachedSerializer() {
            return (c) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof GreetingScreenRoute);
        }

        public int hashCode() {
            return -1712109089;
        }

        public final c serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "GreetingScreenRoute";
        }
    }

    @p
    public static final class PasskeysGenerationForSecondDeviceScreenRoute implements SshIdNavGraphRoute {
        public static final PasskeysGenerationForSecondDeviceScreenRoute INSTANCE = new PasskeysGenerationForSecondDeviceScreenRoute();
        private static final /* synthetic */ n $cachedSerializer$delegate = o.b(r.f82638b, new a() { // from class: yo.j
            @Override // iu.a
            public final Object a() {
                return SshIdNavGraphRoute.PasskeysGenerationForSecondDeviceScreenRoute._init_$_anonymous_();
            }
        });
        public static final int $stable = 8;

        private PasskeysGenerationForSecondDeviceScreenRoute() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ c _init_$_anonymous_() {
            return new w1("com.server.auditor.ssh.client.ui.sshid.data.SshIdNavGraphRoute.PasskeysGenerationForSecondDeviceScreenRoute", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ c get$cachedSerializer() {
            return (c) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof PasskeysGenerationForSecondDeviceScreenRoute);
        }

        public int hashCode() {
            return 226582540;
        }

        public final c serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "PasskeysGenerationForSecondDeviceScreenRoute";
        }
    }

    @p
    public static final class PasskeysGenerationScreenRoute implements SshIdNavGraphRoute {
        public static final PasskeysGenerationScreenRoute INSTANCE = new PasskeysGenerationScreenRoute();
        private static final /* synthetic */ n $cachedSerializer$delegate = o.b(r.f82638b, new a() { // from class: yo.k
            @Override // iu.a
            public final Object a() {
                return SshIdNavGraphRoute.PasskeysGenerationScreenRoute._init_$_anonymous_();
            }
        });
        public static final int $stable = 8;

        private PasskeysGenerationScreenRoute() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ c _init_$_anonymous_() {
            return new w1("com.server.auditor.ssh.client.ui.sshid.data.SshIdNavGraphRoute.PasskeysGenerationScreenRoute", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ c get$cachedSerializer() {
            return (c) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof PasskeysGenerationScreenRoute);
        }

        public int hashCode() {
            return -1315918501;
        }

        public final c serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "PasskeysGenerationScreenRoute";
        }
    }

    @p
    public static final class ReadyScreenRoute implements SshIdNavGraphRoute {
        public static final ReadyScreenRoute INSTANCE = new ReadyScreenRoute();
        private static final /* synthetic */ n $cachedSerializer$delegate = o.b(r.f82638b, new a() { // from class: yo.l
            @Override // iu.a
            public final Object a() {
                return SshIdNavGraphRoute.ReadyScreenRoute._init_$_anonymous_();
            }
        });
        public static final int $stable = 8;

        private ReadyScreenRoute() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ c _init_$_anonymous_() {
            return new w1("com.server.auditor.ssh.client.ui.sshid.data.SshIdNavGraphRoute.ReadyScreenRoute", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ c get$cachedSerializer() {
            return (c) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ReadyScreenRoute);
        }

        public int hashCode() {
            return -1206816033;
        }

        public final c serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "ReadyScreenRoute";
        }
    }

    @p
    public static final class SetUsernameScreenRoute implements SshIdNavGraphRoute {
        public static final SetUsernameScreenRoute INSTANCE = new SetUsernameScreenRoute();
        private static final /* synthetic */ n $cachedSerializer$delegate = o.b(r.f82638b, new a() { // from class: yo.m
            @Override // iu.a
            public final Object a() {
                return SshIdNavGraphRoute.SetUsernameScreenRoute._init_$_anonymous_();
            }
        });
        public static final int $stable = 8;

        private SetUsernameScreenRoute() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ c _init_$_anonymous_() {
            return new w1("com.server.auditor.ssh.client.ui.sshid.data.SshIdNavGraphRoute.SetUsernameScreenRoute", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ c get$cachedSerializer() {
            return (c) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SetUsernameScreenRoute);
        }

        public int hashCode() {
            return -2085180854;
        }

        public final c serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "SetUsernameScreenRoute";
        }
    }

    @p
    public static final class UseBiometricsRoute implements SshIdNavGraphRoute {
        public static final UseBiometricsRoute INSTANCE = new UseBiometricsRoute();
        private static final /* synthetic */ n $cachedSerializer$delegate = o.b(r.f82638b, new a() { // from class: yo.n
            @Override // iu.a
            public final Object a() {
                return SshIdNavGraphRoute.UseBiometricsRoute._init_$_anonymous_();
            }
        });
        public static final int $stable = 8;

        private UseBiometricsRoute() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ c _init_$_anonymous_() {
            return new w1("com.server.auditor.ssh.client.ui.sshid.data.SshIdNavGraphRoute.UseBiometricsRoute", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ c get$cachedSerializer() {
            return (c) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof UseBiometricsRoute);
        }

        public int hashCode() {
            return 1442733516;
        }

        public final c serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "UseBiometricsRoute";
        }
    }
}
