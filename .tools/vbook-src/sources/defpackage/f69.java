package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class f69 extends o1a implements yb4 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ju c;
    public final /* synthetic */ ff8 d;
    public final /* synthetic */ qg8 e;
    public final /* synthetic */ fr9 f;
    public final /* synthetic */ Context s;
    public final /* synthetic */ ni8 t;
    public final /* synthetic */ ava u;
    public final /* synthetic */ zua v;
    public final /* synthetic */ vx1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f69(ju juVar, ff8 ff8Var, qg8 qg8Var, fr9 fr9Var, Context context, ni8 ni8Var, ava avaVar, zua zuaVar, vx1 vx1Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.c = juVar;
        this.d = ff8Var;
        this.e = qg8Var;
        this.f = fr9Var;
        this.s = context;
        this.t = ni8Var;
        this.u = avaVar;
        this.v = zuaVar;
        this.w = vx1Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        f69 f69Var = new f69(this.c, this.d, this.e, this.f, this.s, this.t, this.u, this.v, this.w, jt1Var);
        f69Var.b = obj;
        return f69Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        return ((f69) create((cf8) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        if (r2 == r8) goto L27;
     */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.a
            r1 = 0
            heb r2 = defpackage.heb.a
            qg8 r3 = r11.e
            ff8 r4 = r11.d
            r5 = 2
            fr9 r6 = r11.f
            r7 = 1
            xx1 r8 = defpackage.xx1.a
            if (r0 == 0) goto L23
            if (r0 == r7) goto L1f
            if (r0 != r5) goto L19
            defpackage.e11.e0(r12)
            goto L7b
        L19:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r11)
            return r1
        L1f:
            defpackage.e11.e0(r12)
            goto L5d
        L23:
            defpackage.e11.e0(r12)
            java.lang.Object r12 = r11.b
            cf8 r12 = (cf8) r12
            int r12 = r12.ordinal()
            if (r12 == 0) goto L89
            r0 = 4
            if (r12 == r0) goto L34
            return r2
        L34:
            long r0 = r4.a
            long r9 = r3.a
            int r12 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r12 > 0) goto L48
            java.lang.Object r12 = r6.getValue()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L84
        L48:
            ni8 r12 = r11.t
            l93 r12 = r12.c()
            u93 r12 = (u93) r12
            r11.a = r7
            ju r0 = r11.c
            android.content.Context r1 = r11.s
            java.lang.Object r12 = r0.b(r1, r12, r11)
            if (r12 != r8) goto L5d
            goto L7a
        L5d:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            java.lang.Object r0 = r6.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L84
            if (r12 == 0) goto L84
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            r11.a = r5
            r6.b(r12, r11)
            if (r2 != r8) goto L7b
        L7a:
            return r8
        L7b:
            zua r12 = r11.v
            long r0 = r12.a
            ava r11 = r11.u
            r11.b(r0)
        L84:
            long r11 = r4.a
            r3.a = r11
            return r2
        L89:
            vx1 r11 = r11.w
            defpackage.wx1.K(r11, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f69.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
