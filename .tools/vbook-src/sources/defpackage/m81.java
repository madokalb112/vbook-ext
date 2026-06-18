package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class m81 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ nm7 c;
    public final /* synthetic */ ym d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long s;

    public /* synthetic */ m81(nm7 nm7Var, ym ymVar, hk9 hk9Var, long j, long j2, long j3) {
        this.a = 2;
        this.c = nm7Var;
        this.d = ymVar;
        this.b = hk9Var;
        this.e = j;
        this.f = j2;
        this.s = j3;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        float f;
        float f2;
        float fB;
        float f3;
        long j;
        int i;
        int i2;
        int i3;
        long j2;
        float f4;
        float f5;
        long jFloatToRawIntBits;
        int i4 = this.a;
        long j3 = this.s;
        long j4 = this.f;
        long j5 = this.e;
        heb hebVar = heb.a;
        int i5 = 0;
        float f6 = 0.55f;
        Object obj2 = this.b;
        float f7 = 0.5f;
        ym ymVar = this.d;
        nm7 nm7Var = this.c;
        switch (i4) {
            case 0:
                r43 r43Var = (r43) obj;
                r43Var.getClass();
                float fFloatValue = ((Number) ((br9) obj2).getValue()).floatValue();
                float fFloatValue2 = ((Number) nm7Var.a.getValue()).floatValue();
                float fFloatValue3 = ((Number) nm7Var.b.getValue()).floatValue();
                float fFloatValue4 = ((Number) ymVar.d()).floatValue();
                float f8 = fFloatValue * 6.2831855f;
                float fSin = (((float) Math.sin(f8 / 8000.0f)) * 0.05f) + 0.2f;
                float fSin2 = (((float) Math.sin(f8 / 7000.0f)) * 0.025f) + 0.225f;
                long j6 = this.e;
                k81 k81Var = new k81(fSin, fSin2, 400.0f, j6, 0.05f, 0.8f);
                float fSin3 = (((float) Math.sin(f8 / 9000.0f)) * 0.03f) + 0.85f;
                float fSin4 = (((float) Math.sin(f8 / 6500.0f)) * 0.035f) + 0.185f;
                long j7 = this.f;
                k81 k81Var2 = new k81(fSin3, fSin4, 280.0f, j7, 0.035f, 0.6f);
                k81 k81Var3 = new k81((((float) Math.sin(f8 / 7500.0f)) * 0.035f) + 0.715f, (((float) Math.sin(f8 / 8500.0f)) * 0.04f) + 0.44f, 200.0f, j7, 0.04f, 0.4f);
                float fSin5 = (((float) Math.sin(f8 / 9500.0f)) * 0.035f) + 0.815f;
                float fSin6 = (((float) Math.sin(f8 / 7200.0f)) * 0.035f) + 0.785f;
                long j8 = this.s;
                List listZ = gc1.Z(k81Var, k81Var2, k81Var3, new k81(fSin5, fSin6, 320.0f, j8, 0.035f, 0.7f), new k81((((float) Math.sin(f8 / 8200.0f)) * 0.04f) + 0.24f, (((float) Math.sin(f8 / 6800.0f)) * 0.035f) + 0.765f, 180.0f, j6, 0.04f, 0.5f), new k81((((float) Math.sin(f8 / 8800.0f)) * 0.025f) + 0.525f, (((float) Math.sin(f8 / 7800.0f)) * 0.025f) + 0.895f, 220.0f, j8, 0.04f, 0.6f));
                Iterator it = listZ.iterator();
                while (true) {
                    int i6 = i5;
                    if (!it.hasNext()) {
                        return hebVar;
                    }
                    Object next = it.next();
                    i5 = i6 + 1;
                    if (i6 < 0) {
                        gc1.i0();
                        throw null;
                    }
                    k81 k81Var4 = (k81) next;
                    float f9 = k81Var4.f;
                    long j9 = k81Var4.d;
                    float f10 = k81Var4.c;
                    float f11 = f9 * 50.0f;
                    List list = listZ;
                    Iterator it2 = it;
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits((fFloatValue2 * f11) + (Float.intBitsToFloat((int) (r43Var.f() >> 32)) * k81Var4.a))) << 32) | (((long) Float.floatToRawIntBits((f11 * fFloatValue3) + (Float.intBitsToFloat((int) (r43Var.f() & 4294967295L)) * k81Var4.b))) & 4294967295L);
                    float size = (i6 / (list.size() - 1)) * 0.35f;
                    float fP = wx1.P((fFloatValue4 - size) / (1.0f - size), 0.0f, 1.0f);
                    r43.e0(r43Var, lc1.c(k81Var4.e * (fFloatValue4 > 0.0f ? wx1.P(1.0f - fP, 0.0f, 1.0f) : 1.0f), j9), f10 * (fFloatValue4 > 0.0f ? (2.2f * fP) + 1.0f : 1.0f), jFloatToRawIntBits2, 0.0f, (s43) null, 120);
                    if (fFloatValue4 > 0.0f && fP > 0.0f) {
                        r43.e0(r43Var, lc1.c(wx1.P((1.0f - fP) * 0.5f, 0.0f, 1.0f), j9), dx1.A(fP, 3.5f, 1.0f, f10), jFloatToRawIntBits2, 0.0f, new jw9(4.0f, 0.0f, 0, 0, (ih) null, 30), Token.ASSIGN_LOGICAL_AND);
                    }
                    listZ = list;
                    it = it2;
                }
                break;
            case 1:
                r43 r43Var2 = (r43) obj;
                r43Var2.getClass();
                float fFloatValue5 = ((Number) ((br9) obj2).getValue()).floatValue();
                float fFloatValue6 = ((Number) nm7Var.a.getValue()).floatValue();
                float fFloatValue7 = ((Number) nm7Var.b.getValue()).floatValue();
                float fFloatValue8 = ((Number) ymVar.d()).floatValue();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (r43Var2.f() >> 32)) / 10.0f;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (r43Var2.f() & 4294967295L)) / 19.0f;
                float fSqrt = ((float) Math.sqrt((Float.intBitsToFloat((int) (r43Var2.f() & 4294967295L)) * Float.intBitsToFloat((int) (r43Var2.f() & 4294967295L))) + (Float.intBitsToFloat((int) (r43Var2.f() >> 32)) * Float.intBitsToFloat((int) (r43Var2.f() >> 32))))) * 0.5f;
                float f12 = fFloatValue8 * fSqrt * 1.2f;
                float f13 = 0.25f * fSqrt;
                int i7 = 0;
                while (i7 < 20) {
                    int i8 = 0;
                    while (i8 < 11) {
                        float f14 = (fFloatValue6 * 12.0f) + (i8 * fIntBitsToFloat);
                        float f15 = (12.0f * fFloatValue7) + (i7 * fIntBitsToFloat2);
                        int i9 = i8;
                        float fIntBitsToFloat3 = f14 - (Float.intBitsToFloat((int) (r43Var2.f() >> 32)) * f7);
                        float f16 = fFloatValue5;
                        float f17 = fFloatValue6;
                        float fIntBitsToFloat4 = f15 - (Float.intBitsToFloat((int) (r43Var2.f() & 4294967295L)) * f7);
                        float fSqrt2 = (float) Math.sqrt((fIntBitsToFloat4 * fIntBitsToFloat4) + (fIntBitsToFloat3 * fIntBitsToFloat3));
                        float fSin7 = (float) Math.sin(((6.2831855f * f16) / 3800.0f) - (0.012f * fSqrt2));
                        float f18 = (2.5f * fSin7) + 5.0f;
                        float fAbs = Math.abs(fSqrt2 - f12);
                        if (fFloatValue8 <= 0.0f || fAbs >= f13) {
                            f = fSin7;
                            f2 = f18;
                            fB = 0.0f;
                        } else {
                            f = fSin7;
                            float f19 = 1.0f - (fAbs / f13);
                            f2 = f18;
                            fB = tw2.b(fFloatValue8, f7, 1.0f, f19 * f19 * 6.0f);
                        }
                        float f20 = f2 + fB;
                        if (f20 < 0.8f) {
                            f20 = 0.8f;
                        }
                        int i10 = (i9 + i7) % 3;
                        if (i10 == 0) {
                            f3 = f20;
                            j = j5;
                        } else if (i10 != 1) {
                            f3 = f20;
                            j = j3;
                        } else {
                            f3 = f20;
                            j = j4;
                        }
                        float f21 = fFloatValue7;
                        float f22 = fFloatValue8;
                        r43.e0(r43Var2, lc1.c(wx1.P(((f * 0.1f) + 0.3f + ((fFloatValue8 <= 0.0f || fAbs >= f13) ? 0.0f : (1.0f - (fAbs / f13)) * 0.18f)) * wx1.P(1.0f - (fSqrt2 / fSqrt), f6, 1.0f), 0.0f, 0.5f), j), f3, (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f15)) & 4294967295L), 0.0f, (s43) null, 120);
                        fFloatValue8 = f22;
                        fFloatValue6 = f17;
                        fFloatValue7 = f21;
                        f6 = 0.55f;
                        f7 = 0.5f;
                        i8 = i9 + 1;
                        fFloatValue5 = f16;
                    }
                    i7++;
                    f6 = 0.55f;
                    f7 = 0.5f;
                }
                return hebVar;
            default:
                hk9 hk9Var = (hk9) obj2;
                r43 r43Var3 = (r43) obj;
                r43Var3.getClass();
                float fFloatValue9 = ((Number) nm7Var.a.getValue()).floatValue();
                float fFloatValue10 = ((Number) nm7Var.b.getValue()).floatValue();
                float fFloatValue11 = ((Number) ymVar.d()).floatValue();
                float fIntBitsToFloat5 = Float.intBitsToFloat((int) (r43Var3.f() >> 32)) * 0.5f;
                float fIntBitsToFloat6 = Float.intBitsToFloat((int) (r43Var3.f() & 4294967295L)) * 0.5f;
                float f23 = 1.0f;
                float fIntBitsToFloat7 = Float.intBitsToFloat((int) (r43Var3.f() >> 32)) * 0.22f;
                float f24 = fIntBitsToFloat7 * fIntBitsToFloat7;
                ArrayList arrayList = new ArrayList(gc1.M(hk9Var, 10));
                ListIterator listIterator = hk9Var.listIterator();
                while (true) {
                    em4 em4Var = (em4) listIterator;
                    if (em4Var.hasNext()) {
                        vn7 vn7Var = (vn7) em4Var.next();
                        float fIntBitsToFloat8 = (fFloatValue9 * 25.0f) + (Float.intBitsToFloat((int) (r43Var3.f() >> 32)) * vn7Var.a);
                        float f25 = fIntBitsToFloat6;
                        float fIntBitsToFloat9 = (fFloatValue10 * 25.0f) + (Float.intBitsToFloat((int) (r43Var3.f() & 4294967295L)) * vn7Var.b);
                        if (fFloatValue11 > 0.0f) {
                            float f26 = fFloatValue11 * fFloatValue11;
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits((((fIntBitsToFloat8 - fIntBitsToFloat5) * f26) * 1.2f) + fIntBitsToFloat8)) << 32) | (((long) Float.floatToRawIntBits(((fIntBitsToFloat9 - f25) * f26 * 1.2f) + fIntBitsToFloat9)) & 4294967295L);
                            f4 = fFloatValue9;
                            f5 = fFloatValue10;
                        } else {
                            f4 = fFloatValue9;
                            f5 = fFloatValue10;
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat8)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat9)) & 4294967295L);
                        }
                        arrayList.add(new eb7(jFloatToRawIntBits));
                        fFloatValue9 = f4;
                        fFloatValue10 = f5;
                        fIntBitsToFloat6 = f25;
                    } else {
                        float f27 = 0.0f;
                        int size2 = hk9Var.size();
                        int i11 = 0;
                        while (i11 < size2) {
                            int i12 = i11 + 1;
                            int size3 = hk9Var.size();
                            int i13 = i12;
                            while (i13 < size3) {
                                float fIntBitsToFloat10 = Float.intBitsToFloat((int) (((eb7) arrayList.get(i11)).a >> 32)) - Float.intBitsToFloat((int) (((eb7) arrayList.get(i13)).a >> 32));
                                float fIntBitsToFloat11 = Float.intBitsToFloat((int) (((eb7) arrayList.get(i11)).a & 4294967295L)) - Float.intBitsToFloat((int) (((eb7) arrayList.get(i13)).a & 4294967295L));
                                float f28 = (fIntBitsToFloat11 * fIntBitsToFloat11) + (fIntBitsToFloat10 * fIntBitsToFloat10);
                                if (f28 < f24) {
                                    float fSqrt3 = 1.0f - (((float) Math.sqrt(f28)) / fIntBitsToFloat7);
                                    float f29 = (fFloatValue11 * 0.05f * fSqrt3) + (fSqrt3 * fSqrt3 * 0.1f);
                                    int i14 = (((vn7) hk9Var.get(i11)).f + ((vn7) hk9Var.get(i13)).f) % 3;
                                    if (i14 == 0) {
                                        i = size2;
                                        i2 = i12;
                                        j2 = j5;
                                    } else if (i14 != 1) {
                                        i = size2;
                                        i2 = i12;
                                        j2 = j3;
                                    } else {
                                        i = size2;
                                        i2 = i12;
                                        j2 = j4;
                                    }
                                    i3 = i11;
                                    r43.x0(r43Var3, lc1.c(wx1.P(f29, f27, 0.18f), j2), ((eb7) arrayList.get(i11)).a, ((eb7) arrayList.get(i13)).a, 1.2f, 0, 0.0f, 496);
                                } else {
                                    i = size2;
                                    i2 = i12;
                                    i3 = i11;
                                }
                                i13++;
                                size2 = i;
                                i11 = i3;
                                i12 = i2;
                                f27 = 0.0f;
                            }
                            i11 = i12;
                            f27 = 0.0f;
                        }
                        ListIterator listIterator2 = hk9Var.listIterator();
                        while (true) {
                            int i15 = i5;
                            em4 em4Var2 = (em4) listIterator2;
                            if (!em4Var2.hasNext()) {
                                return hebVar;
                            }
                            Object next2 = em4Var2.next();
                            i5 = i15 + 1;
                            if (i15 < 0) {
                                gc1.i0();
                                throw null;
                            }
                            vn7 vn7Var2 = (vn7) next2;
                            long j10 = ((eb7) arrayList.get(i15)).a;
                            int i16 = vn7Var2.f;
                            long j11 = i16 != 0 ? i16 != 1 ? j3 : j4 : j5;
                            float f30 = (fFloatValue11 * 0.3f) + 0.55f;
                            float fA = dx1.A(fFloatValue11, 0.8f, f23, vn7Var2.e);
                            r43.e0(r43Var3, lc1.c(0.2f * f30, j11), fA * 2.0f, j10, 0.0f, (s43) null, 120);
                            r43.e0(r43Var3, lc1.c(f30, j11), fA, j10, 0.0f, (s43) null, 120);
                            f23 = 1.0f;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ m81(ym7 ym7Var, nm7 nm7Var, ym ymVar, long j, long j2, long j3, int i) {
        this.a = i;
        this.b = ym7Var;
        this.c = nm7Var;
        this.d = ymVar;
        this.e = j;
        this.f = j2;
        this.s = j3;
    }
}
