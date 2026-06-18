package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class nba {
    public final int a;
    public final String b;
    public final int c;

    public nba(int i, String str, int i2) {
        this.a = i;
        this.b = str;
        this.c = i2;
    }

    public static nba a(nba nbaVar, int i, String str, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = nbaVar.a;
        }
        if ((i3 & 2) != 0) {
            str = nbaVar.b;
        }
        if ((i3 & 4) != 0) {
            i2 = nbaVar.c;
        }
        nbaVar.getClass();
        str.getClass();
        return new nba(i, str, i2);
    }

    public final int b() {
        return this.a;
    }

    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nba)) {
            return false;
        }
        nba nbaVar = (nba) obj;
        return this.a == nbaVar.a && this.b.equals(nbaVar.b) && this.c == nbaVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + j39.a(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return tw2.q(j39.p("TextChapterState(currentChapterIndex=", ", currentChapterName=", this.b, ", totalChapter=", this.a), this.c, ")");
    }
}
