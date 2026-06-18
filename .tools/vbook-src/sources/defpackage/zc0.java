package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zc0 extends bd0 {
    public final char[] f;

    public zc0(yc0 yc0Var) {
        super(yc0Var, (Character) null);
        this.f = new char[512];
        char[] cArr = yc0Var.b;
        fx1.G(cArr.length == 16);
        for (int i = 0; i < 256; i++) {
            char[] cArr2 = this.f;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | 256] = cArr[i & 15];
        }
    }

    @Override // defpackage.bd0, defpackage.cd0
    public final void b(StringBuilder sb, byte[] bArr, int i) {
        fx1.P(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.f;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | 256]);
        }
    }

    @Override // defpackage.bd0
    public final cd0 d(yc0 yc0Var, Character ch) {
        return new zc0(yc0Var);
    }
}
