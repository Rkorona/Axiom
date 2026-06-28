package com.server.auditor.ssh.client.synchronization.api;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import k9.c;

/* JADX INFO: loaded from: classes4.dex */
public class VariablesConverter {
    public static final String CLIENT_COLOR_SCHEME_DEFAULT = "Default";
    public static final Map<String, String> COLOR_SCHEME_API_KEY;
    public static final Map<String, String> COLOR_SCHEME_CLIENT_KEY;

    private static class ApiColorSchemes {
        public static final String ATOM_ONE_DARK = "atom one dark";
        public static final String ATOM_ONE_LIGHT = "atom one light";
        public static final String AUBERGINE = "aubergine";
        public static final String AURA = "aura";
        public static final String AYU_DARK = "ayu dark";
        public static final String AYU_LIGHT = "ayu light";
        public static final String CATPPUCCIN_LATTE = "catppuccin latte";
        public static final String CATPPUCCIN_MOCHA = "catppuccin mocha";
        public static final String COBALT2 = "cobalt2";
        public static final String CYBERPUNK = "cyberpunk";
        public static final String CYBERPUNK_SCARLET = "cyberpunk scarlet";
        public static final String DEFAULT = null;
        public static final String DIA_DE_MUERTOS = "dia de muertos";
        public static final String DIWALI = "diwali";
        public static final String DRACULA = "dracula";
        public static final String EVERFOREST_DARK = "everforest dark";
        public static final String EVERFOREST_LIGHT = "everforest light";
        public static final String FLEXOKI_DARK = "flexoki dark";
        public static final String FLEXOKI_LIGHT = "flexoki light";
        public static final String GRASS = "grass";
        public static final String GRUVBOX_DARK = "gruvbox dark";
        public static final String GRUVBOX_LIGHT = "gruvbox light";
        public static final String HACKER_BLUE = "hacker blue";
        public static final String HACKER_GREEN = "hacker green";
        public static final String HACKER_RED = "hacker red";
        public static final String HALLOWEEN = "halloween";
        public static final String HOMEBREW = "homebrew";
        public static final String KANAGAWA_DRAGON = "kanagawa dragon";
        public static final String KANAGAWA_LOTUS = "kanagawa lotus";
        public static final String KANAGAWA_WAVE = "kanagawa wave";
        public static final String LIGHT_OWL = "light owl";
        public static final String MANHATTAN = "manhattan";
        public static final String MAN_PAGE = "man page";
        public static final String MATERIAL_DARK = "material dark";
        public static final String MATERIAL_LIGHT = "material light";
        public static final String MONOKAI = "monokai";
        public static final String MOVEMBER = "movember";
        public static final String NIGHT_OWL = "night owl";
        public static final String NORD_DARK = "nord dark";
        public static final String NORD_LIGHT = "nord light";
        public static final String NOVEL = "novel";
        public static final String OCEAN = "ocean";
        public static final String OCTOCAT_DARK = "octocat dark";
        public static final String OCTOCAT_LIGHT = "octocat light";
        public static final String ORWELL_1984_DARK = "1984 dark";
        public static final String ORWELL_1984_LIGHT = "1984 light";
        public static final String PEACH_FRESH = "peach fresh";
        public static final String PLASTIC_WORLD = "plastic world";
        public static final String PRO = "pro";
        public static final String RED_SANDS = "red sands";
        public static final String ROMANIA_DAY = "romania day";
        public static final String ROMANIA_NIGHT = "romania night";
        public static final String ROSE_PINE = "rosé pine";
        public static final String ROSE_PINE_DAWN = "rosé pine dawn";
        public static final String ROSE_PINE_MOON = "rosé pine moon";
        public static final String SILVER_AEROGEL = "silver aerogel";
        public static final String SOLARIZED_D = "solarized dark";
        public static final String SOLARIZED_L = "solarized light";
        public static final String TERMINAL_BASIC = "basic";
        public static final String TERMIUS_DARK = "termius dark";
        public static final String TERMIUS_LIGHT = "termius light";
        public static final String TOKYO_DAY = "tokyo day";
        public static final String TOKYO_NIGHT = "tokyo night";
        public static final String WINTER_DAY = "winter day";
        public static final String WINTER_NIGHT = "winter night";

