package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class qv1 {
    public static final pv1 Companion = new pv1();
    public final int a;

    public /* synthetic */ qv1(int i, int i2) {
        if ((i & 1) == 0) {
            this.a = 0;
        } else {
            this.a = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qv1) && this.a == ((qv1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return xv5.k(this.a, "ConversationUnreadCountDto(unreadCount=", ")");
    }
}
