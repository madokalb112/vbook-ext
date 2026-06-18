package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class h30 extends y2 {
    public static final Parcelable.Creator<h30> CREATOR = new gdc(24);
    public final boolean a;

    public h30(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof h30) && this.a == ((h30) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int iX0 = e11.x0(20293, parcel);
        e11.w0(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        e11.y0(iX0, parcel);
    }
}
