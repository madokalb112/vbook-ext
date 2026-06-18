package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class p51 extends o1a implements zb4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ a07 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p51(ib4 ib4Var, a07 a07Var, br9 br9Var, jt1 jt1Var) {
        super(3, jt1Var);
        this.c = ib4Var;
        this.b = a07Var;
        this.d = br9Var;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        heb hebVar = heb.a;
        Object obj4 = this.d;
        a07 a07Var = this.b;
        switch (i) {
            case 0:
                p51 p51Var = new p51((t27) obj4, a07Var, (jt1) obj3);
                p51Var.c = (nhb) obj2;
                p51Var.invokeSuspend(hebVar);
                break;
            default:
                ((Number) obj2).floatValue();
                new p51((ib4) this.c, a07Var, (br9) obj4, (jt1) obj3).invokeSuspend(hebVar);
                break;
        }
        return hebVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        Object obj2 = this.d;
        a07 a07Var = this.b;
        switch (i) {
            case 0:
                nhb nhbVar = (nhb) this.c;
                e11.e0(obj);
                if (nhbVar != null) {
                    a07Var.setValue((Object) null);
                    ah1.M((t27) obj2, nhbVar.a);
                }
                break;
            default:
                e11.e0(obj);
                if (((Number) a07Var.getValue()).floatValue() < 250.0f && ((Number) a07Var.getValue()).floatValue() > -250.0f) {
                    a07Var.setValue(Float.valueOf(((Number) ((br9) obj2).getValue()).floatValue()));
                } else {
                    ((ib4) this.c).invoke();
                }
                break;
        }
        return hebVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p51(t27 t27Var, a07 a07Var, jt1 jt1Var) {
        super(3, jt1Var);
        this.d = t27Var;
        this.b = a07Var;
    }
}
