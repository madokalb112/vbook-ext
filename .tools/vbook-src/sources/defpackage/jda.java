package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class jda {
    public static final jda b = new jda(0);
    public static final jda c = new jda(1);
    public static final jda d = new jda(2);
    public final int a;

    public jda(int i) {
        this.a = i;
    }

    public final boolean a(jda jdaVar) {
        int i = jdaVar.a;
        int i2 = this.a;
        return (i | i2) == i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jda) {
            return this.a == ((jda) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        if (i == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() != 1) {
            return xv5.s(new StringBuilder("TextDecoration["), sz5.a(62, (kb4) null, ", ", arrayList), ']');
        }
        return "TextDecoration." + ((String) arrayList.get(0));
    }
}
