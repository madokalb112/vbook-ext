package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class rkb {
    public static String a(Object obj) {
        Class cls;
        if (obj instanceof rkb) {
            return "VagueType";
        }
        cls = rkb.class;
        if (obj instanceof Class) {
            Class<rkb> clsO = tu1.O(ug8.a(cls));
            return !obj.equals(clsO != null ? clsO : rkb.class) ? ((Class) obj).toString() : "VagueType";
        }
        if (obj instanceof a91) {
            return !obj.equals(ug8.a(cls)) ? obj.toString() : "VagueType";
        }
        if (!(obj instanceof Collection)) {
            return obj.toString();
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(gc1.M(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            arrayList.add(next != null ? a(next) : null);
        }
        return arrayList.toString();
    }
}
