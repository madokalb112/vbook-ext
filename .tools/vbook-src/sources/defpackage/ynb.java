package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ynb implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qsb b;

    public /* synthetic */ ynb(qsb qsbVar, int i) {
        this.a = i;
        this.b = qsbVar;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        o63 o63Var = o63.SECONDS;
        qsb qsbVar = this.b;
        int iIntValue = ((Integer) obj).intValue();
        switch (i) {
            case 0:
                mc8 mc8Var = k63.b;
                qsbVar.c(lx1.z0(iIntValue, o63Var));
                break;
            case 1:
                mc8 mc8Var2 = k63.b;
                qsbVar.c(lx1.z0(-iIntValue, o63Var));
                break;
            case 2:
                mc8 mc8Var3 = k63.b;
                qsbVar.c(lx1.z0(iIntValue, o63Var));
                break;
            default:
                mc8 mc8Var4 = k63.b;
                qsbVar.c(lx1.z0(-iIntValue, o63Var));
                break;
        }
        return hebVar;
    }
}
