package defpackage;

import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class i41 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i41(co0 co0Var, kb9 kb9Var, boolean z) {
        this.a = 4;
        this.c = co0Var;
        this.d = kb9Var;
        this.b = z;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        long j;
        int i = this.a;
        heb hebVar = heb.a;
        Object obj3 = this.d;
        boolean z = this.b;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                fe.w((sgb) obj4, z, (ib4) obj3, (dd4) obj, qu1.x0(9));
                break;
            case 1:
                String str = (String) obj4;
                uka ukaVar = (uka) obj3;
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    if (z) {
                        dd4Var.f0(-2058081621);
                        j = ((q96) dd4Var.j(s96.a)).a.b;
                        dd4Var.q(false);
                    } else {
                        dd4Var.f0(-2058001269);
                        j = ((q96) dd4Var.j(s96.a)).a.q;
                        dd4Var.q(false);
                    }
                    nha.c(str, (ou6) null, j, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 1, 0, (kb4) null, ukaVar, dd4Var, 0, 24576, 114682);
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                kc5.i(z, (ou6) obj4, (kb4) obj3, (dd4) obj, qu1.x0(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                h67.z((sgb) obj4, z, (ou6) obj3, (dd4) obj, qu1.x0(9));
                break;
            case 4:
                kb9 kb9Var = (kb9) obj3;
                na5 na5Var = (na5) obj;
                float fI = up1.i(((co0) obj4).b);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                lb9 lb9Var = lb9.b;
                lb9 lb9Var2 = lb9.a;
                if (z) {
                    linkedHashMap.put(lb9Var2, Float.valueOf(fI));
                    int i2 = (int) (na5Var.a >> 32);
                    if (i2 != 0) {
                        linkedHashMap.put(lb9Var, Float.valueOf(fI - i2));
                    }
                } else {
                    linkedHashMap.put(lb9Var2, Float.valueOf(-fI));
                    if (((int) (na5Var.a >> 32)) != 0) {
                        linkedHashMap.put(lb9Var, Float.valueOf(0.0f));
                    }
                }
                h86 h86Var = new h86(linkedHashMap);
                int iOrdinal = ((lb9) kb9Var.b.h.getValue()).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1 || iOrdinal == 2) {
                        lb9 lb9Var3 = lb9.c;
                        if (linkedHashMap.containsKey(lb9Var3)) {
                            lb9Var = lb9Var3;
                        } else if (!linkedHashMap.containsKey(lb9Var)) {
                            lb9Var = lb9Var2;
                        }
                        lb9Var2 = lb9Var;
                    } else {
                        mn5.g();
                    }
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                sdc.f(z, (koa) obj4, (ou6) obj3, (dd4) obj, qu1.x0(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                gc1.f(z, (zd1) obj4, (ou6) obj3, (dd4) obj, qu1.x0(1));
                break;
            case 7:
                kb4 kb4Var = (kb4) obj4;
                br9 br9Var = (br9) obj3;
                dd4 dd4Var2 = (dd4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dd4Var2.Y();
                } else {
                    ou6 ou6VarI0 = sw1.i0(t96.w(tg9.n(lu6.a, 44.0f), tp8.a), ((Number) br9Var.getValue()).floatValue());
                    boolean zF = dd4Var2.f(kb4Var) | dd4Var2.g(z);
                    Object objQ = dd4Var2.Q();
                    if (zF || objQ == vl1.a) {
                        objQ = new ck0(18, kb4Var, z);
                        dd4Var2.p0(objQ);
                    }
                    mx4.a(i25.c((m53) h53.e.getValue(), dd4Var2, 0), (String) null, gjb.l0(fw.J(null, (ib4) objQ, ou6VarI0, false, 15), 12.0f), 0L, dd4Var2, 48, 8);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                vo1.h((List) obj4, z, (kb4) obj3, (dd4) obj, qu1.x0(391));
                break;
        }
        return hebVar;
    }

    public /* synthetic */ i41(kb4 kb4Var, boolean z, br9 br9Var) {
        this.a = 7;
        this.c = kb4Var;
        this.b = z;
        this.d = br9Var;
    }

    public /* synthetic */ i41(Object obj, boolean z, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }

    public /* synthetic */ i41(boolean z, Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.c = obj;
        this.d = obj2;
    }

    public /* synthetic */ i41(boolean z, String str, uka ukaVar) {
        this.a = 1;
        this.b = z;
        this.c = str;
        this.d = ukaVar;
    }
}
