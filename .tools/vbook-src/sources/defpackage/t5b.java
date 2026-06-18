package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class t5b {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;

    public t5b(int i, int i2, int i3, boolean z, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = z;
    }

    public static t5b a(t5b t5bVar, int i, int i2) {
        return new t5b(i, t5bVar.b, i2, t5bVar.f, t5bVar.d, t5bVar.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5b)) {
            return false;
        }
        t5b t5bVar = (t5b) obj;
        return this.a == t5bVar.a && this.b == t5bVar.b && this.c == t5bVar.c && this.d == t5bVar.d && this.e == t5bVar.e && this.f == t5bVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + tw2.d(this.e, tw2.d(this.d, tw2.d(this.c, tw2.d(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbT = xv5.t(this.a, this.b, "Segment(srcStart=", ", srcLen=", ", transStart=");
        ky0.u(this.c, this.d, ", transLen=", ", type=", sbT);
        sbT.append(this.e);
        sbT.append(", isPriv=");
        sbT.append(this.f);
        sbT.append(")");
        return sbT.toString();
    }
}
