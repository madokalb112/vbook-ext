package defpackage;

import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class fw4 {
    public static final is4 a(kb4 kb4Var) {
        ps4 ps4Var = new ps4();
        kb4Var.invoke(ps4Var);
        int i = 6;
        ej4 ej4Var = new ej4(i, ps4Var.d, new xl4(23));
        ps4Var.d = ej4Var;
        zb7 zb7Var = new zb7();
        zb7Var.a = new ss6(17);
        ej4Var.invoke(zb7Var);
        return new is4(new dc7(zb7Var), ps4Var);
    }

    public static final String b() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            networkInterfaces.getClass();
            ArrayList list = Collections.list(networkInterfaces);
            list.getClass();
            jc1 jc1Var = new jc1(list, 0);
            xl4 xl4Var = new xl4(20);
            h39 h39Var = h39.a;
            String str = (String) f39.o0(new r04(new vx3(new r04(jc1Var, xl4Var), true, new xl4(21)), new xl4(22)));
            return str == null ? "" : str;
        } catch (Exception unused) {
            return "";
        }
    }
}
