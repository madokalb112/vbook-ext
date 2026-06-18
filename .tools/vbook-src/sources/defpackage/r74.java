package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class r74 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s74 b;
    public final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r74(s74 s74Var, float f, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.b = s74Var;
        this.c = f;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        float f = this.c;
        s74 s74Var = this.b;
        switch (i) {
            case 0:
                return new r74(s74Var, f, jt1Var, 0);
            default:
                return new r74(s74Var, f, jt1Var, 1);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        vx1 vx1Var = (vx1) obj;
        jt1 jt1Var = (jt1) obj2;
        switch (i) {
            case 0:
                ((r74) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            default:
                ((r74) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
        }
        return hebVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        float f = this.c;
        s74 s74Var = this.b;
        switch (i) {
            case 0:
                e11.e0(obj);
                sra sraVar = (sra) s74Var.c;
                sraVar.a.p.e(qt.T[14], Float.valueOf(f));
                fr9 fr9Var = sraVar.o;
                Float fValueOf = Float.valueOf(f);
                fr9Var.getClass();
                fr9Var.l(null, fValueOf);
                break;
            default:
                e11.e0(obj);
                sra sraVar2 = (sra) s74Var.c;
                sraVar2.a.o.e(qt.T[13], Float.valueOf(f));
                fr9 fr9Var2 = sraVar2.n;
                Float fValueOf2 = Float.valueOf(f);
                fr9Var2.getClass();
                fr9Var2.l(null, fValueOf2);
                break;
        }
        return hebVar;
    }
}
