package defpackage;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xj5 implements List, fi5 {
    public static final xj5 t = new xj5(lc3.a);
    public final /* synthetic */ List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int s;

    public xj5(List list) {
        int iNextIndex;
        int iNextIndex2;
        this.a = list;
        Iterator it = iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            iNextIndex = -1;
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (((wj5) it.next()).f) {
                break;
            } else {
                i2++;
            }
        }
        this.b = i2;
        Iterator it2 = iterator();
        int i3 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i3 = -1;
                break;
            } else if (!((wj5) it2.next()).e) {
                break;
            } else {
                i3++;
            }
        }
        this.c = i3;
        ListIterator listIterator = listIterator(size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex2 = -1;
                break;
            } else if (!((wj5) listIterator.previous()).e) {
                iNextIndex2 = listIterator.nextIndex();
                break;
            }
        }
        this.d = iNextIndex2;
        Iterator it3 = iterator();
        while (true) {
            if (!it3.hasNext()) {
                i = -1;
                break;
            } else if (((wj5) it3.next()).d) {
                break;
            } else {
                i++;
            }
        }
        this.e = i;
        ListIterator listIterator2 = listIterator(size());
        while (true) {
            if (!listIterator2.hasPrevious()) {
                break;
            } else if (((wj5) listIterator2.previous()).d) {
                iNextIndex = listIterator2.nextIndex();
                break;
            }
        }
        this.f = iNextIndex;
        this.s = (iNextIndex - this.e) + 1;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final wj5 get(int i) {
        return (wj5) this.a.get(i);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final wj5 c() {
        wj5 wj5Var = (wj5) fc1.A0(this.e, this);
        if (wj5Var != null) {
            return wj5Var;
        }
        so9.n("All KeylineLists must have at least one focal keyline");
        return null;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof wj5)) {
            return false;
        }
        return this.a.contains((wj5) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.a.containsAll(collection);
    }

    public final wj5 d() {
        wj5 wj5Var = (wj5) fc1.A0(this.f, this);
        if (wj5Var != null) {
            return wj5Var;
        }
        so9.n("All KeylineLists must have at least one focal keyline");
        return null;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xj5) {
            List list = this.a;
            xj5 xj5Var = (xj5) obj;
            if (list.size() == xj5Var.a.size()) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (lc5.Q(get(i), xj5Var.get(i))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        int size = size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += ((wj5) get(i)).hashCode() * 31;
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof wj5)) {
            return -1;
        }
        return this.a.indexOf((wj5) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof wj5)) {
            return -1;
        }
        return this.a.lastIndexOf((wj5) obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.a.listIterator();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return this.a.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return t1c.k0(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return t1c.l0(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return this.a.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
