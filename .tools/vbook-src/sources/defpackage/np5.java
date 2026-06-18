package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class np5 implements zb4 {
    public final /* synthetic */ ib4 A;
    public final /* synthetic */ ib4 B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ kb4 D;
    public final /* synthetic */ kb4 E;
    public final /* synthetic */ int a;
    public final /* synthetic */ pj7 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;
    public final /* synthetic */ int s;
    public final /* synthetic */ t89 t;
    public final /* synthetic */ float u;
    public final /* synthetic */ tx8 v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ kb4 x;
    public final /* synthetic */ float y;
    public final /* synthetic */ ux8 z;

    public /* synthetic */ np5(pj7 pj7Var, boolean z, boolean z2, long j, long j2, int i, t89 t89Var, float f, tx8 tx8Var, boolean z3, kb4 kb4Var, float f2, ux8 ux8Var, ib4 ib4Var, ib4 ib4Var2, boolean z4, ib4 ib4Var3, kb4 kb4Var2, kb4 kb4Var3, int i2) {
        this.a = i2;
        this.b = pj7Var;
        this.c = z;
        this.d = z2;
        this.e = j;
        this.f = j2;
        this.s = i;
        this.t = t89Var;
        this.u = f;
        this.v = tx8Var;
        this.w = z3;
        this.x = kb4Var;
        this.y = f2;
        this.z = ux8Var;
        this.A = ib4Var;
        this.B = ib4Var2;
        this.C = z4;
        this.D = kb4Var2;
        this.E = kb4Var3;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        kb4 kb4Var;
        ib4 ib4Var;
        ib4 ib4Var2;
        kb4 kb4Var2;
        ib4 ib4Var3;
        ib4 ib4Var4;
        int i = this.a;
        heb hebVar = heb.a;
        ux8 ux8Var = ux8.b;
        sx8 sx8Var = sx8.a;
        sx8 sx8Var2 = sx8.b;
        Object obj4 = vl1.a;
        long j = this.f;
        long j2 = this.e;
        boolean z = this.c;
        pj7 pj7Var = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                co0 co0Var = (co0) obj;
                dd4 dd4Var = (dd4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                co0Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= dd4Var.f(co0Var) ? 4 : 2;
                }
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 19) != 18)) {
                    dd4Var.Y();
                } else {
                    final float fH = up1.h(co0Var.b);
                    zm5 zm5Var = (zm5) dd4Var.j(xm1.n);
                    boolean zF = dd4Var.f(pj7Var) | dd4Var.d(zm5Var.ordinal());
                    Object objQ = dd4Var.Q();
                    if (zF || objQ == obj4) {
                        objQ = new x13(z ? gjb.V(pj7Var, zm5Var) : gjb.W(pj7Var, zm5Var));
                        dd4Var.p0(objQ);
                    }
                    float f = ((x13) objQ).a;
                    sx8 sx8Var3 = z ? sx8Var2 : sx8Var;
                    final boolean z2 = this.d;
                    if (z2) {
                        j = j2;
                    }
                    int i3 = this.s;
                    boolean zD = dd4Var.d(i3) | dd4Var.c(f);
                    t89 t89Var = this.t;
                    boolean zF2 = zD | dd4Var.f(t89Var);
                    float f2 = this.u;
                    boolean zC = zF2 | dd4Var.c(f2) | dd4Var.e(j) | dd4Var.d(sx8Var3.ordinal());
                    tx8 tx8Var = this.v;
                    boolean zD2 = zC | dd4Var.d(tx8Var.ordinal());
                    Object objQ2 = dd4Var.Q();
                    if (zD2 || objQ2 == obj4) {
                        objQ2 = new rx8(i3, f, t89Var, f2, j, sx8Var3, tx8Var);
                        dd4Var.p0(objQ2);
                    }
                    rx8 rx8Var = (rx8) objQ2;
                    boolean zF3 = dd4Var.f((Object) null);
                    Object objQ3 = dd4Var.Q();
                    if (zF3 || objQ3 == obj4) {
                        dd4Var.p0((Object) null);
                        objQ3 = null;
                    }
                    yb4 yb4Var = (yb4) objQ3;
                    final boolean z3 = this.w;
                    boolean zG = dd4Var.g(z3) | dd4Var.g(z2);
                    final kb4 kb4Var3 = this.x;
                    boolean zF4 = zG | dd4Var.f(kb4Var3);
                    final float f3 = this.y;
                    boolean zC2 = zF4 | dd4Var.c(f3) | dd4Var.c(fH);
                    Object objQ4 = dd4Var.Q();
                    if (zC2 || objQ4 == obj4) {
                        final int i4 = 0;
                        objQ4 = new kb4() { // from class: pp5
                            @Override // defpackage.kb4
                            public final Object invoke(Object obj5) {
                                int i5 = i4;
                                heb hebVar2 = heb.a;
                                float f4 = fH;
                                float f5 = f3;
                                kb4 kb4Var4 = kb4Var3;
                                boolean z4 = z2;
                                boolean z5 = z3;
                                float fFloatValue = ((Float) obj5).floatValue();
                                switch (i5) {
                                    case 0:
                                        if (z5) {
                                            fFloatValue = -fFloatValue;
                                        }
                                        if (z4) {
                                            kb4Var4.invoke(Float.valueOf((fFloatValue / f4) + f5));
                                        }
                                        break;
                                    default:
                                        if (z5) {
                                            fFloatValue = -fFloatValue;
                                        }
                                        if (z4) {
                                            kb4Var4.invoke(Float.valueOf((fFloatValue / f4) + f5));
                                        }
                                        break;
                                }
                                return hebVar2;
                            }
                        };
                        kb4Var = kb4Var3;
                        dd4Var.p0(objQ4);
                    } else {
                        kb4Var = kb4Var3;
                    }
                    k43 k43VarB = h43.b((kb4) objQ4, dd4Var, 0);
                    ux8 ux8Var2 = this.z;
                    boolean zD3 = dd4Var.d(ux8Var2.ordinal()) | dd4Var.c(fH) | dd4Var.f(k43VarB) | dd4Var.g(z3);
                    Object objQ5 = dd4Var.Q();
                    ib4 ib4Var5 = this.A;
                    ib4 ib4Var6 = this.B;
                    if (zD3 || objQ5 == obj4) {
                        boolean z4 = ux8Var2 != ux8Var;
                        kb4 kb4Var4 = this.D;
                        kb4 kb4Var5 = this.E;
                        ib4Var = ib4Var6;
                        ib4Var2 = ib4Var5;
                        objQ5 = h43.a(lu6.a, k43VarB, lh7.a, z4, (yy6) null, true, new sp5(fH, z3, ib4Var6, ib4Var5, ux8Var2, kb4Var4, kb4Var, kb4Var5, null, 0), new tp5(0, null, kb4Var5), false, Token.WITH);
                        dd4Var.p0(objQ5);
                    } else {
                        ib4Var2 = ib4Var5;
                        ib4Var = ib4Var6;
                    }
                    oh9.f(ib4Var2, ib4Var, this.C, rx8Var, (ou6) objQ5, yb4Var, dd4Var, 0);
                }
                break;
            default:
                co0 co0Var2 = (co0) obj;
                dd4 dd4Var2 = (dd4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                co0Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= dd4Var2.f(co0Var2) ? 4 : 2;
                }
                if (!dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    dd4Var2.Y();
                } else {
                    final float fH2 = up1.h(co0Var2.b);
                    zm5 zm5Var2 = (zm5) dd4Var2.j(xm1.n);
                    boolean zD4 = dd4Var2.d(zm5Var2.ordinal()) | dd4Var2.f(pj7Var);
                    Object objQ6 = dd4Var2.Q();
                    if (zD4 || objQ6 == obj4) {
                        objQ6 = new x13(z ? gjb.V(pj7Var, zm5Var2) : gjb.W(pj7Var, zm5Var2));
                        dd4Var2.p0(objQ6);
                    }
                    float f4 = ((x13) objQ6).a;
                    sx8 sx8Var4 = z ? sx8Var2 : sx8Var;
                    final boolean z5 = this.d;
                    if (z5) {
                        j = j2;
                    }
                    int i5 = this.s;
                    boolean zD5 = dd4Var2.d(i5) | dd4Var2.c(f4);
                    t89 t89Var2 = this.t;
                    boolean zF5 = zD5 | dd4Var2.f(t89Var2);
                    float f5 = this.u;
                    boolean zC3 = zF5 | dd4Var2.c(f5) | dd4Var2.e(j) | dd4Var2.d(sx8Var4.ordinal());
                    tx8 tx8Var2 = this.v;
                    boolean zD6 = zC3 | dd4Var2.d(tx8Var2.ordinal());
                    Object objQ7 = dd4Var2.Q();
                    if (zD6 || objQ7 == obj4) {
                        objQ7 = new rx8(i5, f4, t89Var2, f5, j, sx8Var4, tx8Var2);
                        dd4Var2.p0(objQ7);
                    }
                    rx8 rx8Var2 = (rx8) objQ7;
                    boolean zF6 = dd4Var2.f((Object) null);
                    Object objQ8 = dd4Var2.Q();
                    if (zF6 || objQ8 == obj4) {
                        dd4Var2.p0((Object) null);
                        objQ8 = null;
                    }
                    yb4 yb4Var2 = (yb4) objQ8;
                    final boolean z6 = this.w;
                    boolean zG2 = dd4Var2.g(z6) | dd4Var2.g(z5);
                    final kb4 kb4Var6 = this.x;
                    boolean zF7 = zG2 | dd4Var2.f(kb4Var6);
                    final float f6 = this.y;
                    boolean zC4 = zF7 | dd4Var2.c(f6) | dd4Var2.c(fH2);
                    Object objQ9 = dd4Var2.Q();
                    if (zC4 || objQ9 == obj4) {
                        final int i6 = 1;
                        objQ9 = new kb4() { // from class: pp5
                            @Override // defpackage.kb4
                            public final Object invoke(Object obj5) {
                                int i52 = i6;
                                heb hebVar2 = heb.a;
                                float f42 = fH2;
                                float f52 = f6;
                                kb4 kb4Var42 = kb4Var6;
                                boolean z42 = z5;
                                boolean z52 = z6;
                                float fFloatValue = ((Float) obj5).floatValue();
                                switch (i52) {
                                    case 0:
                                        if (z52) {
                                            fFloatValue = -fFloatValue;
                                        }
                                        if (z42) {
                                            kb4Var42.invoke(Float.valueOf((fFloatValue / f42) + f52));
                                        }
                                        break;
                                    default:
                                        if (z52) {
                                            fFloatValue = -fFloatValue;
                                        }
                                        if (z42) {
                                            kb4Var42.invoke(Float.valueOf((fFloatValue / f42) + f52));
                                        }
                                        break;
                                }
                                return hebVar2;
                            }
                        };
                        kb4Var2 = kb4Var6;
                        dd4Var2.p0(objQ9);
                    } else {
                        kb4Var2 = kb4Var6;
                    }
                    k43 k43VarB2 = h43.b((kb4) objQ9, dd4Var2, 0);
                    ux8 ux8Var3 = this.z;
                    boolean zD7 = dd4Var2.d(ux8Var3.ordinal()) | dd4Var2.c(fH2) | dd4Var2.f(k43VarB2) | dd4Var2.g(z6);
                    Object objQ10 = dd4Var2.Q();
                    ib4 ib4Var7 = this.A;
                    ib4 ib4Var8 = this.B;
                    if (zD7 || objQ10 == obj4) {
                        boolean z7 = ux8Var3 != ux8Var;
                        kb4 kb4Var7 = this.D;
                        kb4 kb4Var8 = this.E;
                        ib4Var3 = ib4Var8;
                        ib4Var4 = ib4Var7;
                        objQ10 = h43.a(lu6.a, k43VarB2, lh7.a, z7, (yy6) null, true, new sp5(fH2, z6, ib4Var8, ib4Var7, ux8Var3, kb4Var7, kb4Var2, kb4Var8, null, 1), new tp5(i2, null, kb4Var8), false, Token.WITH);
                        dd4Var2.p0(objQ10);
                    } else {
                        ib4Var4 = ib4Var7;
                        ib4Var3 = ib4Var8;
                    }
                    oh9.f(ib4Var4, ib4Var3, this.C, rx8Var2, (ou6) objQ10, yb4Var2, dd4Var2, 0);
                }
                break;
        }
        return hebVar;
    }
}
