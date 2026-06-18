package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class uta {
    public static final tta Companion = new tta();
    public final long a;
    public final long b;
    public final long c;

    public /* synthetic */ uta(int i, long j, long j2, long j3) {
        if (1 != (i & 1)) {
            qu1.w0(i, 1, sta.a.e());
            throw null;
        }
        this.a = j;
        this.b = (i & 2) == 0 ? j * 1000 : j2;
        if ((i & 4) == 0) {
            this.c = j / 1000;
        } else {
            this.c = j3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uta) && this.a == ((uta) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return dx1.j(new StringBuilder("Time(ms="), this.a, ')');
    }

    public uta(long j) {
        this.a = j;
        this.b = j * 1000;
        this.c = j / 1000;
    }
}
