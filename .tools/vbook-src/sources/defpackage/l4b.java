package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class l4b {
    public final boolean a;
    public final int b;
    public final List c;

    public l4b(int i, List list, boolean z) {
        list.getClass();
        this.a = z;
        this.b = i;
        this.c = list;
    }

    public static l4b a(l4b l4bVar, boolean z, int i, ArrayList arrayList, int i2) {
        if ((i2 & 1) != 0) {
            z = l4bVar.a;
        }
        if ((i2 & 2) != 0) {
            i = l4bVar.b;
        }
        List list = arrayList;
        if ((i2 & 4) != 0) {
            list = l4bVar.c;
        }
        l4bVar.getClass();
        list.getClass();
        return new l4b(i, list, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4b)) {
            return false;
        }
        l4b l4bVar = (l4b) obj;
        return this.a == l4bVar.a && this.b == l4bVar.b && lc5.Q(this.c, l4bVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + tw2.d(this.b, Boolean.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TranslateSettingState(isEnabled=");
        sb.append(this.a);
        sb.append(", autoDetectLanguageMode=");
        sb.append(this.b);
        sb.append(", engines=");
        return tw2.t(sb, this.c, ")");
    }
}
