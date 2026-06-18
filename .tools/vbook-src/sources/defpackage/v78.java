package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class v78 {
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final Map e;

    public v78(String str, int i, int i2, String str2, Map map) {
        str.getClass();
        map.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = map;
    }

    public static v78 a(v78 v78Var, int i, String str, int i2) {
        String str2 = v78Var.a;
        int i3 = v78Var.b;
        if ((i2 & 4) != 0) {
            i = v78Var.c;
        }
        int i4 = i;
        if ((i2 & 8) != 0) {
            str = v78Var.d;
        }
        Map map = v78Var.e;
        str2.getClass();
        map.getClass();
        return new v78(str2, i3, i4, str, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v78)) {
            return false;
        }
        v78 v78Var = (v78) obj;
        return lc5.Q(this.a, v78Var.a) && lc5.Q(this.d, v78Var.d) && this.b == v78Var.b && this.c == v78Var.c && this.e.size() == v78Var.e.size();
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.d;
        return this.e.size() + ((((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.b) * 31) + this.c) * 31);
    }

    public final String toString() {
        StringBuilder sbN = dx1.n("QtNERWord(word=", this.a, ", type=", ", count=", this.b);
        ky0.w(this.c, ", trans=", this.d, ", subTrans=", sbN);
        sbN.append(this.e);
        sbN.append(")");
        return sbN.toString();
    }
}
