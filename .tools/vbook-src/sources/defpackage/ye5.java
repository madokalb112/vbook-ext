package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ye5 implements oi5 {
    public static final ye5 a = new ye5();
    public static final xe5 b = xe5.b;

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        we5 we5Var = (we5) obj;
        we5Var.getClass();
        wx1.I(md2Var);
        pf5 pf5Var = pf5.a;
        m39 m39VarE = pf5Var.e();
        m39VarE.getClass();
        uv uvVar = new uv(m39VarE, 1);
        int size = we5Var.size();
        md2 md2VarV = md2Var.v(uvVar);
        Iterator<mf5> it = we5Var.iterator();
        for (int i = 0; i < size; i++) {
            md2VarV.V(uvVar, i, pf5Var, it.next());
        }
        md2VarV.a0(uvVar);
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        wx1.J(yd2Var);
        return new we5((List) new wv(pf5.a, 0).j(yd2Var));
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return b;
    }
}
