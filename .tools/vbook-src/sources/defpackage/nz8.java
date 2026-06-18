package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class nz8 {
    public final byte[] a;
    public int b;
    public int c;
    public sg8 d;
    public boolean e;
    public nz8 f;
    public nz8 g;

    public nz8() {
        this.a = new byte[8192];
        this.e = true;
        this.d = null;
    }

    public final int a() {
        return this.a.length - this.c;
    }

    public final int b() {
        return this.c - this.b;
    }

    public final byte c(int i) {
        return this.a[this.b + i];
    }

    public final nz8 d() {
        nz8 nz8Var = this.f;
        nz8 nz8Var2 = this.g;
        if (nz8Var2 != null) {
            nz8Var2.getClass();
            nz8Var2.f = this.f;
        }
        nz8 nz8Var3 = this.f;
        if (nz8Var3 != null) {
            nz8Var3.getClass();
            nz8Var3.g = this.g;
        }
        this.f = null;
        this.g = null;
        return nz8Var;
    }

    public final void e(nz8 nz8Var) {
        nz8Var.getClass();
        nz8Var.g = this;
        nz8Var.f = this.f;
        nz8 nz8Var2 = this.f;
        if (nz8Var2 != null) {
            nz8Var2.g = nz8Var;
        }
        this.f = nz8Var;
    }

    public final nz8 f() {
        sg8 sg8Var = this.d;
        if (sg8Var == null) {
            nz8 nz8Var = yz8.a;
            sg8Var = new sg8();
            this.d = sg8Var;
        }
        int i = this.b;
        int i2 = this.c;
        sg8.b.incrementAndGet(sg8Var);
        return new nz8(this.a, i, i2, sg8Var);
    }

    public final void g(nz8 nz8Var, int i) {
        nz8Var.getClass();
        if (!nz8Var.e) {
            gp.j("only owner can write");
            return;
        }
        if (nz8Var.c + i > 8192) {
            sg8 sg8Var = nz8Var.d;
            if (sg8Var != null && sg8Var.a > 0) {
                w58.p();
                return;
            }
            int i2 = nz8Var.c;
            int i3 = nz8Var.b;
            if ((i2 + i) - i3 > 8192) {
                w58.p();
                return;
            }
            byte[] bArr = nz8Var.a;
            fw.W(bArr, bArr, 0, i3, i2, 2);
            nz8Var.c -= nz8Var.b;
            nz8Var.b = 0;
        }
        byte[] bArr2 = this.a;
        byte[] bArr3 = nz8Var.a;
        int i4 = nz8Var.c;
        int i5 = this.b;
        fw.R(bArr2, i4, bArr3, i5, i5 + i);
        nz8Var.c += i;
        this.b += i;
    }

    public nz8(byte[] bArr, int i, int i2, sg8 sg8Var) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = sg8Var;
        this.e = false;
    }
}
