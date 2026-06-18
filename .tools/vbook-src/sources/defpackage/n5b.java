package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class n5b extends qtb {
    public final fr9 A;
    public final fr9 B;
    public final fr9 C;
    public final fr9 D;
    public final fr9 E;
    public boolean F;
    public boolean G;
    public final f4b c;
    public v5b s;
    public List v;
    public List w;
    public final fr9 x;
    public final fr9 y;
    public final fr9 z;
    public final fr9 d = gr9.a(new u4b(false, false, false, true, "", null, null, null));
    public final t07 e = u07.a();
    public final fr9 f = gr9.a(null);
    public String t = "";
    public String u = "";

    public n5b(f4b f4bVar) {
        this.c = f4bVar;
        jt1 jt1Var = null;
        lc3 lc3Var = lc3.a;
        this.v = lc3Var;
        this.w = lc3Var;
        this.x = gr9.a(null);
        Boolean bool = Boolean.FALSE;
        this.y = gr9.a(bool);
        this.z = gr9.a(null);
        this.A = gr9.a(null);
        this.B = gr9.a(null);
        this.C = gr9.a(null);
        this.D = gr9.a(null);
        this.E = gr9.a(bool);
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        nh2 nh2Var = nh2.c;
        g(za1VarA, nh2Var, new b5b(this, jt1Var, 2));
        g(vtb.a(this), nh2Var, new b5b(this, jt1Var, 3));
        g(vtb.a(this), nh2Var, new b5b(this, jt1Var, 0));
        g(vtb.a(this), nh2Var, new b5b(this, jt1Var, 1));
        g(vtb.a(this), nh2Var, new b5b(this, jt1Var, 4));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(defpackage.n5b r4, defpackage.kt1 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.i5b
            if (r0 == 0) goto L13
            r0 = r5
            i5b r0 = (defpackage.i5b) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            i5b r0 = new i5b
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.b
            int r1 = r0.d
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            n5b r4 = r0.a
            defpackage.e11.e0(r5)
            goto L48
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.e11.e0(r5)
            java.lang.String r5 = r4.u
            int r5 = r5.length()
            if (r5 <= 0) goto L4c
            java.lang.String r5 = r4.u
            r0.a = r4
            r0.d = r2
            java.lang.Object r5 = r4.t(r5, r0)
            xx1 r0 = defpackage.xx1.a
            if (r5 != r0) goto L48
            return r0
        L48:
            v5b r5 = (defpackage.v5b) r5
            r4.s = r5
        L4c:
            heb r4 = defpackage.heb.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n5b.j(n5b, kt1):java.lang.Object");
    }

    public static xl7 w(Map map) {
        StringBuilder sb = new StringBuilder();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = bw9.p0(str2, new String[]{"\n"}).iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append('\n');
                arrayList.add(Integer.valueOf(i));
                i++;
            }
            linkedHashMap.put(str, arrayList);
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1).getClass();
        }
        return new xl7(sb.toString(), linkedHashMap);
    }

    public static LinkedHashMap x(String str, Map map) {
        List listP0 = bw9.p0(str, new String[]{"\n"});
        LinkedHashMap linkedHashMap = new LinkedHashMap(y86.O(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            StringBuilder sb = new StringBuilder();
            Iterator it = ((Iterable) entry.getValue()).iterator();
            while (it.hasNext()) {
                String str2 = (String) fc1.A0(((Number) it.next()).intValue(), listP0);
                if (str2 != null) {
                    sb.append(str2);
                    sb.append('\n');
                }
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1).getClass();
            }
            linkedHashMap.put(key, sb.toString());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(defpackage.f86 r10, defpackage.kt1 r11) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n5b.A(f86, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B(java.lang.String r11, boolean r12, defpackage.kt1 r13) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n5b.B(java.lang.String, boolean, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C(java.util.Map r12, defpackage.kt1 r13) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n5b.C(java.util.Map, kt1):java.lang.Object");
    }

    public void d() {
        o();
    }

    public void k() {
        this.G = true;
        if (this.F) {
            this.F = false;
            y();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0089, code lost:
    
        if (r13 == r8) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.ib4 r12, defpackage.kt1 r13) {
        /*
            Method dump skipped, instruction units count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n5b.l(ib4, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(defpackage.kt1 r13) {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n5b.m(kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(defpackage.jt1 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.x4b
            if (r0 == 0) goto L13
            r0 = r7
            x4b r0 = (defpackage.x4b) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            x4b r0 = new x4b
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            int r1 = r0.c
            heb r2 = defpackage.heb.a
            r3 = 2
            r4 = 1
            xx1 r5 = defpackage.xx1.a
            if (r1 == 0) goto L37
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2c
            defpackage.e11.e0(r7)
            return r2
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r6)
            r6 = 0
            return r6
        L33:
            defpackage.e11.e0(r7)
            goto L4b
        L37:
            defpackage.e11.e0(r7)
            f4b r7 = r6.c
            j4b r7 = (defpackage.j4b) r7
            u31 r7 = r7.c()
            r0.c = r4
            java.lang.Object r7 = defpackage.cx1.N(r7, r0)
            if (r7 != r5) goto L4b
            goto L5c
        L4b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L54
            goto L5d
        L54:
            r0.c = r3
            java.lang.Object r6 = r6.q(r0)
            if (r6 != r5) goto L5d
        L5c:
            return r5
        L5d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n5b.n(jt1):java.lang.Object");
    }

    public final void o() {
        if (this.u.length() > 0) {
            String str = this.u;
            String str2 = this.t;
            j4b j4bVar = (j4b) this.c;
            j4bVar.getClass();
            str.getClass();
            str2.getClass();
            j4bVar.c.a(str, str2);
        }
        this.s = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.String r9, defpackage.kt1 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.y4b
            if (r0 == 0) goto L14
            r0 = r10
            y4b r0 = (defpackage.y4b) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.e = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            y4b r0 = new y4b
            r0.<init>(r8, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.c
            int r0 = r6.e
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            xx1 r7 = defpackage.xx1.a
            if (r0 == 0) goto L49
            if (r0 == r3) goto L41
            if (r0 == r2) goto L3a
            if (r0 != r1) goto L34
            n5b r8 = r6.b
            v5b r8 = (defpackage.v5b) r8
            defpackage.e11.e0(r10)
            return r10
        L34:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r8)
            return r4
        L3a:
            java.lang.String r9 = r6.a
            defpackage.e11.e0(r10)
            r2 = r9
            goto L6b
        L41:
            n5b r9 = r6.b
            java.lang.String r0 = r6.a
            defpackage.e11.e0(r10)
            goto L5b
        L49:
            defpackage.e11.e0(r10)
            r6.a = r9
            r6.b = r8
            r6.e = r3
            java.lang.Object r10 = r8.q(r6)
            if (r10 != r7) goto L59
            goto La4
        L59:
            r0 = r9
            r9 = r8
        L5b:
            java.lang.String r10 = (java.lang.String) r10
            r6.a = r0
            r6.b = r4
            r6.e = r2
            java.lang.Object r10 = r9.t(r10, r6)
            if (r10 != r7) goto L6a
            goto La4
        L6a:
            r2 = r0
        L6b:
            v5b r10 = (defpackage.v5b) r10
            if (r10 != 0) goto L70
            return r4
        L70:
            fr9 r9 = r8.B
            java.lang.Object r9 = r9.getValue()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r0 = ""
            if (r9 != 0) goto L7e
            r3 = r0
            goto L7f
        L7e:
            r3 = r9
        L7f:
            fr9 r8 = r8.C
            java.lang.Object r8 = r8.getValue()
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L8a
            goto L8b
        L8a:
            r0 = r8
        L8b:
            java.lang.String r8 = "convertSimplified"
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            java.util.Map r5 = java.util.Collections.singletonMap(r8, r9)
            r5.getClass()
            r6.a = r4
            r6.b = r4
            r6.e = r1
            r1 = r10
            r4 = r0
            java.lang.Object r8 = r1.a(r2, r3, r4, r5, r6)
            if (r8 != r7) goto La5
        La4:
            return r7
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n5b.p(java.lang.String, kt1):java.lang.Object");
    }

    public final Object q(jt1 jt1Var) {
        return cx1.N(new u31(this.z, 2), jt1Var);
    }

    public final Object r(jt1 jt1Var) {
        return !v() ? "raw" : q(jt1Var);
    }

    public final fr9 s() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(java.lang.String r5, defpackage.kt1 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.z4b
            if (r0 == 0) goto L13
            r0 = r6
            z4b r0 = (defpackage.z4b) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            z4b r0 = new z4b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.c
            int r1 = r0.e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2c
            t07 r5 = r0.b
            java.lang.String r0 = r0.a
            defpackage.e11.e0(r6)
            r6 = r5
            r5 = r0
            goto L46
        L2c:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            return r3
        L32:
            defpackage.e11.e0(r6)
            r0.a = r5
            t07 r6 = r4.e
            r0.b = r6
            r0.e = r2
            java.lang.Object r0 = r6.p(r0)
            xx1 r1 = defpackage.xx1.a
            if (r0 != r1) goto L46
            return r1
        L46:
            v5b r0 = r4.s     // Catch: java.lang.Throwable -> L62
            if (r0 != 0) goto L64
            f4b r0 = r4.c     // Catch: java.lang.Throwable -> L62
            java.lang.String r1 = r4.t     // Catch: java.lang.Throwable -> L62
            j4b r0 = (defpackage.j4b) r0     // Catch: java.lang.Throwable -> L62
            r0.getClass()     // Catch: java.lang.Throwable -> L62
            r5.getClass()     // Catch: java.lang.Throwable -> L62
            r1.getClass()     // Catch: java.lang.Throwable -> L62
            x5b r0 = r0.c     // Catch: java.lang.Throwable -> L62
            v5b r0 = r0.d(r5, r1)     // Catch: java.lang.Throwable -> L62
            r4.s = r0     // Catch: java.lang.Throwable -> L62
            goto L64
        L62:
            r4 = move-exception
            goto L68
        L64:
            r6.q(r3)
            return r0
        L68:
            r6.q(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n5b.t(java.lang.String, kt1):java.lang.Object");
    }

    public final boolean u() {
        return lc5.Q(this.z.getValue(), "qt");
    }

    public final boolean v() {
        CharSequence charSequence = (CharSequence) this.z.getValue();
        if (charSequence != null && charSequence.length() != 0) {
            Boolean bool = (Boolean) this.A.getValue();
            if (!(bool != null ? bool.booleanValue() : false)) {
                Boolean bool2 = (Boolean) this.f.getValue();
                if (bool2 != null ? bool2.booleanValue() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(defpackage.f86 r12, defpackage.kt1 r13) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n5b.z(f86, kt1):java.lang.Object");
    }

    public void y() {
    }
}
