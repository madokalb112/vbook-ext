package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class w83 {
    public final x83 a;
    public final int b;
    public final boolean c;
    public final int d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final cn7 h;
    public final cn7 i;
    public final cn7 j;
    public final cn7 k;
    public final cn7 l;
    public final cn7 m;
    public final cn7 n;
    public final cn7 o;

    public w83(x83 x83Var, int i) {
        x83Var = (i & 1) != 0 ? y83.a : x83Var;
        x83Var.getClass();
        this.a = x83Var;
        this.b = 4;
        this.c = true;
        this.d = 14;
        this.e = "JetBrains Mono";
        this.f = true;
        this.g = true;
        this.h = dk9.x(x83Var);
        this.i = dk9.x(4);
        this.j = dk9.x(false);
        this.k = dk9.x(true);
        this.l = dk9.x(14);
        this.m = dk9.x(true);
        this.n = dk9.x(true);
        this.o = dk9.x(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w83)) {
            return false;
        }
        w83 w83Var = (w83) obj;
        return lc5.Q(this.a, w83Var.a) && this.b == w83Var.b && this.c == w83Var.c && this.d == w83Var.d && lc5.Q(this.e, w83Var.e) && this.f == w83Var.f && this.g == w83Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + j39.c(j39.c(j39.a(tw2.d(this.d, j39.c(j39.c(tw2.d(this.b, this.a.hashCode() * 31, 31), 31, false), 31, this.c), 31), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditorSettings(theme=");
        sb.append(this.a);
        sb.append(", tabSize=");
        sb.append(this.b);
        sb.append(", useTabs=false, showLineNumbers=");
        sb.append(this.c);
        sb.append(", fontSize=");
        sb.append(this.d);
        sb.append(", fontFamily=");
        j39.z(sb, this.e, ", enableAutoIndent=", this.f, ", enableAutocomplete=");
        return xv5.q(", readOnly=false)", sb, this.g);
    }
}
