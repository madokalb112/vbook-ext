package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class jh6 extends lfb {
    public final jj7 e;

    public jh6(jj7 jj7Var) {
        super(eua.b, jj7Var == jj7.a ? 2 : 1, jj7Var == jj7.b ? 2 : null);
        this.e = jj7Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jh6) {
            return this.e == ((jh6) obj).e;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
