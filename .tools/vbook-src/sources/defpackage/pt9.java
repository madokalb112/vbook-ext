package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class pt9 {
    public static final Set a = fw.Q0(new m39[]{lcb.b, qcb.b, gcb.b, ycb.b});

    public static final boolean a(m39 m39Var) {
        m39Var.getClass();
        return m39Var.isInline() && a.contains(m39Var);
    }
}
