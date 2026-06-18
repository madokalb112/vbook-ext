package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class on extends rl5 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pn b;
    public final /* synthetic */ kb4 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ on(pn pnVar, kb4 kb4Var, int i) {
        super(1);
        this.a = i;
        this.b = pnVar;
        this.c = kb4Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        kb4 kb4Var = this.c;
        pn pnVar = this.b;
        switch (i) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                br9 br9Var = (br9) pnVar.d.g(pnVar.a.d.getValue());
                long j = iIntValue;
                return (Integer) kb4Var.invoke(Integer.valueOf((-((int) (pnVar.b.a((j << 32) | (j & 4294967295L), br9Var != null ? ((na5) br9Var.getValue()).a : 0L, zm5.a) >> 32))) - iIntValue));
            default:
                int iIntValue2 = ((Number) obj).intValue();
                br9 br9Var2 = (br9) pnVar.d.g(pnVar.a.d.getValue());
                long j2 = br9Var2 != null ? ((na5) br9Var2.getValue()).a : 0L;
                long j3 = iIntValue2;
                return (Integer) kb4Var.invoke(Integer.valueOf((-((int) (pnVar.b.a((j3 << 32) | (j3 & 4294967295L), j2, zm5.a) >> 32))) + ((int) (j2 >> 32))));
        }
    }
}
