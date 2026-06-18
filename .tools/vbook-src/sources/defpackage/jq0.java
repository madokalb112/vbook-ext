package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class jq0 {
    public final String a;
    public final List b;
    public final List c;
    public final List d;

    public jq0(String str, List list, List list2, List list3) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = list3;
    }

    public static jq0 a(jq0 jq0Var, String str, List list, List list2, List list3, int i) {
        if ((i & 1) != 0) {
            str = jq0Var.a;
        }
        if ((i & 2) != 0) {
            list = jq0Var.b;
        }
        if ((i & 4) != 0) {
            list2 = jq0Var.c;
        }
        if ((i & 8) != 0) {
            list3 = jq0Var.d;
        }
        jq0Var.getClass();
        str.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        return new jq0(str, list, list2, list3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jq0)) {
            return false;
        }
        jq0 jq0Var = (jq0) obj;
        return this.a.equals(jq0Var.a) && lc5.Q(this.b, jq0Var.b) && lc5.Q(this.c, jq0Var.c) && lc5.Q(this.d, jq0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j39.d(j39.d(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        return "BrowserSuggestState(searchEngine=" + this.a + ", searchEngineList=" + this.b + ", historyList=" + this.c + ", searchHistoryList=" + this.d + ")";
    }
}
