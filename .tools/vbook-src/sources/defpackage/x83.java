package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class x83 {
    public final String a;
    public final boolean b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final f6a j;

    public x83(String str, boolean z, long j, long j2, long j3, long j4, long j5, long j6, long j7, f6a f6aVar) {
        this.a = str;
        this.b = z;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = j5;
        this.h = j6;
        this.i = j7;
        this.j = f6aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x83)) {
            return false;
        }
        x83 x83Var = (x83) obj;
        return this.a.equals(x83Var.a) && this.b == x83Var.b && this.c == x83Var.c && this.d == x83Var.d && this.e == x83Var.e && this.f == x83Var.f && this.g == x83Var.g && this.h == x83Var.h && this.i == x83Var.i && this.j.equals(x83Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + xv5.b(xv5.b(xv5.b(xv5.b(xv5.b(xv5.b(xv5.b(j39.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditorTheme(name=");
        sb.append(this.a);
        sb.append(", dark=");
        sb.append(this.b);
        sb.append(", background=");
        sb.append(this.c);
        dx1.z(sb, ", foreground=", this.d, ", currentLineBackground=");
        sb.append(this.e);
        dx1.z(sb, ", selection=", this.f, ", lineNumber=");
        sb.append(this.g);
        dx1.z(sb, ", lineNumberActive=", this.h, ", gutter=");
        sb.append(this.i);
        sb.append(", syntax=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }
}
