package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class dr7 {
    public static final dr7 b;
    public final String a;

    static {
        dr7 dr7Var = new dr7("Notification");
        b = dr7Var;
        oh.a.put(dr7Var, new nh(33, "android.permission.POST_NOTIFICATIONS", 0, 12));
    }

    public dr7(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dr7) {
            return this.a.equals(((dr7) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
