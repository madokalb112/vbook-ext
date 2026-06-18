package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class kr5 extends nu6 implements in5 {
    public static final ir5 E = new ir5();
    public lr5 A;
    public ho0 B;
    public boolean C;
    public lh7 D;

    public final ia6 d(ja6 ja6Var, ca6 ca6Var, long j) {
        jt7 jt7VarC = ca6Var.C(j);
        return ja6Var.R(jt7VarC.a, jt7VarC.b, mc3.a, new l0(jt7VarC, 8));
    }

    public final boolean e1(gr5 gr5Var, int i) {
        if (i != 5 && i != 6) {
            if (i == 3 || i == 4) {
                if (this.D != lh7.a) {
                }
            } else if (i != 1 && i != 2) {
                gp.j("Lazy list does not support beyond bounds layout for the specified direction");
                return false;
            }
            if (f1(i) ? gr5Var.a > 0 : gr5Var.b < this.A.a() - 1) {
                return true;
            }
        } else if (this.D != lh7.b) {
            if (f1(i)) {
            }
        }
        return false;
    }

    public final boolean f1(int i) {
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            if (i == 5) {
                return this.C;
            }
            if (i == 6) {
                if (this.C) {
                    return false;
                }
            } else if (i == 3) {
                int iOrdinal = vw1.S(this).M.ordinal();
                if (iOrdinal == 0) {
                    return this.C;
                }
                if (iOrdinal != 1) {
                    mn5.g();
                    return false;
                }
                if (this.C) {
                    return false;
                }
            } else {
                if (i != 4) {
                    gp.j("Lazy list does not support beyond bounds layout for the specified direction");
                    return false;
                }
                int iOrdinal2 = vw1.S(this).M.ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        return this.C;
                    }
                    mn5.g();
                    return false;
                }
                if (this.C) {
                    return false;
                }
            }
        }
        return true;
    }
}
