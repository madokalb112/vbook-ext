package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class kx2 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ long c;

    public /* synthetic */ kx2(float f, long j, int i) {
        this.a = i;
        this.b = f;
        this.c = j;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        float f = this.b;
        switch (i) {
            case 0:
                r43 r43Var = (r43) obj;
                float fK0 = r43Var.k0(f);
                r43.x0(r43Var, this.c, (((long) Float.floatToRawIntBits(r43Var.k0(f) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(r43Var.k0(f) / 2.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (r43Var.f() & 4294967295L))))), fK0, 0, 0.0f, 496);
                break;
            default:
                r43 r43Var2 = (r43) obj;
                float fK02 = r43Var2.k0(f);
                r43.x0(r43Var2, this.c, (((long) Float.floatToRawIntBits(r43Var2.k0(f) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (r43Var2.f() >> 32)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(r43Var2.k0(f) / 2.0f))), fK02, 0, 0.0f, 496);
                break;
        }
        return hebVar;
    }
}
