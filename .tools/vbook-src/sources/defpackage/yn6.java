package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.mozilla.javascript.ES6Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class yn6 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ yn6(String str, ArrayList arrayList, kb4 kb4Var, ou6 ou6Var, int i) {
        this.a = 7;
        this.c = str;
        this.b = arrayList;
        this.e = kb4Var;
        this.d = ou6Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        long j;
        int i = this.a;
        lu6 lu6Var = lu6.a;
        int i2 = 2;
        boolean z2 = false;
        heb hebVar = heb.a;
        Object obj3 = this.d;
        Object obj4 = this.e;
        Object obj5 = this.b;
        Object obj6 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ny1.h((List) obj5, (String) obj6, (yb4) obj3, (kb4) obj4, (dd4) obj, qu1.x0(1));
                break;
            case 1:
                fia fiaVar = (fia) obj5;
                ib4 ib4Var = (ib4) obj6;
                al7 al7Var = (al7) obj3;
                vx1 vx1Var = (vx1) obj4;
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    dd4Var.f0(1169375071);
                    List list = fiaVar.b;
                    int size = list.size();
                    int i3 = 0;
                    while (true) {
                        Object obj7 = vl1.a;
                        if (i3 >= size) {
                            dd4Var.q(z2);
                            ou6 ou6VarN0 = gjb.n0(t96.w(tg9.h(lu6Var, 40.0f), tp8.a), 16.0f, 0.0f, 2);
                            boolean zF = dd4Var.f(ib4Var);
                            Object objQ = dd4Var.Q();
                            if (zF || objQ == obj7) {
                                objQ = new pm6(25, ib4Var);
                                dd4Var.p0(objQ);
                            }
                            ou6 ou6VarJ = fw.J(null, (ib4) objQ, ou6VarN0, false, 15);
                            ha6 ha6VarD = pn0.d(bv4.b, false);
                            int iHashCode = Long.hashCode(dd4Var.T);
                            lr7 lr7VarL = dd4Var.l();
                            ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarJ);
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
                            mx4.a(i25.c((m53) a53.P.getValue(), dd4Var, 0), (String) null, zn0.a.a(gjb.l0(tg9.h(lu6Var, 40.0f), 10.0f), bv4.f), ((q96) dd4Var.j(s96.a)).a.q, dd4Var, 48, 0);
                            dd4Var.q(true);
                        } else {
                            yha yhaVar = (yha) list.get(i3);
                            boolean z3 = i3 == al7Var.k();
                            ou6 ou6VarW = t96.w(tg9.j(lu6Var, 40.0f, 0.0f, i2), tp8.a);
                            uo8 uo8Var = new uo8(4);
                            boolean zH = dd4Var.h(vx1Var) | dd4Var.f(al7Var) | dd4Var.d(i3);
                            Object objQ2 = dd4Var.Q();
                            if (zH || objQ2 == obj7) {
                                objQ2 = new lj(vx1Var, al7Var, i3, 3);
                                dd4Var.p0(objQ2);
                            }
                            ou6 ou6VarN02 = gjb.n0(t96.P(ou6VarW, z3, uo8Var, (ib4) objQ2), 16.0f, 0.0f, 2);
                            eq8 eq8VarA = dq8.a(pv.a, bv4.w, dd4Var, 0);
                            int iHashCode2 = Long.hashCode(dd4Var.T);
                            lr7 lr7VarL2 = dd4Var.l();
                            ou6 ou6VarL02 = s32.L0(dd4Var, ou6VarN02);
                            ml1.k.getClass();
                            um1 um1Var2 = ll1.b;
                            dd4Var.j0();
                            List list2 = list;
                            if (dd4Var.S) {
                                dd4Var.k(um1Var2);
                            } else {
                                dd4Var.s0();
                            }
                            un9.s(ll1.f, dd4Var, eq8VarA);
                            un9.s(ll1.e, dd4Var, lr7VarL2);
                            un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode2));
                            un9.r(dd4Var, ll1.h);
                            un9.s(ll1.d, dd4Var, ou6VarL02);
                            String str = yhaVar.b;
                            if (z3) {
                                dd4Var.f0(670215963);
                                j = ((q96) dd4Var.j(s96.a)).a.a;
                                z = false;
                            } else {
                                z = false;
                                dd4Var.f0(670217213);
                                j = ((q96) dd4Var.j(s96.a)).a.q;
                            }
                            dd4Var.q(z);
                            dd4 dd4Var2 = dd4Var;
                            nha.c(str, new hmb(bv4.x), j, (g60) null, wn9.x(16), (t74) null, a84.u, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 1, 0, (kb4) null, ((q96) dd4Var.j(s96.a)).b.i, dd4Var2, 1597440, 24576, 114600);
                            dd4Var = dd4Var2;
                            dd4Var.q(true);
                            i3++;
                            list = list2;
                            i2 = 2;
                            z2 = false;
                        }
                    }
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                p7c.b((List) obj5, (ou6) obj6, (kb4) obj4, (kb4) obj3, (dd4) obj, qu1.x0(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                sdc.d((ob9) obj5, (ou6) obj6, (kb4) obj4, (kb4) obj3, (dd4) obj, qu1.x0(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                jf0.c((gba) obj5, (ou6) obj6, (ib4) obj3, (ib4) obj4, (dd4) obj, qu1.x0(1));
                break;
            case 5:
                a07 a07Var = (a07) obj5;
                wfa wfaVar = (wfa) obj6;
                pj7 pj7Var = (pj7) obj3;
                rj1 rj1Var = (rj1) obj4;
                dd4 dd4Var3 = (dd4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!dd4Var3.V(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dd4Var3.Y();
                } else {
                    ou6 ou6VarC = md2.C(h67.x0(lu6Var, "Container"), new fb3(19, new qfa(a07Var, a07.class, ES6Iterator.VALUE_PROPERTY, "getValue()Ljava/lang/Object;", 0), pj7Var, wm9.j(wfaVar)));
                    ha6 ha6VarD2 = pn0.d(bv4.b, true);
                    int iHashCode3 = Long.hashCode(dd4Var3.T);
                    lr7 lr7VarL3 = dd4Var3.l();
                    ou6 ou6VarL03 = s32.L0(dd4Var3, ou6VarC);
                    ml1.k.getClass();
                    um1 um1Var3 = ll1.b;
                    dd4Var3.j0();
                    if (dd4Var3.S) {
                        dd4Var3.k(um1Var3);
                    } else {
                        dd4Var3.s0();
                    }
                    un9.s(ll1.f, dd4Var3, ha6VarD2);
                    un9.s(ll1.e, dd4Var3, lr7VarL3);
                    un9.s(ll1.g, dd4Var3, Integer.valueOf(iHashCode3));
                    un9.r(dd4Var3, ll1.h);
                    un9.s(ll1.d, dd4Var3, ou6VarL03);
                    rj1Var.invoke(dd4Var3, 0);
                    dd4Var3.q(true);
                }
                break;
            case 6:
                ((Integer) obj2).getClass();
                yib.g((bha) obj5, (ou6) obj6, (ib4) obj3, (ib4) obj4, (dd4) obj, qu1.x0(1));
                break;
            default:
                ((Integer) obj2).getClass();
                fz1.I((String) obj6, (ArrayList) obj5, (kb4) obj4, (ou6) obj3, (dd4) obj, qu1.x0(3073));
                break;
        }
        return hebVar;
    }

    public /* synthetic */ yn6(Object obj, Object obj2, ub4 ub4Var, ub4 ub4Var2, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.d = ub4Var;
        this.e = ub4Var2;
    }

    public /* synthetic */ yn6(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ yn6(Object obj, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = ou6Var;
        this.e = kb4Var;
        this.d = kb4Var2;
    }
}
