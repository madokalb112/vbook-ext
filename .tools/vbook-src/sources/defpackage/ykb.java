package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ykb {
    public static final ykb a;
    public static final ykb b;
    public static final ykb c;
    public static final ykb d;
    public static final ykb e;
    public static final ykb f;
    public static final ykb s;
    public static final ykb t;
    public static final ykb u;
    public static final /* synthetic */ ykb[] v;

    static {
        ykb ykbVar = new ykb("MONOCHROME", 0);
        a = ykbVar;
        ykb ykbVar2 = new ykb("NEUTRAL", 1);
        b = ykbVar2;
        ykb ykbVar3 = new ykb("TONAL_SPOT", 2);
        c = ykbVar3;
        ykb ykbVar4 = new ykb("VIBRANT", 3);
        d = ykbVar4;
        ykb ykbVar5 = new ykb("EXPRESSIVE", 4);
        e = ykbVar5;
        ykb ykbVar6 = new ykb("FIDELITY", 5);
        f = ykbVar6;
        ykb ykbVar7 = new ykb("CONTENT", 6);
        s = ykbVar7;
        ykb ykbVar8 = new ykb("RAINBOW", 7);
        t = ykbVar8;
        ykb ykbVar9 = new ykb("FRUIT_SALAD", 8);
        u = ykbVar9;
        v = new ykb[]{ykbVar, ykbVar2, ykbVar3, ykbVar4, ykbVar5, ykbVar6, ykbVar7, ykbVar8, ykbVar9};
    }

    public static ykb valueOf(String str) {
        return (ykb) Enum.valueOf(ykb.class, str);
    }

    public static ykb[] values() {
        return (ykb[]) v.clone();
    }
}
