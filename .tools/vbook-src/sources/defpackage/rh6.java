package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.mozilla.javascript.Parser;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class rh6 {
    public final og a;
    public final int b;
    public final int c;
    public final xh6 d;
    public final em7 e;
    public final Map f;
    public final int g;
    public final xg5 h;
    public final ge2 i;
    public final d6a j;
    public ArrayList k;
    public final ArrayList l;

    public rh6(og ogVar, sh6 sh6Var, int i, int i2) {
        k2b qt7Var;
        this.a = ogVar;
        this.b = i;
        this.c = i2;
        xh6 xh6Var = sh6Var.b;
        this.d = xh6Var;
        em7 em7Var = sh6Var.a;
        this.e = em7Var;
        this.f = sh6Var.c;
        this.g = xh6Var.o;
        int i3 = xh6Var.d;
        xg5 xg5Var = i3 != 1252 ? i3 != 65001 ? r31.b : r31.b : r31.o;
        this.h = xg5Var;
        int i4 = em7Var.a;
        if (i4 == 1) {
            qt7Var = new qt7(0);
        } else if (i4 == 2) {
            qt7Var = new ii1(Math.max(4096, em7Var.c), 5);
        } else {
            if (i4 != 17480) {
                mn5.n(xg5Var, "unknown compression ");
                throw null;
            }
            qt7Var = new k2b(this, xh6Var);
        }
        this.i = qt7Var;
        this.j = new d6a(new uk2(this, 24));
        this.l = new ArrayList();
        int i5 = em7Var.b;
        int length = 0;
        for (int i6 = 0; i6 < i5; i6++) {
            length += e(i6).length;
            this.l.add(Integer.valueOf(length));
        }
    }

    public static final v07 c(HashMap map, v07 v07Var) {
        ArrayList arrayList;
        if (v07Var.h == null) {
            return v07Var;
        }
        ArrayList arrayList2 = (ArrayList) map.get(Integer.valueOf(v07Var.a));
        if (arrayList2 != null) {
            arrayList = new ArrayList(gc1.M(arrayList2, 10));
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                v07 v07Var2 = (v07) obj;
                c(map, v07Var2);
                arrayList.add(v07Var2);
            }
        } else {
            arrayList = null;
        }
        v07Var.j = arrayList;
        return v07Var;
    }

    public static b75 f(ts0 ts0Var) {
        String strE = ts0Var.e(0, 4);
        if (strE.equals("INDX")) {
            return new b75(strE, ts0Var.h(4), ts0Var.h(8), ts0Var.h(20), ts0Var.h(24), ts0Var.h(28), ts0Var.h(32), ts0Var.h(36), ts0Var.h(40), ts0Var.h(44), ts0Var.h(48), ts0Var.h(52));
        }
        gp.j("Invalid INDX record");
        return null;
    }

    public final d65 a(int i) {
        int i2;
        Iterator it;
        ts0 ts0Var;
        rh6 rh6Var = this;
        ts0 ts0VarD = d(i);
        b75 b75VarF = f(ts0VarD);
        int i3 = b75VarF.e;
        int i4 = b75VarF.b;
        byte[] bArr = ts0VarD.a;
        byte[] bArrY = fw.Y(bArr, i4, bArr.length);
        int i5 = 0;
        ts0 ts0Var2 = new ts0(bArrY, 0, false);
        char c = 4;
        if (!ts0Var2.e(0, 4).equals("TAGX")) {
            gp.j("Invalid INDX record");
            return null;
        }
        int iH = ts0Var2.h(4);
        char c2 = '\b';
        int iH2 = ts0Var2.h(8);
        int i6 = (iH - 12) / 4;
        ArrayList arrayList = new ArrayList();
        ts0Var2.b = 12;
        int i7 = 0;
        while (i7 < i6) {
            int i8 = ts0Var2.b;
            ts0Var2.b = i8 + 1;
            int iJ = ts0Var2.j(i8);
            int i9 = ts0Var2.b;
            ts0Var2.b = i9 + 1;
            int iJ2 = ts0Var2.j(i9);
            int i10 = ts0Var2.b;
            ts0Var2.b = i10 + 1;
            int iJ3 = ts0Var2.j(i10);
            int i11 = ts0Var2.b;
            ts0Var2.b = i11 + 1;
            arrayList.add(new m9a(iJ, iJ2, iJ3, ts0Var2.j(i11)));
            i7++;
            c = c;
        }
        HashMap map = new HashMap();
        int i12 = b75VarF.l;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            i2 = 1;
            if (i13 >= i12) {
                break;
            }
            ts0 ts0VarD2 = rh6Var.d(i + i3 + i13 + 1);
            byte[] bArr2 = ts0VarD2.a;
            int i15 = i5;
            while (i15 < bArr2.length) {
                int iMin = Math.min(i15 + 4, bArr2.length);
                int i16 = i5;
                int i17 = i16;
                for (int i18 = i15; i18 < iMin; i18++) {
                    byte b = bArr2[i18];
                    i16 = (i16 << 7) | (b & 127);
                    i17++;
                    if ((b & 128) == 0) {
                    }
                }
                int i19 = i16;
                int i20 = i15 + i17;
                xg5 xg5Var = rh6Var.h;
                xg5Var.getClass();
                char c3 = c2;
                map.put(Integer.valueOf(i15 + i14), xg5Var.a(ts0VarD2.b(i20, i19)));
                i15 = i20 + i19;
                c2 = c3;
                i5 = 0;
            }
            i14 += Parser.ARGC_LIMIT;
            i13++;
            i5 = 0;
        }
        ArrayList arrayList2 = new ArrayList();
        int i21 = 0;
        while (i21 < i3) {
            ts0 ts0VarD3 = rh6Var.d(i + 1 + i21);
            b75 b75VarF2 = f(ts0VarD3);
            int i22 = b75VarF2.e;
            int i23 = b75VarF2.d + 4;
            int[] iArr = new int[i22];
            for (int i24 = 0; i24 < i22; i24++) {
                int i25 = (i24 * 2) + i23;
                iArr[i24] = (ts0VarD3.j(i25 + i2) | (ts0VarD3.j(i25) << 8)) & 65535;
            }
            int i26 = 0;
            while (i26 < i22) {
                int i27 = iArr[i26];
                byte[] bArr3 = ts0VarD3.a;
                int iJ4 = ts0VarD3.j(i27);
                int i28 = i27 + i2;
                String strE = ts0VarD3.e(i28, iJ4);
                ArrayList arrayList3 = new ArrayList();
                int i29 = i28 + iJ4;
                int i30 = i29 + iH2;
                int size = arrayList.size();
                int i31 = i3;
                int i32 = 0;
                int i33 = 0;
                while (i32 < size) {
                    Object obj = arrayList.get(i32);
                    int i34 = i32 + 1;
                    int i35 = size;
                    m9a m9aVar = (m9a) obj;
                    int i36 = m9aVar.d;
                    int i37 = i21;
                    int i38 = m9aVar.b;
                    int i39 = i26;
                    int i40 = m9aVar.a;
                    int i41 = i22;
                    if (i36 == 1) {
                        i33++;
                    } else {
                        int iJ5 = ts0VarD3.j(i29 + i33);
                        int i42 = m9aVar.c;
                        int i43 = iJ5 & i42;
                        if (i43 != i42) {
                            while ((i42 & 1) == 0) {
                                i42 >>= 1;
                                i43 >>= 1;
                            }
                            arrayList3.add(new a68(i40, i38, Integer.valueOf(i43), null));
                        } else if (Integer.bitCount(i42) > 1) {
                            int iMin2 = Math.min(i30 + 4, bArr3.length);
                            int i44 = i30;
                            int i45 = 0;
                            while (i30 < iMin2) {
                                int i46 = iMin2;
                                byte b2 = bArr3[i30];
                                i45 = (i45 << 7) | (b2 & 127);
                                i44++;
                                if ((b2 & 128) != 0) {
                                    break;
                                }
                                i30++;
                                iMin2 = i46;
                            }
                            arrayList3.add(new a68(i40, i38, null, Integer.valueOf(i45)));
                            i30 = i44;
                        } else {
                            arrayList3.add(new a68(i40, i38, 1, null));
                        }
                    }
                    i32 = i34;
                    size = i35;
                    i21 = i37;
                    i26 = i39;
                    i22 = i41;
                }
                int i47 = i21;
                int i48 = i26;
                int i49 = i22;
                ArrayList arrayList4 = new ArrayList();
                HashMap map2 = new HashMap();
                Iterator it2 = arrayList3.iterator();
                it2.getClass();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    next.getClass();
                    a68 a68Var = (a68) next;
                    ArrayList arrayList5 = new ArrayList();
                    Integer num = a68Var.c;
                    if (num != null) {
                        int iIntValue = num.intValue() * a68Var.b;
                        int i50 = 0;
                        while (i50 < iIntValue) {
                            Iterator it3 = it2;
                            ts0 ts0Var3 = ts0VarD3;
                            int iMin3 = Math.min(i30 + 4, bArr3.length);
                            int i51 = i30;
                            int i52 = 0;
                            while (i30 < iMin3) {
                                int i53 = iMin3;
                                byte b3 = bArr3[i30];
                                i52 = (i52 << 7) | (b3 & 127);
                                i51++;
                                if ((b3 & 128) == 0) {
                                    i30++;
                                    iMin3 = i53;
                                }
                            }
                            i30 = i51;
                            arrayList5.add(Integer.valueOf(i52));
                            i50++;
                            it2 = it3;
                            ts0VarD3 = ts0Var3;
                        }
                        it = it2;
                        ts0Var = ts0VarD3;
                    } else {
                        it = it2;
                        ts0Var = ts0VarD3;
                        int i54 = 0;
                        while (true) {
                            Integer num2 = a68Var.d;
                            num2.getClass();
                            if (i54 < num2.intValue()) {
                                int iMin4 = Math.min(i30 + 4, bArr3.length);
                                int i55 = i30;
                                int i56 = 0;
                                while (true) {
                                    int i57 = i54;
                                    if (i30 >= iMin4) {
                                        i30 = i55;
                                        break;
                                    }
                                    byte b4 = bArr3[i30];
                                    i56 = (i56 << 7) | (b4 & 127);
                                    i55++;
                                    int i58 = i57 + 1;
                                    if ((b4 & 128) != 0) {
                                        i30 = i55;
                                        i54 = i58;
                                        break;
                                    }
                                    i30++;
                                    i54 = i58;
                                }
                                arrayList5.add(Integer.valueOf(i56));
                            }
                        }
                    }
                    int i59 = a68Var.a;
                    h65 h65Var = new h65(i59, arrayList5);
                    arrayList4.add(h65Var);
                    map2.put(Integer.valueOf(i59), h65Var);
                    it2 = it;
                    ts0VarD3 = ts0Var;
                }
                arrayList2.add(new e65(strE, arrayList4, map2));
                i26 = i48 + 1;
                i2 = 1;
                i3 = i31;
                i21 = i47;
                i22 = i49;
            }
            i21++;
            rh6Var = this;
        }
        return new d65(arrayList2, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Integer] */
    public final ArrayList b() throws Throwable {
        int i = this.d.p;
        Throwable th = null;
        if (i == -1) {
            return null;
        }
        d65 d65VarA = a(i);
        ArrayList arrayList = d65VarA.a;
        ArrayList arrayList2 = new ArrayList(gc1.M(arrayList, 10));
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            int i5 = i3 + 1;
            int i6 = i4 + 1;
            if (i4 < 0) {
                Throwable th2 = th;
                gc1.i0();
                throw th2;
            }
            HashMap map = ((e65) obj).c;
            h65 h65Var = (h65) map.get(1);
            ?? r9 = h65Var != null ? (Integer) fc1.A0(0, h65Var.b) : th;
            h65 h65Var2 = (h65) map.get(2);
            ?? r10 = h65Var2 != null ? (Integer) fc1.A0(0, h65Var2.b) : th;
            h65 h65Var3 = (h65) map.get(3);
            ?? r11 = h65Var3 != null ? (String) d65VarA.b.get(fc1.A0(0, h65Var3.b)) : th;
            if (r11 == 0) {
                r11 = "";
            }
            h65 h65Var4 = (h65) map.get(4);
            ?? r12 = h65Var4 != null ? (Integer) fc1.A0(0, h65Var4.b) : th;
            h65 h65Var5 = (h65) map.get(6);
            ?? r13 = h65Var5 != null ? h65Var5.b : th;
            h65 h65Var6 = (h65) map.get(21);
            ?? r14 = h65Var6 != null ? (Integer) fc1.A0(0, h65Var6.b) : th;
            h65 h65Var7 = (h65) map.get(22);
            ?? r15 = h65Var7 != null ? (Integer) fc1.A0(0, h65Var7.b) : th;
            Throwable th3 = th;
            h65 h65Var8 = (h65) map.get(23);
            arrayList2.add(new v07(i4, r9, r10, r11, r12, r13, r14, r15, h65Var8 != null ? (Integer) fc1.A0(0, h65Var8.b) : th3));
            i3 = i5;
            i4 = i6;
            th = th3;
        }
        HashMap map2 = new HashMap();
        int size2 = arrayList2.size();
        int i7 = 0;
        while (i7 < size2) {
            Object obj2 = arrayList2.get(i7);
            i7++;
            v07 v07Var = (v07) obj2;
            Integer num = v07Var.g;
            if (num != null) {
                Object arrayList3 = map2.get(num);
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    map2.put(num, arrayList3);
                }
                ((ArrayList) arrayList3).add(v07Var);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayList2.size();
        int i8 = 0;
        while (i8 < size3) {
            Object obj3 = arrayList2.get(i8);
            i8++;
            Integer num2 = ((v07) obj3).e;
            if (num2 != null && num2.intValue() == 0) {
                arrayList4.add(obj3);
            }
        }
        ArrayList arrayList5 = new ArrayList(gc1.M(arrayList4, 10));
        int size4 = arrayList4.size();
        while (i2 < size4) {
            Object obj4 = arrayList4.get(i2);
            i2++;
            v07 v07Var2 = (v07) obj4;
            c(map2, v07Var2);
            arrayList5.add(v07Var2);
        }
        return arrayList5;
    }

    public final ts0 d(int i) {
        return this.a.o(this.b + i);
    }

    public final byte[] e(int i) {
        if (i < 0 && i >= this.e.b) {
            k27.m("Text record index out of bounds");
            return null;
        }
        byte[] bArrY = d(i + 1).a;
        int i2 = this.g;
        if (i2 != 0) {
            boolean z = (i2 & 1) != 0;
            int iBitCount = Integer.bitCount(i2 >> 1);
            bArrY.getClass();
            int length = bArrY.length;
            int i3 = length - 1;
            int i4 = 0;
            for (int i5 = 0; i5 < iBitCount; i5++) {
                int iMax = Math.max(0, (length - 5) - i4);
                int iMax2 = Math.max(0, i3 - i4);
                int i6 = 0;
                if (iMax <= iMax2) {
                    while (true) {
                        byte b = bArrY[iMax];
                        if ((b & 128) != 0) {
                            i6 = 0;
                        }
                        i6 = (i6 << 7) | (b & 127);
                        if (iMax != iMax2) {
                            iMax++;
                        }
                    }
                }
                i4 += i6;
            }
            if (z) {
                i4 += ((byte) (bArrY[(bArrY.length - 1) - i4] & 3)) + 1;
            }
            bArrY = fw.Y(bArrY, 0, bArrY.length - i4);
        }
        return this.i.b(bArrY);
    }

    public final void finalize() {
    }
}
