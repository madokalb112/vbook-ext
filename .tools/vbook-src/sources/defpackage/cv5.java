package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class cv5 extends o1a implements zb4 {
    public /* synthetic */ long a;
    public final /* synthetic */ float b;
    public final /* synthetic */ ux8 c;
    public final /* synthetic */ ib4 d;
    public final /* synthetic */ ib4 e;
    public final /* synthetic */ kb4 f;
    public final /* synthetic */ kb4 s;
    public final /* synthetic */ kb4 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv5(float f, ux8 ux8Var, ib4 ib4Var, ib4 ib4Var2, kb4 kb4Var, kb4 kb4Var2, kb4 kb4Var3, jt1 jt1Var) {
        super(3, jt1Var);
        this.b = f;
        this.c = ux8Var;
        this.d = ib4Var;
        this.e = ib4Var2;
        this.f = kb4Var;
        this.s = kb4Var2;
        this.t = kb4Var3;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        long j = ((eb7) obj2).a;
        kb4 kb4Var = this.s;
        kb4 kb4Var2 = this.t;
        cv5 cv5Var = new cv5(this.b, this.c, this.d, this.e, this.f, kb4Var, kb4Var2, (jt1) obj3);
        cv5Var.a = j;
        return cv5Var.invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        long j = this.a;
        e11.e0(obj);
        float f = this.b;
        heb hebVar = heb.a;
        if (f <= 0.0f) {
            return hebVar;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L)) / f;
        int iOrdinal = this.c.ordinal();
        kb4 kb4Var = this.t;
        kb4 kb4Var2 = this.f;
        ib4 ib4Var = this.e;
        ib4 ib4Var2 = this.d;
        if (iOrdinal == 0) {
            float fFloatValue = ((Number) ib4Var2.invoke()).floatValue();
            float fFloatValue2 = ((Number) ib4Var.invoke()).floatValue();
            if (fFloatValue > fIntBitsToFloat || fIntBitsToFloat > fFloatValue2 + fFloatValue) {
                this.s.invoke(new Float(fIntBitsToFloat));
            } else {
                kb4Var2.invoke(new Float(fFloatValue));
            }
            kb4Var.invoke(Boolean.TRUE);
        } else if (iOrdinal == 1) {
            float fFloatValue3 = ((Number) ib4Var2.invoke()).floatValue();
            float fFloatValue4 = ((Number) ib4Var.invoke()).floatValue();
            if (fFloatValue3 <= fIntBitsToFloat && fIntBitsToFloat <= fFloatValue4 + fFloatValue3) {
                kb4Var2.invoke(new Float(fFloatValue3));
                kb4Var.invoke(Boolean.TRUE);
            }
        } else if (iOrdinal != 2) {
            mn5.g();
            return null;
        }
        return hebVar;
    }
}
