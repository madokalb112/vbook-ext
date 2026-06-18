package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class bbb {
    public final a91 a;
    public final pi5 b;

    public bbb(a91 a91Var, pi5 pi5Var) {
        this.a = a91Var;
        this.b = pi5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbb)) {
            return false;
        }
        pi5 pi5Var = this.b;
        if (pi5Var == null) {
            bbb bbbVar = (bbb) obj;
            if (bbbVar.b == null) {
                return this.a.equals(bbbVar.a);
            }
        }
        return lc5.Q(pi5Var, ((bbb) obj).b);
    }

    public final int hashCode() {
        pi5 pi5Var = this.b;
        return pi5Var != null ? pi5Var.hashCode() : this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeInfo(");
        Object obj = this.b;
        if (obj == null) {
            obj = this.a;
        }
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }
}
