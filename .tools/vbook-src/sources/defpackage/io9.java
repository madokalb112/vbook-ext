package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class io9<T> {
    public static final ho9 Companion = new ho9();
    public static final dp5[] c = {ex1.Z(xu5.b, new fo9(0)), null};
    public static final hx7 d;
    public final List a;
    public final List b;

    static {
        hx7 hx7Var = new hx7("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", null, 2);
        hx7Var.k("keys", false);
        hx7Var.k("values", false);
        d = hx7Var;
    }

    public /* synthetic */ io9(int i, List list, List list2) {
        if (3 != (i & 3)) {
            qu1.w0(i, 3, d);
            throw null;
        }
        this.a = list;
        this.b = list2;
    }

    public io9(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }
}
