package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class oe6 extends zy {
    public b10 a;

    @Override // defpackage.ax
    public final Object a(kt1 kt1Var) {
        return heb.a;
    }

    @Override // defpackage.zy, defpackage.fx
    public final Object e(kt1 kt1Var) {
        return new Long(this.a.b);
    }

    @Override // defpackage.zy
    public final Object i(long j, byte[] bArr, int i, int i2, jt1 jt1Var) {
        b10 b10Var = this.a;
        if (j < 0) {
            gp.l(xv5.l(j, "Invalid position "));
            return null;
        }
        if (0 <= j) {
            long j2 = b10Var.b;
            if (j < j2) {
                int iMax = Math.max((int) (Math.min(j2, ((long) i2) + j) - j), 0);
                m79.w((byte[]) b10Var.c, (int) j, bArr, i, iMax);
                return new Integer(iMax);
            }
        }
        return new Integer(0);
    }

    @Override // defpackage.zy
    public final Object j(long j, byte[] bArr, int i, int i2, jt1 jt1Var) {
        if (j < 0) {
            gp.l(xv5.l(j, "Invalid position "));
            return null;
        }
        b10 b10Var = this.a;
        int iMax = Math.max(b10Var.b, (int) (((long) i2) + j));
        int i3 = b10Var.b;
        b10Var.c(iMax);
        b10Var.b = iMax;
        if (iMax > i3) {
            byte[] bArr2 = (byte[]) b10Var.c;
            bArr2.getClass();
            Arrays.fill(bArr2, i3, iMax, (byte) 0);
        }
        m79.w(bArr, i, (byte[]) b10Var.c, (int) j, i2);
        return heb.a;
    }

    public final String toString() {
        return tw2.p(new StringBuilder("MemoryAsyncStreamBase("), this.a.b, ')');
    }
}
