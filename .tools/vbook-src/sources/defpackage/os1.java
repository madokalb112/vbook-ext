package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class os1 {
    public final hk9 a = new hk9();

    public static void b(os1 os1Var, yb4 yb4Var, rj1 rj1Var, ib4 ib4Var, int i) {
        if ((i & 8) != 0) {
            rj1Var = null;
        }
        os1Var.a.add(new rj1(new hu2(yb4Var, os1Var, rj1Var, ib4Var), true, -1789283891));
    }

    public final void a(ks1 ks1Var, dd4 dd4Var, int i) {
        dd4Var.h0(-798501095);
        int i2 = (dd4Var.f(ks1Var) ? 4 : 2) | i | (dd4Var.f(this) ? 32 : 16);
        if (dd4Var.V(i2 & 1, (i2 & 19) != 18)) {
            hk9 hk9Var = this.a;
            int size = hk9Var.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((zb4) hk9Var.get(i3)).c(ks1Var, dd4Var, Integer.valueOf(i2 & 14));
            }
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new il6(this, ks1Var, i, 12);
        }
    }
}
