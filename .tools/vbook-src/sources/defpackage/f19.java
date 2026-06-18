package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class f19 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qg8 b;

    public /* synthetic */ f19(qg8 qg8Var, int i) {
        this.a = i;
        this.b = qg8Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        qg8 qg8Var = this.b;
        ux7 ux7Var = (ux7) obj;
        switch (i) {
            case 0:
                ux7Var.a();
                qg8Var.a = ((eb7) obj2).a;
                break;
            default:
                float fFloatValue = ((Float) obj2).floatValue();
                ux7Var.a();
                qg8Var.a = (((long) Float.floatToRawIntBits(fFloatValue)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
                break;
        }
        return hebVar;
    }
}
