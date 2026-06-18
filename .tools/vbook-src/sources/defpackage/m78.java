package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class m78 {
    public static final l78 Companion = new l78();
    public final String a;
    public final int b;

    public /* synthetic */ m78(int i, String str, int i2) {
        if (3 != (i & 3)) {
            qu1.w0(i, 3, k78.a.e());
            throw null;
        }
        this.a = str;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m78)) {
            return false;
        }
        m78 m78Var = (m78) obj;
        return lc5.Q(this.a, m78Var.a) && this.b == m78Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "QtDicDto(path=" + this.a + ", size=" + this.b + ")";
    }

    public m78(String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
    }
}
