package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class rg4 extends x20 {
    public static final Parcelable.Creator<rg4> CREATOR = new nbc(12);
    public final String a;
    public final String b;

    public rg4(String str, String str2) {
        if (str == null && str2 == null) {
            gp.l("Must specify an idToken or an accessToken.");
            throw null;
        }
        if (str != null && str.length() == 0) {
            gp.l("idToken cannot be empty");
            throw null;
        }
        if (str2 != null && str2.length() == 0) {
            gp.l("accessToken cannot be empty");
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final String b() {
        return "google.com";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int iX0 = e11.x0(20293, parcel);
        e11.r0(parcel, 1, this.a, false);
        e11.r0(parcel, 2, this.b, false);
        e11.y0(iX0, parcel);
    }
}
