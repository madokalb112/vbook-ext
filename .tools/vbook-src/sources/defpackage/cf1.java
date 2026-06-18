package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class cf1 {
    public final int a;
    public final int b;

    public cf1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cf1)) {
            return false;
        }
        cf1 cf1Var = (cf1) obj;
        return this.a == cf1Var.a && this.b == cf1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return xv5.j(this.a, this.b, "DownloadProgress(downloaded=", ", size=", ")");
    }
}
