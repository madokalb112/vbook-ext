package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class kh8 extends f55 {
    public final transient d55 d;
    public final transient lh8 e;

    public kh8(d55 d55Var, lh8 lh8Var) {
        this.d = d55Var;
        this.e = lh8Var;
    }

    @Override // defpackage.f55, defpackage.s45
    public final a55 a() {
        return this.e;
    }

    @Override // defpackage.s45
    public final int b(int i, Object[] objArr) {
        return this.e.b(i, objArr);
    }

    @Override // defpackage.s45, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.d.get(obj) != null;
    }

    @Override // defpackage.s45
    public final boolean f() {
        return true;
    }

    @Override // defpackage.s45
    /* JADX INFO: renamed from: g */
    public final reb iterator() {
        return this.e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((mh8) this.d).f;
    }
}
