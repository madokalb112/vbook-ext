package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class m9a {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public m9a(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m9a)) {
            return false;
        }
        m9a m9aVar = (m9a) obj;
        return this.a == m9aVar.a && this.b == m9aVar.b && this.c == m9aVar.c && this.d == m9aVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + tw2.d(this.c, tw2.d(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbT = xv5.t(this.a, this.b, "TagxTag(tag=", ", numValues=", ", bitmask=");
        sbT.append(this.c);
        sbT.append(", controlByte=");
        sbT.append(this.d);
        sbT.append(")");
        return sbT.toString();
    }
}
