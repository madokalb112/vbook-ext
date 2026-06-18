package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class isb implements c24 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qsb b;

    public /* synthetic */ isb(qsb qsbVar, int i) {
        this.a = i;
        this.b = qsbVar;
    }

    @Override // defpackage.c24
    public final Object b(Object obj, jt1 jt1Var) {
        int i = this.a;
        heb hebVar = heb.a;
        qsb qsbVar = this.b;
        switch (i) {
            case 0:
                qsbVar.a.k((hv7) obj);
                break;
            case 1:
                long jLongValue = ((Number) obj).longValue();
                fr9 fr9Var = qsbVar.b;
                Long l = new Long(jLongValue);
                fr9Var.getClass();
                fr9Var.l(null, l);
                break;
            case 2:
                long jLongValue2 = ((Number) obj).longValue();
                fr9 fr9Var2 = qsbVar.c;
                Long l2 = new Long(jLongValue2);
                fr9Var2.getClass();
                fr9Var2.l(null, l2);
                break;
            case 3:
                long j = ((na5) obj).a;
                fr9 fr9Var3 = qsbVar.d;
                na5 na5Var = new na5(j);
                fr9Var3.getClass();
                fr9Var3.l(null, na5Var);
                break;
            default:
                float fFloatValue = ((Number) obj).floatValue();
                fr9 fr9Var4 = qsbVar.e;
                Float f = new Float(fFloatValue);
                fr9Var4.getClass();
                fr9Var4.l(null, f);
                break;
        }
        return hebVar;
    }
}
