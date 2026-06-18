package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class j8a implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Bitmap b;
    public final /* synthetic */ String c;

    public /* synthetic */ j8a(Bitmap bitmap, String str, int i) {
        this.a = i;
        this.b = bitmap;
        this.c = str;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        kf4 kf4Var = kf4.a;
        Bitmap bitmap = this.b;
        int i2 = 0;
        switch (i) {
            case 0:
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else if (bitmap == null) {
                    dd4Var.f0(-1582856691);
                    ny1.b(new ni(2131231010), null, xg9.i(xg9.p(22.0f), 22.0f), 0, null, dd4Var, 48, 24);
                    dd4Var.q(false);
                } else {
                    dd4Var.f0(-1583205379);
                    ny1.b(new bh0(bitmap), this.c, ww1.H(xg9.h(kf4Var), 22.0f), 0, null, dd4Var, 0, 16);
                    dd4Var.q(false);
                }
                break;
            default:
                dd4 dd4Var2 = (dd4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!dd4Var2.V(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    dd4Var2.Y();
                } else {
                    mf4 mf4VarH = ww1.H(xg9.h(kf4Var), 22.0f);
                    kj7 kj7Var = new kj7(2, 1.0f);
                    p7c.c(mf4VarH.d(new nj7(kj7Var, kj7Var, kj7Var, kj7Var)), e9.d, jf0.G(1093043496, new j8a(bitmap, this.c, i2), dd4Var2), dd4Var2, 384);
                }
                break;
        }
        return hebVar;
    }
}
