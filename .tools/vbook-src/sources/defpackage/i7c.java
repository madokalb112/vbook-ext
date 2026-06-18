package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class i7c extends o1a implements yb4 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ n7c c;
    public final /* synthetic */ float d;
    public final /* synthetic */ kp9 e;
    public final /* synthetic */ long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7c(n7c n7cVar, float f, kp9 kp9Var, long j, jt1 jt1Var) {
        super(2, jt1Var);
        this.c = n7cVar;
        this.d = f;
        this.e = kp9Var;
        this.f = j;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        i7c i7cVar = new i7c(this.c, this.d, this.e, this.f, jt1Var);
        i7cVar.b = obj;
        return i7cVar;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        return ((i7c) create((vx1) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        final vx1 vx1Var = (vx1) this.b;
        int i = this.a;
        if (i == 0) {
            e11.e0(obj);
            final n7c n7cVar = this.c;
            float fG = n7cVar.g();
            float fH = n7cVar.h();
            final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fG)) << 32) | (((long) Float.floatToRawIntBits(fH)) & 4294967295L);
            final float f = n7cVar.f();
            float f2 = this.d;
            final float f3 = f2 - f;
            final long j = this.f;
            yb4 yb4Var = new yb4() { // from class: g7c
                @Override // defpackage.yb4
                public final Object invoke(Object obj2, Object obj3) {
                    float fFloatValue = ((Float) obj2).floatValue();
                    ((Float) obj3).getClass();
                    ah1.J(vx1Var, null, null, new h7c(n7cVar, fFloatValue, j, f3, f, jFloatToRawIntBits, null), 3);
                    return heb.a;
                }
            };
            this.b = null;
            this.a = 1;
            Object objC = uj9.c(f, f2, this.e, yb4Var, this, 4);
            xx1 xx1Var = xx1.a;
            if (objC == xx1Var) {
                return xx1Var;
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
