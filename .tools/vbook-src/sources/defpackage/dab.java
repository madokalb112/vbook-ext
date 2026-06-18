package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class dab {
    public final String a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;

    public dab(String str, String str2, String str3, String str4, boolean z) {
        tw2.A(str, str2, str3, str4);
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public static dab a(dab dabVar, boolean z, String str, String str2, String str3, int i) {
        boolean z2 = z;
        String str4 = dabVar.a;
        if ((i & 2) != 0) {
            z2 = dabVar.b;
        }
        if ((i & 4) != 0) {
            str = dabVar.c;
        }
        if ((i & 8) != 0) {
            str2 = dabVar.d;
        }
        if ((i & 16) != 0) {
            str3 = dabVar.e;
        }
        dabVar.getClass();
        str4.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new dab(str4, str, str2, str3, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dab)) {
            return false;
        }
        dab dabVar = (dab) obj;
        return lc5.Q(this.a, dabVar.a) && this.b == dabVar.b && lc5.Q(this.c, dabVar.c) && lc5.Q(this.d, dabVar.d) && lc5.Q(this.e, dabVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j39.a(j39.a(j39.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TxtRule(id=");
        sb.append(this.a);
        sb.append(", enabled=");
        sb.append(this.b);
        sb.append(", name=");
        j39.y(sb, this.c, ", rule=", this.d, ", example=");
        return ky0.s(this.e, ")", sb);
    }
}
