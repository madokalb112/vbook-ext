package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class iq4 extends dj0 {
    public static final String q(iq4 iq4Var, String str, String str2, jl3 jl3Var) {
        StringBuilder sb = new StringBuilder("<!DOCTYPE html>\n<html><head><meta charset=\"utf-8\" /><title>");
        iq4Var.getClass();
        sb.append(t(str));
        sb.append("</title></head>\n<body>\n");
        if (jl3Var.f && !bw9.a0(str)) {
            sb.append("<h1 align=\"center\">");
            sb.append(t(str));
            sb.append("</h1>\n");
        }
        if (!bw9.a0(str2)) {
            sb.append(str2);
            sb.append("\n");
        }
        sb.append("</body>\n</html>");
        return sb.toString();
    }

    public static final String r(iq4 iq4Var, wi0 wi0Var, jl3 jl3Var) {
        String str = jl3Var.h;
        StringBuilder sb = new StringBuilder("<!DOCTYPE html>\n<html><head><meta charset=\"utf-8\" /><title>");
        String str2 = wi0Var.f;
        sb.append(t(str2));
        sb.append("</title></head>\n<body>\n<h1 align=\"center\">");
        sb.append(t(str2));
        sb.append("</h1>\n");
        String str3 = wi0Var.g;
        if (!bw9.a0(str3)) {
            sb.append("<p>");
            sb.append(t(str3));
            sb.append("</p>\n");
        }
        if (!bw9.a0(str)) {
            List listG0 = bw9.g0(bw9.B0(str).toString());
            ArrayList arrayList = new ArrayList();
            for (Object obj : listG0) {
                if (!bw9.a0((String) obj)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                sb.append("<p>");
                sb.append(t((String) obj2));
                sb.append("</p>\n");
            }
        }
        sb.append("</body>\n</html>");
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s(defpackage.iq4 r12, defpackage.wi0 r13, defpackage.kt1 r14) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iq4.s(iq4, wi0, kt1):java.lang.Object");
    }

    public static String t(String str) {
        return iw9.H(iw9.H(iw9.H(iw9.H(iw9.H(str, false, "&", "&amp;"), false, "<", "&lt;"), false, ">", "&gt;"), false, "\"", "&quot;"), false, "'", "&#39;");
    }
}
