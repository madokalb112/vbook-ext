package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class hg5 implements oi5 {
    public static final hg5 a = new hg5();
    public static final gg5 b = gg5.b;

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        fg5 fg5Var = (fg5) obj;
        fg5Var.getClass();
        wx1.I(md2Var);
        new sj4(tv9.a, pf5.a, 1).b(md2Var, fg5Var);
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        wx1.J(yd2Var);
        return new fg5((Map) new sj4(tv9.a, pf5.a, 1).c(yd2Var));
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return b;
    }
}
