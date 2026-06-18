package defpackage;

import android.content.Context;
import android.content.Intent;
import com.reader.data.download.impl.AndroidDownloadService;
import com.reader.data.updates.impl.bookupdate.AndroidBookUpdateWorker;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class w extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Object obj, Object obj2, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = obj;
        this.d = obj2;
    }

    private final Object m(Object obj) {
        xx1 xx1Var = xx1.a;
        int i = this.b;
        if (i == 0) {
            e11.e0(obj);
            o38 o38Var = (o38) this.c;
            uc0 uc0Var = (uc0) this.d;
            tc0 tc0Var = new tc0(uc0Var, o38Var);
            jp1 jp1Var = uc0Var.a;
            jp1Var.getClass();
            synchronized (jp1Var.c) {
                try {
                    if (jp1Var.d.add(tc0Var)) {
                        if (jp1Var.d.size() == 1) {
                            jp1Var.e = jp1Var.a();
                            cp4.k().d(kp1.a, jp1Var.getClass().getSimpleName() + ": initial state = " + jp1Var.e);
                            jp1Var.c();
                        }
                        zp1 zp1Var = uc0Var.e(jp1Var.e) ? new zp1(uc0Var.d()) : yp1.a;
                        o38Var.getClass();
                        o38Var.k(zp1Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            y6 y6Var = new y6(11, (uc0) this.d, tc0Var);
            this.b = 1;
            if (rw1.I(o38Var, y6Var, this) == xx1Var) {
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

    private final Object n(Object obj) {
        int i = this.b;
        if (i == 0) {
            e11.e0(obj);
            c24 c24Var = (c24) this.c;
            m11 m11Var = (m11) this.d;
            this.b = 1;
            Object objJ = m11Var.j(c24Var, this);
            xx1 xx1Var = xx1.a;
            if (objJ == xx1Var) {
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

    private final Object o(Object obj) {
        Object pm8Var;
        int i = this.b;
        Object w11Var = heb.a;
        try {
            if (i == 0) {
                e11.e0(obj);
                w29 w29Var = (w29) this.d;
                this.b = 1;
                Object objG = w29Var.g(this, w11Var);
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
            pm8Var = w11Var;
        } catch (Throwable th) {
            pm8Var = new pm8(th);
        }
        if (pm8Var instanceof pm8) {
            w11Var = new w11(qm8.a(pm8Var));
        }
        return new y11(w11Var);
    }

    private final Object p(Object obj) {
        int i = this.b;
        jt1 jt1Var = null;
        heb hebVar = heb.a;
        if (i == 0) {
            e11.e0(obj);
            mx5 mx5Var = (mx5) this.c;
            w wVar = new w((ib4) this.d, jt1Var, 23);
            this.b = 1;
            Object objP = yn2.P(mx5Var.i(), wVar, this);
            xx1 xx1Var = xx1.a;
            if (objP != xx1Var) {
                objP = hebVar;
            }
            if (objP == xx1Var) {
                return xx1Var;
            }
        } else {
            if (i != 1) {
                gp.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            e11.e0(obj);
        }
        return hebVar;
    }

    private final Object q(Object obj) {
        vx1 vx1Var = (vx1) this.c;
        int i = this.b;
        if (i != 0 && i != 1) {
            gp.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        e11.e0(obj);
        while (wx1.k0(vx1Var)) {
            ((ib4) this.d).invoke();
            mc8 mc8Var = k63.b;
            long jZ0 = lx1.z0(10, o63.SECONDS);
            this.c = vx1Var;
            this.b = 1;
            Object objI = tw1.I(jZ0, this);
            xx1 xx1Var = xx1.a;
            if (objI == xx1Var) {
                return xx1Var;
            }
        }
        return heb.a;
    }

    private final Object r(Object obj) {
        e71 e71Var = (e71) this.c;
        String str = (String) this.d;
        int i = this.b;
        if (i == 0) {
            e11.e0(obj);
            qp3 qp3Var = e71Var.f;
            this.b = 1;
            obj = ((cq3) qp3Var).c(str, this);
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
        if (((vm3) obj) != null) {
            e71Var.i(e71Var.t, new v51(str));
        } else {
            e71Var.i(e71Var.t, new w51(str));
        }
        return heb.a;
    }

    private final Object s(Object obj) {
        Object pm8Var;
        nf1 nf1Var = (nf1) this.d;
        nc1 nc1Var = nf1Var.j;
        d00 d00Var = nf1Var.l;
        vx1 vx1Var = (vx1) this.c;
        int i = this.b;
        try {
            if (i == 0) {
                e11.e0(obj);
                this.c = vx1Var;
                this.b = 1;
                obj = nf1.c(nf1Var, this);
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
            pm8Var = (cf1) obj;
        } catch (Throwable th) {
            pm8Var = new pm8(th);
        }
        boolean z = pm8Var instanceof pm8;
        ef1 ef1Var = ef1.b;
        if (!z) {
            cf1 cf1Var = (cf1) pm8Var;
            if (wx1.k0(vx1Var)) {
                int i2 = cf1Var.a;
                int i3 = cf1Var.b;
                if (d00Var.a(ef1.e, ef1Var)) {
                    nc1Var.O(i2, i3);
                }
            }
        }
        if (qm8.a(pm8Var) != null && wx1.k0(vx1Var) && d00Var.a(ef1.f, ef1Var)) {
            h13 h13Var = (h13) nc1Var.b;
            String str = (String) nc1Var.c;
            h13.a(h13Var, str);
            h13.d((qg8) nc1Var.d, h13Var, (xa8) nc1Var.e, str, true);
            h13Var.b.u.x0(5, str);
        }
        return heb.a;
    }

    private final Object t(Object obj) {
        gl1 gl1Var = (gl1) this.c;
        int i = this.b;
        heb hebVar = heb.a;
        if (i == 0) {
            e11.e0(obj);
            dp4 dp4Var = gl1Var.f;
            this.b = 1;
            Object objB = dp4Var.b(0.0f - dp4Var.b, this);
            xx1 xx1Var = xx1.a;
            if (objB != xx1Var) {
                objB = hebVar;
            }
            if (objB == xx1Var) {
                return xx1Var;
            }
        } else {
            if (i != 1) {
                gp.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            e11.e0(obj);
        }
        ((cn7) gl1Var.c.a).setValue(Boolean.FALSE);
        ((Runnable) this.d).run();
        return hebVar;
    }

    private final Object u(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                e11.e0(obj);
                return obj;
            }
            gp.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        e11.e0(obj);
        yb4 yb4Var = (yb4) this.c;
        ty7 ty7Var = (ty7) this.d;
        this.b = 1;
        Object objInvoke = yb4Var.invoke(ty7Var, this);
        xx1 xx1Var = xx1.a;
        return objInvoke == xx1Var ? xx1Var : objInvoke;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                return new w((yy6) this.c, (qp4) obj2, jt1Var, 0);
            case 1:
                return new w((yy6) this.c, (rp4) obj2, jt1Var, 1);
            case 2:
                return new w((Intent) this.c, (Context) obj2, jt1Var, 2);
            case 3:
                w wVar = new w((j7) obj2, jt1Var, 3);
                wVar.c = obj;
                return wVar;
            case 4:
                return new w((bb) this.c, (v23) obj2, jt1Var, 4);
            case 5:
                w wVar2 = new w((ec) obj2, jt1Var, 5);
                wVar2.c = obj;
                return wVar2;
            case 6:
                return new w((AndroidBookUpdateWorker) this.c, (a82) obj2, jt1Var, 6);
            case 7:
                w wVar3 = new w((AndroidBookUpdateWorker) obj2, jt1Var, 7);
                wVar3.c = obj;
                return wVar3;
            case 8:
                return new w((r03) this.c, (AndroidDownloadService) obj2, jt1Var, 8);
            case 9:
                return new w((AndroidDownloadService) this.c, (String) obj2, jt1Var, 9);
            case 10:
                return new w((wg) this.c, (c85) obj2, jt1Var, 10);
            case 11:
                w wVar4 = new w((th) obj2, jt1Var, 11);
                wVar4.c = obj;
                return wVar4;
            case 12:
                w wVar5 = new w((fz7) obj2, jt1Var, 12);
                wVar5.c = obj;
                return wVar5;
            case 13:
                return new w((mt4) this.c, (qk9) obj2, jt1Var, 13);
            case 14:
                return new w((st5) this.c, (m90) obj2, jt1Var, 14);
            case 15:
                w wVar6 = new w((uc0) obj2, jt1Var, 15);
                wVar6.c = obj;
                return wVar6;
            case 16:
                return new w((ul0) this.c, (String) obj2, jt1Var, 16);
            case 17:
                return new w((go0) this.c, (kf8) obj2, jt1Var, 17);
            case 18:
                return new w((oo0) this.c, (ma0) obj2, jt1Var, 18);
            case 19:
                return new w((ta5) this.c, (hk9) obj2, jt1Var, 19);
            case 20:
                w wVar7 = new w((k11) obj2, jt1Var, 20);
                wVar7.c = obj;
                return wVar7;
            case 21:
                w wVar8 = new w((m11) obj2, jt1Var, 21);
                wVar8.c = obj;
                return wVar8;
            case 22:
                w wVar9 = new w((w29) obj2, jt1Var, 22);
                wVar9.c = obj;
                return wVar9;
            case 23:
                w wVar10 = new w((ib4) obj2, jt1Var, 23);
                wVar10.c = obj;
                return wVar10;
            case 24:
                return new w((mx5) this.c, (ib4) obj2, jt1Var, 24);
            case 25:
                return new w((e71) this.c, (String) obj2, jt1Var, 25);
            case 26:
                w wVar11 = new w((nf1) obj2, jt1Var, 26);
                wVar11.c = obj;
                return wVar11;
            case 27:
                return new w((gl1) this.c, (Runnable) obj2, jt1Var, 27);
            case 28:
                return new w((yb4) this.c, (ty7) obj2, jt1Var, 28);
            default:
                return new w((yb4) this.c, (rg8) obj2, jt1Var, 29);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 2:
                ((w) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 11:
                ((w) create((d85) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
        }
        return ((w) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:434|(1:(1:(6:436|219|225|259|260|494)(2:224|263))(1:226))(9:227|(1:229)(1:230)|(1:232)|233|(1:235)(1:237)|236|238|(1:240)|(1:495))|243|(1:245)|246|(1:248)|249|432|250|251|(2:253|(2:255|492))(2:256|(2:258|493))|259|260|494) */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x039c, code lost:
    
        if (r0.b(r2, r2, r3, r9, r25) == r8) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x03e1, code lost:
    
        if (r6 == r8) goto L211;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:474:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x01cf -> B:111:0x01d3). Please report as a decompilation issue!!! */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Object obj, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.d = obj;
    }
}
