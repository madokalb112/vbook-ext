package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class mfc extends y2 {
    public static final Parcelable.Creator<mfc> CREATOR = new gdc(28);
    public final byte[] a;
    public final byte[] b;

    public mfc(byte[] bArr, byte[] bArr2) {
        this.a = bArr;
        this.b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mfc)) {
            return false;
        }
        mfc mfcVar = (mfc) obj;
        return Arrays.equals(this.a, mfcVar.a) && Arrays.equals(this.b, mfcVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int iX0 = e11.x0(20293, parcel);
        e11.j0(parcel, 1, this.a, false);
        e11.j0(parcel, 2, this.b, false);
        e11.y0(iX0, parcel);
    }
}
