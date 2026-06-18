package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class r5b {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public r5b(String str, String str2, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r5b)) {
            return false;
        }
        r5b r5bVar = (r5b) obj;
        return this.a.equals(r5bVar.a) && this.b.equals(r5bVar.b) && this.c == r5bVar.c && this.d == r5bVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j39.c(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("Language(id=", this.a, ", name=", this.b, ", isSupportFrom=");
        sbQ.append(this.c);
        sbQ.append(", isSupportTo=");
        sbQ.append(this.d);
        sbQ.append(")");
        return sbQ.toString();
    }
}
