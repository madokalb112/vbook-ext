package okhttp3;

import defpackage.fc1;
import defpackage.lc5;
import java.util.ArrayList;
import java.util.Set;
import okhttp3.internal.tls.CertificateChainCleaner;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class CertificatePinner {
    public static final CertificatePinner c = new CertificatePinner(fc1.e1(new Builder().a), null);
    public final Set a;
    public final CertificateChainCleaner b;

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class Builder {
        public final ArrayList a = new ArrayList();
    }

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class Pin {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Pin);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    public CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner) {
        this.a = set;
        this.b = certificateChainCleaner;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CertificatePinner)) {
            return false;
        }
        CertificatePinner certificatePinner = (CertificatePinner) obj;
        return certificatePinner.a.equals(this.a) && lc5.Q(certificatePinner.b, this.b);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() + 1517) * 41;
        CertificateChainCleaner certificateChainCleaner = this.b;
        return iHashCode + (certificateChainCleaner != null ? certificateChainCleaner.hashCode() : 0);
    }
}
