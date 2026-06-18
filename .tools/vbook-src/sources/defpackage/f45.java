package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class f45 extends o1a implements zb4 {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f45(int i, int i2, jt1 jt1Var) {
        super(i, jt1Var);
        this.a = i2;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = 3;
        jt1 jt1Var = (jt1) obj3;
        switch (i) {
            case 0:
                f45 f45Var = new f45(i2, 0, jt1Var);
                f45Var.b = obj;
                f45Var.c = obj2;
                return f45Var.invokeSuspend(hebVar);
            case 1:
                f45 f45Var2 = new f45(i2, 1, jt1Var);
                f45Var2.b = obj;
                f45Var2.c = obj2;
                return f45Var2.invokeSuspend(hebVar);
            case 2:
                f45 f45Var3 = new f45(i2, 2, jt1Var);
                f45Var3.b = obj;
                f45Var3.c = obj2;
                return f45Var3.invokeSuspend(hebVar);
            case 3:
                f45 f45Var4 = new f45(i2, i2, jt1Var);
                f45Var4.b = obj;
                f45Var4.c = obj2;
                return f45Var4.invokeSuspend(hebVar);
            case 4:
                f45 f45Var5 = new f45(i2, 4, jt1Var);
                f45Var5.b = obj;
                f45Var5.c = obj2;
                return f45Var5.invokeSuspend(hebVar);
            case 5:
                f45 f45Var6 = new f45(i2, 5, jt1Var);
                f45Var6.b = obj;
                f45Var6.c = obj2;
                return f45Var6.invokeSuspend(hebVar);
            case 6:
                f45 f45Var7 = new f45(i2, 6, jt1Var);
                f45Var7.b = obj;
                f45Var7.c = obj2;
                return f45Var7.invokeSuspend(hebVar);
            default:
                f45 f45Var8 = new f45(i2, 7, jt1Var);
                f45Var8.b = obj;
                f45Var8.c = obj2;
                return f45Var8.invokeSuspend(hebVar);
        }
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                Object obj2 = this.b;
                Object obj3 = this.c;
                e11.e0(obj);
                return new xl7(obj2, obj3);
            case 1:
                Object obj4 = this.b;
                Object obj5 = this.c;
                e11.e0(obj);
                return new xl7(obj4, obj5);
            case 2:
                Object obj6 = this.b;
                Object obj7 = this.c;
                e11.e0(obj);
                return new xl7(obj6, obj7);
            case 3:
                Object obj8 = this.b;
                Object obj9 = this.c;
                e11.e0(obj);
                return new xl7(obj8, obj9);
            case 4:
                Object obj10 = this.b;
                Object obj11 = this.c;
                e11.e0(obj);
                return new xl7(obj10, obj11);
            case 5:
                Object obj12 = this.b;
                Object obj13 = this.c;
                e11.e0(obj);
                return new xl7(obj12, obj13);
            case 6:
                Object obj14 = this.b;
                Object obj15 = this.c;
                e11.e0(obj);
                return new xl7(obj14, obj15);
            default:
                Object obj16 = this.b;
                Object obj17 = this.c;
                e11.e0(obj);
                return new xl7(obj16, obj17);
        }
    }
}
