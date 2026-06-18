package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class fia {
    public final String a;
    public final List b;

    public fia(String str, List list) {
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fia)) {
            return false;
        }
        fia fiaVar = (fia) obj;
        return this.a.equals(fiaVar.a) && lc5.Q(this.b, fiaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TextLookupState(text=" + this.a + ", lookupList=" + this.b + ")";
    }
}
