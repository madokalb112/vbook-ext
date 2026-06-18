package defpackage;

import java.util.LinkedHashMap;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class r64 extends qtb {
    public final u64 c;
    public final fr9 d = gr9.a(new q64(lc3.a));
    public final pp1 e = new pp1();
    public final LinkedHashMap f = new LinkedHashMap();

    public r64(nra nraVar, u64 u64Var) {
        this.c = u64Var;
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        g(za1VarA, nh2.c, new l64(this, (jt1) null, 1));
    }

    public static final String j(r64 r64Var, String str) {
        r64Var.getClass();
        Pattern patternCompile = Pattern.compile("\\.(ttf|otf)");
        patternCompile.getClass();
        str.getClass();
        String strReplaceAll = patternCompile.matcher(str).replaceAll("");
        strReplaceAll.getClass();
        return strReplaceAll;
    }
}
