package defpackage;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class k06 implements ListIterator {
    public boolean a;
    public final /* synthetic */ ListIterator b;
    public final /* synthetic */ l06 c;

    public k06(l06 l06Var, ListIterator listIterator) {
        this.b = listIterator;
        this.c = l06Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        ListIterator listIterator = this.b;
        listIterator.add(obj);
        listIterator.previous();
        this.a = false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        ListIterator listIterator = this.b;
        if (listIterator.hasPrevious()) {
            this.a = true;
            return listIterator.previous();
        }
        mn5.m();
        return null;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.c.a(this.b.nextIndex());
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        ListIterator listIterator = this.b;
        if (listIterator.hasNext()) {
            this.a = true;
            return listIterator.next();
        }
        mn5.m();
        return null;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return nextIndex() - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        fx1.Q("no calls to next() since the last call to remove()", this.a);
        this.b.remove();
        this.a = false;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        fx1.R(this.a);
        this.b.set(obj);
    }
}
