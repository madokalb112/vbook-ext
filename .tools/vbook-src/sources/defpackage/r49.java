package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class r49 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qsb b;
    public final /* synthetic */ onb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r49(qsb qsbVar, onb onbVar, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.b = qsbVar;
        this.c = onbVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        onb onbVar = this.c;
        qsb qsbVar = this.b;
        switch (i) {
            case 0:
                return new r49(qsbVar, onbVar, jt1Var, 0);
            case 1:
                return new r49(qsbVar, onbVar, jt1Var, 1);
            default:
                return new r49(qsbVar, onbVar, jt1Var, 2);
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
                ((r49) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 1:
                ((r49) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            default:
                ((r49) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
        }
        return hebVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        onb onbVar = this.c;
        qsb qsbVar = this.b;
        switch (i) {
            case 0:
                e11.e0(obj);
                boolean z = onbVar.n;
                qsbVar.q = Boolean.valueOf(z);
                gqb gqbVar = qsbVar.n;
                if (gqbVar != null) {
                    gqbVar.c(z);
                }
                break;
            case 1:
                e11.e0(obj);
                float f = onbVar.o;
                qsbVar.p = Float.valueOf(f);
                gqb gqbVar2 = qsbVar.n;
                if (gqbVar2 != null) {
                    gqbVar2.k(f);
                }
                break;
            default:
                e11.e0(obj);
                float f2 = onbVar.p;
                qsbVar.r = Float.valueOf(f2);
                gqb gqbVar3 = qsbVar.n;
                if (gqbVar3 != null) {
                    gqbVar3.b(f2);
                }
                break;
        }
        return hebVar;
    }
}
