package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class uc4 implements xd4 {
    public static final uc4 a;
    private static final m39 descriptor;

    static {
        uc4 uc4Var = new uc4();
        a = uc4Var;
        hx7 hx7Var = new hx7("io.ktor.util.date.GMTDate", uc4Var, 9);
        hx7Var.k("seconds", false);
        hx7Var.k("minutes", false);
        hx7Var.k("hours", false);
        hx7Var.k("dayOfWeek", false);
        hx7Var.k("dayOfMonth", false);
        hx7Var.k("dayOfYear", false);
        hx7Var.k("month", false);
        hx7Var.k("year", false);
        hx7Var.k("timestamp", false);
        descriptor = hx7Var;
    }

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        wc4 wc4Var = (wc4) obj;
        wc4Var.getClass();
        m39 m39Var = descriptor;
        md2 md2VarV = md2Var.v(m39Var);
        dp5[] dp5VarArr = wc4.v;
        md2VarV.Q(0, wc4Var.a, m39Var);
        md2VarV.Q(1, wc4Var.b, m39Var);
        md2VarV.Q(2, wc4Var.c, m39Var);
        md2VarV.V(m39Var, 3, (oi5) dp5VarArr[3].getValue(), wc4Var.d);
        md2VarV.Q(4, wc4Var.e, m39Var);
        md2VarV.Q(5, wc4Var.f, m39Var);
        md2VarV.V(m39Var, 6, (oi5) dp5VarArr[6].getValue(), wc4Var.s);
        md2VarV.Q(7, wc4Var.t, m39Var);
        md2VarV.S(m39Var, 8, wc4Var.u);
        md2VarV.a0(m39Var);
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        m39 m39Var = descriptor;
        am1 am1VarT = yd2Var.t(m39Var);
        dp5[] dp5VarArr = wc4.v;
        Object obj = null;
        int i = 0;
        int iR = 0;
        int iR2 = 0;
        int iR3 = 0;
        int iR4 = 0;
        int iR5 = 0;
        int iR6 = 0;
        yxb yxbVar = null;
        long jD = 0;
        boolean z = true;
        zu6 zu6Var = null;
        while (z) {
            int iF = am1VarT.f(m39Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    iR = am1VarT.r(m39Var, 0);
                    i |= 1;
                    break;
                case 1:
                    iR2 = am1VarT.r(m39Var, 1);
                    i |= 2;
                    break;
                case 2:
                    iR3 = am1VarT.r(m39Var, 2);
                    i |= 4;
                    break;
                case 3:
                    yxbVar = (yxb) am1VarT.q(m39Var, 3, (oi5) dp5VarArr[3].getValue(), yxbVar);
                    i |= 8;
                    break;
                case 4:
                    iR4 = am1VarT.r(m39Var, 4);
                    i |= 16;
                    break;
                case 5:
                    iR5 = am1VarT.r(m39Var, 5);
                    i |= 32;
                    break;
                case 6:
                    zu6Var = (zu6) am1VarT.q(m39Var, 6, (oi5) dp5VarArr[6].getValue(), zu6Var);
                    i |= 64;
                    break;
                case 7:
                    iR6 = am1VarT.r(m39Var, 7);
                    i |= Token.CASE;
                    continue;
                case 8:
                    jD = am1VarT.D(m39Var, 8);
                    i |= 256;
                    continue;
                default:
                    sy3.c(iF);
                    return obj;
            }
            obj = null;
        }
        am1VarT.n(m39Var);
        return new wc4(i, iR, iR2, iR3, yxbVar, iR4, iR5, zu6Var, iR6, jD);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.xd4
    public final oi5[] d() {
        dp5[] dp5VarArr = wc4.v;
        la5 la5Var = la5.a;
        return new oi5[]{la5Var, la5Var, la5Var, dp5VarArr[3].getValue(), la5Var, la5Var, dp5VarArr[6].getValue(), la5Var, e66.a};
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return descriptor;
    }
}
