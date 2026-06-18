package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class c14 extends yv0 {
    public final g18 c;
    public final float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c14(g18 g18Var, String str, float f) {
        super(str, 3);
        g18Var.getClass();
        this.c = g18Var;
        this.d = f;
    }

    @Override // defpackage.yv0
    public final Object d(String str) {
        String str2;
        float fDoubleValue;
        hc3 hc3Var = hc3.a;
        str.getClass();
        float f = this.d;
        g18 g18Var = this.c;
        g18Var.getClass();
        try {
            wh0 wh0VarF = g18Var.f();
            wh0VarF.getClass();
            str2 = str;
            try {
                fDoubleValue = ((Number) ah1.S(hc3Var, new sh0(wh0VarF, str2, f, null, 0))).floatValue();
            } catch (Exception unused) {
                wh0 wh0VarF2 = g18Var.f();
                wh0VarF2.getClass();
                fDoubleValue = (float) ((Number) ah1.S(hc3Var, new rh0(wh0VarF2, str2, f, null, 0))).doubleValue();
            }
        } catch (Exception unused2) {
            str2 = str;
        }
        return Float.valueOf(fDoubleValue);
    }

    @Override // defpackage.yv0
    public final void f(Object obj, String str) {
        float fFloatValue = ((Number) obj).floatValue();
        str.getClass();
        g18 g18Var = this.c;
        g18Var.getClass();
        g18Var.i(str, fFloatValue);
    }
}
