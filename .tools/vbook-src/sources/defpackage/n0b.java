package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class n0b extends kc4 implements ib4 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0b(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        Object value;
        b1b b1bVar;
        boolean z;
        boolean z2;
        int i;
        int i2 = this.a;
        jt1 jt1Var = null;
        heb hebVar = heb.a;
        switch (i2) {
            case 0:
                ((mn8) this.receiver).a.t(new vn9(0L, 0L, a84.w, (t74) null, (u74) null, (c64) null, (String) null, 0L, (ge0) null, (aha) null, (h36) null, 0L, (jda) null, (o89) null, 65531));
                break;
            case 1:
                ((mn8) this.receiver).a.t(new vn9(0L, 0L, (a84) null, new t74(1), (u74) null, (c64) null, (String) null, 0L, (ge0) null, (aha) null, (h36) null, 0L, (jda) null, (o89) null, 65527));
                break;
            case 2:
                ((mn8) this.receiver).a.t(new vn9(0L, 0L, (a84) null, (t74) null, (u74) null, (c64) null, (String) null, 0L, (ge0) null, (aha) null, (h36) null, 0L, jda.c, (o89) null, 61439));
                break;
            case 3:
                ((mn8) this.receiver).a.t(new vn9(0L, 0L, (a84) null, (t74) null, (u74) null, (c64) null, (String) null, 0L, (ge0) null, (aha) null, (h36) null, 0L, jda.d, (o89) null, 61439));
                break;
            case 4:
                c1b c1bVar = (c1b) this.receiver;
                fr9 fr9Var = c1bVar.f;
                xq2 xq2Var = ((b1b) fr9Var.getValue()).f;
                if (xq2Var != null && !c1bVar.w && c1bVar.v && !((b1b) fr9Var.getValue()).a) {
                    oq9 oq9Var = c1bVar.x;
                    if (oq9Var != null) {
                        oq9Var.cancel(null);
                    }
                    za1 za1VarA = vtb.a(c1bVar);
                    aj2 aj2Var = rw2.a;
                    c1bVar.x = ah1.J(za1VarA, nh2.c, null, new bva(c1bVar, xq2Var, jt1Var, 2), 2);
                }
                break;
            case 5:
                ((c1b) this.receiver).j();
                break;
            default:
                c1b c1bVar2 = (c1b) this.receiver;
                fr9 fr9Var2 = c1bVar2.f;
                xq2 xq2Var2 = ((b1b) fr9Var2.getValue()).f;
                if (xq2Var2 != null) {
                    if (fr9Var2 != null) {
                        do {
                            value = fr9Var2.getValue();
                            b1bVar = (b1b) value;
                            z = xq2Var2.i;
                            z2 = !z;
                            i = xq2Var2.h;
                        } while (!fr9Var2.j(value, b1b.a(b1bVar, false, false, false, false, false, xq2.a(xq2Var2, z ? i - 1 : i + 1, z2, 0, 15999), null, 95)));
                    }
                    za1 za1VarA2 = vtb.a(c1bVar2);
                    aj2 aj2Var2 = rw2.a;
                    c1bVar2.g(za1VarA2, nh2.c, new qoa(c1bVar2, xq2Var2, jt1Var, 14));
                }
                break;
        }
        return hebVar;
    }
}
