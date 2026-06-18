package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qo6 implements n47 {
    public final /* synthetic */ kb9 a;
    public final /* synthetic */ kb4 b;

    public qo6(kb9 kb9Var, kb4 kb4Var) {
        this.a = kb9Var;
        this.b = kb4Var;
    }

    public final long H0(long j, long j2, int i) {
        if (i != 1) {
            return 0L;
        }
        ob obVar = this.a.b;
        float fE = obVar.e(Float.intBitsToFloat((int) (j2 & 4294967295L)));
        ym7 ym7Var = obVar.j;
        float fH = Float.isNaN(ym7Var.h()) ? 0.0f : ym7Var.h();
        ym7Var.i(fE);
        return a(fE - fH);
    }

    public final Object K0(long j, long j2, jt1 jt1Var) {
        this.b.invoke(new Float(wlb.c(j2)));
        return new wlb(j2);
    }

    public final Object M(long j, jt1 jt1Var) {
        float fC = wlb.c(j);
        kb9 kb9Var = this.a;
        float f = kb9Var.b.f();
        float fC2 = kb9Var.b.d().c();
        if (fC >= 0.0f || f <= fC2) {
            j = 0;
        } else {
            this.b.invoke(new Float(fC));
        }
        return new wlb(j);
    }

    public final long V(int i, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f || i != 1) {
            return 0L;
        }
        ob obVar = this.a.b;
        float fE = obVar.e(fIntBitsToFloat);
        ym7 ym7Var = obVar.j;
        float fH = Float.isNaN(ym7Var.h()) ? 0.0f : ym7Var.h();
        ym7Var.i(fE);
        return a(fE - fH);
    }

    public final long a(float f) {
        return (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }
}
