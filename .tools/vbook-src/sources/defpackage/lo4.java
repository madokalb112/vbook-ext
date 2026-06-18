package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class lo4 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ mo4 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lo4(mo4 mo4Var, String str, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = mo4Var;
        this.d = str;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new lo4(this.c, this.d, jt1Var, 0);
            default:
                return new lo4(this.c, this.d, jt1Var, 1);
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
        return ((lo4) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Object value;
        ArrayList arrayList;
        List list;
        int i = this.a;
        String str = this.d;
        mo4 mo4Var = this.c;
        xx1 xx1Var = xx1.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    ly8 ly8Var = mo4Var.e;
                    this.b = 1;
                    ((my8) ly8Var).d(str);
                    if (hebVar == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i2 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                fr9 fr9Var = mo4Var.f;
                if (fr9Var != null) {
                    do {
                        value = fr9Var.getValue();
                        ko4 ko4Var = (ko4) value;
                        List list2 = ko4Var.b;
                        arrayList = new ArrayList();
                        for (Object obj2 : list2) {
                            if (!lc5.Q((String) obj2, str)) {
                                arrayList.add(obj2);
                            }
                        }
                        list = ko4Var.a;
                        list.getClass();
                    } while (!fr9Var.j(value, new ko4(list, arrayList)));
                }
                return hebVar;
            default:
                int i3 = this.b;
                if (i3 == 0) {
                    e11.e0(obj);
                    ly8 ly8Var2 = mo4Var.e;
                    this.b = 1;
                    ((my8) ly8Var2).a.H.W(new nc2(str, r95.a.k().c()));
                    if (hebVar == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i3 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
        }
    }
}
