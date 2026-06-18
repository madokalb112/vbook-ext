package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zu0 implements Comparable {
    public static final zu0 c = new zu0(new byte[0]);
    public static final char[] d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public final byte[] a;
    public int b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zu0(byte[] bArr, int i, int i2) {
        this(fw.Y(bArr, i, i2));
        bArr.getClass();
    }

    public final byte a(int i) {
        byte[] bArr = this.a;
        if (i >= 0 && i < bArr.length) {
            return bArr[i];
        }
        k27.m(tw2.p(xv5.u(i, "index (", ") is out of byte string bounds: [0.."), bArr.length, ')'));
        return (byte) 0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        zu0 zu0Var = (zu0) obj;
        zu0Var.getClass();
        byte[] bArr = zu0Var.a;
        if (zu0Var == this) {
            return 0;
        }
        byte[] bArr2 = this.a;
        int iMin = Math.min(bArr2.length, bArr.length);
        for (int i = 0; i < iMin; i++) {
            int iV = lc5.V(bArr2[i] & 255, bArr[i] & 255);
            if (iV != 0) {
                return iV;
            }
        }
        return lc5.V(bArr2.length, bArr.length);
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || zu0.class != obj.getClass()) {
            return false;
        }
        zu0 zu0Var = (zu0) obj;
        byte[] bArr = zu0Var.a;
        int length = bArr.length;
        byte[] bArr2 = this.a;
        if (length != bArr2.length) {
            return false;
        }
        int i2 = zu0Var.b;
        if (i2 == 0 || (i = this.b) == 0 || i2 == i) {
            return Arrays.equals(bArr2, bArr);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.a);
        this.b = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        byte[] bArr = this.a;
        if (bArr.length == 0) {
            return "ByteString(size=0)";
        }
        String strValueOf = String.valueOf(bArr.length);
        StringBuilder sb = new StringBuilder((bArr.length * 2) + strValueOf.length() + 22);
        sb.append("ByteString(size=");
        sb.append(strValueOf);
        sb.append(" hex=");
        for (byte b : bArr) {
            char[] cArr = d;
            sb.append(cArr[(b >>> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        sb.append(')');
        return sb.toString();
    }

    public zu0(byte[] bArr) {
        this.a = bArr;
    }
}
