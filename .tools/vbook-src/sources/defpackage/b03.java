package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import org.mozilla.javascript.Parser;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class b03 {
    public int a = Parser.ARGC_LIMIT;
    public int[] b = new int[Parser.ARGC_LIMIT];
    public int[] c = new int[Parser.ARGC_LIMIT];
    public final rg0 d;
    public final int[][] e;
    public final int f;
    public int g;
    public int h;
    public int i;
    public final nu j;
    public final qr0 k;

    public b03(String[] strArr) {
        rg0 rg0Var = new rg0();
        rg0Var.a = new long[1024];
        this.d = rg0Var;
        int length = strArr.length;
        int[][] iArr = new int[length][];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            int length2 = str.length();
            int[] iArr2 = new int[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                iArr2[i2] = str.charAt(i2) + 1;
            }
            iArr[i] = iArr2;
        }
        this.e = iArr;
        this.f = strArr.length;
        this.j = new nu(1, false);
        this.k = new qr0(1);
        this.c[0] = 1;
    }

    public final void a() {
        a03 a03Var;
        nu nuVar = this.j;
        ArrayList arrayList = nuVar.a;
        ArrayList arrayList2 = nuVar.a;
        if (arrayList.isEmpty()) {
            a03Var = new a03();
        } else {
            Object objRemove = arrayList.remove(arrayList.size() - 1);
            objRemove.getClass();
            a03Var = (a03) objRemove;
        }
        a03Var.c = 0;
        a03Var.d = this.f;
        a03Var.b = 0;
        a03Var.a = 0;
        qr0 qr0Var = this.k;
        ArrayList arrayListA = qr0Var.a();
        b(a03Var, arrayListA);
        c(arrayListA);
        int size = arrayListA.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayListA.get(i);
            obj.getClass();
            arrayList2.add((a03) obj);
        }
        arrayListA.clear();
        qr0Var.a.add(arrayListA);
        arrayList2.add(a03Var);
        int[] iArr = this.c;
        int i2 = this.i + Parser.ARGC_LIMIT;
        int[] iArr2 = new int[i2];
        fw.V(0, Math.min(i2, iArr.length), 2, iArr, iArr2);
        this.c = iArr2;
        int[] iArr3 = this.b;
        int i3 = this.i + Parser.ARGC_LIMIT;
        int[] iArr4 = new int[i3];
        fw.V(0, Math.min(i3, iArr3.length), 2, iArr3, iArr4);
        this.b = iArr4;
    }

    public final int b(a03 a03Var, ArrayList arrayList) {
        a03 a03Var2;
        if (this.h < 0) {
            return 0;
        }
        int i = a03Var.b;
        int i2 = a03Var.d;
        int i3 = 0;
        int size = -1;
        for (int i4 = a03Var.c; i4 < i2; i4++) {
            int[] iArr = this.e[i4];
            int length = iArr.length;
            if (length >= i) {
                int i5 = length == i ? 0 : iArr[i];
                if (i3 > i5) {
                    this.h = -3;
                    return 0;
                }
                if (i5 != i3 || size == -1) {
                    ArrayList arrayList2 = this.j.a;
                    if (arrayList2.isEmpty()) {
                        a03Var2 = new a03();
                    } else {
                        Object objRemove = arrayList2.remove(arrayList2.size() - 1);
                        objRemove.getClass();
                        a03Var2 = (a03) objRemove;
                    }
                    a03Var2.b = i + 1;
                    a03Var2.a = i5;
                    a03Var2.c = i4;
                    if (size != -1) {
                        ((a03) arrayList.get(size)).d = i4;
                    }
                    arrayList.add(a03Var2);
                    size = arrayList.size() - 1;
                }
                i3 = i5;
            }
        }
        if (size != -1) {
            ((a03) arrayList.get(size)).d = i2;
        }
        return arrayList.size();
    }

    public final int c(ArrayList arrayList) {
        int i;
        int i2;
        int i3;
        rg0 rg0Var;
        int i4;
        if (this.h < 0) {
            return 0;
        }
        int i5 = 1;
        int iMax = Math.max(((a03) arrayList.get(0)).a + 1, this.g);
        int i6 = iMax - 1;
        if (this.a <= i6) {
            d(iMax);
        }
        int i7 = ((a03) arrayList.get(0)).a;
        int size = arrayList.size();
        int i8 = ((a03) arrayList.get(size - 1)).a;
        int i9 = 65535 + i8;
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = ((a03) arrayList.get(i10)).a;
        }
        int i11 = 0;
        int i12 = 0;
        loop1: while (true) {
            i6 += i5;
            int i13 = this.a;
            if (i13 <= i6 && i6 > i13) {
                d(i6);
            }
            if (this.b[i6] != 0) {
                i11++;
            } else {
                if (i12 == 0) {
                    this.g = i6;
                    i12 = i5;
                }
                i = i6 - i7;
                int i14 = this.a;
                i2 = i + i8;
                if (i14 <= i2 && (i4 = i + i9) > i14) {
                    d(i4);
                }
                i3 = i >> 6;
                rg0Var = this.d;
                long[] jArr = rg0Var.a;
                int i15 = i5;
                if (i3 >= jArr.length || (jArr[i3] & (1 << i)) == 0) {
                    for (int i16 = i15; i16 < size; i16++) {
                        if (this.b[i + iArr[i16]] == 0) {
                        }
                    }
                    break loop1;
                }
                i5 = i15;
            }
        }
        if (i11 * 20 >= ((i6 - this.g) + 1) * 19) {
            this.g = i6;
        }
        long[] jArr2 = rg0Var.a;
        if (i3 >= jArr2.length) {
            rg0Var.a = Arrays.copyOf(jArr2, i3 + 1);
        }
        long[] jArr3 = rg0Var.a;
        jArr3[i3] = jArr3[i3] | (1 << i);
        this.i = Math.max(this.i, i2 + 1);
        for (int i17 = 0; i17 < size; i17++) {
            this.b[iArr[i17] + i] = i;
        }
        for (int i18 = 0; i18 < size; i18++) {
            Object obj = arrayList.get(i18);
            obj.getClass();
            a03 a03Var = (a03) obj;
            qr0 qr0Var = this.k;
            ArrayList arrayListA = qr0Var.a();
            if (b(a03Var, arrayListA) == 0) {
                this.c[a03Var.a + i] = (-a03Var.c) - 1;
            } else {
                this.c[a03Var.a + i] = c(arrayListA);
            }
            int size2 = arrayListA.size();
            for (int i19 = 0; i19 < size2; i19++) {
                Object obj2 = arrayListA.get(i19);
                obj2.getClass();
                nu nuVar = this.j;
                nuVar.getClass();
                nuVar.a.add((a03) obj2);
            }
            arrayListA.clear();
            qr0Var.a.add(arrayListA);
        }
        return i;
    }

    public final void d(int i) {
        int i2 = this.a;
        if (i <= i2) {
            return;
        }
        int i3 = i2 >> 1;
        if (i3 < 1) {
            i3 = 1;
        }
        int iMax = Math.max(i, i2 + i3);
        this.c = Arrays.copyOf(this.c, iMax);
        this.b = Arrays.copyOf(this.b, iMax);
        this.a = iMax;
    }
}
