package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class v96 {
    public static final float[] a = u96.a();

    public static final float[] a(float[] fArr) {
        fArr.getClass();
        return (float[]) fArr.clone();
    }

    public static final float[] b(float[] fArr) {
        fArr.getClass();
        float[] fArr2 = (float[]) fArr.clone();
        u96.b(fArr2);
        return fArr2;
    }

    public static final void c(float[] fArr, kf8 kf8Var, kf8 kf8Var2) {
        fArr.getClass();
        kf8Var.getClass();
        float f = kf8Var2.c;
        float f2 = kf8Var2.a;
        float f3 = kf8Var.c;
        float f4 = kf8Var.a;
        float f5 = (f - f2) / (f3 - f4);
        float f6 = f2 - (f4 * f5);
        float f7 = kf8Var2.d;
        float f8 = kf8Var2.b;
        float f9 = kf8Var.d;
        float f10 = kf8Var.b;
        float f11 = (f7 - f8) / (f9 - f10);
        u96.f(fArr);
        fArr[0] = f5;
        fArr[12] = f6;
        fArr[5] = f11;
        fArr[13] = f8 - (f10 * f11);
    }

    public static final float[] d(float[] fArr, float[] fArr2) {
        fArr.getClass();
        fArr2.getClass();
        float[] fArr3 = (float[]) fArr.clone();
        u96.j(fArr3, fArr2);
        return fArr3;
    }
}
