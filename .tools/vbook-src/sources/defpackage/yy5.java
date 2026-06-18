package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class yy5 extends l2 implements RandomAccess, Serializable {
    public Object[] a;
    public final int b;
    public int c;
    public final yy5 d;
    public final zy5 e;

    public yy5(Object[] objArr, int i, int i2, yy5 yy5Var, zy5 zy5Var) {
        objArr.getClass();
        zy5Var.getClass();
        this.a = objArr;
        this.b = i;
        this.c = i2;
        this.d = yy5Var;
        this.e = zy5Var;
        ((AbstractList) this).modCount = ((AbstractList) zy5Var).modCount;
    }

    @Override // defpackage.l2
    public final int a() {
        g();
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        h();
        g();
        int i2 = this.c;
        if (i < 0 || i > i2) {
            k27.m(xv5.o("index: ", i, i2, ", size: "));
        } else {
            f(this.b + i, obj);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        h();
        g();
        int i2 = this.c;
        if (i < 0 || i > i2) {
            k27.m(xv5.o("index: ", i, i2, ", size: "));
            return false;
        }
        int size = collection.size();
        e(this.b + i, collection, size);
        return size > 0;
    }

    @Override // defpackage.l2
    public final Object c(int i) {
        h();
        g();
        int i2 = this.c;
        if (i >= 0 && i < i2) {
            return i(this.b + i);
        }
        k27.m(xv5.o("index: ", i, i2, ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        h();
        g();
        j(this.b, this.c);
    }

    public final void e(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        zy5 zy5Var = this.e;
        yy5 yy5Var = this.d;
        if (yy5Var != null) {
            yy5Var.e(i, collection, i2);
        } else {
            zy5 zy5Var2 = zy5.d;
            zy5Var.e(i, collection, i2);
        }
        this.a = zy5Var.a;
        this.c += i2;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        g();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.a;
            int i = this.c;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (lc5.Q(objArr[this.b + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(int i, Object obj) {
        ((AbstractList) this).modCount++;
        zy5 zy5Var = this.e;
        yy5 yy5Var = this.d;
        if (yy5Var != null) {
            yy5Var.f(i, obj);
        } else {
            zy5 zy5Var2 = zy5.d;
            zy5Var.f(i, obj);
        }
        this.a = zy5Var.a;
        this.c++;
    }

    public final void g() {
        if (((AbstractList) this.e).modCount == ((AbstractList) this).modCount) {
            return;
        }
        gp.d();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        g();
        int i2 = this.c;
        if (i >= 0 && i < i2) {
            return this.a[this.b + i];
        }
        k27.m(xv5.o("index: ", i, i2, ", size: "));
        return null;
    }

    public final void h() {
        if (this.e.c) {
            xr0.h();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        g();
        Object[] objArr = this.a;
        int i = this.c;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[this.b + i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final Object i(int i) {
        Object objI;
        ((AbstractList) this).modCount++;
        yy5 yy5Var = this.d;
        if (yy5Var != null) {
            objI = yy5Var.i(i);
        } else {
            zy5 zy5Var = zy5.d;
            objI = this.e.i(i);
        }
        this.c--;
        return objI;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        g();
        for (int i = 0; i < this.c; i++) {
            if (lc5.Q(this.a[this.b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        g();
        return this.c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        yy5 yy5Var = this.d;
        if (yy5Var != null) {
            yy5Var.j(i, i2);
        } else {
            zy5 zy5Var = zy5.d;
            this.e.j(i, i2);
        }
        this.c -= i2;
    }

    public final int k(int i, int i2, Collection collection, boolean z) {
        int iK;
        yy5 yy5Var = this.d;
        if (yy5Var != null) {
            iK = yy5Var.k(i, i2, collection, z);
        } else {
            zy5 zy5Var = zy5.d;
            iK = this.e.k(i, i2, collection, z);
        }
        if (iK > 0) {
            ((AbstractList) this).modCount++;
        }
        this.c -= iK;
        return iK;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        g();
        for (int i = this.c - 1; i >= 0; i--) {
            if (lc5.Q(this.a[this.b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        g();
        int i2 = this.c;
        if (i >= 0 && i <= i2) {
            return new em4(this, i);
        }
        k27.m(xv5.o("index: ", i, i2, ", size: "));
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        h();
        g();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            c(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        h();
        g();
        return k(this.b, this.c, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        h();
        g();
        return k(this.b, this.c, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        h();
        g();
        int i2 = this.c;
        if (i < 0 || i >= i2) {
            k27.m(xv5.o("index: ", i, i2, ", size: "));
            return null;
        }
        Object[] objArr = this.a;
        int i3 = this.b;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        lc5.T(i, i2, this.c);
        return new yy5(this.a, this.b + i, i2 - i, this, this.e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        g();
        int length = objArr.length;
        int i = this.c;
        Object[] objArr2 = this.a;
        int i2 = this.b;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        fw.U(objArr2, 0, objArr, i2, i + i2);
        int i3 = this.c;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        g();
        return wx1.G(this.a, this.b, this.c, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        h();
        g();
        f(this.b + this.c, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        g();
        Object[] objArr = this.a;
        int i = this.c;
        int i2 = this.b;
        return fw.Z(objArr, i2, i + i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        h();
        g();
        int size = collection.size();
        e(this.b + this.c, collection, size);
        return size > 0;
    }
}
