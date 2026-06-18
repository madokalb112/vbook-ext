package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class q98 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u98 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q98(u98 u98Var, int i, jt1 jt1Var, int i2) {
        super(2, jt1Var);
        this.a = i2;
        this.b = u98Var;
        this.c = i;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new q98(this.b, this.c, jt1Var, 0);
            case 1:
                return new q98(this.b, this.c, jt1Var, 1);
            case 2:
                return new q98(this.b, this.c, jt1Var, 2);
            case 3:
                return new q98(this.b, this.c, jt1Var, 3);
            case 4:
                return new q98(this.b, this.c, jt1Var, 4);
            case 5:
                return new q98(this.b, this.c, jt1Var, 5);
            case 6:
                return new q98(this.b, jt1Var, 6);
            case 7:
                return new q98(this.b, jt1Var, 7);
            case 8:
                return new q98(this.b, jt1Var, 8);
            case 9:
                return new q98(this.b, jt1Var, 9);
            default:
                return new q98(this.b, jt1Var, 10);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        vx1 vx1Var = (vx1) obj;
        jt1 jt1Var = (jt1) obj2;
        switch (i) {
            case 0:
                ((q98) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 1:
                ((q98) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 2:
                ((q98) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 3:
                ((q98) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 4:
                ((q98) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 5:
                ((q98) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
        }
        return ((q98) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        int i = this.a;
        xx1 xx1Var = xx1.a;
        heb hebVar = heb.a;
        u98 u98Var = this.b;
        switch (i) {
            case 0:
                e11.e0(obj);
                y78 y78Var = u98Var.c;
                c98 c98Var = (c98) y78Var;
                c98Var.c.f.e(x78.q[5], Integer.valueOf(this.c));
                c98Var.S();
                fr9 fr9Var = u98Var.d;
                int i2 = this.c;
                if (fr9Var != null) {
                    while (true) {
                        Object value6 = fr9Var.getValue();
                        int i3 = i2;
                        if (!fr9Var.j(value6, o98.a((o98) value6, null, null, null, null, null, false, 0L, 0L, 0, 0, 0, i3, 0, 0, false, false, 63487))) {
                            i2 = i3;
                        }
                    }
                }
                break;
            case 1:
                e11.e0(obj);
                y78 y78Var2 = u98Var.c;
                c98 c98Var2 = (c98) y78Var2;
                c98Var2.c.j.e(x78.q[9], Integer.valueOf(this.c));
                c98Var2.S();
                fr9 fr9Var2 = u98Var.d;
                int i4 = this.c;
                if (fr9Var2 != null) {
                    while (true) {
                        Object value7 = fr9Var2.getValue();
                        int i5 = i4;
                        if (!fr9Var2.j(value7, o98.a((o98) value7, null, null, null, null, null, false, 0L, 0L, 0, 0, 0, 0, i5, 0, false, false, 61439))) {
                            i4 = i5;
                        }
                    }
                }
                break;
            case 2:
                e11.e0(obj);
                y78 y78Var3 = u98Var.c;
                c98 c98Var3 = (c98) y78Var3;
                c98Var3.c.g.e(x78.q[6], Integer.valueOf(this.c));
                c98Var3.S();
                fr9 fr9Var3 = u98Var.d;
                int i6 = this.c;
                if (fr9Var3 != null) {
                    while (true) {
                        Object value8 = fr9Var3.getValue();
                        int i7 = i6;
                        if (!fr9Var3.j(value8, o98.a((o98) value8, null, null, null, null, null, false, 0L, 0L, i7, 0, 0, 0, 0, 0, false, false, 65279))) {
                            i6 = i7;
                        }
                    }
                }
                break;
            case 3:
                e11.e0(obj);
                y78 y78Var4 = u98Var.c;
                c98 c98Var4 = (c98) y78Var4;
                c98Var4.c.h.e(x78.q[7], Integer.valueOf(this.c));
                c98Var4.S();
                fr9 fr9Var4 = u98Var.d;
                int i8 = this.c;
                if (fr9Var4 != null) {
                    while (true) {
                        Object value9 = fr9Var4.getValue();
                        int i9 = i8;
                        if (!fr9Var4.j(value9, o98.a((o98) value9, null, null, null, null, null, false, 0L, 0L, 0, i9, 0, 0, 0, 0, false, false, 65023))) {
                            i8 = i9;
                        }
                    }
                }
                break;
            case 4:
                e11.e0(obj);
                y78 y78Var5 = u98Var.c;
                c98 c98Var5 = (c98) y78Var5;
                c98Var5.c.i.e(x78.q[8], Integer.valueOf(this.c));
                c98Var5.S();
                fr9 fr9Var5 = u98Var.d;
                int i10 = this.c;
                if (fr9Var5 != null) {
                    while (true) {
                        Object value10 = fr9Var5.getValue();
                        int i11 = i10;
                        if (!fr9Var5.j(value10, o98.a((o98) value10, null, null, null, null, null, false, 0L, 0L, 0, 0, i11, 0, 0, 0, false, false, 64511))) {
                            i10 = i11;
                        }
                    }
                }
                break;
            case 5:
                e11.e0(obj);
                y78 y78Var6 = u98Var.c;
                c98 c98Var6 = (c98) y78Var6;
                c98Var6.c.k.e(x78.q[10], Integer.valueOf(this.c));
                c98Var6.S();
                fr9 fr9Var6 = u98Var.d;
                int i12 = this.c;
                if (fr9Var6 != null) {
                    while (true) {
                        Object value11 = fr9Var6.getValue();
                        int i13 = i12;
                        if (!fr9Var6.j(value11, o98.a((o98) value11, null, null, null, null, null, false, 0L, 0L, 0, 0, 0, 0, 0, i13, false, false, 57343))) {
                            i12 = i13;
                        }
                    }
                }
                break;
            case 6:
                int i14 = this.c;
                if (i14 == 0) {
                    e11.e0(obj);
                    y78 y78Var7 = u98Var.c;
                    this.c = 1;
                    if (((c98) y78Var7).k(this) == xx1Var) {
                    }
                } else if (i14 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                fr9 fr9Var7 = u98Var.d;
                if (fr9Var7 != null) {
                    do {
                        value = fr9Var7.getValue();
                    } while (!fr9Var7.j(value, o98.a((o98) value, null, null, null, null, null, false, 0L, 0L, 0, 0, 0, 0, 0, 0, false, false, 65519)));
                }
                break;
            case 7:
                int i15 = this.c;
                if (i15 == 0) {
                    e11.e0(obj);
                    y78 y78Var8 = u98Var.c;
                    this.c = 1;
                    if (((c98) y78Var8).l(this) == xx1Var) {
                    }
                } else if (i15 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                fr9 fr9Var8 = u98Var.d;
                if (fr9Var8 != null) {
                    do {
                        value2 = fr9Var8.getValue();
                    } while (!fr9Var8.j(value2, o98.a((o98) value2, null, null, null, null, null, false, 0L, 0L, 0, 0, 0, 0, 0, 0, false, false, 65533)));
                }
                break;
            case 8:
                int i16 = this.c;
                if (i16 == 0) {
                    e11.e0(obj);
                    y78 y78Var9 = u98Var.c;
                    this.c = 1;
                    if (((c98) y78Var9).n(this) == xx1Var) {
                    }
                } else if (i16 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                fr9 fr9Var9 = u98Var.d;
                if (fr9Var9 != null) {
                    do {
                        value3 = fr9Var9.getValue();
                    } while (!fr9Var9.j(value3, o98.a((o98) value3, null, null, null, null, null, false, 0L, 0L, 0, 0, 0, 0, 0, 0, false, false, 65531)));
                }
                break;
            case 9:
                int i17 = this.c;
                if (i17 == 0) {
                    e11.e0(obj);
                    y78 y78Var10 = u98Var.c;
                    this.c = 1;
                    if (((c98) y78Var10).o(this) == xx1Var) {
                    }
                } else if (i17 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                fr9 fr9Var10 = u98Var.d;
                if (fr9Var10 != null) {
                    do {
                        value4 = fr9Var10.getValue();
                    } while (!fr9Var10.j(value4, o98.a((o98) value4, null, null, null, null, null, false, 0L, 0L, 0, 0, 0, 0, 0, 0, false, false, 65527)));
                }
                break;
            default:
                int i18 = this.c;
                if (i18 == 0) {
                    e11.e0(obj);
                    y78 y78Var11 = u98Var.c;
                    this.c = 1;
                    if (((c98) y78Var11).p(this) == xx1Var) {
                    }
                } else if (i18 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                fr9 fr9Var11 = u98Var.d;
                if (fr9Var11 != null) {
                    do {
                        value5 = fr9Var11.getValue();
                    } while (!fr9Var11.j(value5, o98.a((o98) value5, null, null, null, null, null, false, 0L, 0L, 0, 0, 0, 0, 0, 0, false, false, 65534)));
                }
                break;
        }
        return hebVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q98(u98 u98Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.b = u98Var;
    }
}
