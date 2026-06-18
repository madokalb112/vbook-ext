package defpackage;

import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class bf0 {
    public static final ur9 a = new ur9(new qv(29));
    public static Boolean b;

    public static final void a(final bp bpVar, final uka ukaVar, final b64 b64Var, final List list, dd4 dd4Var) {
        Executor executor = (Executor) dd4Var.j(a);
        if (executor == null || !b(bpVar.b.length())) {
            dd4Var.f0(-517090505);
            dd4Var.q(false);
            return;
        }
        dd4Var.f0(-518737659);
        final zm5 zm5Var = (zm5) dd4Var.j(xm1.n);
        final pn2 pn2Var = (pn2) dd4Var.j(xm1.h);
        try {
            executor.execute(new Runnable() { // from class: af0
                @Override // java.lang.Runnable
                public final void run() {
                    yz6 yz6VarC;
                    uka ukaVar2 = ukaVar;
                    zm5 zm5Var2 = zm5Var;
                    bp bpVar2 = bpVar;
                    pn2 pn2Var2 = pn2Var;
                    b64 b64Var2 = b64Var;
                    Trace.beginSection("BackgroundTextMeasurement");
                    try {
                        yz6 yz6VarJ = vj9.j();
                        yz6 yz6Var = yz6VarJ instanceof yz6 ? yz6VarJ : null;
                        if (yz6Var == null || (yz6VarC = yz6Var.C((kb4) null, (kb4) null)) == null) {
                            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                        }
                        try {
                            oj9 oj9VarJ = yz6VarC.j();
                            try {
                                uka ukaVarP = tl9.p(ukaVar2, zm5Var2);
                                List list2 = list;
                                if (list2 == null) {
                                    list2 = lc3.a;
                                }
                                nc1 nc1Var = new nc1(bpVar2, ukaVarP, list2, pn2Var2, b64Var2);
                                nc1Var.f();
                                nc1Var.c();
                                oj9.q(oj9VarJ);
                                yz6VarC.w().x();
                                yz6VarC.c();
                                Trace.endSection();
                            } catch (Throwable th) {
                                oj9.q(oj9VarJ);
                                throw th;
                            }
                        } finally {
                        }
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
        dd4Var.q(false);
    }

    public static final boolean b(int i) {
        if (Build.VERSION.SDK_INT >= 28 && i >= 8 && i < 1000) {
            if (b == null) {
                b = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
            }
            Boolean bool = b;
            bool.getClass();
            if (bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
