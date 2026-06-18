package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class udb {
    public byte a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof udb)) {
            return false;
        }
        udb udbVar = (udb) obj;
        return this.a == udbVar.a && this.b.equals(udbVar.b) && this.c.equals(udbVar.c) && this.d.equals(udbVar.d) && this.e.equals(udbVar.e) && this.f.equals(udbVar.f) && this.g.equals(udbVar.g) && this.h.equals(udbVar.h) && this.i.equals(udbVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + j39.a(j39.a(j39.a(j39.a(j39.a(j39.a(j39.a(Byte.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        byte b = this.a;
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        String str4 = this.e;
        String str5 = this.f;
        String str6 = this.g;
        String str7 = this.h;
        String str8 = this.i;
        StringBuilder sbP = j39.p("UmdHeader(umdType=", ", title=", str, ", author=", b);
        j39.y(sbP, str2, ", year=", str3, ", month=");
        j39.y(sbP, str4, ", day=", str5, ", bookType=");
        j39.y(sbP, str6, ", bookMan=", str7, ", shopKeeper=");
        return ky0.s(str8, ")", sbP);
    }
}
