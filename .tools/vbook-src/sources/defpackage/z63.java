package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class z63 {
    public final String a;
    public final kb4 b;
    public final kb4 c;
    public final boolean d;
    public final kb4 e;
    public final kb4 f;
    public final kb4 g;
    public final kb4 h;
    public final kb4 i;
    public final kb4 j;
    public final HashMap k;

    public z63(String str, kb4 kb4Var, kb4 kb4Var2, boolean z, kb4 kb4Var3, kb4 kb4Var4, kb4 kb4Var5, kb4 kb4Var6, kb4 kb4Var7, kb4 kb4Var8) {
        str.getClass();
        kb4Var.getClass();
        this.a = str;
        this.b = kb4Var;
        this.c = kb4Var2;
        this.d = z;
        this.e = kb4Var3;
        this.f = kb4Var4;
        this.g = kb4Var5;
        this.h = kb4Var6;
        this.i = kb4Var7;
        this.j = kb4Var8;
        this.k = new HashMap();
    }

    public final double a(g73 g73Var) {
        g73Var.getClass();
        return (g73Var.l == id1.d ? p7c.d : p7c.c).k(this, g73Var);
    }

    public final y63 b() {
        y63 y63Var = new y63();
        String str = this.a;
        str.getClass();
        y63Var.a = str;
        kb4 kb4Var = this.b;
        kb4Var.getClass();
        y63Var.b = kb4Var;
        y63Var.c = this.c;
        y63Var.d = this.d;
        y63Var.e = this.e;
        y63Var.f = this.f;
        y63Var.g = this.g;
        y63Var.h = this.h;
        y63Var.i = this.i;
        y63Var.j = this.j;
        return y63Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z63)) {
            return false;
        }
        z63 z63Var = (z63) obj;
        return lc5.Q(this.a, z63Var.a) && lc5.Q(this.b, z63Var.b) && this.c.equals(z63Var.c) && this.d == z63Var.d && lc5.Q(this.e, z63Var.e) && lc5.Q(this.f, z63Var.f) && lc5.Q(this.g, z63Var.g) && lc5.Q(this.h, z63Var.h) && lc5.Q(this.i, z63Var.i) && lc5.Q(this.j, z63Var.j);
    }

    public final int hashCode() {
        int iC = j39.c((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        kb4 kb4Var = this.e;
        int iHashCode = (iC + (kb4Var == null ? 0 : kb4Var.hashCode())) * 31;
        kb4 kb4Var2 = this.f;
        int iHashCode2 = (iHashCode + (kb4Var2 == null ? 0 : kb4Var2.hashCode())) * 31;
        kb4 kb4Var3 = this.g;
        int iHashCode3 = (iHashCode2 + (kb4Var3 == null ? 0 : kb4Var3.hashCode())) * 31;
        kb4 kb4Var4 = this.h;
        int iHashCode4 = (iHashCode3 + (kb4Var4 == null ? 0 : kb4Var4.hashCode())) * 31;
        kb4 kb4Var5 = this.i;
        int iHashCode5 = (iHashCode4 + (kb4Var5 == null ? 0 : kb4Var5.hashCode())) * 31;
        kb4 kb4Var6 = this.j;
        return iHashCode5 + (kb4Var6 != null ? kb4Var6.hashCode() : 0);
    }

    public final String toString() {
        return "DynamicColor(name=" + this.a + ", palette=" + this.b + ", tone=" + this.c + ", isBackground=" + this.d + ", chromaMultiplier=" + this.e + ", background=" + this.f + ", secondBackground=" + this.g + ", contrastCurve=" + this.h + ", toneDeltaPair=" + this.i + ", opacity=" + this.j + ")";
    }
}
