package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class h51 implements zb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h51(int i, Object obj, int i2) {
        this.a = i2;
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        lu6 lu6Var = lu6.a;
        jt1 jt1Var = null;
        heb hebVar = heb.a;
        int i2 = this.b;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                dd4 dd4Var = (dd4) obj2;
                ((Integer) obj3).getClass();
                ((co) obj).getClass();
                yb0.b(jf0.G(-1531886357, new i51(i2, z ? 1 : 0), dd4Var), null, jf0.G(2099088621, new oa3(i, (ib4) obj4), dd4Var), dd4Var, 390);
                break;
            case 1:
                rj1 rj1Var = (rj1) obj4;
                dr5 dr5Var = (dr5) obj;
                dd4 dd4Var2 = (dd4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= dd4Var2.f(dr5Var) ? 4 : 2;
                }
                if (!dd4Var2.V(iIntValue & 1, (iIntValue & 19) != 18)) {
                    dd4Var2.Y();
                } else {
                    rj1Var.g(dr5Var, Integer.valueOf(i2), dd4Var2, Integer.valueOf(iIntValue & 14));
                }
                break;
            case 2:
                List list = (List) obj;
                dd4 dd4Var3 = (dd4) obj2;
                ((Integer) obj3).getClass();
                list.getClass();
                z8a z8aVar = (z8a) list.get(i2);
                float f = ((x13) ((hk9) obj4).get(i2)).a;
                p9b p9bVar = qx8.a;
                z8aVar.getClass();
                ou6 ou6VarX = s32.X(lu6Var, new h63(f, i, z8aVar));
                ha6 ha6VarD = pn0.d(bv4.b, false);
                int iHashCode = Long.hashCode(dd4Var3.T);
                lr7 lr7VarL = dd4Var3.l();
                ou6 ou6VarL0 = s32.L0(dd4Var3, ou6VarX);
                ml1.k.getClass();
                um1 um1Var = ll1.b;
                dd4Var3.j0();
                if (dd4Var3.S) {
                    dd4Var3.k(um1Var);
                } else {
                    dd4Var3.s0();
                }
                un9.s(ll1.f, dd4Var3, ha6VarD);
                un9.s(ll1.e, dd4Var3, lr7VarL);
                un9.s(ll1.g, dd4Var3, Integer.valueOf(iHashCode));
                un9.r(dd4Var3, ll1.h);
                un9.s(ll1.d, dd4Var3, ou6VarL0);
                ur9 ur9Var = s96.a;
                pn0.a(fw.G(tg9.h(tg9.f(lu6Var, 1.0f), 30.0f), 1.0f, dd1.g(((q96) dd4Var3.j(ur9Var)).a, 4.0f), uw1.d(((q96) dd4Var3.j(ur9Var)).c.b, (ax1) null, (ax1) null, new y13(0.0f), new y13(0.0f), 3)), dd4Var3, 0);
                pn0.a(fe.L(tg9.h(gjb.p0(tg9.f(lu6Var, 1.0f), 1.0f, 29.0f, 1.0f, 0.0f, 8), 2.0f), dd1.g(((q96) dd4Var3.j(ur9Var)).a, 1.0f), jf0.G), dd4Var3, 0);
                dd4Var3.q(true);
                break;
            default:
                q87 q87Var = (q87) obj4;
                dd4 dd4Var4 = (dd4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((dr5) obj).getClass();
                if (!dd4Var4.V(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    dd4Var4.Y();
                } else {
                    w16 w16Var = q87Var.a;
                    boolean zH = dd4Var4.h(q87Var);
                    Object objQ = dd4Var4.Q();
                    fu6 fu6Var = vl1.a;
                    Object obj5 = objQ;
                    if (zH || objQ == fu6Var) {
                        mt4 mt4Var = new mt4(q87Var, jt1Var, 17);
                        dd4Var4.p0(mt4Var);
                        obj5 = mt4Var;
                    }
                    yb4 yb4Var = (yb4) obj5;
                    Object objQ2 = dd4Var4.Q();
                    Object obj6 = objQ2;
                    if (objQ2 == fu6Var) {
                        cn7 cn7VarX = dk9.x("");
                        dd4Var4.p0(cn7VarX);
                        obj6 = cn7VarX;
                    }
                    a07 a07Var = (a07) obj6;
                    boolean zH2 = dd4Var4.h(yb4Var);
                    Object objQ3 = dd4Var4.Q();
                    Object obj7 = objQ3;
                    if (zH2 || objQ3 == fu6Var) {
                        fk9 fk9Var = new fk9(yb4Var, a07Var, (jt1) null, 1);
                        dd4Var4.p0(fk9Var);
                        obj7 = fk9Var;
                    }
                    lc5.u((yb4) obj7, dd4Var4, w16Var);
                    String str = (String) a07Var.getValue();
                    ur9 ur9Var2 = s96.a;
                    nha.c(str, gjb.p0(tg9.f(lu6Var, 1.0f), 0.0f, i2 != 0 ? 8.0f : 0.0f, 0.0f, 6.0f, 5), ((q96) dd4Var4.j(ur9Var2)).a.a, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var4.j(ur9Var2)).b.g, dd4Var4, 0, 0, 131064);
                }
                break;
        }
        return hebVar;
    }

    public /* synthetic */ h51(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }
}
