package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class c5c implements yb4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ rg8 b;
    public final /* synthetic */ ie8 c;
    public final /* synthetic */ rg8 d;
    public final /* synthetic */ rg8 e;

    public /* synthetic */ c5c(ie8 ie8Var, rg8 rg8Var, rg8 rg8Var2, rg8 rg8Var3) {
        this.c = ie8Var;
        this.b = rg8Var;
        this.d = rg8Var2;
        this.e = rg8Var3;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        rg8 rg8Var = this.e;
        rg8 rg8Var2 = this.d;
        ie8 ie8Var = this.c;
        rg8 rg8Var3 = this.b;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                long jLongValue = ((Long) obj2).longValue();
                if (iIntValue == 21589) {
                    if (jLongValue >= 1) {
                        byte b = ie8Var.readByte();
                        boolean z = (b & 1) == 1;
                        boolean z2 = (b & 2) == 2;
                        boolean z3 = (b & 4) == 4;
                        long j = z ? 5L : 1L;
                        if (z2) {
                            j += 4;
                        }
                        if (z3) {
                            j += 4;
                        }
                        if (jLongValue >= j) {
                            if (z) {
                                rg8Var3.a = Integer.valueOf(ie8Var.q());
                            }
                            if (z2) {
                                rg8Var2.a = Integer.valueOf(ie8Var.q());
                            }
                            if (z3) {
                                rg8Var.a = Integer.valueOf(ie8Var.q());
                            }
                        } else {
                            sy3.m("bad zip: extended timestamp extra too short");
                        }
                    } else {
                        sy3.m("bad zip: extended timestamp extra too short");
                    }
                }
                break;
            default:
                int iIntValue2 = ((Integer) obj).intValue();
                long jLongValue2 = ((Long) obj2).longValue();
                if (iIntValue2 == 1) {
                    if (rg8Var3.a != null) {
                        sy3.m("bad zip: NTFS extra attribute tag 0x0001 repeated");
                    } else if (jLongValue2 == 24) {
                        rg8Var3.a = Long.valueOf(ie8Var.A());
                        rg8Var2.a = Long.valueOf(ie8Var.A());
                        rg8Var.a = Long.valueOf(ie8Var.A());
                    } else {
                        sy3.m("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                    }
                }
                break;
        }
        return hebVar;
    }

    public /* synthetic */ c5c(rg8 rg8Var, ie8 ie8Var, rg8 rg8Var2, rg8 rg8Var3) {
        this.b = rg8Var;
        this.c = ie8Var;
        this.d = rg8Var2;
        this.e = rg8Var3;
    }
}
