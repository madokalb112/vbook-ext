package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class iy7 extends q2 {
    public final a91 a;
    public final dp5 b;

    public iy7(a91 a91Var) {
        a91Var.getClass();
        this.a = a91Var;
        this.b = ex1.Z(xu5.b, new wn6(this, 11));
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return (m39) this.b.getValue();
    }

    @Override // defpackage.q2
    public final a91 h() {
        return this.a;
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.a + ')';
    }
}
