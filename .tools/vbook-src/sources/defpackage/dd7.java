package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class dd7 {
    public static final cd7 Companion = new cd7();
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final String f;

    public /* synthetic */ dd7(int i, int i2, String str, String str2, boolean z, boolean z2, String str3) {
        if ((i & 1) == 0) {
            this.a = 0;
        } else {
            this.a = i2;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z;
        }
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z2;
        }
        if ((i & 32) == 0) {
            this.f = "";
        } else {
            this.f = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd7)) {
            return false;
        }
        dd7 dd7Var = (dd7) obj;
        return this.a == dd7Var.a && lc5.Q(this.b, dd7Var.b) && lc5.Q(this.c, dd7Var.c) && this.d == dd7Var.d && this.e == dd7Var.e && lc5.Q(this.f, dd7Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + j39.c(j39.c(j39.a(j39.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbP = j39.p("OldSyncChapter(index=", ", url=", this.b, ", name=", this.a);
        j39.z(sbP, this.c, ", read=", this.d, ", downloaded=");
        sbP.append(this.e);
        sbP.append(", nameTrans=");
        sbP.append(this.f);
        sbP.append(")");
        return sbP.toString();
    }
}
