package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class y9b implements kb4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ a82 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ long f;
    public final /* synthetic */ pv3 s;
    public final /* synthetic */ List t;
    public final /* synthetic */ List u;

    public /* synthetic */ y9b(nc1 nc1Var, String str, String str2, a82 a82Var, String str3, long j, List list, List list2) {
        this.s = nc1Var;
        this.b = str;
        this.c = str2;
        this.d = a82Var;
        this.e = str3;
        this.f = j;
        this.t = list;
        this.u = list2;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = 0;
        List list = this.u;
        List list2 = this.t;
        String str = this.c;
        String str2 = this.b;
        pv3 pv3Var = this.s;
        switch (i) {
            case 0:
                ArrayList arrayList = (ArrayList) list2;
                ArrayList arrayList2 = (ArrayList) list;
                ((u2b) obj).getClass();
                m62 m62Var = (m62) ((s16) pv3Var).c;
                b92 b92Var = m62Var.b;
                Map mapSingletonMap = Collections.singletonMap("raw", str2);
                mapSingletonMap.getClass();
                int size = arrayList.size();
                a82 a82Var = this.d;
                Map map = a82Var.D;
                Map mapSingletonMap2 = Collections.singletonMap("includeChapterName", str.equals("detect_by_regex") ? "false" : "true");
                mapSingletonMap2.getClass();
                LinkedHashMap linkedHashMapV = y86.V(map, mapSingletonMap2);
                String str3 = this.e;
                long j = this.f;
                b92Var.f0(a82.a(a82Var, mapSingletonMap, null, null, 0, 0, null, str3, null, "TXT", null, 0, 0, null, false, size, false, false, false, linkedHashMapV, j, j, -537920643, 1));
                int size2 = arrayList.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList.get(i3);
                    i3++;
                    m62Var.f.h0((v92) obj2);
                }
                int size3 = arrayList2.size();
                while (i2 < size3) {
                    Object obj3 = arrayList2.get(i2);
                    i2++;
                    m62Var.J.n0((uc2) obj3);
                }
                return hebVar;
            default:
                ((u2b) obj).getClass();
                m62 m62Var2 = (m62) ((nc1) pv3Var).c;
                b92 b92Var2 = m62Var2.b;
                Map mapSingletonMap3 = Collections.singletonMap("raw", str2);
                mapSingletonMap3.getClass();
                Map mapSingletonMap4 = Collections.singletonMap("raw", str);
                mapSingletonMap4.getClass();
                a82 a82Var2 = this.d;
                lc3 lc3Var = lc3.a;
                String str4 = this.e;
                mc3 mc3Var = mc3.a;
                long j2 = this.f;
                b92Var2.f0(a82.a(a82Var2, mapSingletonMap3, mapSingletonMap4, null, 0, 0, lc3Var, str4, null, "ZIP", null, 0, 0, null, false, 1, false, false, false, mc3Var, j2, j2, -537920711, 1));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    m62Var2.f.h0((v92) it.next());
                }
                for (Object obj4 : list) {
                    int i4 = i2 + 1;
                    if (i2 < 0) {
                        gc1.i0();
                        throw null;
                    }
                    b92 b92Var3 = m62Var2.J;
                    String strG = dx1.g(i2, a82Var2.a, "_");
                    String str5 = a82Var2.a;
                    Map mapSingletonMap5 = Collections.singletonMap("raw", (String) obj4);
                    mapSingletonMap5.getClass();
                    String str6 = "0#" + (i2 / list.size());
                    qa1 qa1Var = r95.a;
                    b92Var3.n0(new uc2(strG, str5, mapSingletonMap5, str6, "", 0, qa1Var.k().c(), qa1Var.k().c()));
                    i2 = i4;
                }
                return hebVar;
        }
    }

    public /* synthetic */ y9b(s16 s16Var, String str, ArrayList arrayList, a82 a82Var, String str2, String str3, long j, ArrayList arrayList2) {
        this.s = s16Var;
        this.b = str;
        this.t = arrayList;
        this.d = a82Var;
        this.c = str2;
        this.e = str3;
        this.f = j;
        this.u = arrayList2;
    }
}
