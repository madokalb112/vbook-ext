package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class t26 {
    public static final fn1 a = new fn1(new z16(5));

    public static q37 a(dd4 dd4Var) {
        q37 q37Var;
        q37 q37Var2 = (q37) dd4Var.j(a);
        if (q37Var2 != null) {
            dd4Var.f0(950834231);
            dd4Var.q(false);
            return q37Var2;
        }
        dd4Var.f0(950836184);
        View view = (View) dd4Var.j(he.f);
        view.getClass();
        while (true) {
            q37Var = null;
            if (view == null) {
                break;
            }
            Object tag = view.getTag(2131362477);
            q37 q37Var3 = tag instanceof q37 ? (q37) tag : null;
            if (q37Var3 != null) {
                q37Var = q37Var3;
                break;
            }
            Object objS = dk9.s(view);
            view = objS instanceof View ? (View) objS : null;
        }
        dd4Var.q(false);
        return q37Var;
    }
}
