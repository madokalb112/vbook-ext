package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class a62 implements b24 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b24 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a62(b24 b24Var, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = b24Var;
        this.c = obj;
        this.d = obj2;
    }

    @Override // defpackage.b24
    public final Object a(c24 c24Var, jt1 jt1Var) {
        int i = this.a;
        int i2 = 1;
        heb hebVar = heb.a;
        xx1 xx1Var = xx1.a;
        Object obj = this.d;
        Object obj2 = this.c;
        b24 b24Var = this.b;
        switch (i) {
            case 0:
                Object objA = b24Var.a(new zn(i2, c24Var, (String) obj2, (String) obj), jt1Var);
                return objA == xx1Var ? objA : hebVar;
            case 1:
                Object objM0 = h67.m0(jt1Var, c24Var, r90.d, new xa((zb4) obj, (jt1) null, 13), new b24[]{b24Var, (b24) obj2});
                return objM0 == xx1Var ? objM0 : hebVar;
            default:
                Object objA2 = b24Var.a(new zn(5, c24Var, (dp8) obj2, (f2c) obj), jt1Var);
                return objA2 == xx1Var ? objA2 : hebVar;
        }
    }
}
