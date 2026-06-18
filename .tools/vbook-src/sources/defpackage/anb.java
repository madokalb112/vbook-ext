package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class anb {
    static {
        new d6a(new wab(26));
        new d6a(new wab(27));
        new d6a(new wab(20));
        new d6a(new wab(21));
        new d6a(new wab(22));
        new d6a(new wab(23));
        new d6a(new wab(24));
        new d6a(new wab(25));
    }

    public static final gnb a(kb4 kb4Var) {
        return new af(new tra(12, kb4Var)).k();
    }

    public static gnb b(String str) {
        str.getClass();
        return Build.VERSION.SDK_INT >= 26 ? new rz().k().b(str) : new qd0().k().b(str);
    }
}