        private ApiColorSchemes() {
        }
    }

    static {
        HashMap map = new HashMap();
        COLOR_SCHEME_API_KEY = map;
        HashMap map2 = new HashMap();
        COLOR_SCHEME_CLIENT_KEY = map2;
        String str = ApiColorSchemes.DEFAULT;
        map.put(str, CLIENT_COLOR_SCHEME_DEFAULT);
        map.put(ApiColorSchemes.TERMINAL_BASIC, c.g.f63224d.b());
        map.put(ApiColorSchemes.GRASS, c.u.f63258d.b());
        map.put(ApiColorSchemes.HOMEBREW, c.b0.f63210d.b());
        map.put(ApiColorSchemes.MAN_PAGE, c.g0.f63225d.b());
        map.put(ApiColorSchemes.NOVEL, c.p0.f63249d.b());
        map.put(ApiColorSchemes.OCEAN, c.q0.f63251d.b());
        map.put(ApiColorSchemes.PRO, c.x0.f63265d.b());
        map.put(ApiColorSchemes.RED_SANDS, c.y0.f63267d.b());
        map.put(ApiColorSchemes.SILVER_AEROGEL, c.e1.f63220d.b());
        map.put(ApiColorSchemes.SOLARIZED_L, c.g1.f63226d.b());
        map.put(ApiColorSchemes.SOLARIZED_D, c.f1.f63223d.b());
        map.put(ApiColorSchemes.TERMIUS_LIGHT, c.i1.f63232d.b());
        map.put(ApiColorSchemes.TERMIUS_DARK, c.h1.f63229d.b());
        map.put(ApiColorSchemes.DRACULA, c.p.f63248d.b());
        map.put(ApiColorSchemes.MONOKAI, c.k0.f63236d.b());
        map.put(ApiColorSchemes.NORD_DARK, c.n0.f63245d.b());
        map.put(ApiColorSchemes.NORD_LIGHT, c.o0.f63247d.b());
        map.put(ApiColorSchemes.GRUVBOX_DARK, c.v.f63260d.b());
        map.put(ApiColorSchemes.GRUVBOX_LIGHT, c.w.f63262d.b());
        map.put(ApiColorSchemes.MANHATTAN, c.h0.f63228d.b());
        map.put(ApiColorSchemes.MATERIAL_LIGHT, c.j0.f63234d.b());
        map.put(ApiColorSchemes.MATERIAL_DARK, c.i0.f63231d.b());
        map.put(ApiColorSchemes.PLASTIC_WORLD, c.w0.f63263d.b());
        map.put(ApiColorSchemes.ATOM_ONE_DARK, c.a.f63206d.b());
        map.put(ApiColorSchemes.ATOM_ONE_LIGHT, c.b.f63209d.b());
        map.put(ApiColorSchemes.HALLOWEEN, c.a0.f63207d.b());
        map.put(ApiColorSchemes.DIA_DE_MUERTOS, c.n.f63244d.b());
        map.put(ApiColorSchemes.CATPPUCCIN_LATTE, c.h.f63227d.b());
        map.put(ApiColorSchemes.CATPPUCCIN_MOCHA, c.i.f63230d.b());
        map.put(ApiColorSchemes.MOVEMBER, c.l0.f63239d.b());
        map.put(ApiColorSchemes.DIWALI, c.o.f63246d.b());
        map.put(ApiColorSchemes.WINTER_NIGHT, c.m1.f63243d.b());
        map.put(ApiColorSchemes.WINTER_DAY, c.l1.f63240d.b());
        map.put(ApiColorSchemes.TOKYO_NIGHT, c.k1.f63237d.b());
        map.put(ApiColorSchemes.TOKYO_DAY, c.j1.f63235d.b());
        map.put(ApiColorSchemes.PEACH_FRESH, c.v0.f63261d.b());
        map.put(ApiColorSchemes.ORWELL_1984_DARK, c.t0.f63257d.b());
        map.put(ApiColorSchemes.ORWELL_1984_LIGHT, c.u0.f63259d.b());
        map.put(ApiColorSchemes.AUBERGINE, c.C0946c.f63212d.b());
        map.put(ApiColorSchemes.ROMANIA_DAY, c.z0.f63269d.b());
        map.put(ApiColorSchemes.ROMANIA_NIGHT, c.a1.f63208d.b());
        map.put(ApiColorSchemes.AYU_DARK, c.e.f63218d.b());
        map.put(ApiColorSchemes.AYU_LIGHT, c.f.f63221d.b());
        map.put(ApiColorSchemes.CYBERPUNK, c.l.f63238d.b());
        map.put(ApiColorSchemes.CYBERPUNK_SCARLET, c.m.f63241d.b());
        map.put(ApiColorSchemes.COBALT2, c.j.f63233d.b());
        map.put(ApiColorSchemes.OCTOCAT_DARK, c.r0.f63253d.b());
        map.put(ApiColorSchemes.OCTOCAT_LIGHT, c.s0.f63255d.b());
        map.put(ApiColorSchemes.ROSE_PINE, c.b1.f63211d.b());
        map.put(ApiColorSchemes.ROSE_PINE_DAWN, c.c1.f63214d.b());
        map.put(ApiColorSchemes.ROSE_PINE_MOON, c.d1.f63217d.b());
        map.put(ApiColorSchemes.AURA, c.d.f63215d.b());
        map.put(ApiColorSchemes.NIGHT_OWL, c.m0.f63242d.b());
        map.put(ApiColorSchemes.LIGHT_OWL, c.f0.f63222d.b());
        map.put(ApiColorSchemes.EVERFOREST_LIGHT, c.r.f63252d.b());
        map.put(ApiColorSchemes.EVERFOREST_DARK, c.q.f63250d.b());
        map.put(ApiColorSchemes.HACKER_BLUE, c.x.f63264d.b());
        map.put(ApiColorSchemes.HACKER_GREEN, c.y.f63266d.b());
        map.put(ApiColorSchemes.HACKER_RED, c.z.f63268d.b());
        map.put(ApiColorSchemes.KANAGAWA_DRAGON, c.c0.f63213d.b());
        map.put(ApiColorSchemes.KANAGAWA_LOTUS, c.d0.f63216d.b());
        map.put(ApiColorSchemes.KANAGAWA_WAVE, c.e0.f63219d.b());
        map.put(ApiColorSchemes.FLEXOKI_DARK, c.s.f63254d.b());
        map.put(ApiColorSchemes.FLEXOKI_LIGHT, c.t.f63256d.b());
        map2.put(CLIENT_COLOR_SCHEME_DEFAULT, str);
        for (String str2 : map.keySet()) {
            COLOR_SCHEME_CLIENT_KEY.put(COLOR_SCHEME_API_KEY.get(str2), str2);
        }
        COLOR_SCHEME_CLIENT_KEY.put(CLIENT_COLOR_SCHEME_DEFAULT, ApiColorSchemes.DEFAULT);
    }

