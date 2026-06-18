package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class v25 {
    public final String a = "";
    public final ArrayList b;

    public v25(ArrayList arrayList) {
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v25)) {
            return false;
        }
        v25 v25Var = (v25) obj;
        return this.a.equals(v25Var.a) && this.b.equals(v25Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ImageSourceChapterContent(title=" + this.a + ", images=" + this.b + ")";
    }
}
