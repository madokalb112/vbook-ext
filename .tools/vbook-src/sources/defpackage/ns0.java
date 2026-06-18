package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ns0 implements s25 {
    public final byte[] a;
    public final String b;

    public ns0(byte[] bArr) {
        this.a = bArr;
        this.b = bArr.toString();
    }

    @Override // defpackage.s25
    public final il9 a() {
        xq0 xq0Var = new xq0();
        byte[] bArr = this.a;
        xq0Var.write(bArr, 0, bArr.length);
        return xq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ns0.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((ns0) obj).a);
    }

    @Override // defpackage.s25
    public final String getKey() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ByteArrayImageSource('" + this.a + "')";
    }
}
