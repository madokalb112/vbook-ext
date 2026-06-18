package defpackage;

import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class p16 {
    public static final fn1 a = new fn1(new ua5(27));

    public static a6 a(dd4 dd4Var) {
        a6 a6Var = (a6) dd4Var.j(a);
        if (a6Var == null) {
            dd4Var.f0(1213380307);
            Object baseContext = (Context) dd4Var.j(he.b);
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof a6) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            a6Var = (a6) baseContext;
        } else {
            dd4Var.f0(1213379439);
        }
        dd4Var.q(false);
        return a6Var;
    }
}
