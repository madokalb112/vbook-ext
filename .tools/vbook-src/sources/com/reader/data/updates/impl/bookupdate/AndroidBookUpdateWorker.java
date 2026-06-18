package com.reader.data.updates.impl.bookupdate;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import defpackage.d6a;
import defpackage.dp5;
import defpackage.ex1;
import defpackage.fk5;
import defpackage.fr9;
import defpackage.gr9;
import defpackage.r90;
import defpackage.ub;
import defpackage.xu5;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class AndroidBookUpdateWorker extends CoroutineWorker implements fk5 {
    public static final fr9 k;
    public static final fr9 l;
    public final dp5 g;
    public final dp5 h;
    public final dp5 i;
    public final d6a j;

    static {
        fr9 fr9VarA = gr9.a(Boolean.FALSE);
        k = fr9VarA;
        l = fr9VarA;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidBookUpdateWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        r90 r90Var = new r90(this, 5);
        xu5 xu5Var = xu5.a;
        this.g = ex1.Z(xu5Var, r90Var);
        this.h = ex1.Z(xu5Var, new r90(this, 6));
        this.i = ex1.Z(xu5Var, new r90(this, 7));
        this.j = new d6a(new ub(this, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.jt1 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.lc
            if (r0 == 0) goto L13
            r0 = r5
            lc r0 = (defpackage.lc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L1a
        L13:
            lc r0 = new lc
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
            goto L42
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            return r2
        L2e:
            defpackage.e11.e0(r5)
            w r5 = new w
            r1 = 7
            r5.<init>(r4, r2, r1)
            r0.c = r3
            java.lang.Object r5 = defpackage.wx1.a0(r5, r0)
            xx1 r4 = defpackage.xx1.a
            if (r5 != r4) goto L42
            return r4
        L42:
            r5.getClass()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reader.data.updates.impl.bookupdate.AndroidBookUpdateWorker.c(jt1):java.lang.Object");
    }
}
