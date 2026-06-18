package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ss3 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    public /* synthetic */ ss3(long j, ib4 ib4Var, rx8 rx8Var, jt7 jt7Var, jt7 jt7Var2, jt7 jt7Var3, br9 br9Var) {
        this.a = 4;
        this.e = j;
        this.s = ib4Var;
        this.t = rx8Var;
        this.c = jt7Var;
        this.f = jt7Var2;
        this.d = jt7Var3;
        this.b = br9Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        heb hebVar;
        Float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float fP;
        float f7;
        float fP2;
        int iW0;
        int i;
        int i2;
        int i3;
        int i4 = this.a;
        heb hebVar2 = heb.a;
        Object obj2 = this.f;
        Object obj3 = this.t;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        Object obj7 = this.s;
        switch (i4) {
            case 0:
                ct3 ct3Var = (ct3) obj3;
                List list = (List) obj5;
                a82 a82Var = (a82) obj4;
                List list2 = (List) obj2;
                String str = (String) obj6;
                ((u2b) obj).getClass();
                m62 m62Var = (m62) ((nc1) obj7).c;
                b92 b92Var = m62Var.b;
                Map mapSingletonMap = Collections.singletonMap("raw", (String) ct3Var.a.c);
                mapSingletonMap.getClass();
                s16 s16Var = ct3Var.a;
                at3 at3Var = (at3) s16Var.b;
                Map mapSingletonMap2 = Collections.singletonMap("raw", at3Var.a + " " + at3Var.c);
                mapSingletonMap2.getClass();
                String str2 = (String) s16Var.e;
                String str3 = str2.length() == 0 ? str != null ? str : "" : str2;
                int size = list.size();
                lc3 lc3Var = lc3.a;
                mc3 mc3Var = mc3.a;
                long j = this.e;
                b92Var.f0(a82.a(a82Var, mapSingletonMap, mapSingletonMap2, null, 0, 0, lc3Var, str3, null, "FB2", null, 0, 0, null, false, size, false, false, false, mc3Var, j, j, -537920711, 1));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    m62Var.f.h0((v92) it.next());
                }
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    m62Var.J.n0((uc2) it2.next());
                }
                break;
            case 1:
                yh6 yh6Var = (yh6) obj3;
                String str4 = (String) obj6;
                List list3 = (List) obj5;
                a82 a82Var2 = (a82) obj4;
                List list4 = (List) obj2;
                ((u2b) obj).getClass();
                m62 m62Var2 = (m62) ((nc1) obj7).c;
                b92 b92Var2 = m62Var2.b;
                Map mapSingletonMap3 = Collections.singletonMap("raw", yh6Var.b);
                mapSingletonMap3.getClass();
                Map mapSingletonMap4 = Collections.singletonMap("raw", fc1.D0(yh6Var.c, " ", null, null, null, 62));
                mapSingletonMap4.getClass();
                String str5 = str4 == null ? "" : str4;
                int size2 = list3.size();
                lc3 lc3Var2 = lc3.a;
                mc3 mc3Var2 = mc3.a;
                long j2 = this.e;
                b92Var2.f0(a82.a(a82Var2, mapSingletonMap3, mapSingletonMap4, null, 0, 0, lc3Var2, str5, null, "MOBI", null, 0, 0, null, false, size2, false, false, false, mc3Var2, j2, j2, -537920711, 1));
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    m62Var2.f.h0((v92) it3.next());
                }
                Iterator it4 = list4.iterator();
                while (it4.hasNext()) {
                    m62Var2.J.n0((uc2) it4.next());
                }
                break;
            case 2:
                nm7 nm7Var = (nm7) obj7;
                ym7 ym7Var = (ym7) obj2;
                a07 a07Var = (a07) obj4;
                ym ymVar = (ym) obj6;
                r43 r43Var = (r43) obj;
                Float fValueOf = Float.valueOf(0.0f);
                float f8 = 1.0f;
                Float fValueOf2 = Float.valueOf(1.0f);
                r43Var.getClass();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (r43Var.f() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (r43Var.f() & 4294967295L));
                float f9 = fIntBitsToFloat / 2.0f;
                float f10 = fIntBitsToFloat2 / 2.0f;
                float fFloatValue = ((Number) nm7Var.a.getValue()).floatValue();
                float fFloatValue2 = ((Number) nm7Var.b.getValue()).floatValue();
                float fFloatValue3 = ((Number) ((ym) obj3).d()).floatValue();
                ListIterator listIterator = ((hk9) obj5).listIterator();
                while (true) {
                    em4 em4Var = (em4) listIterator;
                    boolean zHasNext = em4Var.hasNext();
                    Float f11 = fValueOf2;
                    long j3 = this.e;
                    if (!zHasNext) {
                        heb hebVar3 = hebVar2;
                        tg6 tg6Var = (tg6) a07Var.getValue();
                        if (tg6Var != null) {
                            float fFloatValue4 = ((Number) ymVar.d()).floatValue();
                            float f12 = tg6Var.c * 0.017453292f;
                            float f13 = tg6Var.e;
                            float f14 = 2.0f * fIntBitsToFloat * fFloatValue4;
                            double d = f12;
                            float fCos = (float) Math.cos(d);
                            float fSin = (float) Math.sin(d);
                            float f15 = (f14 * fCos) + (tg6Var.a * fIntBitsToFloat) + (fFloatValue * f13 * 120.0f);
                            float f16 = (f14 * fSin) + (tg6Var.b * fIntBitsToFloat2) + (fFloatValue2 * f13 * 120.0f);
                            float f17 = tg6Var.d;
                            float f18 = f15 - (fCos * f17);
                            float f19 = f16 - (f17 * fSin);
                            xl7 xl7Var = new xl7(fValueOf, new lc1(lc1.c(0.3f, j3)));
                            xl7 xl7Var2 = new xl7(Float.valueOf(0.6f), new lc1(lc1.c(0.15f, j3)));
                            long j4 = lc1.i;
                            r43Var = r43Var;
                            r43.R0(r43Var, js8.q(new xl7[]{xl7Var, xl7Var2, new xl7(f11, new lc1(j4))}, (((long) Float.floatToRawIntBits(f16)) & 4294967295L) | (((long) Float.floatToRawIntBits(f15)) << 32), (((long) Float.floatToRawIntBits(f19)) & 4294967295L) | (((long) Float.floatToRawIntBits(f18)) << 32)), (((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(f16)) & 4294967295L), (((long) Float.floatToRawIntBits(f19)) & 4294967295L) | (((long) Float.floatToRawIntBits(f18)) << 32), 16.0f, 0.0f, 480);
                            r43.R0(r43Var, js8.q(new xl7[]{new xl7(fValueOf, new lc1(lc1.c(0.95f, j3))), new xl7(Float.valueOf(0.5f), new lc1(lc1.c(0.6f, j3))), new xl7(f11, new lc1(j4))}, (((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(f16)) & 4294967295L), (((long) Float.floatToRawIntBits(f18)) << 32) | (((long) Float.floatToRawIntBits(f19)) & 4294967295L)), (((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(f16)) & 4294967295L), (((long) Float.floatToRawIntBits(f18)) << 32) | (((long) Float.floatToRawIntBits(f19)) & 4294967295L), 4.0f, 0.0f, 480);
                        }
                        if (fFloatValue3 > 0.0f) {
                            r43.J(r43Var, lc1.c(fFloatValue3, lc1.e), 0L, r43Var.f(), 0.0f, (jw9) null, Token.FUNCTION);
                        }
                    } else {
                        qq9 qq9Var = (qq9) em4Var.next();
                        float fH = f8 - (((ym7Var.h() * qq9Var.f) + qq9Var.g) % f8);
                        if (fH < 0.01f) {
                            fH = 0.01f;
                        }
                        if (fH < 0.05f || fH > 1.5f) {
                            hebVar = hebVar2;
                        } else {
                            float f20 = f8 / fH;
                            float f21 = qq9Var.a * fIntBitsToFloat * 0.5f * f20;
                            float f22 = qq9Var.b * fIntBitsToFloat2 * 0.5f * f20;
                            hebVar = hebVar2;
                            float fP3 = (1.0f - wx1.P(fH, 0.0f, 1.0f)) * qq9Var.e * 150.0f;
                            float f23 = (fFloatValue * fP3) + f9 + f21;
                            float f24 = (fP3 * fFloatValue2) + f10 + f22;
                            if (f23 >= -150.0f && f23 <= fIntBitsToFloat + 150.0f && f24 >= -150.0f && f24 <= fIntBitsToFloat2 + 150.0f) {
                                float f25 = fH;
                                float f26 = qq9Var.c * f20 * 0.45f;
                                if (f25 > 1.3f) {
                                    f2 = f26;
                                    f3 = f24;
                                    f4 = f23;
                                    f5 = 1.0f;
                                    f6 = 0.0f;
                                    fP = wx1.P((1.5f - f25) / 0.2f, 0.0f, 1.0f);
                                } else {
                                    f2 = f26;
                                    f3 = f24;
                                    f4 = f23;
                                    f5 = 1.0f;
                                    f6 = 0.0f;
                                    fP = 1.0f;
                                }
                                float f27 = fP;
                                float fP4 = f25 < 0.15f ? wx1.P(f25 / 0.15f, f6, f5) : f5;
                                if (f25 > 0.6f) {
                                    f7 = fP4;
                                    fP2 = wx1.P((f5 - f25) / 0.4f, f6, f5);
                                } else {
                                    f7 = fP4;
                                    fP2 = f25 < 0.3f ? wx1.P(f25 / 0.3f, f6, f5) : f5;
                                }
                                float fP5 = wx1.P(qq9Var.d * fP2 * f27 * f7, f6, f5);
                                float f28 = fP5 * 0.2f;
                                f = f11;
                                r43.e0(r43Var, j3, f2 * 1.8f, (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), f28, (s43) null, Token.ASSIGN_MOD);
                                r43.e0(r43Var, j3, f2 * 1.1f, (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), fP5, (s43) null, Token.ASSIGN_MOD);
                            }
                            fValueOf2 = f;
                            hebVar2 = hebVar;
                            f8 = 1.0f;
                        }
                        f = f11;
                        fValueOf2 = f;
                        hebVar2 = hebVar;
                        f8 = 1.0f;
                    }
                    break;
                }
                break;
            case 3:
                odb odbVar = (odb) obj3;
                String str6 = (String) obj6;
                List list5 = (List) obj5;
                a82 a82Var3 = (a82) obj4;
                List list6 = (List) obj2;
                ((u2b) obj).getClass();
                m62 m62Var3 = (m62) ((nc1) obj7).c;
                b92 b92Var3 = m62Var3.b;
                Map mapSingletonMap5 = Collections.singletonMap("raw", odbVar.b.b);
                mapSingletonMap5.getClass();
                Map mapSingletonMap6 = Collections.singletonMap("raw", odbVar.b.c);
                mapSingletonMap6.getClass();
                String str7 = str6 == null ? "" : str6;
                int size3 = list5.size();
                lc3 lc3Var3 = lc3.a;
                mc3 mc3Var3 = mc3.a;
                long j5 = this.e;
                b92Var3.f0(a82.a(a82Var3, mapSingletonMap5, mapSingletonMap6, null, 0, 0, lc3Var3, str7, null, "UMD", null, 0, 0, null, false, size3, false, false, false, mc3Var3, j5, j5, -537920711, 1));
                b92 b92Var4 = m62Var3.f;
                Iterator it5 = list5.iterator();
                while (it5.hasNext()) {
                    b92Var4.h0((v92) it5.next());
                }
                b92 b92Var5 = m62Var3.J;
                Iterator it6 = list6.iterator();
                while (it6.hasNext()) {
                    b92Var5.n0((uc2) it6.next());
                }
                break;
            case 4:
                jt7 jt7Var = (jt7) obj5;
                jt7 jt7Var2 = (jt7) obj2;
                jt7 jt7Var3 = (jt7) obj4;
                br9 br9Var = (br9) obj6;
                it7 it7Var = (it7) obj;
                it7Var.getClass();
                long j6 = this.e;
                int iFloatValue = (int) (((Number) ((ib4) obj7).invoke()).floatValue() * up1.h(j6));
                sx8 sx8Var = ((rx8) obj3).f;
                int iOrdinal = sx8Var.ordinal();
                if (iOrdinal == 0) {
                    iW0 = -it7Var.w0(((x13) br9Var.getValue()).a);
                } else if (iOrdinal != 1) {
                    mn5.g();
                } else {
                    iW0 = it7Var.w0(((x13) br9Var.getValue()).a);
                }
                int iOrdinal2 = sx8Var.ordinal();
                if (iOrdinal2 == 0) {
                    i = 0;
                } else if (iOrdinal2 != 1) {
                    mn5.g();
                } else {
                    i = up1.i(j6) - jt7Var.a;
                }
                it7.n(it7Var, jt7Var, i + iW0, iFloatValue);
                int iOrdinal3 = sx8Var.ordinal();
                if (iOrdinal3 == 0) {
                    i2 = jt7Var.a;
                } else if (iOrdinal3 != 1) {
                    mn5.g();
                } else {
                    i2 = (up1.i(j6) - jt7Var.a) - jt7Var2.a;
                }
                it7.n(it7Var, jt7Var2, i2 + iW0, ((jt7Var.b / 2) + iFloatValue) - (jt7Var2.b / 2));
                int iOrdinal4 = sx8Var.ordinal();
                if (iOrdinal4 == 0) {
                    i3 = 0;
                } else if (iOrdinal4 != 1) {
                    mn5.g();
                } else {
                    i3 = up1.i(j6) - jt7Var3.a;
                }
                it7.n(it7Var, jt7Var3, i3, 0);
                break;
            default:
                List list7 = (List) obj5;
                a82 a82Var4 = (a82) obj4;
                String str8 = (String) obj3;
                List list8 = (List) obj2;
                ((u2b) obj).getClass();
                m62 m62Var4 = (m62) ((nc1) obj7).c;
                b92 b92Var6 = m62Var4.b;
                Map mapSingletonMap7 = Collections.singletonMap("raw", (String) obj6);
                mapSingletonMap7.getClass();
                int size4 = list7.size();
                Map map = a82Var4.D;
                long j7 = this.e;
                b92Var6.f0(a82.a(a82Var4, mapSingletonMap7, null, null, 0, 0, null, str8, null, "ZIP", null, 0, 0, null, false, size4, false, false, false, map, j7, j7, -537920643, 1));
                Iterator it7 = list7.iterator();
                while (it7.hasNext()) {
                    m62Var4.f.h0((v92) it7.next());
                }
                Iterator it8 = list8.iterator();
                while (it8.hasNext()) {
                    m62Var4.J.n0((uc2) it8.next());
                }
                break;
        }
        return hebVar2;
    }

    public /* synthetic */ ss3(nc1 nc1Var, ct3 ct3Var, List list, a82 a82Var, long j, List list2, String str) {
        this.a = 0;
        this.s = nc1Var;
        this.t = ct3Var;
        this.c = list;
        this.d = a82Var;
        this.e = j;
        this.f = list2;
        this.b = str;
    }

    public /* synthetic */ ss3(nc1 nc1Var, String str, List list, a82 a82Var, String str2, long j, List list2) {
        this.a = 5;
        this.s = nc1Var;
        this.b = str;
        this.c = list;
        this.d = a82Var;
        this.t = str2;
        this.e = j;
        this.f = list2;
    }

    public /* synthetic */ ss3(pv3 pv3Var, Object obj, String str, List list, a82 a82Var, long j, List list2, int i) {
        this.a = i;
        this.s = pv3Var;
        this.t = obj;
        this.b = str;
        this.c = list;
        this.d = a82Var;
        this.e = j;
        this.f = list2;
    }

    public /* synthetic */ ss3(nm7 nm7Var, ym ymVar, hk9 hk9Var, long j, ym7 ym7Var, a07 a07Var, ym ymVar2) {
        this.a = 2;
        this.s = nm7Var;
        this.t = ymVar;
        this.c = hk9Var;
        this.e = j;
        this.f = ym7Var;
        this.d = a07Var;
        this.b = ymVar2;
    }
}
