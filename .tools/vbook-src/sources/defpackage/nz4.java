package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class nz4 extends o1a implements zb4 {
    public final /* synthetic */ int a;
    public /* synthetic */ Integer b;
    public /* synthetic */ Integer c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nz4(int i, int i2, jt1 jt1Var) {
        super(i, jt1Var);
        this.a = i2;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = 3;
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        jt1 jt1Var = (jt1) obj3;
        switch (i) {
            case 0:
                nz4 nz4Var = new nz4(i2, 0, jt1Var);
                nz4Var.b = num;
                nz4Var.c = num2;
                return nz4Var.invokeSuspend(hebVar);
            default:
                nz4 nz4Var2 = new nz4(i2, 1, jt1Var);
                nz4Var2.b = num;
                nz4Var2.c = num2;
                return nz4Var2.invokeSuspend(hebVar);
        }
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                Integer num = this.b;
                Integer num2 = this.c;
                e11.e0(obj);
                return new xl7(num, num2);
            default:
                Integer num3 = this.b;
                Integer num4 = this.c;
                e11.e0(obj);
                return new xl7(num3, num4);
        }
    }
}
