package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zh1 implements g08 {
    public final Object a;
    public final qd2 b;

    public zh1(Object obj, qd2 qd2Var) {
        this.a = obj;
        this.b = qd2Var;
    }

    @Override // defpackage.g08
    public final boolean test(Object obj) {
        return lc5.Q(this.b.invoke(obj), this.a);
    }
}
