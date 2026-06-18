package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class br0 implements evb {
    public Object a = kr0.p;
    public ay0 b;
    public final /* synthetic */ ir0 c;

    public br0(ir0 ir0Var) {
        this.c = ir0Var;
    }

    public final Object a(kt1 kt1Var) throws Throwable {
        z11 z11VarT;
        Boolean bool;
        Object obj = this.a;
        boolean z = true;
        if (obj == kr0.p || obj == kr0.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ir0.u;
            ir0 ir0Var = this.c;
            z11 z11Var = (z11) atomicReferenceFieldUpdater.get(ir0Var);
            while (true) {
                if (ir0Var.E()) {
                    this.a = kr0.l;
                    Throwable thV = ir0Var.v();
                    if (thV != null) {
                        int i = sp9.a;
                        throw thV;
                    }
                    z = false;
                } else {
                    long andIncrement = ir0.e.getAndIncrement(ir0Var);
                    long j = kr0.b;
                    long j2 = andIncrement / j;
                    int i2 = (int) (andIncrement % j);
                    if (z11Var.e != j2) {
                        z11VarT = ir0Var.t(j2, z11Var);
                        if (z11VarT == null) {
                            continue;
                        }
                    } else {
                        z11VarT = z11Var;
                    }
                    Object objT = ir0Var.T(z11VarT, i2, andIncrement, null);
                    zy2 zy2Var = kr0.m;
                    qz0 qz0Var = null;
                    if (objT == zy2Var) {
                        gp.j("unreachable");
                        return null;
                    }
                    zy2 zy2Var2 = kr0.o;
                    if (objT == zy2Var2) {
                        if (andIncrement < ir0Var.y()) {
                            z11VarT.b();
                        }
                        z11Var = z11VarT;
                    } else {
                        if (objT == kr0.n) {
                            ir0 ir0Var2 = this.c;
                            ay0 ay0VarE = ah1.E(bx1.J(kt1Var));
                            try {
                                this.b = ay0VarE;
                                Object objT2 = ir0Var2.T(z11VarT, i2, andIncrement, this);
                                kb4 kb4Var = ir0Var2.b;
                                if (objT2 == zy2Var) {
                                    b(z11VarT, i2);
                                } else {
                                    if (objT2 == zy2Var2) {
                                        if (andIncrement < ir0Var2.y()) {
                                            z11VarT.b();
                                        }
                                        z11 z11Var2 = (z11) ir0.u.get(ir0Var2);
                                        while (true) {
                                            if (ir0Var2.E()) {
                                                ay0 ay0Var = this.b;
                                                ay0Var.getClass();
                                                this.b = null;
                                                this.a = kr0.l;
                                                Throwable thV2 = ir0Var.v();
                                                if (thV2 == null) {
                                                    ay0Var.resumeWith(Boolean.FALSE);
                                                } else {
                                                    ay0Var.resumeWith(new pm8(thV2));
                                                }
                                            } else {
                                                long andIncrement2 = ir0.e.getAndIncrement(ir0Var2);
                                                long j3 = kr0.b;
                                                long j4 = andIncrement2 / j3;
                                                int i3 = (int) (andIncrement2 % j3);
                                                if (z11Var2.e != j4) {
                                                    z11 z11VarT2 = ir0Var2.t(j4, z11Var2);
                                                    if (z11VarT2 != null) {
                                                        z11Var2 = z11VarT2;
                                                    }
                                                }
                                                Object objT3 = ir0Var2.T(z11Var2, i3, andIncrement2, this);
                                                if (objT3 == kr0.m) {
                                                    b(z11Var2, i3);
                                                    break;
                                                }
                                                if (objT3 == kr0.o) {
                                                    if (andIncrement2 < ir0Var2.y()) {
                                                        z11Var2.b();
                                                    }
                                                } else {
                                                    if (objT3 == kr0.n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    z11Var2.b();
                                                    this.a = objT3;
                                                    this.b = null;
                                                    bool = Boolean.TRUE;
                                                    if (kb4Var != null) {
                                                        qz0Var = new qz0(4, kb4Var, objT3);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        z11VarT.b();
                                        this.a = objT2;
                                        this.b = null;
                                        bool = Boolean.TRUE;
                                        if (kb4Var != null) {
                                            qz0Var = new qz0(4, kb4Var, objT2);
                                        }
                                    }
                                    ay0VarE.i(bool, qz0Var);
                                }
                                return ay0VarE.s();
                            } catch (Throwable th) {
                                ay0VarE.B();
                                throw th;
                            }
                        }
                        z11VarT.b();
                        this.a = objT;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.evb
    public final void b(pz8 pz8Var, int i) {
        ay0 ay0Var = this.b;
        if (ay0Var != null) {
            ay0Var.b(pz8Var, i);
        }
    }

    public final Object c() throws Throwable {
        Object obj = this.a;
        zy2 zy2Var = kr0.p;
        if (obj == zy2Var) {
            gp.j("`hasNext()` has not been invoked");
            return null;
        }
        this.a = zy2Var;
        if (obj != kr0.l) {
            return obj;
        }
        Throwable thW = this.c.w();
        int i = sp9.a;
        throw thW;
    }
}
