package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class jq3 extends kt1 {
    public kb5 a;
    public String b;
    public StringBuilder c;
    public /* synthetic */ Object d;
    public final /* synthetic */ mq3 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq3(mq3 mq3Var, kt1 kt1Var) {
        super(kt1Var);
        this.e = mq3Var;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return mq3.d(this.e, null, this);
    }
}
