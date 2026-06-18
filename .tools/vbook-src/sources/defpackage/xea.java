package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xea implements ifa {
    public final boolean a;
    public final long b;
    public final o9a c;

    public xea(boolean z, long j, o9a o9aVar) {
        o9aVar.getClass();
        this.a = z;
        this.b = j;
        this.c = o9aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xea)) {
            return false;
        }
        xea xeaVar = (xea) obj;
        return this.a == xeaVar.a && eb7.c(this.b, xeaVar.b) && this.c == xeaVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + xv5.b(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "TextDirection(enabled=" + this.a + ", offset=" + eb7.j(this.b) + ", direction=" + this.c + ")";
    }
}
