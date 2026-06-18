package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class g9b extends o1a implements yb4 {
    public long a;
    public long b;
    public int c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ k9b f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9b(k9b k9bVar, jt1 jt1Var) {
        super(2, jt1Var);
        this.f = k9bVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        g9b g9bVar = new g9b(this.f, jt1Var);
        g9bVar.e = obj;
        return g9bVar;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        return ((g9b) create((vx1) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0060 -> B:17:0x0063). Please report as a decompilation issue!!! */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            k9b r1 = r0.f
            tna r2 = r1.e
            java.lang.Object r3 = r0.e
            vx1 r3 = (defpackage.vx1) r3
            int r4 = r0.d
            r5 = 0
            heb r6 = defpackage.heb.a
            r7 = 2
            r8 = 1
            xx1 r9 = defpackage.xx1.a
            if (r4 == 0) goto L2d
            if (r4 == r8) goto L23
            if (r4 != r7) goto L1d
            defpackage.e11.e0(r20)
            return r6
        L1d:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r0)
            return r5
        L23:
            long r10 = r0.b
            int r4 = r0.c
            long r12 = r0.a
            defpackage.e11.e0(r20)
            goto L63
        L2d:
            defpackage.e11.e0(r20)
            qa1 r4 = defpackage.r95.a
            p95 r4 = r4.k()
            long r10 = r4.c()
            r4 = r8
            r12 = r10
        L3c:
            boolean r10 = defpackage.wx1.k0(r3)
            if (r10 == 0) goto Lb9
            long r10 = (long) r4
            r14 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r14
            long r10 = r10 + r12
            qa1 r14 = defpackage.r95.a
            p95 r14 = r14.k()
            long r14 = r14.c()
            long r10 = r10 - r14
            r0.e = r3
            r0.a = r12
            r0.c = r4
            r0.b = r10
            r0.d = r8
            java.lang.Object r14 = defpackage.tw1.H(r10, r0)
            if (r14 != r9) goto L63
            goto Lb0
        L63:
            long r14 = r1.A
            r16 = -1
            long r14 = r14 + r16
            r1.A = r14
            h8b r8 = r1.i
            fr9 r8 = r8.c
        L6f:
            java.lang.Object r7 = r8.getValue()
            r18 = r7
            g8b r18 = (defpackage.g8b) r18
            r18.getClass()
            g8b r5 = new g8b
            r5.<init>(r14)
            boolean r5 = r8.j(r7, r5)
            if (r5 == 0) goto Lb7
            long r7 = r1.A
            r14 = 0
            int r5 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r5 != 0) goto Lb1
            r3 = r2
            zna r3 = (defpackage.zna) r3
            boolean r3 = r3.r()
            if (r3 == 0) goto L9e
            zna r2 = (defpackage.zna) r2
            long r2 = r2.c()
            r1.A = r2
        L9e:
            r5 = 0
            r0.e = r5
            r0.a = r12
            r0.c = r4
            r0.b = r10
            r7 = 2
            r0.d = r7
            java.lang.Object r0 = r1.j(r0)
            if (r0 != r9) goto Lb9
        Lb0:
            return r9
        Lb1:
            r5 = 0
            r7 = 2
            int r4 = r4 + 1
            r8 = 1
            goto L3c
        Lb7:
            r5 = 0
            goto L6f
        Lb9:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g9b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
