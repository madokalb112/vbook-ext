package defpackage;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class dn8 implements ListIterator, fi5 {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final /* synthetic */ Object c;

    public dn8(i96 i96Var, int i) {
        this.c = i96Var;
        this.b = ((List) i96Var.b).listIterator(fc1.o0(i, i96Var));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.a) {
            case 0:
                ListIterator listIterator = (ListIterator) this.b;
                listIterator.add(obj);
                listIterator.previous();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            default:
                if (((pg8) obj).a < ((ux9) this.c).d - 1) {
                }
                break;
        }
        return ((ListIterator) obj).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            default:
                if (((pg8) obj).a >= 0) {
                }
                break;
        }
        return ((ListIterator) obj).hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((ListIterator) obj).previous();
            case 1:
                return ((ListIterator) obj).previous();
            default:
                pg8 pg8Var = (pg8) obj;
                int i2 = pg8Var.a + 1;
                ux9 ux9Var = (ux9) this.c;
                ah1.u(i2, ux9Var.d);
                pg8Var.a = i2;
                return ux9Var.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        int iPreviousIndex;
        int size;
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                iPreviousIndex = ((ListIterator) obj2).previousIndex();
                size = ((en8) obj).size();
                break;
            case 1:
                iPreviousIndex = ((ListIterator) obj2).previousIndex();
                size = ((i96) obj).size();
                break;
            default:
                return ((pg8) obj2).a + 1;
        }
        return (size - 1) - iPreviousIndex;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((ListIterator) obj).next();
            case 1:
                return ((ListIterator) obj).next();
            default:
                pg8 pg8Var = (pg8) obj;
                int i2 = pg8Var.a;
                ux9 ux9Var = (ux9) this.c;
                ah1.u(i2, ux9Var.d);
                pg8Var.a = i2 - 1;
                return ux9Var.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int iNextIndex;
        int size;
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                iNextIndex = ((ListIterator) obj2).nextIndex();
                size = ((en8) obj).size();
                break;
            case 1:
                iNextIndex = ((ListIterator) obj2).nextIndex();
                size = ((i96) obj).size();
                break;
            default:
                return ((pg8) obj2).a;
        }
        return (size - 1) - iNextIndex;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                ((ListIterator) this.b).remove();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.a) {
            case 0:
                ((ListIterator) this.b).set(obj);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public dn8(en8 en8Var, int i) {
        this.c = en8Var;
        this.b = en8Var.a.listIterator(fc1.o0(i, en8Var));
    }

    public dn8(pg8 pg8Var, ux9 ux9Var) {
        this.b = pg8Var;
        this.c = ux9Var;
    }
}
