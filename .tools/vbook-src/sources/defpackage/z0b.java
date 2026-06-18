package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class z0b extends o1a implements zb4 {
    public /* synthetic */ r0b a;
    public final /* synthetic */ t27 b;
    public final /* synthetic */ ig4 c;
    public final /* synthetic */ mn8 d;
    public final /* synthetic */ x31 e;
    public final /* synthetic */ a07 f;
    public final /* synthetic */ a07 s;
    public final /* synthetic */ a07 t;
    public final /* synthetic */ a07 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0b(t27 t27Var, ig4 ig4Var, mn8 mn8Var, x31 x31Var, a07 a07Var, a07 a07Var2, a07 a07Var3, a07 a07Var4, jt1 jt1Var) {
        super(3, jt1Var);
        this.b = t27Var;
        this.c = ig4Var;
        this.d = mn8Var;
        this.e = x31Var;
        this.f = a07Var;
        this.s = a07Var2;
        this.t = a07Var3;
        this.u = a07Var4;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) throws Throwable {
        a07 a07Var = this.t;
        a07 a07Var2 = this.u;
        z0b z0bVar = new z0b(this.b, this.c, this.d, this.e, this.f, this.s, a07Var, a07Var2, (jt1) obj3);
        z0bVar.a = (r0b) obj2;
        heb hebVar = heb.a;
        z0bVar.invokeSuspend(hebVar);
        return hebVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) throws Throwable {
        r0b r0bVar = this.a;
        e11.e0(obj);
        if (r0bVar instanceof p0b) {
            gx1.R(this.b, ((p0b) r0bVar).a, null);
        } else if (r0bVar instanceof q0b) {
            String str = ((q0b) r0bVar).a;
            ig4 ig4Var = this.c;
            ig4Var.getClass();
            str.getClass();
            ig4Var.b.setValue(str);
            ig4Var.a(true);
        } else {
            if (!(r0bVar instanceof o0b)) {
                mn5.g();
                return null;
            }
            this.d.a.q(new wga("", zk9.h(0, 0), 4));
            this.f.setValue(lc3.a);
            this.s.setValue((Object) null);
            Boolean bool = Boolean.FALSE;
            this.t.setValue(bool);
            this.u.setValue(bool);
            this.e.a();
        }
        return heb.a;
    }
}
