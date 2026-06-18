package defpackage;

import java.util.LinkedHashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ua1 {
    public static final wfc b;
    public static final LinkedHashMap c;
    public static final ua1 d;
    public static final ua1 e;
    public static final /* synthetic */ ua1[] f;
    public final short a;

    static {
        ua1 ua1Var = new ua1("NORMAL", 0, (short) 1000);
        ua1 ua1Var2 = new ua1("GOING_AWAY", 1, (short) 1001);
        ua1 ua1Var3 = new ua1("PROTOCOL_ERROR", 2, (short) 1002);
        ua1 ua1Var4 = new ua1("CANNOT_ACCEPT", 3, (short) 1003);
        ua1 ua1Var5 = new ua1("CLOSED_ABNORMALLY", 4, (short) 1006);
        d = ua1Var5;
        ua1 ua1Var6 = new ua1("NOT_CONSISTENT", 5, (short) 1007);
        ua1 ua1Var7 = new ua1("VIOLATED_POLICY", 6, (short) 1008);
        ua1 ua1Var8 = new ua1("TOO_BIG", 7, (short) 1009);
        ua1 ua1Var9 = new ua1("NO_EXTENSION", 8, (short) 1010);
        ua1 ua1Var10 = new ua1("INTERNAL_ERROR", 9, (short) 1011);
        e = ua1Var10;
        ua1[] ua1VarArr = {ua1Var, ua1Var2, ua1Var3, ua1Var4, ua1Var5, ua1Var6, ua1Var7, ua1Var8, ua1Var9, ua1Var10, new ua1("SERVICE_RESTART", 10, (short) 1012), new ua1("TRY_AGAIN_LATER", 11, (short) 1013)};
        f = ua1VarArr;
        le3 le3Var = new le3(ua1VarArr);
        b = new wfc(17);
        int iO = y86.O(gc1.M(le3Var, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iO < 16 ? 16 : iO);
        n1 n1Var = new n1(le3Var, 0);
        while (n1Var.hasNext()) {
            Object next = n1Var.next();
            linkedHashMap.put(Short.valueOf(((ua1) next).a), next);
        }
        c = linkedHashMap;
    }

    public ua1(String str, int i, short s) {
        this.a = s;
    }

    public static ua1 valueOf(String str) {
        return (ua1) Enum.valueOf(ua1.class, str);
    }

    public static ua1[] values() {
        return (ua1[]) f.clone();
    }
}
