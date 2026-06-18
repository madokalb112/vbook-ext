package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class or3 extends o1a implements bc4 {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;
    public /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ or3(int i, int i2, jt1 jt1Var) {
        super(i, jt1Var);
        this.a = i2;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                Object obj2 = this.b;
                Object obj3 = this.c;
                Object obj4 = this.d;
                Object obj5 = this.e;
                e11.e0(obj);
                return new Object[]{obj2, obj3, obj4, obj5};
            default:
                Object obj6 = this.b;
                Object obj7 = this.c;
                Object obj8 = this.d;
                Object obj9 = this.e;
                e11.e0(obj);
                return new Object[]{obj6, obj7, obj8, obj9};
        }
    }

    @Override // defpackage.bc4
    public final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = 5;
        jt1 jt1Var = (jt1) obj5;
        switch (i) {
            case 0:
                or3 or3Var = new or3(i2, 0, jt1Var);
                or3Var.b = obj;
                or3Var.c = obj2;
                or3Var.d = obj3;
                or3Var.e = obj4;
                return or3Var.invokeSuspend(hebVar);
            default:
                or3 or3Var2 = new or3(i2, 1, jt1Var);
                or3Var2.b = obj;
                or3Var2.c = obj2;
                or3Var2.d = obj3;
                or3Var2.e = obj4;
                return or3Var2.invokeSuspend(hebVar);
        }
    }
}
