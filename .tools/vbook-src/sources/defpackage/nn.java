package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class nn extends rl5 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t3b b;
    public final /* synthetic */ pn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nn(t3b t3bVar, pn pnVar, int i) {
        super(1);
        this.a = i;
        this.b = t3bVar;
        this.c = pnVar;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        pn pnVar = this.c;
        t3b t3bVar = this.b;
        switch (i) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                long j = iIntValue;
                return (Integer) t3bVar.invoke(Integer.valueOf(((int) (pn.d(pnVar) >> 32)) - ((int) (pnVar.b.a((j << 32) | (j & 4294967295L), pn.d(pnVar), zm5.a) >> 32))));
            default:
                int iIntValue2 = ((Number) obj).intValue();
                long j2 = iIntValue2;
                return (Integer) t3bVar.invoke(Integer.valueOf((-((int) (pnVar.b.a((j2 << 32) | (4294967295L & j2), pn.d(pnVar), zm5.a) >> 32))) - iIntValue2));
        }
    }
}
