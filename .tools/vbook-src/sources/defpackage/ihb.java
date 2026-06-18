package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ihb {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final List h;

    public ihb(String str, String str2, String str3, String str4, int i, boolean z, boolean z2, List list) {
        tw2.A(str, str2, str3, str4);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = z;
        this.g = z2;
        this.h = list;
    }

    public static ihb a(ihb ihbVar, boolean z, List list, int i) {
        String str = ihbVar.a;
        String str2 = ihbVar.b;
        String str3 = ihbVar.c;
        String str4 = ihbVar.d;
        int i2 = ihbVar.e;
        if ((i & 32) != 0) {
            z = ihbVar.f;
        }
        boolean z2 = ihbVar.g;
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        list.getClass();
        return new ihb(str, str2, str3, str4, i2, z, z2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ihb)) {
            return false;
        }
        ihb ihbVar = (ihb) obj;
        return lc5.Q(this.a, ihbVar.a) && lc5.Q(this.b, ihbVar.b) && lc5.Q(this.c, ihbVar.c) && lc5.Q(this.d, ihbVar.d) && this.e == ihbVar.e && this.f == ihbVar.f && this.g == ihbVar.g && this.h.equals(ihbVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + j39.c(j39.c(tw2.d(this.e, j39.a(j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("UserInfo(id=", this.a, ", name=", this.b, ", email=");
        j39.y(sbQ, this.c, ", avatar=", this.d, ", role=");
        j39.x(sbQ, this.e, ", premium=", this.f, ", verified=");
        sbQ.append(this.g);
        sbQ.append(", color=");
        sbQ.append(this.h);
        sbQ.append(")");
        return sbQ.toString();
    }
}
