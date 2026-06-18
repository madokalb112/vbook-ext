package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class df4 extends x20 {
    public static final Parcelable.Creator<df4> CREATOR = new nbc(10);
    public final String a;

    public df4(String str) {
        ex1.z(str);
        this.a = str;
    }

    public final String b() {
        return "github.com";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int iX0 = e11.x0(20293, parcel);
        e11.r0(parcel, 1, this.a, false);
        e11.y0(iX0, parcel);
    }
}
