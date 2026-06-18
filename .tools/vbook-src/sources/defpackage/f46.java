package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public enum f46 {
    NONE(0),
    /* JADX INFO: Fake field, exist only in values array */
    FATAL(1),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR(2),
    WARN(3),
    /* JADX INFO: Fake field, exist only in values array */
    INFO(4),
    /* JADX INFO: Fake field, exist only in values array */
    DEBUG(5),
    /* JADX INFO: Fake field, exist only in values array */
    TRACE(6);

    public static final wfc b = new wfc(27);
    public static final LinkedHashMap c;
    public final int a;

    static {
        f46[] f46VarArrValues = values();
        int iO = y86.O(f46VarArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iO < 16 ? 16 : iO);
        for (f46 f46Var : f46VarArrValues) {
            linkedHashMap.put(f46Var.name(), f46Var);
        }
        c = linkedHashMap;
    }

    f46(int i) {
        this.a = i;
    }
}
