package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public enum h00 implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    NONE("none"),
    /* JADX INFO: Fake field, exist only in values array */
    INDIRECT("indirect"),
    /* JADX INFO: Fake field, exist only in values array */
    DIRECT("direct");

    public static final Parcelable.Creator<h00> CREATOR = new gdc(11);
    public final String a;

    h00(String str) {
        this.a = str;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: g00 */
    public static h00 a(String str) throws g00 {
        for (h00 h00Var : values()) {
            if (str.equals(h00Var.a)) {
                return h00Var;
            }
        }
        throw new g00(xv5.p("Attestation conveyance preference ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
