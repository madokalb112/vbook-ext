package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class tu3 {
    public final String a;
    public final String b;
    public final String c;
    public int d = -1;

    public tu3(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tu3)) {
            return false;
        }
        tu3 tu3Var = (tu3) obj;
        return this.a.equals(tu3Var.a) && this.b.equals(tu3Var.b) && this.c.equals(tu3Var.c);
    }

    public final int hashCode() {
        if (this.d == -1) {
            this.d = (this.a.hashCode() ^ this.b.hashCode()) ^ this.c.hashCode();
        }
        return this.d;
    }
}
