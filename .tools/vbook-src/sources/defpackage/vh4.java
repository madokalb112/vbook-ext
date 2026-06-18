package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class vh4 implements xh4 {
    @Override // defpackage.xh4
    public final ArrayList a(pn2 pn2Var, int i, int i2) {
        pn2Var.getClass();
        int iMax = Math.max((i + i2) / (pn2Var.w0(150.0f) + i2), 1);
        int i3 = (i - ((iMax - 1) * i2)) / iMax;
        int i4 = i3 % iMax;
        ArrayList arrayList = new ArrayList(iMax);
        int i5 = 0;
        while (i5 < iMax) {
            arrayList.add(Integer.valueOf(((i4 <= 0 || i5 != 0) ? 0 : 1) + i3));
            i5++;
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof vh4) && x13.c(150.0f, 150.0f);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + tw2.c(150.0f, -31, 31);
    }
}
