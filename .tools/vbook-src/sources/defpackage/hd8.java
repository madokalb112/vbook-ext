package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class hd8 implements e37 {
    public static final gd8 Companion = new gd8();
    public final String a;

    public /* synthetic */ hd8(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qu1.w0(i, 1, fd8.a.e());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hd8) && lc5.Q(this.a, ((hd8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return xv5.p("ReaderQtPrivNameRoute(bookId=", this.a, ")");
    }

    public hd8(String str) {
        str.getClass();
        this.a = str;
    }
}
