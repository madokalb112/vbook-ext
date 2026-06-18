package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class x22 extends o1a implements yb4 {
    public final /* synthetic */ int a = 1;
    public Object b;
    public int c;
    public final /* synthetic */ boolean d;
    public Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x22(jt1 jt1Var, kb4 kb4Var, dp8 dp8Var, boolean z) {
        super(2, jt1Var);
        this.d = z;
        this.f = dp8Var;
        this.s = kb4Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.s;
        boolean z = this.d;
        Object obj3 = this.f;
        switch (i) {
            case 0:
                x22 x22Var = new x22(jt1Var, (kb4) obj2, (dp8) obj3, z);
                x22Var.b = obj;
                return x22Var;
            default:
                x22 x22Var2 = new x22((ir2) obj3, z, (List) obj2, jt1Var);
                x22Var2.e = obj;
                return x22Var2;
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                return ((x22) create((w2b) obj, (jt1) obj2)).invokeSuspend(hebVar);
            default:
                return ((x22) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x22.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x22(ir2 ir2Var, boolean z, List list, jt1 jt1Var) {
        super(2, jt1Var);
        this.f = ir2Var;
        this.d = z;
        this.s = list;
    }
}
