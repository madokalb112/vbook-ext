package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class u9a extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public /* synthetic */ Object f;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9a(List list, a07 a07Var, a07 a07Var2, a07 a07Var3, a07 a07Var4, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 1;
        this.c = list;
        this.d = a07Var;
        this.e = a07Var2;
        this.f = a07Var3;
        this.s = a07Var4;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.s;
        switch (i) {
            case 0:
                u9a u9aVar = new u9a((zx7) this.d, (bga) this.e, (qda) this.f, (a28) obj2, jt1Var, 0);
                u9aVar.c = obj;
                return u9aVar;
            case 1:
                return new u9a((List) this.c, (a07) this.d, (a07) this.e, (a07) this.f, (a07) obj2, jt1Var);
            case 2:
                return new u9a((zx7) this.d, (kf8) this.c, (iy1) this.e, (iy1) this.f, (ql7) obj2, jt1Var, 2);
            case 3:
                return new u9a((zx7) this.d, (i49) this.c, (ma0) this.e, (o39) this.f, (fu1) obj2, jt1Var, 3);
            case 4:
                return new u9a((hra) this.e, (String) this.f, (String) obj2, jt1Var, 4);
            case 5:
                u9a u9aVar2 = new u9a((yb4) this.d, (so9) this.e, (vx1) this.f, (AtomicReference) obj2, jt1Var, 5);
                u9aVar2.c = obj;
                return u9aVar2;
            case 6:
                u9a u9aVar3 = new u9a((q2b) this.e, (gy8) this.f, (rg8) obj2, jt1Var, 6);
                u9aVar3.c = obj;
                return u9aVar3;
            case 7:
                u9a u9aVar4 = new u9a((w4c) this.e, (String) this.f, (r5c) obj2, jt1Var, 7);
                u9aVar4.c = obj;
                return u9aVar4;
            case 8:
                u9a u9aVar5 = new u9a((x5c) obj2, jt1Var);
                u9aVar5.f = obj;
                return u9aVar5;
            default:
                u9a u9aVar6 = new u9a((zx7) this.d, (n7c) this.e, (a07) this.f, (a07) obj2, jt1Var, 9);
                u9aVar6.c = obj;
                return u9aVar6;
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
        }
        return ((u9a) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x04f4, code lost:
    
        if (r0 == r7) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x052b, code lost:
    
        if (r0 == r7) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0188, code lost:
    
        if (defpackage.x5c.B(r8, r2, r0, r3, r5) == r7) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04b7 A[PHI: r0 r14
  0x04b7: PHI (r0v40 java.lang.Object) = (r0v39 java.lang.Object), (r0v56 java.lang.Object) binds: [B:136:0x04b3, B:120:0x0417] A[DONT_GENERATE, DONT_INLINE]
  0x04b7: PHI (r14v15 java.util.Map) = (r14v14 java.util.Map), (r14v22 java.util.Map) binds: [B:136:0x04b3, B:120:0x0417] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:222:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01df A[LOOP:0: B:62:0x01df->B:199:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0356  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x02e9 -> B:94:0x02eb). Please report as a decompilation issue!!! */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instruction units count: 1682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u9a.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9a(x5c x5cVar, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 8;
        this.s = x5cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u9a(Object obj, Object obj2, Object obj3, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.e = obj;
        this.f = obj2;
        this.s = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u9a(Object obj, Object obj2, Object obj3, Object obj4, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.s = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u9a(zx7 zx7Var, Object obj, ub4 ub4Var, ub4 ub4Var2, ub4 ub4Var3, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.d = zx7Var;
        this.c = obj;
        this.e = ub4Var;
        this.f = ub4Var2;
        this.s = ub4Var3;
    }
}
