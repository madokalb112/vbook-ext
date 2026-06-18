package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class io2 implements po2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final float f;

    public io2(String str, String str2, String str3, String str4, String str5, float f) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io2)) {
            return false;
        }
        io2 io2Var = (io2) obj;
        return this.a.equals(io2Var.a) && this.b.equals(io2Var.b) && this.c.equals(io2Var.c) && this.d.equals(io2Var.d) && this.e.equals(io2Var.e) && Float.compare(this.f, io2Var.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + j39.a(j39.a(j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("Book(name=", this.a, ", cover=", this.b, ", extension=");
        j39.y(sbQ, this.c, ", path=", this.d, ", content=");
        sbQ.append(this.e);
        sbQ.append(", rate=");
        sbQ.append(this.f);
        sbQ.append(")");
        return sbQ.toString();
    }
}
