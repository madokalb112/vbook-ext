package defpackage;

import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ag6 extends l89 {
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ List e;
    public final /* synthetic */ float f;

    public ag6(int i, boolean z, zy5 zy5Var, float f) {
        this.c = i;
        this.d = z;
        this.e = zy5Var;
        this.f = f;
    }

    public final Shader c(long j) {
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        int i = this.c;
        float f = 1.0f / i;
        int i2 = (i * 2) + 1;
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(Float.valueOf(wx1.P(((i3 - i) * f) + this.f, 0.0f, 1.0f)));
        }
        if (this.d) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
        } else {
            int i4 = (int) (j >> 32);
            int i5 = (int) (j & 4294967295L);
            float fMax = Math.max(Float.intBitsToFloat(i4), Float.intBitsToFloat(i5));
            float fMax2 = Math.max(Float.intBitsToFloat(i4), Float.intBitsToFloat(i5));
            jFloatToRawIntBits = Float.floatToRawIntBits(fMax);
            iFloatToRawIntBits = Float.floatToRawIntBits(fMax2);
        }
        return pu1.o(0, 0L, (((long) iFloatToRawIntBits) & 4294967295L) | (jFloatToRawIntBits << 32), this.e, arrayList);
    }
}
