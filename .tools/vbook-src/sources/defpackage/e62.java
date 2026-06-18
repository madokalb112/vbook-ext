package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class e62 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Serializable d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e62(Serializable serializable, float f, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.d = serializable;
        this.c = f;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        float f = this.c;
        Serializable serializable = this.d;
        switch (i) {
            case 0:
                e62 e62Var = new e62((String) serializable, f, jt1Var, 0);
                e62Var.b = obj;
                return e62Var;
            default:
                e62 e62Var2 = new e62((og8) serializable, f, jt1Var, 1);
                e62Var2.b = obj;
                return e62Var2;
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                ((e62) create((pz6) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            default:
                ((e62) create((tw8) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
        }
        return hebVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        float f = this.c;
        Serializable serializable = this.d;
        switch (i) {
            case 0:
                e11.e0(obj);
                pz6 pz6Var = (pz6) this.b;
                e18 e18VarC = i12.C((String) serializable);
                Float f2 = new Float(f);
                pz6Var.getClass();
                pz6Var.f(e18VarC, f2);
                break;
            default:
                e11.e0(obj);
                ((og8) serializable).a = ((tw8) this.b).a(f);
                break;
        }
        return hebVar;
    }
}
