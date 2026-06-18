package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class x80 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final rg2 f;

    public x80(String str, String str2, String str3, String str4, int i, rg2 rg2Var) {
        if (str == null) {
            k27.n("Null appIdentifier");
            throw null;
        }
        this.a = str;
        if (str2 == null) {
            k27.n("Null versionCode");
            throw null;
        }
        this.b = str2;
        if (str3 == null) {
            k27.n("Null versionName");
            throw null;
        }
        this.c = str3;
        if (str4 == null) {
            k27.n("Null installUuid");
            throw null;
        }
        this.d = str4;
        this.e = i;
        this.f = rg2Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x80) {
            x80 x80Var = (x80) obj;
            return this.a.equals(x80Var.a) && this.b.equals(x80Var.b) && this.c.equals(x80Var.c) && this.d.equals(x80Var.d) && this.e == x80Var.e && this.f == x80Var.f;
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() ^ ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003);
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.a + ", versionCode=" + this.b + ", versionName=" + this.c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f + "}";
    }
}
