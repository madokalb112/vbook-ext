package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class bfa implements ifa {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;

    public bfa(String str, int i, int i2, int i3, String str2, String str3, String str4) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = str2;
        this.f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bfa)) {
            return false;
        }
        bfa bfaVar = (bfa) obj;
        return this.a.equals(bfaVar.a) && this.b == bfaVar.b && this.c == bfaVar.c && this.d == bfaVar.d && this.e.equals(bfaVar.e) && this.f.equals(bfaVar.f) && this.g.equals(bfaVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + j39.a(j39.a(tw2.d(this.d, tw2.d(this.c, tw2.d(this.b, this.a.hashCode() * 31, 31), 31), 31), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbN = dx1.n("TextNote(id=", this.a, ", chapterIndex=", ", start=", this.b);
        ky0.u(this.c, this.d, ", end=", ", note=", sbN);
        j39.y(sbN, this.e, ", description=", this.f, ", color=");
        return ky0.s(this.g, ")", sbN);
    }
}
