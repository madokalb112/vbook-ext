package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class oia {
    public final long a;
    public final long b;

    public oia(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oia)) {
            return false;
        }
        oia oiaVar = (oia) obj;
        return spa.a(this.a, oiaVar.a) && spa.a(this.b, oiaVar.b);
    }

    public final int hashCode() {
        tpa[] tpaVarArr = spa.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return tw2.o("TextPaddingValues(horizontal=", spa.f(this.a), ", vertical=", spa.f(this.b), ")");
    }
}
