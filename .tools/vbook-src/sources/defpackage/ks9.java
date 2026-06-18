package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ks9 extends tj7 {
    public final String d;
    public final int e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks9(String str, int i, String str2, boolean z, boolean z2, boolean z3, String str3) {
        super("chapter_" + i, i, str);
        str2.getClass();
        this.d = str;
        this.e = i;
        this.f = str2;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ks9)) {
            return false;
        }
        ks9 ks9Var = (ks9) obj;
        return lc5.Q(this.d, ks9Var.d) && this.e == ks9Var.e && lc5.Q(this.f, ks9Var.f) && this.g == ks9Var.g && this.h == ks9Var.h && this.i == ks9Var.i && lc5.Q(this.j, ks9Var.j);
    }

    public final int hashCode() {
        int iC = j39.c(j39.c(j39.c(j39.a(tw2.d(this.e, this.d.hashCode() * 31, 31), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        String str = this.j;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbN = dx1.n("StatusPage(chapterName=", this.d, ", chapterIndex=", ", chapterPath=", this.e);
        j39.z(sbN, this.f, ", hasPageSource=", this.g, ", isLoading=");
        ky0.D(sbN, this.h, ", isError=", this.i, ", errorMessage=");
        return ky0.s(this.j, ")", sbN);
    }
}
