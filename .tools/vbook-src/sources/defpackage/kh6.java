package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class kh6 extends u39 {
    public final List a;
    public final String b;

    /* JADX WARN: Illegal instructions before constructor call */
    public kh6(String str, ArrayList arrayList) {
        String strS;
        str.getClass();
        if (arrayList.size() == 1) {
            strS = tw2.s(new StringBuilder("Field '"), (String) arrayList.get(0), "' is required for type with serial name '", str, "', but it was missing");
        } else {
            strS = "Fields " + arrayList + " are required for type with serial name '" + str + "', but they were missing";
        }
        this(strS, null, arrayList, str);
    }

    public kh6(String str, kh6 kh6Var, List list, String str2) {
        super(str, kh6Var);
        this.a = list;
        this.b = str2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kh6(String str, String str2) {
        this(tw2.o("Field '", str, "' is required for type with serial name '", str2, "', but it was missing"), null, gc1.Y(str), str2);
        str2.getClass();
    }
}
