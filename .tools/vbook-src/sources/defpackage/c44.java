package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class c44 implements fq8 {
    public static final c44 a = new c44();

    @Override // defpackage.fq8
    public final ou6 b(float f, ou6 ou6Var, boolean z) {
        if (f <= 0.0d) {
            o75.a("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return ou6Var.e(new bp5(f, true));
    }
}
