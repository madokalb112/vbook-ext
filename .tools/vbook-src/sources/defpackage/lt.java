package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class lt implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ br9 b;
    public final /* synthetic */ a07 c;

    public /* synthetic */ lt(int i, a07 a07Var, br9 br9Var) {
        this.a = i;
        this.b = br9Var;
        this.c = a07Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int i = this.a;
        lu6 lu6Var = lu6.a;
        heb hebVar = heb.a;
        Object obj3 = vl1.a;
        a07 a07Var = this.c;
        br9 br9Var = this.b;
        switch (i) {
            case 0:
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    dsa dsaVar = (dsa) br9Var.getValue();
                    boolean zR = ww1.R(dd4Var);
                    Object objQ = dd4Var.Q();
                    cm7 cm7Var = cm7.d;
                    cm7 cm7Var2 = cm7.a;
                    Object obj4 = objQ;
                    if (objQ == obj3) {
                        cm7[] cm7VarArr = {cm7Var2, cm7.b, cm7.c, cm7Var, cm7.e, cm7.f, cm7.s, cm7.t, cm7.u};
                        dd4Var.p0(cm7VarArr);
                        obj4 = cm7VarArr;
                    }
                    cm7[] cm7VarArr2 = (cm7[]) obj4;
                    Object objQ2 = dd4Var.Q();
                    if (objQ2 == obj3) {
                        long j = dsaVar.a;
                        xr xrVar = dsaVar.b;
                        cm7 cm7Var3 = (cm7) fw.p0(dsaVar.g, cm7VarArr2);
                        cm7 cm7Var4 = cm7Var3 == null ? cm7Var2 : cm7Var3;
                        double d = dsaVar.h;
                        boolean z3 = dsaVar.f;
                        boolean z4 = dsaVar.e;
                        boolean z5 = dsaVar.d;
                        int i2 = dsaVar.c;
                        if (i2 != 0) {
                            z = zR;
                            z2 = i2 == 1;
                        } else {
                            z = zR;
                            z2 = z;
                        }
                        c73 c73Var = new c73(j, xrVar, z2, z5, z4, z3, cm7Var4, d, dsaVar.i, dsaVar.j, dsaVar.k);
                        dd4Var.p0(c73Var);
                        objQ2 = c73Var;
                    } else {
                        z = zR;
                    }
                    c73 c73Var2 = (c73) objQ2;
                    c73Var2.a.setValue(new lc1(dsaVar.a));
                    xr xrVar2 = dsaVar.b;
                    xrVar2.getClass();
                    c73Var2.b.setValue(xrVar2);
                    cm7 cm7Var5 = (cm7) fw.p0(dsaVar.g, cm7VarArr2);
                    if (cm7Var5 != null) {
                        cm7Var = cm7Var5;
                    }
                    c73Var2.j.setValue(cm7Var);
                    c73Var2.k.setValue(Double.valueOf(dsaVar.h));
                    c73Var2.f.setValue(Boolean.valueOf(dsaVar.f));
                    c73Var2.e.setValue(Boolean.valueOf(dsaVar.e));
                    c73Var2.d.setValue(Boolean.valueOf(dsaVar.d));
                    int i3 = dsaVar.c;
                    c73Var2.c.setValue(Boolean.valueOf(i3 != 0 ? i3 == 1 : z));
                    c64 c64Var = dsaVar.k;
                    c64Var.getClass();
                    c73Var2.g.setValue(c64Var);
                    c73Var2.h.setValue(Float.valueOf(dsaVar.i));
                    c73Var2.i.setValue(Float.valueOf(dsaVar.j));
                    b73.a(c73Var2, m99.a, false, (kb4) null, jf0.G(768680330, new mt(0, c73Var2, br9Var, a07Var), dd4Var), dd4Var, 24624, 12);
                }
                break;
            case 1:
                dd4 dd4Var2 = (dd4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dd4Var2.Y();
                } else {
                    ou6 ou6VarI0 = sw1.i0(t96.w(tg9.n(lu6Var, 44.0f), tp8.a), ((Number) br9Var.getValue()).floatValue());
                    Object objQ3 = dd4Var2.Q();
                    if (objQ3 == obj3) {
                        objQ3 = new lz4(a07Var, 19);
                        dd4Var2.p0(objQ3);
                    }
                    mx4.a(i25.c((m53) h53.e.getValue(), dd4Var2, 0), (String) null, gjb.l0(fw.J(null, (ib4) objQ3, ou6VarI0, false, 15), 12.0f), 0L, dd4Var2, 48, 8);
                }
                break;
            case 2:
                dd4 dd4Var3 = (dd4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!dd4Var3.V(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    dd4Var3.Y();
                } else {
                    ou6 ou6VarI02 = sw1.i0(t96.w(tg9.n(lu6Var, 44.0f), tp8.a), ((Number) br9Var.getValue()).floatValue());
                    Object objQ4 = dd4Var3.Q();
                    if (objQ4 == obj3) {
                        objQ4 = new lz4(a07Var, 20);
                        dd4Var3.p0(objQ4);
                    }
                    mx4.a(i25.c((m53) h53.e.getValue(), dd4Var3, 0), (String) null, gjb.l0(fw.J(null, (ib4) objQ4, ou6VarI02, false, 15), 12.0f), 0L, dd4Var3, 48, 8);
                }
                break;
            case 3:
                dd4 dd4Var4 = (dd4) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!dd4Var4.V(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                    dd4Var4.Y();
                } else {
                    ou6 ou6VarI03 = sw1.i0(t96.w(tg9.n(lu6Var, 44.0f), tp8.a), ((Number) br9Var.getValue()).floatValue());
                    Object objQ5 = dd4Var4.Q();
                    if (objQ5 == obj3) {
                        objQ5 = new bq6(a07Var, 7);
                        dd4Var4.p0(objQ5);
                    }
                    mx4.a(i25.c((m53) h53.e.getValue(), dd4Var4, 0), (String) null, gjb.l0(fw.J(null, (ib4) objQ5, ou6VarI03, false, 15), 12.0f), 0L, dd4Var4, 48, 8);
                }
                break;
            default:
                dd4 dd4Var5 = (dd4) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!dd4Var5.V(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    dd4Var5.Y();
                } else {
                    ou6 ou6VarI04 = sw1.i0(t96.w(tg9.n(lu6Var, 44.0f), tp8.a), ((Number) br9Var.getValue()).floatValue());
                    Object objQ6 = dd4Var5.Q();
                    if (objQ6 == obj3) {
                        objQ6 = new dpb(a07Var, 0);
                        dd4Var5.p0(objQ6);
                    }
                    mx4.a(i25.c((m53) h53.e.getValue(), dd4Var5, 0), (String) null, gjb.l0(fw.J(null, (ib4) objQ6, ou6VarI04, false, 15), 12.0f), 0L, dd4Var5, 48, 8);
                }
                break;
        }
        return hebVar;
    }
}
