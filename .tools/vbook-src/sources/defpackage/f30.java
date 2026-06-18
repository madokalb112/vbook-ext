package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class f30 extends y2 {
    public static final Parcelable.Creator<f30> CREATOR = new gdc(21);
    public final pu3 a;
    public final amc b;
    public final jib c;
    public final snc d;
    public final pbc e;
    public final xbc f;
    public final kmc s;
    public final ecc t;
    public final xg4 u;
    public final vcc v;

    public f30(pu3 pu3Var, amc amcVar, jib jibVar, snc sncVar, pbc pbcVar, xbc xbcVar, kmc kmcVar, ecc eccVar, xg4 xg4Var, vcc vccVar) {
        this.a = pu3Var;
        this.c = jibVar;
        this.b = amcVar;
        this.d = sncVar;
        this.e = pbcVar;
        this.f = xbcVar;
        this.s = kmcVar;
        this.t = eccVar;
        this.u = xg4Var;
        this.v = vccVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f30)) {
            return false;
        }
        f30 f30Var = (f30) obj;
        return qx1.u(this.a, f30Var.a) && qx1.u(this.b, f30Var.b) && qx1.u(this.c, f30Var.c) && qx1.u(this.d, f30Var.d) && qx1.u(this.e, f30Var.e) && qx1.u(this.f, f30Var.f) && qx1.u(this.s, f30Var.s) && qx1.u(this.t, f30Var.t) && qx1.u(this.u, f30Var.u) && qx1.u(this.v, f30Var.v);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.s, this.t, this.u, this.v});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int iX0 = e11.x0(20293, parcel);
        e11.q0(parcel, 2, this.a, i, false);
        e11.q0(parcel, 3, this.b, i, false);
        e11.q0(parcel, 4, this.c, i, false);
        e11.q0(parcel, 5, this.d, i, false);
        e11.q0(parcel, 6, this.e, i, false);
        e11.q0(parcel, 7, this.f, i, false);
        e11.q0(parcel, 8, this.s, i, false);
        e11.q0(parcel, 9, this.t, i, false);
        e11.q0(parcel, 10, this.u, i, false);
        e11.q0(parcel, 11, this.v, i, false);
        e11.y0(iX0, parcel);
    }
}
