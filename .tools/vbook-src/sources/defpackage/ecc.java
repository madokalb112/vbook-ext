package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ecc extends y2 {
    public static final Parcelable.Creator<ecc> CREATOR = new nbc(8);
    public final String a;

    public ecc(String str) {
        ex1.C(str);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ecc) {
            return this.a.equals(((ecc) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int iX0 = e11.x0(20293, parcel);
        e11.r0(parcel, 1, this.a, false);
        e11.y0(iX0, parcel);
    }
}
