package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class j69 {
    public final i89 a;
    public final i89 b;

    public j69(i89 i89Var, i89 i89Var2) {
        i89Var.getClass();
        i89Var2.getClass();
        this.a = i89Var;
        this.b = i89Var2;
    }

    public final double a() {
        Double d = this.a.d();
        if (d != null) {
            double dDoubleValue = d.doubleValue();
            if (0.0d <= dDoubleValue && dDoubleValue <= 1.0d) {
                return dDoubleValue;
            }
        }
        Double d2 = this.b.d();
        if (d2 != null) {
            double dDoubleValue2 = d2.doubleValue();
            if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                return dDoubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (r6.a(r0) == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.kt1 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.i69
            if (r0 == 0) goto L13
            r0 = r7
            i69 r0 = (defpackage.i69) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            i69 r0 = new i69
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            xx1 r5 = defpackage.xx1.a
            if (r1 == 0) goto L37
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.e11.e0(r7)
            goto L54
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r6)
            return r2
        L31:
            j69 r6 = r0.a
            defpackage.e11.e0(r7)
            goto L47
        L37:
            defpackage.e11.e0(r7)
            r0.a = r6
            r0.d = r4
            i89 r7 = r6.a
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r5) goto L47
            goto L53
        L47:
            i89 r6 = r6.b
            r0.a = r2
            r0.d = r3
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r5) goto L54
        L53:
            return r5
        L54:
            heb r6 = defpackage.heb.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j69.b(kt1):java.lang.Object");
    }
}
