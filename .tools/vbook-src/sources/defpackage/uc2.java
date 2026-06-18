package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class uc2 {
    public final String a;
    public final String b;
    public final Map c;
    public final String d;
    public final String e;
    public final int f;
    public final long g;
    public final long h;

    public uc2(String str, String str2, Map map, String str3, String str4, int i, long j, long j2) {
        str.getClass();
        str2.getClass();
        map.getClass();
        this.a = str;
        this.b = str2;
        this.c = map;
        this.d = str3;
        this.e = str4;
        this.f = i;
        this.g = j;
        this.h = j2;
    }

    public static uc2 a(uc2 uc2Var, LinkedHashMap linkedHashMap) {
        String str = uc2Var.a;
        String str2 = uc2Var.b;
        String str3 = uc2Var.d;
        String str4 = uc2Var.e;
        int i = uc2Var.f;
        long j = uc2Var.g;
        long j2 = uc2Var.h;
        str.getClass();
        str2.getClass();
        return new uc2(str, str2, linkedHashMap, str3, str4, i, j, j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uc2)) {
            return false;
        }
        uc2 uc2Var = (uc2) obj;
        return lc5.Q(this.a, uc2Var.a) && lc5.Q(this.b, uc2Var.b) && lc5.Q(this.c, uc2Var.c) && lc5.Q(this.d, uc2Var.d) && lc5.Q(this.e, uc2Var.e) && this.f == uc2Var.f && this.g == uc2Var.g && this.h == uc2Var.h;
    }

    public final int hashCode() {
        int iB = j39.b(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return Long.hashCode(this.h) + xv5.b(tw2.d(this.f, (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("DbTocLink(id=", this.a, ", bookId=", this.b, ", title=");
        sbQ.append(this.c);
        sbQ.append(", path=");
        sbQ.append(this.d);
        sbQ.append(", parentId=");
        dx1.t(this.f, this.e, ", position=", ", createAt=", sbQ);
        sbQ.append(this.g);
        return dx1.l(sbQ, ", updateAt=", this.h, ")");
    }
}
