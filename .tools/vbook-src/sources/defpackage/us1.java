package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class us1 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kb4 b;
    public final /* synthetic */ a07 c;

    public /* synthetic */ us1(int i, kb4 kb4Var, a07 a07Var) {
        this.a = i;
        this.b = kb4Var;
        this.c = a07Var;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        heb hebVar = heb.a;
        a07 a07Var = this.c;
        kb4 kb4Var = this.b;
        switch (i) {
            case 0:
                kb4Var.invoke((List) a07Var.getValue());
                break;
            case 1:
                kb4Var.invoke((List) a07Var.getValue());
                break;
            case 2:
                List list = (List) a07Var.getValue();
                ArrayList arrayList = new ArrayList(gc1.M(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((w93) it.next()).a);
                }
                kb4Var.invoke(arrayList);
                break;
            case 3:
                kb4Var.invoke((List) a07Var.getValue());
                break;
            case 4:
                kb4Var.invoke((List) a07Var.getValue());
                break;
            case 5:
                kb4Var.invoke((List) a07Var.getValue());
                break;
            default:
                kb4Var.invoke((List) a07Var.getValue());
                break;
        }
        return hebVar;
    }
}
