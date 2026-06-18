package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class mz0 implements Map, ji5 {
    public static final String[] u = new String[0];
    public static final Object[] v = new Object[0];
    public static final int[] w = new int[0];
    public int c;
    public int e;
    public jz0 f;
    public jz0 s;
    public lz0 t;
    public String[] a = u;
    public Object[] b = v;
    public int[] d = w;

    public final int a(String str) {
        if (this.c == 0) {
            return -1;
        }
        int iN = mc8.n(str);
        int length = this.a.length;
        while (true) {
            int i = iN & (length - 1);
            String str2 = this.a[i];
            if (str2 == null) {
                return -1;
            }
            if (str2.equalsIgnoreCase(str)) {
                return i;
            }
            iN = i + 1;
            length = this.a.length;
        }
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object put(Object obj, String str) {
        int i;
        int[] iArr;
        String str2;
        str.getClass();
        obj.getClass();
        int i2 = 0;
        if (this.a == u) {
            this.a = new String[8];
            this.b = new Object[8];
            int[] iArr2 = new int[8];
            for (int i3 = 0; i3 < 8; i3++) {
                iArr2[i3] = -1;
            }
            this.d = iArr2;
        }
        int iN = mc8.n(str);
        int length = (this.a.length - 1) & iN;
        while (true) {
            String[] strArr = this.a;
            String str3 = strArr[length];
            if (str3 == null) {
                if (this.c * 4 >= strArr.length * 3) {
                    int length2 = strArr.length * 2;
                    Object[] objArr = this.b;
                    int[] iArr3 = this.d;
                    int i4 = this.e;
                    this.a = new String[length2];
                    this.b = new Object[length2];
                    int[] iArr4 = new int[length2];
                    for (int i5 = 0; i5 < length2; i5++) {
                        iArr4[i5] = -1;
                    }
                    this.d = iArr4;
                    this.c = 0;
                    this.e = 0;
                    for (int i6 = 0; i6 < i4; i6++) {
                        int i7 = iArr3[i6];
                        if (i7 >= 0 && (str2 = strArr[i7]) != null) {
                            Object obj2 = objArr[i7];
                            obj2.getClass();
                            put(obj2, str2);
                        }
                    }
                }
                int length3 = this.a.length;
                while (true) {
                    i = iN & (length3 - 1);
                    String[] strArr2 = this.a;
                    if (strArr2[i] == null) {
                        break;
                    }
                    iN = i + 1;
                    length3 = strArr2.length;
                }
                int i8 = this.e;
                if (i8 == this.d.length && i8 != 0) {
                    int i9 = 0;
                    while (true) {
                        iArr = this.d;
                        if (i2 >= i8) {
                            break;
                        }
                        int i10 = iArr[i2];
                        if (i10 >= 0 && this.a[i10] != null) {
                            iArr[i9] = i10;
                            i9++;
                        }
                        i2++;
                    }
                    int length4 = iArr.length;
                    for (int i11 = i9; i11 < length4; i11++) {
                        this.d[i11] = -1;
                    }
                    this.e = i9;
                }
                this.a[i] = str;
                this.b[i] = obj;
                int[] iArr5 = this.d;
                int i12 = this.e;
                this.e = i12 + 1;
                iArr5[i12] = i;
                this.c++;
                return null;
            }
            if (str3.equalsIgnoreCase(str)) {
                Object[] objArr2 = this.b;
                Object obj3 = objArr2[length];
                objArr2[length] = obj;
                return obj3;
            }
            length = (length + 1) & (this.a.length - 1);
        }
    }

    @Override // java.util.Map
    public final void clear() {
        if (this.c > 0) {
            String[] strArr = this.a;
            fw.d0(0, strArr.length, null, strArr);
            Object[] objArr = this.b;
            fw.d0(0, objArr.length, null, objArr);
            fw.e0(-1, 0, 6, this.d);
            this.c = 0;
            this.e = 0;
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return (obj instanceof String) && a((String) obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj != null && this.c != 0) {
            int length = this.b.length;
            for (int i = 0; i < length; i++) {
                if (this.a[i] != null && lc5.Q(this.b[i], obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        jz0 jz0Var = this.s;
        if (jz0Var != null) {
            return jz0Var;
        }
        jz0 jz0Var2 = new jz0(this, 0);
        this.s = jz0Var2;
        return jz0Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mz0) {
            mz0 mz0Var = (mz0) obj;
            if (mz0Var.c == this.c) {
                int length = this.a.length;
                for (int i = 0; i < length; i++) {
                    String str = this.a[i];
                    if (str != null) {
                        if (!lc5.Q(mz0Var.get(str), this.b[i])) {
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iA;
        if ((obj instanceof String) && (iA = a((String) obj)) >= 0) {
            return this.b[iA];
        }
        return null;
    }

    @Override // java.util.Map
    public final int hashCode() {
        int length = this.a.length;
        int iHashCode = 0;
        for (int i = 0; i < length; i++) {
            String str = this.a[i];
            if (str != null) {
                int iN = mc8.n(str);
                Object obj = this.b[i];
                iHashCode += iN ^ (obj != null ? obj.hashCode() : 0);
            }
        }
        return iHashCode;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.c == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        jz0 jz0Var = this.f;
        if (jz0Var != null) {
            return jz0Var;
        }
        jz0 jz0Var2 = new jz0(this, 1);
        this.f = jz0Var2;
        return jz0Var2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getValue(), (String) entry.getKey());
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        int iA;
        int i;
        if (!(obj instanceof String) || (iA = a((String) obj)) < 0) {
            return null;
        }
        Object obj2 = this.b[iA];
        int i2 = this.e;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            int[] iArr = this.d;
            if (iArr[i3] == iA) {
                iArr[i3] = -1;
                break;
            }
            i3++;
        }
        String[] strArr = this.a;
        strArr[iA] = null;
        this.b[iA] = null;
        this.c--;
        int i4 = iA + 1;
        int length = strArr.length;
        while (true) {
            int i5 = i4 & (length - 1);
            String[] strArr2 = this.a;
            String str = strArr2[i5];
            if (str == null) {
                return obj2;
            }
            Object[] objArr = this.b;
            Object obj3 = objArr[i5];
            strArr2[i5] = null;
            objArr[i5] = null;
            this.c--;
            obj3.getClass();
            int iN = mc8.n(str);
            int length2 = this.a.length;
            while (true) {
                i = iN & (length2 - 1);
                String[] strArr3 = this.a;
                String str2 = strArr3[i];
                if (str2 == null) {
                    strArr3[i] = str;
                    this.b[i] = obj3;
                    this.c++;
                    break;
                }
                if (str2.equalsIgnoreCase(str)) {
                    this.b[i] = obj3;
                    break;
                }
                iN = i + 1;
                length2 = this.a.length;
            }
            int i6 = this.e;
            int i7 = 0;
            while (true) {
                if (i7 < i6) {
                    int[] iArr2 = this.d;
                    if (iArr2[i7] == i5) {
                        iArr2[i7] = i;
                        break;
                    }
                    i7++;
                }
            }
            i4 = i5 + 1;
            length = this.a.length;
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.c;
    }

    @Override // java.util.Map
    public final Collection values() {
        lz0 lz0Var = this.t;
        if (lz0Var != null) {
            return lz0Var;
        }
        lz0 lz0Var2 = new lz0(this);
        this.t = lz0Var2;
        return lz0Var2;
    }
}
