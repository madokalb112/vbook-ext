package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class fa9 {
    public static final zy2 a = new zy2("NO_VALUE", 6);

    public static ea9 a(int i, int i2, ar0 ar0Var) {
        int i3 = (i2 & 1) != 0 ? 0 : 1;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        int i4 = i2 & 4;
        ar0 ar0Var2 = ar0.a;
        if (i4 != 0) {
            ar0Var = ar0Var2;
        }
        if (i < 0) {
            gp.k(dx1.f(i, "extraBufferCapacity cannot be negative, but was "));
            return null;
        }
        if (i3 <= 0 && i <= 0 && ar0Var != ar0Var2) {
            k27.k(ar0Var, "replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ");
            return null;
        }
        int i5 = i + i3;
        if (i5 < 0) {
            i5 = Integer.MAX_VALUE;
        }
        return new ea9(i3, i5, ar0Var);
    }

    public static final void b(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }
}
