package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class u1 implements Iterator {
    public final /* synthetic */ int a = 2;
    public final Iterator b;
    public Object c;
    public final /* synthetic */ Object d;

    public u1(d2 d2Var) {
        this.d = d2Var;
        Collection collection = d2Var.b;
        this.c = collection;
        this.b = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public void a() {
        d2 d2Var = (d2) this.d;
        d2Var.b();
        if (d2Var.b == ((Collection) this.c)) {
            return;
        }
        gp.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            default:
                a();
                break;
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Iterator it = this.b;
        switch (i) {
            case 0:
                Map.Entry entry = (Map.Entry) it.next();
                this.c = (Collection) entry.getValue();
                return ((v1) this.d).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) it.next();
                this.c = entry2;
                return entry2.getKey();
            default:
                a();
                return it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.a;
        Object obj = this.d;
        Iterator it = this.b;
        switch (i) {
            case 0:
                fx1.Q("no calls to next() since the last call to remove()", ((Collection) this.c) != null);
                it.remove();
                ((v1) obj).d.f -= ((Collection) this.c).size();
                ((Collection) this.c).clear();
                this.c = null;
                break;
            case 1:
                fx1.Q("no calls to next() since the last call to remove()", ((Map.Entry) this.c) != null);
                Collection collection = (Collection) ((Map.Entry) this.c).getValue();
                it.remove();
                ((w1) obj).b.f -= collection.size();
                collection.clear();
                this.c = null;
                break;
            default:
                it.remove();
                d2 d2Var = (d2) obj;
                d2Var.e.f--;
                d2Var.c();
                break;
        }
    }

    public u1(d2 d2Var, ListIterator listIterator) {
        this.d = d2Var;
        this.c = d2Var.b;
        this.b = listIterator;
    }

    public u1(w1 w1Var, Iterator it) {
        this.b = it;
        this.d = w1Var;
    }

    public u1(v1 v1Var) {
        this.d = v1Var;
        this.b = v1Var.c.entrySet().iterator();
    }
}
