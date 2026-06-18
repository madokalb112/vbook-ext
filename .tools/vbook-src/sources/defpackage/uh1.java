package defpackage;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class uh1 extends AbstractMap implements Serializable {
    public static final Object v = new Object();
    public transient Object a;
    public transient int[] b;
    public transient Object[] c;
    public transient Object[] d;
    public transient int e;
    public transient int f;
    public transient sh1 s;
    public transient sh1 t;
    public transient j2 u;

    public static uh1 a(int i) {
        uh1 uh1Var = new uh1();
        fx1.F("Expected size must be >= 0", i >= 0);
        uh1Var.e = Math.min(Math.max(i, 1), 1073741823);
        return uh1Var;
    }

    public final Map c() {
        Object obj = this.a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (g()) {
            return;
        }
        this.e += 32;
        Map mapC = c();
        if (mapC != null) {
            this.e = Math.min(Math.max(size(), 3), 1073741823);
            mapC.clear();
            this.a = null;
            this.f = 0;
            return;
        }
        Arrays.fill(j(), 0, this.f, (Object) null);
        Arrays.fill(k(), 0, this.f, (Object) null);
        Object obj = this.a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(i(), 0, this.f, 0);
        this.f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapC = c();
        return mapC != null ? mapC.containsKey(obj) : e(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapC = c();
        if (mapC != null) {
            return mapC.containsValue(obj);
        }
        for (int i = 0; i < this.f; i++) {
            if (yn2.z(obj, k()[i])) {
                return true;
            }
        }
        return false;
    }

    public final int d() {
        return (1 << (this.e & 31)) - 1;
    }

    public final int e(Object obj) {
        if (g()) {
            return -1;
        }
        int iJ0 = ww1.j0(obj);
        int iD = d();
        Object obj2 = this.a;
        Objects.requireNonNull(obj2);
        int iT0 = gjb.t0(iJ0 & iD, obj2);
        if (iT0 == 0) {
            return -1;
        }
        int i = ~iD;
        int i2 = iJ0 & i;
        do {
            int i3 = iT0 - 1;
            int i4 = i()[i3];
            if ((i4 & i) == i2 && yn2.z(obj, j()[i3])) {
                return i3;
            }
            iT0 = i4 & iD;
        } while (iT0 != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        sh1 sh1Var = this.t;
        if (sh1Var != null) {
            return sh1Var;
        }
        sh1 sh1Var2 = new sh1(this, 0);
        this.t = sh1Var2;
        return sh1Var2;
    }

    public final void f(int i, int i2) {
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] iArrI = i();
        Object[] objArrJ = j();
        Object[] objArrK = k();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrJ[i] = null;
            objArrK[i] = null;
            iArrI[i] = 0;
            return;
        }
        Object obj2 = objArrJ[i3];
        objArrJ[i] = obj2;
        objArrK[i] = objArrK[i3];
        objArrJ[i3] = null;
        objArrK[i3] = null;
        iArrI[i] = iArrI[i3];
        iArrI[i3] = 0;
        int iJ0 = ww1.j0(obj2) & i2;
        int iT0 = gjb.t0(iJ0, obj);
        if (iT0 == size) {
            gjb.u0(iJ0, obj, i + 1);
            return;
        }
        while (true) {
            int i4 = iT0 - 1;
            int i5 = iArrI[i4];
            int i6 = i5 & i2;
            if (i6 == size) {
                iArrI[i4] = gjb.j0(i5, i + 1, i2);
                return;
            }
            iT0 = i6;
        }
    }

    public final boolean g() {
        return this.a == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapC = c();
        if (mapC != null) {
            return mapC.get(obj);
        }
        int iE = e(obj);
        if (iE == -1) {
            return null;
        }
        return k()[iE];
    }

    public final Object h(Object obj) {
        if (!g()) {
            int iD = d();
            Object obj2 = this.a;
            Objects.requireNonNull(obj2);
            int iR0 = gjb.r0(obj, null, iD, obj2, i(), j(), null);
            if (iR0 != -1) {
                Object obj3 = k()[iR0];
                f(iR0, iD);
                this.f--;
                this.e += 32;
                return obj3;
            }
        }
        return v;
    }

    public final int[] i() {
        int[] iArr = this.b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object[] j() {
        Object[] objArr = this.c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] k() {
        Object[] objArr = this.d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        sh1 sh1Var = this.s;
        if (sh1Var != null) {
            return sh1Var;
        }
        sh1 sh1Var2 = new sh1(this, 1);
        this.s = sh1Var2;
        return sh1Var2;
    }

    public final int l(int i, int i2, int i3, int i4) {
        Object objZ = gjb.Z(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            gjb.u0(i3 & i5, objZ, i4 + 1);
        }
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] iArrI = i();
        for (int i6 = 0; i6 <= i; i6++) {
            int iT0 = gjb.t0(i6, obj);
            while (iT0 != 0) {
                int i7 = iT0 - 1;
                int i8 = iArrI[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iT02 = gjb.t0(i10, objZ);
                gjb.u0(i10, objZ, iT0);
                iArrI[i7] = gjb.j0(i9, iT02, i5);
                iT0 = i8 & i;
            }
        }
        this.a = objZ;
        this.e = gjb.j0(this.e, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00eb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00fe -> B:37:0x00e4). Please report as a decompilation issue!!! */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object put(java.lang.Object r23, java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uh1.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapC = c();
        if (mapC != null) {
            return mapC.remove(obj);
        }
        Object objH = h(obj);
        if (objH == v) {
            return null;
        }
        return objH;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapC = c();
        return mapC != null ? mapC.size() : this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        j2 j2Var = this.u;
        if (j2Var != null) {
            return j2Var;
        }
        j2 j2Var2 = new j2(this, 2);
        this.u = j2Var2;
        return j2Var2;
    }
}
