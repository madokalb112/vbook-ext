package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class e65 {
    public final String a;
    public final ArrayList b;
    public final HashMap c;

    public e65(String str, ArrayList arrayList, HashMap map) {
        this.a = str;
        this.b = arrayList;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e65)) {
            return false;
        }
        e65 e65Var = (e65) obj;
        return this.a.equals(e65Var.a) && this.b.equals(e65Var.b) && this.c.equals(e65Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "IndexEntry(label=" + this.a + ", tags=" + this.b + ", tagMap=" + this.c + ")";
    }
}
