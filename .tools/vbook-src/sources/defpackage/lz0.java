package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class lz0 extends AbstractCollection implements Collection, gi5 {
    public final /* synthetic */ int a;
    public final Object b;

    public lz0(mz0 mz0Var) {
        this.a = 0;
        this.b = mz0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                obj.getClass();
                throw new UnsupportedOperationException("CaseInsensitiveMap.values does not support add");
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.a) {
            case 1:
                collection.getClass();
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        switch (this.a) {
            case 1:
                ((f86) this.b).clear();
                break;
            case 2:
                ((or7) this.b).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.a) {
            case 1:
                return ((f86) this.b).containsValue(obj);
            case 2:
                return ((or7) this.b).containsValue(obj);
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.a) {
            case 1:
                return ((f86) this.b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new iz0((mz0) obj, 2);
            case 1:
                f86 f86Var = (f86) obj;
                f86Var.getClass();
                return new c86(f86Var, 2);
            default:
                or7 or7Var = (or7) obj;
                w6b[] w6bVarArr = new w6b[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    w6bVarArr[i2] = new x6b(2);
                }
                return new rr7(or7Var, w6bVarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.a) {
            case 1:
                f86 f86Var = (f86) this.b;
                f86Var.d();
                int i = f86Var.i(obj);
                if (i < 0) {
                    return false;
                }
                f86Var.l(i);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.a) {
            case 1:
                collection.getClass();
                ((f86) this.b).d();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.a) {
            case 1:
                collection.getClass();
                ((f86) this.b).d();
                break;
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((mz0) obj).c;
            case 1:
                return ((f86) obj).u;
            default:
                return ((or7) obj).f;
        }
    }

    public /* synthetic */ lz0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
