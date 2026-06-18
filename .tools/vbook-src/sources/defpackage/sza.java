package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class sza {
    public final double a;
    public final double b;
    public final zj4 c;

    public sza(double d, double d2, zj4 zj4Var) {
        this.a = d;
        this.b = d2;
        this.c = zj4Var;
        new HashMap();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sza)) {
            return false;
        }
        sza szaVar = (sza) obj;
        return Double.compare(this.a, szaVar.a) == 0 && Double.compare(this.b, szaVar.b) == 0 && this.c.equals(szaVar.c);
    }

    public final int hashCode() {
        return ((Double.hashCode(this.b) + (Double.hashCode(this.a) * 31)) * 31) + this.c.a;
    }

    public final String toString() {
        return "TonalPalette(hue=" + this.a + ", chroma=" + this.b + ", keyColor=" + this.c + ")";
    }
}
