package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class j9b extends kt1 {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ k9b c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j9b(k9b k9bVar, jt1 jt1Var) {
        super(jt1Var);
        this.c = k9bVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.u(this);
    }
}
