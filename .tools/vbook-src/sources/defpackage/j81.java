package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class j81 extends md2 {
    public static final j81 M = new j81(0);
    public static final j81 N = new j81(1);
    public static final j81 O = new j81(2);
    public final /* synthetic */ int L;

    public /* synthetic */ j81(int i) {
        this.L = i;
    }

    @Override // defpackage.md2
    public int o0(int i) {
        switch (this.L) {
            case 0:
                if (i % 16 == 0) {
                    return 0;
                }
                j31.i(xv5.u(i, "Data (", ") is not multiple of 16, and padding was set to "), M);
                return 0;
            default:
                return super.o0(i);
        }
    }

    @Override // defpackage.md2
    public int p0(byte[] bArr) {
        switch (this.L) {
            case 0:
                return bArr.length;
            case 1:
            default:
                return super.p0(bArr);
            case 2:
                int i = 0;
                for (int length = bArr.length - 1; -1 < length && bArr[length] == 0; length--) {
                    i++;
                }
                return bArr.length - i;
        }
    }

    @Override // defpackage.md2
    public void r(byte[] bArr, int i, int i2) {
        switch (this.L) {
            case 1:
                int length = bArr.length;
                while (i < length) {
                    bArr[i] = (byte) i2;
                    i++;
                }
                break;
        }
    }

    private final void z0(byte[] bArr, int i, int i2) {
    }
}
