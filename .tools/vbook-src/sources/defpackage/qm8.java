package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qm8 implements Serializable {
    public final Object a;

    public static final Throwable a(Object obj) {
        if (obj instanceof pm8) {
            return ((pm8) obj).a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qm8) {
            return lc5.Q(this.a, ((qm8) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof pm8) {
            return ((pm8) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
