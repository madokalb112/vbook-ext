package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class zv9 implements xv9 {
    public static final /* synthetic */ int i = 0;
    public final boolean c;
    public final String[] d;
    public final List[] e;
    public final int f;
    public final int[] g;
    public final int[] h;

    public zv9(Map map, boolean z) {
        map.getClass();
        this.c = z;
        if (map.isEmpty()) {
            this.f = 0;
            this.d = new String[0];
            this.e = new List[0];
            this.g = new int[0];
            this.h = new int[0];
            return;
        }
        if (!z) {
            int size = map.size();
            this.f = size;
            this.d = new String[size];
            this.e = new List[size];
            int iB = iz7.b(size);
            int[] iArr = new int[iB];
            for (int i2 = 0; i2 < iB; i2++) {
                iArr[i2] = -1;
            }
            this.g = iArr;
            int i3 = this.f;
            int[] iArr2 = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                iArr2[i4] = -1;
            }
            this.h = iArr2;
            int i5 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                this.d[i5] = str;
                List[] listArr = this.e;
                int size2 = list.size();
                ArrayList arrayList = new ArrayList(size2);
                for (int i6 = 0; i6 < size2; i6++) {
                    arrayList.add((String) list.get(i6));
                }
                listArr[i5] = arrayList;
                int iA = a(str) & (iB - 1);
                int[] iArr3 = this.h;
                int[] iArr4 = this.g;
                iArr3[i5] = iArr4[iA];
                iArr4[iA] = i5;
                i5++;
            }
            return;
        }
        mz0 mz0Var = new mz0();
        for (Map.Entry entry2 : map.entrySet()) {
            String str2 = (String) entry2.getKey();
            List list2 = (List) entry2.getValue();
            List list3 = (List) mz0Var.get(str2);
            if (list3 != null) {
                mz0Var.put(fc1.I0(list3, list2), str2);
            } else {
                mz0Var.put(list2, str2);
            }
        }
        int i7 = mz0Var.c;
        this.f = i7;
        this.d = new String[i7];
        this.e = new List[i7];
        int iB2 = iz7.b(i7);
        int[] iArr5 = new int[iB2];
        for (int i8 = 0; i8 < iB2; i8++) {
            iArr5[i8] = -1;
        }
        this.g = iArr5;
        int i9 = this.f;
        int[] iArr6 = new int[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            iArr6[i10] = -1;
        }
        this.h = iArr6;
        int i11 = 0;
        for (Map.Entry entry3 : (jz0) mz0Var.entrySet()) {
            String str3 = (String) entry3.getKey();
            List list4 = (List) entry3.getValue();
            this.d[i11] = str3;
            List[] listArr2 = this.e;
            int size3 = list4.size();
            ArrayList arrayList2 = new ArrayList(size3);
            for (int i12 = 0; i12 < size3; i12++) {
                arrayList2.add((String) list4.get(i12));
            }
            listArr2[i11] = arrayList2;
            int iA2 = a(str3) & (iB2 - 1);
            int[] iArr7 = this.h;
            int[] iArr8 = this.g;
            iArr7[i11] = iArr8[iA2];
            iArr8[iA2] = i11;
            i11++;
        }
    }

    public final int a(String str) {
        if (!this.c) {
            return str.hashCode();
        }
        int length = str.length();
        int lowerCase = 0;
        for (int i2 = 0; i2 < length; i2++) {
            lowerCase = (lowerCase * 31) + Character.toLowerCase(str.charAt(i2));
        }
        return lowerCase;
    }

    @Override // defpackage.xv9
    public final Set b() {
        int i2 = this.f;
        if (i2 == 0) {
            return sc3.a;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i3 = 0; i3 < i2; i3++) {
            linkedHashSet.add(new i86(this.d[i3], this.e[i3]));
        }
        return linkedHashSet;
    }

    @Override // defpackage.xv9
    public final String c(String str) {
        List listH = h(str);
        if (listH != null) {
            return (String) fc1.z0(listH);
        }
        return null;
    }

    @Override // defpackage.xv9
    public final void d(yb4 yb4Var) {
        for (int i2 = 0; i2 < this.f; i2++) {
            yb4Var.invoke(this.d[i2], this.e[i2]);
        }
    }

    @Override // defpackage.xv9
    public final boolean e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xv9)) {
            return false;
        }
        xv9 xv9Var = (xv9) obj;
        if (this.c != xv9Var.e()) {
            return false;
        }
        return b().equals(xv9Var.b());
    }

    @Override // defpackage.xv9
    public final List f(String str) {
        str.getClass();
        return h(str);
    }

    @Override // defpackage.xv9
    public final boolean g() {
        return h("Content-Encoding") != null;
    }

    public final List h(String str) {
        if (this.f == 0) {
            return null;
        }
        int iA = a(str);
        int i2 = this.g[iA & (r1.length - 1)];
        while (i2 >= 0) {
            if (iw9.D(this.d[i2], str, this.c)) {
                return this.e[i2];
            }
            i2 = this.h[i2];
        }
        return null;
    }

    public final int hashCode() {
        Set setB = b();
        return setB.hashCode() + (Boolean.hashCode(this.c) * 961);
    }

    @Override // defpackage.xv9
    public final boolean isEmpty() {
        return this.f == 0;
    }

    @Override // defpackage.xv9
    public final Set names() {
        int i2 = this.f;
        if (i2 == 0) {
            return sc3.a;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i3 = 0; i3 < i2; i3++) {
            linkedHashSet.add(this.d[i3]);
        }
        return linkedHashSet;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StringValues(case=");
        sb.append(!this.c);
        sb.append(") ");
        sb.append(b());
        return sb.toString();
    }
}
