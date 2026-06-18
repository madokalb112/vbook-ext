package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class fj2 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ br9 b;

    public /* synthetic */ fj2(br9 br9Var, int i) {
        this.a = i;
        this.b = br9Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        br9 br9Var = this.b;
        switch (i) {
            case 0:
                r43 r43Var = (r43) obj;
                long j = ((lc1) br9Var.getValue()).a;
                if (!lc1.d(j, lc1.j)) {
                    r43.J(r43Var, j, 0L, 0L, 0.0f, (jw9) null, Token.ELSE);
                }
                break;
            case 1:
                ((kb4) br9Var.getValue()).invoke(obj);
                break;
            case 2:
                bn8 bn8Var = (bn8) obj;
                bn8Var.getClass();
                bn8Var.n(((Number) br9Var.getValue()).floatValue());
                bn8Var.o(((Number) br9Var.getValue()).floatValue());
                break;
            case 3:
                break;
            case 4:
                ((bn8) obj).c(((Number) br9Var.getValue()).floatValue());
                break;
            case 5:
                ((bn8) obj).c(((Number) br9Var.getValue()).floatValue());
                break;
            case 6:
                bn8 bn8Var2 = (bn8) obj;
                bn8Var2.getClass();
                bn8Var2.n(((Number) br9Var.getValue()).floatValue());
                bn8Var2.o(((Number) br9Var.getValue()).floatValue());
                break;
            case 7:
                bn8 bn8Var3 = (bn8) obj;
                bn8Var3.getClass();
                bn8Var3.l(((Number) br9Var.getValue()).floatValue());
                break;
            default:
                bn8 bn8Var4 = (bn8) obj;
                bn8Var4.getClass();
                bn8Var4.l(((Number) br9Var.getValue()).floatValue());
                break;
        }
        return hebVar;
    }
}
