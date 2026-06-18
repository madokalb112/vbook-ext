package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class cp {
    public static final bp a = new bp("");

    public static final List a(bp bpVar, int i, int i2, e4 e4Var) {
        List list;
        if (i == i2 || (list = bpVar.a) == null) {
            return null;
        }
        int i3 = 0;
        if (i == 0 && i2 >= bpVar.b.length()) {
            if (e4Var == null) {
                return list;
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            while (i3 < size) {
                Object obj = list.get(i3);
                if (((Boolean) e4Var.invoke(((ap) obj).a)).booleanValue()) {
                    arrayList.add(obj);
                }
                i3++;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        while (i3 < size2) {
            ap apVar = (ap) list.get(i3);
            if (e4Var != null ? ((Boolean) e4Var.invoke(apVar.a)).booleanValue() : true) {
                int i4 = apVar.b;
                int i5 = apVar.c;
                if (b(i, i2, i4, i5)) {
                    arrayList2.add(new ap(wx1.Q(apVar.b, i, i2) - i, apVar.d, (xo) apVar.a, wx1.Q(i5, i, i2) - i));
                }
            }
            i3++;
        }
        return arrayList2;
    }

    public static final boolean b(int i, int i2, int i3, int i4) {
        return ((i < i4) & (i3 < i2)) | (((i == i2) | (i3 == i4)) & (i == i3));
    }
}
