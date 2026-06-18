package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xn {
    public final a91 a;
    public final Object b;

    public xn(mu8 mu8Var) {
        a91 a91VarA = ug8.a(mu8Var.getClass());
        Object key = mu8Var.getKey();
        this.a = a91VarA;
        this.b = key;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xn)) {
            return false;
        }
        xn xnVar = (xn) obj;
        return lc5.Q(this.a, xnVar.a) && lc5.Q(this.b, xnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimatedSceneKey(clazz=");
        sb.append(this.a);
        sb.append(", key=");
        return xv5.r(sb, this.b, ')');
    }
}
