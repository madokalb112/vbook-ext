package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class f55 extends s45 implements Set {
    public static final /* synthetic */ int c = 0;
    public transient a55 b;

    public static int h(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            fx1.F("collection too large", iMax < 1073741824);
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static f55 i(int i, Object... objArr) {
        if (i == 0) {
            return oh8.v;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new zf9(obj);
        }
        int iH = h(i);
        Object[] objArr2 = new Object[iH];
        int i2 = iH - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                k27.n(dx1.f(i5, "at index "));
                return null;
            }
            int iHashCode = obj2.hashCode();
            int iI0 = ww1.i0(iHashCode);
            while (true) {
                int i6 = iI0 & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iI0++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new zf9(obj4);
        }
        if (h(i4) < iH / 2) {
            return i(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new oh8(objArr, i3, objArr2, i2, i4);
    }

    public static f55 j(Collection collection) {
        if ((collection instanceof f55) && !(collection instanceof SortedSet)) {
            f55 f55Var = (f55) collection;
            if (!f55Var.f()) {
                return f55Var;
            }
        }
        Object[] array = collection.toArray();
        return i(array.length, array);
    }

    public static f55 l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        fx1.F("the total number of elements must fit in an int", objArr.length <= 2147483641);
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return i(length, objArr2);
    }

    @Override // defpackage.s45
    public a55 a() {
        a55 a55Var = this.b;
        if (a55Var != null) {
            return a55Var;
        }
        a55 a55VarK = k();
        this.b = a55VarK;
        return a55VarK;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof f55) && (this instanceof oh8) && (((f55) obj) instanceof oh8) && ((oh8) this).e != obj.hashCode()) {
            return false;
        }
        return ny1.C(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return ny1.M(this);
    }

    public a55 k() {
        Object[] array = toArray(s45.a);
        w45 w45Var = a55.b;
        return a55.h(array.length, array);
    }
}
