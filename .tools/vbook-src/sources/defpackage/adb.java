package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class adb extends n31 {
    public static final bdb e = new bdb(new gi8(bdb.s), 16, new gi8(bdb.t), bdb.u, "UTF-8");
    public ub7 b;
    public m31 c;
    public int d;

    @Override // defpackage.n31
    public final String a() {
        return "UTF-8";
    }

    @Override // defpackage.n31
    public final float b() {
        int i = this.d;
        float f = 0.99f;
        if (i >= 6) {
            return 0.99f;
        }
        for (int i2 = 0; i2 < i; i2++) {
            f *= 0.5f;
        }
        return 1.0f - f;
    }

    @Override // defpackage.n31
    public final m31 c(int i, byte[] bArr) {
        m31 m31Var;
        ub7 ub7Var = this.b;
        int i2 = 0;
        while (true) {
            m31Var = m31.b;
            if (i2 >= i) {
                break;
            }
            int iX = ub7Var.x(bArr[i2]);
            if (iX == 1) {
                this.c = m31.c;
                break;
            }
            if (iX == 2) {
                this.c = m31Var;
                break;
            }
            if (iX == 0 && ub7Var.b >= 2) {
                this.d++;
            }
            i2++;
        }
        if (this.c == m31.a && b() > 0.95f) {
            this.c = m31Var;
        }
        return this.c;
    }

    @Override // defpackage.n31
    public final void d() {
        this.b.a = 0;
        this.d = 0;
        this.c = m31.a;
    }
}
