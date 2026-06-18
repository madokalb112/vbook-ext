package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class if9 extends n31 {
    public final c39 b;
    public final boolean c;
    public final n31 d;
    public m31 e = m31.a;
    public int f = 255;
    public final int[] g = new int[4];
    public int h;
    public int i;
    public int j;

    public if9(c39 c39Var, boolean z, el4 el4Var) {
        this.b = c39Var;
        this.c = z;
        this.d = el4Var;
    }

    @Override // defpackage.n31
    public final String a() {
        String strA;
        n31 n31Var = this.d;
        return (n31Var == null || (strA = n31Var.a()) == null) ? this.b.d : strA;
    }

    @Override // defpackage.n31
    public final float b() {
        int i;
        int i2 = this.h;
        if (i2 <= 0 || (i = this.i) <= 0) {
            return 0.01f;
        }
        float f = ((this.j * 1.0f) / i) * (((this.g[3] * 1.0f) / i2) / this.b.c);
        if (f >= 1.0f) {
            return 0.99f;
        }
        return f;
    }

    @Override // defpackage.n31
    public final m31 c(int i, byte[] bArr) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            c39 c39Var = this.b;
            int i4 = c39Var.a[i3];
            if (i4 < 250) {
                this.i++;
            }
            if (i4 < 64) {
                this.j++;
                int i5 = this.f;
                if (i5 < 64) {
                    this.h++;
                    int i6 = c39Var.b[!this.c ? (i5 * 64) + i4 : i5 + (i4 * 64)];
                    if (i6 >= 0 && i6 < 4) {
                        int[] iArr = this.g;
                        iArr[i6] = iArr[i6] + 1;
                    }
                }
            }
            this.f = i4;
        }
        if (this.e == m31.a && this.h > 1024) {
            float fB = b();
            if (fB > 0.95f) {
                this.e = m31.b;
            } else if (fB < 0.05f) {
                this.e = m31.c;
            }
        }
        return this.e;
    }

    @Override // defpackage.n31
    public final void d() {
        this.e = m31.a;
        this.f = 255;
        fw.e0(0, 0, 6, this.g);
        this.h = 0;
        this.i = 0;
        this.j = 0;
    }
}
