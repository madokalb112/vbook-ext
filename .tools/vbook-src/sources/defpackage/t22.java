package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class t22 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ kb4 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t22(int i, jt1 jt1Var, kb4 kb4Var) {
        super(2, jt1Var);
        this.a = i;
        this.c = kb4Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        kb4 kb4Var = this.c;
        switch (i) {
            case 0:
                t22 t22Var = new t22(0, jt1Var, kb4Var);
                t22Var.b = obj;
                return t22Var;
            case 1:
                t22 t22Var2 = new t22(1, jt1Var, kb4Var);
                t22Var2.b = obj;
                return t22Var2;
            default:
                t22 t22Var3 = new t22(kb4Var, jt1Var);
                t22Var3.b = obj;
                return t22Var3;
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                return ((t22) create((ny7) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 1:
                return ((t22) create((ny7) obj, (jt1) obj2)).invokeSuspend(hebVar);
            default:
                ((t22) create((pz6) obj, (jt1) obj2)).invokeSuspend(hebVar);
                return hebVar;
        }
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        kb4 kb4Var = this.c;
        switch (i) {
            case 0:
                e11.e0(obj);
                dc8 dc8Var = (ny7) this.b;
                dc8Var.getClass();
                return kb4Var.invoke(dc8Var.c());
            case 1:
                e11.e0(obj);
                dc8 dc8Var2 = (ny7) this.b;
                dc8Var2.getClass();
                return kb4Var.invoke(dc8Var2.c());
            default:
                e11.e0(obj);
                kb4Var.invoke((pz6) this.b);
                return heb.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t22(kb4 kb4Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 2;
        this.c = kb4Var;
    }
}
