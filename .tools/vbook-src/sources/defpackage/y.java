package defpackage;

import android.content.Context;
import com.reader.data.download.impl.AndroidDownloadService;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class y extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(Object obj, Object obj2, Object obj3, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    private final Object m(Object obj) {
        rg8 rg8Var;
        int i = this.b;
        if (i == 0) {
            e11.e0(obj);
            rg8 rg8Var2 = (rg8) this.d;
            ky7 ky7Var = (ky7) this.e;
            this.c = rg8Var2;
            this.b = 1;
            Object objA = ky7Var.a(this);
            xx1 xx1Var = xx1.a;
            if (objA == xx1Var) {
                return xx1Var;
            }
            obj = objA;
            rg8Var = rg8Var2;
        } else {
            if (i != 1) {
                gp.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            rg8Var = (rg8) this.c;
            e11.e0(obj);
        }
        rg8Var.a = obj;
        return heb.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object n(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y.n(java.lang.Object):java.lang.Object");
    }

    private final Object o(Object obj) throws Throwable {
        a52 a52Var = (a52) this.d;
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
        vx1 vx1Var = (vx1) this.c;
        bi1 bi1VarD = p7c.d();
        ar9 ar9VarA = a52Var.h.a();
        if (ar9VarA instanceof o32) {
            ar9VarA = new n67(((o32) ar9VarA).a);
        }
        ff6 ff6Var = new ff6((yb4) this.e, bi1VarD, ar9VarA, vx1Var.q());
        s16 s16Var = a52Var.l;
        Object objK = ((ir0) s16Var.d).k(ff6Var);
        if (objK instanceof w11) {
            Throwable th = ((w11) objK).a;
            if (th == null) {
                throw new eb1("Channel was closed normally");
            }
            throw th;
        }
        if (objK instanceof x11) {
            gp.j("Check failed.");
            return null;
        }
        if (((AtomicInteger) ((uf4) s16Var.e).b).getAndIncrement() == 0) {
            ah1.J((vx1) s16Var.b, null, null, new b69(s16Var, jt1Var, 7), 3);
        }
        this.b = 1;
        Object objO = bi1VarD.o(this);
        xx1 xx1Var = xx1.a;
        return objO == xx1Var ? xx1Var : objO;
    }

    private final Object p(Object obj) {
        int i = this.b;
        jt1 jt1Var = null;
        if (i == 0) {
            e11.e0(obj);
            dj2 dj2Var = (dj2) this.c;
            p07 p07Var = dj2Var.c;
            cj2 cj2Var = dj2Var.b;
            j07 j07Var = (j07) this.d;
            y yVar = new y(dj2Var, (yb4) this.e, jt1Var, 27);
            this.b = 1;
            p07Var.getClass();
            Object objA0 = wx1.a0(new o07(j07Var, p07Var, yVar, cj2Var, null), this);
            xx1 xx1Var = xx1.a;
            if (objA0 == xx1Var) {
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

    private final Object q(Object obj) {
        cn7 cn7Var = ((dj2) this.d).d;
        int i = this.b;
        try {
            if (i == 0) {
                e11.e0(obj);
                tw8 tw8Var = (tw8) this.c;
                cn7Var.setValue(Boolean.TRUE);
                yb4 yb4Var = (yb4) this.e;
                this.b = 1;
                Object objInvoke = yb4Var.invoke(tw8Var, this);
                xx1 xx1Var = xx1.a;
                if (objInvoke == xx1Var) {
                    return xx1Var;
                }
            } else {
                if (i != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
            }
            cn7Var.setValue(Boolean.FALSE);
            return heb.a;
        } catch (Throwable th) {
            cn7Var.setValue(Boolean.FALSE);
            throw th;
        }
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                return new y((yy6) this.c, (b28) this.d, (ax2) obj2, jt1Var, 0);
            case 1:
                y yVar = new y((j7) this.d, (String) obj2, jt1Var, 1);
                yVar.c = obj;
                return yVar;
            case 2:
                y yVar2 = new y((zb4) this.d, (ob) obj2, jt1Var, 2);
                yVar2.c = obj;
                return yVar2;
            case 3:
                y yVar3 = new y((zb4) this.d, (pb) obj2, jt1Var, 3);
                yVar3.c = obj;
                return yVar3;
            case 4:
                y yVar4 = new y((ac4) this.d, (ob) obj2, jt1Var, 4);
                yVar4.c = obj;
                return yVar4;
            case 5:
                y yVar5 = new y((ac4) this.d, (pb) obj2, jt1Var, 5);
                yVar5.c = obj;
                return yVar5;
            case 6:
                y yVar6 = new y((AndroidDownloadService) this.d, (String) obj2, jt1Var, 6);
                yVar6.c = obj;
                return yVar6;
            case 7:
                y yVar7 = new y((p3b) this.d, (a07) obj2, jt1Var, 7);
                yVar7.c = obj;
                return yVar7;
            case 8:
                return new y((wd0) this.c, (Context) this.d, (au) obj2, jt1Var, 8);
            case 9:
                return new y((px) this.d, (jx) obj2, jt1Var, 9);
            case 10:
                return new y((mt4) this.d, (qk9) obj2, jt1Var, 10);
            case 11:
                y yVar8 = new y((sk9) this.d, (mt4) obj2, jt1Var, 11);
                yVar8.c = obj;
                return yVar8;
            case 12:
                return new y((y) this.d, (ww) obj2, jt1Var, 12);
            case 13:
                return new y((oo0) this.c, (x67) this.d, (hd) obj2, jt1Var, 13);
            case 14:
                return new y((rq0) this.c, (String) this.d, (String) obj2, jt1Var, 14);
            case 15:
                y yVar9 = new y((b01) this.d, (String) obj2, jt1Var, 15);
                yVar9.c = obj;
                return yVar9;
            case 16:
                y yVar10 = new y((c24) this.d, (k11) obj2, jt1Var, 16);
                yVar10.c = obj;
                return yVar10;
            case 17:
                return new y((mx5) this.c, (v41) this.d, (a07) obj2, jt1Var, 17);
            case 18:
                return new y((st5) this.c, (ib4) this.d, (a07) obj2, jt1Var, 18);
            case 19:
                y yVar11 = new y((e71) obj2, jt1Var, 19);
                yVar11.d = obj;
                return yVar11;
            case 20:
                return new y((lm9) this.c, (String) this.d, (String) obj2, jt1Var, 20);
            case 21:
                return new y((tf1) this.c, (String) this.d, (String) obj2, jt1Var, 21);
            case 22:
                y yVar12 = new y((wf1) obj2, jt1Var, 22);
                yVar12.d = obj;
                return yVar12;
            case 23:
                y yVar13 = new y((en1) this.d, (vx) obj2, jt1Var, 23);
                yVar13.c = obj;
                return yVar13;
            case 24:
                return new y((rg8) this.d, (ky7) obj2, jt1Var, 24);
            case 25:
                y yVar14 = new y((a52) obj2, jt1Var, 25);
                yVar14.d = obj;
                return yVar14;
            case 26:
                y yVar15 = new y((a52) this.d, (yb4) obj2, jt1Var, 26);
                yVar15.c = obj;
                return yVar15;
            case 27:
                y yVar16 = new y((dj2) this.d, (yb4) obj2, jt1Var, 27);
                yVar16.c = obj;
                return yVar16;
            case 28:
                return new y((dj2) this.c, (j07) this.d, (yb4) obj2, jt1Var, 28);
            default:
                y yVar17 = new y(this.d, (gv4) obj2, jt1Var, 29);
                yVar17.c = obj;
                return yVar17;
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                return ((y) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 1:
                return ((y) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 2:
                return ((y) create((h86) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 3:
                return ((y) create((gg2) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 4:
                return ((y) create((xl7) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 5:
                return ((y) create((xl7) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 6:
                return ((y) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 7:
                return ((y) create((n38) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 8:
                return ((y) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 9:
                return ((y) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 10:
                return ((y) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 11:
                return ((y) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 12:
                return ((y) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 13:
                return ((y) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 14:
                return ((y) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 15:
                return ((y) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 16:
                return ((y) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 17:
                return ((y) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 18:
                return ((y) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 19:
                return ((y) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 20:
                return ((y) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 21:
                return ((y) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 22:
                return ((y) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 23:
                return ((y) create((iy) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 24:
                return ((y) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 25:
                return ((y) create((c24) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 26:
                return ((y) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 27:
                return ((y) create((tw8) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 28:
                return ((y) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            default:
                return ((y) create((i3c) obj, (jt1) obj2)).invokeSuspend(hebVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x072c  */
    /* JADX WARN: Type inference failed for: r0v203 */
    /* JADX WARN: Type inference failed for: r0v204 */
    /* JADX WARN: Type inference failed for: r0v79 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:313:0x0626 -> B:315:0x0629). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:321:0x0648 -> B:312:0x061e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r45) {
        /*
            Method dump skipped, instruction units count: 2586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(Object obj, Object obj2, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.d = obj;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(Object obj, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.e = obj;
    }
}
