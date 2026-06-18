package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class ae7 {
    public static final zd7 Companion = new zd7();
    public final int a;
    public final String b;

    public /* synthetic */ ae7(int i, int i2, String str) {
        this.a = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ae7)) {
            return false;
        }
        ae7 ae7Var = (ae7) obj;
        return this.a == ae7Var.a && lc5.Q(this.b, ae7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "OldSyncPage(id=" + this.a + ", url=" + this.b + ")";
    }
}
