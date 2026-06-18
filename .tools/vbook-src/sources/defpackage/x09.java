package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class x09 implements qb7, hc4 {
    public final /* synthetic */ ib4 a;

    public x09(ib4 ib4Var) {
        this.a = ib4Var;
    }

    @Override // defpackage.hc4
    public final ub4 a() {
        return this.a;
    }

    public final /* synthetic */ long b() {
        return ((eb7) this.a.invoke()).a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof qb7) && (obj instanceof hc4)) {
            return lc5.Q(a(), ((hc4) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }
}
