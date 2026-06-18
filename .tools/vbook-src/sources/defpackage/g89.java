package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class g89 {
    public final iua a;
    public final h42 b;
    public final AtomicReference c;

    public g89(jx1 jx1Var, iua iuaVar, h42 h42Var) {
        jx1Var.getClass();
        iuaVar.getClass();
        h42Var.getClass();
        this.a = iuaVar;
        this.b = h42Var;
        this.c = new AtomicReference();
        ah1.J(wx1.b(jx1Var), null, null, new e89(this, null, 0), 3);
    }

    public final b59 a() throws Throwable {
        AtomicReference atomicReference = this.c;
        if (atomicReference.get() == null) {
            Object objS = ah1.S(hc3.a, new e89(this, null, 1));
            while (!atomicReference.compareAndSet(null, objS) && atomicReference.get() == null) {
            }
        }
        Object obj = atomicReference.get();
        obj.getClass();
        return (b59) obj;
    }

    public final boolean b() {
        Long l = a().e;
        Integer num = a().d;
        if (l == null || num == null) {
            return true;
        }
        this.a.getClass();
        return iua.a().c - l.longValue() >= ((long) num.intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.b59 r5, defpackage.kt1 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.f89
            if (r0 == 0) goto L13
            r0 = r6
            f89 r0 = (defpackage.f89) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            f89 r0 = new f89
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.e11.e0(r6)     // Catch: java.io.IOException -> L43
            goto L57
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            return r2
        L2c:
            defpackage.e11.e0(r6)
            h42 r4 = r4.b     // Catch: java.io.IOException -> L43
            ne0 r6 = new ne0     // Catch: java.io.IOException -> L43
            r1 = 22
            r6.<init>(r5, r2, r1)     // Catch: java.io.IOException -> L43
            r0.c = r3     // Catch: java.io.IOException -> L43
            java.lang.Object r4 = r4.a(r6, r0)     // Catch: java.io.IOException -> L43
            xx1 r5 = defpackage.xx1.a
            if (r4 != r5) goto L57
            return r5
        L43:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Failed to update config values: "
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "FirebaseSessions"
            android.util.Log.w(r5, r4)
        L57:
            heb r4 = defpackage.heb.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g89.c(b59, kt1):java.lang.Object");
    }
}
