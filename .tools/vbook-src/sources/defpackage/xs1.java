package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xs1 extends o1a implements ac4 {
    public final /* synthetic */ int a;
    public /* synthetic */ ot5 b;
    public /* synthetic */ ot5 c;
    public final /* synthetic */ a07 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xs1(a07 a07Var, jt1 jt1Var, int i) {
        super(4, jt1Var);
        this.a = i;
        this.d = a07Var;
    }

    @Override // defpackage.ac4
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        heb hebVar = heb.a;
        a07 a07Var = this.d;
        ot5 ot5Var = (ot5) obj2;
        ot5 ot5Var2 = (ot5) obj3;
        jt1 jt1Var = (jt1) obj4;
        switch (i) {
            case 0:
                xs1 xs1Var = new xs1(a07Var, jt1Var, 0);
                xs1Var.b = ot5Var;
                xs1Var.c = ot5Var2;
                xs1Var.invokeSuspend(hebVar);
                break;
            case 1:
                xs1 xs1Var2 = new xs1(a07Var, jt1Var, 1);
                xs1Var2.b = ot5Var;
                xs1Var2.c = ot5Var2;
                xs1Var2.invokeSuspend(hebVar);
                break;
            case 2:
                xs1 xs1Var3 = new xs1(a07Var, jt1Var, 2);
                xs1Var3.b = ot5Var;
                xs1Var3.c = ot5Var2;
                xs1Var3.invokeSuspend(hebVar);
                break;
            case 3:
                xs1 xs1Var4 = new xs1(a07Var, jt1Var, 3);
                xs1Var4.b = ot5Var;
                xs1Var4.c = ot5Var2;
                xs1Var4.invokeSuspend(hebVar);
                break;
            default:
                xs1 xs1Var5 = new xs1(a07Var, jt1Var, 4);
                xs1Var5.b = ot5Var;
                xs1Var5.c = ot5Var2;
                xs1Var5.invokeSuspend(hebVar);
                break;
        }
        return hebVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        a07 a07Var = this.d;
        switch (i) {
            case 0:
                ot5 ot5Var = this.b;
                ot5 ot5Var2 = this.c;
                e11.e0(obj);
                ArrayList arrayListB1 = fc1.b1((List) a07Var.getValue());
                arrayListB1.add(ot5Var2.a - 1, arrayListB1.remove(ot5Var.a - 1));
                a07Var.setValue(arrayListB1);
                break;
            case 1:
                ot5 ot5Var3 = this.b;
                ot5 ot5Var4 = this.c;
                e11.e0(obj);
                ArrayList arrayListB12 = fc1.b1((List) a07Var.getValue());
                arrayListB12.add(ot5Var4.a, arrayListB12.remove(ot5Var3.a));
                a07Var.setValue(arrayListB12);
                break;
            case 2:
                ot5 ot5Var5 = this.b;
                ot5 ot5Var6 = this.c;
                e11.e0(obj);
                ArrayList arrayListB13 = fc1.b1((List) a07Var.getValue());
                arrayListB13.add(ot5Var6.a, arrayListB13.remove(ot5Var5.a));
                a07Var.setValue(arrayListB13);
                break;
            case 3:
                ot5 ot5Var7 = this.b;
                ot5 ot5Var8 = this.c;
                e11.e0(obj);
                ArrayList arrayListB14 = fc1.b1((List) a07Var.getValue());
                arrayListB14.add(ot5Var8.a, arrayListB14.remove(ot5Var7.a));
                a07Var.setValue(arrayListB14);
                break;
            default:
                ot5 ot5Var9 = this.b;
                ot5 ot5Var10 = this.c;
                e11.e0(obj);
                ArrayList arrayListB15 = fc1.b1((List) a07Var.getValue());
                arrayListB15.add(ot5Var10.a, arrayListB15.remove(ot5Var9.a));
                a07Var.setValue(arrayListB15);
                break;
        }
        return hebVar;
    }
}
