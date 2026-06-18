package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class x41 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a07 b;
    public final /* synthetic */ a07 c;

    public /* synthetic */ x41(a07 a07Var, a07 a07Var2, int i) {
        this.a = i;
        this.b = a07Var;
        this.c = a07Var2;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        String str;
        int i = this.a;
        boolean z = true;
        heb hebVar = heb.a;
        a07 a07Var = this.c;
        a07 a07Var2 = this.b;
        switch (i) {
            case 0:
                kl8.g(a07Var2, false);
                a07Var.setValue(Boolean.TRUE);
                return hebVar;
            case 1:
                kl8.g(a07Var2, false);
                a07Var.setValue(Boolean.TRUE);
                return hebVar;
            case 2:
                kl8.g(a07Var2, false);
                a07Var.setValue(Boolean.TRUE);
                return hebVar;
            case 3:
                kl8.g(a07Var2, false);
                a07Var.setValue(Boolean.TRUE);
                return hebVar;
            case 4:
                if (((Boolean) a07Var2.getValue()).booleanValue()) {
                    ((ib4) a07Var.getValue()).invoke();
                }
                return hebVar;
            case 5:
                a07Var2.setValue(Boolean.FALSE);
                a07Var.setValue(Boolean.TRUE);
                return hebVar;
            case 6:
                if (!((List) a07Var2.getValue()).isEmpty()) {
                    a07Var.setValue(Boolean.TRUE);
                }
                return hebVar;
            case 7:
                a07Var2.setValue(Boolean.FALSE);
                a07Var.setValue(Boolean.TRUE);
                return hebVar;
            case 8:
                a07Var2.setValue(Boolean.TRUE);
                a07Var.setValue(Boolean.FALSE);
                return hebVar;
            case 9:
                if (!((Boolean) a07Var2.getValue()).booleanValue() && !((Boolean) a07Var.getValue()).booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 10:
                a07Var2.setValue(Boolean.FALSE);
                a07Var.setValue(Boolean.TRUE);
                return hebVar;
            case 11:
                ((kb4) a07Var2.getValue()).invoke(kf0.X(((lc1) a07Var.getValue()).a, true, false));
                return hebVar;
            case 12:
                ((kb4) a07Var2.getValue()).invoke(kf0.X(((lc1) a07Var.getValue()).a, true, false));
                return hebVar;
            case 13:
                ((kb4) a07Var2.getValue()).invoke(kf0.X(((lc1) a07Var.getValue()).a, true, false));
                return hebVar;
            case 14:
                d35 d35Var = (d35) fc1.A0(((Number) a07Var.getValue()).intValue(), (List) a07Var2.getValue());
                str = d35Var != null ? d35Var.b : null;
                return str == null ? "" : str;
            case 15:
                koa koaVar = (koa) fc1.A0(((Number) a07Var.getValue()).intValue(), (List) a07Var2.getValue());
                str = koaVar != null ? koaVar.b : null;
                return str == null ? "" : str;
            case 16:
                a07Var2.setValue(new zd1());
                a07Var.setValue(Boolean.TRUE);
                return hebVar;
            case 17:
                a07Var2.setValue(Boolean.FALSE);
                a07Var.setValue(Boolean.TRUE);
                return hebVar;
            case 18:
                a07Var2.setValue(Boolean.FALSE);
                a07Var.setValue(Boolean.TRUE);
                return hebVar;
            case 19:
                a07Var2.setValue(Boolean.FALSE);
                a07Var.setValue(Boolean.TRUE);
                return hebVar;
            case 20:
                a07Var2.setValue(Boolean.FALSE);
                a07Var.setValue(Boolean.TRUE);
                return hebVar;
            case 21:
                a07Var2.setValue(Boolean.FALSE);
                a07Var.setValue(Boolean.TRUE);
                return hebVar;
            case 22:
                a07Var2.setValue(Boolean.FALSE);
                a07Var.setValue(Boolean.TRUE);
                return hebVar;
            case 23:
                a07Var2.setValue(Boolean.FALSE);
                a07Var.setValue(Boolean.TRUE);
                return hebVar;
            case 24:
                a07Var2.setValue(Boolean.TRUE);
                a07Var.setValue(Boolean.FALSE);
                return hebVar;
            case 25:
                a07Var2.setValue(Boolean.TRUE);
                a07Var.setValue(Boolean.FALSE);
                return hebVar;
            case 26:
                a07Var2.setValue(Boolean.TRUE);
                a07Var.setValue(Boolean.FALSE);
                return hebVar;
            default:
                zrb zrbVar = (zrb) fc1.A0(((Number) a07Var.getValue()).intValue(), (List) a07Var2.getValue());
                str = zrbVar != null ? zrbVar.b : null;
                return str == null ? "" : str;
        }
    }
}
