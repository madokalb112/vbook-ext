package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class wh4 implements xh4 {
    @Override // defpackage.xh4
    public final ArrayList a(pn2 pn2Var, int i, int i2) {
        pn2Var.getClass();
        int i3 = (i - (4 * i2)) / 5;
        int i4 = i3 % 5;
        ArrayList arrayList = new ArrayList(5);
        int i5 = 0;
        while (i5 < 5) {
            arrayList.add(Integer.valueOf(((i4 <= 0 || i5 != 0) ? 0 : 1) + i3));
            i5++;
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        return obj instanceof wh4;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + tw2.d(5, 31, 31);
    }
}
