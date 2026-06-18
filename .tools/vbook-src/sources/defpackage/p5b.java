package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class p5b {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public p5b(String str, boolean z, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5b)) {
            return false;
        }
        p5b p5bVar = (p5b) obj;
        return this.a.equals(p5bVar.a) && this.b.equals(p5bVar.b) && this.c.equals(p5bVar.c) && this.d == p5bVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("Engine(id=", this.a, ", name=", this.b, ", description=");
        sbQ.append(this.c);
        sbQ.append(", isNetworkRequired=");
        sbQ.append(this.d);
        sbQ.append(")");
        return sbQ.toString();
    }
}
