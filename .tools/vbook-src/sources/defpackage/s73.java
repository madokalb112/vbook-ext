package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class s73 extends n31 {
    public static final t73 g = new t73(new gi8(t73.s), 6, new gi8(t73.t), t73.u, "EUC-JP");
    public final ub7 b = new ub7(g);
    public m31 c = m31.a;
    public final q73 d = new q73(0);
    public final r73 e = new r73();
    public final byte[] f = new byte[2];

    public s73() {
        d();
    }

    @Override // defpackage.n31
    public final String a() {
        return "EUC-JP";
    }

    @Override // defpackage.n31
    public final float b() {
        int i = this.d.b;
        return Math.max(i > 4 ? (i - r0.a[0]) / i : -1.0f, this.e.a());
    }

    @Override // defpackage.n31
    public final m31 c(int i, byte[] bArr) {
        m31 m31Var;
        q73 q73Var;
        byte[] bArr2;
        int i2 = 0;
        while (true) {
            m31Var = m31.b;
            q73Var = this.d;
            bArr2 = this.f;
            if (i2 >= i) {
                break;
            }
            byte b = bArr[i2];
            ub7 ub7Var = this.b;
            int iX = ub7Var.x(b);
            if (iX == 1) {
                this.c = m31.c;
                break;
            }
            if (iX == 2) {
                this.c = m31Var;
                break;
            }
            if (iX == 0) {
                int i3 = ub7Var.b;
                r73 r73Var = this.e;
                if (i2 == 0) {
                    bArr2[1] = bArr[0];
                    q73Var.a(bArr2, 0, i3);
                    r73Var.c(bArr2, 0, i3);
                } else {
                    int i4 = i2 - 1;
                    q73Var.a(bArr, i4, i3);
                    r73Var.c(bArr, i4, i3);
                }
            }
            i2++;
        }
        if (i > 0) {
            bArr2[0] = bArr[i - 1];
        }
        if (this.c == m31.a && q73Var.b > 100 && b() > 0.95f) {
            this.c = m31Var;
        }
        return this.c;
    }

    @Override // defpackage.n31
    public final void d() {
        this.b.a = 0;
        this.c = m31.a;
        q73 q73Var = this.d;
        q73Var.b = 0;
        fw.e0(0, 0, 6, q73Var.a);
        q73Var.c = -1;
        q73Var.d = false;
        this.e.d();
        fw.f0(this.f, (byte) 0);
    }
}
