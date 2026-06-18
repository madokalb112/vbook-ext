package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class boa {
    public final String a;
    public final List b;

    public boa(String str, List list) {
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public static boa a(boa boaVar, String str, ArrayList arrayList, int i) {
        if ((i & 1) != 0) {
            str = boaVar.a;
        }
        List list = arrayList;
        if ((i & 2) != 0) {
            list = boaVar.b;
        }
        boaVar.getClass();
        list.getClass();
        return new boa(str, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof boa)) {
            return false;
        }
        boa boaVar = (boa) obj;
        return this.a.equals(boaVar.a) && lc5.Q(this.b, boaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TextToSpeechTableOfContentState(currentId=" + this.a + ", tocLinks=" + this.b + ")";
    }
}
