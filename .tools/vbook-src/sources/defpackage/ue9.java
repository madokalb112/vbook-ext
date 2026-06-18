package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ue9 {
    public bf9 a;
    public final byte[] b = new byte[1024];

    public ue9(int i) {
        this.a = new bf9(i);
    }

    public final void a(byte[] bArr, int i, int i2) {
        int i3;
        bArr.getClass();
        bf9 bf9Var = this.a;
        if (i2 > bf9Var.f) {
            int i4 = bf9Var.g + i2;
            bf9 bf9Var2 = new bf9((i4 == 0 ? -1 : 31 - Integer.numberOfLeadingZeros(i4)) + 2);
            bf9 bf9Var3 = this.a;
            int i5 = bf9Var3.b;
            while (true) {
                int i6 = bf9Var3.g;
                if (i6 <= 0) {
                    this.a = bf9Var2;
                    break;
                }
                int iMin = Math.min(i6, bf9Var3.a - (bf9Var3.d & i5));
                int i7 = bf9Var2.f;
                int i8 = bf9Var2.e;
                int i9 = bf9Var2.b;
                int iMin2 = Math.min(iMin, Math.min(i7, bf9Var2.a - (i8 & i9)));
                m79.w(bf9Var3.c, bf9Var3.d & i5, bf9Var2.c, i9 & bf9Var2.e, iMin2);
                if (iMin2 < 0 || iMin2 > (i3 = bf9Var3.g)) {
                    break;
                }
                bf9Var3.d += iMin2;
                bf9Var3.g = i3 - iMin2;
                bf9Var3.f += iMin2;
                bf9Var2.a(iMin2);
            }
            gp.j("Try to write more than available");
            return;
        }
        this.a.d(bArr, i, i2);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ue9) && this.a.equals(((ue9) obj).a);
    }

    public final int hashCode() {
        bf9 bf9Var = this.a;
        int i = bf9Var.g;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 7) + bf9Var.c[(bf9Var.d + i3) & bf9Var.b];
        }
        return i2;
    }
}
