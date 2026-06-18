package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zf1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;

    public zf1(String str, String str2, String str3, String str4, List list) {
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
    }

    public static zf1 a(zf1 zf1Var, String str, String str2, String str3, ArrayList arrayList, int i) {
        String str4 = zf1Var.b;
        List list = (i & 16) != 0 ? zf1Var.e : arrayList;
        zf1Var.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new zf1(str, str4, str2, str3, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zf1)) {
            return false;
        }
        zf1 zf1Var = (zf1) obj;
        return this.a.equals(zf1Var.a) && this.b.equals(zf1Var.b) && lc5.Q(this.c, zf1Var.c) && this.d.equals(zf1Var.d) && this.e.equals(zf1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j39.a(j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("Comment(name=", this.a, ", avatar=", this.b, ", content=");
        j39.y(sbQ, this.c, ", description=", this.d, ", subComments=");
        return tw2.t(sbQ, this.e, ")");
    }
}
