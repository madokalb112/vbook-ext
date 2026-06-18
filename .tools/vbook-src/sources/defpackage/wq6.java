package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class wq6 implements ib4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ wq6(kb4 kb4Var, kb4 kb4Var2, int i, int i2, a07 a07Var) {
        this.d = kb4Var;
        this.e = kb4Var2;
        this.b = i;
        this.c = i2;
        this.f = a07Var;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        int iQ = this.c;
        int i2 = this.b;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                kb4 kb4Var = (kb4) obj2;
                ((kb4) obj3).invoke(Boolean.FALSE);
                Integer numM = iw9.M(((wga) ((a07) obj).getValue()).a.b);
                if (numM != null) {
                    iQ = wx1.Q(numM.intValue(), 1, i2);
                }
                kb4Var.invoke(Integer.valueOf(iQ));
                return heb.a;
            default:
                j09 j09Var = (j09) obj3;
                k19 k19Var = (k19) obj2;
                int iIntValue = ((Number) ((dp5) obj).getValue()).intValue();
                boolean zA = k19Var.a();
                boolean z = k19Var.i() == s12.a;
                long j = j09Var.f.j(i2);
                qha qhaVar = j09Var.f;
                gx6 gx6Var = qhaVar.b;
                int i3 = pja.c;
                int iH = (int) (j >> 32);
                int iD = gx6Var.d(iH);
                int i4 = gx6Var.f;
                if (iD != iIntValue) {
                    iH = iIntValue >= i4 ? qhaVar.h(i4 - 1) : qhaVar.h(iIntValue);
                }
                int iC = (int) (j & 4294967295L);
                if (gx6Var.d(iC) != iIntValue) {
                    iC = iIntValue >= i4 ? gx6Var.c(i4 - 1, false) : gx6Var.c(iIntValue, false);
                }
                if (iH == iQ) {
                    return j09Var.a(iC);
                }
                if (iC == iQ) {
                    return j09Var.a(iH);
                }
                if (!(zA ^ z) ? i2 >= iH : i2 > iC) {
                    iH = iC;
                }
                return j09Var.a(iH);
        }
    }

    public /* synthetic */ wq6(j09 j09Var, int i, int i2, k19 k19Var, dp5 dp5Var) {
        this.d = j09Var;
        this.b = i;
        this.c = i2;
        this.e = k19Var;
        this.f = dp5Var;
    }
}
