package defpackage;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class ds1 {
    public static final Set a = fw.Q0(new String[]{"json", "ld+json", "xml", "xhtml+xml", "rss+xml", "atom+xml", "x-www-form-urlencoded", "svg+xml"});

    public static final Charset a(as1 as1Var) {
        as1Var.getClass();
        String strB = as1Var.b("charset");
        if (strB == null) {
            return null;
        }
        try {
            Charset charset = q31.a;
            Charset charsetForName = Charset.forName(strB);
            charsetForName.getClass();
            return charsetForName;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static final as1 b(as1 as1Var, Charset charset) {
        as1Var.getClass();
        charset.getClass();
        String lowerCase = as1Var.c.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (!lowerCase.equals("text")) {
            return as1Var;
        }
        String strName = charset.name();
        strName.getClass();
        return as1Var.c(strName);
    }
}
