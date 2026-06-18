package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class se1 implements jx1, Serializable {
    public final jx1 a;
    public final hx1 b;

    public se1(hx1 hx1Var, jx1 jx1Var) {
        jx1Var.getClass();
        hx1Var.getClass();
        this.a = jx1Var;
        this.b = hx1Var;
    }

    public final boolean equals(Object obj) {
        boolean zQ;
        if (this == obj) {
            return true;
        }
        if (obj instanceof se1) {
            se1 se1Var = (se1) obj;
            int i = 2;
            se1 se1Var2 = se1Var;
            int i2 = 2;
            while (true) {
                jx1 jx1Var = se1Var2.a;
                se1Var2 = jx1Var instanceof se1 ? (se1) jx1Var : null;
                if (se1Var2 == null) {
                    break;
                }
                i2++;
            }
            se1 se1Var3 = this;
            while (true) {
                jx1 jx1Var2 = se1Var3.a;
                se1Var3 = jx1Var2 instanceof se1 ? (se1) jx1Var2 : null;
                if (se1Var3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                while (true) {
                    hx1 hx1Var = this.b;
                    if (!lc5.Q(se1Var.get(hx1Var.getKey()), hx1Var)) {
                        zQ = false;
                        break;
                    }
                    jx1 jx1Var3 = this.a;
                    if (!(jx1Var3 instanceof se1)) {
                        jx1Var3.getClass();
                        hx1 hx1Var2 = (hx1) jx1Var3;
                        zQ = lc5.Q(se1Var.get(hx1Var2.getKey()), hx1Var2);
                        break;
                    }
                    this = (se1) jx1Var3;
                }
                if (zQ) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.jx1
    public final Object fold(Object obj, yb4 yb4Var) {
        return yb4Var.invoke(this.a.fold(obj, yb4Var), this.b);
    }

    @Override // defpackage.jx1
    public final hx1 get(ix1 ix1Var) {
        ix1Var.getClass();
        while (true) {
            hx1 hx1Var = this.b.get(ix1Var);
            if (hx1Var != null) {
                return hx1Var;
            }
            jx1 jx1Var = this.a;
            if (!(jx1Var instanceof se1)) {
                return jx1Var.get(ix1Var);
            }
            this = (se1) jx1Var;
        }
    }

    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode();
    }

    @Override // defpackage.jx1
    public final jx1 minusKey(ix1 ix1Var) {
        ix1Var.getClass();
        hx1 hx1Var = this.b;
        hx1 hx1Var2 = hx1Var.get(ix1Var);
        jx1 jx1Var = this.a;
        if (hx1Var2 != null) {
            return jx1Var;
        }
        jx1 jx1VarMinusKey = jx1Var.minusKey(ix1Var);
        return jx1VarMinusKey == jx1Var ? this : jx1VarMinusKey == hc3.a ? hx1Var : new se1(hx1Var, jx1VarMinusKey);
    }

    @Override // defpackage.jx1
    public final jx1 plus(jx1 jx1Var) {
        jx1Var.getClass();
        return jx1Var == hc3.a ? this : (jx1) jx1Var.fold(this, new qk1(29));
    }

    public final String toString() {
        return xv5.s(new StringBuilder("["), (String) fold("", new k7(11)), ']');
    }
}
