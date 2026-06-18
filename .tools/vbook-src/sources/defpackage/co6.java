package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class co6 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n7c b;

    public /* synthetic */ co6(n7c n7cVar, int i) {
        this.a = i;
        this.b = n7cVar;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        heb hebVar = heb.a;
        n7c n7cVar = this.b;
        switch (i) {
            case 0:
                return Float.valueOf(wx1.P(Math.abs(1.0f - ((Number) n7cVar.f.getValue()).floatValue()), 0.0f, 1.0f));
            case 1:
                yd5 yd5Var = n7cVar.p;
                if (yd5Var != null) {
                    yd5Var.cancel(null);
                }
                n7cVar.q.setValue(Boolean.TRUE);
                return hebVar;
            case 2:
                n7cVar.q.setValue(Boolean.FALSE);
                return hebVar;
            case 3:
                Boolean bool = (Boolean) n7cVar.q.getValue();
                bool.booleanValue();
                return bool;
            case 4:
                return Float.valueOf(((int) (n7cVar.j() & 4294967295L)) != 0 ? Math.abs(n7cVar.e()) / ((int) (n7cVar.j() & 4294967295L)) : 0.0f);
            default:
                return Float.valueOf(Float.intBitsToFloat((int) (n7cVar.i() & 4294967295L)) != 0.0f ? n7cVar.e() : 0.0f);
        }
    }
}
