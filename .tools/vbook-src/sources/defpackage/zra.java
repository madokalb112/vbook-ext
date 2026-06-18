package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zra extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ csa b;
    public /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zra(csa csaVar, float f, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.b = csaVar;
        this.c = f;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        csa csaVar = this.b;
        switch (i) {
            case 0:
                return new zra(csaVar, this.c, jt1Var, 0);
            case 1:
                return new zra(csaVar, this.c, jt1Var, 1);
            case 2:
                zra zraVar = new zra(csaVar, jt1Var, 2);
                zraVar.c = ((Number) obj).floatValue();
                return zraVar;
            default:
                zra zraVar2 = new zra(csaVar, jt1Var, 3);
                zraVar2.c = ((Number) obj).floatValue();
                return zraVar2;
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                ((zra) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 1:
                ((zra) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 2:
                ((zra) create(Float.valueOf(((Number) obj).floatValue()), (jt1) obj2)).invokeSuspend(hebVar);
                break;
            default:
                ((zra) create(Float.valueOf(((Number) obj).floatValue()), (jt1) obj2)).invokeSuspend(hebVar);
                break;
        }
        return hebVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Object value;
        int i = this.a;
        heb hebVar = heb.a;
        csa csaVar = this.b;
        switch (i) {
            case 0:
                e11.e0(obj);
                nra nraVar = csaVar.c;
                float f = this.c;
                sra sraVar = (sra) nraVar;
                sraVar.a.i.e(qt.T[7], Float.valueOf(f));
                fr9 fr9Var = sraVar.d;
                Float fValueOf = Float.valueOf(f);
                fr9Var.getClass();
                fr9Var.l(null, fValueOf);
                break;
            case 1:
                e11.e0(obj);
                nra nraVar2 = csaVar.c;
                float f2 = this.c;
                sra sraVar2 = (sra) nraVar2;
                sraVar2.getClass();
                float fP = wx1.P(f2, 0.0f, 1.0f);
                sraVar2.a.g.e(qt.T[5], Float.valueOf(fP));
                fr9 fr9Var2 = sraVar2.r;
                Float fValueOf2 = Float.valueOf(fP);
                fr9Var2.getClass();
                fr9Var2.l(null, fValueOf2);
                break;
            case 2:
                float f3 = this.c;
                e11.e0(obj);
                fr9 fr9Var3 = csaVar.d;
                if (fr9Var3 != null) {
                    while (true) {
                        Object value2 = fr9Var3.getValue();
                        float f4 = f3;
                        if (!fr9Var3.j(value2, wra.a((wra) value2, null, null, null, null, 0, false, false, false, 0, 0.0f, null, 0, null, f4, 16383))) {
                            f3 = f4;
                        }
                    }
                }
                break;
            default:
                float f5 = this.c;
                e11.e0(obj);
                fr9 fr9Var4 = csaVar.d;
                if (fr9Var4 != null) {
                    do {
                        value = fr9Var4.getValue();
                    } while (!fr9Var4.j(value, wra.a((wra) value, null, null, null, null, 0, false, false, false, 0, f5, null, 0, null, 0.0f, 32255)));
                }
                break;
        }
        return hebVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zra(csa csaVar, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.b = csaVar;
    }
}
