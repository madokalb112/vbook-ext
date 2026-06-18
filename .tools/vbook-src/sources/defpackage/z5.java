package defpackage;

import android.view.ActionMode;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class z5 implements xw2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z5(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.xw2
    public final void a() {
        boolean zIsTerminated;
        int i = this.a;
        boolean z = false;
        jt1 jt1Var = null;
        Object obj = this.b;
        switch (i) {
            case 0:
                w5 w5Var = ((r5) obj).a;
                if (w5Var == null) {
                    gp.j("Launcher has not been initialized");
                } else {
                    w5Var.b();
                }
                break;
            case 1:
                zr2 zr2Var = (zr2) obj;
                zr2Var.dismiss();
                zr2Var.t.e();
                break;
            case 2:
                View view = (fz7) obj;
                view.e();
                view.setTag(2131362476, null);
                ((fz7) view).B.removeViewImmediate(view);
                break;
            case 3:
                gk gkVar = (gk) obj;
                lk9 lk9Var = gkVar.e;
                a09 a09Var = lk9Var.h;
                if (a09Var != null) {
                    a09Var.a();
                }
                lk9Var.a();
                ActionMode actionMode = gkVar.h;
                if (actionMode != null) {
                    actionMode.finish();
                }
                gkVar.h = null;
                break;
            case 4:
                qe0 qe0Var = (qe0) ((re0) obj).c.getValue();
                if (qe0Var != null) {
                    qe0Var.close();
                }
                break;
            case 5:
                ((bx2) obj).b.invoke();
                break;
            case 6:
                ((kga) obj).o();
                break;
            case 7:
                ((u14) obj).a.clear();
                break;
            case 8:
                ((rl1) obj).a.a();
                break;
            case 9:
                ((zr5) obj).d = null;
                break;
            case 10:
                ms5 ms5Var = (ms5) obj;
                r00 r00Var = ms5Var.c;
                if (r00Var != null) {
                    r00Var.a = false;
                }
                ms5Var.c = null;
                break;
            case 11:
                ((is5) obj).f = true;
                break;
            case 12:
                ((oz6) obj).g = null;
                break;
            case 13:
                c97 c97Var = (c97) obj;
                vx1 vx1VarA = utb.a(c97Var);
                aj2 aj2Var = rw2.a;
                c97Var.g(vx1VarA, nh2.c, new b97(c97Var, jt1Var, 2));
                break;
            case 14:
                AutoCloseable autoCloseable = (hub) obj;
                if (autoCloseable instanceof AutoCloseable) {
                    autoCloseable.close();
                } else if (!(autoCloseable instanceof ExecutorService)) {
                    w58.p();
                } else {
                    ExecutorService executorService = (ExecutorService) autoCloseable;
                    if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                        executorService.shutdown();
                        while (!zIsTerminated) {
                            try {
                                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                            } catch (InterruptedException unused) {
                                if (!z) {
                                    executorService.shutdownNow();
                                    z = true;
                                }
                            }
                        }
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
                break;
            case 15:
                xi xiVar = (xi) obj;
                xiVar.b(false);
                xiVar.a(-1.0f);
                xiVar.c(mv8.a);
                break;
            case 16:
                o19 o19Var = (o19) obj;
                o19Var.i();
                o19Var.i.setValue(Boolean.FALSE);
                break;
            case 17:
                ((rla) obj).a.setValue((Object) null);
                break;
            case 18:
                kta ktaVar = (kta) obj;
                LinkedHashMap linkedHashMap = ktaVar.j;
                Iterator it = linkedHashMap.values().iterator();
                while (it.hasNext()) {
                    ((yd5) it.next()).cancel(null);
                }
                linkedHashMap.clear();
                ktaVar.f.clear();
                bh8 bh8Var = ktaVar.i;
                if (bh8Var != null) {
                    try {
                        j39.u(bh8Var);
                        break;
                    } catch (Throwable unused2) {
                    }
                }
                ktaVar.i = null;
                break;
            default:
                ((yf1) obj).S((lk9) null);
                break;
        }
    }
}
