package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ls9 extends uj7 {
    public final String c;
    public final int d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ls9(int i, int i2, String str, String str2, String str3, boolean z) {
        super("chapter_" + i, i);
        boolean z2 = (i2 & 8) == 0;
        str3 = (i2 & 32) != 0 ? null : str3;
        str2.getClass();
        this.c = str;
        this.d = i;
        this.e = str2;
        this.f = z2;
        this.g = z;
        this.h = str3;
    }

    @Override // defpackage.uj7
    public final int a() {
        return this.d * 100000;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ls9)) {
            return false;
        }
        ls9 ls9Var = (ls9) obj;
        return lc5.Q(this.c, ls9Var.c) && this.d == ls9Var.d && lc5.Q(this.e, ls9Var.e) && this.f == ls9Var.f && this.g == ls9Var.g && lc5.Q(this.h, ls9Var.h);
    }

    public final int hashCode() {
        int iC = j39.c(j39.c(j39.a(tw2.d(this.d, this.c.hashCode() * 31, 31), 31, this.e), 31, this.f), 31, this.g);
        String str = this.h;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbN = dx1.n("StatusPage(chapterName=", this.c, ", chapterIndex=", ", chapterPath=", this.d);
        j39.z(sbN, this.e, ", isLoading=", this.f, ", isError=");
        sbN.append(this.g);
        sbN.append(", errorMessage=");
        sbN.append(this.h);
        sbN.append(")");
        return sbN.toString();
    }
}
