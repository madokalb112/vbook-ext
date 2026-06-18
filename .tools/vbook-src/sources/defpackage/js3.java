package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class js3 {
    public final String a;
    public final String b;
    public final boolean c;

    public /* synthetic */ js3(String str, int i) {
        this(str, (i & 2) != 0 ? "string" : "uint", false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof js3)) {
            return false;
        }
        js3 js3Var = (js3) obj;
        return lc5.Q(this.a, js3Var.a) && lc5.Q(this.b, js3Var.b) && this.c == js3Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + j39.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return xv5.q(")", j39.q("ExthRecordType(name=", this.a, ", type=", this.b, ", many="), this.c);
    }

    public js3(String str, String str2, boolean z) {
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
    }
}
