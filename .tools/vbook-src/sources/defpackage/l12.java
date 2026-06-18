package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class l12 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a07 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l12(a07 a07Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.b = a07Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        a07 a07Var = this.b;
        switch (i) {
            case 0:
                return new l12(a07Var, jt1Var, 0);
            case 1:
                return new l12(a07Var, jt1Var, 1);
            case 2:
                return new l12(a07Var, jt1Var, 2);
            case 3:
                return new l12(a07Var, jt1Var, 3);
            default:
                return new l12(a07Var, jt1Var, 4);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        vx1 vx1Var = (vx1) obj;
        jt1 jt1Var = (jt1) obj2;
        switch (i) {
            case 0:
                ((l12) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                return hebVar;
            case 1:
                return ((l12) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
            case 2:
                ((l12) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                return hebVar;
            case 3:
                ((l12) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                return hebVar;
            default:
                return ((l12) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
        }
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        a07 a07Var = this.b;
        switch (i) {
            case 0:
                e11.e0(obj);
                a07Var.setValue(Boolean.TRUE);
                return hebVar;
            case 1:
                e11.e0(obj);
                zy5 zy5VarN = gc1.N();
                if (!((ub3) a07Var.getValue()).b.isEmpty()) {
                    zy5VarN.add("");
                    int size = ((ub3) a07Var.getValue()).b.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        zy5VarN.add("");
                    }
                }
                List list = ((ub3) a07Var.getValue()).c;
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    w93 w93Var = (w93) list.get(i3);
                    zy5VarN.add(w93Var.a);
                    int size3 = w93Var.d.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        zy5VarN.add(w93Var.a);
                    }
                }
                return gc1.J(zy5VarN);
            case 2:
                e11.e0(obj);
                a07Var.setValue(Boolean.FALSE);
                return hebVar;
            case 3:
                e11.e0(obj);
                a07Var.setValue(Boolean.FALSE);
                return hebVar;
            default:
                e11.e0(obj);
                List list2 = ((kba) a07Var.getValue()).a;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    if (((gba) obj2).e == 0) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
        }
    }
}
