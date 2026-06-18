package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class q77 {
    public static final List a = gc1.Z("NativePRNGNonBlocking", "WINDOWS-PRNG", "DRBG");
    public static final ir0 b = vm7.c(1024, 6, null);
    public static final oq9 c;

    static {
        jx1 rx1Var = new rx1("nonce-generator");
        aj2 aj2Var = rw2.a;
        j77 j77Var = j77.b;
        aj2Var.getClass();
        c = ah1.I(yf4.a, gx1.T(aj2Var, j77Var).plus(rx1Var), zx1.b, new p77(2, null));
    }
}
