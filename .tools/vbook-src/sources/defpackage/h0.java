package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class h0 implements oi5 {
    @Override // defpackage.oi5
    public Object c(yd2 yd2Var) {
        yd2Var.getClass();
        return j(yd2Var);
    }

    public abstract Object f();

    public abstract int g(Object obj);

    public abstract Iterator h(Object obj);

    public abstract int i(Object obj);

    public final Object j(yd2 yd2Var) {
        yd2Var.getClass();
        Object objF = f();
        int iG = g(objF);
        am1 am1VarT = yd2Var.t(e());
        while (true) {
            int iF = am1VarT.f(e());
            if (iF == -1) {
                am1VarT.n(e());
                return m(objF);
            }
            k(am1VarT, iF + iG, objF);
        }
    }

    public abstract void k(am1 am1Var, int i, Object obj);

    public abstract Object l(Object obj);

    public abstract Object m(Object obj);
}
