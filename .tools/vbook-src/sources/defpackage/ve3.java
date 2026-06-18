package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ve3 extends dj0 {
    public static final te3 q(byte[] bArr) {
        xl7 xl7VarW = w(bArr);
        return new te3((String) xl7VarW.a, (String) xl7VarW.b, bArr);
    }

    public static final String r(ve3 ve3Var, String str, String str2, String str3, String str4, String str5, List list, List list2) {
        String strX = x(str);
        String strX2 = x(str2);
        String strX3 = x(str3);
        String strX4 = x(str4);
        String strX5 = x(str5);
        String strD0 = fc1.D0(list, "\n", null, null, null, 62);
        String strD02 = fc1.D0(list2, "\n", null, null, null, 62);
        StringBuilder sbQ = j39.q("\n        <?xml version=\"1.0\" encoding=\"utf-8\"?>\n        <package version=\"3.0\" unique-identifier=\"BookId\" xmlns=\"http://www.idpf.org/2007/opf\">\n          <metadata xmlns:dc=\"http://purl.org/dc/elements/1.1/\">\n            <dc:identifier id=\"BookId\">", strX, "</dc:identifier>\n            <dc:title>", strX2, "</dc:title>\n            <dc:creator>");
        j39.y(sbQ, strX3, "</dc:creator>\n            <dc:language>", strX4, "</dc:language>\n            <meta property=\"dcterms:modified\">");
        j39.y(sbQ, strX5, "</meta>\n          </metadata>\n          <manifest>\n            <item id=\"toc\" href=\"toc.xhtml\" media-type=\"application/xhtml+xml\" properties=\"nav\"/>\n            ", strD0, "\n          </manifest>\n          <spine>\n            ");
        sbQ.append(strD02);
        sbQ.append("\n          </spine>\n        </package>\n        ");
        return y(cw9.t(sbQ.toString()));
    }

    public static final String s(ve3 ve3Var, String str, String str2, List list) {
        String strX = x(str);
        String strD0 = fc1.D0(list, "\n", null, null, new se3(ve3Var), 30);
        StringBuilder sbQ = j39.q("\n        <?xml version=\"1.0\" encoding=\"utf-8\"?>\n        <html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:epub=\"http://www.idpf.org/2007/ops\">\n          <head>\n            <title>", strX, "</title>\n            <link rel=\"stylesheet\" type=\"text/css\" href=\"Styles/", str2, "\"/>\n          </head>\n          <body>\n            <nav epub:type=\"toc\">\n              <ol>\n                ");
        sbQ.append(strD0);
        sbQ.append("\n              </ol>\n            </nav>\n          </body>\n        </html>\n        ");
        return y(cw9.t(sbQ.toString()));
    }

    public static final /* synthetic */ String t(ve3 ve3Var, String str) {
        ve3Var.getClass();
        return x(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public static final te3 u(ve3 ve3Var, String str) {
        ?? r1;
        oh5 oh5Var = gx3.a;
        zn7 zn7VarF = zn7.f(zn7.f(qu1.Z(oh5Var), str), "cover");
        byte[] bArr = null;
        if (!oh5Var.e0(zn7VarF)) {
            return null;
        }
        j85 j85VarK0 = tu1.k0(zn7VarF.toFile());
        xq0 xq0Var = new xq0();
        try {
            xq0Var.K0(j85VarK0);
            byte[] bArrE0 = xq0Var.e0(xq0Var.b);
            try {
                j85VarK0.close();
                xq0Var.p();
            } catch (Throwable th) {
                bArr = th;
            }
            r1 = bArr;
            bArr = bArrE0;
        } catch (Throwable th2) {
            try {
                j85VarK0.close();
                xq0Var.p();
                r1 = th2;
            } catch (Throwable th3) {
                i12.r(th2, th3);
                r1 = th2;
            }
        }
        if (r1 != 0) {
            throw r1;
        }
        xl7 xl7VarW = w(bArr);
        return new te3((String) xl7VarW.a, (String) xl7VarW.b, bArr);
    }

    public static final String v(ve3 ve3Var, String str, String str2, String str3) {
        ve3Var.getClass();
        StringBuilder sbQ = j39.q("\n        <?xml version=\"1.0\" encoding=\"utf-8\"?>\n        <html xmlns=\"http://www.w3.org/1999/xhtml\">\n        <head>\n          <title>", x(str), "</title>\n          <link rel=\"stylesheet\" type=\"text/css\" href=\"", str3, "\"/>\n        </head>\n        <body>");
        sbQ.append(str2);
        sbQ.append("</body>\n        </html>\n    ");
        return cw9.t(sbQ.toString());
    }

    public static xl7 w(byte[] bArr) {
        return (bArr.length >= 3 && bArr[0] == -1 && bArr[1] == -40 && bArr[2] == -1) ? new xl7("jpg", "image/jpeg") : (bArr.length >= 8 && bArr[0] == -119 && bArr[1] == 80 && bArr[2] == 78 && bArr[3] == 71) ? new xl7("png", "image/png") : (bArr.length >= 6 && bArr[0] == 71 && bArr[1] == 73 && bArr[2] == 70) ? new xl7("gif", "image/gif") : (bArr.length >= 12 && bArr[0] == 82 && bArr[1] == 73 && bArr[2] == 70 && bArr[3] == 70 && bArr[8] == 87 && bArr[9] == 69 && bArr[10] == 66 && bArr[11] == 80) ? new xl7("webp", "image/webp") : new xl7("jpg", "image/jpeg");
    }

    public static String x(String str) {
        return iw9.H(iw9.H(iw9.H(iw9.H(iw9.H(str, false, "&", "&amp;"), false, "<", "&lt;"), false, ">", "&gt;"), false, "\"", "&quot;"), false, "'", "&#39;");
    }

    public static String y(String str) {
        is isVar = new is(new y3c());
        isVar.b = Integer.MAX_VALUE;
        zx2 zx2VarE = isVar.e(str, "");
        xx2 xx2Var = zx2VarE.z;
        xx2Var.g = wx2.b;
        de3 de3Var = de3.e;
        de3Var.getClass();
        xx2Var.a = de3Var;
        xx2Var.c = true;
        xx2Var.e = 2;
        return zx2VarE.Q();
    }
}
