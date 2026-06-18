package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class nu implements li4 {
    public final ArrayList a;

    public nu(int i, boolean z) {
        switch (i) {
            case 1:
                this.a = new ArrayList();
                break;
            case 2:
            default:
                this.a = new ArrayList();
                break;
            case 3:
                this.a = new ArrayList();
                break;
        }
    }

    public String a(Object obj) {
        return (String) obj;
    }

    public Iterator b() {
        return this.a.iterator();
    }

    public void c(r84 r84Var) {
        boolean z = r84Var instanceof k77;
        ArrayList arrayList = this.a;
        if (z) {
            arrayList.add(r84Var);
        } else {
            if (!(r84Var instanceof hn1)) {
                mn5.g();
                return;
            }
            Iterator it = ((hn1) r84Var).a.iterator();
            while (it.hasNext()) {
                arrayList.add((k77) it.next());
            }
        }
    }

    public void d(Object obj) {
        if (obj == null) {
            return;
        }
        boolean z = obj instanceof Object[];
        ArrayList arrayList = this.a;
        if (z) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            arrayList.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    public nu(int i) {
        this.a = new ArrayList(i);
    }

    public nu(ArrayList arrayList) {
        this.a = arrayList;
    }
}
