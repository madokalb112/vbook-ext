package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class vs1 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kb4 b;
    public final /* synthetic */ a07 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vs1(kb4 kb4Var, a07 a07Var, Object obj, int i) {
        this.a = i;
        this.b = kb4Var;
        this.c = a07Var;
        this.d = obj;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        kb4 kb4Var = this.b;
        Object obj2 = this.d;
        a07 a07Var = this.c;
        switch (i) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                List<js1> list = (List) a07Var.getValue();
                js1 js1Var = (js1) obj2;
                ArrayList arrayList = new ArrayList(gc1.M(list, 10));
                for (js1 js1Var2 : list) {
                    if (lc5.Q(js1Var2.a, js1Var.a)) {
                        String str = js1Var2.a;
                        String str2 = js1Var2.b;
                        ru ruVar = js1Var2.c;
                        str.getClass();
                        str2.getClass();
                        js1Var2 = new js1(str, str2, ruVar, zBooleanValue);
                    }
                    arrayList.add(js1Var2);
                }
                a07Var.setValue(arrayList);
                kb4Var.invoke((List) a07Var.getValue());
                break;
            case 1:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                List<az2> list2 = (List) a07Var.getValue();
                az2 az2Var = (az2) obj2;
                ArrayList arrayList2 = new ArrayList(gc1.M(list2, 10));
                for (az2 az2VarA : list2) {
                    if (lc5.Q(az2VarA.a, az2Var.a)) {
                        az2VarA = az2.a(az2VarA, null, null, zBooleanValue2, 7);
                    }
                    arrayList2.add(az2VarA);
                }
                a07Var.setValue(arrayList2);
                kb4Var.invoke((List) a07Var.getValue());
                break;
            default:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                List<dab> list3 = (List) a07Var.getValue();
                dab dabVar = (dab) obj2;
                ArrayList arrayList3 = new ArrayList(gc1.M(list3, 10));
                for (dab dabVarA : list3) {
                    if (lc5.Q(dabVarA.a, dabVar.a)) {
                        dabVarA = dab.a(dabVarA, zBooleanValue3, null, null, null, 29);
                    }
                    arrayList3.add(dabVarA);
                }
                a07Var.setValue(arrayList3);
                kb4Var.invoke((List) a07Var.getValue());
                break;
        }
        return hebVar;
    }
}
