package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class z27 extends o1a implements yb4 {
    public int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ iz8 d;
    public final /* synthetic */ mu8 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z27(float f, float f2, iz8 iz8Var, mu8 mu8Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.b = f;
        this.c = f2;
        this.d = iz8Var;
        this.e = mu8Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        return new z27(this.b, this.c, this.d, this.e, jt1Var);
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        return ((z27) create((vx1) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0070 A[RETURN] */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.a
            r1 = 0
            heb r2 = defpackage.heb.a
            iz8 r3 = r9.d
            float r4 = r9.c
            float r5 = r9.b
            r6 = 2
            r7 = 1
            xx1 r8 = defpackage.xx1.a
            if (r0 == 0) goto L23
            if (r0 == r7) goto L1f
            if (r0 != r6) goto L19
            defpackage.e11.e0(r10)
            return r2
        L19:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r9)
            return r1
        L1f:
            defpackage.e11.e0(r10)
            goto L3a
        L23:
            defpackage.e11.e0(r10)
            int r10 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r10 != 0) goto L2b
            goto L3a
        L2b:
            r9.a = r7
            cn7 r10 = r3.b
            java.lang.Object r10 = r10.getValue()
            java.lang.Object r10 = r3.P(r5, r10, r9)
            if (r10 != r8) goto L3a
            goto L70
        L3a:
            int r10 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r10 != 0) goto L71
            r9.a = r6
            p3b r10 = r3.e
            if (r10 != 0) goto L46
        L44:
            r9 = r2
            goto L6e
        L46:
            cn7 r0 = r3.c
            java.lang.Object r0 = r0.getValue()
            mu8 r4 = r9.e
            boolean r0 = defpackage.lc5.Q(r0, r4)
            if (r0 == 0) goto L61
            cn7 r0 = r3.b
            java.lang.Object r0 = r0.getValue()
            boolean r0 = defpackage.lc5.Q(r0, r4)
            if (r0 == 0) goto L61
            goto L44
        L61:
            q07 r0 = r3.x
            cz8 r5 = new cz8
            r5.<init>(r3, r4, r10, r1)
            java.lang.Object r9 = defpackage.q07.a(r0, r5, r9)
            if (r9 != r8) goto L44
        L6e:
            if (r9 != r8) goto L71
        L70:
            return r8
        L71:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z27.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
