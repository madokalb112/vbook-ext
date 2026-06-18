package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ih7 implements mm7, rn1 {
    public int a;
    public vn9 b;
    public long c;
    public int d;
    public km7 e;
    public on8 f;

    public /* synthetic */ ih7(int i, int i2, int i3) {
        this(i, (i3 & 2) != 0 ? 38 : i2, new vn9(0L, 0L, (a84) null, (t74) null, (u74) null, (c64) null, (String) null, 0L, (ge0) null, (aha) null, (h36) null, 0L, (jda) null, (o89) null, 65535), wn9.x(0));
    }

    @Override // defpackage.mm7
    public final on8 a() {
        return this.f;
    }

    @Override // defpackage.mm7
    public final mm7 b() {
        return new ih7(this.a + 1, this.d, this.b, this.c);
    }

    @Override // defpackage.rn1
    public final void c(long j) {
        this.c = j;
        this.e = f();
    }

    @Override // defpackage.rn1
    public final long d() {
        return this.c;
    }

    @Override // defpackage.mm7
    public final km7 e(yn8 yn8Var) {
        yn8Var.getClass();
        int i = yn8Var.f;
        if (i != this.d) {
            this.d = i;
            this.e = f();
        }
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ih7) && this.d == ((ih7) obj).d;
    }

    public final km7 f() {
        return new km7(0, 0, 0L, new dha(wn9.H(this.d - spa.c(this.c), 4294967296L), wn9.x(this.d)), (iu7) null, (iy5) null, 0, 0, 503);
    }

    public final on8 g(long j) {
        String str = this.a + ". ";
        return new on8(new nn8(null, this, 7), null, str, xv5.d(pja.g(j), pja.g(j), str), this.b, null, Token.VOID);
    }

    public final int hashCode() {
        return this.d;
    }

    public ih7(int i, int i2, vn9 vn9Var, long j) {
        vn9Var.getClass();
        this.a = i;
        this.b = vn9Var;
        this.c = j;
        this.d = i2;
        this.e = f();
        this.f = g(zk9.h(0, 0));
    }
}
