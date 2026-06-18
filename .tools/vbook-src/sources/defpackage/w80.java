package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class w80 {
    public final x80 a;
    public final z80 b;
    public final y80 c;

    public w80(x80 x80Var, z80 z80Var, y80 y80Var) {
        this.a = x80Var;
        this.b = z80Var;
        this.c = y80Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w80)) {
            return false;
        }
        w80 w80Var = (w80) obj;
        return this.a.equals(w80Var.a) && this.b.equals(w80Var.b) && this.c.equals(w80Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.a + ", osData=" + this.b + ", deviceData=" + this.c + "}";
    }
}
