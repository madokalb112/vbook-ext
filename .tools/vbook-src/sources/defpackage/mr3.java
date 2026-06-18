package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class mr3 implements c24 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sr3 b;

    public /* synthetic */ mr3(sr3 sr3Var, int i) {
        this.a = i;
        this.b = sr3Var;
    }

    @Override // defpackage.c24
    public final Object b(Object obj, jt1 jt1Var) throws Throwable {
        heb hebVar;
        int i = this.a;
        xx1 xx1Var = xx1.a;
        heb hebVar2 = heb.a;
        sr3 sr3Var = this.b;
        switch (i) {
            case 0:
                za1 za1VarA = vtb.a(sr3Var);
                aj2 aj2Var = rw2.a;
                sr3Var.g(za1VarA, nh2.c, new hv2((List) obj, sr3Var, (jt1) null));
                return hebVar2;
            case 1:
                sr3Var.u = (List) obj;
                Object objK = sr3.k(sr3Var, jt1Var);
                return objK == xx1Var ? objK : hebVar2;
            default:
                Object[] objArr = (Object[]) obj;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                Object obj4 = objArr[2];
                boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
                List list = (List) obj4;
                List list2 = (List) obj3;
                List list3 = (List) obj2;
                fr9 fr9Var = sr3Var.f;
                if (fr9Var != null) {
                    while (true) {
                        Object value = fr9Var.getValue();
                        hebVar = hebVar2;
                        if (!fr9Var.j(value, kr3.a((kr3) value, false, zBooleanValue, fc1.e1(list2), null, fc1.e1(list), null, fc1.e1(list3), null, null, null, null, null, 4009))) {
                            hebVar2 = hebVar;
                        }
                    }
                } else {
                    hebVar = hebVar2;
                }
                Object objK2 = sr3.k(sr3Var, jt1Var);
                return objK2 == xx1Var ? objK2 : hebVar;
        }
    }
}
