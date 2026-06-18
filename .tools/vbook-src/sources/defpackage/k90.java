package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class k90 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k90(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        heb hebVar = heb.a;
        Object obj = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((hb1) obj).c(((gi1) obj3).c);
                m90 m90Var = (m90) obj2;
                m90Var.d.getClass();
                m90Var.e = new jua(xu6.a());
                m90Var.c.setValue(Boolean.FALSE);
                m90Var.a.setValue(lc3.a);
                m90Var.b.i(0);
                break;
            case 1:
                a07 a07Var = (a07) obj3;
                List list = (List) a07Var.getValue();
                az2 az2Var = (az2) obj2;
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : list) {
                    if (!lc5.Q(((az2) obj4).a, az2Var.a)) {
                        arrayList.add(obj4);
                    }
                }
                a07Var.setValue(arrayList);
                ((kb4) obj).invoke((List) a07Var.getValue());
                break;
            case 2:
                a07 a07Var2 = (a07) obj3;
                List list2 = (List) a07Var2.getValue();
                yha yhaVar = (yha) obj2;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj5 : list2) {
                    if (!lc5.Q(((yha) obj5).a, yhaVar.a)) {
                        arrayList2.add(obj5);
                    }
                }
                a07Var2.setValue(arrayList2);
                ((kb4) obj).invoke((List) a07Var2.getValue());
                break;
            case 3:
                ((kb4) obj).invoke((String) obj3);
                ((ib4) obj2).invoke();
                break;
            case 4:
                x77 x77Var = (x77) obj;
                if (!x77Var.d) {
                    c97 c97Var = (c97) obj3;
                    String str = x77Var.a;
                    str.getClass();
                    za1 za1VarA = vtb.a(c97Var);
                    aj2 aj2Var = rw2.a;
                    c97Var.g(za1VarA, nh2.c, new y46(c97Var, str, null, 15));
                }
                g87 g87Var = x77Var.c;
                if (g87Var instanceof e87) {
                    e11.Q((t27) obj2, ((e87) g87Var).a);
                }
                break;
            case 5:
                a07 a07Var3 = (a07) obj3;
                List list3 = (List) a07Var3.getValue();
                o78 o78Var = (o78) obj2;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj6 : list3) {
                    if (!lc5.Q(((o78) obj6).a, o78Var.a)) {
                        arrayList3.add(obj6);
                    }
                }
                a07Var3.setValue(arrayList3);
                ((kb4) obj).invoke((List) a07Var3.getValue());
                break;
            default:
                a07 a07Var4 = (a07) obj3;
                List list4 = (List) a07Var4.getValue();
                dab dabVar = (dab) obj2;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj7 : list4) {
                    if (!lc5.Q(((dab) obj7).a, dabVar.a)) {
                        arrayList4.add(obj7);
                    }
                }
                a07Var4.setValue(arrayList4);
                ((kb4) obj).invoke((List) a07Var4.getValue());
                break;
        }
        return hebVar;
    }
}
