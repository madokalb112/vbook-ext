package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class li6 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kb4 b;
    public final /* synthetic */ kb4 c;
    public final /* synthetic */ a07 d;
    public final /* synthetic */ String e;

    public /* synthetic */ li6(kb4 kb4Var, kb4 kb4Var2, a07 a07Var, String str) {
        this.a = 1;
        this.b = kb4Var;
        this.c = kb4Var2;
        this.d = a07Var;
        this.e = str;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        Object obj3 = vl1.a;
        switch (i) {
            case 0:
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    a07 a07Var = this.d;
                    boolean z = !bw9.a0(((wga) a07Var.getValue()).a.b);
                    kb4 kb4Var = this.b;
                    boolean zF = dd4Var.f(kb4Var) | dd4Var.f(a07Var);
                    String str = this.e;
                    boolean zF2 = zF | dd4Var.f(str);
                    kb4 kb4Var2 = this.c;
                    boolean zF3 = dd4Var.f(kb4Var2) | zF2;
                    Object objQ = dd4Var.Q();
                    if (zF3 || objQ == obj3) {
                        pi6 pi6Var = new pi6(0, kb4Var, kb4Var2, a07Var, str);
                        dd4Var.p0(pi6Var);
                        objQ = pi6Var;
                    }
                    lc5.J((ib4) objQ, null, z, null, null, null, h67.c, dd4Var, 805306368, 506);
                }
                break;
            case 1:
                dd4 dd4Var2 = (dd4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dd4Var2.Y();
                } else {
                    a07 a07Var2 = this.d;
                    boolean z2 = !bw9.a0(((wga) a07Var2.getValue()).a.b);
                    kb4 kb4Var3 = this.b;
                    boolean zF4 = dd4Var2.f(kb4Var3);
                    kb4 kb4Var4 = this.c;
                    boolean zF5 = zF4 | dd4Var2.f(kb4Var4) | dd4Var2.f(a07Var2);
                    String str2 = this.e;
                    boolean zF6 = zF5 | dd4Var2.f(str2);
                    Object objQ2 = dd4Var2.Q();
                    if (zF6 || objQ2 == obj3) {
                        objQ2 = new pi6(kb4Var3, kb4Var4, a07Var2, str2);
                        dd4Var2.p0(objQ2);
                    }
                    lc5.J((ib4) objQ2, null, z2, null, null, null, jv3.s, dd4Var2, 805306368, 506);
                }
                break;
            default:
                dd4 dd4Var3 = (dd4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!dd4Var3.V(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    dd4Var3.Y();
                } else {
                    a07 a07Var3 = this.d;
                    boolean z3 = !bw9.a0(((wga) a07Var3.getValue()).a.b);
                    kb4 kb4Var5 = this.b;
                    boolean zF7 = dd4Var3.f(kb4Var5) | dd4Var3.f(a07Var3);
                    String str3 = this.e;
                    boolean zF8 = zF7 | dd4Var3.f(str3);
                    kb4 kb4Var6 = this.c;
                    boolean zF9 = dd4Var3.f(kb4Var6) | zF8;
                    Object objQ3 = dd4Var3.Q();
                    if (zF9 || objQ3 == obj3) {
                        pi6 pi6Var2 = new pi6(2, kb4Var5, kb4Var6, a07Var3, str3);
                        dd4Var3.p0(pi6Var2);
                        objQ3 = pi6Var2;
                    }
                    lc5.J((ib4) objQ3, null, z3, null, null, null, gjb.r, dd4Var3, 805306368, 506);
                }
                break;
        }
        return hebVar;
    }

    public /* synthetic */ li6(int i, kb4 kb4Var, kb4 kb4Var2, a07 a07Var, String str) {
        this.a = i;
        this.b = kb4Var;
        this.d = a07Var;
        this.e = str;
        this.c = kb4Var2;
    }
}
