package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class np2 implements e37 {
    public static final mp2 Companion = new mp2();
    public final String a;
    public final String b;

    public /* synthetic */ np2(int i, String str, String str2) {
        if (1 != (i & 1)) {
            qu1.w0(i, 1, lp2.a.e());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof np2)) {
            return false;
        }
        np2 np2Var = (np2) obj;
        return lc5.Q(this.a, np2Var.a) && lc5.Q(this.b, np2Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return tw2.o("DetailRoute(path=", this.a, ", extensionId=", this.b, ")");
    }

    public np2(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }
}
