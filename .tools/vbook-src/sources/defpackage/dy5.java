package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class dy5 {
    public static final List b = gc1.Z(new dy5(1), new dy5(2), new dy5(4));
    public final int a;

    public /* synthetic */ dy5(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dy5) {
            return this.a == ((dy5) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        if (i == 1) {
            return "CR";
        }
        if (i == 2) {
            return "LF";
        }
        if (i == 4) {
            return "CRLF";
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : b) {
            if ((((dy5) obj).a | i) == i) {
                arrayList.add(obj);
            }
        }
        return arrayList.toString();
    }
}
