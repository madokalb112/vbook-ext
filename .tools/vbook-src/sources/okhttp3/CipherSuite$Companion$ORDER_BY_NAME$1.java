package okhttp3;

import defpackage.lc5;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class CipherSuite$Companion$ORDER_BY_NAME$1 implements Comparator<String> {
    @Override // java.util.Comparator
    public final int compare(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        str3.getClass();
        str4.getClass();
        int iMin = Math.min(str3.length(), str4.length());
        for (int i = 4; i < iMin; i++) {
            char cCharAt = str3.charAt(i);
            char cCharAt2 = str4.charAt(i);
            if (cCharAt != cCharAt2) {
                return lc5.V(cCharAt, cCharAt2) < 0 ? -1 : 1;
            }
        }
        int length = str3.length();
        int length2 = str4.length();
        if (length != length2) {
            return length < length2 ? -1 : 1;
        }
        return 0;
    }
}
