package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class i67 implements xd4 {
    public static final i67 a;
    private static final m39 descriptor;

    static {
        i67 i67Var = new i67();
        a = i67Var;
        descriptor = new hx7("com.reader.data.community.api.NoData", i67Var, 0);
    }

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        ((k67) obj).getClass();
        m39 m39Var = descriptor;
        md2Var.v(m39Var).a0(m39Var);
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        m39 m39Var = descriptor;
        am1 am1VarT = yd2Var.t(m39Var);
        int iF = am1VarT.f(m39Var);
        if (iF == -1) {
            am1VarT.n(m39Var);
            return new k67();
        }
        sy3.c(iF);
        return null;
    }

    @Override // defpackage.xd4
    public final oi5[] d() {
        return new oi5[0];
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return descriptor;
    }
}
