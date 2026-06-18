package defpackage;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class y45 extends a55 {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ a55 e;

    public y45(a55 a55Var, int i, int i2) {
        this.e = a55Var;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.s45
    public final Object[] c() {
        return this.e.c();
    }

    @Override // defpackage.s45
    public final int d() {
        return this.e.e() + this.c + this.d;
    }

    @Override // defpackage.s45
    public final int e() {
        return this.e.e() + this.c;
    }

    @Override // defpackage.s45
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        fx1.K(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // defpackage.a55, defpackage.s45, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.a55, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // defpackage.a55, java.util.List
    /* JADX INFO: renamed from: v */
    public final a55 subList(int i, int i2) {
        fx1.P(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // defpackage.a55, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
