package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class ad7 {
    public static final zc7 Companion = new zc7();
    public final String a;
    public final String b;

    public /* synthetic */ ad7(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qu1.w0(i, 3, yc7.a.e());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad7)) {
            return false;
        }
        ad7 ad7Var = (ad7) obj;
        return lc5.Q(this.a, ad7Var.a) && lc5.Q(this.b, ad7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tw2.o("OldSyncCategory(id=", this.a, ", name=", this.b, ")");
    }
}
