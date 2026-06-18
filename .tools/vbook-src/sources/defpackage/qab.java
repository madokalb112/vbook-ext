package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qab extends o1a implements yb4 {
    public final /* synthetic */ bi5 A;
    public final /* synthetic */ String B;
    public final /* synthetic */ List C;
    public Object a;
    public Object b;
    public Object c;
    public String d;
    public xl7[] e;
    public String f;
    public j55 s;
    public int t;
    public int u;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ rab x;
    public final /* synthetic */ String y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qab(rab rabVar, String str, String str2, bi5 bi5Var, String str3, List list, jt1 jt1Var) {
        super(2, jt1Var);
        this.x = rabVar;
        this.y = str;
        this.z = str2;
        this.A = bi5Var;
        this.B = str3;
        this.C = list;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        qab qabVar = new qab(this.x, this.y, this.z, this.A, this.B, this.C, jt1Var);
        qabVar.w = obj;
        return qabVar;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        return ((qab) create((vx1) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x014d, code lost:
    
        if (((defpackage.l55) r11).b(r12, r0, r29) != r9) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0192 A[LOOP:0: B:51:0x0192->B:63:?, LOOP_START] */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qab.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
