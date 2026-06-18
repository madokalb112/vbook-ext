package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class gk4 extends om8 implements yb4 {
    public Iterator b;
    public int[] c;
    public int d;
    public int e;
    public int f;
    public /* synthetic */ Object s;
    public final /* synthetic */ hk4 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gk4(hk4 hk4Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.t = hk4Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        gk4 gk4Var = new gk4(this.t, jt1Var);
        gk4Var.s = obj;
        return gk4Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        return ((gk4) create((b39) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0032 -> B:12:0x003b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0043 -> B:18:0x005c). Please report as a decompilation issue!!! */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.s
            b39 r0 = (b39) r0
            int r1 = r9.f
            hk4 r2 = r9.t
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 != r4) goto L1b
            int r1 = r9.e
            int r5 = r9.d
            int[] r6 = r9.c
            java.util.Iterator r7 = r9.b
            defpackage.e11.e0(r10)
            r10 = r7
            goto L5c
        L1b:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r9)
            r9 = 0
            return r9
        L22:
            defpackage.e11.e0(r10)
            java.util.ArrayList r10 = r2.a
            java.util.Iterator r10 = r10.iterator()
            r1 = r3
        L2c:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L63
            java.lang.Object r5 = r10.next()
            int[] r5 = (int[]) r5
            r6 = r5
            r5 = r1
            r1 = r3
        L3b:
            int r7 = r6.length
            if (r1 >= r7) goto L61
            int r7 = r2.a(r5)
            r8 = -1
            if (r7 == r8) goto L5c
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r5)
            r9.s = r0
            r9.b = r10
            r9.c = r6
            r9.d = r5
            r9.e = r1
            r9.f = r4
            r0.e(r9, r2)
            xx1 r9 = defpackage.xx1.a
            return r9
        L5c:
            int r1 = r1 + 6
            int r5 = r5 + 6
            goto L3b
        L61:
            r1 = r5
            goto L2c
        L63:
            heb r9 = defpackage.heb.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gk4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
