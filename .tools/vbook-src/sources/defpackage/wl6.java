package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class wl6 implements zb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ kb4 c;
    public final /* synthetic */ rj1 d;
    public final /* synthetic */ rj1 e;

    public /* synthetic */ wl6(boolean z, kb4 kb4Var, rj1 rj1Var, rj1 rj1Var2, int i) {
        this.a = i;
        this.b = z;
        this.c = kb4Var;
        this.d = rj1Var;
        this.e = rj1Var2;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        heb hebVar = heb.a;
        lu6 lu6Var = lu6.a;
        rj1 rj1Var = this.e;
        rj1 rj1Var2 = this.d;
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
                    fw.q(this.b, this.c, tg9.h(lu6Var, (co0Var.c() * 8.0f) / 9.0f), true, null, null, ((q96) dd4Var.j(s96.a)).a.p, 0L, 0.0f, 0L, jf0.G(-1391965631, new tb0(rj1Var2, 8), dd4Var), jf0.G(2124134834, new lv8(rj1Var, 4), dd4Var), dd4Var, 3072, 54, 944);
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
                    fw.q(this.b, this.c, tg9.h(lu6Var, (co0Var2.c() * 8.0f) / 9.0f), true, null, null, ((q96) dd4Var2.j(s96.a)).a.p, 0L, 0.0f, 0L, jf0.G(-535515498, new tb0(rj1Var2, 9), dd4Var2), jf0.G(-1702230585, new lv8(rj1Var, 5), dd4Var2), dd4Var2, 3072, 54, 944);
                }
                break;
        }
        return hebVar;
    }
}
