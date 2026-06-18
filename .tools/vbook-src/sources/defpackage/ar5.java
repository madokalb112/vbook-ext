package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ar5 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kb4 b;
    public final /* synthetic */ vx1 c;
    public final /* synthetic */ br9 d;
    public final /* synthetic */ ym7 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ br9 s;
    public final /* synthetic */ br9 t;
    public final /* synthetic */ jx8 u;

    public /* synthetic */ ar5(kb4 kb4Var, jx8 jx8Var, vx1 vx1Var, br9 br9Var, ym7 ym7Var, float f, br9 br9Var2, br9 br9Var3, int i) {
        this.a = i;
        this.b = kb4Var;
        this.u = jx8Var;
        this.c = vx1Var;
        this.d = br9Var;
        this.e = ym7Var;
        this.f = f;
        this.s = br9Var2;
        this.t = br9Var3;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        br9 br9Var = this.s;
        float f = this.f;
        ym7 ym7Var = this.e;
        br9 br9Var2 = this.d;
        vx1 vx1Var = this.c;
        uu5 uu5Var = this.u;
        kb4 kb4Var = this.b;
        switch (i) {
            case 0:
                wq5 wq5Var = (wq5) uu5Var;
                Float f2 = (Float) obj;
                f2.getClass();
                kb4Var.invoke(f2);
                float fH = ym7Var.h() * (wq5Var.j().p / ((Number) br9Var2.getValue()).intValue());
                if (((Number) br9Var.getValue()).floatValue() < f) {
                    fH = (fH * (1.0f - ((Number) br9Var.getValue()).floatValue())) / (1.0f - f);
                }
                int iFloor = (int) Math.floor(r4);
                ah1.J(vx1Var, null, null, new rp5(wq5Var, ((Number) br9Var2.getValue()).intValue() * iFloor, this.t, fH - ((float) Math.floor(fH)), null, 1), 3);
                break;
            default:
                uu5 uu5Var2 = uu5Var;
                Float f3 = (Float) obj;
                f3.getClass();
                kb4Var.invoke(f3);
                float fH2 = ym7Var.h() * (uu5Var2.g().l / ((Number) br9Var2.getValue()).intValue());
                if (((Number) br9Var.getValue()).floatValue() < f) {
                    fH2 = (fH2 * (1.0f - ((Number) br9Var.getValue()).floatValue())) / (1.0f - f);
                }
                int iFloor2 = (int) Math.floor(r4);
                ah1.J(vx1Var, null, null, new rp5(uu5Var2, ((Number) br9Var2.getValue()).intValue() * iFloor2, this.t, fH2 - ((float) Math.floor(fH2)), null, 2), 3);
                break;
        }
        return hebVar;
    }
}
