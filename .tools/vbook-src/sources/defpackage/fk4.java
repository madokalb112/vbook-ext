package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class fk4 extends yf1 {
    public final void F(String str) {
        str.getClass();
        List list = cu4.a;
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            int i3 = i2 + 1;
            if (lc5.V(cCharAt, 32) <= 0 || bw9.P("\"(),/:;<=>?@[\\]{}", cCharAt)) {
                StringBuilder sbM = dx1.m("Header name '", str, "' contains illegal character '");
                sbM.append(str.charAt(i2));
                sbM.append("' (code ");
                throw new d72(tw2.p(sbM, str.charAt(i2) & 255, ')'));
            }
            i++;
            i2 = i3;
        }
    }

    public final void G(String str) {
        str.getClass();
        List list = cu4.a;
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            int i3 = i2 + 1;
            if (lc5.V(cCharAt, 32) < 0 && cCharAt != '\t') {
                StringBuilder sbM = dx1.m("Header value '", str, "' contains illegal character '");
                sbM.append(str.charAt(i2));
                sbM.append("' (code ");
                throw new d72(tw2.p(sbM, str.charAt(i2) & 255, ')'));
            }
            i++;
            i2 = i3;
        }
    }

    public final ik4 I() {
        Map map = (Map) ((yf1) this).a;
        map.getClass();
        return new ik4(map, true);
    }
}
