package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qa0 implements fa7 {
    public final /* synthetic */ int a = 1;
    public Object b;

    public qa0(Boolean bool, ra0 ra0Var) {
        this.b = bool;
    }

    public void a(sa5 sa5Var) {
        Object obj = this.b;
        if (obj == null) {
            this.b = sa5Var;
            return;
        }
        if (obj instanceof uz6) {
            ((uz6) obj).a(sa5Var);
            return;
        }
        if (obj.equals(sa5Var)) {
            return;
        }
        uz6 uz6Var = ku8.a;
        uz6 uz6Var2 = new uz6(2);
        uz6Var2.k((sa5) obj);
        uz6Var2.k(sa5Var);
        this.b = uz6Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(sa5 r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.b
            boolean r1 = defpackage.lc5.Q(r0, r14)
            r2 = 0
            if (r1 == 0) goto Lc
            r13.b = r2
            return
        Lc:
            boolean r1 = r0 instanceof uz6
            if (r1 == 0) goto L68
            uz6 r0 = (uz6) r0
            r0.l(r14)
            int r14 = r0.d
            if (r14 == 0) goto L66
            r1 = 1
            if (r14 == r1) goto L1d
            goto L68
        L1d:
            java.lang.Object[] r14 = r0.b
            long[] r0 = r0.a
            int r1 = r0.length
            int r1 = r1 + (-2)
            if (r1 < 0) goto L60
            r2 = 0
            r3 = r2
        L28:
            r4 = r0[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L5b
            int r6 = r3 - r1
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = r2
        L42:
            if (r8 >= r6) goto L59
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.3E-322)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L55
            int r0 = r3 << 3
            int r0 = r0 + r8
            r14 = r14[r0]
            r13.b = r14
            return
        L55:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L42
        L59:
            if (r6 != r7) goto L60
        L5b:
            if (r3 == r1) goto L60
            int r3 = r3 + 1
            goto L28
        L60:
            java.lang.String r13 = "The ScatterSet is empty"
            so9.n(r13)
            return
        L66:
            r13.b = r2
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qa0.b(sa5):void");
    }

    @Override // defpackage.fa7
    public String h() {
        return xv5.r(new StringBuilder("attempted to overwrite the existing value '"), this.b, '\'');
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return xv5.r(new StringBuilder("ObservableProperty(value="), this.b, ')');
            default:
                return super.toString();
        }
    }

    public /* synthetic */ qa0() {
    }

    public qa0(Object obj) {
        this.b = obj;
    }
}
