package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class jw1 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ zx7 c;
    public final /* synthetic */ tda d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jw1(zx7 zx7Var, tda tdaVar, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = zx7Var;
        this.d = tdaVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new jw1(this.c, this.d, jt1Var, 0);
            case 1:
                return new jw1(this.c, this.d, jt1Var, 1);
            default:
                return new jw1(this.c, this.d, jt1Var, 2);
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
        return ((jw1) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        zx7 zx7Var = this.c;
        final tda tdaVar = this.d;
        xx1 xx1Var = xx1.a;
        heb hebVar = heb.a;
        final int i2 = 1;
        switch (i) {
            case 0:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    this.b = 1;
                    if (yn2.x(zx7Var, tdaVar, this) == xx1Var) {
                    }
                }
                break;
            case 1:
                int i4 = this.b;
                if (i4 != 0) {
                    if (i4 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    this.b = 1;
                    Object objK = vv1.k(zx7Var, new d(tdaVar, null, 3), this);
                    if (objK != xx1Var) {
                        objK = hebVar;
                    }
                    if (objK == xx1Var) {
                    }
                }
                break;
            default:
                int i5 = this.b;
                if (i5 != 0) {
                    if (i5 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    this.b = 1;
                    final int i6 = 0;
                    Object objH = m33.h(this.c, new z56(tdaVar, 0), new ib4() { // from class: a66
                        @Override // defpackage.ib4
                        public final Object invoke() {
                            int i7 = i6;
                            heb hebVar2 = heb.a;
                            tda tdaVar2 = tdaVar;
                            switch (i7) {
                                case 0:
                                    tdaVar2.b();
                                    break;
                                default:
                                    tdaVar2.onCancel();
                                    break;
                            }
                            return hebVar2;
                        }
                    }, new ib4() { // from class: a66
                        @Override // defpackage.ib4
                        public final Object invoke() {
                            int i7 = i2;
                            heb hebVar2 = heb.a;
                            tda tdaVar2 = tdaVar;
                            switch (i7) {
                                case 0:
                                    tdaVar2.b();
                                    break;
                                default:
                                    tdaVar2.onCancel();
                                    break;
                            }
                            return hebVar2;
                        }
                    }, new ah(tdaVar, 23), this);
                    if (objH != xx1Var) {
                        objH = hebVar;
                    }
                    if (objH == xx1Var) {
                    }
                }
                break;
        }
        return hebVar;
    }
}
