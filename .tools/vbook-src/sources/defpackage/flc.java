package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class flc extends y2 {
    public static final Parcelable.Creator<flc> CREATOR = new vfc(22);
    public final long a;
    public final byte[] b;
    public final byte[] c;
    public final byte[] d;

    public flc(long j, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = j;
        ex1.C(bArr);
        this.b = bArr;
        ex1.C(bArr2);
        this.c = bArr2;
        ex1.C(bArr3);
        this.d = bArr3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof flc)) {
            return false;
        }
        flc flcVar = (flc) obj;
        return this.a == flcVar.a && Arrays.equals(this.b, flcVar.b) && Arrays.equals(this.c, flcVar.c) && Arrays.equals(this.d, flcVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, this.c, this.d});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int iX0 = e11.x0(20293, parcel);
        e11.w0(parcel, 1, 8);
        parcel.writeLong(this.a);
        e11.j0(parcel, 2, this.b, false);
        e11.j0(parcel, 3, this.c, false);
        e11.j0(parcel, 4, this.d, false);
        e11.y0(iX0, parcel);
    }
}
