package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class rc4 extends n31 {
    public static final sc4 f = new sc4(new gi8(sc4.s), 7, new gi8(sc4.t), sc4.u, "GB18030");
    public final ub7 b = new ub7(f);
    public m31 c = m31.a;
    public final tc4 d;
    public final byte[] e;

    public rc4() {
        tc4 tc4Var = new tc4();
        tc4Var.d = 0.9f;
        int[] iArr = (int[]) tc4.e.getValue();
        iArr.getClass();
        tc4Var.c = iArr;
        this.d = tc4Var;
        this.e = new byte[2];
        d();
    }

    @Override // defpackage.n31
    public final String a() {
        return "GB18030";
    }

    @Override // defpackage.n31
    public final float b() {
        return this.d.a();
    }

    @Override // defpackage.n31
    public final m31 c(int i, byte[] bArr) {
        m31 m31Var;
        byte[] bArr2;
        tc4 tc4Var;
        int i2 = 0;
        while (true) {
            m31Var = m31.b;
            bArr2 = this.e;
            tc4Var = this.d;
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
                    tc4Var.c(bArr2, 0, i3);
                } else {
                    tc4Var.c(bArr, i2 - 1, i3);
                }
            }
            i2++;
        }
        if (i > 0) {
            bArr2[0] = bArr[i - 1];
        }
        if (this.c == m31.a && tc4Var.b > 1024 && tc4Var.a() > 0.95f) {
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
