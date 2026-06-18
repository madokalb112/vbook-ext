package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class f8b {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public f8b(int i, int i2, int i3, int i4, String str) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8b)) {
            return false;
        }
        f8b f8bVar = (f8b) obj;
        return lc5.Q(this.a, f8bVar.a) && this.b == f8bVar.b && this.c == f8bVar.c && this.d == f8bVar.d && this.e == f8bVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + tw2.d(this.d, tw2.d(this.c, tw2.d(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = dx1.n("Progress(bookId=", this.a, ", chapterIndex=", ", startIndex=", this.b);
        ky0.u(this.c, this.d, ", endIndex=", ", chapterLength=", sbN);
        return tw2.q(sbN, this.e, ")");
    }

    public /* synthetic */ f8b() {
        this(0, -1, -1, 0, "");
    }
}
