package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class hv4 {
    public final bbb a;
    public final Object b;

    public hv4(bbb bbbVar, Object obj) {
        bbbVar.getClass();
        obj.getClass();
        this.a = bbbVar;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hv4)) {
            return false;
        }
        hv4 hv4Var = (hv4) obj;
        return lc5.Q(this.a, hv4Var.a) && lc5.Q(this.b, hv4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HttpResponseContainer(expectedType=");
        sb.append(this.a);
        sb.append(", response=");
        return xv5.r(sb, this.b, ')');
    }
}
