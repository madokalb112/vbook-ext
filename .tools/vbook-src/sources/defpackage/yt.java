package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class yt extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public /* synthetic */ boolean b;
    public final /* synthetic */ zt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yt(zt ztVar, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = ztVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        zt ztVar = this.c;
        switch (i) {
            case 0:
                yt ytVar = new yt(ztVar, jt1Var, 0);
                ytVar.b = ((Boolean) obj).booleanValue();
                return ytVar;
            case 1:
                yt ytVar2 = new yt(ztVar, jt1Var, 1);
                ytVar2.b = ((Boolean) obj).booleanValue();
                return ytVar2;
            default:
                yt ytVar3 = new yt(ztVar, jt1Var, 2);
                ytVar3.b = ((Boolean) obj).booleanValue();
                return ytVar3;
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        jt1 jt1Var = (jt1) obj2;
        switch (i) {
            case 0:
                ((yt) create(bool, jt1Var)).invokeSuspend(hebVar);
                break;
            case 1:
                ((yt) create(bool, jt1Var)).invokeSuspend(hebVar);
                break;
            default:
                ((yt) create(bool, jt1Var)).invokeSuspend(hebVar);
                break;
        }
        return hebVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Object value;
        int i = this.a;
        heb hebVar = heb.a;
        zt ztVar = this.c;
        switch (i) {
            case 0:
                boolean z = this.b;
                e11.e0(obj);
                fr9 fr9Var = ztVar.u;
                if (fr9Var != null) {
                    while (true) {
                        Object value2 = fr9Var.getValue();
                        boolean z2 = z;
                        if (!fr9Var.j(value2, dsa.a((dsa) value2, 0L, null, 0, z2, false, false, 0, 0.0d, 0.0f, 0.0f, null, 0, null, 0.0f, 32759))) {
                            z = z2;
                        }
                    }
                }
                break;
            case 1:
                boolean z3 = this.b;
                e11.e0(obj);
                fr9 fr9Var2 = ztVar.u;
                if (fr9Var2 != null) {
                    while (true) {
                        Object value3 = fr9Var2.getValue();
                        boolean z4 = z3;
                        if (!fr9Var2.j(value3, dsa.a((dsa) value3, 0L, null, 0, false, z4, false, 0, 0.0d, 0.0f, 0.0f, null, 0, null, 0.0f, 32751))) {
                            z3 = z4;
                        }
                    }
                }
                break;
            default:
                boolean z5 = this.b;
                e11.e0(obj);
                fr9 fr9Var3 = ztVar.u;
                if (fr9Var3 != null) {
                    do {
                        value = fr9Var3.getValue();
                    } while (!fr9Var3.j(value, dsa.a((dsa) value, 0L, null, 0, false, false, z5, 0, 0.0d, 0.0f, 0.0f, null, 0, null, 0.0f, 32735)));
                }
                break;
        }
        return hebVar;
    }
}
