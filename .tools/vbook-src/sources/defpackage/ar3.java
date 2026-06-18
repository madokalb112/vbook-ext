package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ar3 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;

    public ar3(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ar3)) {
            return false;
        }
        ar3 ar3Var = (ar3) obj;
        return this.a.equals(ar3Var.a) && this.b.equals(ar3Var.b) && this.c.equals(ar3Var.c) && this.d.equals(ar3Var.d) && this.e.equals(ar3Var.e) && this.f.equals(ar3Var.f) && this.g.equals(ar3Var.g) && this.h.equals(ar3Var.h) && this.i.equals(ar3Var.i) && this.j.equals(ar3Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + j39.a(j39.a(j39.a(j39.a(j39.a(j39.a(j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("ExtensionScript(discovery=", this.a, ", home=", this.b, ", explore=");
        j39.y(sbQ, this.c, ", genre=", this.d, ", search=");
        j39.y(sbQ, this.e, ", detail=", this.f, ", page=");
        j39.y(sbQ, this.g, ", toc=", this.h, ", chap=");
        return tw2.s(sbQ, this.i, ", track=", this.j, ")");
    }
}
