package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class s4c {
    public final String a;
    public final int b;
    public final boolean c;
    public final yz2 d;
    public final int e;
    public final long f;
    public final yy g;
    public final long h;
    public final long i;

    public s4c(String str, int i, boolean z, yz2 yz2Var, int i2, long j, yy yyVar, long j2, long j3) {
        str.getClass();
        yyVar.getClass();
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = yz2Var;
        this.e = i2;
        this.f = j;
        this.g = yyVar;
        this.h = j2;
        this.i = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4c)) {
            return false;
        }
        s4c s4cVar = (s4c) obj;
        return lc5.Q(this.a, s4cVar.a) && this.b == s4cVar.b && this.c == s4cVar.c && this.d.equals(s4cVar.d) && this.e == s4cVar.e && this.f == s4cVar.f && lc5.Q(this.g, s4cVar.g) && this.h == s4cVar.h && this.i == s4cVar.i;
    }

    public final int hashCode() {
        return Long.hashCode(this.i) + xv5.b((this.g.hashCode() + xv5.b(tw2.d(this.e, (this.d.hashCode() + j39.c(tw2.d(this.b, this.a.hashCode() * 31, 31), 31, this.c)) * 31, 31), 31, this.f)) * 31, 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ZipEntry2(path=");
        sb.append(this.a);
        sb.append(", compressionMethod=");
        sb.append(this.b);
        sb.append(", isDirectory=");
        sb.append(this.c);
        sb.append(", time=");
        sb.append(this.d);
        sb.append(", offset=");
        sb.append(this.e);
        sb.append(", inode=");
        sb.append(this.f);
        sb.append(", headerEntry=");
        sb.append(this.g);
        sb.append(", compressedSize=");
        sb.append(this.h);
        sb.append(", uncompressedSize=");
        return dx1.j(sb, this.i, ')');
    }
}
