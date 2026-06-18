package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class f2 extends o1a implements zb4 {
    public /* synthetic */ cd6 a;
    public /* synthetic */ long b;

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        long jLongValue = ((Number) obj2).longValue();
        f2 f2Var = new f2(3, (jt1) obj3);
        f2Var.a = (cd6) obj;
        f2Var.b = jLongValue;
        return f2Var.invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        cd6 cd6Var = this.a;
        long j = this.b;
        e11.e0(obj);
        long j2 = cd6Var.b;
        return j2 == 0 ? new Float(0.0f) : new Float(wx1.P(j / j2, 0.0f, 1.0f));
    }
}
