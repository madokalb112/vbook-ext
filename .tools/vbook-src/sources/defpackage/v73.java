package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class v73 extends n31 {
    public static final w73 f = new w73(new gi8(w73.s), 4, new gi8(w73.t), w73.u, "EUC-KR");
    public final ub7 b = new ub7(f);
    public m31 c = m31.a;
    public final u73 d;
    public final byte[] e;

    public v73() {
        u73 u73Var = new u73();
        u73Var.d = 6.0f;
        int[] iArr = (int[]) u73.e.getValue();
        iArr.getClass();
        u73Var.c = iArr;
        this.d = u73Var;
        this.e = new byte[2];
        d();
    }

    @Override // defpackage.n31
    public final String a() {
        return "EUC-KR";
    }

    @Override // defpackage.n31
    public final float b() {
        return this.d.a();
    }

    @Override // defpackage.n31
    public final m31 c(int i, byte[] bArr) {
        m31 m31Var;
        byte[] bArr2;
        u73 u73Var;
        int i2 = 0;
        while (true) {
            m31Var = m31.b;
            bArr2 = this.e;
            u73Var = this.d;
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
                if (i2 == 0) {
                    bArr2[1] = bArr[0];
                    u73Var.c(bArr2, 0, i3);
                } else {
                    u73Var.c(bArr, i2 - 1, i3);
                }
            }
            i2++;
        }
        if (i > 0) {
            bArr2[0] = bArr[i - 1];
        }
        if (this.c == m31.a && u73Var.b > 1024 && u73Var.a() > 0.95f) {
            this.c = m31Var;
        }
        return this.c;
    }

    @Override // defpackage.n31
    public final void d() {
        this.b.a = 0;
        this.c = m31.a;
        this.d.d();
        fw.f0(this.e, (byte) 0);
    }
}
