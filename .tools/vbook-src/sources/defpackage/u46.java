package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class u46 extends o1a implements zb4 {
    public ArrayList a;
    public int b;
    public /* synthetic */ dm8 c;
    public /* synthetic */ gv4 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ i46 f;
    public final /* synthetic */ List s;
    public final /* synthetic */ y36 t;
    public final /* synthetic */ mc8 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u46(boolean z, i46 i46Var, List list, y36 y36Var, mc8 mc8Var, jt1 jt1Var) {
        super(3, jt1Var);
        this.e = z;
        this.f = i46Var;
        this.s = list;
        this.t = y36Var;
        this.u = mc8Var;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        y36 y36Var = this.t;
        mc8 mc8Var = this.u;
        u46 u46Var = new u46(this.e, this.f, this.s, y36Var, mc8Var, (jt1) obj3);
        u46Var.c = (dm8) obj;
        u46Var.d = (gv4) obj2;
        return u46Var.invokeSuspend(heb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
    
        if (r6.a.d(r16, r0) == r9) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r5 = r16
            dm8 r6 = r5.c
            gv4 r3 = r5.d
            int r0 = r5.b
            r7 = 2
            r1 = 1
            r8 = 0
            xx1 r9 = defpackage.xx1.a
            if (r0 == 0) goto L26
            if (r0 == r1) goto L1d
            if (r0 != r7) goto L17
            defpackage.e11.e0(r17)
            goto L77
        L17:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r0)
            return r8
        L1d:
            java.util.ArrayList r0 = r5.a
            defpackage.e11.e0(r17)
            r10 = r0
            r0 = r17
            goto L48
        L26:
            defpackage.e11.e0(r17)
            boolean r0 = r5.e
            if (r0 == 0) goto L77
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5.c = r6
            r5.d = r3
            r5.a = r4
            r5.b = r1
            java.util.List r0 = r5.s
            y36 r1 = r5.t
            mc8 r2 = r5.u
            java.lang.Object r0 = defpackage.d56.i(r0, r1, r2, r3, r4, r5)
            if (r0 != r9) goto L47
            goto L76
        L47:
            r10 = r4
        L48:
            gv4 r0 = (defpackage.gv4) r0
            int r1 = r10.size()
            if (r1 <= 0) goto L60
            r14 = 0
            r15 = 62
            java.lang.String r11 = "\n"
            r12 = 0
            r13 = 0
            java.lang.String r1 = defpackage.fc1.D0(r10, r11, r12, r13, r14, r15)
            i46 r2 = r5.f
            r2.p(r1)
        L60:
            boolean r1 = defpackage.lc5.Q(r0, r3)
            if (r1 != 0) goto L77
            r5.c = r8
            r5.d = r8
            r5.a = r8
            r5.b = r7
            ct7 r1 = r6.a
            java.lang.Object r0 = r1.d(r5, r0)
            if (r0 != r9) goto L77
        L76:
            return r9
        L77:
            heb r0 = defpackage.heb.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u46.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
