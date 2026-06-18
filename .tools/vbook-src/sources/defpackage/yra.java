package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class yra extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ csa b;
    public /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yra(csa csaVar, boolean z, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.b = csaVar;
        this.c = z;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        csa csaVar = this.b;
        switch (i) {
            case 0:
                return new yra(csaVar, this.c, jt1Var, 0);
            case 1:
                return new yra(csaVar, this.c, jt1Var, 1);
            case 2:
                return new yra(csaVar, this.c, jt1Var, 2);
            case 3:
                yra yraVar = new yra(csaVar, jt1Var, 3);
                yraVar.c = ((Boolean) obj).booleanValue();
                return yraVar;
            case 4:
                yra yraVar2 = new yra(csaVar, jt1Var, 4);
                yraVar2.c = ((Boolean) obj).booleanValue();
                return yraVar2;
            default:
                yra yraVar3 = new yra(csaVar, jt1Var, 5);
                yraVar3.c = ((Boolean) obj).booleanValue();
                return yraVar3;
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                ((yra) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 1:
                ((yra) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 2:
                ((yra) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 3:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((yra) create(bool, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 4:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                ((yra) create(bool2, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            default:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                ((yra) create(bool3, (jt1) obj2)).invokeSuspend(hebVar);
                break;
        }
        return hebVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        int i = this.a;
        heb hebVar = heb.a;
        csa csaVar = this.b;
        switch (i) {
            case 0:
                e11.e0(obj);
                nra nraVar = csaVar.c;
                boolean z = this.c;
                sra sraVar = (sra) nraVar;
                sraVar.a.l.e(qt.T[10], Boolean.valueOf(z));
                fr9 fr9Var = sraVar.k;
                Boolean boolValueOf = Boolean.valueOf(z);
                fr9Var.getClass();
                fr9Var.l(null, boolValueOf);
                break;
            case 1:
                e11.e0(obj);
                nra nraVar2 = csaVar.c;
                boolean z2 = this.c;
                sra sraVar2 = (sra) nraVar2;
                sraVar2.a.k.e(qt.T[9], Boolean.valueOf(z2));
                fr9 fr9Var2 = sraVar2.j;
                Boolean boolValueOf2 = Boolean.valueOf(z2);
                fr9Var2.getClass();
                fr9Var2.l(null, boolValueOf2);
                break;
            case 2:
                e11.e0(obj);
                nra nraVar3 = csaVar.c;
                boolean z3 = this.c;
                sra sraVar3 = (sra) nraVar3;
                sraVar3.a.m.e(qt.T[11], Boolean.valueOf(z3));
                fr9 fr9Var3 = sraVar3.l;
                Boolean boolValueOf3 = Boolean.valueOf(z3);
                fr9Var3.getClass();
                fr9Var3.l(null, boolValueOf3);
                break;
            case 3:
                boolean z4 = this.c;
                e11.e0(obj);
                fr9 fr9Var4 = csaVar.d;
                if (fr9Var4 != null) {
                    do {
                        value = fr9Var4.getValue();
                    } while (!fr9Var4.j(value, wra.a((wra) value, null, null, null, null, 0, z4, false, false, 0, 0.0f, null, 0, null, 0.0f, 32735)));
                }
                break;
            case 4:
                boolean z5 = this.c;
                e11.e0(obj);
                fr9 fr9Var5 = csaVar.d;
                if (fr9Var5 != null) {
                    while (true) {
                        Object value3 = fr9Var5.getValue();
                        boolean z6 = z5;
                        if (!fr9Var5.j(value3, wra.a((wra) value3, null, null, null, null, 0, false, z6, false, 0, 0.0f, null, 0, null, 0.0f, 32703))) {
                            z5 = z6;
                        }
                    }
                }
                break;
            default:
                boolean z7 = this.c;
                e11.e0(obj);
                fr9 fr9Var6 = csaVar.d;
                if (fr9Var6 != null) {
                    do {
                        value2 = fr9Var6.getValue();
                    } while (!fr9Var6.j(value2, wra.a((wra) value2, null, null, null, null, 0, false, false, z7, 0, 0.0f, null, 0, null, 0.0f, 32639)));
                }
                break;
        }
        return hebVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yra(csa csaVar, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.b = csaVar;
    }
}
