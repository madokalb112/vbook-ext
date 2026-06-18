package defpackage;

import j$.time.LocalDate;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class d26 implements Collection, fi5 {
    public final b66 a;
    public final w16 b;
    public final w16 c;

    static {
        new d26(new w16(1970, 1, 2), new w16(1970, 1, 1));
    }

    public d26(w16 w16Var, w16 w16Var2) {
        long epochDay = w16Var.a.toEpochDay();
        b66 b66Var = new b66(epochDay, w16Var2.a.toEpochDay());
        this.a = b66Var;
        w16.Companion.getClass();
        this.b = u16.a(epochDay);
        this.c = u16.a(b66Var.b);
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof w16)) {
            return false;
        }
        w16 w16Var = this.b;
        w16Var.getClass();
        LocalDate localDate = w16Var.a;
        LocalDate localDate2 = ((w16) obj).a;
        if (localDate.compareTo(localDate2) <= 0) {
            w16 w16Var2 = this.c;
            w16Var2.getClass();
            if (localDate2.compareTo(w16Var2.a) <= 0) {
                return true;
            }
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
            if (!(obj instanceof w16) || !contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof d26) {
            return lc5.Q(this.a, ((d26) obj).a);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        w16 w16Var = this.b;
        w16Var.getClass();
        w16 w16Var2 = this.c;
        w16Var2.getClass();
        return w16Var.a.compareTo(w16Var2.a) > 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        b66 b66Var = this.a;
        return new c26(new c66(b66Var.a, b66Var.b, b66Var.c));
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
        b66 b66Var = this.a;
        b66Var.getClass();
        if (b66Var.isEmpty()) {
            return 0;
        }
        try {
            long jAddExact = (Math.addExact(b66Var.b, -b66Var.a) / b66Var.c) + 1;
            if (jAddExact > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (jAddExact < -2147483648L) {
                return Integer.MIN_VALUE;
            }
            return (int) jAddExact;
        } catch (ArithmeticException unused) {
            return Integer.MAX_VALUE;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return t1c.l0(this, objArr);
    }

    public final String toString() {
        return this.b + ".." + this.c;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return t1c.k0(this);
    }
}
