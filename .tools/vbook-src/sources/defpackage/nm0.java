package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class nm0 {
    public ng a = null;
    public rc b = null;
    public hy0 c = null;
    public hh d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nm0)) {
            return false;
        }
        nm0 nm0Var = (nm0) obj;
        return lc5.Q(this.a, nm0Var.a) && lc5.Q(this.b, nm0Var.b) && lc5.Q(this.c, nm0Var.c) && lc5.Q(this.d, nm0Var.d);
    }

    public final int hashCode() {
        ng ngVar = this.a;
        int iHashCode = (ngVar == null ? 0 : ngVar.hashCode()) * 31;
        rc rcVar = this.b;
        int iHashCode2 = (iHashCode + (rcVar == null ? 0 : rcVar.hashCode())) * 31;
        hy0 hy0Var = this.c;
        int iHashCode3 = (iHashCode2 + (hy0Var == null ? 0 : hy0Var.hashCode())) * 31;
        hh hhVar = this.d;
        return iHashCode3 + (hhVar != null ? hhVar.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.a + ", canvas=" + this.b + ", canvasDrawScope=" + this.c + ", borderPath=" + this.d + ')';
    }
}
