package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class jl3 {
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final String i;
    public final String j;
    public final byte[] k;

    public jl3(int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, String str2, String str3, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = str;
        this.i = str2;
        this.j = str3;
        this.k = bArr;
    }

    public final boolean a() {
        return this.d;
    }

    public final boolean b() {
        return this.c;
    }

    public final boolean c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jl3)) {
            return false;
        }
        jl3 jl3Var = (jl3) obj;
        return this.a == jl3Var.a && this.b == jl3Var.b && this.c == jl3Var.c && this.d == jl3Var.d && this.e == jl3Var.e && this.f == jl3Var.f && this.g == jl3Var.g && this.h.equals(jl3Var.h) && this.i.equals(jl3Var.i) && this.j.equals(jl3Var.j) && lc5.Q(this.k, jl3Var.k);
    }

    public final int hashCode() {
        int iA = j39.a(j39.a(j39.a(j39.c(j39.c(j39.c(j39.c(j39.c(tw2.d(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
        byte[] bArr = this.k;
        return iA + (bArr == null ? 0 : Arrays.hashCode(bArr));
    }

    public final String toString() {
        String string = Arrays.toString(this.k);
        StringBuilder sbT = xv5.t(this.a, this.b, "ExportBookConfig(fromIndex=", ", toIndex=", ", includeTOCPage=");
        ky0.D(sbT, this.c, ", includeFirstPage=", this.d, ", includeTranslateContent=");
        ky0.D(sbT, this.e, ", includeChapterTitle=", this.f, ", mergeIntoSingleFile=");
        sbT.append(this.g);
        sbT.append(", introduction=");
        sbT.append(this.h);
        sbT.append(", customName=");
        j39.y(sbT, this.i, ", customAuthor=", this.j, ", customCoverBytes=");
        return ky0.s(string, ")", sbT);
    }
}
