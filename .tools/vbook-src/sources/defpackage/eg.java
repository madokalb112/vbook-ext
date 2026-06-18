package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class eg extends t96 {
    public final Uri z;

    public eg(Uri uri) {
        uri.getClass();
        this.z = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eg) && lc5.Q(this.z, ((eg) obj).z);
    }

    public final int hashCode() {
        return this.z.hashCode();
    }

    public final String toString() {
        return "UriWrapper(uri=" + this.z + ")";
    }
}
