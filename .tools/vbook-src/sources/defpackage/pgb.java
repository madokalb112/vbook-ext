package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class pgb {
    public static final /* synthetic */ int a = 0;

    static {
        boolean[] zArr = new boolean[Token.EXPORT];
        zArr[45] = true;
        zArr[46] = true;
        zArr[95] = true;
        for (char c = '0'; c < ':'; c = (char) (c + 1)) {
            zArr[c] = true;
        }
        for (char c2 = 'A'; c2 < '['; c2 = (char) (c2 + 1)) {
            zArr[c2] = true;
        }
        for (char c3 = 'a'; c3 < '{'; c3 = (char) (c3 + 1)) {
            zArr[c3] = true;
        }
    }

    public static String a(String str) {
        if (str.length() != 0) {
            int length = str.length();
            StringBuilder sb = new StringBuilder(length);
            int i = 0;
            int i2 = 0;
            boolean z = false;
            byte[] bArr = null;
            while (i < length) {
                char cCharAt = str.charAt(i);
                if (cCharAt == '%') {
                    if (!z) {
                        sb.append((CharSequence) str, 0, i);
                        z = true;
                    }
                    if (bArr == null) {
                        bArr = new byte[(length - i) / 3];
                    }
                    int i3 = i + 1;
                    i += 3;
                    if (length < i) {
                        throw new IllegalArgumentException(("Incomplete trailing escape (" + cCharAt + ") pattern").toString());
                    }
                    try {
                        String strSubstring = str.substring(i3, i);
                        gjb.X(16);
                        int i4 = Integer.parseInt(strSubstring, 16);
                        if (i4 < 0 || i4 >= 256) {
                            throw new IllegalArgumentException("Illegal escape value");
                        }
                        bArr[i2] = (byte) i4;
                        i2++;
                    } catch (NumberFormatException e) {
                        throw new IllegalArgumentException("Illegal characters in escape sequence: " + e + ".message", e);
                    }
                } else {
                    if (bArr != null) {
                        sb.append(iw9.A(0, bArr, i2, 4));
                        i2 = 0;
                        bArr = null;
                        z = true;
                    }
                    if (z) {
                        sb.append(cCharAt);
                    }
                    i++;
                }
            }
            if (bArr != null) {
                sb.append(iw9.A(0, bArr, i2, 4));
            }
            if (z) {
                return sb.toString();
            }
        }
        return str;
    }
}
