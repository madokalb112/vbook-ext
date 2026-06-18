package okhttp3.internal.http2;

import defpackage.av0;
import defpackage.fw;
import defpackage.ie8;
import defpackage.xq0;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.http2.Http2Reader;
import okhttp3.internal.http2.Huffman;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class Hpack {
    public static final Header[] a;
    public static final Map b;

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class Reader {
        public final ie8 c;
        public int f;
        public int g;
        public int a = 4096;
        public final ArrayList b = new ArrayList();
        public Header[] d = new Header[8];
        public int e = 7;

        public Reader(Http2Reader.ContinuationSource continuationSource) {
            this.c = new ie8(continuationSource);
        }

        public final int a(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.d.length;
                while (true) {
                    length--;
                    i2 = this.e;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    Header header = this.d[length];
                    header.getClass();
                    int i4 = header.c;
                    i -= i4;
                    this.g -= i4;
                    this.f--;
                    i3++;
                }
                Header[] headerArr = this.d;
                System.arraycopy(headerArr, i2 + 1, headerArr, i2 + 1 + i3, this.f);
                this.e += i3;
            }
            return i3;
        }

        public final av0 b(int i) throws IOException {
            if (i >= 0) {
                Header[] headerArr = Hpack.a;
                if (i <= headerArr.length - 1) {
                    return headerArr[i].a;
                }
            }
            int length = this.e + 1 + (i - Hpack.a.length);
            if (length >= 0) {
                Header[] headerArr2 = this.d;
                if (length < headerArr2.length) {
                    Header header = headerArr2[length];
                    header.getClass();
                    return header.a;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        public final void c(Header header) {
            this.b.add(header);
            int i = header.c;
            int i2 = this.a;
            if (i > i2) {
                Header[] headerArr = this.d;
                fw.d0(0, headerArr.length, null, headerArr);
                this.e = this.d.length - 1;
                this.f = 0;
                this.g = 0;
                return;
            }
            a((this.g + i) - i2);
            int i3 = this.f + 1;
            Header[] headerArr2 = this.d;
            if (i3 > headerArr2.length) {
                Header[] headerArr3 = new Header[headerArr2.length * 2];
                System.arraycopy(headerArr2, 0, headerArr3, headerArr2.length, headerArr2.length);
                this.e = this.d.length - 1;
                this.d = headerArr3;
            }
            int i4 = this.e;
            this.e = i4 - 1;
            this.d[i4] = header;
            this.f++;
            this.g += i;
        }

        public final av0 d() {
            ie8 ie8Var = this.c;
            byte b = ie8Var.readByte();
            byte[] bArr = _UtilCommonKt.a;
            int i = b & 255;
            int i2 = 0;
            boolean z = (b & 128) == 128;
            long jE = e(i, Token.SWITCH);
            if (!z) {
                return ie8Var.z(jE);
            }
            xq0 xq0Var = new xq0();
            int[] iArr = Huffman.a;
            ie8Var.getClass();
            Huffman.Node node = Huffman.c;
            Huffman.Node node2 = node;
            int i3 = 0;
            for (long j = 0; j < jE; j++) {
                byte b2 = ie8Var.readByte();
                byte[] bArr2 = _UtilCommonKt.a;
                i2 = (i2 << 8) | (b2 & 255);
                i3 += 8;
                while (i3 >= 8) {
                    Huffman.Node[] nodeArr = node2.a;
                    nodeArr.getClass();
                    node2 = nodeArr[(i2 >>> (i3 - 8)) & 255];
                    node2.getClass();
                    if (node2.a == null) {
                        xq0Var.O0(node2.b);
                        i3 -= node2.c;
                        node2 = node;
                    } else {
                        i3 -= 8;
                    }
                }
            }
            while (i3 > 0) {
                Huffman.Node[] nodeArr2 = node2.a;
                nodeArr2.getClass();
                Huffman.Node node3 = nodeArr2[(i2 << (8 - i3)) & 255];
                node3.getClass();
                int i4 = node3.c;
                if (node3.a != null || i4 > i3) {
                    break;
                }
                xq0Var.O0(node3.b);
                i3 -= i4;
                node2 = node;
            }
            return xq0Var.z(xq0Var.b);
        }

        public final int e(int i, int i2) {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                byte b = this.c.readByte();
                byte[] bArr = _UtilCommonKt.a;
                int i5 = b & 255;
                if ((b & 128) == 0) {
                    return i2 + (i5 << i4);
                }
                i2 += (b & 127) << i4;
                i4 += 7;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class Writer {
        public final xq0 a;
        public boolean c;
        public int g;
        public int h;
        public int b = Integer.MAX_VALUE;
        public int d = 4096;
        public Header[] e = new Header[8];
        public int f = 7;

        public Writer(xq0 xq0Var) {
            this.a = xq0Var;
        }

        public final void a(int i) {
            int i2;
            if (i > 0) {
                int length = this.e.length - 1;
                int i3 = 0;
                while (true) {
                    i2 = this.f;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    Header header = this.e[length];
                    header.getClass();
                    i -= header.c;
                    int i4 = this.h;
                    Header header2 = this.e[length];
                    header2.getClass();
                    this.h = i4 - header2.c;
                    this.g--;
                    i3++;
                    length--;
                }
                Header[] headerArr = this.e;
                int i5 = i2 + 1;
                System.arraycopy(headerArr, i5, headerArr, i5 + i3, this.g);
                Header[] headerArr2 = this.e;
                int i6 = this.f + 1;
                Arrays.fill(headerArr2, i6, i6 + i3, (Object) null);
                this.f += i3;
            }
        }

        public final void b(Header header) {
            int i = header.c;
            int i2 = this.d;
            if (i > i2) {
                Header[] headerArr = this.e;
                fw.d0(0, headerArr.length, null, headerArr);
                this.f = this.e.length - 1;
                this.g = 0;
                this.h = 0;
                return;
            }
            a((this.h + i) - i2);
            int i3 = this.g + 1;
            Header[] headerArr2 = this.e;
            if (i3 > headerArr2.length) {
                Header[] headerArr3 = new Header[headerArr2.length * 2];
                System.arraycopy(headerArr2, 0, headerArr3, headerArr2.length, headerArr2.length);
                this.f = this.e.length - 1;
                this.e = headerArr3;
            }
            int i4 = this.f;
            this.f = i4 - 1;
            this.e[i4] = header;
            this.g++;
            this.h += i;
        }

        public final void c(av0 av0Var) throws EOFException {
            av0Var.getClass();
            int[] iArr = Huffman.a;
            int iD = av0Var.d();
            long j = 0;
            long j2 = 0;
            for (int i = 0; i < iD; i++) {
                byte bI = av0Var.i(i);
                byte[] bArr = _UtilCommonKt.a;
                j2 += (long) Huffman.b[bI & 255];
            }
            int i2 = (int) ((j2 + 7) >> 3);
            int iD2 = av0Var.d();
            xq0 xq0Var = this.a;
            if (i2 >= iD2) {
                e(av0Var.d(), Token.SWITCH, 0);
                xq0Var.F0(av0Var);
                return;
            }
            xq0 xq0Var2 = new xq0();
            int[] iArr2 = Huffman.a;
            int iD3 = av0Var.d();
            int i3 = 0;
            for (int i4 = 0; i4 < iD3; i4++) {
                byte bI2 = av0Var.i(i4);
                byte[] bArr2 = _UtilCommonKt.a;
                int i5 = bI2 & 255;
                int i6 = Huffman.a[i5];
                byte b = Huffman.b[i5];
                j = (j << b) | ((long) i6);
                i3 += b;
                while (i3 >= 8) {
                    i3 -= 8;
                    xq0Var2.O0((int) (j >> i3));
                }
            }
            if (i3 > 0) {
                xq0Var2.O0((int) ((j << (8 - i3)) | (255 >>> i3)));
            }
            av0 av0VarZ = xq0Var2.z(xq0Var2.b);
            e(av0VarZ.d(), Token.SWITCH, Token.CASE);
            xq0Var.F0(av0VarZ);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void d(java.util.ArrayList r14) throws java.io.EOFException {
            /*
                Method dump skipped, instruction units count: 252
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Hpack.Writer.d(java.util.ArrayList):void");
        }

        public final void e(int i, int i2, int i3) {
            xq0 xq0Var = this.a;
            if (i < i2) {
                xq0Var.O0(i | i3);
                return;
            }
            xq0Var.O0(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                xq0Var.O0(128 | (i4 & Token.SWITCH));
                i4 >>>= 7;
            }
            xq0Var.O0(i4);
        }
    }

    static {
        Header header = new Header(Header.i, "");
        av0 av0Var = Header.f;
        Header header2 = new Header(av0Var, "GET");
        Header header3 = new Header(av0Var, "POST");
        av0 av0Var2 = Header.g;
        Header header4 = new Header(av0Var2, "/");
        Header header5 = new Header(av0Var2, "/index.html");
        av0 av0Var3 = Header.h;
        Header header6 = new Header(av0Var3, "http");
        Header header7 = new Header(av0Var3, "https");
        av0 av0Var4 = Header.e;
        Header[] headerArr = {header, header2, header3, header4, header5, header6, header7, new Header(av0Var4, "200"), new Header(av0Var4, "204"), new Header(av0Var4, "206"), new Header(av0Var4, "304"), new Header(av0Var4, "400"), new Header(av0Var4, "404"), new Header(av0Var4, "500"), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", ""), new Header("accept-ranges", ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header("age", ""), new Header("allow", ""), new Header("authorization", ""), new Header("cache-control", ""), new Header("content-disposition", ""), new Header("content-encoding", ""), new Header("content-language", ""), new Header("content-length", ""), new Header("content-location", ""), new Header("content-range", ""), new Header("content-type", ""), new Header("cookie", ""), new Header("date", ""), new Header("etag", ""), new Header("expect", ""), new Header("expires", ""), new Header("from", ""), new Header("host", ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header("last-modified", ""), new Header("link", ""), new Header("location", ""), new Header("max-forwards", ""), new Header("proxy-authenticate", ""), new Header("proxy-authorization", ""), new Header("range", ""), new Header("referer", ""), new Header("refresh", ""), new Header("retry-after", ""), new Header("server", ""), new Header("set-cookie", ""), new Header("strict-transport-security", ""), new Header("transfer-encoding", ""), new Header("user-agent", ""), new Header("vary", ""), new Header("via", ""), new Header("www-authenticate", "")};
        a = headerArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61, 1.0f);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(headerArr[i].a)) {
                linkedHashMap.put(headerArr[i].a, Integer.valueOf(i));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        b = mapUnmodifiableMap;
    }

    public static void a(av0 av0Var) {
        av0Var.getClass();
        int iD = av0Var.d();
        for (int i = 0; i < iD; i++) {
            byte bI = av0Var.i(i);
            if (65 <= bI && bI < 91) {
                sy3.m("PROTOCOL_ERROR response malformed: mixed case name: ".concat(av0Var.s()));
                return;
            }
        }
    }
}
