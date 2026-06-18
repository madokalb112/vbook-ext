package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class eob implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qsb b;
    public final /* synthetic */ int c;
    public final /* synthetic */ zob d;

    public /* synthetic */ eob(qsb qsbVar, int i, zob zobVar, int i2) {
        this.a = i2;
        this.b = qsbVar;
        this.c = i;
        this.d = zobVar;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        heb hebVar = heb.a;
        o63 o63Var = o63.SECONDS;
        zob zobVar = this.d;
        int i2 = this.c;
        qsb qsbVar = this.b;
        switch (i) {
            case 0:
                mc8 mc8Var = k63.b;
                qsbVar.c(lx1.z0(-i2, o63Var));
                zobVar.e(3000L);
                break;
            case 1:
                mc8 mc8Var2 = k63.b;
                qsbVar.c(lx1.z0(i2, o63Var));
                zobVar.e(3000L);
                break;
            case 2:
                mc8 mc8Var3 = k63.b;
                qsbVar.c(lx1.z0(-i2, o63Var));
                zobVar.e(3000L);
                break;
            case 3:
                mc8 mc8Var4 = k63.b;
                qsbVar.c(lx1.z0(i2, o63Var));
                zobVar.e(3000L);
                break;
            case 4:
                mc8 mc8Var5 = k63.b;
                qsbVar.c(lx1.z0(-i2, o63Var));
                zobVar.e(3000L);
                break;
            default:
                mc8 mc8Var6 = k63.b;
                qsbVar.c(lx1.z0(i2, o63Var));
                zobVar.e(3000L);
                break;
        }
        return hebVar;
    }
}
