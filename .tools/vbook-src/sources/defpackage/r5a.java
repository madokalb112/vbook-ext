package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class r5a implements AutoCloseable {
    public final te6 a;
    public final byte[] b;
    public long c = 0;

    public r5a(te6 te6Var) {
        this.a = te6Var;
        this.b = (byte[]) te6Var.b;
    }

    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        long j = this.c;
        b10 b10Var = (b10) this.a.c;
        int iMax = 0;
        if (j < 0) {
            gp.l(xv5.l(j, "Invalid position "));
            return 0;
        }
        int i3 = (int) j;
        if (0 <= j) {
            int i4 = b10Var.b;
            if (j < i4) {
                iMax = Math.max(Math.min(i4, i2 + i3) - i3, 0);
                m79.w((byte[]) b10Var.c, i3, bArr, i, iMax);
            }
        }
        this.c += (long) iMax;
        return iMax;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SyncStream(");
        sb.append(this.a);
        sb.append(", ");
        return dx1.j(sb, this.c, ')');
    }

    public final void write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        long j = this.c;
        if (j < 0) {
            gp.l(xv5.l(j, "Invalid position "));
            return;
        }
        b10 b10Var = (b10) this.a.c;
        long j2 = i2;
        int iMax = Math.max(b10Var.b, (int) (j + j2));
        int i3 = b10Var.b;
        b10Var.c(iMax);
        b10Var.b = iMax;
        if (iMax > i3) {
            byte[] bArr2 = (byte[]) b10Var.c;
            bArr2.getClass();
            Arrays.fill(bArr2, i3, iMax, (byte) 0);
        }
        m79.w(bArr, i, (byte[]) b10Var.c, (int) j, i2);
        this.c += j2;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
