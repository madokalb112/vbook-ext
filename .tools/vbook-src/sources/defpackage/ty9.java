package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ty9 {
    public final q25 a;
    public final q05 b;
    public final d6a c = new d6a(new o39(this, 14));

    public ty9(q25 q25Var, q05 q05Var) {
        this.a = q25Var;
        this.b = q05Var;
    }

    public final String a() {
        return (String) this.c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty9)) {
            return false;
        }
        ty9 ty9Var = (ty9) obj;
        return this.a.equals(ty9Var.a) && lc5.Q(this.b, ty9Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        q05 q05Var = this.b;
        return iHashCode + (q05Var == null ? 0 : q05Var.hashCode());
    }

    public final String toString() {
        return "SubsamplingImage(imageSource=" + this.a + ", imageInfo=" + this.b + ')';
    }
}
