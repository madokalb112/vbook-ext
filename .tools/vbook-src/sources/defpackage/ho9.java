package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ho9 {
    public final <T> oi5 serializer(final oi5 oi5Var) {
        oi5Var.getClass();
        return new xd4() { // from class: go9
            private final m39 descriptor;

            {
                hx7 hx7Var = new hx7("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", this, 2);
                hx7Var.k("keys", false);
                hx7Var.k("values", false);
                this.descriptor = hx7Var;
            }

            @Override // defpackage.xd4
            public final oi5[] a() {
                return new oi5[]{oi5Var};
            }

            @Override // defpackage.oi5
            public final void b(md2 md2Var, Object obj) {
                io9 io9Var = (io9) obj;
                io9Var.getClass();
                m39 m39Var = this.descriptor;
                md2 md2VarV = md2Var.v(m39Var);
                md2VarV.V(m39Var, 0, (oi5) io9.c[0].getValue(), io9Var.a);
                md2VarV.V(m39Var, 1, new wv(oi5Var, 0), io9Var.b);
                md2VarV.a0(m39Var);
            }

            @Override // defpackage.oi5
            public final Object c(yd2 yd2Var) {
                m39 m39Var = this.descriptor;
                am1 am1VarT = yd2Var.t(m39Var);
                dp5[] dp5VarArr = io9.c;
                boolean z = true;
                int i = 0;
                List list = null;
                List list2 = null;
                while (z) {
                    int iF = am1VarT.f(m39Var);
                    if (iF == -1) {
                        z = false;
                    } else if (iF == 0) {
                        list = (List) am1VarT.q(m39Var, 0, (oi5) dp5VarArr[0].getValue(), list);
                        i |= 1;
                    } else {
                        if (iF != 1) {
                            sy3.c(iF);
                            return null;
                        }
                        list2 = (List) am1VarT.q(m39Var, 1, new wv(oi5Var, 0), list2);
                        i |= 2;
                    }
                }
                am1VarT.n(m39Var);
                return new io9(i, list, list2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.xd4
            public final oi5[] d() {
                return new oi5[]{io9.c[0].getValue(), new wv(oi5Var, 0)};
            }

            @Override // defpackage.oi5
            public final m39 e() {
                return this.descriptor;
            }
        };
    }
}
