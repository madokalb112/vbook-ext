package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class yq1 {
    public final mz0 a = new mz0();
    public final mz0 b = new mz0();
    public final xq1 c = xq1.DecompressResponse;

    public final void a(wq1 wq1Var) {
        wq1Var.getClass();
        String name = wq1Var.getName();
        String lowerCase = name.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        this.a.put(wq1Var, lowerCase);
        this.b.remove(name);
    }
}
