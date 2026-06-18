package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class g69 extends o1a implements yb4 {
    public /* synthetic */ boolean a;

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        g69 g69Var = new g69(2, jt1Var);
        g69Var.a = ((Boolean) obj).booleanValue();
        return g69Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((g69) create(bool, (jt1) obj2)).invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        e11.e0(obj);
        return Boolean.valueOf(this.a);
    }
}
