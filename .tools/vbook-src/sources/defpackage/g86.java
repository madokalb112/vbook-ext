package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class g86 extends m2 {
    public final /* synthetic */ int a;
    public final f86 b;

    public /* synthetic */ g86(f86 f86Var, int i) {
        this.a = i;
        this.b = f86Var;
    }

    @Override // defpackage.m2
    public final int a() {
        switch (this.a) {
        }
        return this.b.u;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                ((Map.Entry) obj).getClass();
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int i = this.a;
        collection.getClass();
        switch (i) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.a) {
            case 0:
                this.b.clear();
                break;
            default:
                this.b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.a;
        f86 f86Var = this.b;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                f86Var.getClass();
                int iH = f86Var.h(entry.getKey());
                if (iH < 0) {
                    return false;
                }
                Object[] objArr = f86Var.b;
                objArr.getClass();
                return lc5.Q(objArr[iH], entry.getValue());
            default:
                return f86Var.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.a) {
            case 0:
                collection.getClass();
                return this.b.f(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.a) {
        }
        return this.b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.a;
        f86 f86Var = this.b;
        switch (i) {
            case 0:
                f86Var.getClass();
                return new c86(f86Var, 0);
            default:
                f86Var.getClass();
                return new c86(f86Var, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.a;
        f86 f86Var = this.b;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    f86Var.getClass();
                    f86Var.d();
                    int iH = f86Var.h(entry.getKey());
                    if (iH >= 0) {
                        Object[] objArr = f86Var.b;
                        objArr.getClass();
                        if (lc5.Q(objArr[iH], entry.getValue())) {
                            f86Var.l(iH);
                        }
                    }
                }
                break;
            default:
                f86Var.d();
                int iH2 = f86Var.h(obj);
                if (iH2 >= 0) {
                    f86Var.l(iH2);
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        int i = this.a;
        f86 f86Var = this.b;
        collection.getClass();
        switch (i) {
            case 0:
                f86Var.d();
                break;
            default:
                f86Var.d();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i = this.a;
        f86 f86Var = this.b;
        collection.getClass();
        switch (i) {
            case 0:
                f86Var.d();
                break;
            default:
                f86Var.d();
                break;
        }
        return super.retainAll(collection);
    }
}
