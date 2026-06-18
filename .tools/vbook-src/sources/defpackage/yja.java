package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class yja {
    public final int a;
    public final int b;
    public final int c;
    public final bp d;

    public yja(int i, int i2, int i3, bp bpVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = bpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yja)) {
            return false;
        }
        yja yjaVar = (yja) obj;
        return this.a == yjaVar.a && this.b == yjaVar.b && this.c == yjaVar.c;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sbT = xv5.t(this.a, this.b, "TextSearchContent(chapterIndex=", ", startIndex=", ", endIndex=");
        sbT.append(this.c);
        sbT.append(", searchContent=");
        sbT.append(this.d);
        sbT.append(")");
        return sbT.toString();
    }
}
