package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class c01 extends o1a implements zb4 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ int c;
    public /* synthetic */ int d;
    public final /* synthetic */ c24 e;
    public final /* synthetic */ dj0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c01(dj0 dj0Var, c24 c24Var, jt1 jt1Var, int i) {
        super(3, jt1Var);
        this.a = i;
        this.f = dj0Var;
        this.e = c24Var;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        heb hebVar = heb.a;
        c24 c24Var = this.e;
        dj0 dj0Var = this.f;
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        jt1 jt1Var = (jt1) obj3;
        switch (i) {
            case 0:
                c01 c01Var = new c01((e01) dj0Var, c24Var, jt1Var, 0);
                c01Var.c = iIntValue;
                c01Var.d = iIntValue2;
                return c01Var.invokeSuspend(hebVar);
            case 1:
                c01 c01Var2 = new c01((re3) dj0Var, c24Var, jt1Var, 1);
                c01Var2.c = iIntValue;
                c01Var2.d = iIntValue2;
                return c01Var2.invokeSuspend(hebVar);
            case 2:
                c01 c01Var3 = new c01((ve3) dj0Var, c24Var, jt1Var, 2);
                c01Var3.c = iIntValue;
                c01Var3.d = iIntValue2;
                return c01Var3.invokeSuspend(hebVar);
            case 3:
                c01 c01Var4 = new c01((iq4) dj0Var, c24Var, jt1Var, 3);
                c01Var4.c = iIntValue;
                c01Var4.d = iIntValue2;
                return c01Var4.invokeSuspend(hebVar);
            default:
                c01 c01Var5 = new c01((x9b) dj0Var, c24Var, jt1Var, 4);
                c01Var5.c = iIntValue;
                c01Var5.d = iIntValue2;
                return c01Var5.invokeSuspend(hebVar);
        }
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        dj0 dj0Var = this.f;
        xx1 xx1Var = xx1.a;
        switch (i) {
            case 0:
                int i2 = this.c;
                int i3 = this.d;
                int i4 = this.b;
                if (i4 == 0) {
                    e11.e0(obj);
                    this.c = i2;
                    this.d = i3;
                    this.b = 1;
                    if (dj0.f((e01) dj0Var, this.e, om3.d, i2, i3, this) == xx1Var) {
                    }
                } else if (i4 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            case 1:
                int i5 = this.c;
                int i6 = this.d;
                int i7 = this.b;
                if (i7 == 0) {
                    e11.e0(obj);
                    this.c = i5;
                    this.d = i6;
                    this.b = 1;
                    if (dj0.f((re3) dj0Var, this.e, om3.d, i5, i6, this) == xx1Var) {
                    }
                } else if (i7 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            case 2:
                int i8 = this.c;
                int i9 = this.d;
                int i10 = this.b;
                if (i10 == 0) {
                    e11.e0(obj);
                    this.c = i8;
                    this.d = i9;
                    this.b = 1;
                    if (dj0.f((ve3) dj0Var, this.e, om3.d, i8, i9, this) == xx1Var) {
                    }
                } else if (i10 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            case 3:
                int i11 = this.c;
                int i12 = this.d;
                int i13 = this.b;
                if (i13 == 0) {
                    e11.e0(obj);
                    this.c = i11;
                    this.d = i12;
                    this.b = 1;
                    if (dj0.f((iq4) dj0Var, this.e, om3.d, i11, i12, this) == xx1Var) {
                    }
                } else if (i13 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            default:
                int i14 = this.c;
                int i15 = this.d;
                int i16 = this.b;
                if (i16 == 0) {
                    e11.e0(obj);
                    this.c = i14;
                    this.d = i15;
                    this.b = 1;
                    if (dj0.f((x9b) dj0Var, this.e, om3.d, i14, i15, this) == xx1Var) {
                    }
                } else if (i16 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
        }
        return xx1Var;
    }
}
