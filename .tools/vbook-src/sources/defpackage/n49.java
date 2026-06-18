package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class n49 implements ib4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ kb4 c;
    public final /* synthetic */ kb4 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ n49(Long l, kb4 kb4Var, qsb qsbVar, boolean z, kb4 kb4Var2) {
        this.e = l;
        this.c = kb4Var;
        this.f = qsbVar;
        this.b = z;
        this.d = kb4Var2;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        heb hebVar = heb.a;
        Object obj = this.f;
        Object obj2 = this.e;
        kb4 kb4Var = this.d;
        kb4 kb4Var2 = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                Long l = (Long) obj2;
                qsb qsbVar = (qsb) obj;
                long jLongValue = l != null ? l.longValue() : 0L;
                if (jLongValue > 0) {
                    if (z) {
                        kb4Var.invoke(Boolean.TRUE);
                    }
                    kb4Var2.invoke(null);
                    mc8 mc8Var = k63.b;
                    qsbVar.b(lx1.A0(jLongValue, o63.MILLISECONDS));
                    qsbVar.a();
                } else {
                    kb4Var2.invoke(null);
                    qsbVar.a();
                }
                break;
            default:
                String str = (String) obj2;
                a07 a07Var = (a07) obj;
                if (!z) {
                    kb4Var.invoke(str);
                } else {
                    gba gbaVar = (gba) a07Var.getValue();
                    String str2 = gbaVar != null ? gbaVar.a : null;
                    if (str2 == null) {
                        str2 = "";
                    }
                    kb4Var2.invoke(str2);
                }
                break;
        }
        return hebVar;
    }

    public /* synthetic */ n49(boolean z, kb4 kb4Var, kb4 kb4Var2, String str, a07 a07Var) {
        this.b = z;
        this.c = kb4Var;
        this.d = kb4Var2;
        this.e = str;
        this.f = a07Var;
    }
}
