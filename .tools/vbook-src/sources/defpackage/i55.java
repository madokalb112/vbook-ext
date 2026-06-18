package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class i55 extends f55 implements NavigableSet, Iterable {
    public static final /* synthetic */ int f = 0;
    public final transient Comparator d;
    public transient i55 e;

    public i55(Comparator comparator) {
        this.d = comparator;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.d;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        i55 ph8Var = this.e;
        if (ph8Var == null) {
            ph8 ph8Var2 = (ph8) this;
            r27 r27VarReverseOrder = Collections.reverseOrder(ph8Var2.d);
            ph8Var = ph8Var2.isEmpty() ? r27.b != r27VarReverseOrder ? new ph8(hh8.e, r27VarReverseOrder) : ph8.t : new ph8(ph8Var2.s.t(), r27VarReverseOrder);
            this.e = ph8Var;
            ph8Var.e = this;
        }
        return ph8Var;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        ph8 ph8Var = (ph8) this;
        return ph8Var.n(0, ph8Var.o(obj, z));
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final ph8 subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        fx1.G(this.d.compare(obj, obj2) <= 0);
        ph8 ph8Var = (ph8) this;
        ph8 ph8VarN = ph8Var.n(ph8Var.q(obj, z), ph8Var.s.size());
        return ph8VarN.n(0, ph8VarN.o(obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        ph8 ph8Var = (ph8) this;
        return ph8Var.n(ph8Var.q(obj, true), ph8Var.s.size());
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        ph8 ph8Var = (ph8) this;
        return ph8Var.n(0, ph8Var.o(obj, false));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        ph8 ph8Var = (ph8) this;
        return ph8Var.n(ph8Var.q(obj, z), ph8Var.s.size());
    }
}
