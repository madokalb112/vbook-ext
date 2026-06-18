package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class he3 {
    public final a91 a;
    public final kb4 b;
    public final kb4 c;
    public final rj1 d;

    public he3(a91 a91Var, kb4 kb4Var, kb4 kb4Var2, rj1 rj1Var) {
        this.a = a91Var;
        this.b = kb4Var;
        this.c = kb4Var2;
        this.d = rj1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof he3) {
            he3 he3Var = (he3) obj;
            return this.a.equals(he3Var.a) && lc5.Q(this.b, he3Var.b) && this.c.equals(he3Var.c) && this.d == he3Var.d;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "EntryClassProvider(clazz=" + this.a + ", clazzContentKey=" + this.b + ", metadata=" + this.c + ", content=" + this.d + ')';
    }
}
