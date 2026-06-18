package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class gab {
    public static final fab Companion = new fab();
    public final String a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;

    public /* synthetic */ gab(String str, String str2, boolean z, String str3, int i, String str4) {
        if (12 != (i & 12)) {
            qu1.w0(i, 12, eab.a.e());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = true;
        } else {
            this.b = z;
        }
        this.c = str2;
        this.d = str3;
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gab)) {
            return false;
        }
        gab gabVar = (gab) obj;
        return lc5.Q(this.a, gabVar.a) && this.b == gabVar.b && lc5.Q(this.c, gabVar.c) && lc5.Q(this.d, gabVar.d) && lc5.Q(this.e, gabVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j39.a(j39.a(j39.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TxtRuleDto(id=");
        sb.append(this.a);
        sb.append(", enabled=");
        sb.append(this.b);
        sb.append(", name=");
        j39.y(sb, this.c, ", rule=", this.d, ", example=");
        return ky0.s(this.e, ")", sb);
    }

    public gab(String str, String str2, String str3, String str4, boolean z) {
        tw2.A(str, str2, str3, str4);
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }
}
