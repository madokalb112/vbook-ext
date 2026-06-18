package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class hj0 implements e37 {
    public static final gj0 Companion = new gj0();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ hj0(String str, String str2, int i, String str3) {
        if (7 != (i & 7)) {
            qu1.w0(i, 7, fj0.a.e());
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
        if (!(obj instanceof hj0)) {
            return false;
        }
        hj0 hj0Var = (hj0) obj;
        return lc5.Q(this.a, hj0Var.a) && lc5.Q(this.b, hj0Var.b) && lc5.Q(this.c, hj0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + j39.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ky0.s(this.c, ")", j39.q("BookListRoute(extensionId=", this.a, ", name=", this.b, ", data="));
    }

    public hj0(String str, String str2, String str3) {
        j39.v(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
