package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ji0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public ji0(String str, String str2, String str3, String str4, String str5) {
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public static ji0 a(ji0 ji0Var, String str, String str2) {
        String str3 = ji0Var.b;
        String str4 = ji0Var.c;
        String str5 = ji0Var.e;
        ji0Var.getClass();
        str3.getClass();
        str4.getClass();
        str2.getClass();
        return new ji0(str, str3, str4, str2, str5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ji0)) {
            return false;
        }
        ji0 ji0Var = (ji0) obj;
        return this.a.equals(ji0Var.a) && lc5.Q(this.b, ji0Var.b) && lc5.Q(this.c, ji0Var.c) && this.d.equals(ji0Var.d) && this.e.equals(ji0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j39.a(j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("Book(name=", this.a, ", cover=", this.b, ", path=");
        j39.y(sbQ, this.c, ", description=", this.d, ", tag=");
        return ky0.s(this.e, ")", sbQ);
    }
}
