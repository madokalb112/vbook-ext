package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ip3 implements xd4 {
    public static final ip3 a;
    private static final m39 descriptor;

    static {
        ip3 ip3Var = new ip3();
        a = ip3Var;
        hx7 hx7Var = new hx7("com.reader.app.ui.screen.extension.ExtensionRepoRoute", ip3Var, 1);
        hx7Var.k("isShowAdd", true);
        descriptor = hx7Var;
    }

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        kp3 kp3Var = (kp3) obj;
        kp3Var.getClass();
        boolean z = kp3Var.a;
        m39 m39Var = descriptor;
        md2 md2VarV = md2Var.v(m39Var);
        if (md2VarV.r0(m39Var) || z) {
            md2VarV.F(m39Var, 0, z);
        }
        md2VarV.a0(m39Var);
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        m39 m39Var = descriptor;
        am1 am1VarT = yd2Var.t(m39Var);
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        while (z) {
            int iF = am1VarT.f(m39Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    sy3.c(iF);
                    return null;
                }
                z2 = am1VarT.z(m39Var, 0);
                i = 1;
            }
        }
        am1VarT.n(m39Var);
        return new kp3(i, z2);
    }

    @Override // defpackage.xd4
    public final oi5[] d() {
        return new oi5[]{mm0.a};
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return descriptor;
    }
}
