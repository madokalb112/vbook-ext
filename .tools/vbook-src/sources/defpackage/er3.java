package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class er3 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final String f;
    public final String g;

    public er3(String str, String str2, String str3, String str4, List list, String str5, String str6) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
        this.f = str5;
        this.g = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof er3)) {
            return false;
        }
        er3 er3Var = (er3) obj;
        return lc5.Q(this.a, er3Var.a) && this.b.equals(er3Var.b) && this.c.equals(er3Var.c) && this.d.equals(er3Var.d) && this.e.equals(er3Var.e) && this.f.equals(er3Var.f) && this.g.equals(er3Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + j39.a(j39.d(j39.a(j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), this.e, 31), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("ExtensionSettingItem(key=", this.a, ", title=", this.b, ", subtitle=");
        j39.y(sbQ, this.c, ", defaultValue=", this.d, ", values=");
        sbQ.append(this.e);
        sbQ.append(", mode=");
        sbQ.append(this.f);
        sbQ.append(", format=");
        return ky0.s(this.g, ")", sbQ);
    }
}
