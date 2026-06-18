package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class z78 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Map b;
    public final /* synthetic */ LinkedHashMap c;
    public final /* synthetic */ c98 d;
    public final /* synthetic */ String e;

    public /* synthetic */ z78(Map map, LinkedHashMap linkedHashMap, c98 c98Var, String str, int i) {
        this.a = i;
        this.b = map;
        this.c = linkedHashMap;
        this.d = c98Var;
        this.e = str;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        String strP;
        String strP2;
        int i = this.a;
        heb hebVar = heb.a;
        c98 c98Var = this.d;
        LinkedHashMap linkedHashMap = this.c;
        Map map = this.b;
        switch (i) {
            case 0:
                ((u2b) obj).getClass();
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    String str2 = (String) entry.getValue();
                    dc2 dc2Var = (dc2) linkedHashMap.get(str);
                    b92 b92Var = c98Var.a.F;
                    if (dc2Var == null || (strP = dc2Var.a) == null) {
                        strP = wm9.p();
                    }
                    b92Var.m0(new dc2(strP, this.e, str, str2, 1, 0, dc2Var != null ? dc2Var.g : r95.a.k().c(), r95.a.k().c()));
                }
                break;
            default:
                ((u2b) obj).getClass();
                for (Map.Entry entry2 : map.entrySet()) {
                    String str3 = (String) entry2.getKey();
                    String str4 = (String) entry2.getValue();
                    dc2 dc2Var2 = (dc2) linkedHashMap.get(str3);
                    b92 b92Var2 = c98Var.a.F;
                    if (dc2Var2 == null || (strP2 = dc2Var2.a) == null) {
                        strP2 = wm9.p();
                    }
                    b92Var2.m0(new dc2(strP2, this.e, str3, str4, 0, 0, dc2Var2 != null ? dc2Var2.g : r95.a.k().c(), r95.a.k().c()));
                }
                break;
        }
        return hebVar;
    }
}
