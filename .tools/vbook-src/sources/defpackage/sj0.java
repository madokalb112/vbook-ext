package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class sj0 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rk0 b;

    public /* synthetic */ sj0(rk0 rk0Var, int i) {
        this.a = i;
        this.b = rk0Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        int i = this.a;
        int i2 = 0;
        heb hebVar = heb.a;
        jt1 jt1Var = null;
        rk0 rk0Var = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                za1 za1VarA = vtb.a(rk0Var);
                aj2 aj2Var = rw2.a;
                rk0Var.g(za1VarA, nh2.c, new mk0(rk0Var, str, jt1Var, i2));
                break;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                za1 za1VarA2 = vtb.a(rk0Var);
                aj2 aj2Var2 = rw2.a;
                rk0Var.g(za1VarA2, nh2.c, new vg(rk0Var, str2, jt1Var, 5));
                break;
            case 2:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (rk0Var.z != zBooleanValue) {
                    rk0Var.z = zBooleanValue;
                    ((my8) rk0Var.t).b.J.e(qt.T[34], Boolean.valueOf(!zBooleanValue));
                    fr9 fr9Var = rk0Var.v;
                    if (fr9Var != null) {
                        do {
                            value = fr9Var.getValue();
                        } while (!fr9Var.j(value, jk0.a((jk0) value, false, null, zBooleanValue, false, null, 27)));
                    }
                    if (rk0Var.y.length() != 0) {
                        yd5 yd5Var = rk0Var.C;
                        if (yd5Var != null) {
                            yd5Var.cancel(null);
                        }
                        za1 za1VarA3 = vtb.a(rk0Var);
                        aj2 aj2Var3 = rw2.a;
                        rk0Var.C = rk0Var.g(za1VarA3, nh2.c, new lk0(rk0Var, zBooleanValue, null, 0));
                    }
                }
                break;
            case 3:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                za1 za1VarA4 = vtb.a(rk0Var);
                aj2 aj2Var4 = rw2.a;
                rk0Var.g(za1VarA4, nh2.c, new qk0(rk0Var, zBooleanValue2, jt1Var, i2));
                break;
            default:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue3 = bool.booleanValue();
                if (rk0Var.A != zBooleanValue3) {
                    fr9 fr9Var2 = rk0Var.v;
                    if (fr9Var2 != null) {
                        do {
                            value2 = fr9Var2.getValue();
                        } while (!fr9Var2.j(value2, jk0.a((jk0) value2, false, null, false, zBooleanValue3, null, 23)));
                    }
                    rk0Var.A = zBooleanValue3;
                    ((my8) rk0Var.t).b.K.e(qt.T[35], bool);
                    if (rk0Var.y.length() != 0) {
                        za1 za1VarA5 = vtb.a(rk0Var);
                        aj2 aj2Var5 = rw2.a;
                        rk0Var.g(za1VarA5, nh2.c, new ne0(rk0Var, null, 1));
                    }
                }
                break;
        }
        return hebVar;
    }
}
