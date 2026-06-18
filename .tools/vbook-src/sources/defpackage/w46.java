package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class w46 extends o1a implements zb4 {
    public Throwable a;
    public os4 b;
    public int c;
    public /* synthetic */ xe8 d;
    public /* synthetic */ ks4 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ y36 s;
    public final /* synthetic */ i46 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w46(boolean z, y36 y36Var, i46 i46Var, jt1 jt1Var) {
        super(3, jt1Var);
        this.f = z;
        this.s = y36Var;
        this.t = i46Var;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        y36 y36Var = this.s;
        i46 i46Var = this.t;
        w46 w46Var = new w46(this.f, y36Var, i46Var, (jt1) obj3);
        w46Var.d = (xe8) obj;
        w46Var.e = (ks4) obj2;
        return w46Var.invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) throws Throwable {
        os4 os4Var;
        xe8 xe8Var = this.d;
        ks4 ks4Var = this.e;
        int i = this.c;
        y36 y36Var = this.s;
        heb hebVar = heb.a;
        xx1 xx1Var = xx1.a;
        try {
        } catch (Throwable th) {
            th = th;
            StringBuilder sb = new StringBuilder();
            os4 os4Var2 = (os4) ks4Var.getAttributes().e(d56.a);
            if (os4Var2 == null) {
                os4Var2 = new os4(this.t);
                os4Var2.a();
            }
            d56.h(y36Var, sb, ks4Var.c(), th);
            String string = sb.toString();
            this.d = null;
            this.e = null;
            this.a = th;
            this.b = os4Var2;
            this.c = 2;
            if (os4Var2.e(string, this) != xx1Var) {
                os4Var = os4Var2;
            }
        }
        if (i == 0) {
            e11.e0(obj);
            if (this.f || y36Var == y36.NONE || ks4Var.getAttributes().b(d56.b)) {
                return hebVar;
            }
            this.d = null;
            this.e = ks4Var;
            this.c = 1;
            obj = xe8Var.a.c(this);
            if (obj == xx1Var) {
                return xx1Var;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Throwable th2 = this.a;
                    e11.e0(obj);
                    throw th2;
                }
                os4Var = this.b;
                Throwable th3 = this.a;
                e11.e0(obj);
                th = th3;
                this.d = null;
                this.e = null;
                this.a = th;
                this.b = null;
                this.c = 3;
                if (os4Var.b(this) != xx1Var) {
                    throw th;
                }
                return xx1Var;
            }
            e11.e0(obj);
        }
        return hebVar;
    }
}
