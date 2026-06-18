package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public interface mu8 {
    List a();

    List b();

    Object getKey();

    default Map m() {
        Map map;
        c37 c37Var = (c37) fc1.F0(b());
        return (c37Var == null || (map = c37Var.c) == null) ? mc3.a : map;
    }

    rj1 p();
}
