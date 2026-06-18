package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class nz3 {
    public static final nz3 a = new nz3();
    public static final Map b = Collections.synchronizedMap(new LinkedHashMap());

    public static lz3 a(y59 y59Var) {
        Map map = b;
        map.getClass();
        Object obj = map.get(y59Var);
        if (obj != null) {
            return (lz3) obj;
        }
        sy3.j(y59Var, ". Dependencies should be added at class load time.", "Cannot get dependency ");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00aa A[Catch: all -> 0x00c3, TRY_ENTER, TryCatch #0 {all -> 0x00c3, blocks: (B:21:0x0097, B:24:0x00aa, B:25:0x00c2), top: B:30:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0096 -> B:30:0x0097). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.kt1 r9) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nz3.b(kt1):java.lang.Object");
    }
}
