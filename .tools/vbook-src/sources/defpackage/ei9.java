package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ei9 implements kb4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object s;

    public /* synthetic */ ei9(int i, int i2, int i3, a07 a07Var, a07 a07Var2, a07 a07Var3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = a07Var;
        this.f = a07Var2;
        this.s = a07Var3;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.s;
        Object obj3 = this.f;
        Object obj4 = this.e;
        int i2 = this.d;
        int i3 = this.c;
        int i4 = this.b;
        switch (i) {
            case 0:
                it7 it7Var = (it7) obj;
                it7.n(it7Var, (jt7) obj4, i4, i3);
                it7.n(it7Var, (jt7) obj3, i2, ((pg8) obj2).a);
                return heb.a;
            default:
                a07 a07Var = (a07) obj3;
                ((pn2) obj).getClass();
                return new ea5((((long) Math.min((i3 - i2) - ((int) (((na5) a07Var.getValue()).a & 4294967295L)), t96.M(((Number) ((a07) obj2).getValue()).floatValue() * (i3 - ((int) (((na5) a07Var.getValue()).a & 4294967295L)))))) & 4294967295L) | (((long) t96.M(zma.j((a07) obj4) * (i4 - ((int) (zma.i(a07Var) >> 32))))) << 32));
        }
    }

    public /* synthetic */ ei9(jt7 jt7Var, int i, int i2, jt7 jt7Var2, int i3, pg8 pg8Var) {
        this.e = jt7Var;
        this.b = i;
        this.c = i2;
        this.f = jt7Var2;
        this.d = i3;
        this.s = pg8Var;
    }
}
