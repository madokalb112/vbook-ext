package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class dp6 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public m8 b;
    public int c;
    public final /* synthetic */ m8 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dp6(m8 m8Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.d = m8Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new dp6(this.d, jt1Var, 0);
            case 1:
                return new dp6(this.d, jt1Var, 1);
            default:
                return new dp6(this.d, jt1Var, 2);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        vx1 vx1Var = (vx1) obj;
        jt1 jt1Var = (jt1) obj2;
        switch (i) {
        }
        return ((dp6) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        m8 m8Var = this.d;
        xx1 xx1Var = xx1.a;
        switch (i) {
            case 0:
                int i2 = this.c;
                if (i2 == 0) {
                    e11.e0(obj);
                    pv9 pv9Var = (pv9) eu9.j0.getValue();
                    this.b = m8Var;
                    this.c = 1;
                    obj = wn9.y(pv9Var, this);
                    if (obj == xx1Var) {
                    }
                } else if (i2 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m8Var = this.b;
                    e11.e0(obj);
                }
                m8.b(m8Var, (String) obj);
                break;
            case 1:
                int i3 = this.c;
                if (i3 == 0) {
                    e11.e0(obj);
                    pv9 pv9Var2 = (pv9) zt9.r0.getValue();
                    this.b = m8Var;
                    this.c = 1;
                    obj = wn9.y(pv9Var2, this);
                    if (obj == xx1Var) {
                    }
                } else if (i3 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m8Var = this.b;
                    e11.e0(obj);
                }
                m8.c(m8Var, (String) obj);
                break;
            default:
                int i4 = this.c;
                if (i4 == 0) {
                    e11.e0(obj);
                    pv9 pv9Var3 = (pv9) ru9.t.getValue();
                    this.b = m8Var;
                    this.c = 1;
                    obj = wn9.y(pv9Var3, this);
                    if (obj == xx1Var) {
                    }
                } else if (i4 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m8Var = this.b;
                    e11.e0(obj);
                }
                m8.a(m8Var, (String) obj);
                break;
        }
        return hebVar;
    }
}
