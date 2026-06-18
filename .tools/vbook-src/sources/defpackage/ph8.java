package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ph8 extends i55 {
    public static final ph8 t;
    public final transient a55 s;

    static {
        w45 w45Var = a55.b;
        t = new ph8(hh8.e, r27.b);
    }

    public ph8(a55 a55Var, Comparator comparator) {
        super(comparator);
        this.s = a55Var;
    }

    @Override // defpackage.f55, defpackage.s45
    public final a55 a() {
        return this.s;
    }

    @Override // defpackage.s45
    public final int b(int i, Object[] objArr) {
        return this.s.b(i, objArr);
    }

    @Override // defpackage.s45
    public final Object[] c() {
        return this.s.c();
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iQ = q(obj, true);
        a55 a55Var = this.s;
        if (iQ == a55Var.size()) {
            return null;
        }
        return a55Var.get(iQ);
    }

    @Override // defpackage.s45, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.s, obj, this.d) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof nh8) {
            collection = ((nh8) collection).h();
        }
        Comparator comparator = this.d;
        if (!gl9.h(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        reb it = iterator();
        Iterator it2 = collection.iterator();
        w45 w45Var = (w45) it;
        if (!w45Var.hasNext()) {
            return false;
        }
        Object next = it2.next();
        Object next2 = w45Var.next();
        while (true) {
            try {
                int iCompare = comparator.compare(next2, next);
                if (iCompare < 0) {
                    if (!w45Var.hasNext()) {
                        return false;
                    }
                    next2 = w45Var.next();
                } else if (iCompare == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (iCompare > 0) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }
    }

    @Override // defpackage.s45
    public final int d() {
        return this.s.d();
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.s.t().listIterator(0);
    }

    @Override // defpackage.s45
    public final int e() {
        return this.s.e();
    }

    @Override // defpackage.f55, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (this.s.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        Comparator comparator = this.d;
        if (!gl9.h(comparator, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            reb it2 = iterator();
            do {
                w45 w45Var = (w45) it2;
                if (!w45Var.hasNext()) {
                    return true;
                }
                next = w45Var.next();
                next2 = it.next();
                if (next2 == null) {
                    return false;
                }
            } while (comparator.compare(next, next2) == 0);
            return false;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // defpackage.s45
    public final boolean f() {
        return this.s.f();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        if (!isEmpty()) {
            return this.s.get(0);
        }
        mn5.m();
        return null;
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int iO = o(obj, true) - 1;
        if (iO == -1) {
            return null;
        }
        return this.s.get(iO);
    }

    @Override // defpackage.s45
    /* JADX INFO: renamed from: g */
    public final reb iterator() {
        return this.s.listIterator(0);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int iQ = q(obj, false);
        a55 a55Var = this.s;
        if (iQ == a55Var.size()) {
            return null;
        }
        return a55Var.get(iQ);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            mn5.m();
            return null;
        }
        return this.s.get(r1.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int iO = o(obj, false) - 1;
        if (iO == -1) {
            return null;
        }
        return this.s.get(iO);
    }

    public final ph8 n(int i, int i2) {
        a55 a55Var = this.s;
        if (i == 0 && i2 == a55Var.size()) {
            return this;
        }
        r27 r27Var = this.d;
        return i < i2 ? new ph8(a55Var.subList(i, i2), r27Var) : r27.b != r27Var ? new ph8(hh8.e, r27Var) : t;
    }

    public final int o(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.s, obj, this.d);
        return iBinarySearch >= 0 ? z ? iBinarySearch + 1 : iBinarySearch : ~iBinarySearch;
    }

    public final int q(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.s, obj, this.d);
        return iBinarySearch >= 0 ? z ? iBinarySearch : iBinarySearch + 1 : ~iBinarySearch;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.s.size();
    }
}
