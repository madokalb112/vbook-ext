package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class gib extends kt1 {
    public hib a;
    public /* synthetic */ Object b;
    public final /* synthetic */ hib c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gib(hib hibVar, kt1 kt1Var) {
        super(kt1Var);
        this.c = hibVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        Object objA = hib.a(this.c, null, this);
        return objA == xx1.a ? objA : new qm8(objA);
    }
}
