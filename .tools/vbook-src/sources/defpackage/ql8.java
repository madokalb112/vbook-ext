package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ql8 {
    public final Set a;
    public final String b;
    public final long c;
    public final long d;

    public ql8(Set set, String str, long j, long j2) {
        this.a = set;
        this.b = str;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ql8)) {
            return false;
        }
        ql8 ql8Var = (ql8) obj;
        return this.a.equals(ql8Var.a) && this.b.equals(ql8Var.b) && this.c == ql8Var.c && this.d == ql8Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + xv5.b(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResourceItem(qualifiers=");
        sb.append(this.a);
        sb.append(", path=");
        sb.append(this.b);
        sb.append(", offset=");
        sb.append(this.c);
        return dx1.l(sb, ", size=", this.d, ")");
    }
}
