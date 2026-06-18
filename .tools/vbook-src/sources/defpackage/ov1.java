package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ov1 implements xd4 {
    public static final ov1 a;
    private static final m39 descriptor;

    static {
        ov1 ov1Var = new ov1();
        a = ov1Var;
        hx7 hx7Var = new hx7("com.reader.data.community.api.dto.ConversationUnreadCountDto", ov1Var, 1);
        hx7Var.k("unread_count", true);
        descriptor = hx7Var;
    }

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        qv1 qv1Var = (qv1) obj;
        qv1Var.getClass();
        int i = qv1Var.a;
        m39 m39Var = descriptor;
        md2 md2VarV = md2Var.v(m39Var);
        if (md2VarV.r0(m39Var) || i != 0) {
            md2VarV.Q(0, i, m39Var);
        }
        md2VarV.a0(m39Var);
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        m39 m39Var = descriptor;
        am1 am1VarT = yd2Var.t(m39Var);
        boolean z = true;
        int i = 0;
        int iR = 0;
        while (z) {
            int iF = am1VarT.f(m39Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    sy3.c(iF);
                    return null;
                }
                iR = am1VarT.r(m39Var, 0);
                i = 1;
            }
        }
        am1VarT.n(m39Var);
        return new qv1(i, iR);
    }

    @Override // defpackage.xd4
    public final oi5[] d() {
        return new oi5[]{la5.a};
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return descriptor;
    }
}
