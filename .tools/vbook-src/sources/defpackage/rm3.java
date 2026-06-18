package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class rm3 {
    public static final ra1 g = new ra1(24);
    public final om3 a;
    public final int b;
    public final int c;
    public final pm3 d;
    public final String e;
    public final String f;

    public rm3(om3 om3Var, int i, int i2, pm3 pm3Var, String str, String str2) {
        str.getClass();
        this.a = om3Var;
        this.b = i;
        this.c = i2;
        this.d = pm3Var;
        this.e = str;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rm3)) {
            return false;
        }
        rm3 rm3Var = (rm3) obj;
        return this.a == rm3Var.a && this.b == rm3Var.b && this.c == rm3Var.c && this.d == rm3Var.d && lc5.Q(this.e, rm3Var.e) && lc5.Q(this.f, rm3Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + j39.a((this.d.hashCode() + tw2.d(this.c, tw2.d(this.b, this.a.hashCode() * 31, 31), 31)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExportState(phase=");
        sb.append(this.a);
        sb.append(", current=");
        sb.append(this.b);
        sb.append(", total=");
        sb.append(this.c);
        sb.append(", status=");
        sb.append(this.d);
        sb.append(", message=");
        return tw2.s(sb, this.e, ", filePath=", this.f, ")");
    }

    public /* synthetic */ rm3(om3 om3Var, int i, int i2, pm3 pm3Var, String str, int i3) {
        this(om3Var, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, pm3Var, str, "");
    }
}
