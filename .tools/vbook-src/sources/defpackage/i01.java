package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class i01 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ List e;
    public final /* synthetic */ a82 f;
    public final /* synthetic */ long s;
    public final /* synthetic */ List t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ pv3 v;

    public /* synthetic */ i01(nc1 nc1Var, String str, String str2, rf3 rf3Var, a82 a82Var, String str3, long j, List list, List list2) {
        this.a = 2;
        this.v = nc1Var;
        this.b = str;
        this.c = str2;
        this.u = rf3Var;
        this.f = a82Var;
        this.d = str3;
        this.s = j;
        this.e = list;
        this.t = list2;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        String str = this.d;
        Object obj2 = this.u;
        heb hebVar = heb.a;
        List list = this.t;
        List list2 = this.e;
        String str2 = this.c;
        String str3 = this.b;
        pv3 pv3Var = this.v;
        switch (i) {
            case 0:
                String str4 = (String) obj2;
                ((u2b) obj).getClass();
                m62 m62Var = (m62) ((s16) pv3Var).c;
                b92 b92Var = m62Var.b;
                Map mapSingletonMap = Collections.singletonMap("raw", str3);
                mapSingletonMap.getClass();
                Map mapSingletonMap2 = Collections.singletonMap("raw", str2);
                mapSingletonMap2.getClass();
                a82 a82Var = this.f;
                lc3 lc3Var = lc3.a;
                String str5 = this.d;
                mc3 mc3Var = mc3.a;
                long j = this.s;
                b92Var.f0(a82.a(a82Var, mapSingletonMap, mapSingletonMap2, null, 0, 0, lc3Var, str5, null, "PDF", null, 0, 0, null, false, 1, false, false, false, mc3Var, j, j, -537920711, 1));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    m62Var.f.h0((v92) it.next());
                }
                int i2 = 0;
                for (Object obj3 : list) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        gc1.i0();
                        throw null;
                    }
                    b92 b92Var2 = m62Var.J;
                    String strG = dx1.g(i2, str4, "_");
                    Map mapSingletonMap3 = Collections.singletonMap("raw", (String) obj3);
                    mapSingletonMap3.getClass();
                    String str6 = "0#" + (i2 / list.size());
                    qa1 qa1Var = r95.a;
                    b92Var2.n0(new uc2(strG, str4, mapSingletonMap3, str6, "", 0, qa1Var.k().c(), qa1Var.k().c()));
                    i2 = i3;
                }
                return hebVar;
            case 1:
                String str7 = (String) obj2;
                ((u2b) obj).getClass();
                m62 m62Var2 = (m62) ((s16) pv3Var).c;
                b92 b92Var3 = m62Var2.b;
                Map mapSingletonMap4 = Collections.singletonMap("raw", str3);
                mapSingletonMap4.getClass();
                Map mapSingletonMap5 = Collections.singletonMap("raw", str2);
                mapSingletonMap5.getClass();
                String str8 = str.length() == 0 ? str7 != null ? str7 : "" : str;
                int size = list2.size();
                a82 a82Var2 = this.f;
                mc3 mc3Var2 = mc3.a;
                long j2 = this.s;
                b92Var3.f0(a82.a(a82Var2, mapSingletonMap4, mapSingletonMap5, null, 0, 0, null, str8, null, "DOCX", null, 0, 0, null, false, size, false, false, false, mc3Var2, j2, j2, -537920647, 1));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    m62Var2.f.h0((v92) it2.next());
                }
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    m62Var2.J.n0((uc2) it3.next());
                }
                return hebVar;
            case 2:
                ((u2b) obj).getClass();
                m62 m62Var3 = (m62) ((nc1) pv3Var).c;
                b92 b92Var4 = m62Var3.b;
                Map mapSingletonMap6 = Collections.singletonMap("raw", str3);
                mapSingletonMap6.getClass();
                Map mapSingletonMap7 = Collections.singletonMap("raw", str2);
                mapSingletonMap7.getClass();
                int size2 = ((rf3) obj2).a.size();
                a82 a82Var3 = this.f;
                lc3 lc3Var2 = lc3.a;
                String str9 = this.d;
                mc3 mc3Var3 = mc3.a;
                long j3 = this.s;
                b92Var4.f0(a82.a(a82Var3, mapSingletonMap6, mapSingletonMap7, null, 0, 0, lc3Var2, str9, null, "EPUB", null, 0, 0, null, false, size2, false, false, false, mc3Var3, j3, j3, -537920711, 1));
                Iterator it4 = list2.iterator();
                while (it4.hasNext()) {
                    m62Var3.f.h0((v92) it4.next());
                }
                Iterator it5 = list.iterator();
                while (it5.hasNext()) {
                    m62Var3.J.n0((uc2) it5.next());
                }
                return hebVar;
            case 3:
                String str10 = (String) obj2;
                ((u2b) obj).getClass();
                m62 m62Var4 = (m62) ((nc1) pv3Var).c;
                b92 b92Var5 = m62Var4.b;
                Map mapSingletonMap8 = Collections.singletonMap("raw", str3);
                mapSingletonMap8.getClass();
                Map mapSingletonMap9 = Collections.singletonMap("raw", str2);
                mapSingletonMap9.getClass();
                String str11 = str.length() == 0 ? str10 != null ? str10 : "" : str;
                int size3 = list2.size();
                a82 a82Var4 = this.f;
                mc3 mc3Var4 = mc3.a;
                long j4 = this.s;
                b92Var5.f0(a82.a(a82Var4, mapSingletonMap8, mapSingletonMap9, null, 0, 0, null, str11, null, "HTML", null, 0, 0, null, false, size3, false, false, false, mc3Var4, j4, j4, -537920647, 1));
                Iterator it6 = list2.iterator();
                while (it6.hasNext()) {
                    m62Var4.f.h0((v92) it6.next());
                }
                Iterator it7 = list.iterator();
                while (it7.hasNext()) {
                    m62Var4.J.n0((uc2) it7.next());
                }
                return hebVar;
            default:
                ((u2b) obj).getClass();
                m62 m62Var5 = (m62) ((s16) pv3Var).c;
                b92 b92Var6 = m62Var5.b;
                Map mapSingletonMap10 = Collections.singletonMap("raw", str3);
                mapSingletonMap10.getClass();
                Map mapSingletonMap11 = Collections.singletonMap("raw", str2);
                mapSingletonMap11.getClass();
                a82 a82Var5 = this.f;
                lc3 lc3Var3 = lc3.a;
                String str12 = this.d;
                mc3 mc3Var5 = mc3.a;
                long j5 = this.s;
                b92Var6.f0(a82.a(a82Var5, mapSingletonMap10, mapSingletonMap11, null, 0, 0, lc3Var3, str12, null, "PDF", null, 0, 0, null, false, 1, false, false, false, mc3Var5, j5, j5, -537920711, 1));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    m62Var5.f.h0((v92) it8.next());
                }
                Iterator it9 = list.iterator();
                if (it9.hasNext()) {
                    throw j39.h(it9);
                }
                return hebVar;
        }
    }

    public /* synthetic */ i01(pv3 pv3Var, String str, String str2, String str3, List list, a82 a82Var, long j, List list2, String str4, int i) {
        this.a = i;
        this.v = pv3Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = list;
        this.f = a82Var;
        this.s = j;
        this.t = list2;
        this.u = str4;
    }

    public /* synthetic */ i01(s16 s16Var, String str, String str2, a82 a82Var, String str3, long j, List list, List list2, String str4) {
        this.a = 0;
        this.v = s16Var;
        this.b = str;
        this.c = str2;
        this.f = a82Var;
        this.d = str3;
        this.s = j;
        this.e = list;
        this.t = list2;
        this.u = str4;
    }

    public /* synthetic */ i01(s16 s16Var, String str, String str2, a82 a82Var, String str3, long j, List list, List list2, String str4, List list3) {
        this.a = 4;
        this.v = s16Var;
        this.b = str;
        this.c = str2;
        this.f = a82Var;
        this.d = str3;
        this.s = j;
        this.e = list;
        this.t = list2;
        this.u = list3;
    }
}
