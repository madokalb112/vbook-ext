package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class na extends o1a implements ac4 {
    public int a;
    public /* synthetic */ jb b;
    public /* synthetic */ h86 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ob e;
    public final /* synthetic */ float f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na(ob obVar, float f, jt1 jt1Var) {
        super(4, jt1Var);
        this.e = obVar;
        this.f = f;
    }

    @Override // defpackage.ac4
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        na naVar = new na(this.e, this.f, (jt1) obj4);
        naVar.b = (jb) obj;
        naVar.c = (h86) obj2;
        naVar.d = obj3;
        return naVar.invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        jb jbVar = this.b;
        h86 h86Var = this.c;
        Object obj2 = this.d;
        int i = this.a;
        if (i == 0) {
            e11.e0(obj);
            float fD = h86Var.d(obj2);
            if (!Float.isNaN(fD)) {
                og8 og8Var = new og8();
                ob obVar = this.e;
                float fH = Float.isNaN(obVar.j.h()) ? 0.0f : obVar.j.h();
                og8Var.a = fH;
                p9b p9bVar = obVar.c;
                il6 il6Var = new il6(4, jbVar, og8Var);
                this.b = null;
                this.c = null;
                this.d = null;
                this.a = 1;
                Object objA = uj9.a(fH, fD, this.f, p9bVar, il6Var, this);
                xx1 xx1Var = xx1.a;
                if (objA == xx1Var) {
                    return xx1Var;
                }
            }
        } else {
            if (i != 1) {
                gp.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            e11.e0(obj);
        }
        return heb.a;
    }
}
