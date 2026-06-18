package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class t8 implements yb4 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ t8(yb4 yb4Var, rj1 rj1Var, long j, long j2, rj1 rj1Var2) {
        this.d = yb4Var;
        this.e = rj1Var;
        this.b = j;
        this.c = j2;
        this.f = rj1Var2;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        yb4 yb4Var;
        ib4 ib4Var;
        heb hebVar;
        yb4 yb4Var2;
        rj1 rj1Var;
        jm jmVar;
        kd kdVar;
        int i = this.a;
        heb hebVar2 = heb.a;
        Object obj3 = this.e;
        Object obj4 = this.f;
        Object obj5 = this.d;
        switch (i) {
            case 0:
                yb4 yb4Var3 = (yb4) obj5;
                rj1 rj1Var2 = (rj1) obj3;
                rj1 rj1Var3 = (rj1) obj4;
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    ou6 ou6VarK0 = gjb.k0(lu6.a, z8.a);
                    vf0 vf0Var = bv4.z;
                    jv jvVar = pv.c;
                    ie1 ie1VarA = ge1.a(jvVar, vf0Var, dd4Var, 0);
                    int iHashCode = Long.hashCode(dd4Var.T);
                    lr7 lr7VarL = dd4Var.l();
                    ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarK0);
                    ml1.k.getClass();
                    ib4 ib4Var2 = ll1.b;
                    dd4Var.j0();
                    if (dd4Var.S) {
                        dd4Var.k(ib4Var2);
                    } else {
                        dd4Var.s0();
                    }
                    yb4 yb4Var4 = ll1.f;
                    un9.s(yb4Var4, dd4Var, ie1VarA);
                    yb4 yb4Var5 = ll1.e;
                    un9.s(yb4Var5, dd4Var, lr7VarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    jm jmVar2 = ll1.g;
                    un9.s(jmVar2, dd4Var, numValueOf);
                    kd kdVar2 = ll1.h;
                    un9.r(dd4Var, kdVar2);
                    jm jmVar3 = ll1.d;
                    un9.s(jmVar3, dd4Var, ou6VarL0);
                    if (yb4Var3 == null) {
                        dd4Var.f0(-1979464233);
                        dd4Var.q(false);
                        hebVar = hebVar2;
                        rj1Var = rj1Var3;
                        yb4Var2 = yb4Var5;
                        kdVar = kdVar2;
                        jmVar = jmVar2;
                        ib4Var = ib4Var2;
                        yb4Var = yb4Var4;
                    } else {
                        dd4Var.f0(-1979464232);
                        uka ukaVar = ((q96) dd4Var.j(s96.a)).b.g;
                        rj1 rj1VarG = jf0.G(169494680, new v8(yb4Var3, 0, (byte) 0), dd4Var);
                        yb4Var = yb4Var4;
                        ib4Var = ib4Var2;
                        hebVar = hebVar2;
                        yb4Var2 = yb4Var5;
                        rj1Var = rj1Var3;
                        jmVar = jmVar2;
                        kdVar = kdVar2;
                        z8.e(this.b, ukaVar, rj1VarG, dd4Var, 384);
                        dd4Var.q(false);
                    }
                    dd4Var.f0(-1978911719);
                    if (1.0f <= 0.0d) {
                        o75.a("invalid weight; must be greater than zero");
                    }
                    bp5 bp5Var = new bp5(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false);
                    ie1 ie1VarA2 = ge1.a(jvVar, vf0Var, dd4Var, 0);
                    int iHashCode2 = Long.hashCode(dd4Var.T);
                    lr7 lr7VarL2 = dd4Var.l();
                    ou6 ou6VarL02 = s32.L0(dd4Var, bp5Var);
                    dd4Var.j0();
                    if (dd4Var.S) {
                        dd4Var.k(ib4Var);
                    } else {
                        dd4Var.s0();
                    }
                    un9.s(yb4Var, dd4Var, ie1VarA2);
                    un9.s(yb4Var2, dd4Var, lr7VarL2);
                    ky0.v(iHashCode2, dd4Var, jmVar, dd4Var, kdVar);
                    un9.s(jmVar3, dd4Var, ou6VarL02);
                    rj1Var2.invoke(dd4Var, 0);
                    dd4Var.q(true);
                    dd4Var.q(false);
                    xo4 xo4Var = new xo4(bv4.B);
                    ha6 ha6VarD = pn0.d(bv4.b, false);
                    int iHashCode3 = Long.hashCode(dd4Var.T);
                    lr7 lr7VarL3 = dd4Var.l();
                    ou6 ou6VarL03 = s32.L0(dd4Var, xo4Var);
                    dd4Var.j0();
                    if (dd4Var.S) {
                        dd4Var.k(ib4Var);
                    } else {
                        dd4Var.s0();
                    }
                    un9.s(yb4Var, dd4Var, ha6VarD);
                    un9.s(yb4Var2, dd4Var, lr7VarL3);
                    ky0.v(iHashCode3, dd4Var, jmVar, dd4Var, kdVar);
                    un9.s(jmVar3, dd4Var, ou6VarL03);
                    z8.e(this.c, ((q96) dd4Var.j(s96.a)).b.m, rj1Var, dd4Var, 0);
                    dd4Var.q(true);
                    dd4Var.q(true);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                sdc.g((ou6) obj5, this.b, this.c, (t89) obj3, (List) obj4, (dd4) obj, qu1.x0(7));
                break;
            default:
                ((Integer) obj2).getClass();
                d47.a((ou6) obj5, this.b, this.c, (hyb) obj4, (rj1) obj3, (dd4) obj, qu1.x0(196657));
                break;
        }
        return hebVar2;
    }

    public /* synthetic */ t8(ou6 ou6Var, long j, long j2, t89 t89Var, List list, int i) {
        this.d = ou6Var;
        this.b = j;
        this.c = j2;
        this.e = t89Var;
        this.f = list;
    }

    public /* synthetic */ t8(ou6 ou6Var, long j, long j2, hyb hybVar, rj1 rj1Var, int i) {
        this.d = ou6Var;
        this.b = j;
        this.c = j2;
        this.f = hybVar;
        this.e = rj1Var;
    }
}
