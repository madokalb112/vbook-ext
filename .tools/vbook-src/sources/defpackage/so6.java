package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class so6 extends o1a implements zb4 {
    public final /* synthetic */ int a;
    public /* synthetic */ float b;
    public final /* synthetic */ kb4 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ so6(int i, jt1 jt1Var, kb4 kb4Var) {
        super(3, jt1Var);
        this.a = i;
        this.c = kb4Var;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        heb hebVar = heb.a;
        kb4 kb4Var = this.c;
        float fFloatValue = ((Number) obj2).floatValue();
        jt1 jt1Var = (jt1) obj3;
        switch (i) {
            case 0:
                so6 so6Var = new so6(0, jt1Var, kb4Var);
                so6Var.b = fFloatValue;
                so6Var.invokeSuspend(hebVar);
                break;
            default:
                so6 so6Var2 = new so6(1, jt1Var, kb4Var);
                so6Var2.b = fFloatValue;
                so6Var2.invokeSuspend(hebVar);
                break;
        }
        return hebVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        kb4 kb4Var = this.c;
        float f = this.b;
        switch (i) {
            case 0:
                e11.e0(obj);
                kb4Var.invoke(new Float(f));
                break;
            default:
                e11.e0(obj);
                kb4Var.invoke(new Float(f));
                break;
        }
        return hebVar;
    }
}
