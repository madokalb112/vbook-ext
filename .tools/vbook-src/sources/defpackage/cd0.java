package defpackage;

import java.io.IOException;
import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class cd0 {
    public static final ad0 a;
    public static final zc0 b;

    static {
        new ad0("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        a = new ad0("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new bd0("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new bd0("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        b = new zc0(new yc0("base16()", new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}));
    }

    public final String a(byte[] bArr) {
        int length = bArr.length;
        fx1.P(0, length, bArr.length);
        yc0 yc0Var = ((bd0) this).c;
        int i = yc0Var.e;
        int i2 = yc0Var.f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(qu1.E(length, i2) * i);
        try {
            b(sb, bArr, length);
            return sb.toString();
        } catch (IOException e) {
            gp.i(e);
            return null;
        }
    }

    public abstract void b(StringBuilder sb, byte[] bArr, int i);
}
