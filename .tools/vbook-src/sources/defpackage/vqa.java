package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class vqa extends o1a implements yb4 {
    public final /* synthetic */ hra a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vqa(hra hraVar, boolean z, boolean z2, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = hraVar;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        return new vqa(this.a, this.b, this.c, jt1Var);
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        vqa vqaVar = (vqa) create((vx1) obj, (jt1) obj2);
        heb hebVar = heb.a;
        vqaVar.invokeSuspend(hebVar);
        return hebVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Object value;
        e11.e0(obj);
        hra hraVar = this.a;
        km0 km0Var = ((c98) hraVar.S).c.m;
        ni5[] ni5VarArr = x78.q;
        km0Var.e(ni5VarArr[12], Boolean.valueOf(this.b));
        ((c98) hraVar.S).c.n.e(ni5VarArr[13], Boolean.valueOf(this.c));
        hraVar.i(hraVar.i0, dfa.a);
        fr9 fr9Var = hraVar.u0;
        if (fr9Var != null) {
            do {
                value = fr9Var.getValue();
            } while (!fr9Var.j(value, oja.a((oja) value, null, 0, 0, null, null, null, this.b, this.c, 511)));
        }
        return heb.a;
    }
}
