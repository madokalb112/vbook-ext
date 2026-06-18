package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ria {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final ArrayList f;
    public final int g;

    public ria(int i, int i2, int i3, int i4, int i5, ArrayList arrayList, int i6) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = arrayList;
        this.g = i6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ria)) {
            return false;
        }
        ria riaVar = (ria) obj;
        return riaVar.g == this.g && riaVar.a == this.a && riaVar.b == this.b && riaVar.c == this.c && riaVar.d == this.d && riaVar.e == this.e && riaVar.f.size() == this.f.size();
    }

    public final int hashCode() {
        return this.f.size() + tw2.d(this.e, ((((((((this.g * 31) + this.a) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31, 31);
    }

    public final String toString() {
        String strB = vaa.b(this.e);
        StringBuilder sbT = xv5.t(this.a, this.b, "Page(index=", ", start=", ", end=");
        ky0.u(this.c, this.d, ", columnCount=", ", textAlign=", sbT);
        sbT.append(strB);
        sbT.append(", columns=");
        sbT.append(this.f);
        sbT.append(", hash=");
        return tw2.q(sbT, this.g, ")");
    }
}
