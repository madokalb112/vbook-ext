package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class u28 implements Collection, fi5 {
    public Object[] a;
    public int b;

    public final void a(mc1 mc1Var) {
        Object[] objArrCopyOf = this.a;
        if (objArrCopyOf == null) {
            objArrCopyOf = new Object[8];
        } else {
            int i = this.b;
            if (i == objArrCopyOf.length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i * 2);
            }
        }
        this.a = objArrCopyOf;
        int i2 = this.b;
        this.b = i2 + 1;
        objArrCopyOf[i2] = mc1Var;
        y86.K(i2, objArrCopyOf);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        this.a = null;
        this.b = 0;
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        Object[] objArr = this.a;
        if (objArr != null) {
            return fw.O(obj, objArr);
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            Object[] objArr = this.a;
            if (!(objArr != null ? fw.O(obj, objArr) : false)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.b == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new n1(this, 2);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.b;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return t1c.l0(this, objArr);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return t1c.k0(this);
    }
}
