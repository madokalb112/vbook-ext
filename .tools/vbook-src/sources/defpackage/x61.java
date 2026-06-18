package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class x61 extends o1a implements yb4 {
    public final /* synthetic */ int a = 3;
    public Object b;
    public Object c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ long s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x61(mu7 mu7Var, String str, long j, pja pjaVar, kga kgaVar, ob7 ob7Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.b = mu7Var;
        this.e = str;
        this.s = j;
        this.c = pjaVar;
        this.f = kgaVar;
        this.t = ob7Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.t;
        Object obj3 = this.f;
        switch (i) {
            case 0:
                x61 x61Var = new x61((e71) obj3, this.s, (List) obj2, jt1Var);
                x61Var.e = obj;
                return x61Var;
            case 1:
                x61 x61Var2 = new x61((e71) obj3, (String) obj2, this.s, jt1Var);
                x61Var2.e = obj;
                return x61Var2;
            case 2:
                x61 x61Var3 = new x61((sfb) this.e, (er1) this.c, (ro0) obj3, this.s, (yd5) obj2, jt1Var);
                x61Var3.b = obj;
                return x61Var3;
            case 3:
                return new x61(this.s, (my4) this.e, (float[]) this.c, (a07) obj3, (a07) obj2, jt1Var);
            default:
                return new x61((mu7) this.b, (String) this.e, this.s, (pja) this.c, (kga) obj3, (ob7) obj2, jt1Var);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
        }
        return ((x61) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x026e A[LOOP:0: B:111:0x026e->B:166:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03d3 A[LOOP:3: B:151:0x03d3->B:172:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r46) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1160
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x61.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x61(e71 e71Var, long j, List list, jt1 jt1Var) {
        super(2, jt1Var);
        this.f = e71Var;
        this.s = j;
        this.t = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x61(e71 e71Var, String str, long j, jt1 jt1Var) {
        super(2, jt1Var);
        this.f = e71Var;
        this.t = str;
        this.s = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x61(long j, my4 my4Var, float[] fArr, a07 a07Var, a07 a07Var2, jt1 jt1Var) {
        super(2, jt1Var);
        this.s = j;
        this.e = my4Var;
        this.c = fArr;
        this.f = a07Var;
        this.t = a07Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x61(sfb sfbVar, er1 er1Var, ro0 ro0Var, long j, yd5 yd5Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.e = sfbVar;
        this.c = er1Var;
        this.f = ro0Var;
        this.s = j;
        this.t = yd5Var;
    }
}
