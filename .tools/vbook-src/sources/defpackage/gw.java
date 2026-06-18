package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class gw {
    public final char a;
    public final List b;
    public final ArrayList c;

    /* JADX WARN: Multi-variable type inference failed */
    public gw(char c, List list, ArrayList arrayList) {
        this.a = c;
        this.b = list;
        this.c = arrayList;
        gw[] gwVarArr = new gw[256];
        for (int i = 0; i < 256; i++) {
            ArrayList arrayList2 = this.c;
            int size = arrayList2.size();
            Object obj = null;
            boolean z = false;
            int i2 = 0;
            Object obj2 = null;
            while (true) {
                if (i2 < size) {
                    Object obj3 = arrayList2.get(i2);
                    i2++;
                    if (((gw) obj3).a == i) {
                        if (z) {
                            break;
                        }
                        z = true;
                        obj2 = obj3;
                    }
                } else if (z) {
                    obj = obj2;
                }
            }
            gwVarArr[i] = obj;
        }
    }
}
