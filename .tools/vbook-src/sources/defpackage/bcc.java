package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class bcc extends y2 {
    public static final Parcelable.Creator<bcc> CREATOR = new nbc(5);
    public final long a;
    public final int b;
    public final long c;

    public bcc(long j, long j2, int i) {
        this.a = j;
        this.b = i;
        this.c = j2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int iX0 = e11.x0(20293, parcel);
        e11.w0(parcel, 1, 8);
        parcel.writeLong(this.a);
        e11.w0(parcel, 2, 4);
        parcel.writeInt(this.b);
        e11.w0(parcel, 3, 8);
        parcel.writeLong(this.c);
        e11.y0(iX0, parcel);
    }
}
