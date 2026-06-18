package okhttp3;

import defpackage.dx1;
import defpackage.j39;
import defpackage.lc5;
import java.io.EOFException;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.HttpUrl;
import okhttp3.internal._HostnamesCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class Address {
    public final Dns a;
    public final SocketFactory b;
    public final SSLSocketFactory c;
    public final HostnameVerifier d;
    public final CertificatePinner e;
    public final Authenticator f;
    public final ProxySelector g;
    public final HttpUrl h;
    public final List i;
    public final List j;

    public Address(String str, int i, Dns dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, CertificatePinner certificatePinner, Authenticator authenticator, List list, List list2, ProxySelector proxySelector) throws EOFException {
        str.getClass();
        dns.getClass();
        socketFactory.getClass();
        authenticator.getClass();
        list.getClass();
        list2.getClass();
        proxySelector.getClass();
        this.a = dns;
        this.b = socketFactory;
        this.c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.e = certificatePinner;
        this.f = authenticator;
        this.g = proxySelector;
        HttpUrl.Builder builder = new HttpUrl.Builder();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            builder.a = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                gp.l("unexpected scheme: ".concat(str2));
                throw null;
            }
            builder.a = "https";
        }
        String strB = _HostnamesCommonKt.b(_UrlKt.c(0, str, 0, 7));
        if (strB == null) {
            gp.l("unexpected host: ".concat(str));
            throw null;
        }
        builder.d = strB;
        if (1 > i || i >= 65536) {
            gp.k(dx1.f(i, "unexpected port: "));
            throw null;
        }
        builder.e = i;
        this.h = builder.a();
        this.i = _UtilJvmKt.i(list);
        this.j = _UtilJvmKt.i(list2);
    }

    public final boolean a(Address address) {
        address.getClass();
        return lc5.Q(this.a, address.a) && lc5.Q(this.f, address.f) && lc5.Q(this.i, address.i) && lc5.Q(this.j, address.j) && lc5.Q(this.g, address.g) && lc5.Q(this.c, address.c) && lc5.Q(this.d, address.d) && lc5.Q(this.e, address.e) && this.h.e == address.h.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Address)) {
            return false;
        }
        Address address = (Address) obj;
        return lc5.Q(this.h, address.h) && a(address);
    }

    public final int hashCode() {
        return Objects.hashCode(this.e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((this.g.hashCode() + j39.d(j39.d((this.f.hashCode() + ((this.a.hashCode() + j39.a(527, 31, this.h.h)) * 31)) * 31, this.i, 31), this.j, 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        HttpUrl httpUrl = this.h;
        sb.append(httpUrl.d);
        sb.append(':');
        sb.append(httpUrl.e);
        sb.append(", ");
        sb.append("proxySelector=" + this.g);
        sb.append('}');
        return sb.toString();
    }
}
