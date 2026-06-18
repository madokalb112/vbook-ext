package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class y11 {
    public static final x11 b = new x11();
    public final Object a;

    public /* synthetic */ y11(Object obj) {
        this.a = obj;
    }

    public static final Object a(Object obj) {
        if (obj instanceof x11) {
            return null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y11) {
            return lc5.Q(this.a, ((y11) obj).a);
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
        if (obj instanceof w11) {
            return ((w11) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
