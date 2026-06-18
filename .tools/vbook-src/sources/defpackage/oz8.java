package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class oz8 {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public oz8 f;
    public oz8 g;

    public oz8(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        bArr.getClass();
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }

    public final oz8 a() {
        oz8 oz8Var = this.f;
        if (oz8Var == this) {
            oz8Var = null;
        }
        oz8 oz8Var2 = this.g;
        oz8Var2.getClass();
        oz8Var2.f = this.f;
        oz8 oz8Var3 = this.f;
        oz8Var3.getClass();
        oz8Var3.g = this.g;
        this.f = null;
        this.g = null;
        return oz8Var;
    }

    public final void b(oz8 oz8Var) {
        oz8Var.getClass();
        oz8Var.g = this;
        oz8Var.f = this.f;
        oz8 oz8Var2 = this.f;
        oz8Var2.getClass();
        oz8Var2.g = oz8Var;
        this.f = oz8Var;
    }

    public final oz8 c() {
        this.d = true;
        return new oz8(this.a, this.b, this.c, true, false);
    }

    public final void d(oz8 oz8Var, int i) {
        oz8Var.getClass();
        if (!oz8Var.e) {
            gp.j("only owner can write");
            return;
        }
        int i2 = oz8Var.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (oz8Var.d) {
                w58.p();
                return;
            }
            int i4 = oz8Var.b;
            if (i3 - i4 > 8192) {
                w58.p();
                return;
            }
            byte[] bArr = oz8Var.a;
            fw.W(bArr, bArr, 0, i4, i2, 2);
            oz8Var.c -= oz8Var.b;
            oz8Var.b = 0;
        }
        byte[] bArr2 = oz8Var.a;
        int i5 = oz8Var.c;
        int i6 = this.b;
        fw.R(this.a, i5, bArr2, i6, i6 + i);
        oz8Var.c += i;
        this.b += i;
    }

    public oz8() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }
}
