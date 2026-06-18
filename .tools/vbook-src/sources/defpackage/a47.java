package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class a47 extends b47 {
    public final p37 a;
    public final int b;

    public a47(p37 p37Var, int i) {
        p37Var.getClass();
        this.a = p37Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a47.class != obj.getClass()) {
            return false;
        }
        a47 a47Var = (a47) obj;
        return this.b == a47Var.b && lc5.Q(this.a, a47Var.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InProgress(latestEvent=");
        sb.append(this.a);
        sb.append(", direction=");
        return tw2.p(sb, this.b, ')');
    }
}
