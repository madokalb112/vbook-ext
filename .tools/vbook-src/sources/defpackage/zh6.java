package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zh6 {
    public static final Map a;
    public static final Map b;

    static {
        xl7 xl7Var = new xl7(100, new js3("creator", "string", true));
        int i = 6;
        xl7 xl7Var2 = new xl7(Integer.valueOf(Token.ASSIGN_LOGICAL_OR), new js3("publisher", i));
        xl7 xl7Var3 = new xl7(Integer.valueOf(Token.ASSIGN_BITAND), new js3("description", i));
        xl7 xl7Var4 = new xl7(Integer.valueOf(Token.ASSIGN_LOGICAL_AND), new js3("isbn", i));
        xl7 xl7Var5 = new xl7(Integer.valueOf(Token.ASSIGN_LSH), new js3("subject", "string", true));
        xl7 xl7Var6 = new xl7(Integer.valueOf(Token.ASSIGN_RSH), new js3("date", i));
        xl7 xl7Var7 = new xl7(Integer.valueOf(Token.ASSIGN_ADD), new js3("contributor", "string", true));
        xl7 xl7Var8 = new xl7(Integer.valueOf(Token.ASSIGN_SUB), new js3("rights", i));
        xl7 xl7Var9 = new xl7(110, new js3("subjectCode", "string", true));
        xl7 xl7Var10 = new xl7(Integer.valueOf(Token.ASSIGN_MOD), new js3("source", "string", true));
        xl7 xl7Var11 = new xl7(Integer.valueOf(Token.ASSIGN_EXP), new js3("asin", i));
        xl7 xl7Var12 = new xl7(Integer.valueOf(Token.DOT), new js3("boundary", 4));
        xl7 xl7Var13 = new xl7(Integer.valueOf(Token.FUNCTION), new js3("fixedLayout", 6));
        xl7 xl7Var14 = new xl7(Integer.valueOf(Token.IF), new js3("numResources", 4));
        int i2 = 6;
        xl7 xl7Var15 = new xl7(Integer.valueOf(Token.ELSE), new js3("originalResolution", i2));
        xl7 xl7Var16 = new xl7(Integer.valueOf(Token.SWITCH), new js3("zeroGutter", i2));
        xl7 xl7Var17 = new xl7(Integer.valueOf(Token.CASE), new js3("zeroMargin", i2));
        xl7 xl7Var18 = new xl7(Integer.valueOf(Token.DEFAULT), new js3("coverURI", i2));
        xl7 xl7Var19 = new xl7(Integer.valueOf(Token.FOR), new js3("regionMagnification", i2));
        int i3 = 4;
        a = y86.P(xl7Var, xl7Var2, xl7Var3, xl7Var4, xl7Var5, xl7Var6, xl7Var7, xl7Var8, xl7Var9, xl7Var10, xl7Var11, xl7Var12, xl7Var13, xl7Var14, xl7Var15, xl7Var16, xl7Var17, xl7Var18, xl7Var19, new xl7(201, new js3("coverOffset", i3)), new xl7(202, new js3("thumbnailOffset", i3)), new xl7(204, new js3("creatorSoftware", i3)), new xl7(503, new js3("title", 6)), new xl7(524, new js3("language", "string", true)), new xl7(527, new js3("pageProgressionDirection", 6)));
        b = y86.P(new xl7(1, gc1.Z("ar", "ar-SA", "ar-IQ", "ar-EG", "ar-LY", "ar-DZ", "ar-MA", "ar-TN", "ar-OM", "ar-YE", "ar-SY", "ar-JO", "ar-LB", "ar-KW", "ar-AE", "ar-BH", "ar-QA")), new xl7(2, gc1.Y("bg")), new xl7(3, gc1.Y("ca")), new xl7(4, gc1.Z("zh", "zh-TW", "zh-CN", "zh-HK", "zh-SG")), new xl7(5, gc1.Y("cs")), new xl7(6, gc1.Y("da")), new xl7(7, gc1.Z("de", "de-DE", "de-CH", "de-AT", "de-LU", "de-LI")), new xl7(8, gc1.Y("el")), new xl7(9, gc1.Z("en", "en-US", "en-GB", "en-AU", "en-CA", "en-NZ", "en-IE", "en-ZA", "en-JM", null, "en-BZ", "en-TT", "en-ZW", "en-PH")), new xl7(10, gc1.Z("es", "es-ES", "es-MX", null, "es-GT", "es-CR", "es-PA", "es-DO", "es-VE", "es-CO", "es-PE", "es-AR", "es-EC", "es-CL", "es-UY", "es-PY", "es-BO", "es-SV", "es-HN", "es-NI", "es-PR")), new xl7(11, gc1.Y("fi")), new xl7(12, gc1.Z("fr", "fr-FR", "fr-BE", "fr-CA", "fr-CH", "fr-LU", "fr-MC")), new xl7(13, gc1.Y("he")), new xl7(14, gc1.Y("hu")), new xl7(15, gc1.Y("is")), new xl7(16, gc1.Z("it", "it-IT", "it-CH")), new xl7(17, gc1.Y("ja")), new xl7(18, gc1.Y("ko")), new xl7(19, gc1.Z("nl", "nl-NL", "nl-BE")), new xl7(20, gc1.Z("no", "nb", "nn")), new xl7(21, gc1.Y("pl")), new xl7(22, gc1.Z("pt", "pt-BR", "pt-PT")), new xl7(23, gc1.Y("rm")), new xl7(24, gc1.Y("ro")), new xl7(25, gc1.Y("ru")), new xl7(26, gc1.Z("hr", null, "sr")), new xl7(27, gc1.Y("sk")), new xl7(28, gc1.Y("sq")), new xl7(29, gc1.Z("sv", "sv-SE", "sv-FI")), new xl7(30, gc1.Y("th")), new xl7(31, gc1.Y("tr")), new xl7(32, gc1.Y("ur")), new xl7(33, gc1.Y("id")), new xl7(34, gc1.Y("uk")), new xl7(35, gc1.Y("be")), new xl7(36, gc1.Y("sl")), new xl7(37, gc1.Y("et")), new xl7(38, gc1.Y("lv")), new xl7(39, gc1.Y("lt")), new xl7(41, gc1.Y("fa")), new xl7(42, gc1.Y("vi")), new xl7(43, gc1.Y("hy")), new xl7(44, gc1.Y("az")), new xl7(45, gc1.Y("eu")), new xl7(46, gc1.Y("hsb")), new xl7(47, gc1.Y("mk")), new xl7(48, gc1.Y("st")), new xl7(49, gc1.Y("ts")), new xl7(50, gc1.Y("tn")), new xl7(52, gc1.Y("xh")), new xl7(53, gc1.Y("zu")), new xl7(54, gc1.Y("af")), new xl7(55, gc1.Y("ka")), new xl7(56, gc1.Y("fo")), new xl7(57, gc1.Y("hi")), new xl7(58, gc1.Y("mt")), new xl7(59, gc1.Y("se")), new xl7(62, gc1.Y("ms")), new xl7(63, gc1.Y("kk")), new xl7(65, gc1.Y("sw")), new xl7(67, gc1.Z("uz", null, "uz-UZ")), new xl7(68, gc1.Y("tt")), new xl7(69, gc1.Y("bn")), new xl7(70, gc1.Y("pa")), new xl7(71, gc1.Y("gu")), new xl7(72, gc1.Y("or")), new xl7(73, gc1.Y("ta")), new xl7(74, gc1.Y("te")), new xl7(75, gc1.Y("kn")), new xl7(76, gc1.Y("ml")), new xl7(77, gc1.Y("as")), new xl7(78, gc1.Y("mr")), new xl7(79, gc1.Y("sa")), new xl7(82, gc1.Z("cy", "cy-GB")), new xl7(83, gc1.Z("gl", "gl-ES")), new xl7(87, gc1.Y("kok")), new xl7(97, gc1.Y("ne")), new xl7(98, gc1.Y("fy")));
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0409 A[EDGE_INSN: B:234:0x0409->B:176:0x0409 BREAK  A[LOOP:14: B:171:0x03fb->B:175:0x0406], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00de A[PHI: r0
  0x00de: PHI (r0v9 sh6) = (r0v8 sh6), (r0v8 sh6), (r0v8 sh6), (r0v51 sh6) binds: [B:34:0x00b3, B:39:0x00c3, B:41:0x00c9, B:199:0x00de] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.rh6 a(defpackage.j85 r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zh6.a(j85):rh6");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11, types: [mc3] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.util.HashMap] */
    public static sh6 b(ts0 ts0Var) {
        String str;
        ?? map;
        em7 em7Var = new em7(ts0Var.f(0), ts0Var.f(8), ts0Var.f(10), ts0Var.f(12));
        String strE = ts0Var.e(16, 4);
        if (!strE.equals("MOBI")) {
            gp.j("Missing MOBI header");
            return null;
        }
        int iH = ts0Var.h(20);
        int iH2 = ts0Var.h(24);
        int iH3 = ts0Var.h(28);
        int iH4 = ts0Var.h(32);
        int iH5 = ts0Var.h(36);
        int iH6 = ts0Var.h(84);
        int iH7 = ts0Var.h(88);
        int iJ = ts0Var.j(94);
        int iJ2 = ts0Var.j(95);
        int iH8 = ts0Var.h(Token.ASSIGN_ADD);
        int iH9 = ts0Var.h(Token.ASSIGN_MOD);
        int iH10 = ts0Var.h(Token.COLON);
        int iH11 = ts0Var.h(Token.CASE);
        int iH12 = ts0Var.h(240);
        int iH13 = ts0Var.h(244);
        xg5 xg5Var = iH3 != 1252 ? iH3 != 65001 ? r31.b : r31.b : r31.o;
        xg5Var.getClass();
        String strA = xg5Var.a(ts0Var.b(iH6, iH7));
        List list = (List) b.get(Integer.valueOf(iJ2));
        if (list == null || (str = (String) fc1.A0(iJ >> 2, list)) == null) {
            str = list != null ? (String) fc1.x0(list) : null;
            if (str == null) {
                str = "";
            }
        }
        xh6 xh6Var = new xh6(strE, iH, iH2, iH3, iH4, iH5, iH6, iH7, iJ, iJ2, iH8, iH9, iH10, iH11, iH12, iH13, strA, str);
        if ((iH11 & 64) != 0) {
            byte[] bArr = ts0Var.a;
            ts0 ts0Var2 = new ts0(fw.Y(bArr, iH + 16, bArr.length), 0, false);
            if (!ts0Var2.e(0, 4).equals("EXTH")) {
                gp.j("Invalid EXTH header");
                return null;
            }
            int iH14 = ts0Var2.h(8);
            map = new HashMap();
            int i = 12;
            for (int i2 = 0; i2 < iH14; i2++) {
                int iH15 = ts0Var2.h(i);
                int iH16 = ts0Var2.h(i + 4);
                Integer numValueOf = Integer.valueOf(iH15);
                Map map2 = a;
                if (map2.containsKey(numValueOf)) {
                    Object obj = map2.get(Integer.valueOf(iH15));
                    obj.getClass();
                    js3 js3Var = (js3) obj;
                    String str2 = js3Var.a;
                    Object objValueOf = lc5.Q(js3Var.b, "uint") ? Integer.valueOf(ts0Var2.h(i + 8)) : ts0Var2.e(i + 8, iH16 - 8);
                    if (js3Var.c) {
                        if (!map.containsKey(str2)) {
                            map.put(str2, new ArrayList());
                        }
                        Object obj2 = map.get(str2);
                        obj2.getClass();
                        ((ArrayList) obj2).add((String) objValueOf);
                    } else {
                        map.put(str2, objValueOf);
                    }
                }
                i += iH16;
            }
        } else {
            map = mc3.a;
        }
        return new sh6(em7Var, xh6Var, map, xh6Var.f >= 8 ? new xh5(ts0Var.h(192), ts0Var.h(196), ts0Var.h(248), ts0Var.h(252), ts0Var.h(260)) : null);
    }
}
