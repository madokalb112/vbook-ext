package defpackage;

import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class mp6 implements zb4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ mp6(int i, kb4 kb4Var, String str, List list) {
        this.c = str;
        this.b = i;
        this.d = kb4Var;
        this.e = list;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        int i2 = 2;
        lu6 lu6Var = lu6.a;
        heb hebVar = heb.a;
        Object obj4 = vl1.a;
        Object obj5 = this.e;
        Object obj6 = this.c;
        int i3 = this.b;
        Object obj7 = this.d;
        switch (i) {
            case 0:
                String str = (String) obj6;
                kb4 kb4Var = (kb4) obj7;
                List list = (List) obj5;
                dd4 dd4Var = (dd4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((c44) obj).getClass();
                if (dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                    boolean z = i3 < 0;
                    boolean zF = dd4Var.f(kb4Var);
                    Object objQ = dd4Var.Q();
                    if (zF || objQ == obj4) {
                        objQ = new tk6(22, kb4Var);
                        dd4Var.p0(objQ);
                    }
                    sp6.h(str, z, (ib4) objQ, dd4Var, 0);
                    int i4 = 0;
                    for (Object obj8 : list) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            gc1.i0();
                            throw null;
                        }
                        String str2 = ((wrb) obj8).a;
                        boolean z2 = i4 == i3;
                        boolean zF2 = dd4Var.f(kb4Var) | dd4Var.d(i4);
                        Object objQ2 = dd4Var.Q();
                        if (zF2 || objQ2 == obj4) {
                            objQ2 = new bk0(kb4Var, i4, 8);
                            dd4Var.p0(objQ2);
                        }
                        sp6.h(str2, z2, (ib4) objQ2, dd4Var, 0);
                        i4 = i5;
                    }
                } else {
                    dd4Var.Y();
                }
                return hebVar;
            case 1:
                vx1 vx1Var = (vx1) obj6;
                st5 st5Var = (st5) obj7;
                br9 br9Var = (br9) obj5;
                dd4 dd4Var2 = (dd4) obj2;
                ((Integer) obj3).getClass();
                ((co) obj).getClass();
                ou6 ou6VarN = tg9.n(lu6Var, 36.0f);
                rp8 rp8Var = tp8.a;
                boolean zH = dd4Var2.h(vx1Var) | dd4Var2.f(st5Var) | dd4Var2.d(i3);
                Object objQ3 = dd4Var2.Q();
                if (zH || objQ3 == obj4) {
                    objQ3 = new lj(vx1Var, st5Var, i3, 4);
                    dd4Var2.p0(objQ3);
                }
                ww1.g((ib4) objQ3, ou6VarN, rp8Var, 0L, 0L, null, jf0.G(-307692885, new lm6(br9Var, i2), dd4Var2), dd4Var2, 12582960, 120);
                return hebVar;
            default:
                kb4 kb4Var2 = (kb4) obj7;
                Set set = (Set) obj6;
                vq2 vq2Var = (vq2) obj5;
                dd4 dd4Var3 = (dd4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((dq5) obj).getClass();
                if (!dd4Var3.V(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    dd4Var3.Y();
                    return hebVar;
                }
                ou6 ou6VarN0 = gjb.n0(tg9.f(lu6Var, 1.0f), 16.0f, 0.0f, 2);
                long jG = dd1.g(s00.o(dd4Var3), 2.0f);
                lp4 lp4Var = jf0.G;
                ou6 ou6VarL = fe.L(ou6VarN0, jG, lp4Var);
                boolean zF3 = dd4Var3.f(kb4Var2) | dd4Var3.d(i3);
                Object objQ4 = dd4Var3.Q();
                if (zF3 || objQ4 == obj4) {
                    objQ4 = new bk0(kb4Var2, i3, 12);
                    dd4Var3.p0(objQ4);
                }
                ou6 ou6VarM0 = gjb.m0(fw.J(null, (ib4) objQ4, ou6VarL, false, 15), 16.0f, 12.0f);
                ha6 ha6VarD = pn0.d(bv4.b, false);
                int iHashCode = Long.hashCode(dd4Var3.T);
                lr7 lr7VarL = dd4Var3.l();
                ou6 ou6VarL0 = s32.L0(dd4Var3, ou6VarM0);
                ml1.k.getClass();
                um1 um1Var = ll1.b;
                dd4Var3.j0();
                if (dd4Var3.S) {
                    dd4Var3.k(um1Var);
                } else {
                    dd4Var3.s0();
                }
                jm jmVar = ll1.f;
                un9.s(jmVar, dd4Var3, ha6VarD);
                jm jmVar2 = ll1.e;
                un9.s(jmVar2, dd4Var3, lr7VarL);
                Integer numValueOf = Integer.valueOf(iHashCode);
                jm jmVar3 = ll1.g;
                un9.s(jmVar3, dd4Var3, numValueOf);
                kd kdVar = ll1.h;
                un9.r(dd4Var3, kdVar);
                jm jmVar4 = ll1.d;
                un9.s(jmVar4, dd4Var3, ou6VarL0);
                ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
                xf0 xf0Var = bv4.e;
                zn0 zn0Var = zn0.a;
                ou6 ou6VarP0 = gjb.p0(zn0Var.a(ou6VarF, xf0Var), 0.0f, 0.0f, 28.0f, 0.0f, 11);
                eq8 eq8VarA = dq8.a(pv.a, bv4.w, dd4Var3, 0);
                int iHashCode2 = Long.hashCode(dd4Var3.T);
                lr7 lr7VarL2 = dd4Var3.l();
                ou6 ou6VarL02 = s32.L0(dd4Var3, ou6VarP0);
                dd4Var3.j0();
                if (dd4Var3.S) {
                    dd4Var3.k(um1Var);
                } else {
                    dd4Var3.s0();
                }
                un9.s(jmVar, dd4Var3, eq8VarA);
                un9.s(jmVar2, dd4Var3, lr7VarL2);
                ky0.v(iHashCode2, dd4Var3, jmVar3, dd4Var3, kdVar);
                un9.s(jmVar4, dd4Var3, ou6VarL02);
                nha.c(vq2Var.a, new bp5(1.0f, false), s00.o(dd4Var3).a, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var3).h, dd4Var3, 0, 0, 131064);
                un9.a(dd4Var3, tg9.r(lu6Var, 8.0f));
                nha.c(String.valueOf(vq2Var.b.size()), gjb.m0(fe.L(t96.w(lu6Var, tp8.a), lc1.c(0.14f, s00.o(dd4Var3).a), lp4Var), 8.0f, 3.0f), s00.o(dd4Var3).a, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var3).m, dd4Var3, 0, 0, 131064);
                dd4Var3.q(true);
                br9 br9VarB = an.b(set.contains(Integer.valueOf(i3)) ? -90.0f : 0.0f, (ko) null, (String) null, dd4Var3, 0, 30);
                p35 p35VarC = i25.c((m53) f53.s.getValue(), dd4Var3, 0);
                ou6 ou6VarN2 = tg9.n(zn0Var.a(lu6Var, bv4.s), 24.0f);
                boolean zF4 = dd4Var3.f(br9VarB);
                Object objQ5 = dd4Var3.Q();
                if (zF4 || objQ5 == obj4) {
                    objQ5 = new fj2(br9VarB, 7);
                    dd4Var3.p0(objQ5);
                }
                mx4.a(p35VarC, (String) null, kl8.W(ou6VarN2, (kb4) objQ5), 0L, dd4Var3, 48, 8);
                dd4Var3.q(true);
                return hebVar;
        }
    }

    public /* synthetic */ mp6(vx1 vx1Var, st5 st5Var, int i, br9 br9Var) {
        this.c = vx1Var;
        this.d = st5Var;
        this.b = i;
        this.e = br9Var;
    }

    public /* synthetic */ mp6(kb4 kb4Var, int i, Set set, vq2 vq2Var) {
        this.d = kb4Var;
        this.b = i;
        this.c = set;
        this.e = vq2Var;
    }
}
