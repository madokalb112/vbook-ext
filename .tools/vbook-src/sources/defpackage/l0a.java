package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class l0a {
    public int a;
    public int b;
    public int c;
    public int[] d;
    public int[] e;
    public boolean f;
    public boolean g;

    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(int[] r11, int[] r12, int r13, defpackage.ep1 r14) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l0a.c(int[], int[], int, ep1):boolean");
    }

    public final int[] a() {
        int[] iArr = this.d;
        int length = iArr.length - 1;
        while (length >= 0 && iArr[length] == 0 && !yib.u(iArr[length - 1])) {
            length--;
        }
        int i = length + 1;
        int i2 = 0;
        int i3 = i;
        for (int i4 = 0; i4 < i; i4++) {
            if (yib.u(iArr[i4])) {
                i3--;
            }
        }
        int[] iArr2 = new int[i3];
        int i5 = 0;
        while (i2 < i3) {
            iArr2[i2] = iArr[i5];
            if (yib.u(iArr[i5])) {
                i5++;
            }
            i2++;
            i5++;
        }
        return iArr2;
    }

    public final boolean b(int[] iArr, int i, int[] iArr2, int i2, ep1 ep1Var) {
        boolean z = this.f;
        int[] iArr3 = this.d;
        if (z) {
            if (iArr3.length == i && this.e.length == i2) {
                return c(iArr3, iArr, i, ep1Var) || c(this.e, iArr2, i2, ep1Var);
            }
            gp.l("bad merge attempt");
            return false;
        }
        System.arraycopy(iArr, 0, iArr3, 0, i);
        int[] iArr4 = new int[i2];
        this.e = iArr4;
        System.arraycopy(iArr2, 0, iArr4, 0, i2);
        this.f = true;
        return true;
    }

    public final String toString() {
        return dx1.f(this.a, "sb ");
    }
}
