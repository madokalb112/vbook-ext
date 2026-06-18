package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class m12 extends o1a implements yb4 {
    public final /* synthetic */ int a = 1;
    public int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public Object e;
    public Object f;
    public Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m12(boolean z, boolean z2, otb otbVar, kf8 kf8Var, kf8 kf8Var2, a07 a07Var, a07 a07Var2, jt1 jt1Var) {
        super(2, jt1Var);
        this.c = z;
        this.d = z2;
        this.e = otbVar;
        this.f = kf8Var;
        this.s = kf8Var2;
        this.t = a07Var;
        this.u = a07Var2;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.u;
        Object obj3 = this.t;
        switch (i) {
            case 0:
                return new m12(this.c, this.d, (otb) this.e, (kf8) this.f, (kf8) this.s, (a07) obj3, (a07) obj2, jt1Var);
            default:
                return new m12((hra) obj3, this.c, this.d, (String) obj2, jt1Var);
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
        return ((m12) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0253  */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 846
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m12.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m12(hra hraVar, boolean z, boolean z2, String str, jt1 jt1Var) {
        super(2, jt1Var);
        this.t = hraVar;
        this.c = z;
        this.d = z2;
        this.u = str;
    }
}
