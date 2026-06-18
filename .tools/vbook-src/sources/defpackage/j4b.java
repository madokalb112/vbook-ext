package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class j4b implements f4b {
    public final m62 a;
    public final e4b b;
    public final x5b c;
    public final m76 d;
    public final fr9 e;
    public final fr9 f;
    public final fr9 g;
    public final fr9 h;
    public final fr9 i;
    public final fr9 j;

    public j4b(m62 m62Var, e4b e4bVar, x5b x5bVar, m76 m76Var) {
        this.a = m62Var;
        this.b = e4bVar;
        this.c = x5bVar;
        this.d = m76Var;
        aj2 aj2Var = rw2.a;
        nh2 nh2Var = nh2.c;
        iw0 iw0VarB = wx1.b(nh2Var);
        this.e = gr9.a(Boolean.FALSE);
        this.f = gr9.a(null);
        this.g = gr9.a(null);
        this.h = gr9.a(null);
        this.i = gr9.a(null);
        this.j = gr9.a(null);
        ah1.J(iw0VarB, nh2Var, null, new dd9(this, (jt1) null, 18), 2);
    }

    public static String f(Map map, Map map2) {
        map.getClass();
        map2.getClass();
        if (Boolean.parseBoolean((String) map2.get("show_raw"))) {
            String str = (String) map.get("raw");
            if (str != null) {
                return str;
            }
        } else {
            String str2 = (String) map2.get("engine_id");
            if (str2 == null) {
                str2 = "raw";
            }
            String str3 = (String) map.get(str2);
            if (str3 == null) {
                str3 = "";
            }
            if (str3.length() != 0) {
                return str3;
            }
            String str4 = (String) map.get("raw");
            if (str4 != null) {
                return str4;
            }
        }
        return "";
    }

    public final u31 c() {
        return new u31(this.e, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable d(java.lang.String r5, defpackage.kt1 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.g4b
            if (r0 == 0) goto L13
            r0 = r6
            g4b r0 = (defpackage.g4b) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            g4b r0 = new g4b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.e11.e0(r6)
            goto L3c
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.e11.e0(r6)
            r0.c = r2
            m76 r4 = r4.d
            java.lang.Object r6 = r4.a(r5, r0)
            xx1 r4 = defpackage.xx1.a
            if (r6 != r4) goto L3c
            return r4
        L3c:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = defpackage.gc1.M(r6, r5)
            r4.<init>(r5)
            java.util.Iterator r5 = r6.iterator()
        L4d:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L5f
            java.lang.Object r6 = r5.next()
            zx4 r6 = (defpackage.zx4) r6
            java.lang.String r6 = r6.a
            r4.add(r6)
            goto L4d
        L5f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j4b.d(java.lang.String, kt1):java.io.Serializable");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String e(Map map, String str, String str2) {
        map.getClass();
        str.getClass();
        e4b e4bVar = this.b;
        g18 g18Var = e4bVar.a;
        km0 km0Var = e4bVar.b;
        ni5[] ni5VarArr = e4b.f;
        int i = 0;
        Object[] objArr = 0;
        if (((Boolean) km0Var.c(ni5VarArr[0], e4bVar)).booleanValue()) {
            m62 m62Var = this.a;
            b92 b92Var = m62Var.b;
            b92Var.getClass();
            Map map2 = (Map) new j82(b92Var, str, new b82(b92Var, 9), 0).e();
            Map map3 = mc3.a;
            if (map2 == null) {
                map2 = map3;
            }
            if (!map2.isEmpty()) {
                return f(map, map2);
            }
            b92 b92Var2 = m62Var.x;
            if (str2 == null) {
                str2 = "";
            }
            b92Var2.getClass();
            Map map4 = (Map) new cb2(b92Var2, str2, new bb2(b92Var2, i, objArr == true ? 1 : 0), 4).e();
            if (map4 != null) {
                map3 = map4;
            }
            if (!map3.isEmpty()) {
                return f(map, map3);
            }
            xl7 xl7Var = new xl7("engine_id", e4bVar.a());
            xl7 xl7Var2 = new xl7("show_raw", String.valueOf(((Boolean) e4bVar.d.c(ni5VarArr[2], e4bVar)).booleanValue()));
            String strA = e4bVar.a();
            strA.getClass();
            xl7 xl7Var3 = new xl7("to_language", g18Var.g("to_language_".concat(strA), ""));
            String strA2 = e4bVar.a();
            strA2.getClass();
            Map mapP = y86.P(xl7Var, xl7Var2, xl7Var3, new xl7("from_language", g18Var.g("from_language_".concat(strA2), "")));
            if (!mapP.isEmpty()) {
                return f(map, mapP);
            }
            String str3 = (String) map.get("raw");
            if (str3 != null) {
                return str3;
            }
        } else {
            String str4 = (String) map.get("raw");
            if (str4 != null) {
                return str4;
            }
        }
        return "";
    }

    public final String g(Map map, boolean z, Map map2, Map map3, Map map4) {
        map.getClass();
        map2.getClass();
        map4.getClass();
        if (!z) {
            String str = (String) map.get("raw");
            if (str != null) {
                return str;
            }
        } else {
            if (map2.containsKey("engine_id")) {
                return f(map, map2);
            }
            if (map3.containsKey("engine_id")) {
                return f(map, map3);
            }
            if (map4.containsKey("engine_id")) {
                return f(map, map4);
            }
            String str2 = (String) map.get("raw");
            if (str2 != null) {
                return str2;
            }
        }
        return "";
    }

    public final Integer h() {
        e4b e4bVar = this.b;
        return new Integer(((Number) e4bVar.c.c(e4b.f[1], e4bVar)).intValue());
    }

    public final q11 i() {
        return cx1.A0(c(), new xa((jt1) null, this, 28));
    }
}
