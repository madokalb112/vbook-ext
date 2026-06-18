package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class o25 {
    public final int a;
    public final int b;
    public final int c;

    public o25(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o25)) {
            return false;
        }
        o25 o25Var = (o25) obj;
        return this.a == o25Var.a && this.b == o25Var.b && this.c == o25Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + tw2.d(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return tw2.q(xv5.t(this.a, this.b, "ImageScrollState(chapterIndex=", ", pageIndex=", ", pageCount="), this.c, ")");
    }
}
