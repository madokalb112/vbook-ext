package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class wn1 implements g08 {
    public final ArrayList a;

    public wn1(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // defpackage.g08
    public final boolean test(Object obj) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return true;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            if (!((g08) obj2).test(obj)) {
                return false;
            }
        }
        return true;
    }
}
