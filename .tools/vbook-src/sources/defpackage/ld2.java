package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ld2 extends ct7 {
    public final List b;
    public final jx1 c;
    public Object d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld2(Object obj, List list, Object obj2, jx1 jx1Var) {
        super(obj);
        obj.getClass();
        list.getClass();
        obj2.getClass();
        this.b = list;
        this.c = jx1Var;
        this.d = obj2;
    }

    @Override // defpackage.ct7
    public final Object a(Object obj, kt1 kt1Var) {
        this.e = 0;
        obj.getClass();
        this.d = obj;
        return c(kt1Var);
    }

    @Override // defpackage.ct7
    public final Object b() {
        return this.d;
    }

    @Override // defpackage.ct7
    public final Object c(jt1 jt1Var) {
        int i = this.e;
        if (i < 0) {
            return this.d;
        }
        if (i < this.b.size()) {
            return e(jt1Var);
        }
        this.e = -1;
        return this.d;
    }

    @Override // defpackage.ct7
    public final Object d(jt1 jt1Var, Object obj) {
        obj.getClass();
        this.d = obj;
        return c(jt1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.jt1 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.kd2
            if (r0 == 0) goto L13
            r0 = r6
            kd2 r0 = (defpackage.kd2) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            kd2 r0 = new kd2
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L29
            if (r1 != r2) goto L22
            goto L29
        L22:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r5)
            r5 = 0
            return r5
        L29:
            defpackage.e11.e0(r6)
        L2c:
            int r6 = r5.e
            r1 = -1
            if (r6 != r1) goto L32
            goto L3c
        L32:
            java.util.List r3 = r5.b
            int r4 = r3.size()
            if (r6 < r4) goto L3f
            r5.e = r1
        L3c:
            java.lang.Object r5 = r5.d
            return r5
        L3f:
            java.lang.Object r1 = r3.get(r6)
            zb4 r1 = (defpackage.zb4) r1
            int r6 = r6 + 1
            r5.e = r6
            java.lang.Object r6 = r5.d
            r0.c = r2
            java.lang.Object r6 = r1.c(r5, r6, r0)
            xx1 r1 = defpackage.xx1.a
            if (r6 != r1) goto L2c
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ld2.e(jt1):java.lang.Object");
    }

    @Override // defpackage.vx1
    public final jx1 q() {
        return this.c;
    }
}
