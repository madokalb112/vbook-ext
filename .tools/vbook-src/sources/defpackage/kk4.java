package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class kk4 extends o1a implements kb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ yk4 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kk4(yk4 yk4Var, jt1 jt1Var, int i) {
        super(1, jt1Var);
        this.a = i;
        this.c = yk4Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(jt1 jt1Var) {
        int i = this.a;
        yk4 yk4Var = this.c;
        switch (i) {
            case 0:
                return new kk4(yk4Var, jt1Var, 0);
            default:
                return new kk4(yk4Var, jt1Var, 1);
        }
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        jt1 jt1Var = (jt1) obj;
        switch (i) {
        }
        return ((kk4) create(jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        bi1 bi1Var;
        jk4 jk4Var;
        switch (this.a) {
            case 0:
                xx1 xx1Var = xx1.a;
                int i = this.b;
                if (i == 0) {
                    e11.e0(obj);
                    yk4 yk4Var = this.c;
                    synchronized (yk4Var.h) {
                        bi1Var = yk4Var.f;
                    }
                    if (bi1Var == null) {
                        return null;
                    }
                    this.b = 1;
                    if (bi1Var.o(this) == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return heb.a;
            default:
                xx1 xx1Var2 = xx1.a;
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    yk4 yk4Var2 = this.c;
                    synchronized (yk4Var2.h) {
                        jk4Var = yk4Var2.g;
                    }
                    if (jk4Var == null) {
                        return null;
                    }
                    bi1 bi1Var2 = jk4Var.b;
                    this.b = 1;
                    if (bi1Var2.o(this) == xx1Var2) {
                        return xx1Var2;
                    }
                } else {
                    if (i2 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return heb.a;
        }
    }
}
