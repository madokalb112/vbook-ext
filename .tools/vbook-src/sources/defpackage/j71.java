package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class j71 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    public /* synthetic */ j71(br9 br9Var, br9 br9Var2, jw9 jw9Var, br9 br9Var3, o3b o3bVar, o3b o3bVar2, jw9 jw9Var2, f71 f71Var) {
        this.a = 0;
        this.b = br9Var;
        this.c = br9Var2;
        this.s = jw9Var;
        this.d = br9Var3;
        this.e = o3bVar;
        this.f = o3bVar2;
        this.t = jw9Var2;
        this.u = f71Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        r43 r43Var;
        heb hebVar;
        int i = this.a;
        heb hebVar2 = heb.a;
        Object obj2 = this.u;
        Object obj3 = this.t;
        Object obj4 = this.s;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.c;
        Object obj9 = this.b;
        switch (i) {
            case 0:
                jw9 jw9Var = (jw9) obj4;
                br9 br9Var = (br9) obj7;
                br9 br9Var2 = (br9) obj6;
                br9 br9Var3 = (br9) obj5;
                jw9 jw9Var2 = (jw9) obj3;
                f71 f71Var = (f71) obj2;
                r43 r43Var2 = (r43) obj;
                long j = ((lc1) ((br9) obj9).getValue()).a;
                long j2 = ((lc1) ((br9) obj8).getValue()).a;
                float fK0 = r43Var2.k0(2.0f);
                float f = jw9Var.a;
                float f2 = f / 2.0f;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (r43Var2.f() >> 32));
                boolean zD = lc1.d(j, j2);
                ox3 ox3Var = ox3.a;
                if (zD) {
                    r43Var = r43Var2;
                    r43.A(r43Var, j, 0L, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (((long) Float.floatToRawIntBits(fK0)) << 32) | (((long) Float.floatToRawIntBits(fK0)) & 4294967295L), ox3Var, 0.0f, 226);
                    hebVar = hebVar2;
                } else {
                    r43Var = r43Var2;
                    hebVar = hebVar2;
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
                    float f3 = fIntBitsToFloat - (f * 2.0f);
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
                    float fMax = Math.max(0.0f, fK0 - f);
                    r43.A(r43Var, j, jFloatToRawIntBits, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L), ox3Var, 0.0f, 224);
                    float f4 = fIntBitsToFloat - f;
                    float f5 = fK0 - f2;
                    r43.A(r43Var, j2, (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L), jw9Var, 0.0f, 224);
                }
                long j3 = ((lc1) br9Var.getValue()).a;
                float fFloatValue = ((Number) br9Var2.getValue()).floatValue();
                float fFloatValue2 = ((Number) br9Var3.getValue()).floatValue();
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (r43Var.f() >> 32));
                float fV = sw1.V(0.4f, 0.5f, fFloatValue2);
                float fV2 = sw1.V(0.7f, 0.5f, fFloatValue2);
                float fV3 = sw1.V(0.5f, 0.5f, fFloatValue2);
                float fV4 = sw1.V(0.3f, 0.5f, fFloatValue2);
                f71Var.a.m();
                hh hhVar = f71Var.a;
                hhVar.i(0.2f * fIntBitsToFloat2, fV3 * fIntBitsToFloat2);
                hhVar.h(fV * fIntBitsToFloat2, fV2 * fIntBitsToFloat2);
                hhVar.h(0.8f * fIntBitsToFloat2, fIntBitsToFloat2 * fV4);
                kh khVar = f71Var.b;
                khVar.a.setPath(hhVar != null ? hhVar.a : null, false);
                hh hhVar2 = f71Var.c;
                hhVar2.m();
                khVar.a(0.0f, khVar.a.getLength() * fFloatValue, hhVar2);
                r43.Q0(r43Var, f71Var.c, j3, 0.0f, jw9Var2, 52);
                break;
            case 1:
                wq2 wq2Var = (wq2) obj9;
                mk9 mk9Var = (mk9) obj8;
                a07 a07Var = (a07) obj4;
                a07 a07Var2 = (a07) obj2;
                aq5 aq5Var = (aq5) obj;
                aq5Var.getClass();
                wn9.M(aq5Var, (wga) a07Var.getValue(), wq2Var.e, wq2Var.i.k, ((Boolean) a07Var2.getValue()).booleanValue(), wq2Var.f, (List) ((a07) obj3).getValue(), mk9Var, wq2Var.g, new zp2(mk9Var, 0), (ib4) obj7, new r02(a07Var2, 5), (kb4) obj6, (ib4) obj5, new r02(a07Var, 6));
                break;
            case 2:
                kb4 kb4Var = (kb4) obj8;
                kb4 kb4Var2 = (kb4) obj7;
                kb4 kb4Var3 = (kb4) obj6;
                kb4 kb4Var4 = (kb4) obj5;
                kb4 kb4Var5 = (kb4) obj4;
                kb4 kb4Var6 = (kb4) obj3;
                kb4 kb4Var7 = (kb4) obj2;
                aq5 aq5Var2 = (aq5) obj;
                aq5Var2.getClass();
                List list = ((s13) obj9).b;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    q13 q13Var = (q13) list.get(i2);
                    aq5.b0(aq5Var2, Long.valueOf(q13Var.a), new gq2(12), new rj1(new nl9(q13Var, 12), true, -1466458184), 4);
                    List list2 = q13Var.b;
                    aq5Var2.c0(list2.size(), new f7(18, new gq2(13), list2), (yb4) null, new g7(20, list2), new rj1(new ou1(list2, kb4Var, kb4Var2, kb4Var3, kb4Var4, kb4Var5, kb4Var6, kb4Var7), true, -1117249557));
                }
                break;
            default:
                String str = (String) obj9;
                List list3 = (List) obj8;
                List list4 = (List) obj7;
                kb4 kb4Var8 = (kb4) obj6;
                kb4 kb4Var9 = (kb4) obj5;
                kb4 kb4Var10 = (kb4) obj4;
                kb4 kb4Var11 = (kb4) obj3;
                kb4 kb4Var12 = (kb4) obj2;
                at5 at5Var = (at5) obj;
                at5Var.getClass();
                if (str.length() == 0 && !list3.isEmpty()) {
                    at5.b0(at5Var, (String) null, lc5.v, 3);
                }
                at5Var.c0(list3.size(), (kb4) null, new r54(18, list3), new rj1(new xq3(list3, kb4Var8, kb4Var9, 2), true, 802480018));
                if (str.length() == 0 && !list4.isEmpty()) {
                    at5.b0(at5Var, (String) null, lc5.w, 3);
                }
                at5Var.c0(list4.size(), (kb4) null, new r54(19, list4), new rj1(new il0(list4, kb4Var10, kb4Var11, kb4Var12, 4), true, 802480018));
                break;
        }
        return hebVar2;
    }

    public /* synthetic */ j71(Object obj, Object obj2, Object obj3, kb4 kb4Var, ub4 ub4Var, Object obj4, Object obj5, Object obj6, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = kb4Var;
        this.f = ub4Var;
        this.s = obj4;
        this.t = obj5;
        this.u = obj6;
    }
}
