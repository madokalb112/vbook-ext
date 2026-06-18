package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class g30 extends y2 {
    public static final Parcelable.Creator<g30> CREATOR = new gdc(18);
    public final zjb a;
    public final mfc b;
    public final h30 c;
    public final ngc d;

    public g30(zjb zjbVar, mfc mfcVar, h30 h30Var, ngc ngcVar) {
        this.a = zjbVar;
        this.b = mfcVar;
        this.c = h30Var;
        this.d = ngcVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g30)) {
            return false;
        }
        g30 g30Var = (g30) obj;
        return qx1.u(this.a, g30Var.a) && qx1.u(this.b, g30Var.b) && qx1.u(this.c, g30Var.c) && qx1.u(this.d, g30Var.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int iX0 = e11.x0(20293, parcel);
        e11.q0(parcel, 1, this.a, i, false);
        e11.q0(parcel, 2, this.b, i, false);
        e11.q0(parcel, 3, this.c, i, false);
        e11.q0(parcel, 4, this.d, i, false);
        e11.y0(iX0, parcel);
    }
}
