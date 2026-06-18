package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class pz4 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ a07 d;
    public final /* synthetic */ a07 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pz4(boolean z, a07 a07Var, a07 a07Var2, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = z;
        this.d = a07Var;
        this.e = a07Var2;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new pz4(this.c, this.d, this.e, jt1Var, 0);
            case 1:
                return new pz4(this.c, this.d, this.e, jt1Var, 1);
            case 2:
                return new pz4(this.c, this.d, this.e, jt1Var, 2);
            case 3:
                return new pz4(this.c, this.d, this.e, jt1Var, 3);
            case 4:
                return new pz4(this.c, this.d, this.e, jt1Var, 4);
            default:
                return new pz4(this.c, this.d, this.e, jt1Var, 5);
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
        return ((pz4) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        xx1 xx1Var = xx1.a;
        boolean z = this.c;
        a07 a07Var = this.d;
        a07 a07Var2 = this.e;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    if (pu1.i0(((rz4) a07Var.getValue()).a, z)) {
                        st5 st5Var = ((rz4) a07Var.getValue()).a;
                        boolean z2 = ((zy4) a07Var2.getValue()).p;
                        this.b = 1;
                        if (pu1.r0(st5Var, z2, z, this) == xx1Var) {
                        }
                    }
                } else if (i2 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            case 1:
                int i3 = this.b;
                if (i3 == 0) {
                    e11.e0(obj);
                    if (pu1.h0(((rz4) a07Var.getValue()).a, z)) {
                        st5 st5Var2 = ((rz4) a07Var.getValue()).a;
                        boolean z3 = ((zy4) a07Var2.getValue()).p;
                        this.b = 1;
                        if (pu1.q0(st5Var2, z3, z, this) == xx1Var) {
                        }
                    }
                } else if (i3 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            case 2:
                int i4 = this.b;
                if (i4 == 0) {
                    e11.e0(obj);
                    if (pu1.h0(((rz4) a07Var.getValue()).a, z)) {
                        st5 st5Var3 = ((rz4) a07Var.getValue()).a;
                        boolean z4 = ((zy4) a07Var2.getValue()).p;
                        this.b = 1;
                        if (pu1.q0(st5Var3, z4, z, this) == xx1Var) {
                        }
                    }
                } else if (i4 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            case 3:
                int i5 = this.b;
                if (i5 == 0) {
                    e11.e0(obj);
                    if (pu1.i0(((rz4) a07Var.getValue()).a, z)) {
                        st5 st5Var4 = ((rz4) a07Var.getValue()).a;
                        boolean z5 = ((zy4) a07Var2.getValue()).p;
                        this.b = 1;
                        if (pu1.r0(st5Var4, z5, z, this) == xx1Var) {
                        }
                    }
                } else if (i5 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            case 4:
                int i6 = this.b;
                if (i6 == 0) {
                    e11.e0(obj);
                    if (((zy4) a07Var.getValue()).n) {
                        if (pu1.h0(((rz4) a07Var2.getValue()).a, z)) {
                            st5 st5Var5 = ((rz4) a07Var2.getValue()).a;
                            boolean z6 = ((zy4) a07Var.getValue()).p;
                            this.b = 1;
                            if (pu1.q0(st5Var5, z6, z, this) != xx1Var) {
                            }
                        }
                    } else if (pu1.i0(((rz4) a07Var2.getValue()).a, z)) {
                        st5 st5Var6 = ((rz4) a07Var2.getValue()).a;
                        boolean z7 = ((zy4) a07Var.getValue()).p;
                        this.b = 2;
                        if (pu1.r0(st5Var6, z7, z, this) != xx1Var) {
                        }
                    }
                } else if (i6 == 1 || i6 == 2) {
                    e11.e0(obj);
                } else {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                }
                break;
            default:
                int i7 = this.b;
                if (i7 == 0) {
                    e11.e0(obj);
                    if (((zy4) a07Var.getValue()).n) {
                        if (pu1.i0(((rz4) a07Var2.getValue()).a, z)) {
                            st5 st5Var7 = ((rz4) a07Var2.getValue()).a;
                            boolean z8 = ((zy4) a07Var.getValue()).p;
                            this.b = 1;
                            if (pu1.r0(st5Var7, z8, z, this) != xx1Var) {
                            }
                        }
                    } else if (pu1.h0(((rz4) a07Var2.getValue()).a, z)) {
                        st5 st5Var8 = ((rz4) a07Var2.getValue()).a;
                        boolean z9 = ((zy4) a07Var.getValue()).p;
                        this.b = 2;
                        if (pu1.q0(st5Var8, z9, z, this) != xx1Var) {
                        }
                    }
                } else if (i7 == 1 || i7 == 2) {
                    e11.e0(obj);
                } else {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                }
                break;
        }
        return xx1Var;
    }
}
