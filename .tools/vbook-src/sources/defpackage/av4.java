package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class av4 extends o1a implements yb4 {
    public int a;
    public /* synthetic */ long b;

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        av4 av4Var = new av4(2, jt1Var);
        av4Var.b = ((Number) obj).longValue();
        return av4Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        return ((av4) create(Long.valueOf(((Number) obj).longValue()), (jt1) obj2)).invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        long j = this.b;
        int i = this.a;
        if (i == 0) {
            e11.e0(obj);
            this.b = j;
            this.a = 1;
            Object objH = tw1.H(j, this);
            xx1 xx1Var = xx1.a;
            if (objH == xx1Var) {
                return xx1Var;
            }
        } else {
            if (i != 1) {
                gp.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            e11.e0(obj);
        }
        return heb.a;
    }
}
