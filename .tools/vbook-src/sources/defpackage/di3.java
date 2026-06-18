package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class di3 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ra8 b;

    public /* synthetic */ di3(ra8 ra8Var, int i) {
        this.a = i;
        this.b = ra8Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        ra8 ra8Var = this.b;
        re reVar = (re) obj;
        reVar.getClass();
        switch (i) {
            case 0:
                ArrayList arrayList = new ArrayList();
                while (((Boolean) reVar.e().b).booleanValue()) {
                    arrayList.add(ra8Var.a.invoke(reVar));
                }
                return new va8(arrayList);
            case 1:
                if (!((Boolean) reVar.e().b).booleanValue()) {
                    return new va8(null);
                }
                Object objInvoke = ra8Var.a.invoke(reVar);
                if (!((Boolean) reVar.e().b).booleanValue()) {
                    return new va8(objInvoke);
                }
                k27.h(ra8Var, "ResultSet returned more than 1 row for ");
                return null;
            case 2:
                va8 va8VarE = reVar.e();
                ArrayList arrayList2 = new ArrayList();
                ra8 ra8Var2 = this.b;
                if (!((Boolean) va8VarE.b).booleanValue()) {
                    return new va8(arrayList2);
                }
                arrayList2.add(ra8Var2.a.invoke(reVar));
                while (((Boolean) reVar.e().b).booleanValue()) {
                    arrayList2.add(ra8Var2.a.invoke(reVar));
                }
                return new va8(arrayList2);
            default:
                va8 va8VarE2 = reVar.e();
                ra8 ra8Var3 = this.b;
                if (!((Boolean) va8VarE2.b).booleanValue()) {
                    return new va8(null);
                }
                Object objInvoke2 = ra8Var3.a.invoke(reVar);
                if (!((Boolean) reVar.e().b).booleanValue()) {
                    return new va8(objInvoke2);
                }
                k27.h(ra8Var3, "ResultSet returned more than 1 row for ");
                return null;
        }
    }
}
