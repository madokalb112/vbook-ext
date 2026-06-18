package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class d62 extends o1a implements yb4 {
    public /* synthetic */ Object a;
    public final /* synthetic */ String b;
    public final /* synthetic */ double c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d62(String str, double d, jt1 jt1Var) {
        super(2, jt1Var);
        this.b = str;
        this.c = d;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        d62 d62Var = new d62(this.b, this.c, jt1Var);
        d62Var.a = obj;
        return d62Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        d62 d62Var = (d62) create((pz6) obj, (jt1) obj2);
        heb hebVar = heb.a;
        d62Var.invokeSuspend(hebVar);
        return hebVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        e11.e0(obj);
        pz6 pz6Var = (pz6) this.a;
        String str = this.b;
        str.getClass();
        e18 e18Var = new e18(str);
        Double d = new Double(this.c);
        pz6Var.getClass();
        pz6Var.f(e18Var, d);
        return heb.a;
    }
}
