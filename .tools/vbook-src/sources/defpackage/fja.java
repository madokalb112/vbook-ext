package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class fja extends o1a implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ byte[] b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fja(byte[] bArr, jt1 jt1Var, int i) {
        super(1, jt1Var);
        this.a = i;
        this.b = bArr;
    }

    @Override // defpackage.vc0
    public final jt1 create(jt1 jt1Var) {
        int i = this.a;
        byte[] bArr = this.b;
        switch (i) {
            case 0:
                return new fja(bArr, jt1Var, 0);
            case 1:
                return new fja(bArr, jt1Var, 1);
            case 2:
                return new fja(bArr, jt1Var, 2);
            default:
                return new fja(bArr, jt1Var, 3);
        }
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        jt1 jt1Var = (jt1) obj;
        switch (i) {
            case 0:
                fja fjaVar = (fja) create(jt1Var);
                e11.e0(hebVar);
                break;
            case 1:
                fja fjaVar2 = (fja) create(jt1Var);
                e11.e0(hebVar);
                break;
        }
        return ((fja) create(jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        byte[] bArr = this.b;
        switch (i) {
            case 0:
                e11.e0(obj);
                break;
            case 1:
                e11.e0(obj);
                break;
            case 2:
                e11.e0(obj);
                break;
            default:
                e11.e0(obj);
                break;
        }
        return bArr;
    }
}
