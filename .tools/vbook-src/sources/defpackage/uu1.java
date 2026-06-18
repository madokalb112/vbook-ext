package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class uu1 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ uu1(p35 p35Var, boolean z, ib4 ib4Var, int i, int i2) {
        this.a = 8;
        this.d = p35Var;
        this.b = z;
        this.e = ib4Var;
        this.c = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v8 */
    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        heb hebVar;
        f9 f9Var;
        ou6 ou6Var;
        zn0 zn0Var;
        Object obj3;
        boolean z;
        long j;
        ou6 ou6Var2;
        long j2;
        int i = this.a;
        int i2 = this.c;
        boolean z2 = this.b;
        heb hebVar2 = heb.a;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ev1.c(z2, (h12) obj5, (ou6) obj4, (dd4) obj, qu1.x0(i2 | 1));
                return hebVar2;
            case 1:
                kb4 kb4Var = (kb4) obj5;
                List list = (List) obj4;
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                f9 f9Var2 = bv4.f;
                f9 f9Var3 = bv4.b;
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                    return hebVar2;
                }
                ou6 ou6Var3 = lu6.a;
                zn0 zn0Var2 = zn0.a;
                Object obj6 = vl1.a;
                if (z2) {
                    dd4Var.f0(887570163);
                    boolean z3 = i2 == 0;
                    ou6 ou6VarW = t96.w(tg9.h(ou6Var3, 40.0f), tp8.a);
                    uo8 uo8Var = new uo8(4);
                    boolean zF = dd4Var.f(kb4Var);
                    Object objQ = dd4Var.Q();
                    if (zF || objQ == obj6) {
                        objQ = new b41(4, kb4Var);
                        dd4Var.p0(objQ);
                    }
                    ou6 ou6VarL0 = gjb.l0(t96.P(ou6VarW, z3, uo8Var, (ib4) objQ), 12.0f);
                    ha6 ha6VarD = pn0.d(f9Var3, false);
                    int iHashCode = Long.hashCode(dd4Var.T);
                    lr7 lr7VarL = dd4Var.l();
                    ou6 ou6VarL02 = s32.L0(dd4Var, ou6VarL0);
                    ml1.k.getClass();
                    um1 um1Var = ll1.b;
                    dd4Var.j0();
                    if (dd4Var.S) {
                        dd4Var.k(um1Var);
                    } else {
                        dd4Var.s0();
                    }
                    un9.s(ll1.f, dd4Var, ha6VarD);
                    un9.s(ll1.e, dd4Var, lr7VarL);
                    un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode));
                    un9.r(dd4Var, ll1.h);
                    un9.s(ll1.d, dd4Var, ou6VarL02);
                    p35 p35VarC = i25.c((m53) a53.t.getValue(), dd4Var, 0);
                    f9Var2 = f9Var2;
                    ou6 ou6VarA = zn0Var2.a(ou6Var3, f9Var2);
                    if (z3) {
                        dd4Var.f0(-1444519950);
                        hebVar = hebVar2;
                        ou6Var2 = ou6VarA;
                        j2 = ((q96) dd4Var.j(s96.a)).a.a;
                        dd4Var.q(false);
                    } else {
                        hebVar = hebVar2;
                        ou6Var2 = ou6VarA;
                        dd4Var.f0(-1444433584);
                        j2 = ((q96) dd4Var.j(s96.a)).a.q;
                        dd4Var.q(false);
                    }
                    obj3 = obj6;
                    zn0Var = zn0Var2;
                    long j3 = j2;
                    f9Var = f9Var3;
                    ou6Var = ou6Var3;
                    z = false;
                    mx4.a(p35VarC, (String) null, ou6Var2, j3, dd4Var, 48, 0);
                    dd4Var.q(true);
                    dd4Var.q(false);
                } else {
                    hebVar = hebVar2;
                    f9Var = f9Var3;
                    ou6Var = ou6Var3;
                    zn0Var = zn0Var2;
                    obj3 = obj6;
                    z = false;
                    dd4Var.f0(888478308);
                    dd4Var.q(false);
                }
                ?? r10 = z;
                for (Object obj7 : list) {
                    int i3 = r10 + 1;
                    if (r10 < 0) {
                        gc1.i0();
                        throw null;
                    }
                    nz0 nz0Var = (nz0) obj7;
                    boolean z4 = (!z2 ? r10 == i2 : r10 == i2 + (-1)) ? z : true;
                    ou6 ou6VarW2 = t96.w(tg9.j(ou6Var, 40.0f, 0.0f, 2), tp8.a);
                    uo8 uo8Var2 = new uo8(4);
                    boolean zF2 = dd4Var.f(kb4Var) | dd4Var.g(z2) | dd4Var.d((int) r10);
                    Object objQ2 = dd4Var.Q();
                    Object obj8 = obj3;
                    if (zF2 || objQ2 == obj8) {
                        objQ2 = new cu2(r10, kb4Var, z2);
                        dd4Var.p0(objQ2);
                    }
                    ou6 ou6VarN0 = gjb.n0(t96.P(ou6VarW2, z4, uo8Var2, (ib4) objQ2), 16.0f, 0.0f, 2);
                    ha6 ha6VarD2 = pn0.d(f9Var, false);
                    int iHashCode2 = Long.hashCode(dd4Var.T);
                    lr7 lr7VarL2 = dd4Var.l();
                    ou6 ou6VarL03 = s32.L0(dd4Var, ou6VarN0);
                    ml1.k.getClass();
                    um1 um1Var2 = ll1.b;
                    dd4Var.j0();
                    int i4 = i2;
                    if (dd4Var.S) {
                        dd4Var.k(um1Var2);
                    } else {
                        dd4Var.s0();
                    }
                    un9.s(ll1.f, dd4Var, ha6VarD2);
                    un9.s(ll1.e, dd4Var, lr7VarL2);
                    un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode2));
                    un9.r(dd4Var, ll1.h);
                    un9.s(ll1.d, dd4Var, ou6VarL03);
                    String str = nz0Var.a;
                    if (z4) {
                        dd4Var.f0(107259972);
                        j = ((q96) dd4Var.j(s96.a)).a.a;
                        z = false;
                    } else {
                        z = false;
                        dd4Var.f0(107261222);
                        j = ((q96) dd4Var.j(s96.a)).a.q;
                    }
                    dd4Var.q(z);
                    dd4 dd4Var2 = dd4Var;
                    nha.c(str, zn0Var.a(ou6Var, f9Var2), j, (g60) null, 0L, (t74) null, a84.u, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 1, 0, (kb4) null, ((q96) dd4Var.j(s96.a)).b.i, dd4Var2, 1572864, 24576, 114616);
                    dd4Var = dd4Var2;
                    dd4Var.q(true);
                    obj3 = obj8;
                    i2 = i4;
                    r10 = i3;
                }
                return hebVar;
            case 2:
                ((Integer) obj2).intValue();
                m79.k(z2, (kb4) obj5, (ib4) obj4, (dd4) obj, qu1.x0(i2 | 1));
                return hebVar2;
            case 3:
                ((Integer) obj2).intValue();
                fx1.i(z2, (kb4) obj5, (kb4) obj4, (dd4) obj, qu1.x0(i2 | 1));
                return hebVar2;
            case 4:
                ((Integer) obj2).getClass();
                qu1.m((List) obj5, z2, (ou6) obj4, (dd4) obj, qu1.x0(i2 | 1));
                return hebVar2;
            case 5:
                ((Integer) obj2).intValue();
                sp6.g(z2, (String) obj5, (kb4) obj4, (dd4) obj, qu1.x0(i2 | 1));
                return hebVar2;
            case 6:
                ((Integer) obj2).getClass();
                yib.c(z2, (eq9) obj5, (ou6) obj4, (dd4) obj, qu1.x0(i2 | 1));
                return hebVar2;
            case 7:
                ((Integer) obj2).getClass();
                hn9.g(z2, (cl8) obj5, (kga) obj4, (dd4) obj, qu1.x0(i2 | 1));
                return hebVar2;
            default:
                ((Integer) obj2).getClass();
                gjb.x((p35) obj5, this.b, (ib4) obj4, (dd4) obj, qu1.x0(1), this.c);
                return hebVar2;
        }
    }

    public /* synthetic */ uu1(int i, kb4 kb4Var, List list, boolean z) {
        this.a = 1;
        this.b = z;
        this.c = i;
        this.d = kb4Var;
        this.e = list;
    }

    public /* synthetic */ uu1(List list, boolean z, ou6 ou6Var, int i) {
        this.a = 4;
        this.d = list;
        this.b = z;
        this.e = ou6Var;
        this.c = i;
    }

    public /* synthetic */ uu1(boolean z, Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.d = obj;
        this.e = obj2;
        this.c = i;
    }
}
