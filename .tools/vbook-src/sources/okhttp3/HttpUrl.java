package okhttp3;

import defpackage.bw9;
import defpackage.ga5;
import defpackage.gc1;
import defpackage.j39;
import defpackage.wx1;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.url._UrlKt;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class HttpUrl {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final List f;
    public final String g;
    public final String h;

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class Builder {
        public String a;
        public String d;
        public ArrayList g;
        public String h;
        public String b = "";
        public String c = "";
        public int e = -1;
        public final ArrayList f = gc1.a0("");

        public static ArrayList c(String str) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                int iW = bw9.W(str, '&', i, 4);
                if (iW == -1) {
                    iW = str.length();
                }
                int iW2 = bw9.W(str, '=', i, 4);
                if (iW2 == -1 || iW2 > iW) {
                    arrayList.add(str.substring(i, iW));
                    arrayList.add(null);
                } else {
                    arrayList.add(str.substring(i, iW2));
                    arrayList.add(str.substring(iW2 + 1, iW));
                }
                i = iW + 1;
            }
            return arrayList;
        }

        public final HttpUrl a() {
            ArrayList arrayList;
            String str = this.a;
            if (str == null) {
                gp.j("scheme == null");
                return null;
            }
            String strC = _UrlKt.c(0, this.b, 0, 7);
            String strC2 = _UrlKt.c(0, this.c, 0, 7);
            String str2 = this.d;
            if (str2 == null) {
                gp.j("host == null");
                return null;
            }
            int iA = this.e;
            if (iA == -1) {
                String str3 = this.a;
                str3.getClass();
                iA = Companion.a(str3);
            }
            ArrayList arrayList2 = this.f;
            ArrayList arrayList3 = new ArrayList(gc1.M(arrayList2, 10));
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                arrayList3.add(_UrlKt.c(0, (String) obj, 0, 7));
            }
            ArrayList arrayList4 = this.g;
            if (arrayList4 != null) {
                arrayList = new ArrayList(gc1.M(arrayList4, 10));
                int size2 = arrayList4.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList4.get(i2);
                    i2++;
                    String str4 = (String) obj2;
                    arrayList.add(str4 != null ? _UrlKt.c(0, str4, 0, 3) : null);
                }
            } else {
                arrayList = null;
            }
            String str5 = this.h;
            return new HttpUrl(str, strC, strC2, str2, iA, arrayList3, arrayList, str5 != null ? _UrlKt.c(0, str5, 0, 7) : null, toString());
        }

        /* JADX WARN: Removed duplicated region for block: B:4:0x0025  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void b(okhttp3.HttpUrl r18, java.lang.String r19) {
            /*
                Method dump skipped, instruction units count: 827
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.b(okhttp3.HttpUrl, java.lang.String):void");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.a;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (this.b.length() > 0 || this.c.length() > 0) {
                sb.append(this.b);
                if (this.c.length() > 0) {
                    sb.append(':');
                    sb.append(this.c);
                }
                sb.append('@');
            }
            String str2 = this.d;
            if (str2 != null) {
                if (bw9.P(str2, ':')) {
                    sb.append('[');
                    sb.append(this.d);
                    sb.append(']');
                } else {
                    sb.append(this.d);
                }
            }
            int iA = this.e;
            if (iA != -1 || this.a != null) {
                if (iA == -1) {
                    String str3 = this.a;
                    str3.getClass();
                    iA = Companion.a(str3);
                }
                String str4 = this.a;
                if (str4 == null || iA != Companion.a(str4)) {
                    sb.append(':');
                    sb.append(iA);
                }
            }
            ArrayList arrayList = this.f;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                sb.append('/');
                sb.append((String) arrayList.get(i));
            }
            if (this.g != null) {
                sb.append('?');
                ArrayList arrayList2 = this.g;
                arrayList2.getClass();
                ga5 ga5VarQ0 = wx1.q0(wx1.s0(0, arrayList2.size()), 2);
                int i2 = ga5VarQ0.a;
                int i3 = ga5VarQ0.b;
                int i4 = ga5VarQ0.c;
                if ((i4 > 0 && i2 <= i3) || (i4 < 0 && i3 <= i2)) {
                    while (true) {
                        String str5 = (String) arrayList2.get(i2);
                        String str6 = (String) arrayList2.get(i2 + 1);
                        if (i2 > 0) {
                            sb.append('&');
                        }
                        sb.append(str5);
                        if (str6 != null) {
                            sb.append('=');
                            sb.append(str6);
                        }
                        if (i2 == i3) {
                            break;
                        }
                        i2 += i4;
                    }
                }
            }
            if (this.h != null) {
                sb.append('#');
                sb.append(this.h);
            }
            return sb.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class Companion {
        public static int a(String str) {
            str.getClass();
            if (str.equals("http")) {
                return 80;
            }
            return str.equals("https") ? 443 : -1;
        }
    }

    public HttpUrl(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = arrayList2;
        this.g = str5;
        this.h = str6;
    }

    public final String a() {
        if (this.c.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.h;
        return str.substring(bw9.W(str, ':', length, 4) + 1, bw9.W(str, '@', 0, 6));
    }

    public final String b() {
        int length = this.a.length() + 3;
        String str = this.h;
        int iW = bw9.W(str, '/', length, 4);
        return str.substring(iW, _UtilCommonKt.d(str, iW, str.length(), "?#"));
    }

    public final ArrayList c() {
        int length = this.a.length() + 3;
        String str = this.h;
        int iW = bw9.W(str, '/', length, 4);
        int iD = _UtilCommonKt.d(str, iW, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iW < iD) {
            int i = iW + 1;
            int iC = _UtilCommonKt.c(str, '/', i, iD);
            arrayList.add(str.substring(i, iC));
            iW = iC;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f == null) {
            return null;
        }
        String str = this.h;
        int iW = bw9.W(str, '?', 0, 6) + 1;
        return str.substring(iW, _UtilCommonKt.c(str, '#', iW, str.length()));
    }

    public final String e() {
        if (this.b.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.h;
        return str.substring(length, _UtilCommonKt.d(str, length, str.length(), ":@"));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof HttpUrl) && ((HttpUrl) obj).h.equals(this.h);
    }

    public final String f() {
        Builder builder;
        try {
            builder = new Builder();
            builder.b(this, "/...");
        } catch (IllegalArgumentException unused) {
            builder = null;
        }
        builder.getClass();
        builder.b = _UrlKt.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", Token.EXPORT);
        builder.c = _UrlKt.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", Token.EXPORT);
        return builder.a().h;
    }

    public final URI g() {
        String strSubstring;
        Builder builder = new Builder();
        String str = this.a;
        builder.a = str;
        builder.b = e();
        builder.c = a();
        builder.d = this.d;
        int iA = Companion.a(str);
        int i = this.e;
        if (i == iA) {
            i = -1;
        }
        builder.e = i;
        ArrayList arrayList = builder.f;
        arrayList.clear();
        arrayList.addAll(c());
        String strD = d();
        builder.g = strD != null ? Builder.c(_UrlKt.a(strD, 0, 0, " \"'<>#", 83)) : null;
        if (this.g == null) {
            strSubstring = null;
        } else {
            String str2 = this.h;
            strSubstring = str2.substring(bw9.W(str2, '#', 0, 6) + 1);
        }
        builder.h = strSubstring;
        String str3 = builder.d;
        builder.d = str3 != null ? j39.l("[\"<>^`{|}]", str3, "") : null;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.set(i2, _UrlKt.a((String) arrayList.get(i2), 0, 0, "[]", 99));
        }
        ArrayList arrayList2 = builder.g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                String str4 = (String) arrayList2.get(i3);
                arrayList2.set(i3, str4 != null ? _UrlKt.a(str4, 0, 0, "\\^`{|}", 67) : null);
            }
        }
        String str5 = builder.h;
        builder.h = str5 != null ? _UrlKt.a(str5, 0, 0, " \"#<>\\^`{|}", 35) : null;
        String string = builder.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                Pattern patternCompile = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                patternCompile.getClass();
                String strReplaceAll = patternCompile.matcher(string).replaceAll("");
                strReplaceAll.getClass();
                URI uriCreate = URI.create(strReplaceAll);
                uriCreate.getClass();
                return uriCreate;
            } catch (Exception unused) {
                sy3.o(e);
                return null;
            }
        }
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    public final String toString() {
        return this.h;
    }
}
