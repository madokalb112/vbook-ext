package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class k68 extends y2 {
    public static final Parcelable.Creator<k68> CREATOR = new nbc(22);
    public final String a;
    public final String b;
    public final String c;

    public k68(String str, String str2, String str3) {
        ex1.C(str);
        this.a = str;
        ex1.C(str2);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k68)) {
            return false;
        }
        k68 k68Var = (k68) obj;
        return qx1.u(this.a, k68Var.a) && qx1.u(this.b, k68Var.b) && qx1.u(this.c, k68Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int iX0 = e11.x0(20293, parcel);
        e11.r0(parcel, 2, this.a, false);
        e11.r0(parcel, 3, this.b, false);
        e11.r0(parcel, 4, this.c, false);
        e11.y0(iX0, parcel);
    }
}
