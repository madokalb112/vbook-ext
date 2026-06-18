package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class li9 extends om8 implements yb4 {
    public Object b;
    public Iterator c;
    public int d;
    public int e;
    public int f;
    public /* synthetic */ Object s;
    public final /* synthetic */ int t;
    public final /* synthetic */ int u;
    public final /* synthetic */ Iterator v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public li9(int i, int i2, Iterator it, jt1 jt1Var) {
        super(2, jt1Var);
        this.t = i;
        this.u = i2;
        this.v = it;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        li9 li9Var = new li9(this.t, this.u, this.v, jt1Var);
        li9Var.s = obj;
        return li9Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        return ((li9) create((b39) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0138 A[SYNTHETIC] */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.li9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
