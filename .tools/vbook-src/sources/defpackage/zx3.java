package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zx3 extends rw1 {
    public final int e;
    public final int f;
    public final String g;
    public final String h;

    public zx3(String str, int i, int i2, String str2) {
        str2.getClass();
        this.e = i;
        this.f = i2;
        this.g = str;
        this.h = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zx3)) {
            return false;
        }
        zx3 zx3Var = (zx3) obj;
        return this.e == zx3Var.e && this.f == zx3Var.f && this.g.equals(zx3Var.g) && lc5.Q(this.h, zx3Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + j39.a(tw2.d(this.f, Integer.hashCode(this.e) * 31, 31), 31, this.g);
    }

    public final String toString() {
        return tw2.s(xv5.t(this.e, this.f, "Replace(start=", ", end=", ", oldText="), this.g, ", newText=", this.h, ")");
    }
}
