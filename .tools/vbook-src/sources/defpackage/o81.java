package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class o81 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ ym c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o81(ym ymVar, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = ymVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        ym ymVar = this.c;
        switch (i) {
            case 0:
                return new o81(ymVar, jt1Var, 0);
            case 1:
                return new o81(ymVar, jt1Var, 1);
            case 2:
                return new o81(ymVar, jt1Var, 2);
            case 3:
                return new o81(ymVar, jt1Var, 3);
            case 4:
                return new o81(ymVar, jt1Var, 4);
            case 5:
                return new o81(ymVar, jt1Var, 5);
            case 6:
                return new o81(ymVar, jt1Var, 6);
            case 7:
                return new o81(ymVar, jt1Var, 7);
            case 8:
                return new o81(ymVar, jt1Var, 8);
            case 9:
                return new o81(ymVar, jt1Var, 9);
            case 10:
                return new o81(ymVar, jt1Var, 10);
            default:
                return new o81(ymVar, jt1Var, 11);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        vx1 vx1Var = (vx1) obj;
        jt1 jt1Var = (jt1) obj2;
        switch (i) {
        }
        return ((o81) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Float f;
        p9b p9bVarA0;
        Float f2;
        p9b p9bVarA02;
        Float f3;
        p9b p9bVarA03;
        Float f4;
        p9b p9bVarA04;
        Float f5;
        p9b p9bVarA05;
        Float f6;
        p9b p9bVarA06;
        Float f7;
        p9b p9bVarA07;
        Float f8;
        p9b p9bVarA08;
        int i = this.a;
        ym ymVar = this.c;
        heb hebVar = heb.a;
        xx1 xx1Var = xx1.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    Float f9 = new Float(0.0f);
                    this.b = 1;
                    if (ymVar.f(this, f9) != xx1Var) {
                    }
                } else if (i2 == 1) {
                    e11.e0(obj);
                } else if (i2 == 2) {
                    e11.e0(obj);
                    f = new Float(0.0f);
                    p9bVarA0 = ah1.a0(450, 0, b83.a, 2);
                    this.b = 3;
                    if (ym.b(this.c, f, p9bVarA0, null, this, 12) != xx1Var) {
                    }
                } else if (i2 != 3) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                Float f10 = new Float(1.0f);
                p9b p9bVarA09 = ah1.a0(1100, 0, b83.a, 2);
                this.b = 2;
                if (ym.b(this.c, f10, p9bVarA09, null, this, 12) != xx1Var) {
                    f = new Float(0.0f);
                    p9bVarA0 = ah1.a0(450, 0, b83.a, 2);
                    this.b = 3;
                    if (ym.b(this.c, f, p9bVarA0, null, this, 12) != xx1Var) {
                    }
                }
                break;
            case 1:
                int i3 = this.b;
                if (i3 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    if (ymVar.g(this) == xx1Var) {
                    }
                } else if (i3 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            case 2:
                int i4 = this.b;
                if (i4 == 0) {
                    e11.e0(obj);
                    Float f11 = new Float(0.0f);
                    this.b = 1;
                    if (ymVar.f(this, f11) != xx1Var) {
                    }
                } else if (i4 == 1) {
                    e11.e0(obj);
                } else if (i4 == 2) {
                    e11.e0(obj);
                    f2 = new Float(0.0f);
                    p9bVarA02 = ah1.a0(500, 0, b83.a, 2);
                    this.b = 3;
                    if (ym.b(this.c, f2, p9bVarA02, null, this, 12) != xx1Var) {
                    }
                } else if (i4 != 3) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                Float f12 = new Float(1.0f);
                p9b p9bVarA010 = ah1.a0(1100, 0, b83.a, 2);
                this.b = 2;
                if (ym.b(this.c, f12, p9bVarA010, null, this, 12) != xx1Var) {
                    f2 = new Float(0.0f);
                    p9bVarA02 = ah1.a0(500, 0, b83.a, 2);
                    this.b = 3;
                    if (ym.b(this.c, f2, p9bVarA02, null, this, 12) != xx1Var) {
                    }
                }
                break;
            case 3:
                int i5 = this.b;
                if (i5 == 0) {
                    e11.e0(obj);
                    Float f13 = new Float(360.0f);
                    c75 c75VarH = ah1.H(ah1.a0(4666, 0, b83.d, 2), sj8.a, 0L, 4);
                    this.b = 1;
                    if (ym.b(this.c, f13, c75VarH, null, this, 12) == xx1Var) {
                    }
                } else if (i5 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            case 4:
                int i6 = this.b;
                if (i6 == 0) {
                    e11.e0(obj);
                    Float f14 = new Float(0.0f);
                    this.b = 1;
                    if (ymVar.f(this, f14) != xx1Var) {
                    }
                } else if (i6 == 1) {
                    e11.e0(obj);
                } else if (i6 == 2) {
                    e11.e0(obj);
                    f3 = new Float(0.0f);
                    p9bVarA03 = ah1.a0(500, 0, b83.a, 2);
                    this.b = 3;
                    if (ym.b(this.c, f3, p9bVarA03, null, this, 12) != xx1Var) {
                    }
                } else if (i6 != 3) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                Float f15 = new Float(1.0f);
                p9b p9bVarA011 = ah1.a0(1200, 0, b83.d, 2);
                this.b = 2;
                if (ym.b(this.c, f15, p9bVarA011, null, this, 12) != xx1Var) {
                    f3 = new Float(0.0f);
                    p9bVarA03 = ah1.a0(500, 0, b83.a, 2);
                    this.b = 3;
                    if (ym.b(this.c, f3, p9bVarA03, null, this, 12) != xx1Var) {
                    }
                }
                break;
            case 5:
                int i7 = this.b;
                if (i7 == 0) {
                    e11.e0(obj);
                    Float f16 = new Float(0.0f);
                    this.b = 1;
                    if (ymVar.f(this, f16) != xx1Var) {
                    }
                } else if (i7 == 1) {
                    e11.e0(obj);
                } else if (i7 == 2) {
                    e11.e0(obj);
                    f4 = new Float(0.0f);
                    p9bVarA04 = ah1.a0(800, 0, b83.a, 2);
                    this.b = 3;
                    if (ym.b(this.c, f4, p9bVarA04, null, this, 12) != xx1Var) {
                    }
                } else if (i7 != 3) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                Float f17 = new Float(1.0f);
                p9b p9bVarA012 = ah1.a0(500, 0, b83.a, 2);
                this.b = 2;
                if (ym.b(this.c, f17, p9bVarA012, null, this, 12) != xx1Var) {
                    f4 = new Float(0.0f);
                    p9bVarA04 = ah1.a0(800, 0, b83.a, 2);
                    this.b = 3;
                    if (ym.b(this.c, f4, p9bVarA04, null, this, 12) != xx1Var) {
                    }
                }
                break;
            case 6:
                int i8 = this.b;
                if (i8 == 0) {
                    e11.e0(obj);
                    Float f18 = new Float(0.0f);
                    this.b = 1;
                    if (ymVar.f(this, f18) != xx1Var) {
                    }
                } else if (i8 == 1) {
                    e11.e0(obj);
                } else if (i8 == 2) {
                    e11.e0(obj);
                    f5 = new Float(0.0f);
                    p9bVarA05 = ah1.a0(450, 0, b83.a, 2);
                    this.b = 3;
                    if (ym.b(this.c, f5, p9bVarA05, null, this, 12) != xx1Var) {
                    }
                } else if (i8 != 3) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                Float f19 = new Float(1.0f);
                p9b p9bVarA013 = ah1.a0(1100, 0, b83.a, 2);
                this.b = 2;
                if (ym.b(this.c, f19, p9bVarA013, null, this, 12) != xx1Var) {
                    f5 = new Float(0.0f);
                    p9bVarA05 = ah1.a0(450, 0, b83.a, 2);
                    this.b = 3;
                    if (ym.b(this.c, f5, p9bVarA05, null, this, 12) != xx1Var) {
                    }
                }
                break;
            case 7:
                int i9 = this.b;
                if (i9 == 0) {
                    e11.e0(obj);
                    Float f20 = new Float(0.0f);
                    this.b = 1;
                    if (ymVar.f(this, f20) != xx1Var) {
                    }
                } else if (i9 == 1) {
                    e11.e0(obj);
                } else if (i9 == 2) {
                    e11.e0(obj);
                    f6 = new Float(0.0f);
                    p9bVarA06 = ah1.a0(600, 0, b83.a, 2);
                    this.b = 3;
                    if (ym.b(this.c, f6, p9bVarA06, null, this, 12) != xx1Var) {
                    }
                } else if (i9 != 3) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                Float f21 = new Float(1.0f);
                p9b p9bVarA014 = ah1.a0(1000, 0, b83.a, 2);
                this.b = 2;
                if (ym.b(this.c, f21, p9bVarA014, null, this, 12) != xx1Var) {
                    f6 = new Float(0.0f);
                    p9bVarA06 = ah1.a0(600, 0, b83.a, 2);
                    this.b = 3;
                    if (ym.b(this.c, f6, p9bVarA06, null, this, 12) != xx1Var) {
                    }
                }
                break;
            case 8:
                int i10 = this.b;
                if (i10 == 0) {
                    e11.e0(obj);
                    Float f22 = new Float(0.0f);
                    this.b = 1;
                    if (ymVar.f(this, f22) != xx1Var) {
                    }
                } else if (i10 == 1) {
                    e11.e0(obj);
                } else if (i10 == 2) {
                    e11.e0(obj);
                    f7 = new Float(0.0f);
                    p9bVarA07 = ah1.a0(600, 0, b83.a, 2);
                    this.b = 3;
                    if (ym.b(this.c, f7, p9bVarA07, null, this, 12) != xx1Var) {
                    }
                } else if (i10 != 3) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                Float f23 = new Float(1.0f);
                p9b p9bVarA015 = ah1.a0(1400, 0, b83.a, 2);
                this.b = 2;
                if (ym.b(this.c, f23, p9bVarA015, null, this, 12) != xx1Var) {
                    f7 = new Float(0.0f);
                    p9bVarA07 = ah1.a0(600, 0, b83.a, 2);
                    this.b = 3;
                    if (ym.b(this.c, f7, p9bVarA07, null, this, 12) != xx1Var) {
                    }
                }
                break;
            case 9:
                int i11 = this.b;
                if (i11 == 0) {
                    e11.e0(obj);
                    Float f24 = new Float(0.0f);
                    this.b = 1;
                    if (ymVar.f(this, f24) != xx1Var) {
                    }
                } else if (i11 == 1) {
                    e11.e0(obj);
                } else if (i11 == 2) {
                    e11.e0(obj);
                    f8 = new Float(0.0f);
                    p9bVarA08 = ah1.a0(500, 0, b83.a, 2);
                    this.b = 3;
                    if (ym.b(this.c, f8, p9bVarA08, null, this, 12) != xx1Var) {
                    }
                } else if (i11 != 3) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                Float f25 = new Float(0.45f);
                p9b p9bVarA016 = ah1.a0(100, 0, b83.a, 2);
                this.b = 2;
                if (ym.b(this.c, f25, p9bVarA016, null, this, 12) != xx1Var) {
                    f8 = new Float(0.0f);
                    p9bVarA08 = ah1.a0(500, 0, b83.a, 2);
                    this.b = 3;
                    if (ym.b(this.c, f8, p9bVarA08, null, this, 12) != xx1Var) {
                    }
                }
                break;
            case 10:
                int i12 = this.b;
                if (i12 == 0) {
                    e11.e0(obj);
                    Float f26 = new Float(1.0f);
                    p9b p9bVarA017 = ah1.a0(320, 0, null, 6);
                    this.b = 1;
                    if (ym.b(this.c, f26, p9bVarA017, null, this, 12) == xx1Var) {
                    }
                } else if (i12 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            default:
                int i13 = this.b;
                if (i13 == 0) {
                    e11.e0(obj);
                    Float f27 = new Float(0.0f);
                    p9b p9bVarA018 = ah1.a0(320, 0, null, 6);
                    this.b = 1;
                    if (ym.b(this.c, f27, p9bVarA018, null, this, 12) == xx1Var) {
                    }
                } else if (i13 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
        }
        return xx1Var;
    }
}
