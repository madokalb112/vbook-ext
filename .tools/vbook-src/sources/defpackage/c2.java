package defpackage;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class c2 extends u1 implements ListIterator {
    public final /* synthetic */ d2 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(d2 d2Var, int i) {
        super(d2Var, ((List) d2Var.b).listIterator(i));
        this.e = d2Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        d2 d2Var = this.e;
        boolean zIsEmpty = d2Var.isEmpty();
        b().add(obj);
        d2Var.f.f++;
        if (zIsEmpty) {
            d2Var.a();
        }
    }

    public final ListIterator b() {
        a();
        return (ListIterator) this.b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(d2 d2Var) {
        super(d2Var);
        this.e = d2Var;
    }
}
