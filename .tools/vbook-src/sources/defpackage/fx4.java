package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class fx4 extends t1c {
    public static final /* synthetic */ int H = 0;
    public final String F;
    public final byte[] G;

    static {
        new fx4();
    }

    public fx4() {
        Character chValueOf;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 256; i++) {
            sb.append((char) i);
        }
        String string = sb.toString();
        this.F = string;
        if (string.length() == 0) {
            chValueOf = null;
        } else {
            char cCharAt = string.charAt(0);
            int length = string.length() - 1;
            if (1 <= length) {
                int i2 = 1;
                while (true) {
                    char cCharAt2 = string.charAt(i2);
                    cCharAt = lc5.V(cCharAt, cCharAt2) < 0 ? cCharAt2 : cCharAt;
                    if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            chValueOf = Character.valueOf(cCharAt);
        }
        int iCharValue = chValueOf != null ? (char) (chValueOf.charValue() + 1) : 0;
        byte[] bArr = new byte[iCharValue];
        Arrays.fill(bArr, 0, iCharValue, (byte) 63);
        int length2 = this.F.length();
        for (int i3 = 0; i3 < length2; i3++) {
            bArr[this.F.charAt(i3)] = (byte) i3;
        }
        this.G = bArr;
    }

    @Override // defpackage.t1c
    public final int S(StringBuilder sb, byte[] bArr, int i) {
        bArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(this.F.charAt(bArr[i2] & 255));
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    @Override // defpackage.t1c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V(defpackage.b10 r5, java.lang.String r6, int r7) {
        /*
            r4 = this;
            r6.getClass()
            r0 = 0
        L4:
            if (r0 >= r7) goto L1c
            char r1 = r6.charAt(r0)
            if (r1 < 0) goto L14
            byte[] r2 = r4.G
            int r3 = r2.length
            if (r1 >= r3) goto L14
            r1 = r2[r1]
            goto L16
        L14:
            r1 = 63
        L16:
            r5.b(r1)
            int r0 = r0 + 1
            goto L4
        L1c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fx4.V(b10, java.lang.String, int):void");
    }

    @Override // defpackage.t1c
    public final int X(int i) {
        return i;
    }

    @Override // defpackage.t1c
    public final int Y(int i) {
        return i;
    }
}
