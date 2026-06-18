package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class fy4 extends rl5 implements yb4 {
    public static final fy4 b = new fy4(2, 1);
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fy4(int i, int i2) {
        super(2);
        this.a = i2;
        switch (i2) {
            case 1:
                super(i);
                break;
            default:
                break;
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                yn2.d((dd4) obj, 1);
                break;
            default:
                pc1 pc1Var = (pc1) obj2;
                ((p93) obj).c = pc1Var != null ? pc1Var.a : null;
                break;
        }
        return hebVar;
    }
}
