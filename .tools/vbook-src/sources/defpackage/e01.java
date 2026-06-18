package defpackage;

import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class e01 extends dj0 {
    public static final String q(e01 e01Var, byte[] bArr) {
        return (bArr.length >= 3 && bArr[0] == -1 && bArr[1] == -40 && bArr[2] == -1) ? "jpg" : (bArr.length >= 8 && bArr[0] == -119 && bArr[1] == 80 && bArr[2] == 78 && bArr[3] == 71) ? "png" : (bArr.length >= 6 && bArr[0] == 71 && bArr[1] == 73 && bArr[2] == 70) ? "gif" : (bArr.length >= 12 && bArr[0] == 82 && bArr[1] == 73 && bArr[2] == 70 && bArr[3] == 70 && bArr[8] == 87 && bArr[9] == 69 && bArr[10] == 66 && bArr[11] == 80) ? "webp" : "bin";
    }

    public static final List r(e01 e01Var, String str) {
        e01Var.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ux3 ux3Var = new ux3(new vx3(new r04(yg8.a(new yg8("\"([^\"]+)\""), str), new vi0(20)), true, new vi0(21)));
        while (ux3Var.hasNext()) {
            linkedHashSet.add((String) ux3Var.next());
        }
        yd4 yd4Var = new yd4(yg8.a(new yg8(e11.d0(zg8.IGNORE_CASE)), str));
        while (yd4Var.hasNext()) {
            linkedHashSet.add(((i96) ((k96) yd4Var.next()).a()).get(1));
        }
        return fc1.Z0(linkedHashSet);
    }
}
