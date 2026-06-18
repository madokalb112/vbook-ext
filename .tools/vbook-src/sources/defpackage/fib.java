package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class fib extends kt1 {
    public String a;
    public String b;
    public String c;
    public /* synthetic */ Object d;
    public final /* synthetic */ hib e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fib(hib hibVar, kt1 kt1Var) {
        super(kt1Var);
        this.e = hibVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.h(null, null, null, null, this);
    }
}
