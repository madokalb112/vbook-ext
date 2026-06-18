package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class py8 extends uj7 {
    public final String c;
    public final String d;
    public final int e;

    public py8(String str, String str2, int i) {
        super(dx1.f(i, "section_"), i);
        this.c = str;
        this.d = str2;
        this.e = i;
    }

    @Override // defpackage.uj7
    public final int a() {
        return this.e * 100000;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof py8)) {
            return false;
        }
        py8 py8Var = (py8) obj;
        return lc5.Q(this.c, py8Var.c) && lc5.Q(this.d, py8Var.d) && this.e == py8Var.e;
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        String str = this.d;
        return Integer.hashCode(this.e) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return tw2.q(j39.q("SectionPage(chapterName=", this.c, ", nextChapterName=", this.d, ", chapterIndex="), this.e, ")");
    }
}
