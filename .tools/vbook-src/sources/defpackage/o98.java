package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class o98 {
    public final n78 a;
    public final n78 b;
    public final n78 c;
    public final n78 d;
    public final n78 e;
    public final boolean f;
    public final long g;
    public final long h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final boolean o;
    public final boolean p;

    public o98(n78 n78Var, n78 n78Var2, n78 n78Var3, n78 n78Var4, n78 n78Var5, boolean z, long j, long j2, int i, int i2, int i3, int i4, int i5, int i6, boolean z2, boolean z3) {
        this.a = n78Var;
        this.b = n78Var2;
        this.c = n78Var3;
        this.d = n78Var4;
        this.e = n78Var5;
        this.f = z;
        this.g = j;
        this.h = j2;
        this.i = i;
        this.j = i2;
        this.k = i3;
        this.l = i4;
        this.m = i5;
        this.n = i6;
        this.o = z2;
        this.p = z3;
    }

    public static o98 a(o98 o98Var, n78 n78Var, n78 n78Var2, n78 n78Var3, n78 n78Var4, n78 n78Var5, boolean z, long j, long j2, int i, int i2, int i3, int i4, int i5, int i6, boolean z2, boolean z3, int i7) {
        n78 n78Var6 = (i7 & 1) != 0 ? o98Var.a : n78Var;
        n78 n78Var7 = (i7 & 2) != 0 ? o98Var.b : n78Var2;
        n78 n78Var8 = (i7 & 4) != 0 ? o98Var.c : n78Var3;
        n78 n78Var9 = (i7 & 8) != 0 ? o98Var.d : n78Var4;
        n78 n78Var10 = (i7 & 16) != 0 ? o98Var.e : n78Var5;
        boolean z4 = (i7 & 32) != 0 ? o98Var.f : z;
        long j3 = (i7 & 64) != 0 ? o98Var.g : j;
        long j4 = (i7 & Token.CASE) != 0 ? o98Var.h : j2;
        int i8 = (i7 & 256) != 0 ? o98Var.i : i;
        int i9 = (i7 & 512) != 0 ? o98Var.j : i2;
        int i10 = (i7 & 1024) != 0 ? o98Var.k : i3;
        int i11 = (i7 & 2048) != 0 ? o98Var.l : i4;
        n78 n78Var11 = n78Var6;
        int i12 = (i7 & 4096) != 0 ? o98Var.m : i5;
        int i13 = (i7 & 8192) != 0 ? o98Var.n : i6;
        boolean z5 = (i7 & 16384) != 0 ? o98Var.o : z2;
        boolean z6 = (i7 & 32768) != 0 ? o98Var.p : z3;
        o98Var.getClass();
        return new o98(n78Var11, n78Var7, n78Var8, n78Var9, n78Var10, z4, j3, j4, i8, i9, i10, i11, i12, i13, z5, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o98)) {
            return false;
        }
        o98 o98Var = (o98) obj;
        return lc5.Q(this.a, o98Var.a) && lc5.Q(this.b, o98Var.b) && lc5.Q(this.c, o98Var.c) && lc5.Q(this.d, o98Var.d) && lc5.Q(this.e, o98Var.e) && this.f == o98Var.f && this.g == o98Var.g && this.h == o98Var.h && this.i == o98Var.i && this.j == o98Var.j && this.k == o98Var.k && this.l == o98Var.l && this.m == o98Var.m && this.n == o98Var.n && this.o == o98Var.o && this.p == o98Var.p;
    }

    public final int hashCode() {
        n78 n78Var = this.a;
        int iHashCode = (n78Var == null ? 0 : n78Var.hashCode()) * 31;
        n78 n78Var2 = this.b;
        int iHashCode2 = (iHashCode + (n78Var2 == null ? 0 : n78Var2.hashCode())) * 31;
        n78 n78Var3 = this.c;
        int iHashCode3 = (iHashCode2 + (n78Var3 == null ? 0 : n78Var3.hashCode())) * 31;
        n78 n78Var4 = this.d;
        int iHashCode4 = (iHashCode3 + (n78Var4 == null ? 0 : n78Var4.hashCode())) * 31;
        n78 n78Var5 = this.e;
        return Boolean.hashCode(this.p) + j39.c(tw2.d(this.n, tw2.d(this.m, tw2.d(this.l, tw2.d(this.k, tw2.d(this.j, tw2.d(this.i, xv5.b(xv5.b(j39.c((iHashCode4 + (n78Var5 != null ? n78Var5.hashCode() : 0)) * 31, 31, this.f), 31, this.g), 31, this.h), 31), 31), 31), 31), 31), 31), 31, this.o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QtSettingState(vietPhrase=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", phienAm=");
        sb.append(this.c);
        sb.append(", pronouns=");
        sb.append(this.d);
        sb.append(", luatNhan=");
        sb.append(this.e);
        sb.append(", isDownloading=");
        sb.append(this.f);
        sb.append(", downloadProgress=");
        sb.append(this.g);
        dx1.z(sb, ", downloadTotal=", this.h, ", nameVpPriority=");
        ky0.u(this.i, this.j, ", personalGeneralPriority=", ", vpPriority=", sb);
        ky0.u(this.k, this.l, ", longestWord=", ", luatNhanMode=", sb);
        ky0.u(this.m, this.n, ", wordBreakMode=", ", isAutoConvertSimplified=", sb);
        sb.append(this.o);
        sb.append(", isDialogueItalicized=");
        sb.append(this.p);
        sb.append(")");
        return sb.toString();
    }
}
