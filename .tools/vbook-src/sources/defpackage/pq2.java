package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class pq2 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ wq2 c;
    public final /* synthetic */ a07 d;
    public final /* synthetic */ a07 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pq2(wq2 wq2Var, a07 a07Var, a07 a07Var2, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = wq2Var;
        this.d = a07Var;
        this.e = a07Var2;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                pq2 pq2Var = new pq2(this.c, this.d, this.e, jt1Var, 0);
                pq2Var.b = obj;
                return pq2Var;
            default:
                pq2 pq2Var2 = new pq2(this.c, this.d, this.e, jt1Var, 1);
                pq2Var2.b = obj;
                return pq2Var2;
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        wga wgaVar = (wga) obj;
        jt1 jt1Var = (jt1) obj2;
        switch (i) {
            case 0:
                ((pq2) create(wgaVar, jt1Var)).invokeSuspend(hebVar);
                break;
            default:
                ((pq2) create(wgaVar, jt1Var)).invokeSuspend(hebVar);
                break;
        }
        return hebVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        a07 a07Var = this.d;
        wq2 wq2Var = this.c;
        a07 a07Var2 = this.e;
        wga wgaVar = (wga) this.b;
        switch (i) {
            case 0:
                e11.e0(obj);
                a07Var2.setValue(fw.A(wgaVar.a.b, wq2Var.d, ((Boolean) a07Var.getValue()).booleanValue()));
                break;
            default:
                e11.e0(obj);
                a07Var2.setValue(fw.A(wgaVar.a.b, wq2Var.d, ((Boolean) a07Var.getValue()).booleanValue()));
                break;
        }
        return hebVar;
    }
}
