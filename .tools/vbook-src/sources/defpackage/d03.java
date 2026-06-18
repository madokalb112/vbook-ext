package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class d03 {
    public final int[] a;
    public final int[] b;
    public final int c;

    public /* synthetic */ d03(int[] iArr, int[] iArr2, int i) {
        this.a = iArr;
        this.b = iArr2;
        this.c = i;
    }

    public int a(CharSequence charSequence, int i, int i2) {
        charSequence.getClass();
        if (this.c == 0) {
            return -1;
        }
        if (i2 <= 0) {
            i2 = charSequence.length();
        }
        int[] iArr = this.b;
        int i3 = iArr[0];
        int i4 = i2 + i;
        while (true) {
            int[] iArr2 = this.a;
            if (i >= i4) {
                int i5 = iArr[i3];
                if (i3 != iArr2[i3] || i5 >= 0) {
                    return -1;
                }
                return (-i5) - 1;
            }
            int iCharAt = charSequence.charAt(i) + i3 + 1;
            if (i3 != iArr2[iCharAt]) {
                return -1;
            }
            i3 = iArr[iCharAt];
            i++;
        }
    }
}
