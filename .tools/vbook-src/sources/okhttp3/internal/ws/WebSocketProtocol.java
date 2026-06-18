package okhttp3.internal.ws;

import defpackage.dx1;
import defpackage.vq0;
import defpackage.xq0;
import defpackage.xv5;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class WebSocketProtocol {
    public static String a(int i) {
        if (i < 1000 || i >= 5000) {
            return dx1.f(i, "Code must be in range [1000,5000): ");
        }
        if ((1004 > i || i >= 1007) && (1015 > i || i >= 3000)) {
            return null;
        }
        return xv5.k(i, "Code ", " is reserved and may not be used.");
    }

    public static void b(vq0 vq0Var, byte[] bArr) {
        long j;
        vq0Var.getClass();
        bArr.getClass();
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = vq0Var.e;
            int i2 = vq0Var.f;
            int i3 = vq0Var.s;
            if (bArr2 != null) {
                while (i2 < i3) {
                    int i4 = i % length;
                    bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                    i2++;
                    i = i4 + 1;
                }
            }
            long j2 = vq0Var.d;
            xq0 xq0Var = vq0Var.a;
            xq0Var.getClass();
            if (j2 == xq0Var.b) {
                gp.j("no more bytes");
                return;
            }
            j = vq0Var.d;
        } while (vq0Var.q(j == -1 ? 0L : j + ((long) (vq0Var.s - vq0Var.f))) != -1);
    }
}
