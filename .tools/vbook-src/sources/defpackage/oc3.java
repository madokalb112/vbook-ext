package defpackage;

import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class oc3 implements pm7 {
    public static final oc3 c = new oc3();

    @Override // defpackage.xv9
    public final Set b() {
        return sc3.a;
    }

    @Override // defpackage.xv9
    public final boolean e() {
        return true;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof pm7) && ((pm7) obj).isEmpty();
    }

    @Override // defpackage.xv9
    public final List f(String str) {
        str.getClass();
        return null;
    }

    @Override // defpackage.xv9
    public final boolean isEmpty() {
        return true;
    }

    @Override // defpackage.xv9
    public final Set names() {
        return sc3.a;
    }

    public final String toString() {
        return "Parameters " + sc3.a;
    }
}
