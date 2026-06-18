package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class u32 {
    public final t32 a;
    public final t32 b;
    public final double c;

    public u32(t32 t32Var, t32 t32Var2, double d) {
        this.a = t32Var;
        this.b = t32Var2;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u32)) {
            return false;
        }
        u32 u32Var = (u32) obj;
        return this.a == u32Var.a && this.b == u32Var.b && Double.compare(this.c, u32Var.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.a + ", crashlytics=" + this.b + ", sessionSamplingRate=" + this.c + ')';
    }
}
