package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ky6 implements yb4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ i8a b;
    public final /* synthetic */ String c;
    public final /* synthetic */ o8a d;
    public final /* synthetic */ String e;

    public /* synthetic */ ky6(i8a i8aVar, String str, o8a o8aVar, String str2) {
        this.b = i8aVar;
        this.c = str;
        this.d = o8aVar;
        this.e = str2;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        vs2 vs2Var = vs2.a;
        String str = this.e;
        o8a o8aVar = this.d;
        String str2 = this.c;
        i8a i8aVar = this.b;
        switch (i) {
            case 0:
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    t96.f(yn2.K(new dyb(vs2Var), 10.0f, 8.0f), 1, 1, jf0.G(1303521047, new ly6(o8aVar, str2, str, i8aVar), dd4Var), dd4Var, 3072, 0);
                }
                break;
            default:
                dd4 dd4Var2 = (dd4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dd4Var2.Y();
                } else {
                    fx1.o(yn2.K(new dyb(vs2Var), 16.0f, 12.0f), 0, 1, jf0.G(1373007658, new ly6(i8aVar, str2, o8aVar, str), dd4Var2), dd4Var2, 3072, 2);
                }
                break;
        }
        return hebVar;
    }

    public /* synthetic */ ky6(o8a o8aVar, String str, String str2, i8a i8aVar) {
        this.d = o8aVar;
        this.c = str;
        this.e = str2;
        this.b = i8aVar;
    }
}
