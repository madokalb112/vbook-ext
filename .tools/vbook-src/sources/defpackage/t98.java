package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class t98 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ u98 d;
    public final /* synthetic */ bi5 e;
    public final /* synthetic */ lm8 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t98(u98 u98Var, bi5 bi5Var, lm8 lm8Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.d = u98Var;
        this.e = bi5Var;
        this.f = lm8Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                t98 t98Var = new t98(this.d, this.e, this.f, jt1Var, 0);
                t98Var.c = obj;
                return t98Var;
            case 1:
                t98 t98Var2 = new t98(this.d, this.e, this.f, jt1Var, 1);
                t98Var2.c = obj;
                return t98Var2;
            case 2:
                t98 t98Var3 = new t98(this.d, this.e, this.f, jt1Var, 2);
                t98Var3.c = obj;
                return t98Var3;
            case 3:
                t98 t98Var4 = new t98(this.d, this.e, this.f, jt1Var, 3);
                t98Var4.c = obj;
                return t98Var4;
            default:
                t98 t98Var5 = new t98(this.d, this.e, this.f, jt1Var, 4);
                t98Var5.c = obj;
                return t98Var5;
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
        return ((t98) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Object pm8Var;
        Object value;
        Object value2;
        Object objH;
        Object value3;
        Object pm8Var2;
        Object value4;
        Object value5;
        Object objI;
        Object value6;
        Object pm8Var3;
        Object value7;
        Object value8;
        Object objK;
        Object value9;
        Object pm8Var4;
        Object value10;
        Object value11;
        Object objL;
        Object value12;
        Object pm8Var5;
        Object value13;
        Object value14;
        Object objM;
        Object value15;
        int i = this.a;
        heb hebVar = heb.a;
        lm8 lm8Var = this.f;
        xx1 xx1Var = xx1.a;
        u98 u98Var = this.d;
        bi5 bi5Var = this.e;
        switch (i) {
            case 0:
                int i2 = this.b;
                try {
                    if (i2 == 0) {
                        e11.e0(obj);
                        fr9 fr9Var = u98Var.d;
                        if (fr9Var != null) {
                            do {
                                value3 = fr9Var.getValue();
                            } while (!fr9Var.j(value3, o98.a((o98) value3, null, null, null, null, new n78("", 0), false, 0L, 0L, 0, 0, 0, 0, 0, 0, false, false, 65519)));
                        }
                        y78 y78Var = u98Var.c;
                        this.c = null;
                        this.b = 1;
                        objH = ((c98) y78Var).H(bi5Var, lm8Var, this);
                        if (objH == xx1Var) {
                        }
                    } else if (i2 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                        objH = obj;
                    }
                    pm8Var = (n78) objH;
                } catch (Throwable th) {
                    pm8Var = new pm8(th);
                }
                if (!(pm8Var instanceof pm8)) {
                    n78 n78Var = (n78) pm8Var;
                    fr9 fr9Var2 = u98Var.d;
                    if (fr9Var2 != null) {
                        do {
                            value2 = fr9Var2.getValue();
                        } while (!fr9Var2.j(value2, o98.a((o98) value2, null, null, null, null, n78Var, false, 0L, 0L, 0, 0, 0, 0, 0, 0, false, false, 65519)));
                    }
                    u98Var.i(u98Var.e, new g98(bi5Var.getName()));
                }
                if (qm8.a(pm8Var) != null) {
                    fr9 fr9Var3 = u98Var.d;
                    if (fr9Var3 != null) {
                        do {
                            value = fr9Var3.getValue();
                        } while (!fr9Var3.j(value, o98.a((o98) value, null, null, null, null, null, false, 0L, 0L, 0, 0, 0, 0, 0, 0, false, false, 65519)));
                    }
                    u98Var.i(u98Var.e, new f98(bi5Var.getName()));
                }
                break;
            case 1:
                int i3 = this.b;
                try {
                    if (i3 == 0) {
                        e11.e0(obj);
                        fr9 fr9Var4 = u98Var.d;
                        if (fr9Var4 != null) {
                            do {
                                value6 = fr9Var4.getValue();
                            } while (!fr9Var4.j(value6, o98.a((o98) value6, null, new n78("", 0), null, null, null, false, 0L, 0L, 0, 0, 0, 0, 0, 0, false, false, 65533)));
                        }
                        y78 y78Var2 = u98Var.c;
                        this.c = null;
                        this.b = 1;
                        objI = ((c98) y78Var2).I(bi5Var, lm8Var, this);
                        if (objI == xx1Var) {
                        }
                    } else if (i3 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                        objI = obj;
                    }
                    pm8Var2 = (n78) objI;
                } catch (Throwable th2) {
                    pm8Var2 = new pm8(th2);
                }
                if (!(pm8Var2 instanceof pm8)) {
                    n78 n78Var2 = (n78) pm8Var2;
                    fr9 fr9Var5 = u98Var.d;
                    if (fr9Var5 != null) {
                        do {
                            value5 = fr9Var5.getValue();
                        } while (!fr9Var5.j(value5, o98.a((o98) value5, null, n78Var2, null, null, null, false, 0L, 0L, 0, 0, 0, 0, 0, 0, false, false, 65533)));
                    }
                    u98Var.i(u98Var.e, new g98(bi5Var.getName()));
                }
                if (qm8.a(pm8Var2) != null) {
                    fr9 fr9Var6 = u98Var.d;
                    if (fr9Var6 != null) {
                        do {
                            value4 = fr9Var6.getValue();
                        } while (!fr9Var6.j(value4, o98.a((o98) value4, null, null, null, null, null, false, 0L, 0L, 0, 0, 0, 0, 0, 0, false, false, 65533)));
                    }
                    u98Var.i(u98Var.e, new f98(bi5Var.getName()));
                }
                break;
            case 2:
                int i4 = this.b;
                try {
                    if (i4 == 0) {
                        e11.e0(obj);
                        fr9 fr9Var7 = u98Var.d;
                        if (fr9Var7 != null) {
                            do {
                                value9 = fr9Var7.getValue();
                            } while (!fr9Var7.j(value9, o98.a((o98) value9, null, null, new n78("", 0), null, null, false, 0L, 0L, 0, 0, 0, 0, 0, 0, false, false, 65531)));
                        }
                        y78 y78Var3 = u98Var.c;
                        this.c = null;
                        this.b = 1;
                        objK = ((c98) y78Var3).K(bi5Var, lm8Var, this);
                        if (objK == xx1Var) {
                        }
                    } else if (i4 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                        objK = obj;
                    }
                    pm8Var3 = (n78) objK;
                } catch (Throwable th3) {
                    pm8Var3 = new pm8(th3);
                }
                if (!(pm8Var3 instanceof pm8)) {
                    n78 n78Var3 = (n78) pm8Var3;
                    fr9 fr9Var8 = u98Var.d;
                    if (fr9Var8 != null) {
                        do {
                            value8 = fr9Var8.getValue();
                        } while (!fr9Var8.j(value8, o98.a((o98) value8, null, null, n78Var3, null, null, false, 0L, 0L, 0, 0, 0, 0, 0, 0, false, false, 65531)));
                    }
                    u98Var.i(u98Var.e, new g98(bi5Var.getName()));
                }
                if (qm8.a(pm8Var3) != null) {
                    fr9 fr9Var9 = u98Var.d;
                    if (fr9Var9 != null) {
                        do {
                            value7 = fr9Var9.getValue();
                        } while (!fr9Var9.j(value7, o98.a((o98) value7, null, null, null, null, null, false, 0L, 0L, 0, 0, 0, 0, 0, 0, false, false, 65531)));
                    }
                    u98Var.i(u98Var.e, new f98(bi5Var.getName()));
                }
                break;
            case 3:
                int i5 = this.b;
                try {
                    if (i5 == 0) {
                        e11.e0(obj);
                        fr9 fr9Var10 = u98Var.d;
                        if (fr9Var10 != null) {
                            do {
                                value12 = fr9Var10.getValue();
                            } while (!fr9Var10.j(value12, o98.a((o98) value12, null, null, null, new n78("", 0), null, false, 0L, 0L, 0, 0, 0, 0, 0, 0, false, false, 65527)));
                        }
                        y78 y78Var4 = u98Var.c;
                        this.c = null;
                        this.b = 1;
                        objL = ((c98) y78Var4).L(bi5Var, lm8Var, this);
                        if (objL == xx1Var) {
                        }
                    } else if (i5 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                        objL = obj;
                    }
                    pm8Var4 = (n78) objL;
                } catch (Throwable th4) {
                    pm8Var4 = new pm8(th4);
                }
                if (!(pm8Var4 instanceof pm8)) {
                    n78 n78Var4 = (n78) pm8Var4;
                    fr9 fr9Var11 = u98Var.d;
                    if (fr9Var11 != null) {
                        do {
                            value11 = fr9Var11.getValue();
                        } while (!fr9Var11.j(value11, o98.a((o98) value11, null, null, null, n78Var4, null, false, 0L, 0L, 0, 0, 0, 0, 0, 0, false, false, 65527)));
                    }
                    u98Var.i(u98Var.e, new g98(bi5Var.getName()));
                }
                if (qm8.a(pm8Var4) != null) {
                    fr9 fr9Var12 = u98Var.d;
                    if (fr9Var12 != null) {
                        do {
                            value10 = fr9Var12.getValue();
                        } while (!fr9Var12.j(value10, o98.a((o98) value10, null, null, null, null, null, false, 0L, 0L, 0, 0, 0, 0, 0, 0, false, false, 65527)));
                    }
                    u98Var.i(u98Var.e, new f98(bi5Var.getName()));
                }
                break;
            default:
                int i6 = this.b;
                try {
                    if (i6 == 0) {
                        e11.e0(obj);
                        fr9 fr9Var13 = u98Var.d;
                        if (fr9Var13 != null) {
                            do {
                                value15 = fr9Var13.getValue();
                            } while (!fr9Var13.j(value15, o98.a((o98) value15, new n78("", 0), null, null, null, null, false, 0L, 0L, 0, 0, 0, 0, 0, 0, false, false, 65534)));
                        }
                        y78 y78Var5 = u98Var.c;
                        this.c = null;
                        this.b = 1;
                        objM = ((c98) y78Var5).M(bi5Var, lm8Var, this);
                        if (objM == xx1Var) {
                        }
                    } else if (i6 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                        objM = obj;
                    }
                    pm8Var5 = (n78) objM;
                } catch (Throwable th5) {
                    pm8Var5 = new pm8(th5);
                }
                if (!(pm8Var5 instanceof pm8)) {
                    n78 n78Var5 = (n78) pm8Var5;
                    fr9 fr9Var14 = u98Var.d;
                    if (fr9Var14 != null) {
                        do {
                            value14 = fr9Var14.getValue();
                        } while (!fr9Var14.j(value14, o98.a((o98) value14, n78Var5, null, null, null, null, false, 0L, 0L, 0, 0, 0, 0, 0, 0, false, false, 65534)));
                    }
                    u98Var.i(u98Var.e, new g98(bi5Var.getName()));
                }
                Throwable thA = qm8.a(pm8Var5);
                if (thA != null) {
                    thA.printStackTrace();
                    fr9 fr9Var15 = u98Var.d;
                    if (fr9Var15 != null) {
                        do {
                            value13 = fr9Var15.getValue();
                        } while (!fr9Var15.j(value13, o98.a((o98) value13, null, null, null, null, null, false, 0L, 0L, 0, 0, 0, 0, 0, 0, false, false, 65534)));
                    }
                    u98Var.i(u98Var.e, new f98(bi5Var.getName()));
                }
                break;
        }
        return hebVar;
    }
}
