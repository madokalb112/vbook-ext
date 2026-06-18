package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qj4 {
    public final byte[] a;

    public qj4(byte[] bArr) {
        this.a = bArr;
    }

    public final String a() {
        byte[] bArr = this.a;
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(fx1.X(((b & 255) >>> 4) & 15));
            sb.append(fx1.X(b & 15));
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qj4) {
            return Arrays.equals(this.a, ((qj4) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return a();
    }
}
