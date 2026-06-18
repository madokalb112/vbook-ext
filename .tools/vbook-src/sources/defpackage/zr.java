package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class zr implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ib4 b;

    public /* synthetic */ zr(int i, ib4 ib4Var) {
        this.a = i;
        this.b = ib4Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        ib4 ib4Var = this.b;
        switch (i) {
            case 0:
                ((bn8) obj).c(((Number) ib4Var.invoke()).floatValue());
                return hebVar;
            case 1:
                ib4Var.invoke();
                return hebVar;
            case 2:
                ib4Var.invoke();
                return hebVar;
            case 3:
                ib4Var.invoke();
                return hebVar;
            case 4:
                ib4Var.invoke();
                return hebVar;
            case 5:
                ((Boolean) obj).booleanValue();
                ib4Var.invoke();
                return hebVar;
            case 6:
                r43.J((r43) obj, ((lc1) ib4Var.invoke()).a, 0L, 0L, 0.0f, (jw9) null, Token.ELSE);
                return hebVar;
            case 7:
                ib4Var.invoke();
                return hebVar;
            case 8:
                ((Boolean) obj).booleanValue();
                ib4Var.invoke();
                return hebVar;
            case 9:
                n29 n29Var = (n29) obj;
                Object objInvoke = ib4Var.invoke();
                Float f = (Float) (Float.isNaN(((Number) objInvoke).floatValue()) ? null : objInvoke);
                l29.e(n29Var, new x38(f != null ? f.floatValue() : 0.0f, new bb1(0.0f, 1.0f), 0));
                return hebVar;
            case 10:
                ib4Var.invoke();
                return hebVar;
            case 11:
                n29 n29Var2 = (n29) obj;
                Object objInvoke2 = ib4Var.invoke();
                Float f2 = (Float) (Float.isNaN(((Number) objInvoke2).floatValue()) ? null : objInvoke2);
                l29.e(n29Var2, new x38(f2 != null ? f2.floatValue() : 0.0f, new bb1(0.0f, 1.0f), 0));
                return hebVar;
            case 12:
                n29 n29Var3 = (n29) obj;
                Object objInvoke3 = ib4Var.invoke();
                Float f3 = (Float) (Float.isNaN(((Number) objInvoke3).floatValue()) ? null : objInvoke3);
                l29.e(n29Var3, new x38(f3 != null ? f3.floatValue() : 0.0f, new bb1(0.0f, 1.0f), 0));
                return hebVar;
            case 13:
                return (eb7) ib4Var.invoke();
            case 14:
                return (eb7) ib4Var.invoke();
            default:
                ib4Var.invoke();
                return hebVar;
        }
    }
}
