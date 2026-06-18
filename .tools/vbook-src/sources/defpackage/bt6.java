package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class bt6 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p5b b;

    public /* synthetic */ bt6(p5b p5bVar, int i) {
        this.a = i;
        this.b = p5bVar;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        p5b p5bVar = this.b;
        lu6 lu6Var = lu6.a;
        String str = p5bVar.a;
        dd4 dd4Var = (dd4) obj;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                qr1 qr1Var = ra1.d;
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else if (!str.equals("qt")) {
                    dd4Var.f0(43984100);
                    w05.a(new po3(0L, str, ""), qr1Var, false, null, null, t96.w(tg9.n(lu6Var, 24.0f), tp8.a), null, dd4Var, 100663344, 188);
                    dd4Var.q(false);
                } else {
                    dd4Var.f0(43596755);
                    i12.h(i25.a((m53) f53.z.getValue(), dd4Var), (String) null, t96.w(tg9.n(lu6Var, 24.0f), tp8.a), dd4Var, 24624, 232);
                    dd4Var.q(false);
                }
                break;
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                qr1 qr1Var2 = ra1.d;
                if (!dd4Var.V(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dd4Var.Y();
                } else if (!str.equals("qt")) {
                    dd4Var.f0(-117606848);
                    w05.a(new po3(0L, str, ""), qr1Var2, false, null, null, t96.w(tg9.n(lu6Var, 24.0f), tp8.a), null, dd4Var, 100663344, 188);
                    dd4Var.q(false);
                } else {
                    dd4Var.f0(-118049745);
                    i12.h(i25.a((m53) f53.z.getValue(), dd4Var), (String) null, t96.w(tg9.n(lu6Var, 24.0f), tp8.a), dd4Var, 24624, 232);
                    dd4Var.q(false);
                }
                break;
        }
        return hebVar;
    }
}
