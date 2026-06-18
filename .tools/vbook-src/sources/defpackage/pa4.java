package defpackage;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class pa4 extends x84 {
    public static final av0 c;
    public final xq0 b;

    static {
        av0 av0Var = av0.d;
        c = ra1.r("0021F904");
    }

    public pa4(mr0 mr0Var) {
        super(mr0Var);
        this.b = new xq0();
    }

    @Override // defpackage.x84, defpackage.il9
    public final long D0(long j, xq0 xq0Var) throws EOFException {
        p(j);
        xq0 xq0Var2 = this.b;
        if (xq0Var2.b == 0) {
            return j == 0 ? 0L : -1L;
        }
        long j2 = 0;
        while (true) {
            long jN = -1;
            while (true) {
                av0 av0Var = c;
                jN = this.b.N(av0Var.a[0], jN + 1, Long.MAX_VALUE);
                if (jN == -1 || (p(av0Var.a.length) && xq0Var2.R(av0Var.d(), jN, av0Var))) {
                    break;
                }
            }
            if (jN == -1) {
                break;
            }
            long jD0 = xq0Var2.D0(jN + 4, xq0Var);
            if (jD0 < 0) {
                jD0 = 0;
            }
            j2 += jD0;
            if (p(5L) && xq0Var2.E(4L) == 0) {
                if (((xq0Var2.E(1L) & 255) | ((xq0Var2.E(2L) & 255) << 8)) < 2) {
                    xq0Var.O0(xq0Var2.E(0L));
                    xq0Var.O0(10);
                    xq0Var.O0(0);
                    xq0Var2.skip(3L);
                }
            }
        }
        if (j2 < j) {
            long jD02 = xq0Var2.D0(j - j2, xq0Var);
            if (jD02 < 0) {
                jD02 = 0;
            }
            j2 += jD02;
        }
        if (j2 == 0) {
            return -1L;
        }
        return j2;
    }

    public final boolean p(long j) {
        xq0 xq0Var = this.b;
        long j2 = xq0Var.b;
        if (j2 >= j) {
            return true;
        }
        long j3 = j - j2;
        return super.D0(j3, xq0Var) == j3;
    }
}
