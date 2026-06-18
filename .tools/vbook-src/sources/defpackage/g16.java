package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class g16 implements yb4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object s;

    public /* synthetic */ g16(ou6 ou6Var, long j, long j2, t89 t89Var, List list, int i) {
        this.e = ou6Var;
        this.c = j;
        this.d = j2;
        this.f = t89Var;
        this.s = list;
        this.b = i;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        Object obj3 = this.s;
        int i2 = this.b;
        Object obj4 = this.f;
        Object obj5 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                sdc.z((ou6) obj5, this.c, this.d, (t89) obj4, (List) obj3, (dd4) obj, qu1.x0(i2 | 1));
                break;
            default:
                ww8 ww8Var = (ww8) obj5;
                ww8 ww8Var2 = (ww8) obj4;
                x83 x83Var = (x83) obj3;
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    lu6 lu6Var = lu6.a;
                    ou6 ou6VarN0 = gjb.n0(kc5.A(kc5.Q(lu6Var, ww8Var, 12), ww8Var2, 12), 4.0f, 0.0f, 2);
                    ha6 ha6VarD = pn0.d(bv4.b, false);
                    int iHashCode = Long.hashCode(dd4Var.T);
                    lr7 lr7VarL = dd4Var.l();
                    ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarN0);
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
                    un9.s(ll1.d, dd4Var, ou6VarL0);
                    ha5 ha5Var = new ha5(1, i2, 1);
                    Object objQ = dd4Var.Q();
                    if (objQ == vl1.a) {
                        objQ = new ss6(11);
                        dd4Var.p0(objQ);
                    }
                    nha.c(fc1.D0(ha5Var, "\n", null, null, (kb4) objQ, 30), tg9.f(lu6Var, 1.0f), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, Integer.MAX_VALUE, 0, (kb4) null, new uka(ah1.l(x83Var.g), this.c, (a84) null, (u74) null, c64.c, 0L, 0L, 6, this.d, (dha) null, (iy5) null, 16613340), dd4Var, 48, 27648, 106492);
                    dd4Var.q(true);
                }
                break;
        }
        return hebVar;
    }

    public /* synthetic */ g16(ww8 ww8Var, ww8 ww8Var2, int i, x83 x83Var, long j, long j2) {
        this.e = ww8Var;
        this.f = ww8Var2;
        this.b = i;
        this.s = x83Var;
        this.c = j;
        this.d = j2;
    }
}
