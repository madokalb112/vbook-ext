package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class n63 implements oi5 {
    public static final n63 a = new n63();
    public static final o28 b = new o28("kotlin.time.Duration", m28.k);

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        long j = ((k63) obj).a;
        mc8 mc8Var = k63.b;
        StringBuilder sb = new StringBuilder();
        if (j < 0) {
            sb.append('-');
        }
        sb.append("PT");
        long jK = j < 0 ? k63.k(j) : j;
        long jI = k63.i(jK, o63.HOURS);
        boolean z = false;
        int i = k63.g(jK) ? 0 : (int) (k63.i(jK, o63.MINUTES) % 60);
        int i2 = k63.g(jK) ? 0 : (int) (k63.i(jK, o63.SECONDS) % 60);
        int iF = k63.f(jK);
        if (k63.g(j)) {
            jI = 9999999999999L;
        }
        boolean z2 = jI != 0;
        boolean z3 = (i2 == 0 && iF == 0) ? false : true;
        if (i != 0 || (z3 && z2)) {
            z = true;
        }
        if (z2) {
            sb.append(jI);
            sb.append('H');
        }
        if (z) {
            sb.append(i);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            k63.b(sb, i2, iF, 9, "S", true);
        }
        md2Var.Y(sb.toString());
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        mc8 mc8Var = k63.b;
        String strS = yd2Var.s();
        strS.getClass();
        try {
            long jS0 = lx1.s0(strS);
            if (k63.d(jS0, k63.e)) {
                throw new IllegalStateException("invariant failed");
            }
            return new k63(jS0);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(xv5.p("Invalid ISO duration string format: '", strS, "'."), e);
        }
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return b;
    }
}
