package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class sq8 extends ld5 {
    @Override // defpackage.r21
    public final int b(int i, byte[] bArr) {
        int i2;
        bArr.getClass();
        int i3 = bArr[i] & 255;
        if (129 <= i3 && i3 < 160) {
            i2 = i3 - Token.DEFAULT;
        } else {
            if (224 > i3 || i3 >= 240) {
                return -1;
            }
            i2 = i3 - 193;
        }
        int i4 = i2 * 188;
        int i5 = bArr[i + 1] & 255;
        int i6 = (i5 - 64) + i4;
        return i5 >= 128 ? i6 - 1 : i6;
    }
}
