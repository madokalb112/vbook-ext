package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class yw extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object s;
    public Object t;
    public Object u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw(ff8 ff8Var, ju juVar, fr9 fr9Var, Context context, ni8 ni8Var, ava avaVar, zua zuaVar, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 3;
        this.d = ff8Var;
        this.e = juVar;
        this.f = fr9Var;
        this.s = context;
        this.t = ni8Var;
        this.u = avaVar;
        this.v = zuaVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.v;
        switch (i) {
            case 0:
                yw ywVar = new yw((c85) this.f, (String) this.t, (kb4) obj2, jt1Var);
                ywVar.c = obj;
                return ywVar;
            case 1:
                yw ywVar2 = new yw((bi5) this.t, (a07) this.u, (a07) obj2, jt1Var);
                ywVar2.c = obj;
                return ywVar2;
            case 2:
                return new yw((m59) this.c, (i59) obj2, jt1Var, 2);
            case 3:
                yw ywVar3 = new yw((ff8) this.d, (ju) this.e, (fr9) this.f, (Context) this.s, (ni8) this.t, (ava) this.u, (zua) obj2, jt1Var);
                ywVar3.c = obj;
                return ywVar3;
            case 4:
                return new yw((tb9) this.c, (b15) obj2, jt1Var, 4);
            default:
                return new yw((hra) this.f, (String) this.u, (String) this.c, (String) obj2, jt1Var);
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
        return ((yw) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a4, code lost:
    
        if (r4 == r8) goto L140;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01b5 A[LOOP:3: B:105:0x01b5->B:337:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0273 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:356:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0194  */
    /* JADX WARN: Type inference failed for: r2v7, types: [kb4] */
    /* JADX WARN: Type inference failed for: r2v80 */
    /* JADX WARN: Type inference failed for: r2v81 */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 1884
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yw.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw(bi5 bi5Var, a07 a07Var, a07 a07Var2, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 1;
        this.t = bi5Var;
        this.u = a07Var;
        this.v = a07Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw(c85 c85Var, String str, kb4 kb4Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 0;
        this.f = c85Var;
        this.t = str;
        this.v = kb4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw(hra hraVar, String str, String str2, String str3, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 5;
        this.f = hraVar;
        this.u = str;
        this.c = str2;
        this.v = str3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yw(Object obj, Object obj2, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = obj;
        this.v = obj2;
    }
}
