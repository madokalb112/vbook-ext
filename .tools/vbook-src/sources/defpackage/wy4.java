package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class wy4 {
    public final int a;
    public final String b;
    public final int c;

    public wy4(int i, String str, int i2) {
        this.a = i;
        this.b = str;
        this.c = i2;
    }

    public static wy4 a(wy4 wy4Var, int i, String str, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = wy4Var.a;
        }
        if ((i3 & 2) != 0) {
            str = wy4Var.b;
        }
        if ((i3 & 4) != 0) {
            i2 = wy4Var.c;
        }
        wy4Var.getClass();
        str.getClass();
        return new wy4(i, str, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wy4)) {
            return false;
        }
        wy4 wy4Var = (wy4) obj;
        return this.a == wy4Var.a && this.b.equals(wy4Var.b) && this.c == wy4Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + j39.a(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return tw2.q(j39.p("ImageChapterState(currentChapterIndex=", ", currentChapterName=", this.b, ", totalChapter=", this.a), this.c, ")");
    }
}
