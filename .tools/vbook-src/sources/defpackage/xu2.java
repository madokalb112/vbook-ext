package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class xu2 implements e37 {
    public static final wu2 Companion = new wu2();
    public final String a;
    public final String b;

    public /* synthetic */ xu2(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qu1.w0(i, 3, vu2.a.e());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xu2)) {
            return false;
        }
        xu2 xu2Var = (xu2) obj;
        return lc5.Q(this.a, xu2Var.a) && lc5.Q(this.b, xu2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tw2.o("DiscoverySearchRoute(extensionId=", this.a, ", searchKey=", this.b, ")");
    }

    public xu2(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }
}
