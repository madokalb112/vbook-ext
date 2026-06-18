package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ccb implements Comparable {
    public final byte a;

    public /* synthetic */ ccb(byte b) {
        this.a = b;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return lc5.V(this.a & 255, ((ccb) obj).a & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ccb) {
            return this.a == ((ccb) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.a);
    }

    public final String toString() {
        return String.valueOf(this.a & 255);
    }
}
