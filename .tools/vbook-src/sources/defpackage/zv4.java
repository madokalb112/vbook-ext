package defpackage;

import java.util.LinkedHashMap;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class zv4 {
    public static final LinkedHashMap a;

    static {
        xl7[] xl7VarArr = {new xl7(100, "Continue"), new xl7(Integer.valueOf(Token.ASSIGN_LOGICAL_OR), "Switching Protocols"), new xl7(Integer.valueOf(Context.VERSION_ES6), "OK"), new xl7(201, "Created"), new xl7(202, "Accepted"), new xl7(203, "Non-Authoritative Information"), new xl7(204, "No Content"), new xl7(205, "Reset Content"), new xl7(206, "Partial Content"), new xl7(300, "Multiple Choices"), new xl7(301, "Moved Permanently"), new xl7(302, "Found"), new xl7(303, "See Other"), new xl7(304, "Not Modified"), new xl7(305, "Use Proxy"), new xl7(307, "Temporary Redirect"), new xl7(400, "Bad Request"), new xl7(401, "Unauthorized"), new xl7(402, "Payment Required"), new xl7(403, "Forbidden"), new xl7(404, "Not Found"), new xl7(405, "Method Not Allowed"), new xl7(406, "Not Acceptable"), new xl7(407, "Proxy Authentication Required"), new xl7(408, "Request Timeout"), new xl7(409, "Conflict"), new xl7(410, "Gone"), new xl7(411, "Length Required"), new xl7(412, "Precondition Failed"), new xl7(413, "Request Entity Too Large"), new xl7(414, "Request-URI Too Long"), new xl7(415, "Unsupported Media Type"), new xl7(416, "Requested Range Not Satisfiable"), new xl7(417, "Expectation Failed"), new xl7(418, "I'm a teapot"), new xl7(422, "Unprocessable Entity (WebDAV - RFC 4918)"), new xl7(423, "Locked (WebDAV - RFC 4918)"), new xl7(424, "Failed Dependency (WebDAV) (RFC 4918)"), new xl7(425, "Unassigned"), new xl7(426, "Upgrade Required (RFC 7231)"), new xl7(428, "Precondition Required"), new xl7(429, "Too Many Requests"), new xl7(431, "Request Header Fileds Too Large)"), new xl7(449, "Error449"), new xl7(451, "Unavailable for Legal Reasons"), new xl7(500, "Internal Server Error"), new xl7(501, "Not Implemented"), new xl7(502, "Bad Gateway"), new xl7(503, "Service Unavailable"), new xl7(504, "Gateway Timeout"), new xl7(505, "HTTP Version Not Supported"), new xl7(506, "Variant Also Negotiates (RFC 2295)"), new xl7(507, "Insufficient Storage (WebDAV - RFC 4918)"), new xl7(508, "Loop Detected (WebDAV)"), new xl7(509, "Bandwidth Limit Exceeded"), new xl7(510, "Not Extended (RFC 2774)"), new xl7(511, "Network Authentication Required")};
        LinkedHashMap linkedHashMap = new LinkedHashMap(y86.O(57));
        y86.Y(linkedHashMap, xl7VarArr);
        a = linkedHashMap;
    }
}
