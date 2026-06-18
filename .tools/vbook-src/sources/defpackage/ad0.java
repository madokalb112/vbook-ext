package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ad0 extends bd0 {
    public ad0(String str, String str2) {
        this(new yc0(str, str2.toCharArray()), (Character) '=');
    }

    @Override // defpackage.bd0, defpackage.cd0
    public final void b(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        fx1.P(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = i2 + 2;
            int i5 = ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2] & 255) << 16);
            i2 += 3;
            int i6 = i5 | (bArr[i4] & 255);
            yc0 yc0Var = this.c;
            char[] cArr = yc0Var.b;
            char[] cArr2 = yc0Var.b;
            sb.append(cArr[i6 >>> 18]);
            sb.append(cArr2[(i6 >>> 12) & 63]);
            sb.append(cArr2[(i6 >>> 6) & 63]);
            sb.append(cArr2[i6 & 63]);
        }
        if (i2 < i) {
            c(sb, bArr, i2, i - i2);
        }
    }

    @Override // defpackage.bd0
    public final cd0 d(yc0 yc0Var, Character ch) {
        return new ad0(yc0Var, ch);
    }

    public ad0(yc0 yc0Var, Character ch) {
        super(yc0Var, ch);
        fx1.G(yc0Var.b.length == 64);
    }
}
