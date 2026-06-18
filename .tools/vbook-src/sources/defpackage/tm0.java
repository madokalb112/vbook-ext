package defpackage;

import android.text.Layout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class tm0 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ tm0(long j, float[] fArr, pg8 pg8Var, og8 og8Var) {
        this.a = 2;
        this.b = j;
        this.c = fArr;
        this.d = pg8Var;
        this.e = og8Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) throws Throwable {
        long j;
        boolean z;
        int i;
        float fA;
        float fA2;
        int i2;
        heb hebVar;
        int iMax;
        int iMin;
        int i3 = this.a;
        Throwable th = null;
        int i4 = 1;
        heb hebVar2 = heb.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i3) {
            case 0:
                kf8 kf8Var = (kf8) obj4;
                rg8 rg8Var = (rg8) obj3;
                long j2 = this.b;
                qc1 qc1Var = (qc1) obj2;
                un5 un5Var = (un5) obj;
                un5Var.a();
                float f = kf8Var.a;
                float f2 = kf8Var.b;
                hy0 hy0Var = un5Var.a;
                ((lp8) hy0Var.b.b).D(f, f2);
                try {
                    r43.F0(un5Var, (ky4) rg8Var.a, j2, 0L, 0L, 0.0f, qc1Var, 0, 890);
                    return hebVar2;
                } finally {
                    ((lp8) hy0Var.b.b).D(-f, -f2);
                }
            case 1:
                nf1 nf1Var = (nf1) obj3;
                String str = nf1Var.c;
                m62 m62Var = nf1Var.g;
                ArrayList arrayList = (ArrayList) obj2;
                ((u2b) obj).getClass();
                int i5 = 0;
                for (Object obj5 : (List) obj4) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        gc1.i0();
                        throw null;
                    }
                    b92 b92Var = m62Var.C;
                    String strG = dx1.g(i5, str, "_");
                    String str2 = nf1Var.c;
                    String str3 = ((cn9) obj5).a;
                    qa1 qa1Var = r95.a;
                    b92Var.l0(new xb2(strG, str2, i5, str3, qa1Var.k().c(), qa1Var.k().c()));
                    i5 = i6;
                }
                b92 b92Var2 = m62Var.f;
                b92 b92Var3 = m62Var.J;
                b92Var2.O(str);
                int size = arrayList.size();
                int i7 = 0;
                int i8 = 0;
                while (true) {
                    long j3 = this.b;
                    if (i8 >= size) {
                        b92Var3.S(str);
                        int size2 = arrayList.size();
                        int i9 = 0;
                        int i10 = 0;
                        while (i10 < size2) {
                            Object obj6 = arrayList.get(i10);
                            i10++;
                            int i11 = i9 + 1;
                            if (i9 < 0) {
                                gc1.i0();
                                throw null;
                            }
                            ll9 ll9Var = (ll9) obj6;
                            String strG2 = dx1.g(i9, str, "_");
                            String str4 = nf1Var.c;
                            Map mapSingletonMap = Collections.singletonMap("raw", ll9Var.a);
                            mapSingletonMap.getClass();
                            String str5 = ll9Var.b;
                            qa1 qa1Var2 = r95.a;
                            b92Var3.n0(new uc2(strG2, str4, mapSingletonMap, str5, "", i9, qa1Var2.k().c(), qa1Var2.k().c()));
                            i9 = i11;
                        }
                        m62Var.b.t0(arrayList.size(), 0, 0L, j3, nf1Var.c);
                        return hebVar2;
                    }
                    Object obj7 = arrayList.get(i8);
                    i8++;
                    int i12 = i7 + 1;
                    if (i7 < 0) {
                        gc1.i0();
                        throw null;
                    }
                    ll9 ll9Var2 = (ll9) obj7;
                    m62Var.f.h0(new v92(dx1.g(i7, str, "_"), nf1Var.c, wfc.l(ll9Var2.b, false), i7, ll9Var2.b, 0, false, ll9Var2.f, ll9Var2.e, 0L, j3, j3));
                    size = size;
                    i7 = i12;
                }
                break;
            case 2:
                float[] fArr = (float[]) obj4;
                pg8 pg8Var = (pg8) obj3;
                og8 og8Var = (og8) obj2;
                gm7 gm7Var = (gm7) obj;
                int i13 = gm7Var.b;
                bh bhVar = gm7Var.a;
                int iF = gm7Var.c;
                long j4 = this.b;
                int iG = i13 > pja.g(j4) ? gm7Var.b : pja.g(j4);
                if (iF >= pja.f(j4)) {
                    iF = pja.f(j4);
                }
                long jH = zk9.h(gm7Var.d(iG), gm7Var.d(iF));
                int i14 = pg8Var.a;
                oha ohaVar = bhVar.d;
                int iG2 = pja.g(jH);
                int iF2 = pja.f(jH);
                Layout layout = ohaVar.f;
                int length = layout.getText().length();
                if (iG2 < 0) {
                    r75.a("startOffset must be > 0");
                }
                if (iG2 >= length) {
                    r75.a("startOffset must be less than text length");
                }
                if (iF2 <= iG2) {
                    r75.a("endOffset must be greater than startOffset");
                }
                if (iF2 > length) {
                    r75.a("endOffset must be smaller or equal to text length");
                }
                if (fArr.length - i14 < (iF2 - iG2) * 4) {
                    r75.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int lineForOffset = layout.getLineForOffset(iG2);
                int lineForOffset2 = layout.getLineForOffset(iF2 - 1);
                dp4 dp4Var = new dp4(ohaVar);
                if (lineForOffset <= lineForOffset2) {
                    while (true) {
                        int lineStart = layout.getLineStart(lineForOffset);
                        int iF3 = ohaVar.f(lineForOffset);
                        int iMax2 = Math.max(iG2, lineStart);
                        int iMin2 = Math.min(iF2, iF3);
                        float fG = ohaVar.g(lineForOffset);
                        float fE = ohaVar.e(lineForOffset);
                        j = jH;
                        boolean z2 = layout.getParagraphDirection(lineForOffset) == 1;
                        while (iMax2 < iMin2) {
                            boolean zIsRtlCharAt = layout.isRtlCharAt(iMax2);
                            if (!z2 || zIsRtlCharAt) {
                                z = z2;
                                if (z && zIsRtlCharAt) {
                                    float fA3 = dp4Var.a(iMax2, false, false, false);
                                    i = i14;
                                    fA2 = dp4Var.a(iMax2 + 1, true, true, false);
                                    fA = fA3;
                                } else {
                                    i = i14;
                                    if (z || !zIsRtlCharAt) {
                                        float fA4 = dp4Var.a(iMax2, false, false, false);
                                        fA = dp4Var.a(iMax2 + 1, true, true, false);
                                        fA2 = fA4;
                                    } else {
                                        float fA5 = dp4Var.a(iMax2, false, false, true);
                                        fA2 = dp4Var.a(iMax2 + 1, true, true, true);
                                        fA = fA5;
                                    }
                                }
                            } else {
                                z = z2;
                                float fA6 = dp4Var.a(iMax2, false, false, true);
                                fA = dp4Var.a(iMax2 + 1, true, true, true);
                                i = i14;
                                fA2 = fA6;
                            }
                            fArr[i] = fA2;
                            fArr[i + 1] = fG;
                            fArr[i + 2] = fA;
                            fArr[i + 3] = fE;
                            i14 = i + 4;
                            iMax2++;
                            z2 = z;
                        }
                        int i15 = i14;
                        if (lineForOffset != lineForOffset2) {
                            lineForOffset++;
                            jH = j;
                            i14 = i15;
                        }
                    }
                } else {
                    j = jH;
                }
                int iE = (pja.e(j) * 4) + pg8Var.a;
                for (int i16 = pg8Var.a; i16 < iE; i16 += 4) {
                    int i17 = i16 + 1;
                    float f3 = fArr[i17];
                    float f4 = og8Var.a;
                    fArr[i17] = f3 + f4;
                    int i18 = i16 + 3;
                    fArr[i18] = fArr[i18] + f4;
                }
                pg8Var.a = iE;
                og8Var.a = bhVar.b() + og8Var.a;
                return hebVar2;
            case 3:
                nf1 nf1Var2 = (nf1) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                ((u2b) obj).getClass();
                m62 m62Var2 = nf1Var2.g;
                b92 b92Var4 = m62Var2.C;
                b92 b92Var5 = m62Var2.f;
                String str6 = nf1Var2.c;
                b92Var4.R(str6);
                int i19 = 0;
                for (Object obj8 : (List) obj3) {
                    int i20 = i19 + 1;
                    if (i19 < 0) {
                        gc1.i0();
                        throw null;
                    }
                    b92 b92Var6 = m62Var2.C;
                    String strG3 = dx1.g(i19, str6, "_");
                    String str7 = nf1Var2.c;
                    String str8 = ((cn9) obj8).a;
                    qa1 qa1Var3 = r95.a;
                    b92Var6.l0(new xb2(strG3, str7, i19, str8, qa1Var3.k().c(), qa1Var3.k().c()));
                    i19 = i20;
                }
                b92 b92Var7 = m62Var2.J;
                b92Var5.O(str6);
                int size3 = arrayList2.size();
                int i21 = 0;
                int i22 = 0;
                while (true) {
                    long j5 = this.b;
                    if (i22 >= size3) {
                        Throwable th2 = th;
                        b92Var7.S(str6);
                        int size4 = arrayList2.size();
                        String strG4 = "";
                        int i23 = 0;
                        int i24 = 0;
                        while (i24 < size4) {
                            Object obj9 = arrayList2.get(i24);
                            i24++;
                            int i25 = i23 + 1;
                            if (i23 < 0) {
                                gc1.i0();
                                throw th2;
                            }
                            ll9 ll9Var3 = (ll9) obj9;
                            boolean z3 = ll9Var3.c == 1;
                            String strG5 = dx1.g(i23, str6, "_");
                            String str9 = nf1Var2.c;
                            Map mapSingletonMap2 = Collections.singletonMap("raw", ll9Var3.a);
                            mapSingletonMap2.getClass();
                            String str10 = ll9Var3.b;
                            qa1 qa1Var4 = r95.a;
                            b92Var7.n0(new uc2(strG5, str9, mapSingletonMap2, str10, strG4, i23, qa1Var4.k().c(), qa1Var4.k().c()));
                            if (z3) {
                                strG4 = dx1.g(i23, str6, "_");
                            }
                            i23 = i25;
                        }
                        m62Var2.b.t0(arrayList2.size(), 0, 0L, j5, nf1Var2.c);
                        return hebVar2;
                    }
                    Object obj10 = arrayList2.get(i22);
                    i22++;
                    int i26 = i21 + 1;
                    Throwable th3 = th;
                    if (i21 < 0) {
                        gc1.i0();
                        throw th3;
                    }
                    ll9 ll9Var4 = (ll9) obj10;
                    if (ll9Var4.b.length() == 0) {
                        i2 = size3;
                    } else {
                        i2 = size3;
                        b92Var5.h0(new v92(dx1.g(i21, str6, "_"), nf1Var2.c, wfc.l(ll9Var4.b, false), i21, ll9Var4.b, 0, false, ll9Var4.f, ll9Var4.e, 0L, j5, j5));
                    }
                    size3 = i2;
                    i21 = i26;
                    th = th3;
                }
                break;
            default:
                zja zjaVar = (zja) obj3;
                ym ymVar = (ym) obj2;
                r43 r43Var = (r43) obj;
                r43Var.getClass();
                List list = ((sia) obj4).d;
                int size5 = list.size();
                int i27 = 0;
                while (i27 < size5) {
                    tia tiaVar = (tia) list.get(i27);
                    if (tiaVar.h == null || (iMax = Math.max(zjaVar.b, tiaVar.d)) > (iMin = Math.min(zjaVar.c, tiaVar.e - i4))) {
                        hebVar = hebVar2;
                    } else {
                        int i28 = tiaVar.b;
                        hebVar = hebVar2;
                        t1c.U(r43Var, iMax - i28, iMin - i28, tiaVar.a, ((Number) ymVar.d()).floatValue(), this.b, tiaVar.h);
                    }
                    i27++;
                    hebVar2 = hebVar;
                    i4 = 1;
                }
                return hebVar2;
        }
    }

    public /* synthetic */ tm0(kf8 kf8Var, rg8 rg8Var, long j, gh0 gh0Var) {
        this.a = 0;
        this.c = kf8Var;
        this.d = rg8Var;
        this.b = j;
        this.e = gh0Var;
    }

    public /* synthetic */ tm0(Object obj, Object obj2, Object obj3, long j, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j;
    }
}
