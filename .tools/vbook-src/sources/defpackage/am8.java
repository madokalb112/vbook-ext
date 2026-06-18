package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class am8 {
    public final <T> oi5 serializer(final oi5 oi5Var) {
        oi5Var.getClass();
        return new xd4() { // from class: zl8
            private final m39 descriptor;

            {
                hx7 hx7Var = new hx7("com.reader.data.community.api.Response", this, 2);
                hx7Var.k("code", true);
                hx7Var.k("data", false);
                this.descriptor = hx7Var;
            }

            @Override // defpackage.xd4
            public final oi5[] a() {
                return new oi5[]{oi5Var};
            }

            @Override // defpackage.oi5
            public final void b(md2 md2Var, Object obj) {
                bm8 bm8Var = (bm8) obj;
                bm8Var.getClass();
                int i = bm8Var.a;
                m39 m39Var = this.descriptor;
                md2 md2VarV = md2Var.v(m39Var);
                if (md2VarV.r0(m39Var) || i != 0) {
                    md2VarV.Q(0, i, m39Var);
                }
                md2VarV.U(m39Var, 1, oi5Var, bm8Var.b);
                md2VarV.a0(m39Var);
            }

            @Override // defpackage.oi5
            public final Object c(yd2 yd2Var) {
                m39 m39Var = this.descriptor;
                am1 am1VarT = yd2Var.t(m39Var);
                boolean z = true;
                int i = 0;
                int iR = 0;
                Object objX = null;
                while (z) {
                    int iF = am1VarT.f(m39Var);
                    if (iF == -1) {
                        z = false;
                    } else if (iF == 0) {
                        iR = am1VarT.r(m39Var, 0);
                        i |= 1;
                    } else {
                        if (iF != 1) {
                            sy3.c(iF);
                            return null;
                        }
                        objX = am1VarT.x(m39Var, 1, oi5Var, objX);
                        i |= 2;
                    }
                }
                am1VarT.n(m39Var);
                return new bm8(i, objX, iR);
            }

            @Override // defpackage.xd4
            public final oi5[] d() {
                return new oi5[]{la5.a, s32.J0(oi5Var)};
            }

            @Override // defpackage.oi5
            public final m39 e() {
                return this.descriptor;
            }
        };
    }
}
