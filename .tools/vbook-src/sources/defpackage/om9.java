package defpackage;

import java.util.regex.Pattern;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class om9 {
    public static final int[] d = {990, Token.ASSIGN_DIV, 901, 640, 811, 890, Token.ASSIGN_DIV, Token.ASSIGN_DIV, 701, 640, 790, 211, 211};
    public static final byte[] e = new byte[16];
    public final String a;
    public final String b;
    public final d6a c;

    public om9(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = new d6a(new o39(this, 10));
    }

    public final String a(String str) {
        int[] iArr = h.g;
        av0 av0Var = av0.d;
        String strL = j39.l("x0P2Xx", j39.l("x0P1Xx", str, "\\+"), "/");
        Pattern patternCompile = Pattern.compile("x0P3Xx");
        patternCompile.getClass();
        String strReplaceAll = patternCompile.matcher(strL).replaceAll("=");
        strReplaceAll.getClass();
        av0 av0VarQ = ra1.q(strReplaceAll);
        av0VarQ.getClass();
        return iw9.z(vo1.P(av0VarQ.r(), (byte[]) this.c.getValue(), e, j81.N));
    }

    public final String b(String str) {
        av0 av0Var = av0.d;
        int[] iArr = h.g;
        String strA = ra1.x(vo1.R(iw9.B(str), (byte[]) this.c.getValue(), e, j81.N)).a();
        Pattern patternCompile = Pattern.compile("\\+");
        patternCompile.getClass();
        strA.getClass();
        String strReplaceAll = patternCompile.matcher(strA).replaceAll("x0P1Xx");
        strReplaceAll.getClass();
        return j39.l("=", j39.l("/", strReplaceAll, "x0P2Xx"), "x0P3Xx");
    }
}
