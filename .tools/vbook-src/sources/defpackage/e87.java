package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class e87 implements g87 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public e87(String str, String str2, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e87)) {
            return false;
        }
        e87 e87Var = (e87) obj;
        return this.a.equals(e87Var.a) && this.b.equals(e87Var.b) && this.c == e87Var.c && this.d == e87Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + tw2.d(this.c, j39.a(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("NewChapter(bookId=", this.a, ", bookName=", this.b, ", bookType=");
        sbQ.append(this.c);
        sbQ.append(", newChapterCount=");
        sbQ.append(this.d);
        sbQ.append(")");
        return sbQ.toString();
    }
}
