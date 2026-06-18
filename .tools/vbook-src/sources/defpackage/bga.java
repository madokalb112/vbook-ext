package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class bga extends o1a implements zb4 {
    public int a;
    public /* synthetic */ a28 b;
    public /* synthetic */ long c;
    public final /* synthetic */ vx1 d;
    public final /* synthetic */ a07 e;
    public final /* synthetic */ yy6 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bga(vx1 vx1Var, a07 a07Var, yy6 yy6Var, jt1 jt1Var) {
        super(3, jt1Var);
        this.d = vx1Var;
        this.e = a07Var;
        this.f = yy6Var;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        long j = ((eb7) obj2).a;
        a07 a07Var = this.e;
        yy6 yy6Var = this.f;
        bga bgaVar = new bga(this.d, a07Var, yy6Var, (jt1) obj3);
        bgaVar.b = (a28) obj;
        bgaVar.c = j;
        return bgaVar.invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        vx1 vx1Var = this.d;
        jt1 jt1Var = null;
        if (i == 0) {
            e11.e0(obj);
            a28 a28Var = this.b;
            ah1.J(vx1Var, null, null, new z(this.e, this.c, this.f, (jt1) null, 9), 3);
            this.a = 1;
            obj = a28Var.e(this);
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
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ah1.J(vx1Var, null, null, new vl2(6, jt1Var, this.e, this.f, zBooleanValue), 3);
        return heb.a;
    }
}
