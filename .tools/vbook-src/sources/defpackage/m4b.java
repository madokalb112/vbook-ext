package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class m4b extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s4b b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m4b(s4b s4bVar, String str, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.b = s4bVar;
        this.c = str;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        String str = this.c;
        s4b s4bVar = this.b;
        switch (i) {
            case 0:
                return new m4b(s4bVar, str, jt1Var, 0);
            default:
                return new m4b(s4bVar, str, jt1Var, 1);
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
                ((m4b) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            default:
                ((m4b) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
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
        String str = this.c;
        s4b s4bVar = this.b;
        switch (i) {
            case 0:
                e11.e0(obj);
                s4bVar.x = str;
                fr9 fr9Var = s4bVar.t;
                if (fr9Var != null) {
                    do {
                        value = fr9Var.getValue();
                    } while (!fr9Var.j(value, k4b.b((k4b) value, null, s4bVar.x, null, false, 0, null, null, null, 2043)));
                }
                break;
            default:
                e11.e0(obj);
                s4bVar.y = str;
                fr9 fr9Var2 = s4bVar.t;
                if (fr9Var2 != null) {
                    do {
                        value2 = fr9Var2.getValue();
                    } while (!fr9Var2.j(value2, k4b.b((k4b) value2, null, null, s4bVar.y, false, 0, null, null, null, 2039)));
                }
                break;
        }
        return hebVar;
    }
}