    private static String capitalizeFistLetters(String str) {
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.toLowerCase(Locale.ENGLISH).split("\\s+");
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : strArrSplit) {
            if (str2.length() > 0) {
                sb2.append(Character.toUpperCase(str2.charAt(0)));
                sb2.append(str2.substring(1));
                sb2.append(" ");
            }
        }
        return sb2.toString().trim();
    }

    public static String convertFromApiColorScheme(String str) {
        if (str == null) {
            return null;
        }
        Map<String, String> map = COLOR_SCHEME_API_KEY;
        return map.containsKey(str) ? map.get(str) : capitalizeFistLetters(str);
    }

    public static String convertToClientColorScheme(String str) {
        if (str == null) {
            return getDefaultColorSchemeName();
        }
        Map<String, String> map = COLOR_SCHEME_API_KEY;
        return map.containsKey(str) ? map.get(str) : capitalizeFistLetters(str);
    }

    public static String deconvertToAPIColorScheme(String str) {
        Map<String, String> map = COLOR_SCHEME_CLIENT_KEY;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        if (str != null) {
            return str.toLowerCase(Locale.ENGLISH);
        }
        return null;
    }

    public static String getDefaultColorSchemeName() {
        return CLIENT_COLOR_SCHEME_DEFAULT;
    }
}
