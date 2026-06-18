package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class gl0 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gl0(int i, jt1 jt1Var, Object obj, Object obj2, boolean z) {
        super(2, jt1Var);
        this.a = i;
        this.c = z;
        this.d = obj;
        this.b = obj2;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return new gl0((ul0) this.d, this.c, (String) obj2, jt1Var, 0);
            case 1:
                gl0 gl0Var = new gl0((String) obj2, this.c, jt1Var);
                gl0Var.d = obj;
                return gl0Var;
            case 2:
                return new gl0((dw2) this.d, this.c, (String) obj2, jt1Var, 2);
            case 3:
                return new gl0(this.c, (String) obj2, (g95) this.d, jt1Var, 3);
            case 4:
                return new gl0(this.c, (String) obj2, (i95) this.d, jt1Var, 4);
            case 5:
                return new gl0(5, jt1Var, (ihb) this.d, (a07) obj2, this.c);
            default:
                return new gl0(6, jt1Var, (gj8) this.d, this.b, this.c);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                ((gl0) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 1:
                ((gl0) create((pz6) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 2:
                ((gl0) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 3:
                ((gl0) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 4:
                ((gl0) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 5:
                ((gl0) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            default:
                ((gl0) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
        }
        return hebVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [jt1] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        int i = this.a;
        String str = 0;
        str = 0;
        heb hebVar = heb.a;
        boolean z = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                e11.e0(obj);
                ul0 ul0Var = (ul0) this.d;
                String str2 = z ? (String) obj2 : null;
                if (str2 != null && !bw9.a0(str2)) {
                    str = str2;
                }
                if (!ul0Var.x || !lc5.Q(ul0Var.w, str)) {
                    if (str != 0) {
                        ul0Var.l(str);
                    } else {
                        ul0Var.k();
                    }
                }
                break;
            case 1:
                e11.e0(obj);
                pz6 pz6Var = (pz6) this.d;
                e18 e18VarT = i12.t((String) obj2);
                Boolean boolValueOf = Boolean.valueOf(z);
                pz6Var.getClass();
                pz6Var.f(e18VarT, boolValueOf);
                break;
            case 2:
                e11.e0(obj);
                dw2 dw2Var = (dw2) this.d;
                String str3 = z ? (String) obj2 : null;
                if (str3 == null) {
                    str3 = "";
                }
                if (!dw2Var.v || !lc5.Q(dw2Var.u, str3)) {
                    if (!bw9.a0(str3)) {
                        dw2Var.l(str3);
                    } else {
                        dw2Var.k();
                    }
                }
                break;
            case 3:
                g95 g95Var = (g95) this.d;
                fr9 fr9Var = g95Var.d;
                String str4 = (String) obj2;
                e11.e0(obj);
                if (z && !bw9.a0(str4)) {
                    yd5 yd5Var = g95Var.e;
                    if (yd5Var != null) {
                        yd5Var.cancel(null);
                    }
                    if (!bw9.a0(str4)) {
                        if (fr9Var != null) {
                            do {
                                value2 = fr9Var.getValue();
                            } while (!fr9Var.j(value2, new f95(str4, 4)));
                        }
                        za1 za1VarA = vtb.a(g95Var);
                        aj2 aj2Var = rw2.a;
                        g95Var.e = g95Var.g(za1VarA, nh2.c, new yw3(g95Var, str4, (jt1) str, 26));
                    } else if (fr9Var != null) {
                        do {
                            value3 = fr9Var.getValue();
                        } while (!fr9Var.j(value3, new f95(null, 7)));
                    }
                } else if (!z) {
                    yd5 yd5Var2 = g95Var.e;
                    if (yd5Var2 != null) {
                        yd5Var2.cancel(null);
                    }
                    if (fr9Var != null) {
                        do {
                            value = fr9Var.getValue();
                        } while (!fr9Var.j(value, new f95(null, 7)));
                    }
                }
                break;
            case 4:
                i95 i95Var = (i95) this.d;
                fr9 fr9Var2 = i95Var.e;
                String str5 = (String) obj2;
                e11.e0(obj);
                if (z && !bw9.a0(str5)) {
                    yd5 yd5Var3 = i95Var.f;
                    if (yd5Var3 != null) {
                        yd5Var3.cancel(null);
                    }
                    if (!bw9.a0(str5)) {
                        if (fr9Var2 != null) {
                            do {
                                value5 = fr9Var2.getValue();
                            } while (!fr9Var2.j(value5, new h95(str5, 4)));
                        }
                        za1 za1VarA2 = vtb.a(i95Var);
                        aj2 aj2Var2 = rw2.a;
                        i95Var.f = i95Var.g(za1VarA2, nh2.c, new mt4((qtb) i95Var, str5, (jt1) str, 2));
                    } else if (fr9Var2 != null) {
                        do {
                            value6 = fr9Var2.getValue();
                        } while (!fr9Var2.j(value6, new h95(null, 7)));
                    }
                } else if (!z) {
                    yd5 yd5Var4 = i95Var.f;
                    if (yd5Var4 != null) {
                        yd5Var4.cancel(null);
                    }
                    if (fr9Var2 != null) {
                        do {
                            value4 = fr9Var2.getValue();
                        } while (!fr9Var2.j(value4, new h95(null, 7)));
                    }
                }
                break;
            case 5:
                e11.e0(obj);
                if (z) {
                    ((a07) obj2).setValue(fc1.D0(((ihb) this.d).h, " ", null, null, null, 62));
                }
                break;
            default:
                e11.e0(obj);
                gj8 gj8Var = (gj8) this.d;
                if (!z) {
                    gj8Var.r.remove(obj2);
                } else {
                    gj8Var.r.add(obj2);
                }
                break;
        }
        return hebVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gl0(qtb qtbVar, boolean z, String str, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.d = qtbVar;
        this.c = z;
        this.b = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gl0(String str, boolean z, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 1;
        this.b = str;
        this.c = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gl0(boolean z, String str, qtb qtbVar, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = z;
        this.b = str;
        this.d = qtbVar;
    }
}
