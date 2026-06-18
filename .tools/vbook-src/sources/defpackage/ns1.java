package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class ns1 {
    public static final ms1 Companion = new ms1();
    public final String a;
    public final boolean b;

    public /* synthetic */ ns1(int i, String str, boolean z) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = true;
        } else {
            this.b = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ns1)) {
            return false;
        }
        ns1 ns1Var = (ns1) obj;
        return lc5.Q(this.a, ns1Var.a) && this.b == ns1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ContextMenuDto(id=" + this.a + ", enabled=" + this.b + ")";
    }

    public ns1(String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
    }
}
