package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class x95 extends yv0 {
    public final g18 c;
    public final int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x95(g18 g18Var, String str, int i) {
        super(str, 3);
        g18Var.getClass();
        this.c = g18Var;
        this.d = i;
    }

    @Override // defpackage.yv0
    public final Object d(String str) {
        str.getClass();
        g18 g18Var = this.c;
        g18Var.getClass();
        wh0 wh0VarF = g18Var.f();
        wh0VarF.getClass();
        return Integer.valueOf(((Number) ah1.S(hc3.a, new th0(wh0VarF, str, this.d, null, 0))).intValue());
    }

    @Override // defpackage.yv0
    public final void f(Object obj, String str) throws Throwable {
        int iIntValue = ((Number) obj).intValue();
        str.getClass();
        g18 g18Var = this.c;
        g18Var.getClass();
        wh0 wh0VarF = g18Var.f();
        wh0VarF.getClass();
        ah1.S(hc3.a, new th0(wh0VarF, str, iIntValue, null, 1));
    }
}
