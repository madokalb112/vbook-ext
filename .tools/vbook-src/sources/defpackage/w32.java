package defpackage;

import java.util.Iterator;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class w32 extends ev5 {
    static {
        zg8 zg8Var = zg8.IGNORE_CASE;
        zg8 zg8Var2 = zg8.MULTILINE;
        Iterator it = fw.Q0(new zg8[]{zg8Var, zg8Var2}).iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            i2 |= ((zg8) it.next()).a;
        }
        Pattern.compile("eval[(]function[(]p,a,c,k,e,[rd][)][{].*?[}][)]{2}", iz7.a(i2)).getClass();
        Iterator it2 = fw.Q0(new zg8[]{zg8Var, zg8Var2}).iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            i3 |= ((zg8) it2.next()).a;
        }
        Pattern.compile("[}][(]'(.*)', *(\\d+), *(\\d+), *'(.*?)'[.]split[(]'[|]'[)]", iz7.a(i3)).getClass();
        Iterator it3 = fw.Q0(new zg8[]{zg8Var, zg8Var2}).iterator();
        while (it3.hasNext()) {
            i |= ((zg8) it3.next()).a;
        }
        Pattern.compile("\\b\\w+\\b", iz7.a(i)).getClass();
    }

    public final Object clone() {
        return super/*o67*/.j();
    }

    public final o67 j() {
        return super/*o67*/.j();
    }

    public final o67 k() {
        Object obj = ((ev5) this).d;
        obj.getClass();
        w32 w32Var = new w32();
        ((ev5) w32Var).d = (String) obj;
        return w32Var;
    }

    public final String u() {
        return "#data";
    }

    public final void y(a93 a93Var, xx2 xx2Var) {
        String strG = G();
        if (xx2Var.g != wx2.b || bw9.O(strG, "<![CDATA[", false)) {
            a93Var.b(strG);
            return;
        }
        b93 b93Var = ((o67) this).a;
        if (b93Var != null && lc5.Q(b93Var.e.b, "script")) {
            a93Var.b("//<![CDATA[\n");
            a93Var.b(strG);
            a93Var.b("\n//]]>");
            return;
        }
        b93 b93Var2 = ((o67) this).a;
        if (b93Var2 == null || !lc5.Q(b93Var2.e.b, "style")) {
            a93Var.b("<![CDATA[");
            a93Var.b(strG);
            a93Var.b("]]>");
        } else {
            a93Var.b("/*<![CDATA[*/\n");
            a93Var.b(strG);
            a93Var.b("\n/*]]>*/");
        }
    }
}
