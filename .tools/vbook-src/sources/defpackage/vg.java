package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import androidx.glance.appwidget.GlanceAppWidgetReceiver;
import androidx.glance.session.IdleEventBroadcastReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class vg extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vg(ib9 ib9Var, b24 b24Var, fr9 fr9Var, Object obj, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 16;
        this.d = ib9Var;
        this.e = b24Var;
        this.f = fr9Var;
        this.c = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.e
            au r0 = (defpackage.au) r0
            java.lang.Object r1 = r10.d
            of4 r1 = (of4) r1
            androidx.glance.appwidget.GlanceRemoteViewsService r1 = r1.a
            int r2 = r10.b
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            xx1 r7 = defpackage.xx1.a
            if (r2 == 0) goto L34
            if (r2 == r6) goto L2c
            if (r2 == r5) goto L24
            if (r2 != r4) goto L1e
            defpackage.e11.e0(r11)
            return r11
        L1e:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r10)
            return r3
        L24:
            java.lang.Object r1 = r10.c
            u59 r1 = (u59) r1
            defpackage.e11.e0(r11)
            goto L6f
        L2c:
            java.lang.Object r2 = r10.c
            u59 r2 = (u59) r2
            defpackage.e11.e0(r11)
            goto L4f
        L34:
            defpackage.e11.e0(r11)
            java.lang.Object r11 = r10.c
            u59 r11 = (u59) r11
            int r2 = r0.a
            java.lang.String r2 = defpackage.lc5.a0(r2)
            r10.c = r11
            r10.b = r6
            java.lang.Object r2 = r11.a(r1, r2, r10)
            if (r2 != r7) goto L4c
            goto L8a
        L4c:
            r9 = r2
            r2 = r11
            r11 = r9
        L4f:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L58
            return r3
        L58:
            ju r11 = new ju
            java.lang.Object r6 = r10.f
            wd0 r6 = (defpackage.wd0) r6
            r8 = 252(0xfc, float:3.53E-43)
            r11.<init>(r6, r0, r3, r8)
            r10.c = r2
            r10.b = r5
            java.lang.Object r11 = r2.b(r1, r11, r10)
            if (r11 != r7) goto L6e
            goto L8a
        L6e:
            r1 = r2
        L6f:
            int r11 = r0.a
            java.lang.String r11 = defpackage.lc5.a0(r11)
            java.util.LinkedHashMap r0 = r1.a
            java.lang.Object r11 = r0.get(r11)
            ju r11 = (ju) r11
            r11.getClass()
            r10.c = r3
            r10.b = r4
            java.lang.Object r10 = r11.f(r10)
            if (r10 != r7) goto L8b
        L8a:
            return r7
        L8b:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vg.m(java.lang.Object):java.lang.Object");
    }

    private final Object n(Object obj) throws Throwable {
        IdleEventBroadcastReceiver idleEventBroadcastReceiver;
        Context context = (Context) this.d;
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                gp.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            idleEventBroadcastReceiver = (IdleEventBroadcastReceiver) this.c;
            try {
                e11.e0(obj);
                context.unregisterReceiver(idleEventBroadcastReceiver);
                return obj;
            } catch (Throwable th) {
                th = th;
                context.unregisterReceiver(idleEventBroadcastReceiver);
                throw th;
            }
        }
        e11.e0(obj);
        IdleEventBroadcastReceiver idleEventBroadcastReceiver2 = new IdleEventBroadcastReceiver(new hd(8, (vx1) this.c, (wm) this.f));
        context.registerReceiver(idleEventBroadcastReceiver2, IdleEventBroadcastReceiver.c);
        try {
            idleEventBroadcastReceiver2.a(context);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            ib ibVar = (ib) this.e;
            this.c = idleEventBroadcastReceiver2;
            this.b = 1;
            obj = ibVar.invoke(this);
            xx1 xx1Var = xx1.a;
            if (obj == xx1Var) {
                return xx1Var;
            }
            idleEventBroadcastReceiver = idleEventBroadcastReceiver2;
            context.unregisterReceiver(idleEventBroadcastReceiver);
            return obj;
        } catch (Throwable th3) {
            th = th3;
            idleEventBroadcastReceiver = idleEventBroadcastReceiver2;
            context.unregisterReceiver(idleEventBroadcastReceiver);
            throw th;
        }
    }

    private final Object o(Object obj) throws Throwable {
        int i = this.b;
        if (i == 0) {
            e11.e0(obj);
            a15 a15Var = (a15) this.c;
            String str = (String) this.d;
            z15 z15Var = (z15) this.e;
            e5 e5Var = (e5) this.f;
            this.b = 1;
            Object objA = a15.a(a15Var, str, z15Var, e5Var, this);
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

    private final Object p(Object obj) {
        jt1 jt1Var;
        Object next;
        gl8 gl8Var = (gl8) this.c;
        int i = this.b;
        if (i == 0) {
            e11.e0(obj);
            ql8 ql8VarA = jl8.a((m53) this.d, gl8Var);
            Iterator it = ql8VarA.a.iterator();
            while (true) {
                jt1Var = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((qa8) next) instanceof tn2) {
                    break;
                }
            }
            tn2 tn2Var = next instanceof tn2 ? (tn2) next : null;
            int i2 = tn2Var != null ? tn2Var.a : 160;
            int i3 = ((gl8) this.e).d.a;
            String str = ql8VarA.b;
            lf2 lf2Var = (lf2) this.f;
            g25 g25Var = new g25(i2, i3, 0);
            this.c = null;
            this.b = 1;
            c85 c85Var = i25.d;
            x42 x42Var = new x42(g25Var, lf2Var, str, jt1Var, 3);
            c85Var.getClass();
            obj = wx1.a0(new yw(c85Var, str + "-" + i3 + "dpi", x42Var, (jt1) null), this);
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
        obj.getClass();
        return ((uy4) obj).a;
    }

    /* JADX WARN: Path cross not found for [B:11:0x0041, B:16:0x0066], limit reached: 18 */
    /* JADX WARN: Path cross not found for [B:16:0x0066, B:11:0x0041], limit reached: 18 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f A[PHI: r9 r10
  0x005f: PHI (r9v1 og8) = (r9v2 og8), (r9v3 og8) binds: [B:12:0x005c, B:9:0x0021] A[DONT_GENERATE, DONT_INLINE]
  0x005f: PHI (r10v1 vx1) = (r10v2 vx1), (r10v3 vx1) binds: [B:12:0x005c, B:9:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0064 -> B:11:0x0041). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0080 -> B:11:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object q(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.b
            r1 = 0
            r2 = 1
            r3 = 2
            xx1 r4 = defpackage.xx1.a
            if (r0 == 0) goto L2f
            if (r0 == r2) goto L21
            if (r0 != r3) goto L1b
            java.lang.Object r0 = r12.d
            og8 r0 = (defpackage.og8) r0
            java.lang.Object r5 = r12.c
            vx1 r5 = (defpackage.vx1) r5
            defpackage.e11.e0(r13)
            r9 = r0
            r10 = r5
            goto L41
        L1b:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r12)
            return r1
        L21:
            java.lang.Object r0 = r12.d
            og8 r0 = (defpackage.og8) r0
            java.lang.Object r5 = r12.c
            vx1 r5 = (defpackage.vx1) r5
            defpackage.e11.e0(r13)
            r9 = r0
            r10 = r5
            goto L5f
        L2f:
            defpackage.e11.e0(r13)
            java.lang.Object r13 = r12.c
            vx1 r13 = (defpackage.vx1) r13
            og8 r0 = new og8
            r0.<init>()
            r5 = 1065353216(0x3f800000, float:1.0)
            r0.a = r5
            r10 = r13
            r9 = r0
        L41:
            java.lang.Object r13 = r12.e
            r7 = r13
            a07 r7 = (a07) r7
            java.lang.Object r13 = r12.f
            r8 = r13
            f75 r8 = (defpackage.f75) r8
            um r6 = new um
            r11 = 12
            r6.<init>(r7, r8, r9, r10, r11)
            r12.c = r10
            r12.d = r9
            r12.b = r2
            java.lang.Object r13 = defpackage.ex1.k0(r6, r12)
            if (r13 != r4) goto L5f
            goto L82
        L5f:
            float r13 = r9.a
            r0 = 0
            int r13 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r13 != 0) goto L41
            uk2 r13 = new uk2
            r0 = 15
            r13.<init>(r10, r0)
            pp1 r13 = dk9.C(r13)
            e75 r0 = new e75
            r0.<init>(r3, r1)
            r12.c = r10
            r12.d = r9
            r12.b = r3
            java.lang.Object r13 = defpackage.cx1.O(r13, r0, r12)
            if (r13 != r4) goto L41
        L82:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vg.q(java.lang.Object):java.lang.Object");
    }

    private final Object r(Object obj) {
        Object pm8Var;
        Object value;
        Object value2;
        m56 m56Var = (m56) this.d;
        int i = this.b;
        try {
            if (i == 0) {
                e11.e0(obj);
                String str = (String) this.e;
                String str2 = (String) this.f;
                fr9 fr9Var = m56Var.d;
                if (fr9Var != null) {
                    do {
                        value2 = fr9Var.getValue();
                        ((l56) value2).getClass();
                    } while (!fr9Var.j(value2, new l56(true)));
                }
                aib aibVar = m56Var.c;
                this.c = null;
                this.b = 1;
                obj = ((hib) aibVar).d(str, str2, this);
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
            pm8Var = (ihb) obj;
        } catch (Throwable th) {
            pm8Var = new pm8(th);
        }
        if (!(pm8Var instanceof pm8)) {
            m56Var.i(m56Var.e, new h56(((ihb) pm8Var).b));
        }
        Throwable thA = qm8.a(pm8Var);
        if (thA != null) {
            thA.printStackTrace();
            fr9 fr9Var2 = m56Var.d;
            if (fr9Var2 != null) {
                do {
                    value = fr9Var2.getValue();
                    ((l56) value).getClass();
                } while (!fr9Var2.j(value, new l56(false)));
            }
            m56Var.i(m56Var.e, g56.a);
        }
        return heb.a;
    }

    private final Object s(Object obj) {
        a07 a07Var = (a07) this.f;
        int i = this.b;
        if (i == 0) {
            e11.e0(obj);
            if (((Boolean) a07Var.getValue()).booleanValue()) {
                ((ib4) this.c).invoke();
            }
            ym ymVar = (ym) this.d;
            Float f = new Float(0.0f);
            by3 by3Var = (by3) this.e;
            this.b = 1;
            Object objB = ym.b(ymVar, f, by3Var, null, this, 12);
            xx1 xx1Var = xx1.a;
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
        a07Var.setValue(Boolean.FALSE);
        return heb.a;
    }

    private final Object t(Object obj) {
        int iH;
        qha qhaVar;
        int i;
        qha qhaVar2;
        ww8 ww8Var = (ww8) this.c;
        a07 a07Var = (a07) this.e;
        a07 a07Var2 = (a07) this.d;
        a07 a07Var3 = (a07) this.f;
        int i2 = this.b;
        heb hebVar = heb.a;
        if (i2 != 0) {
            if (i2 == 1) {
                e11.e0(obj);
                return hebVar;
            }
            gp.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        e11.e0(obj);
        if (((Number) a07Var2.getValue()).intValue() >= 0 && ((Number) a07Var.getValue()).intValue() >= 0 && ((qha) a07Var3.getValue()) != null && (iH = ww8Var.b.h()) > 0 && (qhaVar = (qha) a07Var3.getValue()) != null && (i = (int) (qhaVar.c >> 32)) > 0 && iH <= i && (qhaVar2 = (qha) a07Var3.getValue()) != null) {
            float f = qhaVar2.b(((Number) a07Var2.getValue()).intValue()).a;
            qha qhaVar3 = (qha) a07Var3.getValue();
            if (qhaVar3 != null) {
                int i3 = ((int) ((f + qhaVar3.b(((Number) a07Var.getValue()).intValue() - 1).c) / 2.0f)) - (iH / 2);
                this.b = 1;
                Object objQ = yn2.Q(ww8Var, i3 - ww8Var.a.h(), this);
                xx1 xx1Var = xx1.a;
                if (objQ == xx1Var) {
                    return xx1Var;
                }
            }
        }
        return hebVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                vg vgVar = new vg((kb4) this.d, (wg) this.e, (gv5) obj2, jt1Var, 0);
                vgVar.c = obj;
                return vgVar;
            case 1:
                return new vg(this.c, (ym) this.d, (a07) this.e, (a07) obj2, jt1Var, 1);
            case 2:
                return new vg((ym7) this.e, (ym7) obj2, jt1Var, 2);
            case 3:
                vg vgVar2 = new vg((ju) this.d, (Context) this.e, (a07) obj2, jt1Var, 3);
                vgVar2.c = obj;
                return vgVar2;
            case 4:
                return new vg((hb1) this.c, (vx1) this.d, (m90) this.e, (td5) obj2, jt1Var, 4);
            case 5:
                vg vgVar3 = new vg((rk0) this.e, (String) obj2, jt1Var, 5);
                vgVar3.c = obj;
                return vgVar3;
            case 6:
                return new vg((t61) this.c, (st5) this.d, (a07) this.e, (a07) obj2, jt1Var, 6);
            case 7:
                return new vg((gl1) this.c, (ScrollCaptureSession) this.d, (Rect) this.e, (Consumer) obj2, jt1Var, 7);
            case 8:
                vg vgVar4 = new vg((cn1) this.e, (bv0) obj2, jt1Var, 8);
                vgVar4.c = obj;
                return vgVar4;
            case 9:
                return new vg((vj8) this.c, (d2c) this.d, (AtomicInteger) this.e, (ListenableFuture) obj2, jt1Var, 9);
            case 10:
                return new vg((ConstraintTrackingWorker) this.c, (zz5) this.d, (vj8) this.e, (d2c) obj2, jt1Var, 10);
            case 11:
                vg vgVar5 = new vg((yb4) this.d, (iw0) this.e, (BroadcastReceiver.PendingResult) obj2, jt1Var, 11);
                vgVar5.c = obj;
                return vgVar5;
            case 12:
                vg vgVar6 = new vg((xr3) this.d, (cs3) this.e, (String) obj2, jt1Var, 12);
                vgVar6.c = obj;
                return vgVar6;
            case 13:
                return new vg((fv3) this.c, (String) this.d, (sw3) this.e, (rg8) obj2, jt1Var, 13);
            case 14:
                vg vgVar7 = new vg((rg8) this.e, (c24) obj2, jt1Var, 14);
                vgVar7.c = obj;
                return vgVar7;
            case 15:
                vg vgVar8 = new vg((b24) this.d, (fr9) this.e, this.f, jt1Var, 15);
                vgVar8.c = obj;
                return vgVar8;
            case 16:
                return new vg((ib9) this.d, (b24) this.e, (fr9) obj2, this.c, jt1Var);
            case 17:
                vg vgVar9 = new vg((ra8) obj2, jt1Var);
                vgVar9.c = obj;
                return vgVar9;
            case 18:
                vg vgVar10 = new vg((zx7) this.d, (y91) this.e, (rg8) obj2, jt1Var, 18);
                vgVar10.c = obj;
                return vgVar10;
            case 19:
                vg vgVar11 = new vg((GlanceAppWidgetReceiver) this.d, (Context) this.e, (int[]) obj2, jt1Var, 19);
                vgVar11.c = obj;
                return vgVar11;
            case 20:
                vg vgVar12 = new vg((of4) this.d, (au) this.e, (wd0) obj2, jt1Var, 20);
                vgVar12.c = obj;
                return vgVar12;
            case 21:
                vg vgVar13 = new vg((Context) this.d, (ib) this.e, (wm) obj2, jt1Var, 21);
                vgVar13.c = obj;
                return vgVar13;
            case 22:
                return new vg((a15) this.c, (String) this.d, (z15) this.e, (rg8) obj2, jt1Var, 22);
            case 23:
                return new vg((a15) this.c, (String) this.d, (z15) this.e, (e5) obj2, jt1Var, 23);
            case 24:
                vg vgVar14 = new vg((m53) this.d, (gl8) this.e, (lf2) obj2, jt1Var, 24);
                vgVar14.c = obj;
                return vgVar14;
            case 25:
                vg vgVar15 = new vg((a07) this.e, (f75) obj2, jt1Var, 25);
                vgVar15.c = obj;
                return vgVar15;
            case 26:
                vg vgVar16 = new vg((m56) this.d, (String) this.e, (String) obj2, jt1Var, 26);
                vgVar16.c = obj;
                return vgVar16;
            case 27:
                return new vg((ib4) this.c, (ym) this.d, (by3) this.e, (a07) obj2, jt1Var, 27);
            case 28:
                return new vg((ww8) this.c, (a07) this.d, (a07) this.e, (a07) obj2, jt1Var, 28);
            default:
                vg vgVar17 = new vg((iz8) this.d, (mu8) this.e, (p3b) obj2, jt1Var, 29);
                vgVar17.c = obj;
                return vgVar17;
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.a;
        xx1 xx1Var = xx1.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                ((vg) create((th) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 2:
                ((vg) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 14:
                break;
            case 25:
                ((vg) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
        }
        return ((vg) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:601:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v171, types: [c24, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v15, types: [java.lang.Object, ra8] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.concurrent.CancellationException] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r1v32, types: [vx1] */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v94 */
    /* JADX WARN: Type inference failed for: r1v95 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v58, types: [v34] */
    /* JADX WARN: Type inference failed for: r2v60, types: [java.lang.Object, v34] */
    /* JADX WARN: Type inference failed for: r2v61, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v76 */
    /* JADX WARN: Type inference failed for: r2v77 */
    /* JADX WARN: Type inference failed for: r2v78 */
    /* JADX WARN: Type inference failed for: r2v79 */
    /* JADX WARN: Type inference failed for: r2v80 */
    /* JADX WARN: Type inference failed for: r3v19, types: [bv0, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:481:0x090c -> B:472:0x08a9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x023f -> B:93:0x0219). Please report as a decompilation issue!!! */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vg.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vg(ra8 ra8Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 17;
        this.f = ra8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vg(Object obj, Object obj2, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.e = obj;
        this.f = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vg(Object obj, Object obj2, Object obj3, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vg(Object obj, Object obj2, Object obj3, Object obj4, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }
}
