package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class lh8 extends a55 {
    public final transient Object[] c;
    public final transient int d;
    public final transient int e;

    public lh8(Object[] objArr, int i, int i2) {
        this.c = objArr;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.s45
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        fx1.K(i, this.e);
        Object obj = this.c[(i * 2) + this.d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }
}
