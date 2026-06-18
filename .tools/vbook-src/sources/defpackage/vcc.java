package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class vcc extends y2 {
    public static final Parcelable.Creator<vcc> CREATOR = new nbc(11);
    public final byte[][] a;

    public vcc(byte[][] bArr) {
        ex1.w(bArr != null);
        ex1.w(1 == ((bArr.length & 1) ^ 1));
        int i = 0;
        while (i < bArr.length) {
            ex1.w(i == 0 || bArr[i] != null);
            int i2 = i + 1;
            ex1.w(bArr[i2] != null);
            int length = bArr[i2].length;
            ex1.w(length == 32 || length == 64);
            i += 2;
        }
        this.a = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vcc) {
            return Arrays.deepEquals(this.a, ((vcc) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (byte[] bArr : this.a) {
            iHashCode ^= Arrays.hashCode(new Object[]{bArr});
        }
        return iHashCode;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int iX0 = e11.x0(20293, parcel);
        e11.k0(parcel, 1, this.a);
        e11.y0(iX0, parcel);
    }
}
