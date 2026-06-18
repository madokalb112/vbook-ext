package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class f86 implements Map, Serializable, ji5 {
    public static final f86 z;
    public Object[] a;
    public Object[] b;
    public int[] c;
    public int[] d;
    public int e;
    public int f;
    public int s;
    public int t;
    public int u;
    public g86 v;
    public lz0 w;
    public g86 x;
    public boolean y;

    static {
        f86 f86Var = new f86(0);
        f86Var.y = true;
        z = f86Var;
    }

    public f86(int i) {
        if (i < 0) {
            gp.l("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.a = objArr;
        this.b = null;
        this.c = iArr;
        this.d = new int[iHighestOneBit];
        this.e = 2;
        this.f = 0;
        this.s = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    public final int a(Object obj) {
        d();
        while (true) {
            int iJ = j(obj);
            int i = this.e * 2;
            int length = this.d.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.d;
                int i3 = iArr[iJ];
                if (i3 == 0) {
                    int i4 = this.f;
                    Object[] objArr = this.a;
                    if (i4 < objArr.length) {
                        int i5 = i4 + 1;
                        this.f = i5;
                        objArr[i4] = obj;
                        this.c[i4] = iJ;
                        iArr[iJ] = i5;
                        this.u++;
                        this.t++;
                        if (i2 > this.e) {
                            this.e = i2;
                        }
                        return i4;
                    }
                    g(1);
                } else {
                    if (lc5.Q(this.a[i3 - 1], obj)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > i) {
                        k(this.d.length * 2);
                        break;
                    }
                    iJ = iJ == 0 ? this.d.length - 1 : iJ - 1;
                }
            }
        }
    }

    public final f86 c() {
        d();
        this.y = true;
        if (this.u > 0) {
            return this;
        }
        f86 f86Var = z;
        f86Var.getClass();
        return f86Var;
    }

    @Override // java.util.Map
    public final void clear() {
        d();
        int i = this.f - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.c;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.d[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        wx1.p0(this.a, 0, this.f);
        Object[] objArr = this.b;
        if (objArr != null) {
            wx1.p0(objArr, 0, this.f);
        }
        this.u = 0;
        this.f = 0;
        this.t++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return h(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return i(obj) >= 0;
    }

    public final void d() {
        if (this.y) {
            xr0.h();
        }
    }

    public final void e(boolean z2) {
        int i;
        Object[] objArr = this.b;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.c;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.a;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z2) {
                    iArr[i3] = i4;
                    this.d[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        wx1.p0(this.a, i3, i);
        if (objArr != null) {
            wx1.p0(objArr, i3, this.f);
        }
        this.f = i3;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        g86 g86Var = this.x;
        if (g86Var != null) {
            return g86Var;
        }
        g86 g86Var2 = new g86(this, 0);
        this.x = g86Var2;
        return g86Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.u == map.size() && f(map.entrySet());
    }

    public final boolean f(Collection collection) {
        boolean zQ;
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int iH = h(entry.getKey());
                    if (iH < 0) {
                        zQ = false;
                    } else {
                        Object[] objArr = this.b;
                        objArr.getClass();
                        zQ = lc5.Q(objArr[iH], entry.getValue());
                    }
                    if (!zQ) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final void g(int i) {
        Object[] objArr = this.a;
        int length = objArr.length;
        int i2 = this.f;
        int i3 = length - i2;
        int i4 = i2 - this.u;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            e(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            int length2 = objArr.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.a = Arrays.copyOf(objArr, i6);
            Object[] objArr2 = this.b;
            this.b = objArr2 != null ? Arrays.copyOf(objArr2, i6) : null;
            this.c = Arrays.copyOf(this.c, i6);
            int iHighestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (iHighestOneBit > this.d.length) {
                k(iHighestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iH = h(obj);
        if (iH < 0) {
            return null;
        }
        Object[] objArr = this.b;
        objArr.getClass();
        return objArr[iH];
    }

    public final int h(Object obj) {
        int iJ = j(obj);
        int i = this.e;
        while (true) {
            int i2 = this.d[iJ];
            if (i2 == 0) {
                return -1;
            }
            int i3 = i2 - 1;
            if (lc5.Q(this.a[i3], obj)) {
                return i3;
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iJ = iJ == 0 ? this.d.length - 1 : iJ - 1;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        c86 c86Var = new c86(this, 0);
        int i = 0;
        while (c86Var.hasNext()) {
            int i2 = c86Var.a;
            f86 f86Var = (f86) c86Var.d;
            if (i2 >= f86Var.f) {
                mn5.m();
                return 0;
            }
            c86Var.a = i2 + 1;
            c86Var.b = i2;
            Object obj = f86Var.a[i2];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = f86Var.b;
            objArr.getClass();
            Object obj2 = objArr[c86Var.b];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            c86Var.d();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    public final int i(Object obj) {
        int i = this.f;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.c[i] >= 0) {
                Object[] objArr = this.b;
                objArr.getClass();
                if (lc5.Q(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.u == 0;
    }

    public final int j(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.s;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r3[r0] = r6;
        r5.c[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(int r6) {
        /*
            r5 = this;
            int r0 = r5.t
            int r0 = r0 + 1
            r5.t = r0
            int r0 = r5.f
            int r1 = r5.u
            r2 = 0
            if (r0 <= r1) goto L10
            r5.e(r2)
        L10:
            int[] r0 = new int[r6]
            r5.d = r0
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.s = r6
        L1c:
            int r6 = r5.f
            if (r2 >= r6) goto L4d
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.a
            r0 = r0[r2]
            int r0 = r5.j(r0)
            int r1 = r5.e
        L2c:
            int[] r3 = r5.d
            r4 = r3[r0]
            if (r4 != 0) goto L3a
            r3[r0] = r6
            int[] r1 = r5.c
            r1[r2] = r0
            r2 = r6
            goto L1c
        L3a:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L48
            int r4 = r0 + (-1)
            if (r0 != 0) goto L46
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L2c
        L46:
            r0 = r4
            goto L2c
        L48:
            java.lang.String r5 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            gp.j(r5)
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f86.k(int):void");
    }

    @Override // java.util.Map
    public final Set keySet() {
        g86 g86Var = this.v;
        if (g86Var != null) {
            return g86Var;
        }
        g86 g86Var2 = new g86(this, 1);
        this.v = g86Var2;
        return g86Var2;
    }

    public final void l(int i) {
        int i2;
        int i3;
        int iJ;
        int[] iArr;
        Object[] objArr = this.a;
        objArr.getClass();
        objArr[i] = null;
        Object[] objArr2 = this.b;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int length = this.c[i];
        loop0: while (true) {
            int i4 = length;
            int i5 = 0;
            do {
                length = length == 0 ? this.d.length - 1 : length - 1;
                int[] iArr2 = this.d;
                i2 = iArr2[length];
                i5++;
                if (i5 > this.e) {
                    iArr2[i4] = 0;
                    break loop0;
                } else if (i2 == 0) {
                    iArr2[i4] = 0;
                    break loop0;
                } else {
                    i3 = i2 - 1;
                    iJ = j(this.a[i3]) - length;
                    iArr = this.d;
                }
            } while ((iJ & (iArr.length - 1)) < i5);
            iArr[i4] = i2;
            this.c[i3] = i4;
        }
        this.c[i] = -1;
        this.u--;
        this.t++;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        d();
        int iA = a(obj);
        Object[] objArr = this.b;
        if (objArr == null) {
            int length = this.a.length;
            if (length < 0) {
                gp.l("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            this.b = objArr;
        }
        if (iA >= 0) {
            objArr[iA] = obj2;
            return null;
        }
        int i = (-iA) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        d();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        g(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.b;
            if (objArr == null) {
                int length = this.a.length;
                if (length < 0) {
                    gp.l("capacity must be non-negative.");
                    return;
                } else {
                    objArr = new Object[length];
                    this.b = objArr;
                }
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i = (-iA) - 1;
                if (!lc5.Q(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        d();
        int iH = h(obj);
        if (iH < 0) {
            return null;
        }
        Object[] objArr = this.b;
        objArr.getClass();
        Object obj2 = objArr[iH];
        l(iH);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.u;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.u * 3) + 2);
        sb.append("{");
        int i = 0;
        c86 c86Var = new c86(this, 0);
        while (c86Var.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = c86Var.a;
            f86 f86Var = (f86) c86Var.d;
            if (i2 >= f86Var.f) {
                mn5.m();
                return null;
            }
            c86Var.a = i2 + 1;
            c86Var.b = i2;
            Object obj = f86Var.a[i2];
            if (obj == f86Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = f86Var.b;
            objArr.getClass();
            Object obj2 = objArr[c86Var.b];
            if (obj2 == f86Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            c86Var.d();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        lz0 lz0Var = this.w;
        if (lz0Var != null) {
            return lz0Var;
        }
        lz0 lz0Var2 = new lz0(this, 1);
        this.w = lz0Var2;
        return lz0Var2;
    }

    public f86() {
        this(8);
    }
}
