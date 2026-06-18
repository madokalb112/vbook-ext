package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class cka {
    public final long a;
    public final long b;

    public cka(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cka)) {
            return false;
        }
        cka ckaVar = (cka) obj;
        return lc1.d(this.a, ckaVar.a) && lc1.d(this.b, ckaVar.b);
    }

    public final int hashCode() {
        int i = lc1.k;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        xv5.x(this.a, ", selectionBackgroundColor=", sb);
        sb.append((Object) lc1.j(this.b));
        sb.append(')');
        return sb.toString();
    }
}
