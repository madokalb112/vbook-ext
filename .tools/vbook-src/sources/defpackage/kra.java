package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class kra {
    public static final jra Companion = new jra();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ kra(String str, String str2, int i, String str3) {
        if (7 != (i & 7)) {
            qu1.w0(i, 7, ira.a.e());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kra)) {
            return false;
        }
        kra kraVar = (kra) obj;
        return lc5.Q(this.a, kraVar.a) && lc5.Q(this.b, kraVar.b) && lc5.Q(this.c, kraVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + j39.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ky0.s(this.c, ")", j39.q("ThemeColor(id=", this.a, ", color=", this.b, ", background="));
    }

    public kra(String str, String str2, String str3) {
        j39.v(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
