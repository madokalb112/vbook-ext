package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class yg8 implements Serializable {
    public final Pattern a;

    public yg8(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((zg8) it.next()).a;
        }
        Pattern patternCompile = Pattern.compile("<img[^>]+src=\"([^\"]+)\"", iz7.a(i));
        patternCompile.getClass();
        this.a = patternCompile;
    }

    public static r04 a(yg8 yg8Var, CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() >= 0) {
            return new r04(1, new e67(8, yg8Var, charSequence), wg8.a);
        }
        w58.g(charSequence.length(), xv5.u(0, "Start index out of bounds: ", ", input length: "));
        return null;
    }

    public final String b() {
        String strPattern = this.a.pattern();
        strPattern.getClass();
        return strPattern;
    }

    public final k96 c(int i, String str) {
        str.getClass();
        Matcher matcherRegion = this.a.matcher(str).useAnchoringBounds(false).useTransparentBounds(true).region(i, str.length());
        if (matcherRegion.lookingAt()) {
            return new k96(matcherRegion, str);
        }
        return null;
    }

    public final k96 d(String str) {
        str.getClass();
        Matcher matcher = this.a.matcher(str);
        matcher.getClass();
        if (matcher.matches()) {
            return new k96(matcher, str);
        }
        return null;
    }

    public final boolean e(CharSequence charSequence) {
        charSequence.getClass();
        return this.a.matcher(charSequence).matches();
    }

    public final String f(kb4 kb4Var, String str) {
        str.getClass();
        Matcher matcher = this.a.matcher(str);
        matcher.getClass();
        int i = 0;
        k96 k96VarW = sw1.w(matcher, 0, str);
        if (k96VarW == null) {
            return str.toString();
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append((CharSequence) str, i, k96VarW.b().a);
            sb.append((CharSequence) kb4Var.invoke(k96VarW));
            i = k96VarW.b().b + 1;
            k96VarW = k96VarW.c();
            if (i >= length) {
                break;
            }
        } while (k96VarW != null);
        if (i < length) {
            sb.append((CharSequence) str, i, length);
        }
        return sb.toString();
    }

    public final String g(String str, String str2) {
        str.getClass();
        String strReplaceAll = this.a.matcher(str).replaceAll(str2);
        strReplaceAll.getClass();
        return strReplaceAll;
    }

    public final String toString() {
        String string = this.a.toString();
        string.getClass();
        return string;
    }

    public yg8() {
        Pattern patternCompile = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", iz7.a(2));
        patternCompile.getClass();
        this.a = patternCompile;
    }

    public yg8(String str) {
        str.getClass();
        Pattern patternCompile = Pattern.compile(str);
        patternCompile.getClass();
        this.a = patternCompile;
    }
}
