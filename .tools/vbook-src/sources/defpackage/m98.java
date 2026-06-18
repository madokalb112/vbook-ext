package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class m98 extends kc4 implements ib4 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m98(hra hraVar, int i) {
        super(0, 0, hra.class, hraVar, "cancelAnalyze", "cancelAnalyze()V");
        this.a = i;
        switch (i) {
            case 26:
                super(0, 0, hra.class, hraVar, "reAnalyzeNER", "reAnalyzeNER()V");
                break;
            case 27:
                super(0, 0, hra.class, hraVar, "saveNER", "saveNER()V");
                break;
            default:
                break;
        }
    }

    @Override // defpackage.ib4
    public final Object invoke() throws Exception {
        int i = this.a;
        int i2 = 1;
        int i3 = 2;
        jt1 jt1Var = null;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                ((aw3) this.receiver).a();
                return hebVar;
            case 1:
                u98 u98Var = (u98) this.receiver;
                u98Var.getClass();
                za1 za1VarA = vtb.a(u98Var);
                aj2 aj2Var = rw2.a;
                u98Var.g(za1VarA, nh2.c, new q98(u98Var, jt1Var, 6));
                return hebVar;
            case 2:
                u98 u98Var2 = (u98) this.receiver;
                u98Var2.getClass();
                u98Var2.j(new s98(u98Var2, jt1Var, 4), "VietPhrase");
                return hebVar;
            case 3:
                u98 u98Var3 = (u98) this.receiver;
                u98Var3.getClass();
                u98Var3.j(new s98(u98Var3, jt1Var, i2), "Name");
                return hebVar;
            case 4:
                u98 u98Var4 = (u98) this.receiver;
                u98Var4.getClass();
                u98Var4.j(new s98(u98Var4, jt1Var, i3), "PhienAm");
                return hebVar;
            case 5:
                u98 u98Var5 = (u98) this.receiver;
                u98Var5.getClass();
                u98Var5.j(new s98(u98Var5, jt1Var, 3), "Pronouns");
                return hebVar;
            case 6:
                u98 u98Var6 = (u98) this.receiver;
                u98Var6.getClass();
                u98Var6.j(new s98(u98Var6, jt1Var, 0), "LuatNhan");
                return hebVar;
            case 7:
                u98 u98Var7 = (u98) this.receiver;
                u98Var7.getClass();
                za1 za1VarA2 = vtb.a(u98Var7);
                aj2 aj2Var2 = rw2.a;
                u98Var7.g(za1VarA2, nh2.c, new r98(u98Var7, null));
                return hebVar;
            case 8:
                ((aw3) this.receiver).a();
                return hebVar;
            case 9:
                ((aw3) this.receiver).a();
                return hebVar;
            case 10:
                ((aw3) this.receiver).a();
                return hebVar;
            case 11:
                ((aw3) this.receiver).a();
                return hebVar;
            case 12:
                u98 u98Var8 = (u98) this.receiver;
                u98Var8.getClass();
                za1 za1VarA3 = vtb.a(u98Var8);
                aj2 aj2Var3 = rw2.a;
                u98Var8.g(za1VarA3, nh2.c, new q98(u98Var8, jt1Var, 10));
                return hebVar;
            case 13:
                u98 u98Var9 = (u98) this.receiver;
                u98Var9.getClass();
                za1 za1VarA4 = vtb.a(u98Var9);
                aj2 aj2Var4 = rw2.a;
                u98Var9.g(za1VarA4, nh2.c, new q98(u98Var9, jt1Var, 7));
                return hebVar;
            case 14:
                u98 u98Var10 = (u98) this.receiver;
                u98Var10.getClass();
                za1 za1VarA5 = vtb.a(u98Var10);
                aj2 aj2Var5 = rw2.a;
                u98Var10.g(za1VarA5, nh2.c, new q98(u98Var10, jt1Var, 8));
                return hebVar;
            case 15:
                u98 u98Var11 = (u98) this.receiver;
                u98Var11.getClass();
                za1 za1VarA6 = vtb.a(u98Var11);
                aj2 aj2Var6 = rw2.a;
                u98Var11.g(za1VarA6, nh2.c, new q98(u98Var11, jt1Var, 9));
                return hebVar;
            case 16:
                dp8 dp8Var = (dp8) this.receiver;
                iw0 iw0Var = dp8Var.a;
                if (iw0Var == null) {
                    lc5.i0("coroutineScope");
                    throw null;
                }
                wx1.K(iw0Var, null);
                dp8Var.f();
                zo8 zo8Var = dp8Var.d;
                if (zo8Var != null) {
                    zo8Var.f.close();
                    return hebVar;
                }
                lc5.i0("connectionManager");
                throw null;
            case 17:
                ((t27) this.receiver).b();
                return hebVar;
            case 18:
                ((h49) this.receiver).q();
                return hebVar;
            case 19:
                h49 h49Var = (h49) this.receiver;
                int i4 = h49Var.E;
                if (i4 > 0) {
                    h49Var.p(i4 - 1);
                }
                return hebVar;
            case 20:
                ((h49) this.receiver).r();
                return hebVar;
            case 21:
                ((h49) this.receiver).r();
                return hebVar;
            case 22:
                h49 h49Var2 = (h49) this.receiver;
                if (((onb) h49Var2.H.getValue()).e) {
                    h49Var2.q();
                }
                return hebVar;
            case 23:
                ((h49) this.receiver).r();
                return hebVar;
            case 24:
                p5a p5aVar = (p5a) this.receiver;
                p5aVar.getClass();
                za1 za1VarA7 = vtb.a(p5aVar);
                aj2 aj2Var7 = rw2.a;
                p5aVar.g(za1VarA7, nh2.c, new b69(p5aVar, jt1Var, 15));
                return hebVar;
            case 25:
                ((hra) this.receiver).S();
                return hebVar;
            case 26:
                hra hraVar = (hra) this.receiver;
                hraVar.getClass();
                za1 za1VarA8 = vtb.a(hraVar);
                aj2 aj2Var8 = rw2.a;
                hraVar.g(za1VarA8, nh2.c, new fqa(hraVar, jt1Var, i3));
                return hebVar;
            case 27:
                hra hraVar2 = (hra) this.receiver;
                hraVar2.getClass();
                za1 za1VarA9 = vtb.a(hraVar2);
                aj2 aj2Var9 = rw2.a;
                hraVar2.g(za1VarA9, nh2.c, new j90(hraVar2, null));
                return hebVar;
            case 28:
                t27 t27Var = (t27) this.receiver;
                t27Var.getClass();
                t27Var.a(y69.INSTANCE);
                return hebVar;
            default:
                fo8 fo8Var = ((mn8) this.receiver).a;
                cn7 cn7Var = fo8Var.m;
                cn7 cn7Var2 = fo8Var.n;
                long j = fo8Var.k().b;
                if (pja.e(j) > 0) {
                    vn9 vn9VarF = fo8Var.f();
                    vn9 vn9VarN = fo8Var.n();
                    vn9 vn9VarM = fo8Var.m();
                    cn7Var2.setValue(vn9VarF);
                    cn7Var.setValue(new vn9(0L, 0L, (a84) null, (t74) null, (u74) null, (c64) null, (String) null, 0L, (ge0) null, (aha) null, (h36) null, 0L, (jda) null, (o89) null, 65535));
                    fo8Var.d(j);
                    cn7Var2.setValue(vn9VarN);
                    cn7Var.setValue(vn9VarM);
                } else {
                    fo8Var.r(fo8Var.f());
                }
                return hebVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m98(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }
}
