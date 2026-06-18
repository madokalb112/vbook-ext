package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class hh8 extends a55 {
    public static final hh8 e = new hh8(new Object[0], 0);
    public final transient Object[] c;
    public final transient int d;

    public hh8(Object[] objArr, int i) {
        this.c = objArr;
        this.d = i;
    }

    @Override // defpackage.a55, defpackage.s45
    public final int b(int i, Object[] objArr) {
        Object[] objArr2 = this.c;
        int i2 = this.d;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.s45
    public final Object[] c() {
        return this.c;
    }

    @Override // defpackage.s45
    public final int d() {
        return this.d;
    }

    @Override // defpackage.s45
    public final int e() {
        return 0;
    }

    @Override // defpackage.s45
    public final boolean f() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        fx1.K(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
