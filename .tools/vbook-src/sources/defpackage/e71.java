package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class e71 extends qtb {
    public String A;
    public int B;
    public boolean C;
    public boolean D;
    public final LinkedHashMap E;
    public final HashMap F;
    public final LinkedHashMap G;
    public long H;
    public yd5 I;
    public final String c;
    public final aib d;
    public final z51 e;
    public final qp3 f;
    public final fr9 s;
    public final pp1 t;
    public int u;
    public boolean v;
    public boolean w;
    public ihb x;
    public final fr9 y;
    public final fr9 z;

    public e71(String str, aib aibVar, z51 z51Var, qp3 qp3Var) {
        this.c = str;
        this.d = aibVar;
        this.e = z51Var;
        this.f = qp3Var;
        sc3 sc3Var = sc3.a;
        lc3 lc3Var = lc3.a;
        this.s = gr9.a(new t61(true, false, false, false, null, lc3Var, "", "", "", false, false, false, false, false, false, false, "", false, false, false, false, false, false, false, lc3Var, sc3Var, "", 0, null, lc3Var));
        this.t = new pp1();
        this.u = 1;
        jt1 jt1Var = null;
        this.y = gr9.a(null);
        this.z = gr9.a(lc3Var);
        this.A = "";
        this.B = 1;
        this.C = true;
        this.E = new LinkedHashMap();
        this.F = new HashMap();
        this.G = new LinkedHashMap();
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        nh2 nh2Var = nh2.c;
        g(za1VarA, nh2Var, new rf(this, jt1Var, 10));
        g(vtb.a(this), nh2Var, new z61(0, this, jt1Var));
        l();
    }

    public static final Object j(e71 e71Var, kt1 kt1Var) {
        e71Var.getClass();
        return ah1.b0(rw2.a, new ne0(e71Var, null, 3), kt1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(defpackage.e71 r6, defpackage.fv1 r7, defpackage.kt1 r8) {
        /*
            r6.getClass()
            boolean r0 = r8 instanceof defpackage.b71
            if (r0 == 0) goto L16
            r0 = r8
            b71 r0 = (defpackage.b71) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.e = r1
            goto L1b
        L16:
            b71 r0 = new b71
            r0.<init>(r6, r8)
        L1b:
            java.lang.Object r8 = r0.c
            int r1 = r0.e
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L35
            if (r1 != r3) goto L2f
            e71 r7 = r0.b
            fv1 r0 = r0.a
            defpackage.e11.e0(r8)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r7 = r0
            goto L55
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r6)
            return r2
        L35:
            defpackage.e11.e0(r8)
            long r4 = r7.a
            z51 r8 = r6.e     // Catch: java.lang.Throwable -> L55
            r0.a = r7     // Catch: java.lang.Throwable -> L55
            r0.b = r6     // Catch: java.lang.Throwable -> L55
            r0.e = r3     // Catch: java.lang.Throwable -> L55
            p61 r8 = (defpackage.p61) r8     // Catch: java.lang.Throwable -> L55
            java.lang.Object r8 = r8.f(r4, r0)     // Catch: java.lang.Throwable -> L55
            xx1 r0 = defpackage.xx1.a
            if (r8 != r0) goto L4d
            return r0
        L4d:
            r0 = r7
            r7 = r6
        L4f:
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Throwable -> L2d
            r7.o(r8)     // Catch: java.lang.Throwable -> L2d
            goto L56
        L55:
            r0 = r7
        L56:
            za1 r7 = vtb.a(r6)
            aj2 r8 = defpackage.rw2.a
            nh2 r8 = defpackage.nh2.c
            y r1 = new y
            r3 = 19
            r1.<init>(r6, r2, r3)
            r6.g(r7, r8, r1)
            r6.n(r0)
            heb r6 = defpackage.heb.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e71.k(e71, fv1, kt1):java.lang.Object");
    }

    public final void l() {
        fr9 fr9Var;
        Object value;
        t61 t61VarA;
        this.u = 1;
        this.F.clear();
        fv1 fv1Var = (fv1) this.y.getValue();
        if (fv1Var != null && (fr9Var = this.s) != null) {
            do {
                value = fr9Var.getValue();
                t61VarA = t61.a((t61) value, true, false, false, false, null, null, null, null, null, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, null, null, "", 0, null, lc3.a, 130019312);
            } while (!fr9Var.j(value, p(t61VarA, fv1Var, (List) this.z.getValue(), this.x, t61VarA.D)));
        }
        int i = this.u;
        yd5 yd5Var = this.I;
        if (yd5Var != null) {
            yd5Var.cancel(null);
        }
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        this.I = g(za1VarA, nh2.c, new a71(i, this, null));
    }

    public final void m(String str) {
        Object value;
        str.getClass();
        this.A = bw9.B0(str).toString();
        int i = 1;
        this.B = 1;
        this.C = true;
        this.E.clear();
        fr9 fr9Var = this.s;
        if (fr9Var != null) {
            do {
                value = fr9Var.getValue();
            } while (!fr9Var.j(value, t61.a((t61) value, false, false, false, false, null, null, null, null, null, false, false, false, false, false, false, false, null, false, false, false, false, false, true, false, lc3.a, null, null, 0, null, null, 2088763391)));
        }
        if (this.D || !this.C) {
            return;
        }
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        g(za1VarA, nh2.c, new z61(i, this, null));
    }

    public final void n(fv1 fv1Var) {
        Iterable iterable = (Iterable) this.z.getValue();
        ArrayList arrayList = new ArrayList(gc1.M(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((kv1) it.next()).a.a);
        }
        Set setE1 = fc1.e1(arrayList);
        Set setEntrySet = this.E.entrySet();
        setEntrySet.getClass();
        Iterator it2 = setEntrySet.iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            entry.getClass();
            Object key = entry.getKey();
            key.getClass();
            if (setE1.contains((String) key)) {
                it2.remove();
            }
        }
        this.y.k(fv1Var);
    }

    public final void o(List list) {
        ArrayList arrayList = new ArrayList(gc1.M(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((kv1) it.next()).a.a);
        }
        Set setE1 = fc1.e1(arrayList);
        Set setEntrySet = this.E.entrySet();
        setEntrySet.getClass();
        Iterator it2 = setEntrySet.iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            entry.getClass();
            Object key = entry.getKey();
            key.getClass();
            if (setE1.contains((String) key)) {
                it2.remove();
            }
        }
        fr9 fr9Var = this.z;
        fr9Var.getClass();
        fr9Var.l(null, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.t61 p(defpackage.t61 r34, defpackage.fv1 r35, java.util.List r36, defpackage.ihb r37, java.util.List r38) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e71.p(t61, fv1, java.util.List, ihb, java.util.List):t61");
    }
}
