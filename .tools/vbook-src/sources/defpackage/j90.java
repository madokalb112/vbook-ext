package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class j90 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public Object d;
    public Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j90(s5b s5bVar, int i, int i2, a07 a07Var, a07 a07Var2, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 4;
        this.d = s5bVar;
        this.b = i;
        this.c = i2;
        this.e = a07Var;
        this.f = a07Var2;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                return new j90((td5) this.d, (hb1) this.e, this.c, (m90) obj2, jt1Var);
            case 1:
                return new j90((b24[]) this.d, this.c, (AtomicInteger) this.e, (ir0) obj2, jt1Var);
            case 2:
                return new j90((y54) this.e, (String) obj2, jt1Var);
            case 3:
                j90 j90Var = new j90((i45) obj2, this.c, jt1Var, 3);
                j90Var.e = obj;
                return j90Var;
            case 4:
                return new j90((s5b) this.d, this.b, this.c, (a07) this.e, (a07) obj2, jt1Var);
            case 5:
                j90 j90Var2 = new j90((oaa) this.e, this.c, (String) obj2, jt1Var);
                j90Var2.d = obj;
                return j90Var2;
            case 6:
                j90 j90Var3 = new j90((hra) obj2, this.c, jt1Var, 6);
                j90Var3.e = obj;
                return j90Var3;
            case 7:
                return new j90((hra) obj2, jt1Var);
            default:
                return new j90((h49) this.d, (l2b) this.e, (w1b) obj2, this.c, jt1Var);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        vx1 vx1Var = (vx1) obj;
        jt1 jt1Var = (jt1) obj2;
        switch (i) {
        }
        return ((j90) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:189:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0100 A[LOOP:1: B:51:0x0100->B:329:?, LOOP_START] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00f3 -> B:48:0x00f4). Please report as a decompilation issue!!! */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 1670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j90.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j90(td5 td5Var, hb1 hb1Var, int i, m90 m90Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 0;
        this.d = td5Var;
        this.e = hb1Var;
        this.c = i;
        this.f = m90Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j90(h49 h49Var, l2b l2bVar, w1b w1bVar, int i, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 8;
        this.d = h49Var;
        this.e = l2bVar;
        this.f = w1bVar;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j90(oaa oaaVar, int i, String str, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 5;
        this.e = oaaVar;
        this.c = i;
        this.f = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j90(hra hraVar, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 7;
        this.f = hraVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j90(y54 y54Var, String str, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 2;
        this.e = y54Var;
        this.f = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j90(qtb qtbVar, int i, jt1 jt1Var, int i2) {
        super(2, jt1Var);
        this.a = i2;
        this.f = qtbVar;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j90(b24[] b24VarArr, int i, AtomicInteger atomicInteger, ir0 ir0Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 1;
        this.d = b24VarArr;
        this.c = i;
        this.e = atomicInteger;
        this.f = ir0Var;
    }
}
