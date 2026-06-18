package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class igb {
    public static final igb c = new igb(null, null);
    public final String a;
    public final Long b;

    public igb(String str, Long l) {
        this.a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof igb)) {
            return false;
        }
        igb igbVar = (igb) obj;
        return lc5.Q(this.a, igbVar.a) && lc5.Q(this.b, igbVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.b;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "UriMetadata(displayName=" + this.a + ", size=" + this.b + ")";
    }
}
