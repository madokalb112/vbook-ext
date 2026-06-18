package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.glance.appwidget.GlanceAppWidgetReceiver;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class yw3 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw3(List list, int i, i45 i45Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 23;
        this.c = list;
        this.b = i;
        this.d = i45Var;
    }

    private final Object m(Object obj) {
        pd5 pd5Var = (pd5) this.d;
        ThreadLocal threadLocal = pd5Var.b;
        int i = this.b;
        try {
            if (i == 0) {
                e11.e0(obj);
                Object obj2 = threadLocal.get();
                Boolean bool = Boolean.TRUE;
                if (lc5.Q(obj2, bool)) {
                    gp.j("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                    return null;
                }
                threadLocal.set(bool);
                h42 h42Var = pd5Var.c;
                t22 t22Var = new t22((kb4) this.c, null);
                this.b = 1;
                obj = qu1.G(h42Var, t22Var, this);
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
            return (pz6) obj;
        } finally {
            threadLocal.set(Boolean.FALSE);
        }
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                return new yw3((kb4) this.c, (wt7) obj2, jt1Var, 0);
            case 1:
                yw3 yw3Var = new yw3((bbc) obj2, jt1Var, 1);
                yw3Var.c = obj;
                return yw3Var;
            case 2:
                return new yw3((fz3) this.c, (h69) obj2, jt1Var, 2);
            case 3:
                return new yw3((n14) this.c, (k14) obj2, jt1Var, 3);
            case 4:
                return new yw3((n14) this.c, (sa5) obj2, jt1Var, 4);
            case 5:
                yw3 yw3Var2 = new yw3((b24) obj2, jt1Var, 5);
                yw3Var2.c = obj;
                return yw3Var2;
            case 6:
                return new yw3((rg8) this.c, (c24) obj2, jt1Var, 6);
            case 7:
                yw3 yw3Var3 = new yw3((a62) obj2, jt1Var, 7);
                yw3Var3.c = obj;
                return yw3Var3;
            case 8:
                return new yw3((ta5) this.c, (a07) obj2, jt1Var, 8);
            case 9:
                return new yw3((r64) this.c, (String) obj2, jt1Var, 9);
            case 10:
                return new yw3((s74) obj2, jt1Var, 10);
            case 11:
                yw3 yw3Var4 = new yw3((au) obj2, jt1Var, 11);
                yw3Var4.c = obj;
                return yw3Var4;
            case 12:
                return new yw3((Context) this.c, (GlanceAppWidgetReceiver) obj2, jt1Var, 12);
            case 13:
                return new yw3((ym) obj2, jt1Var, 13);
            case 14:
                return new yw3((uc6) this.c, (Uri) obj2, jt1Var, 14);
            case 15:
                return new yw3((yk4) this.c, (owb) obj2, jt1Var, 15);
            case 16:
                return new yw3((ro4) this.c, (String) obj2, jt1Var, 16);
            case 17:
                return new yw3((vo4) this.c, (String) obj2, jt1Var, 17);
            case 18:
                return new yw3((xr4) obj2, jt1Var, 18);
            case 19:
                return new yw3((dc7) this.c, (fx3) obj2, jt1Var, 19);
            case 20:
                return new yw3((yb4) this.c, (gv4) obj2, jt1Var, 20);
            case 21:
                return new yw3((a07) this.c, (i45) obj2, jt1Var, 21);
            case 22:
                yw3 yw3Var5 = new yw3((i45) obj2, jt1Var, 22);
                yw3Var5.c = obj;
                return yw3Var5;
            case 23:
                return new yw3((List) this.c, this.b, (i45) obj2, jt1Var);
            case 24:
                return new yw3((i45) obj2, jt1Var, 24);
            case 25:
                return new yw3((i45) obj2, jt1Var, 25);
            case 26:
                return new yw3((g95) this.c, (String) obj2, jt1Var, 26);
            case 27:
                return new yw3((pd5) obj2, (kb4) this.c, jt1Var);
            case 28:
                return new yw3((zx7) this.c, (zk7) obj2, jt1Var, 28);
            default:
                return new yw3((gv5) this.c, (vg) obj2, jt1Var, 29);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                return ((yw3) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 1:
                return ((yw3) create((o38) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 2:
                return ((yw3) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 3:
                return ((yw3) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 4:
                return ((yw3) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 5:
                return ((yw3) create((o38) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 6:
                return ((yw3) create((heb) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 7:
                return ((yw3) create((o38) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 8:
                return ((yw3) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 9:
                return ((yw3) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 10:
                return ((yw3) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 11:
                return ((yw3) create((u59) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 12:
                return ((yw3) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 13:
                return ((yw3) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 14:
                return ((yw3) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 15:
                return ((yw3) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 16:
                return ((yw3) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 17:
                return ((yw3) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 18:
                return ((yw3) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 19:
                return ((yw3) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 20:
                return ((yw3) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 21:
                return ((yw3) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 22:
                return ((yw3) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 23:
                return ((yw3) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 24:
                return ((yw3) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 25:
                return ((yw3) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 26:
                return ((yw3) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 27:
                return ((yw3) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 28:
                return ((yw3) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            default:
                ((yw3) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                return xx1.a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:463:0x0a0c, code lost:
    
        if (r1.b(r34) == r10) goto L464;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:260:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0767  */
    /* JADX WARN: Removed duplicated region for block: B:567:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:570:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014c  */
    /* JADX WARN: Type inference failed for: r1v9, types: [hy3, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:317:0x0767 -> B:309:0x0729). Please report as a decompilation issue!!! */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) {
        /*
            Method dump skipped, instruction units count: 2986
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yw3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yw3(Object obj, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.d = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yw3(Object obj, Object obj2, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw3(pd5 pd5Var, kb4 kb4Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 27;
        this.d = pd5Var;
        this.c = kb4Var;
    }
}
