package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class jp4 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jp4(Object obj, float f, float f2, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.e = obj;
        this.c = f;
        this.d = f2;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                return new jp4((kp4) obj2, this.c, this.d, jt1Var, 0);
            case 1:
                return new jp4((ix8) obj2, this.c, this.d, jt1Var, 1);
            default:
                return new jp4((df9) obj2, this.c, this.d, jt1Var, 2);
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
        return ((jp4) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        float f = this.d;
        float f2 = this.c;
        xx1 xx1Var = xx1.a;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                kp4 kp4Var = (kp4) obj2;
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    kp4Var.o = f2;
                    kp4Var.p = f;
                    tc tcVar = kp4Var.h;
                    if (tcVar != null) {
                        tcVar.a = null;
                    }
                    tc tcVar2 = kp4Var.i;
                    if (tcVar2 != null) {
                        tcVar2.a = null;
                    }
                    tc tcVar3 = kp4Var.j;
                    if (tcVar3 != null) {
                        tcVar3.a = null;
                    }
                    kp4Var.h = null;
                    kp4Var.i = null;
                    kp4Var.j = null;
                    kp4Var.c = -1.0f;
                    kp4Var.d = -1.0f;
                    kp4Var.n(f2);
                    kp4Var.o(f);
                    this.b = 1;
                    if (kp4Var.a(this) == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i2 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                kp4Var.u = true;
                return hebVar;
            case 1:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        e11.e0(obj);
                        return hebVar;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                gy8 gy8Var = ((ix8) obj2).Z;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
                this.b = 1;
                return dx8.a(gy8Var, jFloatToRawIntBits, this) == xx1Var ? xx1Var : hebVar;
            default:
                df9 df9Var = (df9) obj2;
                int i4 = this.b;
                if (i4 == 0) {
                    e11.e0(obj);
                    df9Var.o = f2;
                    df9Var.p = f;
                    tc tcVar4 = df9Var.h;
                    if (tcVar4 != null) {
                        tcVar4.a = null;
                    }
                    tc tcVar5 = df9Var.i;
                    if (tcVar5 != null) {
                        tcVar5.a = null;
                    }
                    tc tcVar6 = df9Var.j;
                    if (tcVar6 != null) {
                        tcVar6.a = null;
                    }
                    df9Var.h = null;
                    df9Var.i = null;
                    df9Var.j = null;
                    df9Var.c = -1.0f;
                    df9Var.d = -1.0f;
                    this.b = 1;
                    if (df9Var.a(this) == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i4 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                df9Var.u = true;
                return hebVar;
        }
    }
}
