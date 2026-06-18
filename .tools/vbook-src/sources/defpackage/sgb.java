package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class sgb {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final boolean e;
    public final List f;

    public sgb(String str, String str2, String str3, int i, boolean z, List list) {
        j39.v(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = z;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sgb)) {
            return false;
        }
        sgb sgbVar = (sgb) obj;
        return lc5.Q(this.a, sgbVar.a) && lc5.Q(this.b, sgbVar.b) && lc5.Q(this.c, sgbVar.c) && this.d == sgbVar.d && this.e == sgbVar.e && this.f.equals(sgbVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + j39.c(tw2.d(this.d, j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("User(id=", this.a, ", name=", this.b, ", avatar=");
        dx1.t(this.d, this.c, ", role=", ", premium=", sbQ);
        sbQ.append(this.e);
        sbQ.append(", color=");
        sbQ.append(this.f);
        sbQ.append(")");
        return sbQ.toString();
    }
}
