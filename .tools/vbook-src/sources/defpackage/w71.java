package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class w71 implements yb4 {
    public final /* synthetic */ int a = 4;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    public /* synthetic */ w71(rj1 rj1Var, boolean z, t89 t89Var, ou6 ou6Var, ib4 ib4Var, int i, int i2) {
        this.c = rj1Var;
        this.b = z;
        this.f = t89Var;
        this.s = ou6Var;
        this.t = ib4Var;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.d;
        heb hebVar = heb.a;
        Object obj3 = this.t;
        Object obj4 = this.s;
        Object obj5 = this.f;
        Object obj6 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                fz1.D((rj1) obj6, this.b, (t89) obj5, (ou6) obj4, (ib4) obj3, (dd4) obj, qu1.x0(i2 | 1), this.e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                b73.a((c73) obj5, (i99) obj4, this.b, (kb4) obj3, (rj1) obj6, (dd4) obj, qu1.x0(i2 | 1), this.e);
                break;
            case 2:
                ((Integer) obj2).getClass();
                kf0.m((ib4) obj3, (ou6) obj4, this.b, (kx4) obj6, (yb4) obj5, (dd4) obj, qu1.x0(i2 | 1), this.e);
                break;
            case 3:
                ((Integer) obj2).getClass();
                gjb.e((String) obj6, (List) obj5, this.d, this.b, (ou6) obj4, (kb4) obj3, (dd4) obj, qu1.x0(this.e | 1));
                break;
            default:
                a07 a07Var = (a07) obj6;
                qj5 qj5Var = (qj5) obj5;
                String str = (String) obj4;
                String str2 = (String) obj3;
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    Object objQ = dd4Var.Q();
                    Object obj7 = vl1.a;
                    if (objQ == obj7) {
                        objQ = ky0.f(dd4Var);
                    }
                    z44 z44Var = (z44) objQ;
                    Object objQ2 = dd4Var.Q();
                    if (objQ2 == obj7) {
                        objQ2 = new tb3(z44Var, null, 14);
                        dd4Var.p0(objQ2);
                    }
                    lc5.u((yb4) objQ2, dd4Var, z44Var);
                    lu6 lu6Var = lu6.a;
                    ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
                    ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var, 0);
                    int iHashCode = Long.hashCode(dd4Var.T);
                    lr7 lr7VarL = dd4Var.l();
                    ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarF);
                    ml1.k.getClass();
                    um1 um1Var = ll1.b;
                    dd4Var.j0();
                    if (dd4Var.S) {
                        dd4Var.k(um1Var);
                    } else {
                        dd4Var.s0();
                    }
                    un9.s(ll1.f, dd4Var, ie1VarA);
                    un9.s(ll1.e, dd4Var, lr7VarL);
                    un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode));
                    un9.r(dd4Var, ll1.h);
                    un9.s(ll1.d, dd4Var, ou6VarL0);
                    wga wgaVar = (wga) a07Var.getValue();
                    ur9 ur9Var = s96.a;
                    uw1 uw1Var = ((q96) dd4Var.j(ur9Var)).c.b;
                    ou6 ou6VarB = jv3.B(gjb.n0(tg9.f(lu6Var, 1.0f), 8.0f, 0.0f, 2), z44Var);
                    boolean zF = dd4Var.f(a07Var);
                    Object objQ3 = dd4Var.Q();
                    if (zF || objQ3 == obj7) {
                        objQ3 = new wo6(a07Var, 15);
                        dd4Var.p0(objQ3);
                    }
                    lx1.l(wgaVar, (kb4) objQ3, ou6VarB, false, null, jf0.G(1661022665, new z31(str2, 20), dd4Var), null, null, false, null, qj5Var, null, this.b, this.d, this.e, uw1Var, null, dd4Var, 1572864, 0, 5341112);
                    if (str.length() > 0) {
                        ky0.z(dd4Var, -1433495134, lu6Var, 8.0f, dd4Var);
                        nha.c(str, gjb.n0(lu6Var, 8.0f, 0.0f, 2), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var.j(ur9Var)).b.k, dd4Var, 48, 0, 131068);
                        dd4Var.q(false);
                    } else {
                        dd4Var.f0(-1433221249);
                        dd4Var.q(false);
                    }
                    xv5.z(dd4Var, true, lu6Var, 12.0f, dd4Var);
                }
                break;
        }
        return hebVar;
    }

    public /* synthetic */ w71(c73 c73Var, i99 i99Var, boolean z, kb4 kb4Var, rj1 rj1Var, int i, int i2) {
        this.f = c73Var;
        this.s = i99Var;
        this.b = z;
        this.t = kb4Var;
        this.c = rj1Var;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ w71(ib4 ib4Var, ou6 ou6Var, boolean z, kx4 kx4Var, yb4 yb4Var, int i, int i2) {
        this.t = ib4Var;
        this.s = ou6Var;
        this.b = z;
        this.c = kx4Var;
        this.f = yb4Var;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ w71(a07 a07Var, qj5 qj5Var, boolean z, int i, int i2, String str, String str2) {
        this.c = a07Var;
        this.f = qj5Var;
        this.b = z;
        this.d = i;
        this.e = i2;
        this.s = str;
        this.t = str2;
    }

    public /* synthetic */ w71(String str, List list, int i, boolean z, ou6 ou6Var, kb4 kb4Var, int i2) {
        this.c = str;
        this.f = list;
        this.d = i;
        this.b = z;
        this.s = ou6Var;
        this.t = kb4Var;
        this.e = i2;
    }
}
