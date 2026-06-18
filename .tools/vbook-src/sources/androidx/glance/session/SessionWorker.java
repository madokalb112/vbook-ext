package androidx.glance.session;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import defpackage.aj2;
import defpackage.nx1;
import defpackage.r76;
import defpackage.rw2;
import defpackage.zf2;
import defpackage.zua;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class SessionWorker extends CoroutineWorker {
    public final WorkerParameters g;
    public final q59 h;
    public final zua i;
    public final nx1 j;
    public final String k;

    public SessionWorker(Context context, WorkerParameters workerParameters, q59 q59Var, zua zuaVar, nx1 nx1Var) {
        super(context, workerParameters);
        this.g = workerParameters;
        this.h = q59Var;
        this.i = zuaVar;
        this.j = nx1Var;
        n32 n32Var = ((zz5) this).b.b;
        q59Var.getClass();
        Object obj = n32Var.a.get("KEY");
        String str = obj instanceof String ? (String) obj : null;
        if (str != null) {
            this.k = str;
        } else {
            gp.j("SessionWorker must be started with a key");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.jt1 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof a69
            if (r0 == 0) goto L13
            r0 = r5
            a69 r0 = (a69) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L1a
        L13:
            a69 r0 = new a69
            kt1 r5 = (defpackage.kt1) r5
            r0.<init>(r4, r5)
        L1a:
            java.lang.Object r5 = r0.a
            int r1 = r0.c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            defpackage.e11.e0(r5)
            goto L45
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            return r2
        L2e:
            defpackage.e11.e0(r5)
            zua r5 = r4.i
            so9 r5 = r5.d
            b69 r1 = new b69
            r1.<init>(r4, r2)
            r0.c = r3
            java.lang.Object r5 = defpackage.rj9.H(r5, r1, r0)
            xx1 r4 = defpackage.xx1.a
            if (r5 != r4) goto L45
            return r4
        L45:
            yz5 r5 = (yz5) r5
            if (r5 != 0) goto L63
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.lang.String r5 = "TIMEOUT_EXIT_REASON"
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r4.put(r5, r0)
            n32 r5 = new n32
            r5.<init>(r4)
            defpackage.cx1.v0(r5)
            xz5 r4 = new xz5
            r4.<init>(r5)
            return r4
        L63:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.session.SessionWorker.c(jt1):java.lang.Object");
    }

    public final nx1 d() {
        return this.j;
    }

    public SessionWorker(Context context, WorkerParameters workerParameters) {
        this(context, workerParameters, w59.a, null, null, 24, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SessionWorker(Context context, WorkerParameters workerParameters, q59 q59Var, zua zuaVar, nx1 nx1Var, int i, zf2 zf2Var) {
        q59 q59Var2 = (i & 4) != 0 ? w59.a : q59Var;
        zua zuaVar2 = (i & 8) != 0 ? new zua() : zuaVar;
        if ((i & 16) != 0) {
            aj2 aj2Var = rw2.a;
            nx1Var = r76.a;
        }
        this(context, workerParameters, q59Var2, zuaVar2, nx1Var);
    }
}
