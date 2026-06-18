package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class f76 {
    public final d03 a;
    public final String[] b;

    /* JADX WARN: Multi-variable type inference failed */
    public f76(Map map) {
        d03 d03Var;
        map.getClass();
        List listR0 = f39.r0(new r04(2, new r04(new vx3(fc1.q0(map.entrySet()), false, new rv5(21)), new rv5(this)), new zp4(6)));
        int size = listR0.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = ((xl7) listR0.get(i)).a;
        }
        int size2 = listR0.size();
        String[] strArr2 = new String[size2];
        for (int i2 = 0; i2 < size2; i2++) {
            strArr2[i2] = ((xl7) listR0.get(i2)).b;
        }
        this.b = strArr2;
        if (size == 0) {
            d03Var = new d03(new int[0], new int[0], 0);
        } else {
            b03 b03Var = new b03(strArr);
            b03Var.a();
            d03Var = new d03(b03Var.b, b03Var.c, size);
        }
        this.a = d03Var;
    }
}
