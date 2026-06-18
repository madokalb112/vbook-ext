package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class b5b extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ n5b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b5b(n5b n5bVar, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = n5bVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        n5b n5bVar = this.c;
        switch (i) {
            case 0:
                return new b5b(n5bVar, jt1Var, 0);
            case 1:
                return new b5b(n5bVar, jt1Var, 1);
            case 2:
                return new b5b(n5bVar, jt1Var, 2);
            case 3:
                return new b5b(n5bVar, jt1Var, 3);
            default:
                return new b5b(n5bVar, jt1Var, 4);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.a;
        heb hebVar = heb.a;
        vx1 vx1Var = (vx1) obj;
        jt1 jt1Var = (jt1) obj2;
        switch (i) {
            case 0:
                return ((b5b) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
            case 1:
                return ((b5b) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
            case 2:
                return ((b5b) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
            case 3:
                return ((b5b) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
            default:
                ((b5b) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                return xx1.a;
        }
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = 0;
        int i3 = 5;
        n5b n5bVar = this.c;
        xx1 xx1Var = xx1.a;
        jt1 jt1Var = null;
        int i4 = 1;
        int i5 = 2;
        switch (i) {
            case 0:
                int i6 = this.b;
                if (i6 == 0) {
                    e11.e0(obj);
                    u31 u31Var = new u31(n5bVar.z, 2);
                    u31 u31Var2 = new u31(n5bVar.x, 2);
                    j4b j4bVar = (j4b) n5bVar.c;
                    tg3 tg3VarI = cx1.I(u31Var, u31Var2, cx1.H(new u31(j4bVar.g, 2), new u31(j4bVar.h, 2), new u31(j4bVar.i, 2), new u31(j4bVar.j, 2), new h4b(i3, i4, jt1Var)), new a5b(n5bVar, null));
                    this.b = 1;
                    if (cx1.F(tg3VarI, this) == xx1Var) {
                    }
                } else if (i6 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            case 1:
                int i7 = this.b;
                if (i7 == 0) {
                    e11.e0(obj);
                    fr9 fr9Var = n5bVar.f;
                    u31 u31Var3 = new u31(n5bVar.z, 2);
                    u31 u31Var4 = new u31(n5bVar.A, 2);
                    u31 u31Var5 = new u31(n5bVar.B, 2);
                    u31 u31Var6 = new u31(n5bVar.C, 2);
                    c5b c5bVar = new c5b(n5bVar, null);
                    this.b = 1;
                    Object objM0 = h67.m0(this, s77.a, r90.d, new xa(jt1Var, (Object) c5bVar, 12), new b24[]{fr9Var, u31Var3, u31Var4, u31Var5, u31Var6});
                    if (objM0 != xx1Var) {
                        objM0 = hebVar;
                    }
                    if (objM0 != xx1Var) {
                        objM0 = hebVar;
                    }
                    if (objM0 == xx1Var) {
                    }
                } else if (i7 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            case 2:
                f4b f4bVar = n5bVar.c;
                int i8 = this.b;
                if (i8 == 0) {
                    e11.e0(obj);
                    j4b j4bVar2 = (j4b) f4bVar;
                    b24 b24VarL = cx1.L(cx1.H(((j4b) f4bVar).c(), new u31(((j4b) f4bVar).f, 2), new u31(n5bVar.x, 2), cx1.H(new u31(j4bVar2.g, 2), new u31(j4bVar2.h, 2), new u31(j4bVar2.i, 2), new u31(j4bVar2.j, 2), new h4b(i3, i4, jt1Var)), new d5b(n5bVar, null)));
                    f5b f5bVar = new f5b(n5bVar, 0);
                    this.b = 1;
                    if (b24VarL.a(f5bVar, this) == xx1Var) {
                    }
                } else if (i8 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            case 3:
                int i9 = this.b;
                if (i9 == 0) {
                    e11.e0(obj);
                    b24 b24VarL2 = cx1.L(new h5b(new b24[]{new u31(n5bVar.z, 2), new u31(n5bVar.A, 2), new u31(n5bVar.y, 2), new u31(n5bVar.B, 2), new u31(n5bVar.C, 2)}, i2));
                    f5b f5bVar2 = new f5b(n5bVar, i4);
                    this.b = 1;
                    if (b24VarL2.a(f5bVar2, this) == xx1Var) {
                    }
                } else if (i9 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            default:
                int i10 = this.b;
                if (i10 == 0) {
                    e11.e0(obj);
                    fr9 fr9Var2 = n5bVar.E;
                    f5b f5bVar3 = new f5b(n5bVar, i5);
                    this.b = 1;
                    fr9Var2.a(f5bVar3, this);
                } else if (i10 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                    if2.c();
                }
                break;
        }
        return xx1Var;
    }
}
