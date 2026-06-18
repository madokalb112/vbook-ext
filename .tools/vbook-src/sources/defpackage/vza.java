package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class vza {
    public final z63 a;
    public final z63 b;
    public final double c;
    public final wza d;
    public final boolean e;
    public final uza f;

    public vza(z63 z63Var, z63 z63Var2, double d, wza wzaVar, boolean z, uza uzaVar, int i) {
        z = (i & 16) != 0 ? true : z;
        uzaVar = (i & 32) != 0 ? uza.a : uzaVar;
        z63Var.getClass();
        z63Var2.getClass();
        this.a = z63Var;
        this.b = z63Var2;
        this.c = d;
        this.d = wzaVar;
        this.e = z;
        this.f = uzaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vza)) {
            return false;
        }
        vza vzaVar = (vza) obj;
        return lc5.Q(this.a, vzaVar.a) && lc5.Q(this.b, vzaVar.b) && Double.compare(this.c, vzaVar.c) == 0 && this.d == vzaVar.d && this.e == vzaVar.e && this.f == vzaVar.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + j39.c((this.d.hashCode() + ((Double.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e);
    }

    public final String toString() {
        return "ToneDeltaPair(roleA=" + this.a + ", roleB=" + this.b + ", delta=" + this.c + ", polarity=" + this.d + ", stayTogether=" + this.e + ", deltaConstraint=" + this.f + ")";
    }
}
