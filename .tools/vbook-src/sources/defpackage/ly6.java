package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ly6 implements zb4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ i8a b;
    public final /* synthetic */ String c;
    public final /* synthetic */ o8a d;
    public final /* synthetic */ String e;

    public /* synthetic */ ly6(i8a i8aVar, String str, o8a o8aVar, String str2) {
        this.b = i8aVar;
        this.c = str;
        this.d = o8aVar;
        this.e = str2;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        heb hebVar = heb.a;
        o8a o8aVar = this.d;
        i8a i8aVar = this.b;
        int i2 = 0;
        switch (i) {
            case 0:
                dd4 dd4Var = (dd4) obj2;
                ((Integer) obj3).getClass();
                ((je1) obj).getClass();
                yn9.b(this.c, (mf4) null, new tka(o8aVar.c, new spa(wn9.x(18)), new z74(), 120), 1, dd4Var, 3072);
                kf4 kf4Var = kf4.a;
                tn9.a(xg9.i(kf4Var, 4.0f), dd4Var, 0);
                yn9.b(this.e, (mf4) null, new tka(o8aVar.d, new spa(wn9.x(12)), (z74) null, Token.IMPORT), 1, dd4Var, 3072);
                tn9.a(xg9.i(kf4Var, 20.0f), dd4Var, 0);
                fx1.o(null, 1, 1, jf0.G(1029967411, new my6(o8aVar, i8aVar, i2), dd4Var), dd4Var, 3072, 1);
                break;
            default:
                dd4 dd4Var2 = (dd4) obj2;
                ((Integer) obj3).getClass();
                ((gq8) obj).getClass();
                String str = i8aVar.d;
                String str2 = this.c;
                hn9.a(str, str2, o8aVar, dd4Var2, 3456);
                tn9.a(xg9.p(10.0f), dd4Var2, 0);
                t96.f(new dyb(us2.a), 1, 0, jf0.G(-2112163724, new c41(27, o8aVar, str2, this.e), dd4Var2), dd4Var2, 3072, 4);
                tn9.a(xg9.p(10.0f), dd4Var2, 0);
                fx1.o(yn2.K(ww1.H(new zb0(o8aVar.e), 26.0f), 14.0f, 8.0f), 0, 1, jf0.G(-900015290, new my6(o8aVar, i8aVar, 1), dd4Var2), dd4Var2, 3072, 2);
                break;
        }
        return hebVar;
    }

    public /* synthetic */ ly6(o8a o8aVar, String str, String str2, i8a i8aVar) {
        this.d = o8aVar;
        this.c = str;
        this.e = str2;
        this.b = i8aVar;
    }
}
