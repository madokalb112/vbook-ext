package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xga {
    public final String a;
    public final List b;

    public xga(String str, List list) {
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public static xga a(xga xgaVar, String str, List list, int i) {
        if ((i & 1) != 0) {
            str = xgaVar.a;
        }
        if ((i & 2) != 0) {
            list = xgaVar.b;
        }
        xgaVar.getClass();
        str.getClass();
        list.getClass();
        return new xga(str, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xga)) {
            return false;
        }
        xga xgaVar = (xga) obj;
        return this.a.equals(xgaVar.a) && lc5.Q(this.b, xgaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TextFontState(currentFont=" + this.a + ", fontList=" + this.b + ")";
    }
}
