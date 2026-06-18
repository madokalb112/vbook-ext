package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class gga extends o1a implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kga b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gga(kga kgaVar, jt1 jt1Var, int i) {
        super(1, jt1Var);
        this.a = i;
        this.b = kgaVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(jt1 jt1Var) {
        int i = this.a;
        kga kgaVar = this.b;
        switch (i) {
            case 0:
                return new gga(kgaVar, jt1Var, 0);
            case 1:
                return new gga(kgaVar, jt1Var, 1);
            case 2:
                return new gga(kgaVar, jt1Var, 2);
            default:
                return new gga(kgaVar, jt1Var, 3);
        }
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        jt1 jt1Var = (jt1) obj;
        switch (i) {
            case 0:
                ((gga) create(jt1Var)).invokeSuspend(hebVar);
                break;
            case 1:
                ((gga) create(jt1Var)).invokeSuspend(hebVar);
                break;
            case 2:
                ((gga) create(jt1Var)).invokeSuspend(hebVar);
                break;
            default:
                ((gga) create(jt1Var)).invokeSuspend(hebVar);
                break;
        }
        return hebVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        kga kgaVar = this.b;
        switch (i) {
            case 0:
                e11.e0(obj);
                kgaVar.B = false;
                break;
            case 1:
                e11.e0(obj);
                kgaVar.f();
                break;
            case 2:
                e11.e0(obj);
                kgaVar.d(kgaVar.B);
                break;
            default:
                e11.e0(obj);
                kgaVar.p();
                break;
        }
        return hebVar;
    }
}
