package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ul3 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kb4 b;
    public final /* synthetic */ kb4 c;
    public final /* synthetic */ a07 d;

    public /* synthetic */ ul3(kb4 kb4Var, kb4 kb4Var2, a07 a07Var) {
        this.a = 1;
        this.b = kb4Var;
        this.c = kb4Var2;
        this.d = a07Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        Object obj3 = vl1.a;
        kb4 kb4Var = this.c;
        a07 a07Var = this.d;
        kb4 kb4Var2 = this.b;
        switch (i) {
            case 0:
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    boolean zF = dd4Var.f(kb4Var2) | dd4Var.f(a07Var) | dd4Var.f(kb4Var);
                    Object objQ = dd4Var.Q();
                    if (zF || objQ == obj3) {
                        objQ = new wl3(1, kb4Var2, kb4Var, a07Var);
                        dd4Var.p0(objQ);
                    }
                    lc5.J((ib4) objQ, null, false, null, null, null, lc5.p, dd4Var, 805306368, 510);
                }
                break;
            case 1:
                dd4 dd4Var2 = (dd4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dd4Var2.Y();
                } else {
                    boolean z = !bw9.a0((String) a07Var.getValue());
                    boolean zF2 = dd4Var2.f(kb4Var2) | dd4Var2.f(kb4Var) | dd4Var2.f(a07Var);
                    Object objQ2 = dd4Var2.Q();
                    if (zF2 || objQ2 == obj3) {
                        objQ2 = new wl3(2, kb4Var2, kb4Var, a07Var);
                        dd4Var2.p0(objQ2);
                    }
                    lc5.J((ib4) objQ2, null, z, null, null, null, vm7.d, dd4Var2, 805306368, 506);
                }
                break;
            case 2:
                dd4 dd4Var3 = (dd4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!dd4Var3.V(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    dd4Var3.Y();
                } else {
                    boolean z2 = !bw9.a0((String) a07Var.getValue());
                    boolean zF3 = dd4Var3.f(kb4Var2) | dd4Var3.f(a07Var) | dd4Var3.f(kb4Var);
                    Object objQ3 = dd4Var3.Q();
                    if (zF3 || objQ3 == obj3) {
                        objQ3 = new wl3(3, kb4Var2, kb4Var, a07Var);
                        dd4Var3.p0(objQ3);
                    }
                    lc5.J((ib4) objQ3, null, z2, null, null, null, kl8.i, dd4Var3, 805306368, 506);
                }
                break;
            case 3:
                dd4 dd4Var4 = (dd4) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!dd4Var4.V(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    dd4Var4.Y();
                } else {
                    boolean z3 = !bw9.a0((String) a07Var.getValue());
                    boolean zF4 = dd4Var4.f(kb4Var2) | dd4Var4.f(a07Var) | dd4Var4.f(kb4Var);
                    Object objQ4 = dd4Var4.Q();
                    if (zF4 || objQ4 == obj3) {
                        objQ4 = new wl3(4, kb4Var2, kb4Var, a07Var);
                        dd4Var4.p0(objQ4);
                    }
                    lc5.J((ib4) objQ4, null, z3, null, null, null, yb0.j, dd4Var4, 805306368, 506);
                }
                break;
            default:
                dd4 dd4Var5 = (dd4) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!dd4Var5.V(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    dd4Var5.Y();
                } else {
                    boolean z4 = !bw9.a0((String) a07Var.getValue());
                    boolean zF5 = dd4Var5.f(kb4Var2) | dd4Var5.f(a07Var) | dd4Var5.f(kb4Var);
                    Object objQ5 = dd4Var5.Q();
                    if (zF5 || objQ5 == obj3) {
                        objQ5 = new wl3(6, kb4Var2, kb4Var, a07Var);
                        dd4Var5.p0(objQ5);
                    }
                    lc5.J((ib4) objQ5, null, z4, null, null, null, kl8.m, dd4Var5, 805306368, 506);
                }
                break;
        }
        return hebVar;
    }

    public /* synthetic */ ul3(int i, kb4 kb4Var, kb4 kb4Var2, a07 a07Var) {
        this.a = i;
        this.b = kb4Var;
        this.d = a07Var;
        this.c = kb4Var2;
    }
}
