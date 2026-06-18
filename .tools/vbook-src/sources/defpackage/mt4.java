package defpackage;

import android.net.Uri;
import android.view.InputEvent;
import java.io.File;
import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class mt4 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mt4(String str, u98 u98Var, kb4 kb4Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 23;
        this.d = str;
        this.c = u98Var;
        this.e = kb4Var;
    }

    private final Object m(Object obj) {
        int i = this.b;
        if (i == 0) {
            e11.e0(obj);
            rg8 rg8Var = new rg8();
            b24 b24VarL = cx1.L(dk9.C(new e51((st5) this.c, 13)));
            zn znVar = new zn(7, (List) this.d, rg8Var, (a07) this.e);
            this.b = 1;
            Object objA = b24VarL.a(znVar, this);
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
        return heb.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        if (r0 == r9) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object n(java.lang.Object r15) throws java.lang.Exception {
        /*
            r14 = this;
            int r0 = r14.b
            java.lang.Object r1 = r14.e
            r2 = 2
            r3 = 1
            r4 = 0
            xx1 r9 = defpackage.xx1.a
            if (r0 == 0) goto L23
            if (r0 == r3) goto L1a
            if (r0 != r2) goto L14
            defpackage.e11.e0(r15)
            r0 = r15
            goto L6d
        L14:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r0)
            return r4
        L1a:
            java.lang.Object r0 = r14.c
            dj7 r0 = (defpackage.dj7) r0
            defpackage.e11.e0(r15)
            r5 = r15
            goto L41
        L23:
            defpackage.e11.e0(r15)
            dj7 r0 = new dj7
            java.lang.Object r5 = r14.d
            java.lang.String r5 = (java.lang.String) r5
            int r5 = java.lang.Integer.parseInt(r5)
            r0.<init>(r5)
            r5 = r1
            tm r5 = (defpackage.tm) r5
            r14.c = r0
            r14.b = r3
            java.lang.Object r5 = r5.q(r0, r14)
            if (r5 != r9) goto L41
            goto L6c
        L41:
            ej7 r5 = (defpackage.ej7) r5
            int r6 = r5.a
            if (r6 <= 0) goto L76
            int r5 = r5.b
            long r10 = (long) r5
            r12 = 1440(0x5a0, double:7.115E-321)
            long r10 = r10 * r12
            long r12 = (long) r6
            long r10 = r10 / r12
            int r7 = (int) r10
            if (r7 >= r3) goto L53
            goto L54
        L53:
            r3 = r7
        L54:
            tm r1 = (defpackage.tm) r1
            r14.c = r4
            r14.b = r2
            r4 = 1440(0x5a0, float:2.018E-42)
            r2 = r6
            r6 = r4
            r7 = r3
            r8 = r1
            r1 = r0
            r0 = r8
            r8 = r5
            r5 = r3
            r3 = r8
            r8 = r14
            java.lang.Object r0 = r0.P(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r0 != r9) goto L6d
        L6c:
            return r9
        L6d:
            ky4 r0 = (ky4) r0
            r1 = 100
            byte[] r0 = sw1.H(r0, r1)
            return r0
        L76:
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "Invalid page size"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mt4.n(java.lang.Object):java.lang.Object");
    }

    private final Object o(Object obj) {
        String str;
        j15 j15Var = (j15) this.e;
        String str2 = j15Var.f;
        a15 a15Var = (a15) this.c;
        int i = this.b;
        if (i == 0) {
            e11.e0(obj);
            String strP = wm9.p();
            b24 b24VarF = a15Var.f(new z15(new m35(j15Var.c, str2, j15Var.j, j15Var.g), str2, strP));
            this.d = strP;
            this.b = 1;
            Object objN = cx1.N(b24VarF, this);
            xx1 xx1Var = xx1.a;
            if (objN == xx1Var) {
                return xx1Var;
            }
            str = strP;
        } else {
            if (i != 1) {
                gp.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) this.d;
            e11.e0(obj);
        }
        a15Var.c(str);
        return heb.a;
    }

    private final Object p(Object obj) {
        Object pm8Var;
        Object value;
        Object value2;
        Object value3;
        e68 e68Var = (e68) this.e;
        fr9 fr9Var = e68Var.e;
        int i = this.b;
        try {
            if (i == 0) {
                e11.e0(obj);
                if (fr9Var != null) {
                    do {
                        value3 = fr9Var.getValue();
                    } while (!fr9Var.j(value3, d68.a((d68) value3, true, false, null, null, false, null, Token.IMPORT)));
                }
                String str = (String) this.d;
                z51 z51Var = e68Var.c;
                this.c = null;
                this.b = 1;
                obj = ((p61) z51Var).j(str, this);
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
            pm8Var = (List) obj;
        } catch (Throwable th) {
            pm8Var = new pm8(th);
        }
        String str2 = (String) this.d;
        if (!(pm8Var instanceof pm8)) {
            List list = (List) pm8Var;
            if (fr9Var != null) {
                do {
                    value2 = fr9Var.getValue();
                } while (!fr9Var.j(value2, d68.a((d68) value2, false, false, str2, null, false, fc1.R0(new zp4(10), list), 88)));
            }
        }
        String str3 = (String) this.d;
        Throwable thA = qm8.a(pm8Var);
        if (thA != null) {
            thA.printStackTrace();
            if (fr9Var != null) {
                do {
                    value = fr9Var.getValue();
                } while (!fr9Var.j(value, d68.a((d68) value, false, true, str3, null, false, null, 120)));
            }
        }
        return heb.a;
    }

    private final Object q(Object obj) throws Throwable {
        String str = (String) this.d;
        int i = this.b;
        if (i == 0) {
            e11.e0(obj);
            jt1 jt1Var = null;
            ju0 ju0Var = new ju0((kb4) this.e, jt1Var, 3);
            this.b = 1;
            aj2 aj2Var = rw2.a;
            obj = ah1.b0(r76.a, new xw3(str, "txt", ju0Var, jt1Var, 1), this);
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
        boolean z = obj != null;
        u98 u98Var = (u98) this.c;
        u98Var.i(u98Var.e, z ? new e98(str) : new d98(str));
        return heb.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a8, code lost:
    
        if (r12 == r6) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object r(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mt4.r(java.lang.Object):java.lang.Object");
    }

    private final Object s(Object obj) throws Throwable {
        a25 a25Var = (a25) this.e;
        ne8 ne8Var = (ne8) this.d;
        int i = this.b;
        jt1 jt1Var = null;
        if (i != 0) {
            if (i == 1) {
                e11.e0(obj);
                return obj;
            }
            gp.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        e11.e0(obj);
        nl2 nl2VarX = ah1.x((vx1) this.c, (jx1) ne8Var.a.c.getValue(), new y46(ne8Var, a25Var, jt1Var, 21), 2);
        caa caaVar = a25Var.c;
        this.b = 1;
        Object objO = nl2VarX.o(this);
        xx1 xx1Var = xx1.a;
        return objO == xx1Var ? xx1Var : objO;
    }

    private final Object t(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                e11.e0(obj);
                return heb.a;
            }
            gp.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        e11.e0(obj);
        vx1 vx1Var = (vx1) this.c;
        ef8 ef8Var = (ef8) this.d;
        wu6 wu6Var = (wu6) this.e;
        this.b = 1;
        ef8Var.c(vx1Var, wu6Var, this);
        return xx1.a;
    }

    private final Object u(Object obj) {
        a07 a07Var = (a07) this.e;
        xi8 xi8Var = (xi8) this.c;
        int i = this.b;
        if (i == 0) {
            e11.e0(obj);
            long jG = eb7.g(((eb7) ((a07) this.d).getValue()).a, ((eb7) xi8Var.c.invoke()).a);
            long j = qu1.j((((int) (((na5) a07Var.getValue()).a >> 32)) / 2.0f) + eb7.e(jG), (((int) (((na5) a07Var.getValue()).a & 4294967295L)) / 2.0f) + eb7.f(jG));
            gj8 gj8Var = xi8Var.a;
            Object obj2 = xi8Var.b;
            this.b = 1;
            Object objG = gj8Var.g(obj2, j, this);
            xx1 xx1Var = xx1.a;
            if (objG == xx1Var) {
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
    }

    private final Object v(Object obj) throws Throwable {
        int i = this.b;
        if (i == 0) {
            e11.e0(obj);
            vx1 vx1Var = (vx1) this.c;
            aj2 aj2Var = rw2.a;
            fj4 fj4Var = r76.a.f;
            ug ugVar = new ug((px5) this.d, vx1Var, (yb4) this.e, null, 25);
            this.b = 1;
            Object objB0 = ah1.b0(fj4Var, ugVar, this);
            xx1 xx1Var = xx1.a;
            if (objB0 == xx1Var) {
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
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                return new mt4((uv1) this.c, (String) this.d, (String) obj2, jt1Var, 0);
            case 1:
                return new mt4((Long) this.c, (xu4) this.d, (yd5) obj2, jt1Var, 1);
            case 2:
                mt4 mt4Var = new mt4((qtb) obj2, (String) this.d, jt1Var, 2);
                mt4Var.c = obj;
                return mt4Var;
            case 3:
                mt4 mt4Var2 = new mt4((ob5) obj2, jt1Var, 3);
                mt4Var2.d = obj;
                return mt4Var2;
            case 4:
                return new mt4((qtb) obj2, (String) this.d, jt1Var, 4);
            case 5:
                return new mt4((hm5) obj2, jt1Var, 5);
            case 6:
                return new mt4((sr5) this.c, (by3) this.d, (jh4) obj2, jt1Var, 6);
            case 7:
                mt4 mt4Var3 = new mt4((yb4) this.d, (mx0) obj2, jt1Var, 7);
                mt4Var3.c = obj;
                return mt4Var3;
            case 8:
                mt4 mt4Var4 = new mt4((y36) obj2, jt1Var, 8);
                mt4Var4.d = obj;
                return mt4Var4;
            case 9:
                mt4 mt4Var5 = new mt4((b96) obj2, jt1Var, 9);
                mt4Var5.d = obj;
                return mt4Var5;
            case 10:
                return new mt4((pa6) this.c, (Uri) this.d, (InputEvent) obj2, jt1Var, 10);
            case 11:
                return new mt4((n7c) this.c, (f28) this.d, (a07) obj2, jt1Var, 11);
            case 12:
                return new mt4((fxb) this.c, (yha) this.d, (fia) obj2, jt1Var, 12);
            case 13:
                mt4 mt4Var6 = new mt4((File) obj2, jt1Var, 13);
                mt4Var6.d = obj;
                return mt4Var6;
            case 14:
                mt4 mt4Var7 = new mt4((zu0) this.d, (hy1) obj2, jt1Var, 14);
                mt4Var7.c = obj;
                return mt4Var7;
            case 15:
                return new mt4((p3b) this.c, (jk9) this.d, (fz6) obj2, jt1Var, 15);
            case 16:
                mt4 mt4Var8 = new mt4((tp1) this.d, (r57) obj2, jt1Var, 16);
                mt4Var8.c = obj;
                return mt4Var8;
            case 17:
                mt4 mt4Var9 = new mt4((q87) obj2, jt1Var, 17);
                mt4Var9.d = obj;
                return mt4Var9;
            case 18:
                mt4 mt4Var10 = new mt4((s97) obj2, jt1Var, 18);
                mt4Var10.d = obj;
                return mt4Var10;
            case 19:
                return new mt4((st5) this.c, (List) this.d, (a07) obj2, jt1Var, 19);
            case 20:
                return new mt4((String) this.d, (tm) obj2, jt1Var, 20);
            case 21:
                return new mt4((a15) this.c, (j15) obj2, jt1Var);
            case 22:
                mt4 mt4Var11 = new mt4((qtb) obj2, (String) this.d, jt1Var, 22);
                mt4Var11.c = obj;
                return mt4Var11;
            case 23:
                return new mt4((String) this.d, (u98) this.c, (kb4) obj2, jt1Var);
            case 24:
                mt4 mt4Var12 = new mt4((ma8) obj2, jt1Var, 24);
                mt4Var12.d = obj;
                return mt4Var12;
            case 25:
                mt4 mt4Var13 = new mt4((ne8) this.d, (a25) obj2, jt1Var, 25);
                mt4Var13.c = obj;
                return mt4Var13;
            case 26:
                mt4 mt4Var14 = new mt4((ef8) this.d, (wu6) obj2, jt1Var, 26);
                mt4Var14.c = obj;
                return mt4Var14;
            case 27:
                return new mt4((xi8) this.c, (a07) this.d, (a07) obj2, jt1Var, 27);
            case 28:
                mt4 mt4Var15 = new mt4((px5) this.d, (yb4) obj2, jt1Var, 28);
                mt4Var15.c = obj;
                return mt4Var15;
            default:
                mt4 mt4Var16 = new mt4((h12) this.d, (na5) obj2, jt1Var, 29);
                mt4Var16.c = obj;
                return mt4Var16;
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
        }
        return ((mt4) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:188:0x03db, code lost:
    
        if (r0.g(r17) == r3) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x047a, code lost:
    
        if (defpackage.rw1.I(r3, r5, r17) == r0) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x05e0, code lost:
    
        if (r11.f(r17, r0) != r12) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x065f, code lost:
    
        if (r2.b(r17) != r5) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x07c3, code lost:
    
        if (r3 != r5) goto L377;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x093c, code lost:
    
        if (defpackage.ob5.a(r0, r5, r17) == r6) goto L463;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x0956, code lost:
    
        if (r5.a(r17) == r6) goto L463;
     */
    /* JADX WARN: Code restructure failed: missing block: B:615:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0151, code lost:
    
        if (r0 == r6) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:278:0x05d2 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05d3 A[Catch: all -> 0x055d, PHI: r0
  0x05d3: PHI (r0v65 java.lang.Object) = (r0v64 java.lang.Object), (r0v69 java.lang.Object) binds: [B:277:0x05d0, B:265:0x0559] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #10 {all -> 0x055d, blocks: (B:264:0x0556, B:279:0x05d3, B:276:0x05c0), top: B:541:0x0536 }] */
    /* JADX WARN: Removed duplicated region for block: B:437:0x08eb A[LOOP:8: B:437:0x08eb->B:571:?, LOOP_START] */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mt4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mt4(qtb qtbVar, String str, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.e = qtbVar;
        this.d = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mt4(Object obj, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mt4(Object obj, Object obj2, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.d = obj;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mt4(Object obj, Object obj2, Object obj3, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mt4(a15 a15Var, j15 j15Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 21;
        this.c = a15Var;
        this.e = j15Var;
    }
}
