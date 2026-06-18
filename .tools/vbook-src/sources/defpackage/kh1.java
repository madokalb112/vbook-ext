package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class kh1 implements e37 {
    public static final jh1 Companion = new jh1();
    public final String a;

    public /* synthetic */ kh1(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qu1.w0(i, 1, ih1.a.e());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kh1) && lc5.Q(this.a, ((kh1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return xv5.p("CommunityShareSearchRoute(searchKey=", this.a, ")");
    }

    public kh1(String str) {
        str.getClass();
        this.a = str;
    }
}
