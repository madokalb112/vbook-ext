package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class s14 {
    public final String a;
    public final rj1 b;

    public s14(String str, rj1 rj1Var) {
        str.getClass();
        this.a = str;
        this.b = rj1Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s14)) {
            return false;
        }
        return lc5.Q(this.a, ((s14) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
