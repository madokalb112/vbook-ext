package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class seb implements mm7, rn1 {
    public long a;
    public int b;
    public km7 c;
    public final on8 d;

    public seb(int i, long j) {
        this.a = j;
        this.b = i;
        this.c = f();
        this.d = new on8(new nn8(null, this, 7), null, "• ", 0L, null, null, 235);
    }

    @Override // defpackage.mm7
    public final on8 a() {
        return this.d;
    }

    @Override // defpackage.mm7
    public final mm7 b() {
        return new seb(this.b, this.a);
    }

    @Override // defpackage.rn1
    public final void c(long j) {
        this.a = j;
        this.c = f();
    }

    @Override // defpackage.rn1
    public final long d() {
        return this.a;
    }

    @Override // defpackage.mm7
    public final km7 e(yn8 yn8Var) {
        yn8Var.getClass();
        int i = yn8Var.g;
        if (i != this.b) {
            this.b = i;
            this.c = f();
        }
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof seb) && this.b == ((seb) obj).b;
    }

    public final km7 f() {
        return new km7(0, 0, 0L, new dha(wn9.x(this.b), wn9.H(spa.c(this.a) + this.b, 4294967296L)), (iu7) null, (iy5) null, 0, 0, 503);
    }

    public final int hashCode() {
        return this.b;
    }

    public /* synthetic */ seb(int i, int i2) {
        this((i2 & 1) != 0 ? 38 : i, wn9.x(0));
    }
}
