package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class amc extends y2 {
    public static final Parcelable.Creator<amc> CREATOR = new vfc(25);
    public final List a;

    public amc(ArrayList arrayList) {
        ex1.C(arrayList);
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof amc)) {
            return false;
        }
        List list = ((amc) obj).a;
        List list2 = this.a;
        return list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.a)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int iX0 = e11.x0(20293, parcel);
        e11.v0(parcel, 1, this.a, false);
        e11.y0(iX0, parcel);
    }
}
