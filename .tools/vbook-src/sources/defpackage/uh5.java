package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class uh5 extends rh6 {
    public static final byte[] o = iw9.B("pagebreak");
    public ArrayList m;
    public LinkedHashMap n;

    public static final o7a i(v07 v07Var) {
        ArrayList arrayList;
        Integer num = v07Var.b;
        num.getClass();
        String strR = ky0.r("filepos:", bw9.i0(10, String.valueOf(num.intValue())));
        String str = v07Var.d;
        ArrayList arrayList2 = v07Var.j;
        if (arrayList2 != null) {
            arrayList = new ArrayList(gc1.M(arrayList2, 10));
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                arrayList.add(i((v07) obj));
            }
        } else {
            arrayList = null;
        }
        return new o7a(str, strR, arrayList);
    }

    public static final void j(uh5 uh5Var, o7a o7aVar) {
        int iG = uh5Var.g(o7aVar.b);
        if (iG == -1) {
            return;
        }
        LinkedHashMap linkedHashMap = uh5Var.n;
        if (linkedHashMap == null) {
            lc5.i0("sectionIdMap");
            throw null;
        }
        Integer numValueOf = Integer.valueOf(iG);
        Object arrayList = linkedHashMap.get(numValueOf);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(numValueOf, arrayList);
        }
        ((ArrayList) arrayList).add(o7aVar);
        List list = o7aVar.c;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                j(uh5Var, (o7a) it.next());
            }
        }
    }

    public final int g(String str) {
        Integer numL = iw9.L(10, bw9.s0(str, "filepos:", str));
        if (numL == null) {
            return -1;
        }
        int iIntValue = numL.intValue();
        ArrayList arrayList = this.m;
        if (arrayList == null) {
            lc5.i0("sections");
            throw null;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (((vh5) obj).c > iIntValue) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final String h(vh5 vh5Var) {
        vh5Var.getClass();
        qh6 qh6Var = new qh6(this);
        qh6Var.d(vh5Var.b);
        int i = vh5Var.d;
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = qh6Var.c();
        }
        return this.h.a(bArr);
    }
}
