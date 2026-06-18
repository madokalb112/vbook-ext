package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class gi4 implements ha6 {
    public final yb4 a;
    public final boolean b;
    public final ci4 c;
    public final float d;
    public final ci4 e;
    public final float f;

    public gi4(yb4 yb4Var, boolean z, ci4 ci4Var, float f, ci4 ci4Var2, float f2) {
        yb4Var.getClass();
        this.a = yb4Var;
        this.b = z;
        this.c = ci4Var;
        this.d = f;
        this.e = ci4Var2;
        this.f = f2;
    }

    public final ia6 d(ja6 ja6Var, List list, long j) {
        int iMax;
        List list2;
        int i;
        int i2;
        int i3;
        ja6Var.getClass();
        list.getClass();
        List list3 = (List) this.a.invoke(ja6Var, new up1(j));
        int size = list3.size();
        boolean z = this.b;
        ci4 ci4Var = this.c;
        float f = this.d;
        ci4 ci4Var2 = this.e;
        float f2 = this.f;
        hi2 hi2Var = new hi2(list, list3, z, size, ci4Var, f, ci4Var2, f2);
        y86[] y86VarArr = (y86[]) hi2Var.g;
        int iJ = up1.j(j);
        int iH = up1.h(j);
        int iK = up1.k(j);
        int i4 = up1.i(j);
        ArrayList arrayList = new ArrayList();
        int iW0 = ja6Var.w0(f);
        int iW02 = ja6Var.w0(f2);
        int size2 = list.size();
        int i5 = 0;
        int iMax2 = 0;
        int iMax3 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < size2) {
            ArrayList arrayList2 = new ArrayList();
            y86[] y86VarArr2 = y86VarArr;
            int i8 = i4;
            int i9 = iK;
            int i10 = i5;
            int i11 = 0;
            int iMax4 = 0;
            int iMax5 = 0;
            int i12 = 0;
            int i13 = 0;
            while (i12 < size && i10 < size2) {
                y86 y86Var = y86VarArr2[i10];
                i3 = size2;
                if (1 > size) {
                    i10++;
                    size2 = i3;
                } else {
                    i2 = size;
                    if (1 > i2 - i12) {
                        list2 = list3;
                        i = i10;
                        break;
                    }
                    i12++;
                    ca6 ca6Var = (ca6) list.get(i10);
                    int i14 = i11;
                    int iIntValue = ((Number) list3.get(i11)).intValue();
                    List list4 = list3;
                    int i15 = Integer.MAX_VALUE;
                    if (iH != Integer.MAX_VALUE && (i15 = iH - i7) < 0) {
                        i15 = 0;
                    }
                    int i16 = i10;
                    jt7 jt7VarC = ca6Var.C(vp1.a(hi2Var.a ? iIntValue : 0, iIntValue, 0, i15));
                    y86 y86Var2 = y86VarArr2[i16];
                    arrayList2.add(new ei4(jt7VarC, iIntValue));
                    int iMin = Math.min(iW02, ((i8 + iW02) - i13) - iIntValue) + iIntValue + i13;
                    iMax5 = Math.max(iMax5, jt7VarC.b);
                    iMax4 = Math.max(iMax4, iMin);
                    i10 = i16 + 1;
                    i13 = iMin;
                    i11 = i14 + 1;
                    size = i2;
                    size2 = i3;
                    list3 = list4;
                }
            }
            list2 = list3;
            i = i10;
            i2 = size;
            i3 = size2;
            iMax3 = Math.max(iMax3, iMax4 - iW02);
            arrayList.add(arrayList2);
            int iMin2 = Math.min(iW0, ((iH + iW0) - i7) - iMax5) + iMax5 + i7;
            iMax2 = Math.max(iMax2, iMin2);
            i6++;
            i4 = i8;
            i7 = iMin2;
            y86VarArr = y86VarArr2;
            iK = i9;
            size = i2;
            size2 = i3;
            list3 = list2;
            i5 = i;
        }
        List list5 = list3;
        int i17 = i6;
        int iQ = wx1.Q(iMax2 - iW0, iJ, iH);
        int iQ2 = wx1.Q(iMax3, iK, i4);
        int i18 = hi2Var.b;
        int[] iArr = new int[i17];
        for (int i19 = 0; i19 < i17; i19++) {
            iArr[i19] = 0;
        }
        int i20 = 0;
        int[] iArr2 = new int[i18];
        for (int i21 = 0; i21 < i18; i21++) {
            iArr2[i21] = 0;
        }
        int[] iArr3 = new int[i17];
        int i22 = 0;
        while (i22 < i17) {
            iArr3[i22] = i20;
            i22++;
            i20 = 0;
        }
        for (int i23 = 0; i23 < i17; i23++) {
            List list6 = (List) arrayList.get(i23);
            int size3 = list6.size();
            int[] iArr4 = new int[size3];
            for (int i24 = 0; i24 < size3; i24++) {
                iArr4[i24] = ((ei4) list6.get(i24)).a.b;
            }
            if (size3 == 0) {
                iMax = 0;
            } else {
                iMax = iArr4[0];
                for (int i25 = 1; i25 < size3; i25++) {
                    iMax = Math.max(iMax, iArr4[i25]);
                }
            }
            iArr3[i23] = iMax;
        }
        int i26 = 0;
        ((ci4) hi2Var.e).k(Integer.valueOf(iQ), iArr3, ja6Var.getLayoutDirection(), ja6Var, iArr);
        ((ci4) hi2Var.f).k(Integer.valueOf(iQ2), fc1.Y0(list5), ja6Var.getLayoutDirection(), ja6Var, iArr2);
        ArrayList arrayList3 = new ArrayList();
        int size4 = arrayList.size();
        int i27 = 0;
        while (i27 < size4) {
            List list7 = (List) arrayList.get(i27);
            ArrayList arrayList4 = new ArrayList();
            int i28 = iArr3[i27];
            int size5 = list7.size();
            int i29 = i26;
            int i30 = i29;
            while (i29 < size5) {
                int i31 = i27;
                arrayList4.add(new fi4(iArr[i31], iArr2[i30], ((ei4) list7.get(i29)).a));
                i30++;
                i29++;
                size4 = size4;
                list7 = list7;
                i27 = i31;
            }
            arrayList3.add(arrayList4);
            i27++;
            i26 = 0;
        }
        return ja6Var.R(iQ2, iQ, mc3.a, new rx2(hi2Var, new bbc(arrayList3, iQ, iQ2)));
    }
}
