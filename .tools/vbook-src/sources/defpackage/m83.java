package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class m83 {
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;

    public m83(String str, boolean z, String str2, String str3) {
        str3.getClass();
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m83)) {
            return false;
        }
        m83 m83Var = (m83) obj;
        return this.a == m83Var.a && this.b.equals(m83Var.b) && this.c.equals(m83Var.c) && lc5.Q(this.d, m83Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j39.a(j39.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditDetailState(isLoading=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", author=");
        return tw2.s(sb, this.c, ", language=", this.d, ")");
    }
}
