package okhttp3.internal.http2;

import defpackage.av0;
import defpackage.lc5;
import defpackage.ra1;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class Header {
    public static final av0 d;
    public static final av0 e;
    public static final av0 f;
    public static final av0 g;
    public static final av0 h;
    public static final av0 i;
    public final av0 a;
    public final av0 b;
    public final int c;

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class Companion {
    }

    static {
        av0 av0Var = av0.d;
        d = ra1.s(":");
        e = ra1.s(":status");
        f = ra1.s(":method");
        g = ra1.s(":path");
        h = ra1.s(":scheme");
        i = ra1.s(":authority");
    }

    public Header(av0 av0Var, av0 av0Var2) {
        av0Var.getClass();
        av0Var2.getClass();
        this.a = av0Var;
        this.b = av0Var2;
        this.c = av0Var2.d() + av0Var.d() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return lc5.Q(this.a, header.a) && lc5.Q(this.b, header.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a.s() + ": " + this.b.s();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(String str, String str2) {
        this(ra1.s(str), ra1.s(str2));
        av0 av0Var = av0.d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(av0 av0Var, String str) {
        this(av0Var, ra1.s(str));
        av0Var.getClass();
        str.getClass();
        av0 av0Var2 = av0.d;
    }
}
