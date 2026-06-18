package defpackage;

import android.view.View;
import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qoa extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qoa(pp1 pp1Var, Object obj, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 23;
        this.d = pp1Var;
        this.c = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ac A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.d
            h49 r0 = (defpackage.h49) r0
            java.lang.String r1 = r0.c
            pqb r2 = r0.f
            int r3 = r11.b
            heb r4 = defpackage.heb.a
            r5 = 2
            r6 = 1
            r7 = 0
            r8 = 3
            xx1 r9 = defpackage.xx1.a
            if (r3 == 0) goto L31
            if (r3 == r6) goto L2d
            if (r3 == r5) goto L25
            if (r3 != r8) goto L1f
            defpackage.e11.e0(r12)
            goto Lac
        L1f:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r11)
            return r7
        L25:
            java.lang.Object r1 = r11.c
            b24 r1 = (defpackage.b24) r1
            defpackage.e11.e0(r12)
            goto L80
        L2d:
            defpackage.e11.e0(r12)
            goto L58
        L31:
            defpackage.e11.e0(r12)
            r11.b = r6
            r12 = r2
            tqb r12 = (defpackage.tqb) r12
            m62 r12 = r12.a
            b92 r12 = r12.f
            g82 r12 = r12.Y(r1)
            pp1 r12 = defpackage.qx1.R(r12)
            aj2 r3 = defpackage.rw2.a
            nh2 r3 = defpackage.nh2.c
            y34 r12 = defpackage.qx1.E(r12, r3)
            kb3 r3 = new kb3
            r10 = 28
            r3.<init>(r12, r10)
            if (r3 != r9) goto L57
            goto Lab
        L57:
            r12 = r3
        L58:
            b24 r12 = (defpackage.b24) r12
            r11.c = r12
            r11.b = r5
            tqb r2 = (defpackage.tqb) r2
            m62 r2 = r2.a
            b92 r2 = r2.J
            wc2 r1 = r2.d0(r1)
            pp1 r1 = defpackage.qx1.R(r1)
            aj2 r2 = defpackage.rw2.a
            nh2 r2 = defpackage.nh2.c
            y34 r1 = defpackage.qx1.E(r1, r2)
            kb3 r2 = new kb3
            r3 = 29
            r2.<init>(r1, r3)
            if (r2 != r9) goto L7e
            goto Lab
        L7e:
            r1 = r12
            r12 = r2
        L80:
            b24 r12 = (defpackage.b24) r12
            f45 r2 = new f45
            r3 = 7
            r2.<init>(r8, r3, r7)
            gsb r3 = new gsb
            r3.<init>(r0, r5)
            r11.c = r7
            r11.b = r8
            b24[] r0 = new defpackage.b24[r5]
            r5 = 0
            r0[r5] = r1
            r0[r6] = r12
            r90 r12 = defpackage.r90.d
            xa r1 = new xa
            r5 = 13
            r1.<init>(r2, r7, r5)
            java.lang.Object r11 = defpackage.h67.m0(r11, r3, r12, r1, r0)
            if (r11 != r9) goto La8
            goto La9
        La8:
            r11 = r4
        La9:
            if (r11 != r9) goto Lac
        Lab:
            return r9
        Lac:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qoa.m(java.lang.Object):java.lang.Object");
    }

    private final Object n(Object obj) {
        km1 km1Var = (ff8) this.c;
        View view = (View) this.d;
        int i = this.b;
        heb hebVar = heb.a;
        jt1 jt1Var = null;
        try {
            if (i == 0) {
                e11.e0(obj);
                this.b = 1;
                Object objO = cx1.O(((ff8) km1Var).v, new ei0(2, 6, jt1Var), this);
                xx1 xx1Var = xx1.a;
                if (objO != xx1Var) {
                    objO = hebVar;
                }
                if (objO == xx1Var) {
                    return xx1Var;
                }
            } else {
                if (i != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
            }
            if (j0c.a(view) == km1Var) {
                view.setTag(2131361873, null);
            }
            return hebVar;
        } finally {
            if (j0c.a(view) == km1Var) {
                view.setTag(2131361873, null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0027 A[Catch: all -> 0x0014, TRY_LEAVE, TryCatch #0 {all -> 0x0014, blocks: (B:5:0x0010, B:19:0x003a, B:13:0x0021, B:15:0x0027, B:21:0x0040, B:12:0x001f), top: B:27:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040 A[Catch: all -> 0x0014, TRY_LEAVE, TryCatch #0 {all -> 0x0014, blocks: (B:5:0x0010, B:19:0x003a, B:13:0x0021, B:15:0x0027, B:21:0x0040, B:12:0x001f), top: B:27:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0037 -> B:19:0x003a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object o(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.d
            l3c r0 = (defpackage.l3c) r0
            java.lang.Object r1 = r5.c
            yf2 r1 = (defpackage.yf2) r1
            int r2 = r5.b
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L1c
            if (r2 != r4) goto L16
            defpackage.e11.e0(r6)     // Catch: java.lang.Throwable -> L14
            goto L3a
        L14:
            r5 = move-exception
            goto L49
        L16:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r5)
            return r3
        L1c:
            defpackage.e11.e0(r6)
            r0.d = r1     // Catch: java.lang.Throwable -> L14
        L21:
            boolean r6 = defpackage.wx1.k0(r1)     // Catch: java.lang.Throwable -> L14
            if (r6 == 0) goto L44
            dl2 r6 = r1.a     // Catch: java.lang.Throwable -> L14
            h11 r6 = r6.A()     // Catch: java.lang.Throwable -> L14
            r5.c = r1     // Catch: java.lang.Throwable -> L14
            r5.b = r4     // Catch: java.lang.Throwable -> L14
            java.lang.Object r6 = r6.j(r5)     // Catch: java.lang.Throwable -> L14
            xx1 r2 = defpackage.xx1.a
            if (r6 != r2) goto L3a
            return r2
        L3a:
            na4 r6 = (defpackage.na4) r6     // Catch: java.lang.Throwable -> L14
            bi1 r2 = r0.c     // Catch: java.lang.Throwable -> L14
            if (r2 == 0) goto L21
            r2.Q(r6)     // Catch: java.lang.Throwable -> L14
            goto L21
        L44:
            r0.d = r3
            heb r5 = defpackage.heb.a
            return r5
        L49:
            r0.d = r3
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qoa.o(java.lang.Object):java.lang.Object");
    }

    private final Object p(Object obj) {
        h5c h5cVar;
        Object value;
        Object value2;
        h5c h5cVar2 = (h5c) this.d;
        fr9 fr9Var = h5cVar2.U0;
        f4b f4bVar = h5cVar2.R0;
        int i = this.b;
        if (i == 0) {
            e11.e0(obj);
            wp3 wp3VarG = ((uw5) h5cVar2.Q0).g(h5cVar2.P0);
            this.c = h5cVar2;
            this.b = 1;
            obj = cx1.N(wp3VarG, this);
            xx1 xx1Var = xx1.a;
            if (obj == xx1Var) {
                return xx1Var;
            }
            h5cVar = h5cVar2;
        } else {
            if (i != 1) {
                gp.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            h5cVar = (h5c) this.c;
            e11.e0(obj);
        }
        obj.getClass();
        h5cVar.X = (zv5) obj;
        mka mkaVar = h5cVar2.T0;
        nka nkaVar = (nka) mkaVar;
        h5cVar2.Y = nkaVar.a(h5cVar2.i0().f, h5cVar2.i0().a);
        if (fr9Var != null) {
            do {
                value2 = fr9Var.getValue();
            } while (!fr9Var.j(value2, g5c.a((g5c) value2, false, false, false, false, ((j4b) f4bVar).e(h5cVar2.i0().b, h5cVar2.i0().a, h5cVar2.i0().m), null, null, 239)));
        }
        if (h5cVar2.i0().u != 0) {
            h5cVar2.F0();
        } else if (fr9Var != null) {
            do {
                value = fr9Var.getValue();
            } while (!fr9Var.j(value, g5c.a((g5c) value, false, false, false, false, ((j4b) f4bVar).e(h5cVar2.i0().b, h5cVar2.i0().a, h5cVar2.i0().m), ((j4b) f4bVar).e(h5cVar2.i0().c, h5cVar2.i0().a, h5cVar2.i0().m), h5cVar2.i0().h, Token.WITH)));
        }
        return heb.a;
    }

    private final Object q(Object obj) {
        long jU;
        final q6c q6cVar = (q6c) this.c;
        int i = this.b;
        if (i == 0) {
            e11.e0(obj);
            long j = q6cVar.d;
            oa5 oa5Var = new oa5(j);
            if (!rw1.P(j)) {
                oa5Var = null;
            }
            if (oa5Var == null) {
                return Boolean.FALSE;
            }
            long j2 = oa5Var.a;
            long j3 = q6cVar.e;
            oa5 oa5Var2 = rw1.P(j3) ? new oa5(j3) : null;
            if (oa5Var2 == null) {
                return Boolean.FALSE;
            }
            long j4 = oa5Var2.a;
            final float fB = eu8.b(q6cVar.s.a);
            z2b z2bVar = q6cVar.q;
            final z2b z2bVar2 = q6cVar.r;
            final long j5 = z2bVar2.b;
            long j6 = z2bVar2.a;
            float fB2 = eu8.b(j6);
            final lf8 lf8Var = q6cVar.D;
            final float f = q6cVar.t;
            final float f2 = q6cVar.v;
            float fP = tw1.P(new Integer(2).intValue(), fB);
            boolean z = fP >= tw1.P(2, f) && fP <= tw1.P(2, f2);
            lf8Var.getClass();
            boolean z2 = fb7.b(j5) - lf8Var.a >= -1.0f && fb7.b(j5) - lf8Var.c < 1.0f && fb7.c(j5) - lf8Var.b >= -1.0f && fb7.c(j5) - lf8Var.d < 1.0f;
            if (z && z2) {
                return Boolean.FALSE;
            }
            Object obj2 = this.d;
            fb7 fb7Var = (fb7) obj2;
            if (fb7Var != null) {
                jU = fb7Var.a;
            } else {
                long jM0 = rw1.m0(j2);
                jU = pu1.u(og9.b(jM0) / 2.0f, og9.a(jM0) / 2.0f);
            }
            long jI = q6cVar.i(jU);
            float fD = q6cVar.d(wx1.P(fB, f, f2) / eu8.b(z2bVar.a), false);
            final z2b z2bVarA = z2b.a(z2bVar2, fu8.a(fD, fD), q6cVar.c(fD, ri9.o(eu8.b(j6), z2bVar2.b, fD, ri9.r(j2, j4, q6cVar.g, q6cVar.h, q6cVar.i, 0, fB2, j5, jI), fb7.b)), 0L, 28);
            l46 l46Var = q6cVar.a;
            final fb7 fb7Var2 = (fb7) obj2;
            ib4 ib4Var = new ib4() { // from class: l6c
                @Override // defpackage.ib4
                public final Object invoke() {
                    StringBuilder sb = new StringBuilder("ZoomableState. rollback. focus=");
                    q6cVar.getClass();
                    fb7 fb7Var3 = fb7Var2;
                    sb.append(fb7Var3 != null ? pu1.y0(fb7Var3.a) : null);
                    sb.append(". currentScale=");
                    sb.append(tw1.P(4, fB));
                    sb.append(", minScale=");
                    sb.append(tw1.P(4, f));
                    sb.append(", maxScale=");
                    sb.append(tw1.P(4, f2));
                    sb.append(", userOffsetBoundsRect=");
                    sb.append(y86.k0(lf8Var));
                    sb.append(", currentUserOffset=");
                    sb.append(pu1.y0(j5));
                    sb.append(", currentUserTransform=");
                    sb.append(qn9.u(z2bVar2));
                    sb.append(", newUserTransform=");
                    sb.append(qn9.u(z2bVarA));
                    return sb.toString();
                }
            };
            l46Var.getClass();
            l46Var.b(g46.b, ib4Var);
            Integer num = new Integer(32);
            this.b = 1;
            Object objA = q6c.a(q6cVar, z2bVarA, num, "rollback", this);
            xx1 xx1Var = xx1.a;
            if (objA == xx1Var) {
                return xx1Var;
            }
        } else {
            if (i != 1) {
                gp.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            e11.e0(obj);
        }
        return Boolean.TRUE;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                qoa qoaVar = new qoa((a07) obj2, jt1Var, 0);
                qoaVar.c = obj;
                return qoaVar;
            case 1:
                return new qoa((zx7) this.c, (woa) obj2, jt1Var, 1);
            case 2:
                return new qoa((rpa) this.c, (String) obj2, jt1Var, 2);
            case 3:
                qoa qoaVar2 = new qoa((rpa) obj2, jt1Var, 3);
                qoaVar2.c = obj;
                return qoaVar2;
            case 4:
                return new qoa((zd1) this.c, (hra) obj2, jt1Var, 4);
            case 5:
                return new qoa((hra) obj2, jt1Var, 5);
            case 6:
                return new qoa((hra) obj2, jt1Var, 6);
            case 7:
                return new qoa((hra) obj2, jt1Var, 7);
            case 8:
                return new qoa((sra) obj2, jt1Var, 8);
            case 9:
                return new qoa((csa) this.c, (String) obj2, jt1Var, 9);
            case 10:
                return new qoa((kta) this.c, (vx1) obj2, jt1Var, 10);
            case 11:
                qoa qoaVar3 = new qoa((yva) obj2, jt1Var, 11);
                qoaVar3.c = obj;
                return qoaVar3;
            case 12:
                return new qoa((yva) this.c, (List) obj2, jt1Var, 12);
            case 13:
                return new qoa((c1b) this.c, (String) obj2, jt1Var, 13);
            case 14:
                return new qoa((c1b) this.c, (xq2) obj2, jt1Var, 14);
            case 15:
                return new qoa((g7b) this.c, (ib4) obj2, jt1Var, 15);
            case 16:
                return new qoa((rab) obj2, jt1Var, 16);
            case 17:
                qoa qoaVar4 = new qoa((c24) obj2, jt1Var, 17);
                qoaVar4.c = obj;
                return qoaVar4;
            case 18:
                qoa qoaVar5 = new qoa((mib) obj2, jt1Var, 18);
                qoaVar5.c = obj;
                return qoaVar5;
            case 19:
                qoa qoaVar6 = new qoa((lmb) obj2, jt1Var, 19);
                qoaVar6.c = obj;
                return qoaVar6;
            case 20:
                return new qoa((ym) this.c, (ib4) obj2, jt1Var, 20);
            case 21:
                qoa qoaVar7 = new qoa((h49) obj2, jt1Var, 21);
                qoaVar7.c = obj;
                return qoaVar7;
            case 22:
                return new qoa((h49) obj2, jt1Var, 22);
            case 23:
                return new qoa((pp1) obj2, this.c, jt1Var);
            case 24:
                return new qoa((ff8) this.c, (View) obj2, jt1Var, 24);
            case 25:
                qoa qoaVar8 = new qoa((l3c) obj2, jt1Var, 25);
                qoaVar8.c = obj;
                return qoaVar8;
            case 26:
                return new qoa((h5c) obj2, jt1Var, 26);
            case 27:
                return new qoa((q6c) this.c, (String) obj2, jt1Var, 27);
            case 28:
                return new qoa((q6c) this.c, (fb7) obj2, jt1Var, 28);
            default:
                return new qoa((zx7) this.c, (sbb) obj2, jt1Var, 29);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
        }
        return ((qoa) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0794 A[PHI: r0
  0x0794: PHI (r0v62 java.lang.Object) = (r0v61 java.lang.Object), (r0v69 java.lang.Object) binds: [B:295:0x0791, B:285:0x0761] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x07a7 A[PHI: r0 r1
  0x07a7: PHI (r0v64 b24) = (r0v63 b24), (r0v71 b24) binds: [B:298:0x07a4, B:284:0x0757] A[DONT_GENERATE, DONT_INLINE]
  0x07a7: PHI (r1v43 java.lang.Object) = (r1v42 java.lang.Object), (r1v47 java.lang.Object) binds: [B:298:0x07a4, B:284:0x0757] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x07d8  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x083a A[LOOP:5: B:321:0x083a->B:462:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0851 A[LOOP:6: B:325:0x0851->B:464:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0882 A[PHI: r0
  0x0882: PHI (r0v42 oka) = (r0v40 oka), (r0v44 oka) binds: [B:331:0x087e, B:314:0x080e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:336:0x088f A[PHI: r0
  0x088f: PHI (r0v45 oka) = (r0v42 oka), (r0v47 oka) binds: [B:334:0x088b, B:313:0x0805] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0895  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x08a1 A[PHI: r0
  0x08a1: PHI (r0v48 oka) = (r0v45 oka), (r0v45 oka), (r0v50 oka) binds: [B:337:0x0893, B:339:0x089d, B:312:0x07fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:343:0x08a5 A[LOOP:4: B:343:0x08a5->B:360:0x0954, LOOP_START, PHI: r5
  0x08a5: PHI (r5v8 int) = (r5v0 int), (r5v10 int) binds: [B:342:0x08a3, B:360:0x0954] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0981 A[PHI: r0 r2
  0x0981: PHI (r0v51 oka) = (r0v48 oka), (r0v55 oka) binds: [B:362:0x097e, B:311:0x07f1] A[DONT_GENERATE, DONT_INLINE]
  0x0981: PHI (r2v25 java.lang.Object) = (r2v22 java.lang.Object), (r2v27 java.lang.Object) binds: [B:362:0x097e, B:311:0x07f1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0af9  */
    /* JADX WARN: Removed duplicated region for block: B:516:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:519:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:532:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:435:0x0b0c -> B:437:0x0b10). Please report as a decompilation issue!!! */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r48) {
        /*
            Method dump skipped, instruction units count: 2932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qoa.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qoa(Object obj, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.d = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qoa(Object obj, Object obj2, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = obj;
        this.d = obj2;
    }
}
