package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class m11 extends k11 {
    public final b24 d;

    public m11(b24 b24Var, jx1 jx1Var, int i, ar0 ar0Var) {
        super(jx1Var, i, ar0Var);
        this.d = b24Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    @Override // defpackage.k11, defpackage.b24
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.c24 r7, defpackage.jt1 r8) {
        /*
            r6 = this;
            int r0 = r6.b
            r1 = -3
            xx1 r2 = defpackage.xx1.a
            if (r0 != r1) goto L6d
            jx1 r0 = r8.getContext()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            kx1 r3 = new kx1
            r4 = 0
            r3.<init>(r4, r4)
            jx1 r5 = r6.a
            java.lang.Object r1 = r5.fold(r1, r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L26
            jx1 r1 = r0.plus(r5)
            goto L2a
        L26:
            jx1 r1 = defpackage.lx1.f0(r0, r5, r4)
        L2a:
            boolean r3 = defpackage.lc5.Q(r1, r0)
            if (r3 == 0) goto L37
            java.lang.Object r6 = r6.j(r7, r8)
            if (r6 != r2) goto L74
            return r6
        L37:
            g83 r3 = g83.d
            hx1 r4 = r1.get(r3)
            hx1 r0 = r0.get(r3)
            boolean r0 = defpackage.lc5.Q(r4, r0)
            if (r0 == 0) goto L6d
            jx1 r0 = r8.getContext()
            boolean r3 = r7 instanceof defpackage.z29
            if (r3 != 0) goto L5a
            boolean r3 = r7 instanceof defpackage.s77
            if (r3 == 0) goto L54
            goto L5a
        L54:
            zn r3 = new zn
            r3.<init>(r7, r0)
            r7 = r3
        L5a:
            w r0 = new w
            r3 = 0
            r4 = 21
            r0.<init>(r6, r3, r4)
            java.lang.Object r6 = defpackage.gsa.b(r1)
            java.lang.Object r6 = defpackage.h67.H0(r1, r7, r6, r0, r8)
            if (r6 != r2) goto L74
            return r6
        L6d:
            java.lang.Object r6 = super.a(r7, r8)
            if (r6 != r2) goto L74
            return r6
        L74:
            heb r6 = defpackage.heb.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m11.a(c24, jt1):java.lang.Object");
    }

    @Override // defpackage.k11
    public final Object e(o38 o38Var, jt1 jt1Var) {
        Object objJ = j(new z29(o38Var), jt1Var);
        return objJ == xx1.a ? objJ : heb.a;
    }

    public abstract Object j(c24 c24Var, jt1 jt1Var);

    @Override // defpackage.k11
    public final String toString() {
        return this.d + " -> " + super.toString();
    }
}
