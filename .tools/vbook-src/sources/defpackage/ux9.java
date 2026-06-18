package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ux9 implements List, hi5 {
    public final hk9 a;
    public final int b;
    public int c;
    public int d;

    public ux9(hk9 hk9Var, int i, int i2) {
        this.a = hk9Var;
        this.b = i;
        this.c = ah1.G(hk9Var);
        this.d = i2 - i;
    }

    public final void a() {
        if (ah1.G(this.a) == this.c) {
            return;
        }
        gp.d();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        a();
        int i = this.b + this.d;
        hk9 hk9Var = this.a;
        hk9Var.add(i, obj);
        this.d++;
        this.c = ah1.G(hk9Var);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        a();
        int i2 = i + this.b;
        hk9 hk9Var = this.a;
        boolean zAddAll = hk9Var.addAll(i2, collection);
        if (zAddAll) {
            this.d = collection.size() + this.d;
            this.c = ah1.G(hk9Var);
        }
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.d > 0) {
            a();
            int i = this.d;
            int i2 = this.b;
            hk9 hk9Var = this.a;
            hk9Var.d(i2, i + i2);
            this.d = 0;
            this.c = ah1.G(hk9Var);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        a();
        ah1.u(i, this.d);
        return this.a.get(this.b + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int iNextInt;
        a();
        int i = this.d;
        int i2 = this.b;
        Iterator it = wx1.s0(i2, i + i2).iterator();
        do {
            w21 w21Var = (w21) it;
            if (!w21Var.d) {
                return -1;
            }
            iNextInt = w21Var.nextInt();
        } while (!lc5.Q(obj, this.a.get(iNextInt)));
        return iNextInt - i2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.d == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        a();
        int i = this.d;
        int i2 = this.b;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (lc5.Q(obj, this.a.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        a();
        pg8 pg8Var = new pg8();
        pg8Var.a = i - 1;
        return new dn8(pg8Var, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        a();
        int i2 = this.b + i;
        hk9 hk9Var = this.a;
        Object objRemove = hk9Var.remove(i2);
        this.d--;
        this.c = ah1.G(hk9Var);
        return objRemove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        o2 o2Var;
        oj9 oj9VarJ;
        boolean zY;
        a();
        hk9 hk9Var = this.a;
        int i2 = this.b;
        int i3 = this.d + i2;
        int size = hk9Var.size();
        do {
            synchronized (ah1.s0) {
                ir9 ir9Var = hk9Var.a;
                ir9Var.getClass();
                ir9 ir9VarH = vj9.h(ir9Var);
                i = ir9VarH.d;
                o2Var = ir9VarH.c;
            }
            o2Var.getClass();
            yr7 yr7VarF = o2Var.f();
            yr7VarF.subList(i2, i3).retainAll(collection);
            o2 o2VarD = yr7VarF.d();
            if (lc5.Q(o2VarD, o2Var)) {
                break;
            }
            ir9 ir9Var2 = hk9Var.a;
            ir9Var2.getClass();
            synchronized (vj9.c) {
                oj9VarJ = vj9.j();
                zY = ah1.y(vj9.w(ir9Var2, hk9Var, oj9VarJ), i, o2VarD, true);
            }
            vj9.n(oj9VarJ, hk9Var);
        } while (!zY);
        int size2 = size - hk9Var.size();
        if (size2 > 0) {
            this.c = ah1.G(this.a);
            this.d -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        ah1.u(i, this.d);
        a();
        int i2 = i + this.b;
        hk9 hk9Var = this.a;
        Object obj2 = hk9Var.set(i2, obj);
        this.c = ah1.G(hk9Var);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.d;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.d) {
            d08.a("fromIndex or toIndex are out of bounds");
        }
        a();
        int i3 = this.b;
        return new ux9(this.a, i + i3, i2 + i3);
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
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        a();
        int i2 = this.b + i;
        hk9 hk9Var = this.a;
        hk9Var.add(i2, obj);
        this.d++;
        this.c = ah1.G(hk9Var);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.d, collection);
    }
}
