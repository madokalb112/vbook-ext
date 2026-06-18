package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ut3 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    public /* synthetic */ ut3(ib4 ib4Var, ou6 ou6Var, boolean z, t89 t89Var, bs0 bs0Var, fs0 fs0Var, pj7 pj7Var, int i) {
        this.a = 1;
        this.d = ib4Var;
        this.e = ou6Var;
        this.b = z;
        this.f = t89Var;
        this.s = bs0Var;
        this.t = fs0Var;
        this.c = pj7Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        Object obj3 = this.s;
        Object obj4 = this.f;
        Object obj5 = this.t;
        Object obj6 = this.e;
        Object obj7 = this.c;
        Object obj8 = this.d;
        switch (i) {
            case 0:
                st5 st5Var = (st5) obj8;
                pj7 pj7Var = (pj7) obj7;
                nv nvVar = (nv) obj6;
                vf0 vf0Var = (vf0) obj4;
                s04 s04Var = (s04) obj3;
                kb4 kb4Var = (kb4) obj5;
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    rw1.j(tg9.c, st5Var, pj7Var, false, nvVar, vf0Var, s04Var, this.b, null, kb4Var, dd4Var, 6, 256);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                lc5.m((ib4) obj8, (ou6) obj6, this.b, (t89) obj4, (bs0) obj3, (fs0) obj5, (pj7) obj7, (dd4) obj, qu1.x0(805306417));
                break;
            case 2:
                vx1 vx1Var = (vx1) obj8;
                a07 a07Var = (a07) obj6;
                a07 a07Var2 = (a07) obj4;
                a07 a07Var3 = (a07) obj3;
                a07 a07Var4 = (a07) obj5;
                eb7 eb7Var = (eb7) obj;
                ((uj7) obj2).getClass();
                if (((Boolean) ((br9) obj7).getValue()).booleanValue()) {
                    vo1.y(a07Var, false);
                    break;
                } else {
                    o9a o9aVarK = tl9.k(Float.intBitsToFloat((int) (eb7Var.a >> 32)), Float.intBitsToFloat((int) (eb7Var.a & 4294967295L)), (int) (((na5) a07Var2.getValue()).a >> 32), (int) (((na5) a07Var2.getValue()).a & 4294967295L), ((zy4) a07Var3.getValue()).l);
                    int i2 = ((zy4) a07Var3.getValue()).k;
                    if (i2 == 1 ? ((zy4) a07Var3.getValue()).b != 0 : i2 == 2 ? ((zy4) a07Var3.getValue()).b == 0 : i2 != 3) {
                        vo1.y(a07Var, true);
                        break;
                    } else {
                        int iOrdinal = o9aVarK.ordinal();
                        boolean z = this.b;
                        jt1 jt1Var = null;
                        if (iOrdinal == 0) {
                            ah1.J(vx1Var, null, null, new pz4(z, a07Var4, a07Var3, jt1Var, 0), 3);
                            break;
                        } else if (iOrdinal == 1) {
                            ah1.J(vx1Var, null, null, new pz4(z, a07Var4, a07Var3, jt1Var, 1), 3);
                            break;
                        } else if (iOrdinal == 2) {
                            vo1.y(a07Var, true);
                            break;
                        } else if (iOrdinal != 3) {
                            mn5.g();
                            break;
                        }
                    }
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                s32.K(this.b, (y51) obj8, (ou6) obj7, (kb4) obj5, (kb4) obj6, (ib4) obj4, (kb4) obj3, (dd4) obj, qu1.x0(1));
                break;
            default:
                ((Integer) obj2).getClass();
                lx1.u((ihb) obj8, (String) obj7, (List) obj6, this.b, (kb4) obj5, (ib4) obj4, (ou6) obj3, (dd4) obj, qu1.x0(9));
                break;
        }
        return hebVar;
    }

    public /* synthetic */ ut3(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, boolean z) {
        this.a = i;
        this.d = obj;
        this.c = obj2;
        this.e = obj3;
        this.f = obj4;
        this.s = obj5;
        this.b = z;
        this.t = obj6;
    }

    public /* synthetic */ ut3(ihb ihbVar, String str, List list, boolean z, kb4 kb4Var, ib4 ib4Var, ou6 ou6Var, int i) {
        this.a = 4;
        this.d = ihbVar;
        this.c = str;
        this.e = list;
        this.b = z;
        this.t = kb4Var;
        this.f = ib4Var;
        this.s = ou6Var;
    }

    public /* synthetic */ ut3(boolean z, y51 y51Var, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, ib4 ib4Var, kb4 kb4Var3, int i) {
        this.a = 3;
        this.b = z;
        this.d = y51Var;
        this.c = ou6Var;
        this.t = kb4Var;
        this.e = kb4Var2;
        this.f = ib4Var;
        this.s = kb4Var3;
    }
}
