package okhttp3;

import defpackage.d6a;
import defpackage.fz0;
import defpackage.gc1;
import defpackage.ib4;
import defpackage.lc3;
import defpackage.lc5;
import defpackage.xf3;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import okhttp3.TlsVersion;
import okhttp3.internal._UtilJvmKt;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class Handshake {
    public final TlsVersion a;
    public final CipherSuite b;
    public final List c;
    public final d6a d;

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class Companion {
        public static Handshake a(SSLSession sSLSession) {
            List listJ;
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                gp.j("cipherSuite == null");
                return null;
            }
            if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") || cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                sy3.m("cipherSuite == ".concat(cipherSuite));
                return null;
            }
            CipherSuite cipherSuiteB = CipherSuite.b.b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                gp.j("tlsVersion == null");
                return null;
            }
            if ("NONE".equals(protocol)) {
                sy3.m("tlsVersion == NONE");
                return null;
            }
            TlsVersion.b.getClass();
            TlsVersion tlsVersionA = TlsVersion.Companion.a(protocol);
            try {
                listJ = _UtilJvmKt.j(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                listJ = lc3.a;
            }
            return new Handshake(tlsVersionA, cipherSuiteB, _UtilJvmKt.j(sSLSession.getLocalCertificates()), new fz0(5, listJ));
        }
    }

    public Handshake(TlsVersion tlsVersion, CipherSuite cipherSuite, List list, ib4 ib4Var) {
        this.a = tlsVersion;
        this.b = cipherSuite;
        this.c = list;
        this.d = new d6a(new xf3(11, ib4Var));
    }

    public final List a() {
        return (List) this.d.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Handshake)) {
            return false;
        }
        Handshake handshake = (Handshake) obj;
        return handshake.a == this.a && handshake.b == this.b && lc5.Q(handshake.a(), a()) && handshake.c.equals(this.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((a().hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> listA = a();
        ArrayList arrayList = new ArrayList(gc1.M(listA, 10));
        for (Certificate certificate : listA) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                type2.getClass();
            }
            arrayList.add(type2);
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.a);
        sb.append(" cipherSuite=");
        sb.append(this.b);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List<Certificate> list = this.c;
        ArrayList arrayList2 = new ArrayList(gc1.M(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                type.getClass();
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
