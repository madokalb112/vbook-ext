package defpackage;

import android.util.JsonReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import org.mozilla.javascript.ES6Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class b02 {
    public static final lp8 a;

    static {
        hf5 hf5Var = new hf5();
        s00.c.configure(hf5Var);
        hf5Var.d = true;
        a = new lp8(hf5Var, 21);
    }

    public static k70 a(JsonReader jsonReader) throws IOException {
        j70 j70Var = new j70();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "offset":
                    j70Var.d = jsonReader.nextLong();
                    j70Var.f = (byte) (j70Var.f | 2);
                    break;
                case "symbol":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        k27.n("Null symbol");
                        return null;
                    }
                    j70Var.b = strNextString;
                    break;
                    break;
                case "pc":
                    j70Var.a = jsonReader.nextLong();
                    j70Var.f = (byte) (j70Var.f | 1);
                    break;
                case "file":
                    j70Var.c = jsonReader.nextString();
                    break;
                case "importance":
                    j70Var.e = jsonReader.nextInt();
                    j70Var.f = (byte) (j70Var.f | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return j70Var.a();
    }

    public static s60 b(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("key")) {
                strNextString = jsonReader.nextString();
                if (strNextString == null) {
                    k27.n("Null key");
                    return null;
                }
            } else if (strNextName.equals(ES6Iterator.VALUE_PROPERTY)) {
                strNextString2 = jsonReader.nextString();
                if (strNextString2 == null) {
                    k27.n("Null value");
                    return null;
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (strNextString != null && strNextString2 != null) {
            return new s60(strNextString, strNextString2);
        }
        StringBuilder sb = new StringBuilder();
        if (strNextString == null) {
            sb.append(" key");
        }
        if (strNextString2 == null) {
            sb.append(" value");
        }
        gp.j(ky0.t("Missing required properties:", sb));
        return null;
    }

    public static q60 c(JsonReader jsonReader) throws IOException {
        p60 p60Var = new p60();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildIdMappingForArch":
                    p60Var.i = d(jsonReader, new j31(13));
                    break;
                case "pid":
                    p60Var.a = jsonReader.nextInt();
                    p60Var.j = (byte) (p60Var.j | 1);
                    break;
                case "pss":
                    p60Var.e = jsonReader.nextLong();
                    p60Var.j = (byte) (p60Var.j | 8);
                    break;
                case "rss":
                    p60Var.f = jsonReader.nextLong();
                    p60Var.j = (byte) (p60Var.j | 16);
                    break;
                case "timestamp":
                    p60Var.g = jsonReader.nextLong();
                    p60Var.j = (byte) (p60Var.j | 32);
                    break;
                case "processName":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        k27.n("Null processName");
                        return null;
                    }
                    p60Var.b = strNextString;
                    break;
                    break;
                case "reasonCode":
                    p60Var.c = jsonReader.nextInt();
                    p60Var.j = (byte) (p60Var.j | 2);
                    break;
                case "traceFile":
                    p60Var.h = jsonReader.nextString();
                    break;
                case "importance":
                    p60Var.d = jsonReader.nextInt();
                    p60Var.j = (byte) (p60Var.j | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return p60Var.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x023e, code lost:
    
        r2 = new java.lang.StringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0243, code lost:
    
        if (r3 != null) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0245, code lost:
    
        r2.append(" rolloutId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x024a, code lost:
    
        if (r4 != null) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x024c, code lost:
    
        r2.append(" variantId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0251, code lost:
    
        gp.j(defpackage.ky0.t("Missing required properties:", r2));
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List d(android.util.JsonReader r22, defpackage.j31 r23) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1058
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b02.d(android.util.JsonReader, j31):java.util.List");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.c70 e(android.util.JsonReader r29) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b02.e(android.util.JsonReader):c70");
    }

    public static g70 f(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        byte b = 0;
        int iNextInt = 0;
        String strNextString = null;
        String strNextString2 = null;
        List listD = null;
        g70 g70VarF = null;
        while (true) {
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (b == 1 && strNextString != null && listD != null) {
                    return new g70(strNextString, strNextString2, listD, g70VarF, iNextInt);
                }
                StringBuilder sb = new StringBuilder();
                if (strNextString == null) {
                    sb.append(" type");
                }
                if (listD == null) {
                    sb.append(" frames");
                }
                if ((b & 1) == 0) {
                    sb.append(" overflowCount");
                }
                gp.j(ky0.t("Missing required properties:", sb));
                return null;
            }
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    listD = d(jsonReader, new j31(18));
                    if (listD == null) {
                        k27.n("Null frames");
                        return null;
                    }
                    break;
                    break;
                case "reason":
                    strNextString2 = jsonReader.nextString();
                    break;
                case "type":
                    strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        k27.n("Null type");
                        return null;
                    }
                    break;
                    break;
                case "causedBy":
                    g70VarF = f(jsonReader);
                    break;
                case "overflowCount":
                    iNextInt = jsonReader.nextInt();
                    b = (byte) (b | 1);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
    }

    public static m70 g(JsonReader jsonReader) throws IOException {
        l70 l70Var = new l70();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "pid":
                    l70Var.b = jsonReader.nextInt();
                    l70Var.e = (byte) (l70Var.e | 1);
                    break;
                case "processName":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        k27.n("Null processName");
                        return null;
                    }
                    l70Var.a = strNextString;
                    break;
                    break;
                case "defaultProcess":
                    l70Var.d = jsonReader.nextBoolean();
                    l70Var.e = (byte) (l70Var.e | 4);
                    break;
                case "importance":
                    l70Var.c = jsonReader.nextInt();
                    l70Var.e = (byte) (l70Var.e | 2);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return l70Var.a();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0256  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.n60 h(android.util.JsonReader r30) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b02.h(android.util.JsonReader):n60");
    }

    public static n60 i(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                n60 n60VarH = h(jsonReader);
                jsonReader.close();
                return n60VarH;
            } finally {
            }
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }
}
