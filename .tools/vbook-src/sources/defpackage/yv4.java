package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class yv4 implements Comparable {
    public static final yv4 c;
    public static final yv4 d;
    public static final yv4 e;
    public static final yv4 f;
    public static final yv4 s;
    public static final yv4 t;
    public static final yv4 u;
    public static final yv4 v;
    public static final List w;
    public final int a;
    public final String b;

    static {
        yv4 yv4Var = new yv4(100, "Continue");
        yv4 yv4Var2 = new yv4(Token.ASSIGN_LOGICAL_OR, "Switching Protocols");
        c = yv4Var2;
        yv4 yv4Var3 = new yv4(Token.ASSIGN_BITXOR, "Processing");
        yv4 yv4Var4 = new yv4(Context.VERSION_ES6, "OK");
        yv4 yv4Var5 = new yv4(201, "Created");
        yv4 yv4Var6 = new yv4(202, "Accepted");
        yv4 yv4Var7 = new yv4(203, "Non-Authoritative Information");
        yv4 yv4Var8 = new yv4(204, "No Content");
        yv4 yv4Var9 = new yv4(205, "Reset Content");
        yv4 yv4Var10 = new yv4(206, "Partial Content");
        yv4 yv4Var11 = new yv4(207, "Multi-Status");
        yv4 yv4Var12 = new yv4(300, "Multiple Choices");
        yv4 yv4Var13 = new yv4(301, "Moved Permanently");
        d = yv4Var13;
        yv4 yv4Var14 = new yv4(302, "Found");
        e = yv4Var14;
        yv4 yv4Var15 = new yv4(303, "See Other");
        f = yv4Var15;
        yv4 yv4Var16 = new yv4(304, "Not Modified");
        yv4 yv4Var17 = new yv4(305, "Use Proxy");
        yv4 yv4Var18 = new yv4(306, "Switch Proxy");
        yv4 yv4Var19 = new yv4(307, "Temporary Redirect");
        s = yv4Var19;
        yv4 yv4Var20 = new yv4(308, "Permanent Redirect");
        t = yv4Var20;
        yv4 yv4Var21 = new yv4(400, "Bad Request");
        yv4 yv4Var22 = new yv4(401, "Unauthorized");
        u = yv4Var22;
        yv4 yv4Var23 = new yv4(402, "Payment Required");
        yv4 yv4Var24 = new yv4(403, "Forbidden");
        yv4 yv4Var25 = new yv4(404, "Not Found");
        yv4 yv4Var26 = new yv4(405, "Method Not Allowed");
        yv4 yv4Var27 = new yv4(406, "Not Acceptable");
        yv4 yv4Var28 = new yv4(407, "Proxy Authentication Required");
        yv4 yv4Var29 = new yv4(408, "Request Timeout");
        yv4 yv4Var30 = new yv4(409, "Conflict");
        yv4 yv4Var31 = new yv4(410, "Gone");
        yv4 yv4Var32 = new yv4(411, "Length Required");
        yv4 yv4Var33 = new yv4(412, "Precondition Failed");
        yv4 yv4Var34 = new yv4(413, "Payload Too Large");
        yv4 yv4Var35 = new yv4(414, "Request-URI Too Long");
        yv4 yv4Var36 = new yv4(415, "Unsupported Media Type");
        yv4 yv4Var37 = new yv4(416, "Requested Range Not Satisfiable");
        yv4 yv4Var38 = new yv4(417, "Expectation Failed");
        yv4 yv4Var39 = new yv4(422, "Unprocessable Entity");
        yv4 yv4Var40 = new yv4(423, "Locked");
        yv4 yv4Var41 = new yv4(424, "Failed Dependency");
        yv4 yv4Var42 = new yv4(425, "Too Early");
        yv4 yv4Var43 = new yv4(426, "Upgrade Required");
        yv4 yv4Var44 = new yv4(429, "Too Many Requests");
        yv4 yv4Var45 = new yv4(431, "Request Header Fields Too Large");
        yv4 yv4Var46 = new yv4(500, "Internal Server Error");
        yv4 yv4Var47 = new yv4(501, "Not Implemented");
        yv4 yv4Var48 = new yv4(502, "Bad Gateway");
        yv4 yv4Var49 = new yv4(503, "Service Unavailable");
        yv4 yv4Var50 = new yv4(504, "Gateway Timeout");
        v = yv4Var50;
        List listZ = gc1.Z(yv4Var, yv4Var2, yv4Var3, yv4Var4, yv4Var5, yv4Var6, yv4Var7, yv4Var8, yv4Var9, yv4Var10, yv4Var11, yv4Var12, yv4Var13, yv4Var14, yv4Var15, yv4Var16, yv4Var17, yv4Var18, yv4Var19, yv4Var20, yv4Var21, yv4Var22, yv4Var23, yv4Var24, yv4Var25, yv4Var26, yv4Var27, yv4Var28, yv4Var29, yv4Var30, yv4Var31, yv4Var32, yv4Var33, yv4Var34, yv4Var35, yv4Var36, yv4Var37, yv4Var38, yv4Var39, yv4Var40, yv4Var41, yv4Var42, yv4Var43, yv4Var44, yv4Var45, yv4Var46, yv4Var47, yv4Var48, yv4Var49, yv4Var50, new yv4(505, "HTTP Version Not Supported"), new yv4(506, "Variant Also Negotiates"), new yv4(507, "Insufficient Storage"));
        w = listZ;
        int iO = y86.O(gc1.M(listZ, 10));
        if (iO < 16) {
            iO = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iO);
        for (Object obj : listZ) {
            linkedHashMap.put(Integer.valueOf(((yv4) obj).a), obj);
        }
    }

    public yv4(int i, String str) {
        str.getClass();
        this.a = i;
        this.b = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        yv4 yv4Var = (yv4) obj;
        yv4Var.getClass();
        return this.a - yv4Var.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof yv4) && ((yv4) obj).a == this.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return this.a + ' ' + this.b;
    }
}
