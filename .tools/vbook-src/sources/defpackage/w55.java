package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class w55 implements xta, xv1 {
    public Integer a;
    public Integer b;
    public v9 c;
    public Integer d;
    public Integer e;
    public Integer f;

    public w55(Integer num, Integer num2, v9 v9Var, Integer num3, Integer num4, Integer num5) {
        this.a = num;
        this.b = num2;
        this.c = v9Var;
        this.d = num3;
        this.e = num4;
        this.f = num5;
    }

    @Override // defpackage.xta
    public final v9 b() {
        return this.c;
    }

    public final Object c() {
        return new w55(this.a, this.b, this.c, this.d, this.e, this.f);
    }

    @Override // defpackage.xta
    public final void d(Integer num) {
        this.b = num;
    }

    @Override // defpackage.xta
    public final void e(Integer num) {
        this.f = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w55)) {
            return false;
        }
        w55 w55Var = (w55) obj;
        return lc5.Q(this.a, w55Var.a) && lc5.Q(this.b, w55Var.b) && this.c == w55Var.c && lc5.Q(this.d, w55Var.d) && lc5.Q(this.e, w55Var.e) && lc5.Q(this.f, w55Var.f);
    }

    public final z26 f() {
        int iIntValue;
        int iIntValue2;
        Integer num = this.a;
        Integer num2 = this.b;
        v9 v9Var = v9.a;
        Integer numValueOf = null;
        if (num != null) {
            iIntValue = num.intValue();
            if (num2 != null && ((iIntValue + 11) % 12) + 1 != (iIntValue2 = num2.intValue())) {
                gp.k(xv5.o("Inconsistent hour and hour-of-am-pm: hour is ", iIntValue, iIntValue2, ", but hour-of-am-pm is "));
                return null;
            }
            v9 v9Var2 = this.c;
            if (v9Var2 != null) {
                if ((v9Var2 == v9Var) != (iIntValue >= 12)) {
                    throw new IllegalArgumentException(("Inconsistent hour and the AM/PM marker: hour is " + iIntValue + ", but the AM/PM marker is " + v9Var2).toString());
                }
            }
        } else {
            if (num2 != null) {
                int iIntValue3 = num2.intValue();
                v9 v9Var3 = this.c;
                if (v9Var3 != null) {
                    if (iIntValue3 == 12) {
                        iIntValue3 = 0;
                    }
                    numValueOf = Integer.valueOf(iIntValue3 + (v9Var3 != v9Var ? 0 : 12));
                }
            }
            if (numValueOf == null) {
                throw new d72("Incomplete time: missing hour");
            }
            iIntValue = numValueOf.intValue();
        }
        Integer num3 = this.d;
        l4c.a(num3, "minute");
        int iIntValue4 = num3.intValue();
        Integer num4 = this.e;
        int iIntValue5 = num4 != null ? num4.intValue() : 0;
        Integer num5 = this.f;
        return new z26(iIntValue, iIntValue4, iIntValue5, num5 != null ? num5.intValue() : 0);
    }

    @Override // defpackage.xta
    public final Integer g() {
        return this.d;
    }

    @Override // defpackage.xta
    public final void h(Integer num) {
        this.d = num;
    }

    public final int hashCode() {
        Integer num = this.a;
        int iIntValue = (num != null ? num.intValue() : 0) * 31;
        Integer num2 = this.b;
        int iIntValue2 = ((num2 != null ? num2.intValue() : 0) * 31) + iIntValue;
        v9 v9Var = this.c;
        int iHashCode = ((v9Var != null ? v9Var.hashCode() : 0) * 31) + iIntValue2;
        Integer num3 = this.d;
        int iIntValue3 = ((num3 != null ? num3.intValue() : 0) * 31) + iHashCode;
        Integer num4 = this.e;
        int iIntValue4 = ((num4 != null ? num4.intValue() : 0) * 31) + iIntValue3;
        Integer num5 = this.f;
        return iIntValue4 + (num5 != null ? num5.intValue() : 0);
    }

    @Override // defpackage.xta
    public final Integer l() {
        return this.f;
    }

    @Override // defpackage.xta
    public final Integer m() {
        return this.b;
    }

    @Override // defpackage.xta
    public final void p(v9 v9Var) {
        this.c = v9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Integer r1 = r4.a
            java.lang.String r2 = "??"
            if (r1 != 0) goto Lc
            r1 = r2
        Lc:
            r0.append(r1)
            r1 = 58
            r0.append(r1)
            java.lang.Integer r3 = r4.d
            if (r3 != 0) goto L19
            r3 = r2
        L19:
            r0.append(r3)
            r0.append(r1)
            java.lang.Integer r1 = r4.e
            if (r1 != 0) goto L24
            goto L25
        L24:
            r2 = r1
        L25:
            r0.append(r2)
            r1 = 46
            r0.append(r1)
            java.lang.Integer r4 = r4.f
            if (r4 == 0) goto L45
            int r4 = r4.intValue()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r1 = r4.length()
            int r1 = 9 - r1
            java.lang.String r4 = defpackage.bw9.i0(r1, r4)
            if (r4 != 0) goto L47
        L45:
            java.lang.String r4 = "???"
        L47:
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w55.toString():java.lang.String");
    }

    @Override // defpackage.xta
    public final void u(Integer num) {
        this.a = num;
    }

    @Override // defpackage.xta
    public final Integer v() {
        return this.a;
    }

    @Override // defpackage.xta
    public final Integer w() {
        return this.e;
    }

    @Override // defpackage.xta
    public final void x(Integer num) {
        this.e = num;
    }

    public /* synthetic */ w55() {
        this(null, null, null, null, null, null);
    }
}
