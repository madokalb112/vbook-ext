package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class hn1 implements r84 {
    public final List a;

    public hn1(List list) {
        list.getClass();
        this.a = list;
    }

    @Override // defpackage.r84
    public s84 a() {
        List list = this.a;
        ArrayList arrayList = new ArrayList(gc1.M(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((k77) it.next()).a());
        }
        return arrayList.size() == 1 ? (s84) fc1.O0(arrayList) : new in1();
    }

    @Override // defpackage.r84
    public sn7 b() {
        List list = this.a;
        ArrayList arrayList = new ArrayList(gc1.M(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((k77) it.next()).b());
        }
        return tw1.E(arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hn1) {
            return lc5.Q(this.a, ((hn1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return xv5.s(new StringBuilder("ConcatenatedFormatStructure("), fc1.D0(this.a, ", ", null, null, null, 62), ')');
    }
}
