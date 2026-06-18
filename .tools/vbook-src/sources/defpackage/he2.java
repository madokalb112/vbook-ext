package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class he2 implements xw2 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Set b;
    public final /* synthetic */ Set c;
    public final /* synthetic */ a07 d;
    public final /* synthetic */ a07 e;

    public he2(Object obj, Set set, Set set2, a07 a07Var, a07 a07Var2) {
        this.a = obj;
        this.b = set;
        this.c = set2;
        this.d = a07Var;
        this.e = a07Var2;
    }

    @Override // defpackage.xw2
    public final void a() {
        ArrayList arrayList;
        List list = (List) this.d.getValue();
        if (list instanceof RandomAccess) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(((c37) list.get(i)).b);
            }
        } else {
            arrayList = new ArrayList(gc1.M(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((c37) it.next()).b);
            }
        }
        Object obj = this.a;
        if (!(arrayList.contains(obj) ? false : this.b.remove(obj)) || this.c.contains(obj)) {
            return;
        }
        List list2 = (List) this.e.getValue();
        if (!(list2 instanceof RandomAccess)) {
            Iterator it2 = fc1.N0(list2).iterator();
            while (it2.hasNext()) {
                ((d37) it2.next()).a.invoke(obj);
            }
            return;
        }
        int size2 = list2.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i2 = size2 - 1;
            ((d37) list2.get(size2)).a.invoke(obj);
            if (i2 < 0) {
                return;
            } else {
                size2 = i2;
            }
        }
    }
}
