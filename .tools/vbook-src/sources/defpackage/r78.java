package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class r78 {
    public static final q78 Companion = new q78();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ r78(String str, String str2, int i, String str3) {
        if (7 != (i & 7)) {
            qu1.w0(i, 7, p78.a.e());
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
        if (!(obj instanceof r78)) {
            return false;
        }
        r78 r78Var = (r78) obj;
        return lc5.Q(this.a, r78Var.a) && lc5.Q(this.b, r78Var.b) && lc5.Q(this.c, r78Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + j39.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ky0.s(this.c, ")", j39.q("QtLockupDto(id=", this.a, ", name=", this.b, ", url="));
    }

    public r78(String str, String str2, String str3) {
        j39.v(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
