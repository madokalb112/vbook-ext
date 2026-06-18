package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class b91 {
    public final String a;
    public List b = lc3.a;
    public final ArrayList c = new ArrayList();
    public final HashSet d = new HashSet();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();

    public b91(String str) {
        this.a = str;
    }

    public final void a(String str, m39 m39Var) {
        str.getClass();
        m39Var.getClass();
        if (!this.d.add(str)) {
            StringBuilder sbM = dx1.m("Element with name '", str, "' is already registered in ");
            sbM.append(this.a);
            throw new IllegalArgumentException(sbM.toString().toString());
        }
        this.c.add(str);
        this.e.add(m39Var);
        this.f.add(lc3.a);
        this.g.add(Boolean.FALSE);
    }
}
