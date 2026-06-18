package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class g5b extends o1a implements zb4 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ c24 c;
    public /* synthetic */ Object[] d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g5b(int i, int i2, jt1 jt1Var) {
        super(i, jt1Var);
        this.a = i2;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = 3;
        c24 c24Var = (c24) obj;
        Object[] objArr = (Object[]) obj2;
        jt1 jt1Var = (jt1) obj3;
        switch (i) {
            case 0:
                g5b g5bVar = new g5b(i2, 0, jt1Var);
                g5bVar.c = c24Var;
                g5bVar.d = objArr;
                return g5bVar.invokeSuspend(hebVar);
            default:
                g5b g5bVar2 = new g5b(i2, 1, jt1Var);
                g5bVar2.c = c24Var;
                g5bVar2.d = objArr;
                return g5bVar2.invokeSuspend(hebVar);
        }
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        yp1 yp1Var;
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = 0;
        xx1 xx1Var = xx1.a;
        yp1 yp1Var2 = null;
        switch (i) {
            case 0:
                int i3 = this.b;
                if (i3 == 0) {
                    e11.e0(obj);
                    c24 c24Var = this.c;
                    Object[] objArr = this.d;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    Object obj6 = objArr[4];
                    StringBuilder sb = new StringBuilder();
                    sb.append(obj2);
                    sb.append(obj3);
                    sb.append(obj4);
                    sb.append(obj5);
                    sb.append(obj6);
                    String string = sb.toString();
                    this.c = null;
                    this.d = null;
                    this.b = 1;
                    if (c24Var.b(string, this) == xx1Var) {
                    }
                } else if (i3 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            default:
                int i4 = this.b;
                if (i4 == 0) {
                    e11.e0(obj);
                    c24 c24Var2 = this.c;
                    yp1[] yp1VarArr = (aq1[]) this.d;
                    int length = yp1VarArr.length;
                    while (true) {
                        yp1Var = yp1.a;
                        if (i2 < length) {
                            yp1 yp1Var3 = yp1VarArr[i2];
                            if (lc5.Q(yp1Var3, yp1Var)) {
                                i2++;
                            } else {
                                yp1Var2 = yp1Var3;
                            }
                        }
                    }
                    if (yp1Var2 != null) {
                        yp1Var = yp1Var2;
                    }
                    this.b = 1;
                    if (c24Var2.b(yp1Var, this) == xx1Var) {
                    }
                } else if (i4 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
        }
        return xx1Var;
    }
}
