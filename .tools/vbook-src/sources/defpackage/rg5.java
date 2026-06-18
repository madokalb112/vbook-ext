package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class rg5 extends om8 implements zb4 {
    public int b;
    public /* synthetic */ je2 c;
    public final /* synthetic */ tg5 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rg5(tg5 tg5Var, jt1 jt1Var) {
        super(3, jt1Var);
        this.d = tg5Var;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        rg5 rg5Var = new rg5(this.d, (jt1) obj3);
        rg5Var.c = (je2) obj;
        return rg5Var.invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        tg5 tg5Var = this.d;
        l1 l1Var = (l1) tg5Var.d;
        je2 je2Var = this.c;
        int i = this.b;
        if (i == 0) {
            e11.e0(obj);
            byte bX = l1Var.x();
            if (bX == 1) {
                return tg5Var.d(true);
            }
            if (bX == 0) {
                return tg5Var.d(false);
            }
            if (bX != 6) {
                if (bX == 8) {
                    return tg5Var.c();
                }
                l1.s(l1Var, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.c = null;
            this.b = 1;
            obj = tg5.a(tg5Var, je2Var, this);
            xx1 xx1Var = xx1.a;
            if (obj == xx1Var) {
                return xx1Var;
            }
        } else {
            if (i != 1) {
                gp.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            e11.e0(obj);
        }
        return (mf5) obj;
    }
}
