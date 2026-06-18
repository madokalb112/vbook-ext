package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class dkb extends kc4 implements kb4 {
    public final /* synthetic */ r07 a;
    public final /* synthetic */ pg8 b;
    public final /* synthetic */ kb4 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkb(r07 r07Var, pg8 pg8Var, kb4 kb4Var, int i) {
        super(1, kc5.class, "advanceExportStep", "exportBackup$advanceExportStep(Lkotlinx/coroutines/sync/Mutex;Lkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/functions/Function1;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = r07Var;
        this.b = pg8Var;
        this.c = kb4Var;
        this.d = i;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        kb4 kb4Var = this.c;
        int i = this.d;
        return pkb.d(this.a, this.b, kb4Var, i, (jt1) obj);
    }
}
