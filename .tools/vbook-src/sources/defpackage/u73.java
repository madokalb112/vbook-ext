package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class u73 extends r21 {
    public static final d6a e = new d6a(new g53(21));

    @Override // defpackage.r21
    public final int b(int i, byte[] bArr) {
        bArr.getClass();
        if ((bArr[i] & 255) < 176) {
            return -1;
        }
        return (((r1 - Token.GENEXPR) * 94) + (bArr[i + 1] & 255)) - 161;
    }
}
