package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class j6b implements xd4 {
    public static final j6b a;
    private static final m39 descriptor;

    static {
        j6b j6bVar = new j6b();
        a = j6bVar;
        hx7 hx7Var = new hx7("com.reader.data.word.model.TrashWordDto", j6bVar, 2);
        hx7Var.k("word", false);
        hx7Var.k("regex", false);
        descriptor = hx7Var;
    }

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        l6b l6bVar = (l6b) obj;
        l6bVar.getClass();
        m39 m39Var = descriptor;
        md2 md2VarV = md2Var.v(m39Var);
        md2VarV.Z(m39Var, 0, l6bVar.a);
        md2VarV.F(m39Var, 1, l6bVar.b);
        md2VarV.a0(m39Var);
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        m39 m39Var = descriptor;
        am1 am1VarT = yd2Var.t(m39Var);
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String strK = null;
        while (z) {
            int iF = am1VarT.f(m39Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                strK = am1VarT.k(m39Var, 0);
                i |= 1;
            } else {
                if (iF != 1) {
                    sy3.c(iF);
                    return null;
                }
                z2 = am1VarT.z(m39Var, 1);
                i |= 2;
            }
        }
        am1VarT.n(m39Var);
        return new l6b(i, strK, z2);
    }

    @Override // defpackage.xd4
    public final oi5[] d() {
        return new oi5[]{tv9.a, mm0.a};
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return descriptor;
    }
}
