package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class re3 extends dj0 {
    public static final oe3 q(byte[] bArr) {
        xl7 xl7VarW = w(bArr);
        return new oe3((String) xl7VarW.a, (String) xl7VarW.b, bArr);
    }

    public static final String r(re3 re3Var, String str, String str2, String str3, String str4, boolean z, List list, List list2) {
        String strX = x(str);
        String strX2 = x(str2);
        String strX3 = x(str3);
        String strX4 = x(str4);
        String str5 = z ? "<meta name=\"cover\" content=\"cover-image\"/>" : "";
        String strD0 = fc1.D0(list, "\n", null, null, null, 62);
        String strD02 = fc1.D0(list2, "\n", null, null, null, 62);
        StringBuilder sbQ = j39.q("\n        <?xml version=\"1.0\" encoding=\"utf-8\"?>\n        <package version=\"2.0\" unique-identifier=\"BookId\" xmlns=\"http://www.idpf.org/2007/opf\">\n          <metadata xmlns:dc=\"http://purl.org/dc/elements/1.1/\">\n            <dc:identifier id=\"BookId\">", strX, "</dc:identifier>\n            <dc:title>", strX2, "</dc:title>\n            <dc:creator>");
        j39.y(sbQ, strX3, "</dc:creator>\n            <dc:language>", strX4, "</dc:language>\n            ");
        j39.y(sbQ, str5, "\n          </metadata>\n          <manifest>\n            <item id=\"ncx\" href=\"toc.ncx\" media-type=\"application/x-dtbncx+xml\"/>\n            ", strD0, "\n          </manifest>\n          <spine toc=\"ncx\">\n            ");
        sbQ.append(strD02);
        sbQ.append("\n          </spine>\n        </package>\n        ");
        return y(cw9.t(sbQ.toString()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public static final oe3 s(re3 re3Var, String str) {
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
        return new oe3((String) xl7VarW.a, (String) xl7VarW.b, bArr);
    }

    public static final String t(re3 re3Var, int i, String str, String str2, String str3) {
        re3Var.getClass();
        String strX = x(str2);
        StringBuilder sbN = dx1.n("\n        <navPoint id=\"", str, "\" playOrder=\"", "\">\n          <navLabel><text>", i);
        sbN.append(strX);
        sbN.append("</text></navLabel>\n          <content src=\"");
        sbN.append(str3);
        sbN.append("\"/>\n        </navPoint>\n    ");
        return cw9.t(sbN.toString());
    }

    public static final String u(re3 re3Var, String str, String str2, List list) {
        String strX = x(str);
        String strX2 = x(str2);
        String strD0 = fc1.D0(list, "\n", null, null, null, 62);
        StringBuilder sbQ = j39.q("\n        <?xml version=\"1.0\" encoding=\"utf-8\"?>\n        <ncx xmlns=\"http://www.daisy.org/z3986/2005/ncx/\" version=\"2005-1\">\n          <head>\n            <meta name=\"dtb:uid\" content=\"", strX, "\"/>\n          </head>\n          <docTitle>\n            <text>", strX2, "</text>\n          </docTitle>\n          <navMap>\n            ");
        sbQ.append(strD0);
        sbQ.append("\n          </navMap>\n        </ncx>\n        ");
        return y(cw9.t(sbQ.toString()));
    }

    public static final String v(re3 re3Var, String str, String str2, String str3) {
        re3Var.getClass();
        StringBuilder sbQ = j39.q("\n        <?xml version=\"1.0\" encoding=\"utf-8\"?>\n        <!DOCTYPE html>\n        <html xmlns=\"http://www.w3.org/1999/xhtml\">\n        <head>\n          <title>", x(str), "</title>\n          <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\n          <link rel=\"stylesheet\" type=\"text/css\" href=\"", str3, "\"/>\n        </head>\n        <body>");
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
