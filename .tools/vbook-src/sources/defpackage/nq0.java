package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class nq0 implements c24 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rq0 b;

    public /* synthetic */ nq0(rq0 rq0Var, int i) {
        this.a = i;
        this.b = rq0Var;
    }

    @Override // defpackage.c24
    public final Object b(Object obj, jt1 jt1Var) {
        Object value;
        Object value2;
        int i = this.a;
        heb hebVar = heb.a;
        rq0 rq0Var = this.b;
        switch (i) {
            case 0:
                rq0Var.f.k((List) obj);
                break;
            case 1:
                List list = (List) obj;
                fr9 fr9Var = rq0Var.s;
                if (fr9Var != null) {
                    do {
                        value = fr9Var.getValue();
                    } while (!fr9Var.j(value, iq0.a((iq0) value, false, false, false, list, null, 47)));
                }
                break;
            default:
                List list2 = (List) obj;
                fr9 fr9Var2 = rq0Var.s;
                if (fr9Var2 != null) {
                    do {
                        value2 = fr9Var2.getValue();
                    } while (!fr9Var2.j(value2, iq0.a((iq0) value2, false, false, false, null, list2, 31)));
                }
                break;
        }
        return hebVar;
    }
}
