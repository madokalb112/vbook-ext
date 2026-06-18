package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class tm6 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ a07 c;
    public final /* synthetic */ a07 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tm6(List list, a07 a07Var, a07 a07Var2, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.b = list;
        this.c = a07Var;
        this.d = a07Var2;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new tm6(this.b, this.c, this.d, jt1Var, 0);
            default:
                return new tm6(this.b, this.c, this.d, jt1Var, 1);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        vx1 vx1Var = (vx1) obj;
        jt1 jt1Var = (jt1) obj2;
        switch (i) {
        }
        return ((tm6) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        a07 a07Var = this.d;
        List listN0 = this.b;
        a07 a07Var2 = this.c;
        switch (i) {
            case 0:
                e11.e0(obj);
                if (((Boolean) a07Var2.getValue()).booleanValue()) {
                    listN0 = fc1.N0(listN0);
                }
                if (bw9.a0(((wga) a07Var.getValue()).a.b)) {
                    return listN0;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listN0) {
                    if (bw9.O(((d35) obj2).b, ((wga) a07Var.getValue()).a.b, true)) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            default:
                e11.e0(obj);
                if (((Boolean) a07Var2.getValue()).booleanValue()) {
                    listN0 = fc1.N0(listN0);
                }
                if (bw9.a0(((wga) a07Var.getValue()).a.b)) {
                    return listN0;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : listN0) {
                    if (bw9.O(((koa) obj3).b, ((wga) a07Var.getValue()).a.b, true)) {
                        arrayList2.add(obj3);
                    }
                }
                return arrayList2;
        }
    }
}
