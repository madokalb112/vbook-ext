package defpackage;

import java.util.Iterator;
import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class af6 implements kb4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ br9 b;
    public final /* synthetic */ nm7 c;
    public final /* synthetic */ ym d;
    public final /* synthetic */ List e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long s;
    public final /* synthetic */ long t;

    public /* synthetic */ af6(nm7 nm7Var, ym ymVar, ym7 ym7Var, List list, long j, long j2, long j3) {
        this.c = nm7Var;
        this.d = ymVar;
        this.b = ym7Var;
        this.e = list;
        this.f = j;
        this.s = j2;
        this.t = j3;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        Iterator it;
        long j;
        heb hebVar;
        long j2;
        Iterator it2;
        float f;
        float f2;
        float f3;
        int i = this.a;
        heb hebVar2 = heb.a;
        long j3 = this.t;
        long j4 = this.s;
        long j5 = this.f;
        List list = this.e;
        ym ymVar = this.d;
        nm7 nm7Var = this.c;
        br9 br9Var = this.b;
        switch (i) {
            case 0:
                r43 r43Var = (r43) obj;
                r43Var.getClass();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (r43Var.f() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (r43Var.f() & 4294967295L));
                float fFloatValue = ((Number) nm7Var.a.getValue()).floatValue();
                float fFloatValue2 = ((Number) nm7Var.b.getValue()).floatValue();
                float fFloatValue3 = ((Number) ymVar.d()).floatValue();
                float fFloatValue4 = ((Number) br9Var.getValue()).floatValue() % 40000.0f;
                float f4 = fFloatValue4 < 20000.0f ? (fFloatValue4 * 3.1415927f) / 20000.0f : ((40000.0f - fFloatValue4) * 3.1415927f) / 20000.0f;
                Iterator it3 = list.iterator();
                int i2 = 0;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        gc1.i0();
                        throw null;
                    }
                    bf6 bf6Var = (bf6) next;
                    int i4 = i2 / 12;
                    int i5 = i2 % 12;
                    if (i4 >= 11 || i5 >= 11) {
                        it = it3;
                        j = j3;
                    } else {
                        long jU = fz1.u(f4, fFloatValue3, fIntBitsToFloat, fFloatValue, fIntBitsToFloat2, fFloatValue2, (bf6) list.get(i2));
                        long jU2 = fz1.u(f4, fFloatValue3, fIntBitsToFloat, fFloatValue, fIntBitsToFloat2, fFloatValue2, (bf6) list.get(i3));
                        it = it3;
                        long jU3 = fz1.u(f4, fFloatValue3, fIntBitsToFloat, fFloatValue, fIntBitsToFloat2, fFloatValue2, (bf6) list.get(i2 + 12));
                        long jU4 = fz1.u(f4, fFloatValue3, fIntBitsToFloat, fFloatValue, fIntBitsToFloat2, fFloatValue2, (bf6) list.get(i2 + 13));
                        int i6 = (i4 + i5) % 3;
                        long j6 = i6 != 0 ? i6 != 1 ? j3 : j4 : j5;
                        float f5 = (bf6Var.e * 0.05f) + 0.14f;
                        hh hhVarA = mh.a();
                        hhVarA.i(Float.intBitsToFloat((int) (jU >> 32)), Float.intBitsToFloat((int) (jU & 4294967295L)));
                        int i7 = (int) (jU2 >> 32);
                        int i8 = (int) (jU2 & 4294967295L);
                        hhVarA.h(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8));
                        int i9 = (int) (jU3 >> 32);
                        int i10 = (int) (jU3 & 4294967295L);
                        hhVarA.h(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10));
                        hhVarA.e();
                        r43.Q0(r43Var, hhVarA, lc1.c(f5, j6), 0.0f, new jw9(3.5f, 0.0f, 0, 0, (ih) null, 30), 52);
                        hh hhVarA2 = mh.a();
                        hhVarA2.i(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8));
                        j = j3;
                        hhVarA2.h(Float.intBitsToFloat((int) (jU4 >> 32)), Float.intBitsToFloat((int) (jU4 & 4294967295L)));
                        hhVarA2.h(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10));
                        hhVarA2.e();
                        r43.Q0(r43Var, hhVarA2, lc1.c(f5, j6), 0.0f, new jw9(3.5f, 0.0f, 0, 0, (ih) null, 30), 52);
                    }
                    it3 = it;
                    i2 = i3;
                    j3 = j;
                }
                return hebVar2;
            default:
                r43 r43Var2 = (r43) obj;
                r43Var2.getClass();
                float fFloatValue5 = ((Number) br9Var.getValue()).floatValue();
                float fFloatValue6 = ((Number) nm7Var.a.getValue()).floatValue();
                float fFloatValue7 = ((Number) nm7Var.b.getValue()).floatValue();
                float fFloatValue8 = ((Number) ymVar.d()).floatValue();
                int i11 = 0;
                for (Object obj2 : list) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        gc1.i0();
                        throw null;
                    }
                    lo8 lo8Var = (lo8) obj2;
                    float f6 = lo8Var.c;
                    float f7 = lo8Var.b;
                    float f8 = fFloatValue5;
                    float f9 = lo8Var.a;
                    float f10 = (f6 - f9) / 2.0f;
                    float f11 = (lo8Var.d - f7) / 2.0f;
                    float f12 = 6.2831855f * f8;
                    float f13 = fFloatValue6;
                    float fSin = (f10 * ((float) Math.sin(f12 / lo8Var.e))) + f9 + f10;
                    float fSin2 = (((float) Math.sin(f12 / lo8Var.f)) * f11) + f7 + f11;
                    float f14 = lo8Var.h * 50.0f;
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((f13 * f14) + (Float.intBitsToFloat((int) (r43Var2.f() >> 32)) * fSin))) << 32) | (((long) Float.floatToRawIntBits((fFloatValue7 * f14) + (Float.intBitsToFloat((int) (r43Var2.f() & 4294967295L)) * fSin2))) & 4294967295L);
                    int i13 = i11 % 3;
                    if (i13 == 0) {
                        hebVar = hebVar2;
                        j2 = j5;
                    } else if (i13 != 1) {
                        hebVar = hebVar2;
                        j2 = j3;
                    } else {
                        hebVar = hebVar2;
                        j2 = j4;
                    }
                    float size = (i11 / (list.size() - 1)) * 0.4f;
                    float fP = wx1.P((fFloatValue8 - size) / (1.0f - size), 0.0f, 1.0f);
                    float f15 = fFloatValue8 > 0.0f ? (1.8f * fP) + 1.0f : 1.0f;
                    float fP2 = fFloatValue8 > 0.0f ? wx1.P(1.0f - fP, 0.0f, 1.0f) : 1.0f;
                    Iterator it4 = lo8Var.g.iterator();
                    int i14 = 0;
                    while (it4.hasNext()) {
                        Object next2 = it4.next();
                        int i15 = i14 + 1;
                        if (i14 < 0) {
                            gc1.i0();
                            throw null;
                        }
                        float fFloatValue9 = ((Number) next2).floatValue();
                        if (i14 != 0) {
                            it2 = it4;
                            f = i14 != 1 ? i14 != 2 ? 0.06f : 0.07f : 0.1f;
                        } else {
                            it2 = it4;
                            f = 0.14f;
                        }
                        if (i14 != 0) {
                            f2 = f;
                            f3 = i14 != 1 ? 4.0f : 5.0f;
                        } else {
                            f2 = f;
                            f3 = 6.0f;
                        }
                        r43.e0(r43Var2, lc1.c(f2 * fP2, j2), fFloatValue9 * f15, jFloatToRawIntBits, 0.0f, new jw9(f3, 0.0f, 0, 0, (ih) null, 30), Token.ASSIGN_LOGICAL_AND);
                        it4 = it2;
                        i14 = i15;
                    }
                    fFloatValue5 = f8;
                    hebVar2 = hebVar;
                    i11 = i12;
                    fFloatValue6 = f13;
                }
                return hebVar2;
        }
    }

    public /* synthetic */ af6(ym7 ym7Var, nm7 nm7Var, ym ymVar, List list, long j, long j2, long j3) {
        this.b = ym7Var;
        this.c = nm7Var;
        this.d = ymVar;
        this.e = list;
        this.f = j;
        this.s = j2;
        this.t = j3;
    }
}
