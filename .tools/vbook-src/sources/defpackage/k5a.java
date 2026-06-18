package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class k5a extends o1a implements yb4 {
    public int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ vvb c;
    public final /* synthetic */ z44 d;
    public final /* synthetic */ a07 e;
    public final /* synthetic */ a07 f;
    public final /* synthetic */ a07 s;
    public final /* synthetic */ a07 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5a(boolean z, vvb vvbVar, z44 z44Var, a07 a07Var, a07 a07Var2, a07 a07Var3, a07 a07Var4, jt1 jt1Var) {
        super(2, jt1Var);
        this.b = z;
        this.c = vvbVar;
        this.d = z44Var;
        this.e = a07Var;
        this.f = a07Var2;
        this.s = a07Var3;
        this.t = a07Var4;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        return new k5a(this.b, this.c, this.d, this.e, this.f, this.s, this.t, jt1Var);
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        return ((k5a) create((vx1) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        String str;
        int i = this.a;
        if (i == 0) {
            e11.e0(obj);
            if (this.b) {
                vvb vvbVar = this.c;
                String str2 = vvbVar != null ? vvbVar.a : null;
                if (str2 == null) {
                    str2 = "";
                }
                this.e.setValue(str2);
                String str3 = vvbVar != null ? vvbVar.b : null;
                if (str3 == null) {
                    str3 = "";
                }
                this.f.setValue(str3);
                String str4 = vvbVar != null ? vvbVar.c : null;
                this.s.setValue(str4 != null ? str4 : "");
                String str5 = "/";
                if (vvbVar != null && (str = vvbVar.d) != null && !bw9.a0(str)) {
                    str5 = str;
                }
                this.t.setValue(str5);
                this.a = 1;
                Object objH = tw1.H(100L, this);
                xx1 xx1Var = xx1.a;
                if (objH == xx1Var) {
                    return xx1Var;
                }
            }
            return heb.a;
        }
        if (i != 1) {
            gp.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        e11.e0(obj);
        z44.a(this.d);
        return heb.a;
    }
}
