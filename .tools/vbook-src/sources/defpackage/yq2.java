package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class yq2 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public String b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ List f;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ int t;
    public final /* synthetic */ int u;
    public final /* synthetic */ boolean v;
    public Object w;
    public final /* synthetic */ qtb x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yq2(ir2 ir2Var, boolean z, boolean z2, List list, int i, int i2, boolean z3, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 0;
        this.x = ir2Var;
        this.e = z;
        this.s = z2;
        this.f = list;
        this.t = i;
        this.u = i2;
        this.v = z3;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        qtb qtbVar = this.x;
        switch (i) {
            case 0:
                yq2 yq2Var = new yq2((ir2) qtbVar, this.e, this.s, this.f, this.t, this.u, this.v, jt1Var);
                yq2Var.d = obj;
                return yq2Var;
            case 1:
                yq2 yq2Var2 = new yq2((i45) qtbVar, this.e, this.f, this.s, this.t, this.u, this.v, jt1Var, 1);
                yq2Var2.d = obj;
                return yq2Var2;
            case 2:
                yq2 yq2Var3 = new yq2((tb9) qtbVar, this.e, this.f, this.s, this.t, this.u, this.v, jt1Var, 2);
                yq2Var3.d = obj;
                return yq2Var3;
            case 3:
                yq2 yq2Var4 = new yq2((hra) qtbVar, this.e, this.f, this.s, this.t, this.u, this.v, jt1Var, 3);
                yq2Var4.d = obj;
                return yq2Var4;
            default:
                yq2 yq2Var5 = new yq2((h49) qtbVar, this.e, this.f, this.s, this.t, this.u, this.v, jt1Var, 4);
                yq2Var5.d = obj;
                return yq2Var5;
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
        return ((yq2) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d7  */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 1296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yq2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yq2(qtb qtbVar, boolean z, List list, boolean z2, int i, int i2, boolean z3, jt1 jt1Var, int i3) {
        super(2, jt1Var);
        this.a = i3;
        this.x = qtbVar;
        this.e = z;
        this.f = list;
        this.s = z2;
        this.t = i;
        this.u = i2;
        this.v = z3;
    }
}
