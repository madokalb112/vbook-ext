package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class vwa {
    public static final uwa Companion = new uwa();
    public final String a;

    public /* synthetic */ vwa(int i, String str) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vwa) && lc5.Q(this.a, ((vwa) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return xv5.p("TokenDto(token=", this.a, ")");
    }
}
