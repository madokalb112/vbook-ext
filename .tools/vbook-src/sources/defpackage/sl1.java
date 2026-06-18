package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class sl1 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kb4 b;
    public final /* synthetic */ kb4 c;

    public /* synthetic */ sl1(kb4 kb4Var, kb4 kb4Var2, int i) {
        this.a = i;
        this.b = kb4Var;
        this.c = kb4Var2;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        kb4 kb4Var = this.c;
        kb4 kb4Var2 = this.b;
        switch (i) {
            case 0:
                ox oxVar = (ox) obj;
                oxVar.getClass();
                if (!(oxVar instanceof mx)) {
                    if (!(oxVar instanceof nx)) {
                        if (!(oxVar instanceof lx) && !(oxVar instanceof kx)) {
                            mn5.g();
                        }
                    } else if (kb4Var != null) {
                        kb4Var.invoke(oxVar);
                    }
                } else if (kb4Var2 != null) {
                    kb4Var2.invoke(oxVar);
                }
                break;
            case 1:
                obj.getClass();
                if (kb4Var2 != null) {
                    kb4Var2.invoke(obj);
                }
                kb4Var.invoke(obj);
                break;
            case 2:
                xr xrVar = (xr) obj;
                xrVar.getClass();
                kb4Var2.invoke(xrVar);
                kb4Var.invoke(Boolean.FALSE);
                break;
            case 3:
                xr xrVar2 = (xr) obj;
                xrVar2.getClass();
                kb4Var2.invoke(xrVar2);
                kb4Var.invoke(Boolean.FALSE);
                break;
            case 4:
                kb4Var2.invoke(obj);
                kb4Var.invoke(obj);
                break;
            default:
                kb4Var2.invoke(obj);
                kb4Var.invoke(obj);
                break;
        }
        return hebVar;
    }
}
