package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class vc2 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b92 b;

    public /* synthetic */ vc2(b92 b92Var, int i) {
        this.a = i;
        switch (i) {
            case 1:
                xc2 xc2Var = xc2.a;
                break;
            case 2:
                yc2 yc2Var = yc2.a;
                break;
            default:
                zc2 zc2Var = zc2.a;
                break;
        }
        this.b = b92Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        b92 b92Var = this.b;
        switch (i) {
            case 0:
                zc2 zc2Var = zc2.a;
                re reVar = (re) obj;
                String strO = ky0.o(reVar, 0);
                String strD = reVar.d(1);
                strD.getClass();
                zk4 zk4Var = (zk4) b92Var.c;
                zk4Var.getClass();
                Object objN = ky0.n(reVar, 2, wfc.t);
                String strD2 = reVar.d(3);
                String strD3 = reVar.d(4);
                zk4Var.getClass();
                Long lC = reVar.c(5);
                lC.getClass();
                Integer numValueOf = Integer.valueOf((int) lC.longValue());
                Long lC2 = reVar.c(6);
                return zc2Var.j(strO, strD, objN, strD2, strD3, numValueOf, lC2, ky0.m(lC2, reVar, 7));
            case 1:
                xc2 xc2Var = xc2.a;
                re reVar2 = (re) obj;
                String strO2 = ky0.o(reVar2, 0);
                String strD4 = reVar2.d(1);
                strD4.getClass();
                zk4 zk4Var2 = (zk4) b92Var.c;
                zk4Var2.getClass();
                Object objN2 = ky0.n(reVar2, 2, wfc.t);
                String strD5 = reVar2.d(3);
                String strD6 = reVar2.d(4);
                zk4Var2.getClass();
                Long lC3 = reVar2.c(5);
                lC3.getClass();
                Integer numValueOf2 = Integer.valueOf((int) lC3.longValue());
                Long lC4 = reVar2.c(6);
                return xc2Var.j(strO2, strD4, objN2, strD5, strD6, numValueOf2, lC4, ky0.m(lC4, reVar2, 7));
            default:
                yc2 yc2Var = yc2.a;
                re reVar3 = (re) obj;
                String strO3 = ky0.o(reVar3, 0);
                String strD7 = reVar3.d(1);
                strD7.getClass();
                zk4 zk4Var3 = (zk4) b92Var.c;
                zk4Var3.getClass();
                Object objN3 = ky0.n(reVar3, 2, wfc.t);
                String strD8 = reVar3.d(3);
                String strD9 = reVar3.d(4);
                zk4Var3.getClass();
                Long lC5 = reVar3.c(5);
                lC5.getClass();
                Integer numValueOf3 = Integer.valueOf((int) lC5.longValue());
                Long lC6 = reVar3.c(6);
                return yc2Var.j(strO3, strD7, objN3, strD8, strD9, numValueOf3, lC6, ky0.m(lC6, reVar3, 7));
        }
    }
}
