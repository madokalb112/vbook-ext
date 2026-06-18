package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class akb extends y2 {
    public static final Parcelable.Creator<akb> CREATOR = new gdc(12);
    public final int a;
    public final short b;
    public final short c;

    public akb(int i, short s, short s2) {
        this.a = i;
        this.b = s;
        this.c = s2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof akb)) {
            return false;
        }
        akb akbVar = (akb) obj;
        return this.a == akbVar.a && this.b == akbVar.b && this.c == akbVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Short.valueOf(this.b), Short.valueOf(this.c)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int iX0 = e11.x0(20293, parcel);
        e11.w0(parcel, 1, 4);
        parcel.writeInt(this.a);
        e11.w0(parcel, 2, 4);
        parcel.writeInt(this.b);
        e11.w0(parcel, 3, 4);
        parcel.writeInt(this.c);
        e11.y0(iX0, parcel);
    }
}
