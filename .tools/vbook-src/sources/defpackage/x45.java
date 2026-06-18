package defpackage;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class x45 extends a55 {
    public final transient a55 c;

    public x45(a55 a55Var) {
        this.c = a55Var;
    }

    @Override // defpackage.a55, defpackage.s45, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.c.contains(obj);
    }

    @Override // defpackage.s45
    public final boolean f() {
        return this.c.f();
    }

    @Override // java.util.List
    public final Object get(int i) {
        a55 a55Var = this.c;
        fx1.K(i, a55Var.size());
        return a55Var.get((a55Var.size() - 1) - i);
    }

    @Override // defpackage.a55, java.util.List
    public final int indexOf(Object obj) {
        int iLastIndexOf = this.c.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (r0.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // defpackage.a55, defpackage.s45, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.a55, java.util.List
    public final int lastIndexOf(Object obj) {
        int iIndexOf = this.c.indexOf(obj);
        if (iIndexOf >= 0) {
            return (r0.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // defpackage.a55, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }

    @Override // defpackage.a55
    public final a55 t() {
        return this.c;
    }

    @Override // defpackage.a55, java.util.List
    /* JADX INFO: renamed from: v */
    public final a55 subList(int i, int i2) {
        a55 a55Var = this.c;
        fx1.P(i, i2, a55Var.size());
        return a55Var.subList(a55Var.size() - i2, a55Var.size() - i).t();
    }

    @Override // defpackage.a55, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
