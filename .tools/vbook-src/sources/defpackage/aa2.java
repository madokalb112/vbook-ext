package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class aa2 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b92 b;

    public /* synthetic */ aa2(b92 b92Var, int i) {
        this.a = i;
        switch (i) {
            case 1:
                ca2 ca2Var = ca2.a;
                break;
            case 2:
                da2 da2Var = da2.a;
                break;
            default:
                ea2 ea2Var = ea2.a;
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
                ea2 ea2Var = ea2.a;
                re reVar = (re) obj;
                String strO = ky0.o(reVar, 0);
                String strD = reVar.d(1);
                strD.getClass();
                js8 js8Var = (js8) b92Var.c;
                js8Var.getClass();
                Long lC = reVar.c(2);
                lC.getClass();
                Integer numValueOf = Integer.valueOf((int) lC.longValue());
                js8Var.getClass();
                Object objN = ky0.n(reVar, 3, wfc.t);
                Long lC2 = reVar.c(4);
                return ea2Var.h(strO, strD, numValueOf, objN, lC2, ky0.m(lC2, reVar, 5));
            case 1:
                ca2 ca2Var = ca2.a;
                re reVar2 = (re) obj;
                String strO2 = ky0.o(reVar2, 0);
                String strD2 = reVar2.d(1);
                strD2.getClass();
                js8 js8Var2 = (js8) b92Var.c;
                js8Var2.getClass();
                Long lC3 = reVar2.c(2);
                lC3.getClass();
                Integer numValueOf2 = Integer.valueOf((int) lC3.longValue());
                js8Var2.getClass();
                Object objN2 = ky0.n(reVar2, 3, wfc.t);
                Long lC4 = reVar2.c(4);
                return ca2Var.h(strO2, strD2, numValueOf2, objN2, lC4, ky0.m(lC4, reVar2, 5));
            default:
                da2 da2Var = da2.a;
                re reVar3 = (re) obj;
                String strO3 = ky0.o(reVar3, 0);
                String strD3 = reVar3.d(1);
                strD3.getClass();
                js8 js8Var3 = (js8) b92Var.c;
                js8Var3.getClass();
                Long lC5 = reVar3.c(2);
                lC5.getClass();
                Integer numValueOf3 = Integer.valueOf((int) lC5.longValue());
                js8Var3.getClass();
                Object objN3 = ky0.n(reVar3, 3, wfc.t);
                Long lC6 = reVar3.c(4);
                return da2Var.h(strO3, strD3, numValueOf3, objN3, lC6, ky0.m(lC6, reVar3, 5));
        }
    }
}
