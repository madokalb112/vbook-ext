package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class on9 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public on9(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof on9)) {
            return false;
        }
        on9 on9Var = (on9) obj;
        return lc5.Q(this.a, on9Var.a) && lc5.Q(this.b, on9Var.b) && lc5.Q(this.c, on9Var.c) && lc5.Q(this.d, on9Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return tw2.s(j39.q("SourceTrackSubtitle(data=", this.a, ", type=", this.b, ", label="), this.c, ", language=", this.d, ")");
    }
}
