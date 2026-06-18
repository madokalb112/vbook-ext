package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class m35 {
    public final int a;
    public final String b;
    public final List c;
    public final String d;

    public m35(int i, String str, String str2, List list) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = list;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m35)) {
            return false;
        }
        m35 m35Var = (m35) obj;
        return this.a == m35Var.a && lc5.Q(this.b, m35Var.b) && lc5.Q(this.c, m35Var.c) && lc5.Q(this.d, m35Var.d);
    }

    public final int hashCode() {
        int iA = j39.a(Integer.hashCode(this.a) * 31, 31, this.b);
        List list = this.c;
        int iHashCode = (iA + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbP = j39.p("ImageURL(chapterIndex=", ", url=", this.b, ", fallback=", this.a);
        sbP.append(this.c);
        sbP.append(", script=");
        sbP.append(this.d);
        sbP.append(")");
        return sbP.toString();
    }
}
