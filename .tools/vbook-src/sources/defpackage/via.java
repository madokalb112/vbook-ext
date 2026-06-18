package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class via {
    public final kf8 a;
    public final String b;
    public final String c;

    public via(kf8 kf8Var, String str, String str2) {
        this.a = kf8Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof via)) {
            return false;
        }
        via viaVar = (via) obj;
        return this.a.equals(viaVar.a) && this.b.equals(viaVar.b) && this.c.equals(viaVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + j39.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Placeholder(rect=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", data=");
        return ky0.s(this.c, ")", sb);
    }
}
