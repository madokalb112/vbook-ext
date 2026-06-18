package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class m0 extends pe5 implements jt1, vx1 {
    public final jx1 e;

    public m0(jx1 jx1Var, boolean z) {
        super(z);
        K((yd5) jx1Var.get(s00.s));
        this.e = jx1Var.plus(this);
    }

    @Override // defpackage.pe5
    public final void J(fi1 fi1Var) {
        qx1.y(this.e, fi1Var);
    }

    @Override // defpackage.pe5
    public final void W(Object obj) {
        if (!(obj instanceof ei1)) {
            q0(obj);
            return;
        }
        ei1 ei1Var = (ei1) obj;
        o0(ei1.b.get(ei1Var) == 1, ei1Var.a);
    }

    @Override // defpackage.jt1
    public final jx1 getContext() {
        return this.e;
    }

    @Override // defpackage.vx1
    public final jx1 q() {
        return this.e;
    }

    public final void r0(zx1 zx1Var, m0 m0Var, yb4 yb4Var) {
        Object objInvoke;
        int iOrdinal = zx1Var.ordinal();
        heb hebVar = heb.a;
        if (iOrdinal == 0) {
            try {
                lw2.a(bx1.J(bx1.C(m0Var, this, yb4Var)), hebVar);
                return;
            } catch (Throwable th) {
                vo1.Q(this, th);
                throw null;
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                yb4Var.getClass();
                bx1.J(bx1.C(m0Var, this, yb4Var)).resumeWith(hebVar);
                return;
            }
            if (iOrdinal != 3) {
                mn5.g();
                return;
            }
            try {
                jx1 jx1Var = this.e;
                Object objC = gsa.c(jx1Var, null);
                try {
                    if (yb4Var instanceof vc0) {
                        fw.F(2, yb4Var);
                        objInvoke = yb4Var.invoke(m0Var, this);
                    } else {
                        objInvoke = bx1.Y(yb4Var, m0Var, this);
                    }
                    gsa.a(jx1Var, objC);
                    if (objInvoke != xx1.a) {
                        resumeWith(objInvoke);
                    }
                } catch (Throwable th2) {
                    gsa.a(jx1Var, objC);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                if (th instanceof jw2) {
                    th = ((jw2) th).a;
                }
                resumeWith(e11.I(th));
            }
        }
    }

    @Override // defpackage.jt1
    public final void resumeWith(Object obj) {
        Throwable thA = qm8.a(obj);
        if (thA != null) {
            obj = new ei1(false, thA);
        }
        Object objS = S(obj);
        if (objS == qe5.b) {
            return;
        }
        n(objS);
    }

    @Override // defpackage.pe5
    public final String u() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void q0(Object obj) {
    }

    public void o0(boolean z, Throwable th) {
    }
}
