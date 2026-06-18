package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class z25 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public z25(String str, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z25)) {
            return false;
        }
        z25 z25Var = (z25) obj;
        return this.a.equals(z25Var.a) && this.b == z25Var.b && this.c == z25Var.c && this.d == z25Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j39.c(j39.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "ImageSourceInfo(name=" + this.a + ", isSupportDownload=" + this.b + ", isSupportCheckNewChapter=" + this.c + ", isSupportShowChapterName=" + this.d + ")";
    }
}
