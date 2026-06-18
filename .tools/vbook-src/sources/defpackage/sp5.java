package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class sp5 extends o1a implements zb4 {
    public final /* synthetic */ int a;
    public /* synthetic */ long b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ib4 e;
    public final /* synthetic */ ib4 f;
    public final /* synthetic */ ux8 s;
    public final /* synthetic */ kb4 t;
    public final /* synthetic */ kb4 u;
    public final /* synthetic */ kb4 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sp5(float f, boolean z, ib4 ib4Var, ib4 ib4Var2, ux8 ux8Var, kb4 kb4Var, kb4 kb4Var2, kb4 kb4Var3, jt1 jt1Var, int i) {
        super(3, jt1Var);
        this.a = i;
        this.c = f;
        this.d = z;
        this.e = ib4Var;
        this.f = ib4Var2;
        this.s = ux8Var;
        this.t = kb4Var;
        this.u = kb4Var2;
        this.v = kb4Var3;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                long j = ((eb7) obj2).a;
                kb4 kb4Var = this.v;
                sp5 sp5Var = new sp5(this.c, this.d, this.e, this.f, this.s, this.t, this.u, kb4Var, (jt1) obj3, 0);
                sp5Var.b = j;
                return sp5Var.invokeSuspend(hebVar);
            default:
                long j2 = ((eb7) obj2).a;
                kb4 kb4Var2 = this.v;
                sp5 sp5Var2 = new sp5(this.c, this.d, this.e, this.f, this.s, this.t, this.u, kb4Var2, (jt1) obj3, 1);
                sp5Var2.b = j2;
                return sp5Var2.invokeSuspend(hebVar);
        }
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        kb4 kb4Var = this.u;
        ux8 ux8Var = this.s;
        ib4 ib4Var = this.e;
        float f = this.c;
        heb hebVar = heb.a;
        boolean z = this.d;
        ib4 ib4Var2 = this.f;
        kb4 kb4Var2 = this.t;
        kb4 kb4Var3 = this.v;
        switch (i) {
            case 0:
                long j = this.b;
                e11.e0(obj);
                if (f > 0.0f) {
                    float fIntBitsToFloat = (z ? f - Float.intBitsToFloat((int) (j & 4294967295L)) : Float.intBitsToFloat((int) (j & 4294967295L))) / f;
                    float fFloatValue = z ? (1.0f - ((Number) ib4Var.invoke()).floatValue()) - ((Number) ib4Var2.invoke()).floatValue() : ((Number) ib4Var.invoke()).floatValue();
                    float fFloatValue2 = ((Number) ib4Var2.invoke()).floatValue();
                    int iOrdinal = ux8Var.ordinal();
                    if (iOrdinal == 0) {
                        if (fFloatValue > fIntBitsToFloat || fIntBitsToFloat > fFloatValue2 + fFloatValue) {
                            kb4Var.invoke(new Float(fIntBitsToFloat));
                        } else {
                            kb4Var2.invoke(new Float(fFloatValue));
                        }
                        kb4Var3.invoke(Boolean.TRUE);
                    } else if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            mn5.g();
                        }
                    } else if (fFloatValue <= fIntBitsToFloat && fIntBitsToFloat <= fFloatValue2 + fFloatValue) {
                        kb4Var2.invoke(new Float(fFloatValue));
                        kb4Var3.invoke(Boolean.TRUE);
                    }
                }
                break;
            default:
                long j2 = this.b;
                e11.e0(obj);
                if (f > 0.0f) {
                    float fIntBitsToFloat2 = (z ? f - Float.intBitsToFloat((int) (j2 & 4294967295L)) : Float.intBitsToFloat((int) (j2 & 4294967295L))) / f;
                    float fFloatValue3 = z ? (1.0f - ((Number) ib4Var.invoke()).floatValue()) - ((Number) ib4Var2.invoke()).floatValue() : ((Number) ib4Var.invoke()).floatValue();
                    float fFloatValue4 = ((Number) ib4Var2.invoke()).floatValue();
                    int iOrdinal2 = ux8Var.ordinal();
                    if (iOrdinal2 == 0) {
                        if (fFloatValue3 > fIntBitsToFloat2 || fIntBitsToFloat2 > fFloatValue4 + fFloatValue3) {
                            kb4Var.invoke(new Float(fIntBitsToFloat2));
                        } else {
                            kb4Var2.invoke(new Float(fFloatValue3));
                        }
                        kb4Var3.invoke(Boolean.TRUE);
                    } else if (iOrdinal2 != 1) {
                        if (iOrdinal2 != 2) {
                            mn5.g();
                        }
                    } else if (fFloatValue3 <= fIntBitsToFloat2 && fIntBitsToFloat2 <= fFloatValue4 + fFloatValue3) {
                        kb4Var2.invoke(new Float(fFloatValue3));
                        kb4Var3.invoke(Boolean.TRUE);
                    }
                }
                break;
        }
        return hebVar;
    }
}
