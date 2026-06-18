package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class pn8 implements wn8 {
    public final long b;
    public final long c;
    public final oia d;
    public final f48 e;
    public final boolean f;

    public pn8() {
        long jX = wn9.x(8);
        long jX2 = wn9.x(1);
        oia oiaVar = new oia(wn9.x(2), wn9.x(2));
        this.b = jX;
        this.c = jX2;
        this.d = oiaVar;
        this.e = new f48(11);
        this.f = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0140  */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v9 */
    @Override // defpackage.wn8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(r43 r36, qha r37, long r38, defpackage.yn8 r40, float r41, float r42) {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pn8.b(r43, qha, long, yn8, float, float):void");
    }

    @Override // defpackage.wn8
    public final kb4 c() {
        return this.e;
    }

    @Override // defpackage.wn8
    public final boolean d() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pn8)) {
            return false;
        }
        pn8 pn8Var = (pn8) obj;
        return spa.a(this.b, pn8Var.b) && spa.a(this.c, pn8Var.c) && lc5.Q(this.d, pn8Var.d);
    }

    public final int hashCode() {
        tpa[] tpaVarArr = spa.b;
        return this.d.hashCode() + xv5.b(Long.hashCode(this.b) * 31, 31, this.c);
    }
}
