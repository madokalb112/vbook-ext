package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class oh8 extends f55 {
    public static final Object[] u;
    public static final oh8 v;
    public final transient Object[] d;
    public final transient int e;
    public final transient Object[] f;
    public final transient int s;
    public final transient int t;

    static {
        Object[] objArr = new Object[0];
        u = objArr;
        v = new oh8(objArr, 0, objArr, 0, 0);
    }

    public oh8(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.d = objArr;
        this.e = i;
        this.f = objArr2;
        this.s = i2;
        this.t = i3;
    }

    @Override // defpackage.s45
    public final int b(int i, Object[] objArr) {
        Object[] objArr2 = this.d;
        int i2 = this.t;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.s45
    public final Object[] c() {
        return this.d;
    }

    @Override // defpackage.s45, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f;
            if (objArr.length != 0) {
                int iJ0 = ww1.j0(obj);
                while (true) {
                    int i = iJ0 & this.s;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iJ0 = i + 1;
                }
            }
        }
        return false;
    }

    @Override // defpackage.s45
    public final int d() {
        return this.t;
    }

    @Override // defpackage.s45
    public final int e() {
        return 0;
    }

    @Override // defpackage.s45
    public final boolean f() {
        return false;
    }

    @Override // defpackage.s45
    /* JADX INFO: renamed from: g */
    public final reb iterator() {
        return a().listIterator(0);
    }

    @Override // defpackage.f55, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e;
    }

    @Override // defpackage.f55
    public final a55 k() {
        return a55.h(this.t, this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.t;
    }
}
