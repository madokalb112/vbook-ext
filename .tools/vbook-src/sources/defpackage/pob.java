package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class pob implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ je4 d;
    public final /* synthetic */ kb4 e;
    public final /* synthetic */ kb4 f;
    public final /* synthetic */ zob s;
    public final /* synthetic */ ym7 t;

    public /* synthetic */ pob(boolean z, float f, je4 je4Var, kb4 kb4Var, kb4 kb4Var2, zob zobVar, ym7 ym7Var, int i) {
        this.a = i;
        this.b = z;
        this.c = f;
        this.d = je4Var;
        this.e = kb4Var;
        this.f = kb4Var2;
        this.s = zobVar;
        this.t = ym7Var;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        heb hebVar = heb.a;
        ym7 ym7Var = this.t;
        zob zobVar = this.s;
        kb4 kb4Var = this.f;
        kb4 kb4Var2 = this.e;
        je4 je4Var = this.d;
        float f = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                if (z) {
                    if (f <= 0.0f) {
                        float fH = ym7Var.h();
                        f = fH >= 0.1f ? fH : 0.1f;
                    }
                    je4Var.e.i(f);
                    kb4Var2.invoke(Float.valueOf(f));
                    kb4Var.invoke(Boolean.FALSE);
                } else {
                    if (f > 0.0f) {
                        ym7Var.i(f);
                    }
                    kb4Var.invoke(Boolean.TRUE);
                }
                zobVar.e(3000L);
                break;
            default:
                if (z) {
                    if (f <= 0.0f) {
                        float fH2 = ym7Var.h();
                        f = fH2 >= 0.1f ? fH2 : 0.1f;
                    }
                    je4Var.e.i(f);
                    kb4Var2.invoke(Float.valueOf(f));
                    kb4Var.invoke(Boolean.FALSE);
                } else {
                    if (f > 0.0f) {
                        ym7Var.i(f);
                    }
                    kb4Var.invoke(Boolean.TRUE);
                }
                zobVar.e(3000L);
                break;
        }
        return hebVar;
    }
}
