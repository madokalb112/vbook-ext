package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ot9 extends md2 {
    public final a81 L;
    public final ue5 M;
    public final g3c N;
    public final ot9[] O;
    public final q32 P;
    public final cf5 Q;
    public boolean R;
    public String S;
    public String T;

    public ot9(a81 a81Var, ue5 ue5Var, g3c g3cVar, ot9[] ot9VarArr) {
        a81Var.getClass();
        ue5Var.getClass();
        this.L = a81Var;
        this.M = ue5Var;
        this.N = g3cVar;
        this.O = ot9VarArr;
        this.P = ue5Var.b;
        this.Q = ue5Var.a;
        int iOrdinal = g3cVar.ordinal();
        if (ot9VarArr != null) {
            ot9 ot9Var = ot9VarArr[iOrdinal];
            if (ot9Var == null && ot9Var == this) {
                return;
            }
            ot9VarArr[iOrdinal] = this;
        }
    }

    @Override // defpackage.md2
    public final void E(boolean z) {
        if (this.R) {
            Y(String.valueOf(z));
        } else {
            ((qb5) this.L.c).f(String.valueOf(z));
        }
    }

    @Override // defpackage.md2
    public final void G(byte b) {
        if (this.R) {
            Y(String.valueOf((int) b));
        } else {
            this.L.f(b);
        }
    }

    @Override // defpackage.md2
    public final void H(char c) {
        Y(String.valueOf(c));
    }

    @Override // defpackage.md2
    public final void I(double d) {
        if (this.R) {
            Y(String.valueOf(d));
        } else {
            ((qb5) this.L.c).f(String.valueOf(d));
        }
        if (!this.Q.i && Math.abs(d) > Double.MAX_VALUE) {
            throw new rf5(ny1.R(Double.valueOf(d), null), "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        }
    }

    @Override // defpackage.md2
    public final void J(m39 m39Var, int i) {
        m39Var.getClass();
        int iOrdinal = this.N.ordinal();
        a81 a81Var = this.L;
        boolean z = true;
        if (iOrdinal == 1) {
            if (!a81Var.b) {
                a81Var.g(',');
            }
            a81Var.e();
            return;
        }
        if (iOrdinal == 2) {
            if (a81Var.b) {
                this.R = true;
                a81Var.e();
                return;
            }
            if (i % 2 == 0) {
                a81Var.g(',');
                a81Var.e();
            } else {
                a81Var.g(':');
                a81Var.l();
                z = false;
            }
            this.R = z;
            return;
        }
        if (iOrdinal == 3) {
            if (i == 0) {
                this.R = true;
            }
            if (i == 1) {
                a81Var.g(',');
                a81Var.l();
                this.R = false;
                return;
            }
            return;
        }
        if (!a81Var.b) {
            a81Var.g(',');
        }
        a81Var.e();
        ue5 ue5Var = this.M;
        ue5Var.getClass();
        bg5.d(ue5Var, m39Var);
        Y(m39Var.g(i));
        a81Var.g(':');
        a81Var.l();
    }

    @Override // defpackage.md2
    public final void K(m39 m39Var, int i) {
        m39Var.getClass();
        Y(m39Var.g(i));
    }

    @Override // defpackage.md2
    public final void L(float f) {
        if (this.R) {
            Y(String.valueOf(f));
        } else {
            ((qb5) this.L.c).f(String.valueOf(f));
        }
        if (!this.Q.i && Math.abs(f) > Float.MAX_VALUE) {
            throw new rf5(ny1.R(Float.valueOf(f), null), "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        }
    }

    @Override // defpackage.md2
    public final md2 N(m39 m39Var) {
        m39Var.getClass();
        boolean zA = pt9.a(m39Var);
        g3c g3cVar = this.N;
        ue5 ue5Var = this.M;
        a81 xl1Var = this.L;
        if (zA) {
            if (!(xl1Var instanceof yl1)) {
                xl1Var = new yl1((qb5) xl1Var.c, this.R);
            }
            return new ot9(xl1Var, ue5Var, g3cVar, null);
        }
        if (m39Var.isInline() && m39Var.equals(nf5.a)) {
            if (!(xl1Var instanceof xl1)) {
                xl1Var = new xl1((qb5) xl1Var.c, this.R);
            }
            return new ot9(xl1Var, ue5Var, g3cVar, null);
        }
        if (this.S != null) {
            this.T = m39Var.a();
        }
        return this;
    }

    @Override // defpackage.md2
    public final void P(int i) {
        if (this.R) {
            Y(String.valueOf(i));
        } else {
            this.L.h(i);
        }
    }

    @Override // defpackage.md2
    public final void R(long j) {
        if (this.R) {
            Y(String.valueOf(j));
        } else {
            this.L.i(j);
        }
    }

    @Override // defpackage.md2
    public final void T() {
        a81 a81Var = this.L;
        a81Var.getClass();
        ((qb5) a81Var.c).f("null");
    }

    @Override // defpackage.md2
    public final void U(m39 m39Var, int i, oi5 oi5Var, Object obj) {
        m39Var.getClass();
        oi5Var.getClass();
        if (obj != null || this.Q.e) {
            super.U(m39Var, i, oi5Var, obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    @Override // defpackage.md2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W(defpackage.oi5 r5, java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ot9.W(oi5, java.lang.Object):void");
    }

    @Override // defpackage.md2
    public final void X(short s) {
        if (this.R) {
            Y(String.valueOf((int) s));
        } else {
            this.L.j(s);
        }
    }

    @Override // defpackage.md2
    public final void Y(String str) {
        str.getClass();
        this.L.k(str);
    }

    @Override // defpackage.md2
    public final void a0(m39 m39Var) {
        m39Var.getClass();
        a81 a81Var = this.L;
        a81Var.getClass();
        a81Var.b = false;
        a81Var.g(this.N.b);
    }

    @Override // defpackage.md2
    public final q32 h0() {
        return this.P;
    }

    @Override // defpackage.md2
    public final boolean r0(m39 m39Var) {
        m39Var.getClass();
        return this.Q.a;
    }

    @Override // defpackage.md2
    public final md2 v(m39 m39Var) {
        ot9 ot9Var;
        m39Var.getClass();
        ue5 ue5Var = this.M;
        g3c g3cVarS = wm9.s(ue5Var, m39Var);
        char c = g3cVarS.a;
        a81 a81Var = this.L;
        a81Var.g(c);
        a81Var.b = true;
        String str = this.S;
        if (str != null) {
            String strA = this.T;
            if (strA == null) {
                strA = m39Var.a();
            }
            a81Var.e();
            a81Var.k(str);
            a81Var.g(':');
            Y(strA);
            this.S = null;
            this.T = null;
        }
        if (this.N == g3cVarS) {
            return this;
        }
        ot9[] ot9VarArr = this.O;
        return (ot9VarArr == null || (ot9Var = ot9VarArr[g3cVarS.ordinal()]) == null) ? new ot9(a81Var, ue5Var, g3cVarS, ot9VarArr) : ot9Var;
    }
}
