package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class pbc extends y2 {
    public static final Parcelable.Creator<pbc> CREATOR = new nbc(1);
    public final long a;

    public pbc(long j) {
        this.a = Long.valueOf(j).longValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof pbc) && this.a == ((pbc) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int iX0 = e11.x0(20293, parcel);
        e11.w0(parcel, 1, 8);
        parcel.writeLong(this.a);
        e11.y0(iX0, parcel);
    }
}
