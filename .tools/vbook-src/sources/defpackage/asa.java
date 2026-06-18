package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class asa extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ csa b;
    public /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ asa(csa csaVar, int i, jt1 jt1Var, int i2) {
        super(2, jt1Var);
        this.a = i2;
        this.b = csaVar;
        this.c = i;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        csa csaVar = this.b;
        switch (i) {
            case 0:
                return new asa(csaVar, this.c, jt1Var, 0);
            case 1:
                return new asa(csaVar, this.c, jt1Var, 1);
            case 2:
                return new asa(csaVar, this.c, jt1Var, 2);
            case 3:
                asa asaVar = new asa(csaVar, jt1Var, 3);
                asaVar.c = ((Number) obj).intValue();
                return asaVar;
            case 4:
                asa asaVar2 = new asa(csaVar, jt1Var, 4);
                asaVar2.c = ((Number) obj).intValue();
                return asaVar2;
            default:
                asa asaVar3 = new asa(csaVar, jt1Var, 5);
                asaVar3.c = ((Number) obj).intValue();
                return asaVar3;
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                ((asa) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 1:
                ((asa) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 2:
                ((asa) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 3:
                ((asa) create(Integer.valueOf(((Number) obj).intValue()), (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 4:
                ((asa) create(Integer.valueOf(((Number) obj).intValue()), (jt1) obj2)).invokeSuspend(hebVar);
                break;
            default:
                ((asa) create(Integer.valueOf(((Number) obj).intValue()), (jt1) obj2)).invokeSuspend(hebVar);
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
                int i2 = this.c;
                sra sraVar = (sra) nraVar;
                sraVar.a.j.e(qt.T[8], Integer.valueOf(i2));
                fr9 fr9Var = sraVar.g;
                Integer numValueOf = Integer.valueOf(i2);
                fr9Var.getClass();
                fr9Var.l(null, numValueOf);
                break;
            case 1:
                e11.e0(obj);
                nra nraVar2 = csaVar.c;
                int i3 = this.c;
                sra sraVar2 = (sra) nraVar2;
                sraVar2.a.q.e(qt.T[15], Integer.valueOf(i3));
                fr9 fr9Var2 = sraVar2.p;
                Integer numValueOf2 = Integer.valueOf(i3);
                fr9Var2.getClass();
                fr9Var2.l(null, numValueOf2);
                break;
            case 2:
                e11.e0(obj);
                nra nraVar3 = csaVar.c;
                int i4 = this.c;
                sra sraVar3 = (sra) nraVar3;
                sraVar3.a.h.e(qt.T[6], Integer.valueOf(i4));
                fr9 fr9Var3 = sraVar3.c;
                Integer numValueOf3 = Integer.valueOf(i4);
                fr9Var3.getClass();
                fr9Var3.l(null, numValueOf3);
                break;
            case 3:
                int i5 = this.c;
                e11.e0(obj);
                fr9 fr9Var4 = csaVar.d;
                if (fr9Var4 != null) {
                    while (true) {
                        Object value2 = fr9Var4.getValue();
                        int i6 = i5;
                        if (!fr9Var4.j(value2, wra.a((wra) value2, null, null, null, null, 0, false, false, false, 0, 0.0f, null, i6, null, 0.0f, 28671))) {
                            i5 = i6;
                        }
                    }
                }
                break;
            case 4:
                int i7 = this.c;
                e11.e0(obj);
                fr9 fr9Var5 = csaVar.d;
                if (fr9Var5 != null) {
                    while (true) {
                        Object value3 = fr9Var5.getValue();
                        int i8 = i7;
                        if (!fr9Var5.j(value3, wra.a((wra) value3, null, null, null, null, i8, false, false, false, 0, 0.0f, null, 0, null, 0.0f, 32751))) {
                            i7 = i8;
                        }
                    }
                }
                break;
            default:
                int i9 = this.c;
                e11.e0(obj);
                fr9 fr9Var6 = csaVar.d;
                if (fr9Var6 != null) {
                    do {
                        value = fr9Var6.getValue();
                    } while (!fr9Var6.j(value, wra.a((wra) value, null, null, null, null, 0, false, false, false, i9, 0.0f, null, 0, null, 0.0f, 32511)));
                }
                break;
        }
        return hebVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ asa(csa csaVar, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.b = csaVar;
    }
}
