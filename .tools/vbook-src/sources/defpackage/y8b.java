package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class y8b extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ k9b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y8b(k9b k9bVar, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = k9bVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        k9b k9bVar = this.c;
        switch (i) {
            case 0:
                return new y8b(k9bVar, jt1Var, 0);
            case 1:
                return new y8b(k9bVar, jt1Var, 1);
            case 2:
                return new y8b(k9bVar, jt1Var, 2);
            case 3:
                return new y8b(k9bVar, jt1Var, 3);
            default:
                return new y8b(k9bVar, jt1Var, 4);
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
        return ((y8b) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        k9b k9bVar = this.c;
        xx1 xx1Var = xx1.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    p8b p8bVar = k9bVar.m;
                    this.b = 1;
                    if (p8bVar.f(this) != xx1Var) {
                    }
                } else if (i2 == 1) {
                    e11.e0(obj);
                } else if (i2 != 2) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                int i3 = k9bVar.u + 1;
                this.b = 2;
                if (k9bVar.q(i3, 0, this) != xx1Var) {
                }
                break;
            case 1:
                int i4 = this.b;
                if (i4 == 0) {
                    e11.e0(obj);
                    p8b p8bVar2 = k9bVar.m;
                    this.b = 1;
                    if (p8bVar2.f(this) != xx1Var) {
                    }
                } else if (i4 == 1) {
                    e11.e0(obj);
                } else if (i4 != 2) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                int i5 = k9bVar.u - 1;
                this.b = 2;
                if (k9bVar.q(i5, 0, this) != xx1Var) {
                }
                break;
            case 2:
                int i6 = this.b;
                if (i6 == 0) {
                    e11.e0(obj);
                    p8b p8bVar3 = k9bVar.m;
                    this.b = 1;
                    obj = p8bVar3.d(this);
                    if (obj == xx1Var) {
                    }
                } else if (i6 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    k9bVar.z = ah1.J(k9bVar.k, null, null, new g9b(k9bVar, null), 3);
                }
                break;
            case 3:
                int i7 = this.b;
                if (i7 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    if (k9bVar.i(this) == xx1Var) {
                    }
                } else if (i7 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            default:
                int i8 = this.b;
                if (i8 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    if (k9bVar.d(this) == xx1Var) {
                    }
                } else if (i8 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
        }
        return xx1Var;
    }
}
