package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class hc extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hc(int i, int i2, jt1 jt1Var) {
        super(i, jt1Var);
        this.a = i2;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new hc(2, 0, jt1Var);
            case 1:
                return new hc(2, 1, jt1Var);
            case 2:
                return new hc(2, 2, jt1Var);
            case 3:
                return new hc(2, 3, jt1Var);
            case 4:
                return new hc(2, 4, jt1Var);
            case 5:
                return new hc(2, 5, jt1Var);
            case 6:
                return new hc(2, 6, jt1Var);
            case 7:
                return new hc(2, 7, jt1Var);
            case 8:
                return new hc(2, 8, jt1Var);
            case 9:
                return new hc(2, 9, jt1Var);
            case 10:
                return new hc(2, 10, jt1Var);
            case 11:
                return new hc(2, 11, jt1Var);
            case 12:
                return new hc(2, 12, jt1Var);
            case 13:
                return new hc(2, 13, jt1Var);
            case 14:
                return new hc(2, 14, jt1Var);
            case 15:
                return new hc(2, 15, jt1Var);
            case 16:
                return new hc(2, 16, jt1Var);
            case 17:
                hc hcVar = new hc(2, 17, jt1Var);
                hcVar.b = ((Number) obj).intValue();
                return hcVar;
            default:
                return new hc(2, 18, jt1Var);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                return ((hc) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 1:
                return ((hc) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 2:
                return ((hc) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 3:
                return ((hc) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 4:
                return ((hc) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 5:
                return ((hc) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 6:
                return ((hc) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 7:
                return ((hc) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 8:
                return ((hc) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 9:
                return ((hc) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 10:
                return ((hc) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 11:
                return ((hc) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 12:
                return ((hc) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 13:
                return ((hc) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 14:
                return ((hc) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 15:
                return ((hc) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 16:
                return ((hc) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 17:
                return ((hc) create(Integer.valueOf(((Number) obj).intValue()), (jt1) obj2)).invokeSuspend(hebVar);
            default:
                return ((hc) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
        }
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.a;
        xx1 xx1Var = xx1.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        e11.e0(obj);
                        return obj;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                pv9 pv9Var = (pv9) mu9.j.getValue();
                this.b = 1;
                Object objY = wn9.y(pv9Var, this);
                return objY == xx1Var ? xx1Var : objY;
            case 1:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        e11.e0(obj);
                        return obj;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                pv9 pv9Var2 = (pv9) vt9.f0.getValue();
                this.b = 1;
                Object objY2 = wn9.y(pv9Var2, this);
                return objY2 == xx1Var ? xx1Var : objY2;
            case 2:
                int i4 = this.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        e11.e0(obj);
                        return obj;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                pv9 pv9Var3 = (pv9) vt9.e0.getValue();
                this.b = 1;
                Object objY3 = wn9.y(pv9Var3, this);
                return objY3 == xx1Var ? xx1Var : objY3;
            case 3:
                int i5 = this.b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        e11.e0(obj);
                        return obj;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                pv9 pv9Var4 = (pv9) vt9.j0.getValue();
                this.b = 1;
                Object objY4 = wn9.y(pv9Var4, this);
                return objY4 == xx1Var ? xx1Var : objY4;
            case 4:
                int i6 = this.b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        e11.e0(obj);
                        return obj;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                pv9 pv9Var5 = (pv9) vt9.h0.getValue();
                this.b = 1;
                Object objY5 = wn9.y(pv9Var5, this);
                return objY5 == xx1Var ? xx1Var : objY5;
            case 5:
                int i7 = this.b;
                if (i7 != 0) {
                    if (i7 == 1) {
                        e11.e0(obj);
                        return obj;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                pv9 pv9Var6 = (pv9) vt9.g0.getValue();
                this.b = 1;
                Object objY6 = wn9.y(pv9Var6, this);
                return objY6 == xx1Var ? xx1Var : objY6;
            case 6:
                int i8 = this.b;
                if (i8 != 0) {
                    if (i8 == 1) {
                        e11.e0(obj);
                        return obj;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                pv9 pv9Var7 = (pv9) vt9.j0.getValue();
                this.b = 1;
                Object objY7 = wn9.y(pv9Var7, this);
                return objY7 == xx1Var ? xx1Var : objY7;
            case 7:
                int i9 = this.b;
                if (i9 != 0) {
                    if (i9 == 1) {
                        e11.e0(obj);
                        return obj;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                pv9 pv9Var8 = (pv9) vt9.i0.getValue();
                this.b = 1;
                Object objY8 = wn9.y(pv9Var8, this);
                return objY8 == xx1Var ? xx1Var : objY8;
            case 8:
                int i10 = this.b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        e11.e0(obj);
                        return obj;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                pv9 pv9Var9 = (pv9) zu9.z.getValue();
                this.b = 1;
                Object objY9 = wn9.y(pv9Var9, this);
                return objY9 == xx1Var ? xx1Var : objY9;
            case 9:
                int i11 = this.b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        e11.e0(obj);
                        return obj;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                pv9 pv9Var10 = (pv9) vt9.l0.getValue();
                this.b = 1;
                Object objY10 = wn9.y(pv9Var10, this);
                return objY10 == xx1Var ? xx1Var : objY10;
            case 10:
                int i12 = this.b;
                if (i12 != 0) {
                    if (i12 == 1) {
                        e11.e0(obj);
                        return obj;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                pv9 pv9Var11 = (pv9) vt9.k0.getValue();
                this.b = 1;
                Object objY11 = wn9.y(pv9Var11, this);
                return objY11 == xx1Var ? xx1Var : objY11;
            case 11:
                int i13 = this.b;
                if (i13 != 0) {
                    if (i13 == 1) {
                        e11.e0(obj);
                        return obj;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                pv9 pv9Var12 = (pv9) mu9.D.getValue();
                this.b = 1;
                Object objY12 = wn9.y(pv9Var12, this);
                return objY12 == xx1Var ? xx1Var : objY12;
            case 12:
                int i14 = this.b;
                if (i14 != 0) {
                    if (i14 == 1) {
                        e11.e0(obj);
                        return obj;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                pv9 pv9Var13 = (pv9) zu9.w.getValue();
                this.b = 1;
                Object objY13 = wn9.y(pv9Var13, this);
                return objY13 == xx1Var ? xx1Var : objY13;
            case 13:
                int i15 = this.b;
                if (i15 != 0) {
                    if (i15 == 1) {
                        e11.e0(obj);
                        return obj;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                pv9 pv9Var14 = (pv9) zu9.y.getValue();
                this.b = 1;
                Object objY14 = wn9.y(pv9Var14, this);
                return objY14 == xx1Var ? xx1Var : objY14;
            case 14:
                int i16 = this.b;
                if (i16 != 0) {
                    if (i16 == 1) {
                        e11.e0(obj);
                        return obj;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                pv9 pv9Var15 = (pv9) iu9.K0.getValue();
                this.b = 1;
                Object objY15 = wn9.y(pv9Var15, this);
                return objY15 == xx1Var ? xx1Var : objY15;
            case 15:
                int i17 = this.b;
                if (i17 != 0) {
                    if (i17 == 1) {
                        e11.e0(obj);
                        return obj;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                pv9 pv9Var16 = (pv9) zu9.z.getValue();
                this.b = 1;
                Object objY16 = wn9.y(pv9Var16, this);
                return objY16 == xx1Var ? xx1Var : objY16;
            case 16:
                int i18 = this.b;
                if (i18 != 0) {
                    if (i18 == 1) {
                        e11.e0(obj);
                        return obj;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                ir0 ir0Var = q77.b;
                this.b = 1;
                ir0Var.getClass();
                Object objK = ir0.K(ir0Var, this);
                return objK == xx1Var ? xx1Var : objK;
            case 17:
                e11.e0(obj);
                return Boolean.valueOf(this.b > 0);
            default:
                int i19 = this.b;
                if (i19 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    if (e11.N(this) == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i19 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return heb.a;
        }
    }
}
