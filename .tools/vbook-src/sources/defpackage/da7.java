package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class da7 extends yv0 {
    public final /* synthetic */ int c = 1;
    public final g18 d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da7(g18 g18Var, String str, oi5 oi5Var) {
        super(str, 3);
        g18Var.getClass();
        oi5Var.getClass();
        this.d = g18Var;
        this.e = oi5Var;
    }

    @Override // defpackage.yv0
    public final Object d(String str) {
        Object pm8Var;
        int i = this.c;
        Object obj = this.e;
        g18 g18Var = this.d;
        switch (i) {
            case 0:
                str.getClass();
                try {
                    g18Var.getClass();
                    pm8Var = xf5.a.a((oi5) obj, g18Var.g(str, ""));
                    break;
                } catch (Throwable th) {
                    pm8Var = new pm8(th);
                }
                if (pm8Var instanceof pm8) {
                    return null;
                }
                return pm8Var;
            default:
                str.getClass();
                g18Var.getClass();
                return g18Var.g(str, (String) obj);
        }
    }

    @Override // defpackage.yv0
    public final void f(Object obj, String str) throws Throwable {
        int i = this.c;
        g18 g18Var = this.d;
        switch (i) {
            case 0:
                str.getClass();
                if (obj != null) {
                    ww1.f0(g18Var, str, xf5.a.b((oi5) this.e, obj));
                } else {
                    g18Var.getClass();
                    wh0 wh0VarF = g18Var.f();
                    wh0VarF.getClass();
                    ah1.S(hc3.a, new qh0(wh0VarF, str, null, 6));
                }
                break;
            default:
                String str2 = (String) obj;
                str.getClass();
                str2.getClass();
                ww1.f0(g18Var, str, str2);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da7(g18 g18Var, String str, String str2) {
        super(str, 3);
        g18Var.getClass();
        this.d = g18Var;
        this.e = str2;
    }
}
