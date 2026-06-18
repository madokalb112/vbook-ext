package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ti6 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ ti6(int i, long j, long j2, long j3) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        long j = this.d;
        long j2 = this.c;
        long j3 = this.b;
        switch (i) {
            case 0:
                r43 r43Var = (r43) obj;
                r43Var.getClass();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (r43Var.f() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (r43Var.f() & 4294967295L));
                float f = 0.35f * fIntBitsToFloat2;
                r43.e0(r43Var, lc1.c(0.25f, j3), fIntBitsToFloat2 * 0.4f, (((long) Float.floatToRawIntBits(0.25f * fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), 0.0f, (s43) null, 120);
                float f2 = fIntBitsToFloat2 * 0.3f;
                r43.e0(r43Var, lc1.c(0.2f, j2), f2, (((long) Float.floatToRawIntBits(fIntBitsToFloat * 0.75f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), 0.0f, (s43) null, 120);
                r43.e0(r43Var, lc1.c(0.22f, j), f, (((long) Float.floatToRawIntBits(0.7f * fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2 * 0.75f)) & 4294967295L), 0.0f, (s43) null, 120);
                r43.e0(r43Var, lc1.c(0.18f, j3), fIntBitsToFloat2 * 0.22f, (((long) Float.floatToRawIntBits(fIntBitsToFloat * 0.2f)) << 32) | (((long) Float.floatToRawIntBits(0.78f * fIntBitsToFloat2)) & 4294967295L), 0.0f, (s43) null, 120);
                break;
            default:
                r43 r43Var2 = (r43) obj;
                r43Var2.getClass();
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (r43Var2.f() >> 32)) * 0.5f;
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (r43Var2.f() & 4294967295L)) * 0.5f;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L);
                float fC = fg9.c(r43Var2.f()) * 0.2f;
                r43.e0(r43Var2, lc1.c(0.22f, j3), fC, jFloatToRawIntBits, 0.0f, new jw9(2.0f, 0.0f, 0, 0, (ih) null, 30), Token.ASSIGN_LOGICAL_AND);
                r43.e0(r43Var2, lc1.c(0.18f, j2), fC * 1.6f, jFloatToRawIntBits, 0.0f, new jw9(2.0f, 0.0f, 0, 0, (ih) null, 30), Token.ASSIGN_LOGICAL_AND);
                r43.e0(r43Var2, lc1.c(0.14f, j), fC * 2.2f, jFloatToRawIntBits, 0.0f, new jw9(2.0f, 0.0f, 0, 0, (ih) null, 30), Token.ASSIGN_LOGICAL_AND);
                float fIntBitsToFloat5 = Float.intBitsToFloat((int) (r43Var2.f() >> 32)) * 0.2f;
                float fIntBitsToFloat6 = Float.intBitsToFloat((int) (r43Var2.f() & 4294967295L)) * 0.25f;
                r43.e0(r43Var2, lc1.c(0.12f, j3), fC * 1.3f, (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat6)) & 4294967295L), 0.0f, new jw9(1.5f, 0.0f, 0, 0, (ih) null, 30), Token.ASSIGN_LOGICAL_AND);
                float fIntBitsToFloat7 = Float.intBitsToFloat((int) (r43Var2.f() >> 32)) * 0.82f;
                float fIntBitsToFloat8 = Float.intBitsToFloat((int) (r43Var2.f() & 4294967295L)) * 0.75f;
                r43.e0(r43Var2, lc1.c(0.12f, j2), fC * 1.1f, (((long) Float.floatToRawIntBits(fIntBitsToFloat7)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat8)) & 4294967295L), 0.0f, new jw9(1.5f, 0.0f, 0, 0, (ih) null, 30), Token.ASSIGN_LOGICAL_AND);
                break;
        }
        return hebVar;
    }
}
