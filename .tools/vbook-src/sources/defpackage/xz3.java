package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xz3 extends x84 {
    public final long b;
    public final boolean c;
    public long d;

    public xz3(il9 il9Var, long j, boolean z) {
        super(il9Var);
        this.b = j;
        this.c = z;
    }

    @Override // defpackage.x84, defpackage.il9
    public final long D0(long j, xq0 xq0Var) throws IOException {
        xq0Var.getClass();
        long j2 = this.d;
        long j3 = this.b;
        if (j2 > j3) {
            j = 0;
        } else if (this.c) {
            long j4 = j3 - j2;
            if (j4 == 0) {
                return -1L;
            }
            j = Math.min(j, j4);
        }
        long jD0 = this.a.D0(j, xq0Var);
        if (jD0 != -1) {
            this.d += jD0;
        }
        long j5 = this.d;
        if ((j5 >= j3 || jD0 != -1) && j5 <= j3) {
            return jD0;
        }
        if (jD0 > 0 && j5 > j3) {
            long j6 = xq0Var.b - (j5 - j3);
            xq0 xq0Var2 = new xq0();
            xq0Var2.K0(xq0Var);
            xq0Var.y0(j6, xq0Var2);
            xq0Var2.p();
        }
        StringBuilder sbO = j39.o(j3, "expected ", " bytes but got ");
        sbO.append(this.d);
        throw new IOException(sbO.toString());
    }
}
