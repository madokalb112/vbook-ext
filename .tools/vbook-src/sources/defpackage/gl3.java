package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class gl3 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final wk3 e;
    public final ArrayList f;

    public gl3(String str, String str2, String str3, String str4, wk3 wk3Var, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = wk3Var;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gl3)) {
            return false;
        }
        gl3 gl3Var = (gl3) obj;
        return this.a.equals(gl3Var.a) && this.b.equals(gl3Var.b) && this.c.equals(gl3Var.c) && this.d.equals(gl3Var.d) && lc5.Q(this.e, gl3Var.e) && this.f.equals(gl3Var.f);
    }

    public final int hashCode() {
        int iA = j39.a(j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        wk3 wk3Var = this.e;
        return this.f.hashCode() + ((iA + (wk3Var == null ? 0 : wk3Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("ExploreSection(id=", this.a, ", title=", this.b, ", subtitle=");
        j39.y(sbQ, this.c, ", type=", this.d, ", action=");
        sbQ.append(this.e);
        sbQ.append(", items=");
        sbQ.append(this.f);
        sbQ.append(")");
        return sbQ.toString();
    }
}
