package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class iy1 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sw8 b;

    public /* synthetic */ iy1(sw8 sw8Var, int i) {
        this.a = i;
        this.b = sw8Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        y91 y91VarP0;
        long jG;
        int i = this.a;
        heb hebVar = heb.a;
        sw8 sw8Var = this.b;
        switch (i) {
            case 0:
                r43 r43Var = (r43) obj;
                float f = ky1.b;
                r43Var.getClass();
                int iOrdinal = sw8Var.f().ordinal();
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        float fE = sw8Var.e();
                        tc tcVar = sw8Var.h;
                        if (tcVar != null) {
                            tcVar.a(r43Var.p0().x());
                        }
                        y91VarP0 = r43Var.p0();
                        jG = y91VarP0.G();
                        y91VarP0.x().i();
                        try {
                            lp8 lp8Var = (lp8) y91VarP0.b;
                            y91 y91Var = (y91) lp8Var.b;
                            lp8.E(lp8Var, wx1.P((-Float.intBitsToFloat((int) (y91Var.G() >> 32))) + fE, -Float.intBitsToFloat((int) (y91Var.G() >> 32)), 0.0f), 0.0f, 2);
                            tc tcVar2 = sw8Var.j;
                            if (tcVar2 != null) {
                                tcVar2.a(r43Var.p0().x());
                            }
                            y91VarP0.x().q();
                            y91VarP0.d0(jG);
                            ky1.b(r43Var, wx1.P(fE, -r43Var.k0(f), Float.intBitsToFloat((int) (r43Var.f() >> 32))));
                        } finally {
                        }
                    }
                    break;
                } else {
                    float fE2 = sw8Var.e() - sw8Var.c;
                    tc tcVar3 = sw8Var.i;
                    if (tcVar3 != null) {
                        tcVar3.a(r43Var.p0().x());
                    }
                    y91VarP0 = r43Var.p0();
                    jG = y91VarP0.G();
                    y91VarP0.x().i();
                    try {
                        lp8 lp8Var2 = (lp8) y91VarP0.b;
                        lp8.E(lp8Var2, wx1.P(fE2, -Float.intBitsToFloat((int) (((y91) lp8Var2.b).G() >> 32)), 0.0f), 0.0f, 2);
                        tc tcVar4 = sw8Var.h;
                        if (tcVar4 != null) {
                            tcVar4.a(r43Var.p0().x());
                        }
                        y91VarP0.x().q();
                        y91VarP0.d0(jG);
                        ky1.b(r43Var, Float.intBitsToFloat((int) (r43Var.f() >> 32)) + wx1.P(fE2, (-Float.intBitsToFloat((int) (r43Var.f() >> 32))) - r43Var.k0(f), 0.0f));
                    } finally {
                    }
                    break;
                }
                return hebVar;
            case 1:
                r43 r43Var2 = (r43) obj;
                r43Var2.getClass();
                float fE3 = sw8Var.e() - sw8Var.c;
                if (sw8Var.f() != dk7.a) {
                    y91VarP0 = r43Var2.p0();
                    jG = y91VarP0.G();
                    y91VarP0.x().i();
                    try {
                        lp8 lp8Var3 = (lp8) y91VarP0.b;
                        lp8.E(lp8Var3, (-Float.intBitsToFloat((int) (((y91) lp8Var3.b).G() >> 32))) + fE3, 0.0f, 2);
                        tc tcVar5 = sw8Var.j;
                        if (tcVar5 != null) {
                            tcVar5.a(r43Var2.p0().x());
                        }
                        y91VarP0.x().q();
                        y91VarP0.d0(jG);
                        y91VarP0 = r43Var2.p0();
                        jG = y91VarP0.G();
                        y91VarP0.x().i();
                        try {
                            lp8.E((lp8) y91VarP0.b, fE3, 0.0f, 2);
                            tc tcVar6 = sw8Var.h;
                            if (tcVar6 != null) {
                                tcVar6.a(r43Var2.p0().x());
                            }
                            y91VarP0.x().q();
                            y91VarP0.d0(jG);
                            y91VarP0 = r43Var2.p0();
                            jG = y91VarP0.G();
                            y91VarP0.x().i();
                            try {
                                lp8 lp8Var4 = (lp8) y91VarP0.b;
                                lp8.E(lp8Var4, Float.intBitsToFloat((int) (((y91) lp8Var4.b).G() >> 32)) + fE3, 0.0f, 2);
                                tc tcVar7 = sw8Var.i;
                                if (tcVar7 != null) {
                                    tcVar7.a(r43Var2.p0().x());
                                }
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                    }
                    break;
                }
                return hebVar;
            case 2:
                sw8Var.g.setValue(new na5(((na5) obj).a));
                return hebVar;
            case 3:
                eb7 eb7Var = (eb7) obj;
                sw8Var.p(Float.intBitsToFloat((int) (eb7Var.a >> 32)), Float.intBitsToFloat((int) (eb7Var.a & 4294967295L)));
                return hebVar;
            default:
                ux7 ux7Var = (ux7) obj;
                ux7Var.getClass();
                long j = ux7Var.c;
                sw8Var.b(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
                return hebVar;
        }
    }
}
