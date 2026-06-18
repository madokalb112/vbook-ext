package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class a01 extends o1a implements ac4 {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a01(int i, int i2, jt1 jt1Var) {
        super(i, jt1Var);
        this.a = i2;
    }

    @Override // defpackage.ac4
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = 4;
        jt1 jt1Var = (jt1) obj4;
        switch (i) {
            case 0:
                a01 a01Var = new a01(i2, 0, jt1Var);
                a01Var.b = obj;
                a01Var.c = obj2;
                a01Var.d = obj3;
                return a01Var.invokeSuspend(hebVar);
            case 1:
                a01 a01Var2 = new a01(i2, 1, jt1Var);
                a01Var2.b = obj;
                a01Var2.c = obj2;
                a01Var2.d = obj3;
                return a01Var2.invokeSuspend(hebVar);
            case 2:
                a01 a01Var3 = new a01(i2, 2, jt1Var);
                a01Var3.b = obj;
                a01Var3.c = obj2;
                a01Var3.d = obj3;
                return a01Var3.invokeSuspend(hebVar);
            case 3:
                a01 a01Var4 = new a01(i2, 3, jt1Var);
                a01Var4.b = obj;
                a01Var4.c = obj2;
                a01Var4.d = obj3;
                return a01Var4.invokeSuspend(hebVar);
            case 4:
                a01 a01Var5 = new a01(i2, i2, jt1Var);
                a01Var5.b = obj;
                a01Var5.c = obj2;
                a01Var5.d = obj3;
                return a01Var5.invokeSuspend(hebVar);
            default:
                a01 a01Var6 = new a01(i2, 5, jt1Var);
                a01Var6.b = obj;
                a01Var6.c = obj2;
                a01Var6.d = obj3;
                return a01Var6.invokeSuspend(hebVar);
        }
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                Object obj2 = this.b;
                Object obj3 = this.c;
                Object obj4 = this.d;
                e11.e0(obj);
                return new i7b(obj2, obj3, obj4);
            case 1:
                Object obj5 = this.b;
                Object obj6 = this.c;
                Object obj7 = this.d;
                e11.e0(obj);
                return new i7b(obj5, obj6, obj7);
            case 2:
                Object obj8 = this.b;
                Object obj9 = this.c;
                Object obj10 = this.d;
                e11.e0(obj);
                return new i7b(obj8, obj9, obj10);
            case 3:
                Object obj11 = this.b;
                Object obj12 = this.c;
                Object obj13 = this.d;
                e11.e0(obj);
                return new i7b(obj11, obj12, obj13);
            case 4:
                Object obj14 = this.b;
                Object obj15 = this.c;
                Object obj16 = this.d;
                e11.e0(obj);
                return new i7b(obj14, obj15, obj16);
            default:
                Object obj17 = this.b;
                Object obj18 = this.c;
                Object obj19 = this.d;
                e11.e0(obj);
                return new i7b(obj17, obj18, obj19);
        }
    }
}
