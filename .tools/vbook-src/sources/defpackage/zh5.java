package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zh5 {
    public final String a;
    public final int b;
    public final String c;

    public zh5(String str, int i, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zh5)) {
            return false;
        }
        zh5 zh5Var = (zh5) obj;
        return lc5.Q(this.a, zh5Var.a) && this.b == zh5Var.b && lc5.Q(this.c, zh5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + tw2.d(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return ky0.s(this.c, ")", dx1.n("KF8Resource(resourceType=", this.a, ", id=", ", type=", this.b));
    }
}
