package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ez0 implements fk7 {
    public final yb4 a;
    public final float b;
    public final float c;
    public final cn7 d = dk9.x(ts9.n);

    public ez0(yb4 yb4Var, float f, float f2) {
        this.a = yb4Var;
        this.b = f;
        this.c = f2;
    }

    public final int m(int i, int i2) {
        float f;
        xj5 xj5Var;
        float f2;
        float f3;
        int i3;
        float f4;
        Object next;
        ArrayList arrayList;
        ArrayList arrayList2;
        List list;
        int i4;
        List list2;
        int iIntValue;
        Object next2;
        float f5 = i;
        float f6 = i2;
        xj5 xj5Var2 = (xj5) this.a.invoke(Float.valueOf(f5), Float.valueOf(f6));
        List list3 = xj5Var2.a;
        List list4 = xj5Var2.a;
        int i5 = xj5Var2.c;
        boolean zIsEmpty = list3.isEmpty();
        float f7 = this.b;
        lc3 lc3Var = lc3.a;
        float f8 = 0.0f;
        int i6 = 1;
        if (zIsEmpty) {
            xj5Var = xj5Var2;
            f2 = f7;
            list = lc3Var;
            f3 = 0.0f;
            f = 2.0f;
        } else {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(xj5Var2);
            f = 2.0f;
            if (xj5Var2.c().b - (xj5Var2.c().a / 2.0f) < 0.0f || !xj5Var2.c().equals(xj5Var2.get(i5))) {
                xj5Var = xj5Var2;
                ArrayList arrayList4 = arrayList3;
                int i7 = xj5Var.e - i5;
                if (i7 > 0 || xj5Var.c().g <= 0.0f) {
                    int i8 = 0;
                    while (i8 < i7) {
                        float f9 = f8;
                        xj5 xj5Var3 = (xj5) fc1.E0(arrayList4);
                        int i9 = i5 + i8;
                        int size = list4.size() - 1;
                        if (i9 > 0) {
                            float f10 = xj5Var.get(i9 - 1).a;
                            int i10 = i6;
                            int i11 = xj5Var3.f;
                            List list5 = xj5Var3.a;
                            i3 = i7;
                            f4 = f7;
                            Iterator it = new ha5(i11, list5.size() - 1, i10).iterator();
                            while (true) {
                                w21 w21Var = (w21) it;
                                if (!w21Var.d) {
                                    next = null;
                                    break;
                                }
                                next = w21Var.next();
                                if (xj5Var3.get(((Number) next).intValue()).a == f10) {
                                    break;
                                }
                            }
                            Integer num = (Integer) next;
                            size = (num != null ? num.intValue() : list5.size() - 1) - 1;
                        } else {
                            i3 = i7;
                            f4 = f7;
                        }
                        arrayList4.add(gl9.k(xj5Var3, i5, size, f5, f6));
                        i8++;
                        f8 = f9;
                        i7 = i3;
                        f7 = f4;
                        i6 = 1;
                    }
                    f2 = f7;
                    f3 = f8;
                    list = arrayList4;
                    if (f2 != f3) {
                        arrayList4.set(arrayList4.size() - 1, gl9.f((xj5) fc1.E0(arrayList4), f5, f6, f2, ((xj5) fc1.E0(arrayList4)).c(), ((xj5) fc1.E0(arrayList4)).e));
                        list = arrayList4;
                    }
                } else {
                    arrayList4.add(gl9.k(xj5Var, 0, 0, f5, f6));
                    arrayList = arrayList4;
                }
            } else if (f7 == 0.0f) {
                xj5Var = xj5Var2;
                f2 = f7;
                arrayList2 = arrayList3;
                f3 = 0.0f;
                list = arrayList2;
            } else {
                ArrayList arrayList5 = arrayList3;
                xj5Var = xj5Var2;
                arrayList5.add(gl9.f(xj5Var2, f5, f6, f7, xj5Var2.c(), xj5Var2.e));
                arrayList = arrayList5;
            }
            f2 = f7;
            arrayList2 = arrayList;
            f3 = 0.0f;
            list = arrayList2;
        }
        int i12 = xj5Var.d;
        boolean zIsEmpty2 = list4.isEmpty();
        List list6 = list4;
        float f11 = this.c;
        List list7 = lc3Var;
        if (!zIsEmpty2) {
            ArrayList arrayList6 = new ArrayList();
            arrayList6.add(xj5Var);
            if ((xj5Var.d().a / f) + xj5Var.d().b > f5 || !xj5Var.d().equals(xj5Var.get(i12))) {
                int i13 = i12 - xj5Var.f;
                if (i13 > 0 || xj5Var.d().g <= f3) {
                    int i14 = 0;
                    while (i14 < i13) {
                        xj5 xj5Var4 = (xj5) fc1.E0(arrayList6);
                        int i15 = i12 - i14;
                        if (i15 < list6.size() - 1) {
                            float f12 = xj5Var.get(i15 + 1).a;
                            int i16 = xj5Var4.e - 1;
                            i4 = i13;
                            list2 = list6;
                            w21 w21Var2 = new w21(i16, sw1.O(i16, 0, -1), -1);
                            while (true) {
                                if (!w21Var2.d) {
                                    next2 = null;
                                    break;
                                }
                                next2 = w21Var2.next();
                                if (xj5Var4.get(((Number) next2).intValue()).a == f12) {
                                    break;
                                }
                            }
                            Integer num2 = (Integer) next2;
                            iIntValue = (num2 != null ? num2.intValue() : 0) + 1;
                        } else {
                            i4 = i13;
                            list2 = list6;
                            iIntValue = 0;
                        }
                        arrayList6.add(gl9.k(xj5Var4, i12, iIntValue, f5, f6));
                        i14++;
                        i13 = i4;
                        list6 = list2;
                    }
                    list7 = arrayList6;
                    if (f11 != f3) {
                        arrayList6.set(arrayList6.size() - 1, gl9.f((xj5) fc1.E0(arrayList6), f5, f6, -f11, ((xj5) fc1.E0(arrayList6)).d(), ((xj5) fc1.E0(arrayList6)).f));
                        list7 = arrayList6;
                    }
                } else {
                    arrayList6.add(gl9.k(xj5Var, 0, 0, f5, f6));
                    list7 = arrayList6;
                }
            } else {
                list7 = arrayList6;
                if (f11 != f3) {
                    arrayList6.add(gl9.f(xj5Var, f5, f6, -f11, xj5Var.d(), xj5Var.f));
                    list7 = arrayList6;
                }
            }
        }
        ts9 ts9Var = new ts9(xj5Var, list, list7, f5, f6, f2, f11);
        cn7 cn7Var = this.d;
        cn7Var.setValue(ts9Var);
        return ((ts9) cn7Var.getValue()).l ? t96.M(((ts9) cn7Var.getValue()).a()) : i;
    }
}
