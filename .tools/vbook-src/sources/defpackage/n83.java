package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class n83 extends n5b {
    public final String H;
    public final aw5 I;
    public final qp3 J;
    public final fr9 K;
    public final pp1 L;

    public n83(String str, aw5 aw5Var, qp3 qp3Var, f4b f4bVar) {
        super(f4bVar);
        this.H = str;
        this.I = aw5Var;
        this.J = qp3Var;
        this.K = gr9.a(new m83("", true, "", ""));
        this.L = new pp1();
        qtb.h(this, vtb.a(this), new et1(this, null, 16));
    }

    public static final String D(n83 n83Var, Map map) {
        String str;
        if (!n83Var.v() || (str = (String) n83Var.z.getValue()) == null) {
            str = "raw";
        }
        String str2 = (String) map.get(str);
        if (str2 == null) {
            str2 = "";
        }
        if (str2.length() == 0) {
            str2 = (String) map.get("raw");
        }
        return str2 == null ? "" : str2;
    }
}
