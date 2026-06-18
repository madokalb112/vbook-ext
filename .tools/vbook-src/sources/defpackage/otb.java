package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class otb {
    public float a = 1.0f;
    public long b = 0;
    public final cn7 c = new cn7(new u96(u96.a()), s00.t);
    public final fo2 d = dk9.n(new zj(this, 3));
    public final fo2 e = dk9.n(new o39(this, 29));

    public static kf8 a(kf8 kf8Var, kf8 kf8Var2) {
        return lw1.s(rw1.w(0L, fg9.f(Math.min((kf8Var2.c - kf8Var2.a) / (kf8Var.c - kf8Var.a), (kf8Var2.d - kf8Var2.b) / (kf8Var.d - kf8Var.b)), kf8Var.f())), kf8Var2);
    }

    public final float[] b() {
        return ((u96) this.c.getValue()).a;
    }

    public final void c(kf8 kf8Var, kf8 kf8Var2) {
        kf8Var.getClass();
        kf8 kf8VarA = a(kf8Var, kf8Var2);
        float[] fArrA = v96.a(b());
        float[] fArrA2 = u96.a();
        v96.c(fArrA2, kf8Var, kf8VarA);
        u96.j(fArrA, fArrA2);
        this.c.setValue(new u96(fArrA));
    }
}
