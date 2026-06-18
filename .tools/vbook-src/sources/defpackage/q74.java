package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class q74 extends o1a implements ac4 {
    public /* synthetic */ String a;
    public /* synthetic */ float b;
    public /* synthetic */ float c;
    public final /* synthetic */ s74 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q74(s74 s74Var, jt1 jt1Var) {
        super(4, jt1Var);
        this.d = s74Var;
    }

    @Override // defpackage.ac4
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        float fFloatValue = ((Number) obj2).floatValue();
        float fFloatValue2 = ((Number) obj3).floatValue();
        q74 q74Var = new q74(this.d, (jt1) obj4);
        q74Var.a = (String) obj;
        q74Var.b = fFloatValue;
        q74Var.c = fFloatValue2;
        heb hebVar = heb.a;
        q74Var.invokeSuspend(hebVar);
        return hebVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Object value;
        String str = this.a;
        float f = this.b;
        float f2 = this.c;
        e11.e0(obj);
        fr9 fr9Var = this.d.e;
        if (fr9Var != null) {
            do {
                value = fr9Var.getValue();
            } while (!fr9Var.j(value, p74.a((p74) value, str, f, f2, null, 17)));
        }
        return heb.a;
    }
}
