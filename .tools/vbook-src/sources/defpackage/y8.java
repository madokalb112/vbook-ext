package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class y8 implements ha6 {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;

    public y8(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public static final void b(ArrayList arrayList, pg8 pg8Var, ja6 ja6Var, float f, ArrayList arrayList2, ArrayList arrayList3, pg8 pg8Var2, ArrayList arrayList4, pg8 pg8Var3, pg8 pg8Var4) {
        if (!arrayList.isEmpty()) {
            pg8Var.a = ja6Var.w0(f) + pg8Var.a;
        }
        arrayList.add(0, fc1.Z0(arrayList2));
        arrayList3.add(Integer.valueOf(pg8Var2.a));
        arrayList4.add(Integer.valueOf(pg8Var.a));
        pg8Var.a += pg8Var2.a;
        pg8Var3.a = Math.max(pg8Var3.a, pg8Var4.a);
        arrayList2.clear();
        pg8Var4.a = 0;
        pg8Var2.a = 0;
    }

    public final ia6 d(final ja6 ja6Var, List list, long j) {
        int i;
        jt7 jt7Var;
        ja6Var.getClass();
        list.getClass();
        final ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        pg8 pg8Var = new pg8();
        pg8 pg8Var2 = new pg8();
        ArrayList arrayList4 = new ArrayList();
        pg8 pg8Var3 = new pg8();
        pg8 pg8Var4 = new pg8();
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            jt7 jt7VarC = ((ca6) list.get(i2)).C(j);
            boolean zIsEmpty = arrayList4.isEmpty();
            int i3 = size;
            float f = this.a;
            if (zIsEmpty) {
                i = i2;
                jt7Var = jt7VarC;
            } else {
                ArrayList arrayList5 = arrayList;
                pg8 pg8Var5 = pg8Var2;
                if (ja6Var.w0(f) + pg8Var3.a + jt7VarC.a <= up1.i(j)) {
                    arrayList = arrayList5;
                    pg8Var2 = pg8Var5;
                    i = i2;
                    jt7Var = jt7VarC;
                } else {
                    i = i2;
                    pg8Var2 = pg8Var5;
                    jt7Var = jt7VarC;
                    arrayList = arrayList5;
                    b(arrayList, pg8Var2, ja6Var, this.b, arrayList4, arrayList2, pg8Var4, arrayList3, pg8Var, pg8Var3);
                }
            }
            if (!arrayList4.isEmpty()) {
                pg8Var3.a = ja6Var.w0(f) + pg8Var3.a;
            }
            arrayList4.add(jt7Var);
            pg8Var3.a += jt7Var.a;
            pg8Var4.a = Math.max(pg8Var4.a, jt7Var.b);
            i2 = i + 1;
            size = i3;
        }
        if (!arrayList4.isEmpty()) {
            b(arrayList, pg8Var2, ja6Var, this.b, arrayList4, arrayList2, pg8Var4, arrayList3, pg8Var, pg8Var3);
        }
        final int iMax = Math.max(pg8Var.a, up1.k(j));
        int iMax2 = Math.max(pg8Var2.a, up1.j(j));
        final float f2 = this.a;
        return ja6Var.R(iMax, iMax2, mc3.a, new kb4() { // from class: x8
            @Override // defpackage.kb4
            public final Object invoke(Object obj) {
                it7 it7Var = (it7) obj;
                it7Var.getClass();
                ArrayList arrayList6 = arrayList;
                int size2 = arrayList6.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    List list2 = (List) arrayList6.get(i4);
                    int size3 = list2.size();
                    int[] iArr = new int[size3];
                    int i5 = 0;
                    while (i5 < size3) {
                        iArr[i5] = ((jt7) list2.get(i5)).a + (i5 < list2.size() + (-1) ? it7Var.w0(f2) : 0);
                        i5++;
                    }
                    int[] iArr2 = new int[size3];
                    for (int i6 = 0; i6 < size3; i6++) {
                        iArr2[i6] = 0;
                    }
                    if (ja6Var.getLayoutDirection() == zm5.a) {
                        int i7 = 0;
                        for (int i8 = 0; i8 < size3; i8++) {
                            i7 += iArr[i8];
                        }
                        int i9 = iMax - i7;
                        int i10 = 0;
                        int i11 = 0;
                        while (i10 < size3) {
                            int i12 = iArr[i10];
                            iArr2[i11] = i9;
                            i9 += i12;
                            i10++;
                            i11++;
                        }
                    } else {
                        int i13 = 0;
                        for (int i14 = size3 - 1; -1 < i14; i14--) {
                            int i15 = iArr[i14];
                            iArr2[i14] = i13;
                            i13 += i15;
                        }
                    }
                    int size4 = list2.size();
                    for (int i16 = 0; i16 < size4; i16++) {
                        it7Var.i((jt7) list2.get(i16), iArr2[i16], ((Number) arrayList3.get(i4)).intValue(), 0.0f);
                    }
                }
                return heb.a;
            }
        });
    }
}
