package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class bp1 {
    public int a;
    public String b;
    public String c;
    public int d;

    public final boolean equals(Object obj) {
        String str = this.c;
        String str2 = this.b;
        int i = this.a;
        if (!(obj instanceof bp1)) {
            return false;
        }
        bp1 bp1Var = (bp1) obj;
        return i == bp1Var.a && str2.equals(bp1Var.b) && str.equals(bp1Var.c);
    }

    public final int hashCode() {
        return this.d;
    }
}
