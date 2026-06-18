package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class tp5 extends o1a implements zb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kb4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tp5(int i, jt1 jt1Var, kb4 kb4Var) {
        super(3, jt1Var);
        this.a = i;
        this.b = kb4Var;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        heb hebVar = heb.a;
        kb4 kb4Var = this.b;
        ((Number) obj2).floatValue();
        jt1 jt1Var = (jt1) obj3;
        switch (i) {
            case 0:
                new tp5(0, jt1Var, kb4Var).invokeSuspend(hebVar);
                break;
            case 1:
                new tp5(1, jt1Var, kb4Var).invokeSuspend(hebVar);
                break;
            default:
                new tp5(2, jt1Var, kb4Var).invokeSuspend(hebVar);
                break;
        }
        return hebVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        kb4 kb4Var = this.b;
        switch (i) {
            case 0:
                e11.e0(obj);
                kb4Var.invoke(Boolean.FALSE);
                break;
            case 1:
                e11.e0(obj);
                kb4Var.invoke(Boolean.FALSE);
                break;
            default:
                e11.e0(obj);
                kb4Var.invoke(Boolean.FALSE);
                break;
        }
        return hebVar;
    }
}
