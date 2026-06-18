package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class sb3 extends o1a implements ac4 {
    public final /* synthetic */ int a;
    public /* synthetic */ kq5 b;
    public /* synthetic */ kq5 c;
    public final /* synthetic */ a07 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sb3(a07 a07Var, jt1 jt1Var, int i) {
        super(4, jt1Var);
        this.a = i;
        this.d = a07Var;
    }

    @Override // defpackage.ac4
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        heb hebVar = heb.a;
        a07 a07Var = this.d;
        kq5 kq5Var = (kq5) obj2;
        kq5 kq5Var2 = (kq5) obj3;
        jt1 jt1Var = (jt1) obj4;
        switch (i) {
            case 0:
                sb3 sb3Var = new sb3(a07Var, jt1Var, 0);
                sb3Var.b = kq5Var;
                sb3Var.c = kq5Var2;
                sb3Var.invokeSuspend(hebVar);
                break;
            default:
                sb3 sb3Var2 = new sb3(a07Var, jt1Var, 1);
                sb3Var2.b = kq5Var;
                sb3Var2.c = kq5Var2;
                sb3Var2.invokeSuspend(hebVar);
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
                kq5 kq5Var = this.b;
                kq5 kq5Var2 = this.c;
                e11.e0(obj);
                ArrayList arrayListB1 = fc1.b1((List) a07Var.getValue());
                arrayListB1.add(kq5Var2.a, arrayListB1.remove(kq5Var.a));
                a07Var.setValue(arrayListB1);
                break;
            default:
                kq5 kq5Var3 = this.b;
                kq5 kq5Var4 = this.c;
                e11.e0(obj);
                ArrayList arrayListB12 = fc1.b1((List) a07Var.getValue());
                arrayListB12.add(kq5Var4.a, arrayListB12.remove(kq5Var3.a));
                a07Var.setValue(arrayListB12);
                break;
        }
        return hebVar;
    }
}
