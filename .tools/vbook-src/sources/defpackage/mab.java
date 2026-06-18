package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class mab {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final int j;
    public final List k;
    public final String l;

    public mab(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, String str2, String str3, String str4, int i, List list, String str5) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = i;
        this.k = list;
        this.l = str5;
    }

    public static mab a(mab mabVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, String str2, String str3, int i, List list, int i2) {
        boolean z6 = (i2 & 1) != 0 ? mabVar.a : z;
        boolean z7 = (i2 & 2) != 0 ? mabVar.b : z2;
        boolean z8 = (i2 & 4) != 0 ? mabVar.c : z3;
        boolean z9 = (i2 & 8) != 0 ? mabVar.d : z4;
        boolean z10 = (i2 & 16) != 0 ? mabVar.e : z5;
        String str4 = (i2 & 32) != 0 ? mabVar.f : str;
        String str5 = (i2 & 64) != 0 ? mabVar.g : str2;
        String str6 = (i2 & Token.CASE) != 0 ? mabVar.h : str3;
        String str7 = mabVar.i;
        int i3 = (i2 & 512) != 0 ? mabVar.j : i;
        List list2 = (i2 & 1024) != 0 ? mabVar.k : list;
        String str8 = mabVar.l;
        mabVar.getClass();
        str5.getClass();
        return new mab(z6, z7, z8, z9, z10, str4, str5, str6, str7, i3, list2, str8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mab)) {
            return false;
        }
        mab mabVar = (mab) obj;
        return this.a == mabVar.a && this.b == mabVar.b && this.c == mabVar.c && this.d == mabVar.d && this.e == mabVar.e && this.f.equals(mabVar.f) && this.g.equals(mabVar.g) && this.h.equals(mabVar.h) && this.i.equals(mabVar.i) && this.j == mabVar.j && lc5.Q(this.k, mabVar.k) && this.l.equals(mabVar.l);
    }

    public final int hashCode() {
        int iD = tw2.d(this.j, j39.a(j39.a(j39.a(j39.a(j39.c(j39.c(j39.c(j39.c(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31);
        List list = this.k;
        return this.l.hashCode() + ((iD + (list == null ? 0 : list.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbR = j39.r("TxtState(isLoading=", this.a, ", isImporting=", this.b, ", isImported=");
        ky0.D(sbR, this.c, ", isChecking=", this.d, ", isError=");
        sbR.append(this.e);
        sbR.append(", bookName=");
        sbR.append(this.f);
        sbR.append(", bookLanguage=");
        j39.y(sbR, this.g, ", bookCharset=", this.h, ", bookCover=");
        dx1.t(this.j, this.i, ", regexCount=", ", chapters=", sbR);
        sbR.append(this.k);
        sbR.append(", errorMessage=");
        sbR.append(this.l);
        sbR.append(")");
        return sbR.toString();
    }
}
