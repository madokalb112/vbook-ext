package okhttp3;

import defpackage.bw9;
import defpackage.g96;
import defpackage.gjb;
import defpackage.i96;
import defpackage.j39;
import defpackage.k96;
import defpackage.lc5;
import defpackage.yg8;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class MediaType {
    public static final yg8 b = new yg8("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final yg8 c = new yg8(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    public final String a;

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class Companion {
        public static MediaType a(String str) {
            str.getClass();
            k96 k96VarC = MediaType.b.c(0, str);
            if (k96VarC == null) {
                gp.l(j39.i('\"', "No subtype found for: \"", str));
                return null;
            }
            String str2 = (String) ((i96) k96VarC.a()).get(1);
            Locale locale = Locale.ROOT;
            String lowerCase = str2.toLowerCase(locale);
            lowerCase.getClass();
            String lowerCase2 = ((String) ((i96) k96VarC.a()).get(2)).toLowerCase(locale);
            lowerCase2.getClass();
            ArrayList arrayList = new ArrayList();
            int i = k96VarC.b().b;
            while (true) {
                int i2 = i + 1;
                if (i2 >= str.length()) {
                    return new MediaType(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
                }
                k96 k96VarC2 = MediaType.c.c(i2, str);
                if (k96VarC2 == null) {
                    throw new IllegalArgumentException(("Parameter is not formatted correctly: \"" + str.substring(i2) + "\" for: \"" + str + '\"').toString());
                }
                j96 j96Var = k96VarC2.c;
                g96 g96VarC = j96Var.c(1);
                String str3 = g96VarC != null ? g96VarC.a : null;
                if (str3 == null) {
                    i = k96VarC2.b().b;
                } else {
                    g96 g96VarC2 = j96Var.c(2);
                    String strSubstring = g96VarC2 != null ? g96VarC2.a : null;
                    if (strSubstring == null) {
                        g96 g96VarC3 = j96Var.c(3);
                        g96VarC3.getClass();
                        strSubstring = g96VarC3.a;
                    } else if (strSubstring.length() > 0 && gjb.c0(strSubstring.charAt(0), '\'', false) && bw9.Q(strSubstring, '\'') && strSubstring.length() > 2) {
                        strSubstring = strSubstring.substring(1, strSubstring.length() - 1);
                    }
                    arrayList.add(str3);
                    arrayList.add(strSubstring);
                    i = k96VarC2.b().b;
                }
            }
        }
    }

    public MediaType(String str, String str2, String str3, String[] strArr) {
        str.getClass();
        strArr.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof MediaType) && lc5.Q(((MediaType) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
