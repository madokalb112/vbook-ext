package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class g70 extends jz1 {
    public final String a;
    public final String b;
    public final List c;
    public final jz1 d;
    public final int e;

    public g70(String str, String str2, List list, jz1 jz1Var, int i) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = jz1Var;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jz1) {
            g70 g70Var = (g70) ((jz1) obj);
            if (this.a.equals(g70Var.a)) {
                String str = g70Var.b;
                String str2 = this.b;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.c.equals(g70Var.c)) {
                        jz1 jz1Var = g70Var.d;
                        jz1 jz1Var2 = this.d;
                        if (jz1Var2 != null ? jz1Var2.equals(jz1Var) : jz1Var == null) {
                            if (this.e == g70Var.e) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        jz1 jz1Var = this.d;
        return this.e ^ ((iHashCode2 ^ (jz1Var != null ? jz1Var.hashCode() : 0)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Exception{type=");
        sb.append(this.a);
        sb.append(", reason=");
        sb.append(this.b);
        sb.append(", frames=");
        sb.append(this.c);
        sb.append(", causedBy=");
        sb.append(this.d);
        sb.append(", overflowCount=");
        return tw2.q(sb, this.e, "}");
    }
}
