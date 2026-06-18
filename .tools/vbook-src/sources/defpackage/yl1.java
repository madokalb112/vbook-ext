package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class yl1 extends a81 {
    public final boolean d;

    public yl1(qb5 qb5Var, boolean z) {
        super(qb5Var, 1);
        this.d = z;
    }

    public final void f(byte b) {
        if (this.d) {
            k(String.valueOf(b & 255));
            return;
        }
        String strValueOf = String.valueOf(b & 255);
        strValueOf.getClass();
        ((qb5) ((a81) this).c).f(strValueOf);
    }

    public final void h(int i) {
        if (this.d) {
            k(Long.toString(((long) i) & 4294967295L, 10));
            return;
        }
        String string = Long.toString(((long) i) & 4294967295L, 10);
        string.getClass();
        ((qb5) ((a81) this).c).f(string);
    }

    public final void i(long j) {
        int i = 63;
        String str = "0";
        if (this.d) {
            if (j != 0) {
                if (j > 0) {
                    str = Long.toString(j, 10);
                } else {
                    char[] cArr = new char[64];
                    long j2 = (j >>> 1) / 5;
                    cArr[63] = Character.forDigit((int) (j - (j2 * 10)), 10);
                    while (j2 > 0) {
                        i--;
                        cArr[i] = Character.forDigit((int) (j2 % 10), 10);
                        j2 /= 10;
                    }
                    str = new String(cArr, i, 64 - i);
                }
            }
            k(str);
            return;
        }
        if (j != 0) {
            if (j > 0) {
                str = Long.toString(j, 10);
            } else {
                char[] cArr2 = new char[64];
                long j3 = (j >>> 1) / 5;
                cArr2[63] = Character.forDigit((int) (j - (j3 * 10)), 10);
                while (j3 > 0) {
                    i--;
                    cArr2[i] = Character.forDigit((int) (j3 % 10), 10);
                    j3 /= 10;
                }
                str = new String(cArr2, i, 64 - i);
            }
        }
        str.getClass();
        ((qb5) ((a81) this).c).f(str);
    }

    public final void j(short s) {
        if (this.d) {
            k(String.valueOf(s & 65535));
            return;
        }
        String strValueOf = String.valueOf(s & 65535);
        strValueOf.getClass();
        ((qb5) ((a81) this).c).f(strValueOf);
    }
}
