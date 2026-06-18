package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class aj2 extends ki3 {
    public static final aj2 d;
    public ux1 c;

    static {
        int i = haa.c;
        int i2 = haa.d;
        long j = haa.e;
        String str = haa.a;
        aj2 aj2Var = new aj2();
        aj2Var.c = new ux1(i, i2, j, str);
        d = aj2Var;
    }

    @Override // defpackage.nx1
    public final void A(jx1 jx1Var, Runnable runnable) {
        ux1.A(this.c, runnable, 6);
    }

    @Override // defpackage.nx1
    public final void N(jx1 jx1Var, Runnable runnable) {
        ux1.A(this.c, runnable, 2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.nx1
    public final nx1 e0(int i) {
        qx1.r(i);
        return i >= haa.c ? this : super.e0(i);
    }

    @Override // defpackage.nx1
    public final String toString() {
        return "Dispatchers.Default";
    }
}
