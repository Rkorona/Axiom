package com.server.auditor.ssh.client.ui.auth.welcome.data;

import androidx.annotation.Keep;
import ju.k;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public abstract class WelcomeIntroStages {
    public static final int $stable = 8;
    private final float gridAlpha;
    private final boolean isButtonVisible;
    private final WelcomeIntroStages next;
    private final int shineRadius;
    private final float shineXScale;
    private final float since;
    private final float textAlpha;
    private final int textYOffset;

    @Keep
    public static final class Exiting extends WelcomeIntroStages {
        public static final Exiting INSTANCE = new Exiting();
        public static final int $stable = 8;

        private Exiting() {
            super(0.9f, null, 250, 0.0f, 0.0f, 0, 0.0f, false, 10, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Exiting);
        }

        public int hashCode() {
            return -519783438;
        }

        public String toString() {
            return "Exiting";
        }
    }

    @Keep
    public static final class Final extends WelcomeIntroStages {
        public static final Final INSTANCE = new Final();
        public static final int $stable = 8;

        private Final() {
            super(0.9f, null, 250, 0.0f, 1.0f, 0, 0.15f, true, 10, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Final);
        }

        public int hashCode() {
            return -1801175324;
        }

        public String toString() {
            return "Final";
        }
    }

    @Keep
    public static final class Initial extends WelcomeIntroStages {
        public static final Initial INSTANCE = new Initial();
        public static final int $stable = 8;

        private Initial() {
            super(0.0f, ManyIconsShineOn.INSTANCE, 0, 0.0f, 0.0f, 0, 0.0f, false, 253, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Initial);
        }

        public int hashCode() {
            return -1551027918;
        }

        public String toString() {
            return "Initial";
        }
    }

    @Keep
    public static final class ManyIconsShineOff extends WelcomeIntroStages {
        public static final ManyIconsShineOff INSTANCE = new ManyIconsShineOff();
        public static final int $stable = 8;

        private ManyIconsShineOff() {
            super(0.65f, OneIconShineOn.INSTANCE, 150, 2.0f, 0.0f, 0, 0.0f, false, 240, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ManyIconsShineOff);
        }

        public int hashCode() {
            return -1610822259;
        }

        public String toString() {
            return "ManyIconsShineOff";
        }
    }

    @Keep
    public static final class ManyIconsShineOn extends WelcomeIntroStages {
        public static final ManyIconsShineOn INSTANCE = new ManyIconsShineOn();
        public static final int $stable = 8;

        private ManyIconsShineOn() {
            super(0.1f, ManyIconsShineOff.INSTANCE, 150, 2.0f, 0.0f, 0, 0.0f, false, 240, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ManyIconsShineOn);
        }

        public int hashCode() {
            return 640774657;
        }

        public String toString() {
            return "ManyIconsShineOn";
        }
    }

    @Keep
    public static final class OneIconShineOn extends WelcomeIntroStages {
        public static final OneIconShineOn INSTANCE = new OneIconShineOn();
        public static final int $stable = 8;

        private OneIconShineOn() {
            super(0.7f, Final.INSTANCE, 600, 0.0f, 0.0f, 0, 0.0f, false, 248, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof OneIconShineOn);
        }

        public int hashCode() {
            return 1363588605;
        }

        public String toString() {
            return "OneIconShineOn";
        }
    }

    public /* synthetic */ WelcomeIntroStages(float f10, WelcomeIntroStages welcomeIntroStages, int i10, float f11, float f12, int i11, float f13, boolean z10, k kVar) {
        this(f10, welcomeIntroStages, i10, f11, f12, i11, f13, z10);
    }

    public final float getGridAlpha() {
        return this.gridAlpha;
    }

    public final WelcomeIntroStages getNext() {
        return this.next;
    }

    public final int getShineRadius() {
        return this.shineRadius;
    }

    public final float getShineXScale() {
        return this.shineXScale;
    }

    public final float getSince() {
        return this.since;
    }

    public final float getTextAlpha() {
        return this.textAlpha;
    }

    public final int getTextYOffset() {
        return this.textYOffset;
    }

    public final boolean isButtonVisible() {
        return this.isButtonVisible;
    }

    private WelcomeIntroStages(float f10, WelcomeIntroStages welcomeIntroStages, int i10, float f11, float f12, int i11, float f13, boolean z10) {
        this.since = f10;
        this.next = welcomeIntroStages;
        this.shineRadius = i10;
        this.shineXScale = f11;
        this.textAlpha = f12;
        this.textYOffset = i11;
        this.gridAlpha = f13;
        this.isButtonVisible = z10;
    }

    public /* synthetic */ WelcomeIntroStages(float f10, WelcomeIntroStages welcomeIntroStages, int i10, float f11, float f12, int i11, float f13, boolean z10, int i12, k kVar) {
        this((i12 & 1) != 0 ? 0.0f : f10, (i12 & 2) != 0 ? null : welcomeIntroStages, (i12 & 4) != 0 ? 1 : i10, (i12 & 8) != 0 ? 1.0f : f11, (i12 & 16) != 0 ? 0.0f : f12, (i12 & 32) != 0 ? 25 : i11, (i12 & 64) == 0 ? f13 : 0.0f, (i12 & 128) != 0 ? false : z10, null);
    }
}
