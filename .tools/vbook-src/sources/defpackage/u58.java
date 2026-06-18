package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class u58 extends y2 {
    public static final Parcelable.Creator<u58> CREATOR = new gdc(9);
    public final int a;
    public final PendingIntent b;
    public final int c;
    public final byte[] d;
    public final int e;
    public final Bundle f;

    public u58(int i, int i2, PendingIntent pendingIntent, int i3, Bundle bundle, byte[] bArr) {
        this.e = i;
        this.a = i2;
        this.c = i3;
        this.f = bundle;
        this.d = bArr;
        this.b = pendingIntent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int iX0 = e11.x0(20293, parcel);
        e11.w0(parcel, 1, 4);
        parcel.writeInt(this.a);
        e11.q0(parcel, 2, this.b, i, false);
        e11.w0(parcel, 3, 4);
        parcel.writeInt(this.c);
        e11.i0(parcel, 4, this.f, false);
        e11.j0(parcel, 5, this.d, false);
        e11.w0(parcel, 1000, 4);
        parcel.writeInt(this.e);
        e11.y0(iX0, parcel);
    }
}
