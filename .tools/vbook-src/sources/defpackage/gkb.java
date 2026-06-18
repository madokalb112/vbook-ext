package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class gkb extends o1a implements zb4 {
    public /* synthetic */ int a;
    public /* synthetic */ int b;
    public final /* synthetic */ kb4 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gkb(kb4 kb4Var, jt1 jt1Var) {
        super(3, jt1Var);
        this.c = kb4Var;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        gkb gkbVar = new gkb(this.c, (jt1) obj3);
        gkbVar.a = iIntValue;
        gkbVar.b = iIntValue2;
        heb hebVar = heb.a;
        gkbVar.invokeSuspend(hebVar);
        return hebVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        int i2 = this.b;
        e11.e0(obj);
        this.c.invoke(new gm3(fm3.c, i, i2));
        return heb.a;
    }
}
