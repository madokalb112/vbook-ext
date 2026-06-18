package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class f6a {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    public f6a(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6a)) {
            return false;
        }
        f6a f6aVar = (f6a) obj;
        return this.a == f6aVar.a && this.b == f6aVar.b && this.c == f6aVar.c && this.d == f6aVar.d && this.e == f6aVar.e && this.f == f6aVar.f && this.g == f6aVar.g && this.h == f6aVar.h;
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + xv5.b(xv5.b(xv5.b(xv5.b(xv5.b(xv5.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbO = j39.o(this.a, "SyntaxColors(keyword=", ", string=");
        sbO.append(this.b);
        dx1.z(sbO, ", comment=", this.c, ", number=");
        sbO.append(this.d);
        dx1.z(sbO, ", function=", this.e, ", type=");
        sbO.append(this.f);
        dx1.z(sbO, ", variable=", this.g, ", operator=");
        return xv5.n(this.h, ")", sbO);
    }
}
