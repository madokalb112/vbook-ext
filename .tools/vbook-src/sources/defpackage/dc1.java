package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class dc1 extends h0 {
    public final oi5 a;

    public dc1(oi5 oi5Var) {
        this.a = oi5Var;
    }

    @Override // defpackage.oi5
    public void b(md2 md2Var, Object obj) {
        int i = i(obj);
        m39 m39VarE = e();
        m39VarE.getClass();
        md2 md2VarV = md2Var.v(m39VarE);
        Iterator itH = h(obj);
        for (int i2 = 0; i2 < i; i2++) {
            md2VarV.V(e(), i2, this.a, itH.next());
        }
        md2VarV.a0(m39VarE);
    }

    @Override // defpackage.h0
    public void k(am1 am1Var, int i, Object obj) {
        n(i, obj, am1Var.q(e(), i, this.a, null));
    }

    public abstract void n(int i, Object obj, Object obj2);
}
