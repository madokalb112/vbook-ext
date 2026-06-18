package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class q55 {
    public final p55 a;
    public final int b;
    public final int c;

    public q55(p55 p55Var, int i, int i2) {
        this.a = p55Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q55)) {
            return false;
        }
        q55 q55Var = (q55) obj;
        return this.a == q55Var.a && this.b == q55Var.b && this.c == q55Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + tw2.d(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImportProgress(phase=");
        sb.append(this.a);
        sb.append(", current=");
        sb.append(this.b);
        sb.append(", total=");
        return tw2.q(sb, this.c, ")");
    }
}
