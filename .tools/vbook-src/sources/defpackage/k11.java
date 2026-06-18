package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class k11 implements mc4 {
    public final jx1 a;
    public final int b;
    public final ar0 c;

    public k11(jx1 jx1Var, int i, ar0 ar0Var) {
        this.a = jx1Var;
        this.b = i;
        this.c = ar0Var;
    }

    @Override // defpackage.b24
    public Object a(c24 c24Var, jt1 jt1Var) {
        Object objA0 = wx1.a0(new y(c24Var, this, null, 16), jt1Var);
        return objA0 == xx1.a ? objA0 : heb.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    @Override // defpackage.mc4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.b24 c(defpackage.jx1 r5, int r6, defpackage.ar0 r7) {
        /*
            r4 = this;
            jx1 r0 = r4.a
            jx1 r5 = r5.plus(r0)
            ar0 r1 = defpackage.ar0.a
            ar0 r2 = r4.c
            int r3 = r4.b
            if (r7 == r1) goto Lf
            goto L26
        Lf:
            r7 = -3
            if (r3 != r7) goto L13
            goto L25
        L13:
            if (r6 != r7) goto L17
        L15:
            r6 = r3
            goto L25
        L17:
            r7 = -2
            if (r3 != r7) goto L1b
            goto L25
        L1b:
            if (r6 != r7) goto L1e
            goto L15
        L1e:
            int r6 = r6 + r3
            if (r6 < 0) goto L22
            goto L25
        L22:
            r6 = 2147483647(0x7fffffff, float:NaN)
        L25:
            r7 = r2
        L26:
            boolean r0 = defpackage.lc5.Q(r5, r0)
            if (r0 == 0) goto L31
            if (r6 != r3) goto L31
            if (r7 != r2) goto L31
            return r4
        L31:
            k11 r4 = r4.g(r5, r6, r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k11.c(jx1, int, ar0):b24");
    }

    public String d() {
        return null;
    }

    public abstract Object e(o38 o38Var, jt1 jt1Var);

    public abstract k11 g(jx1 jx1Var, int i, ar0 ar0Var);

    public b24 h() {
        return null;
    }

    public h11 i(vx1 vx1Var) {
        int i = this.b;
        if (i == -3) {
            i = -2;
        }
        yb4 wVar = new w(this, null, 20);
        o38 o38Var = new o38(lx1.q0(vx1Var, this.a), vm7.c(i, 4, this.c));
        o38Var.r0(zx1.c, o38Var, wVar);
        return o38Var;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strD = d();
        if (strD != null) {
            arrayList.add(strD);
        }
        hc3 hc3Var = hc3.a;
        jx1 jx1Var = this.a;
        if (jx1Var != hc3Var) {
            arrayList.add("context=" + jx1Var);
        }
        int i = this.b;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        ar0 ar0Var = ar0.a;
        ar0 ar0Var2 = this.c;
        if (ar0Var2 != ar0Var) {
            arrayList.add("onBufferOverflow=" + ar0Var2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return xv5.s(sb, fc1.D0(arrayList, ", ", null, null, null, 62), ']');
    }
}
