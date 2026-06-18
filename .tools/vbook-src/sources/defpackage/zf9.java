package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zf9 extends f55 {
    public final transient Object d;

    public zf9(Object obj) {
        obj.getClass();
        this.d = obj;
    }

    @Override // defpackage.f55, defpackage.s45
    public final a55 a() {
        return a55.q(this.d);
    }

    @Override // defpackage.s45
    public final int b(int i, Object[] objArr) {
        objArr[i] = this.d;
        return i + 1;
    }

    @Override // defpackage.s45, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    @Override // defpackage.s45
    public final boolean f() {
        return false;
    }

    @Override // defpackage.s45
    /* JADX INFO: renamed from: g */
    public final reb iterator() {
        return new id5(this.d);
    }

    @Override // defpackage.f55, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.d.toString() + ']';
    }
}
