package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class mc5 extends nm8 {
    public int a;
    public final /* synthetic */ kb4 b;

    /* JADX WARN: Illegal instructions before constructor call */
    public mc5(kb4 kb4Var) {
        di1 di1Var = md2.e;
        this.b = kb4Var;
        super(di1Var);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        if (i == 0) {
            this.a = 1;
            e11.e0(obj);
            kb4 kb4Var = this.b;
            fw.F(1, kb4Var);
            return kb4Var.invoke(this);
        }
        if (i != 1) {
            gp.j("This coroutine had already completed");
            return null;
        }
        this.a = 2;
        e11.e0(obj);
        return obj;
    }
}
