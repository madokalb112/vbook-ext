package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class trb {
    public final long a;
    public final long b;

    public trb(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof trb)) {
            return false;
        }
        trb trbVar = (trb) obj;
        return this.a == trbVar.a && this.b == trbVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return xv5.n(this.b, ")", j39.o(this.a, "VideoSourceTrackTimeSkip(fromTime=", ", toTime="));
    }
}
