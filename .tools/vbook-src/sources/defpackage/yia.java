package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class yia {
    public static final yia d = new yia(-1, -1);
    public final int a;
    public final int b;
    public final int c;

    public yia(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = (i * 100000) + i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yia)) {
            return false;
        }
        yia yiaVar = (yia) obj;
        return this.a == yiaVar.a && this.b == yiaVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return xv5.j(this.a, this.b, "TextPosition(chapterIndex=", ", charIndex=", ")");
    }
}
