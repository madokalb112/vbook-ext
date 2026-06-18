package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class j0 extends rl5 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(Object obj, int i) {
        super(2);
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        heb hebVar;
        long jH;
        long jF;
        int i;
        boolean zB;
        jt1 jt1Var;
        int i2 = this.a;
        lu6 lu6Var = lu6.a;
        heb hebVar2 = heb.a;
        Object obj3 = this.b;
        switch (i2) {
            case 0:
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ((k0) obj3).a(dd4Var, 0);
                } else {
                    dd4Var.Y();
                }
                break;
            case 1:
                ((me) obj3).i(((Number) obj).intValue(), (d29) obj2);
                break;
            case 2:
                dd4 dd4Var2 = (dd4) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Object objQ = dd4Var2.Q();
                    if (objQ == vl1.a) {
                        objQ = kd.f;
                        dd4Var2.p0(objQ);
                    }
                    lc5.N(a29.c(lu6Var, false, (kb4) objQ), (yb4) ((a07) obj3).getValue(), dd4Var2, 0);
                } else {
                    dd4Var2.Y();
                }
                break;
            case 3:
                pd3 pd3Var = (pd3) obj;
                pd3 pd3Var2 = (pd3) obj2;
                pd3 pd3Var3 = pd3.c;
                break;
            case 4:
                ((Number) obj2).intValue();
                ((nl1) obj3).a((dd4) obj, qu1.x0(1));
                break;
            case 5:
                ou6 ou6Var = (ou6) obj;
                ou6 ou6VarK0 = (mu6) obj2;
                dd4 dd4Var3 = (dd4) obj3;
                if (ou6VarK0 instanceof ul1) {
                    zb4 zb4Var = ((ul1) ou6VarK0).b;
                    fw.F(3, zb4Var);
                    ou6VarK0 = s32.K0(dd4Var3, (ou6) zb4Var.c(lu6Var, dd4Var3, 0));
                }
                break;
            case 6:
                ((Number) obj2).intValue();
                ((wr2) obj3).a((dd4) obj, qu1.x0(1));
                break;
            case 7:
                dd4 dd4Var4 = (dd4) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (dd4Var4.V(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    List list = (List) obj3;
                    int size = list.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        yb4 yb4Var = (yb4) list.get(i3);
                        int iHashCode = Long.hashCode(dd4Var4.T);
                        ml1.k.getClass();
                        ge geVar = ll1.c;
                        dd4Var4.j0();
                        if (dd4Var4.S) {
                            dd4Var4.k(geVar);
                        } else {
                            dd4Var4.s0();
                        }
                        un9.s(ll1.g, dd4Var4, Integer.valueOf(iHashCode));
                        yb4Var.invoke(dd4Var4, 0);
                        dd4Var4.q(true);
                    }
                } else {
                    dd4Var4.Y();
                }
                break;
            case 8:
                ((Number) obj2).intValue();
                ((fz7) obj3).a((dd4) obj, qu1.x0(1));
                break;
            case 9:
                ux7 ux7Var = (ux7) obj;
                long j = ((eb7) obj2).a;
                ux7Var.getClass();
                ux7Var.a();
                gj8 gj8Var = ((xi8) obj3).a;
                t07 t07Var = gj8Var.j;
                by8 by8Var = gj8Var.f;
                hp5 hp5Var = gj8Var.a;
                cn7 cn7Var = gj8Var.m;
                cn7Var.setValue(new eb7(eb7.h(((eb7) cn7Var.getValue()).a, j)));
                fp5 fp5VarD = gj8Var.d();
                if (fp5VarD == null) {
                    hebVar = hebVar2;
                } else {
                    long jH2 = gj8Var.h(gj8Var.e());
                    gj8Var.i(jH2);
                    long jB = fp5VarD.b();
                    long jH3 = eb7.h(qu1.j((int) (jB >> 32), (int) (jB & 4294967295L)), jH2);
                    long jL0 = sw1.l0(fp5VarD.a());
                    long j2 = qu1.j(fg9.d(jL0) + eb7.e(jH3), fg9.b(jL0) + eb7.f(jH3));
                    aw8 aw8VarO = hp5Var.c().o(gj8Var.e);
                    float f = aw8VarO.a;
                    float f2 = aw8VarO.b;
                    boolean z = hp5Var.c().f() || (gj8Var.h == zm5.b && gj8Var.f() == lh7.b);
                    if (!z) {
                        hebVar = hebVar2;
                        if (z) {
                            mn5.g();
                        } else {
                            jH = eb7.h(jH3, gj8Var.q);
                        }
                    } else {
                        hebVar = hebVar2;
                        jH = eb7.g(j2, gj8Var.q);
                    }
                    lh7 lh7VarF = gj8Var.f();
                    int iV = hp5Var.c().v();
                    lh7VarF.getClass();
                    int iOrdinal = lh7VarF.ordinal();
                    if (iOrdinal == 0) {
                        jF = y86.f(0, iV);
                    } else if (iOrdinal != 1) {
                        mn5.g();
                    } else {
                        jF = y86.f(iV, 0);
                    }
                    long jH4 = eb7.h(jH, qu1.j((int) (jF >> 32), (int) (jF & 4294967295L)));
                    float fQ = uj9.q(jH4, gj8Var.f()) - f;
                    if (fQ < 0.0f) {
                        fQ = 0.0f;
                    }
                    float fQ2 = f2 - uj9.q(jH4, gj8Var.f());
                    if (fQ2 < 0.0f) {
                        fQ2 = 0.0f;
                    }
                    float f3 = gj8Var.d;
                    float f4 = fQ2;
                    jt1 jt1Var2 = null;
                    if (fQ < f3) {
                        zB = by8Var.b(vx8.a, (1.0f - wx1.P((fQ + f3) / (f3 * 2.0f), 0.0f, 1.0f)) * 10.0f, new zi8(gj8Var, 2), new dj8(gj8Var, jt1Var2, 0));
                        i = 1;
                    } else if (f4 < f3) {
                        i = 1;
                        zB = by8Var.b(vx8.b, (1.0f - wx1.P((f4 + f3) / (f3 * 2.0f), 0.0f, 1.0f)) * 10.0f, new zi8(gj8Var, 3), new dj8(gj8Var, jt1Var2, i));
                    } else {
                        i = 1;
                        ah1.J(by8Var.b, null, null, new zx8(by8Var, jt1Var2, i), 3);
                        zB = false;
                    }
                    if (t07Var.f()) {
                        oq9 oq9Var = by8Var.d;
                        if ((oq9Var == null || oq9Var.isActive() != i) && !zB) {
                            jt1Var = null;
                            fp5 fp5VarC = gj8.c(gj8Var, rw1.u(jH3, j2), hp5Var.c().G(), null, new ej8(fp5VarD, 0), 4);
                            if (fp5VarC != null) {
                                ah1.J(gj8Var.b, null, null, new bj8(gj8Var, fp5VarD, fp5VarC, jt1Var, 1), 3);
                            }
                        } else {
                            jt1Var = null;
                        }
                        t07Var.q(jt1Var);
                    }
                }
                break;
            default:
                ((Number) obj2).intValue();
                tn9.a((mf4) obj3, (dd4) obj, 1);
                break;
        }
        return hebVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(Object obj, int i, int i2) {
        super(2);
        this.a = i2;
        this.b = obj;
    }
}
