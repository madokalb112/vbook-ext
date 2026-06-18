package defpackage;

import org.mozilla.javascript.Parser;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39(with = w72.class)
public final class n72 extends l72 {
    public static final m72 Companion = new m72();
    public final int d;

    public n72(int i) {
        this.d = i;
        if (i > 0) {
            return;
        }
        gp.k(xv5.k(i, "Unit duration must be positive, but was ", " days."));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n72) {
            return this.d == ((n72) obj).d;
        }
        return false;
    }

    public final int hashCode() {
        return this.d ^ Parser.ARGC_LIMIT;
    }

    public final String toString() {
        int i = this.d;
        return i % 7 == 0 ? s72.a(i / 7, "WEEK") : s72.a(i, "DAY");
    }
}
