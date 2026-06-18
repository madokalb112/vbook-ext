package defpackage;

import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class bq4 {
    public final HashSet a;
    public final HashMap b;
    public final HashSet c;
    public boolean d;

    public bq4() {
        int iO = y86.O(34);
        HashSet hashSet = new HashSet(iO);
        fw.H0(new String[]{"address", "article", "aside", "blockquote", "canvas", "dd", "div", "dl", "dt", "fieldset", "figcaption", "figure", "footer", "form", "h1", "h2", "h3", "h4", "h5", "h6", "header", "hr", "li", "main", "nav", "noscript", "ol", "p", "pre", "section", "table", "tfoot", "ul", "video"}, hashSet);
        this.a = hashSet;
        xl7[] xl7VarArr = {new xl7("h1", new spa(wn9.H(2.0f, 8589934592L))), new xl7("h2", new spa(wn9.t(1.75d))), new xl7("h3", new spa(wn9.t(1.5d))), new xl7("h4", new spa(wn9.t(1.25d))), new xl7("h5", new spa(wn9.t(1.125d))), new xl7("h6", new spa(wn9.H(1.0f, 8589934592L)))};
        HashMap map = new HashMap(y86.O(6));
        y86.Y(map, xl7VarArr);
        this.b = map;
        HashSet hashSet2 = new HashSet(iO);
        fw.H0(new String[]{"a", "abbr", "acronym", "b", "bdo", "big", "br", "button", "cite", "code", "dfn", "em", "emphasis", "i", "u", "img", "image", "input", "kbd", "label", "map", "output", "q", "s", "script", "select", "small", "span", "strong", "sub", "sup", "textarea", "time", "tt"}, hashSet2);
        this.c = hashSet2;
    }

    public static void b(bq4 bq4Var, zo zoVar, String str) {
        if ("�".length() <= 0) {
            gp.l("alternateText can't be an empty string.");
            return;
        }
        zoVar.i("androidx.compose.foundation.text.inlineContent", str);
        zoVar.f("�");
        zoVar.g();
    }

    public final void a(zo zoVar, o67 o67Var, boolean z) {
        int iK;
        String strU = o67Var.u();
        boolean zContains = this.a.contains(strU);
        c64 c64Var = c64.c;
        if (zContains) {
            spa spaVar = (spa) this.b.get(strU);
            boolean z2 = spaVar != null;
            cx9 cx9VarA = s08.a(o67Var.d("style"));
            vn9 vn9Var = new vn9(cx9VarA.b, spaVar != null ? spaVar.a : cx9VarA.d, z2 ? a84.w : a84.t, (t74) null, new u74(65535), lc5.Q(strU, "pre") ? c64Var : null, (String) null, 0L, (ge0) null, (aha) null, (h36) null, cx9VarA.c, (jda) null, (o89) null, 63432);
            if (z) {
                iK = zoVar.k(vn9Var);
                try {
                    c(zoVar, o67Var, true);
                } finally {
                }
            } else {
                long j = spaVar != null ? spaVar.a : spa.c;
                int i = z2 ? cy5.c : 0;
                int i2 = cx9VarA.a;
                int iJ = zoVar.j(new km7(i2, 0, j, i2 == 3 ? new dha(0L, 3) : null, (iu7) null, (iy5) null, i, 0, 434));
                try {
                    iK = zoVar.k(vn9Var);
                    try {
                        c(zoVar, o67Var, true);
                    } finally {
                    }
                } finally {
                    zoVar.h(iJ);
                }
            }
            if (this.d) {
                return;
            }
            zoVar.f("\n");
            this.d = true;
            return;
        }
        if (!this.c.contains(strU)) {
            c(zoVar, o67Var, z);
            return;
        }
        cx9 cx9VarA2 = s08.a(o67Var.d("style"));
        int iHashCode = strU.hashCode();
        if (iHashCode == 105 ? strU.equals("i") : !(iHashCode == 3240 ? !strU.equals("em") : !(iHashCode == 1189352828 && strU.equals("emphasis")))) {
            i = 1;
        }
        a84 a84Var = (strU.equals("b") || strU.equals("strong")) ? a84.w : a84.t;
        boolean zEquals = strU.equals("u");
        jda jdaVar = jda.c;
        if (!zEquals) {
            if (strU.equals("s")) {
                jdaVar = jda.d;
            } else if (!strU.equals("a") || o67Var.d("href").length() <= 0) {
                jdaVar = jda.b;
            }
        }
        iK = zoVar.k(new vn9(cx9VarA2.b, cx9VarA2.d, a84Var, new t74(i), (u74) null, strU.equals("code") ? c64Var : null, (String) null, 0L, new ge0(strU.equals("sup") ? 0.5f : strU.equals("sub") ? -0.5f : 0.0f), (aha) null, (h36) null, cx9VarA2.c, jdaVar, (o89) null, 59088));
        try {
            c(zoVar, o67Var, z);
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x01f1, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.zo r19, o67 r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bq4.c(zo, o67, boolean):void");
    }

    public final bp d(b93 b93Var) {
        b93Var.getClass();
        zo zoVar = new zo();
        a(zoVar, b93Var, false);
        return zoVar.l();
    }
}
