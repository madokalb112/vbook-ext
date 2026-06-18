package defpackage;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class mg1 {
    public static final mg1 a;
    public static final HashMap b;
    public static final /* synthetic */ mg1[] c;

    /* JADX INFO: Fake field, exist only in values array */
    mg1 EF0;

    static {
        mg1 mg1Var = new mg1("X86_32", 0);
        mg1 mg1Var2 = new mg1("X86_64", 1);
        mg1 mg1Var3 = new mg1("ARM_UNKNOWN", 2);
        mg1 mg1Var4 = new mg1("PPC", 3);
        mg1 mg1Var5 = new mg1("PPC64", 4);
        mg1 mg1Var6 = new mg1("ARMV6", 5);
        mg1 mg1Var7 = new mg1("ARMV7", 6);
        mg1 mg1Var8 = new mg1("UNKNOWN", 7);
        a = mg1Var8;
        mg1 mg1Var9 = new mg1("ARMV7S", 8);
        mg1 mg1Var10 = new mg1("ARM64", 9);
        c = new mg1[]{mg1Var, mg1Var2, mg1Var3, mg1Var4, mg1Var5, mg1Var6, mg1Var7, mg1Var8, mg1Var9, mg1Var10};
        HashMap map = new HashMap(4);
        b = map;
        map.put("armeabi-v7a", mg1Var7);
        map.put("armeabi", mg1Var6);
        map.put("arm64-v8a", mg1Var10);
        map.put("x86", mg1Var);
    }

    public static mg1 valueOf(String str) {
        return (mg1) Enum.valueOf(mg1.class, str);
    }

    public static mg1[] values() {
        return (mg1[]) c.clone();
    }
}
