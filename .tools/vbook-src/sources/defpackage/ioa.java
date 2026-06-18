package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ioa extends o1a implements yb4 {
    public final /* synthetic */ joa a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ioa(joa joaVar, long j, boolean z, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = joaVar;
        this.b = j;
        this.c = z;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        return new ioa(this.a, this.b, this.c, jt1Var);
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        ioa ioaVar = (ioa) create((vx1) obj, (jt1) obj2);
        heb hebVar = heb.a;
        ioaVar.invokeSuspend(hebVar);
        return hebVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Object value;
        e11.e0(obj);
        joa joaVar = this.a;
        q56 q56Var = ((zna) joaVar.s).a.h;
        ni5[] ni5VarArr = rna.m;
        q56Var.e(ni5VarArr[7], Long.valueOf(this.b));
        ((zna) joaVar.s).a.i.e(ni5VarArr[8], Boolean.valueOf(this.c));
        fr9 fr9Var = joaVar.x;
        if (fr9Var != null) {
            do {
                value = fr9Var.getValue();
            } while (!fr9Var.j(value, tla.a((tla) value, 0.0f, 0.0f, this.b, this.c, false, 0.0f, null, 231)));
        }
        joaVar.d.getClass();
        d6a d6aVar = vg3.a;
        vg3.a(gla.a);
        return heb.a;
    }
}
