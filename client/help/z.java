package com.server.auditor.ssh.client.help;

import com.crystalnix.termius.libtermius.wrappers.LibTermiusSshClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f27139a = new a(null);

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final String a(String str) {
            ju.t.f(str, "keyType");
            int iHashCode = str.hashCode();
            switch (iHashCode) {
                case -2099925287:
                    return !str.equals("Insert") ? "" : "ins";
                case -1874112793:
                    return !str.equals("Paste_password") ? "" : "password";
                case -1400017779:
                    return !str.equals("Back Space") ? "" : "backspace";
                case -1398911284:
                    return !str.equals("Shift+Tab") ? "" : "shift+tab";
                case 33:
                    return !str.equals("!") ? "" : "!";
                case 34:
                    return !str.equals("\"") ? "" : "\"";
                case 35:
                    return !str.equals("#") ? "" : "#";
                case 36:
                    return !str.equals("$") ? "" : "$";
                case 37:
                    return !str.equals("%") ? "" : "%";
                case 38:
                    return !str.equals("&") ? "" : "&";
                case 39:
                    return !str.equals("'") ? "" : "'";
                case 40:
                    return !str.equals("(") ? "" : "(";
                case 41:
                    return !str.equals(")") ? "" : ")";
                case 42:
                    return !str.equals("*") ? "" : "*";
                case 43:
                    return !str.equals("+") ? "" : "+";
                case 2082:
                    return !str.equals("AC") ? "" : "autocomplete";
                case 2088:
                    return !str.equals("AI") ? "" : "ai";
                case 2747:
                    return !str.equals("Up") ? "" : "arrowup";
                case 2990:
                    return !str.equals("^L") ? "" : "^l";
                case 2992:
                    return !str.equals("^N") ? "" : "^n";
                case 3004:
                    return !str.equals("^Z") ? "" : "^z";
                case 3009:
                    return !str.equals("^_") ? "" : "^_";
                case 65929:
                    return !str.equals("Alt") ? "" : "alt";
                case 68837:
                    return !str.equals("F10") ? "" : "f10";
                case 68838:
                    return !str.equals("F11") ? "" : "f11";
                case 68839:
                    return !str.equals("F12") ? "" : "f12";
                case 68840:
                    return !str.equals("F13") ? "" : "f13";
                case 68841:
                    return !str.equals("F14") ? "" : "f14";
                case 68842:
                    return !str.equals("F15") ? "" : "f15";
                case 68843:
                    return !str.equals("F16") ? "" : "f16";
                case 68844:
                    return !str.equals("F17") ? "" : "f17";
                case 68845:
                    return !str.equals("F18") ? "" : "f18";
                case 68846:
                    return !str.equals("F19") ? "" : "f19";
                case 68868:
                    return !str.equals("F20") ? "" : "f20";
                case 68869:
                    return !str.equals("F21") ? "" : "f21";
                case 68870:
                    return !str.equals("F22") ? "" : "f22";
                case 68871:
                    return !str.equals("F23") ? "" : "f23";
                case 68872:
                    return !str.equals("F24") ? "" : "f24";
                case 69819:
                    return !str.equals("End") ? "" : "end";
                case 69973:
                    return !str.equals("Esc") ? "" : "esc";
                case 83829:
                    return !str.equals("Tab") ? "" : "tab";
                case 93150:
                    return !str.equals("^XX") ? "" : "^x^x";
                case 2111115:
                    return !str.equals("Ctrl") ? "" : "ctrl";
                case 2136258:
                    return !str.equals("Down") ? "" : "arrowdown";
                case 2249058:
                    return !str.equals("Hide") ? "" : "hide";
                case 2255103:
                    return !str.equals("Home") ? "" : "home";
                case 2364455:
                    return !str.equals("Left") ? "" : "arrowleft";
                case 2542607:
                    return !str.equals(LibTermiusSshClient.SFTP_TAG) ? "" : "sftp";
                case 67114680:
                    return !str.equals("Enter") ? "" : "return";
                case 76983123:
                    return !str.equals("Pg Dn") ? "" : "pgdn";
                case 76983652:
                    return !str.equals("Pg Up") ? "" : "pgup";
                case 78959100:
                    return !str.equals("Right") ? "" : "arrowright";
                case 578459414:
                    return !str.equals("Snippets") ? "" : "snippets";
                case 1969682858:
                    return !str.equals("Arrows") ? "" : "arrowsjoystick";
                case 2043376075:
                    return !str.equals("Delete") ? "" : "del";
                default:
                    switch (iHashCode) {
                        case 45:
                            return !str.equals("-") ? "" : "-";
                        case 46:
                            return !str.equals(".") ? "" : ".";
                        case 47:
                            return !str.equals("/") ? "" : "/";
                        default:
                            switch (iHashCode) {
                                case 58:
                                    return !str.equals(":") ? "" : ":";
                                case 59:
                                    return !str.equals(";") ? "" : ";";
                                case 60:
                                    return !str.equals("<") ? "" : "<";
                                case 61:
                                    return !str.equals("=") ? "" : "=";
                                case 62:
                                    return !str.equals(">") ? "" : ">";
                                case 63:
                                    return !str.equals("?") ? "" : "?";
                                case 64:
                                    return !str.equals("@") ? "" : "@";
                                default:
                                    switch (iHashCode) {
                                        case 91:
                                            return !str.equals("[") ? "" : "[";
                                        case 92:
                                            return !str.equals("\\") ? "" : "\\";
                                        case 93:
                                            return !str.equals("]") ? "" : "]";
                                        case 94:
                                            return !str.equals("^") ? "" : "^";
                                        case 95:
                                            return !str.equals("_") ? "" : "_";
                                        case 96:
                                            return !str.equals("`") ? "" : "`";
                                        default:
                                            switch (iHashCode) {
                                                case 123:
                                                    return !str.equals("{") ? "" : "{";
                                                case 124:
                                                    return !str.equals("|") ? "" : "|";
                                                case 125:
                                                    return !str.equals("}") ? "" : "}";
                                                case 126:
                                                    return !str.equals("~") ? "" : "~";
                                                default:
                                                    switch (iHashCode) {
                                                        case 2219:
                                                            return !str.equals("F1") ? "" : "f1";
                                                        case 2220:
                                                            return !str.equals("F2") ? "" : "f2";
                                                        case 2221:
                                                            return !str.equals("F3") ? "" : "f3";
                                                        case 2222:
                                                            return !str.equals("F4") ? "" : "f4";
                                                        case 2223:
                                                            return !str.equals("F5") ? "" : "f5";
                                                        case 2224:
                                                            return !str.equals("F6") ? "" : "f6";
                                                        case 2225:
                                                            return !str.equals("F7") ? "" : "f7";
                                                        case 2226:
                                                            return !str.equals("F8") ? "" : "f8";
                                                        case 2227:
                                                            return !str.equals("F9") ? "" : "f9";
                                                        default:
                                                            switch (iHashCode) {
                                                                case 2979:
                                                                    return !str.equals("^A") ? "" : "^a";
                                                                case 2980:
                                                                    return !str.equals("^B") ? "" : "^b";
                                                                case 2981:
                                                                    return !str.equals("^C") ? "" : "^c";
                                                                case 2982:
                                                                    return !str.equals("^D") ? "" : "^d";
                                                                default:
                                                                    switch (iHashCode) {
                                                                        case 2984:
                                                                            return !str.equals("^F") ? "" : "^f";
                                                                        case 2985:
                                                                            return !str.equals("^G") ? "" : "^g";
                                                                        case 2986:
                                                                            return !str.equals("^H") ? "" : "^h";
                                                                        default:
                                                                            switch (iHashCode) {
                                                                                case 2994:
                                                                                    return !str.equals("^P") ? "" : "^p";
                                                                                case 2995:
                                                                                    return !str.equals("^Q") ? "" : "^q";
                                                                                case 2996:
                                                                                    return !str.equals("^R") ? "" : "^r";
                                                                                case 2997:
                                                                                    return !str.equals("^S") ? "" : "^s";
                                                                                default:
                                                                                    switch (iHashCode) {
                                                                                        case 2999:
                                                                                            return !str.equals("^U") ? "" : "^u";
                                                                                        case 3000:
                                                                                            return !str.equals("^V") ? "" : "paste";
                                                                                        case 3001:
                                                                                            return !str.equals("^W") ? "" : "^w";
                                                                                        case 3002:
                                                                                            return !str.equals("^X") ? "" : "^x";
                                                                                        default:
                                                                                            return "";
                                                                                    }
                                                                            }
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
            }
        }

        public final List b(List list) {
            ju.t.f(list, "shortcuts");
            ArrayList<String> arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String[] strArrA = ((com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.b) it.next()).a();
                ju.t.e(strArrA, "getData(...)");
                vt.v.E(arrayList, vt.n.Y(strArrA));
            }
            ArrayList arrayList2 = new ArrayList(vt.v.z(arrayList, 10));
            for (String str : arrayList) {
                a aVar = z.f27139a;
                ju.t.c(str);
                arrayList2.add(aVar.a(str));
            }
            return arrayList2;
        }

        private a() {
        }
    }
}
