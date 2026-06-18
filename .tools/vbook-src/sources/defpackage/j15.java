package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class j15 extends uj7 {
    public final int c;
    public final int d;
    public final int e;
    public final String f;
    public final List g;
    public final int h;
    public final int i;
    public final String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j15(int i, int i2, int i3, String str, List list, int i4, int i5, String str2) {
        super("image_" + i + "_" + i2, i);
        str.getClass();
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = str;
        this.g = list;
        this.h = i4;
        this.i = i5;
        this.j = str2;
    }

    @Override // defpackage.uj7
    public final int a() {
        return (this.c * 100000) + this.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j15)) {
            return false;
        }
        j15 j15Var = (j15) obj;
        return this.c == j15Var.c && this.d == j15Var.d && this.e == j15Var.e && lc5.Q(this.f, j15Var.f) && this.h == j15Var.h && this.i == j15Var.i;
    }

    public final int hashCode() {
        return this.f.hashCode() + (((((((((this.c * 31) + this.d) * 31) + this.e) * 31) + this.h) * 31) + this.i) * 31);
    }

    public final String toString() {
        StringBuilder sbT = xv5.t(this.c, this.d, "ImagePage(chapterIndex=", ", pageIndex=", ", pageCount=");
        ky0.w(this.e, ", path=", this.f, ", fallback=", sbT);
        sbT.append(this.g);
        sbT.append(", width=");
        sbT.append(this.h);
        sbT.append(", height=");
        sbT.append(this.i);
        sbT.append(", script=");
        sbT.append(this.j);
        sbT.append(")");
        return sbT.toString();
    }
}
