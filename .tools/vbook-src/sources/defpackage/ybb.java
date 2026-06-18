package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ybb {
    public static final ybb a;
    public static final ybb b;
    public static final ybb c;
    public static final ybb d;
    public static final ybb e;
    public static final ybb f;
    public static final /* synthetic */ ybb[] s;

    /* JADX INFO: Fake field, exist only in values array */
    ybb EF1;

    static {
        ybb ybbVar = new ybb("BodyLarge", 0);
        ybb ybbVar2 = new ybb("BodyMedium", 1);
        ybb ybbVar3 = new ybb("BodySmall", 2);
        ybb ybbVar4 = new ybb("DisplayLarge", 3);
        ybb ybbVar5 = new ybb("DisplayMedium", 4);
        ybb ybbVar6 = new ybb("DisplaySmall", 5);
        ybb ybbVar7 = new ybb("HeadlineLarge", 6);
        ybb ybbVar8 = new ybb("HeadlineMedium", 7);
        a = ybbVar8;
        ybb ybbVar9 = new ybb("HeadlineSmall", 8);
        ybb ybbVar10 = new ybb("LabelLarge", 9);
        b = ybbVar10;
        ybb ybbVar11 = new ybb("LabelMedium", 10);
        c = ybbVar11;
        ybb ybbVar12 = new ybb("LabelSmall", 11);
        d = ybbVar12;
        ybb ybbVar13 = new ybb("TitleLarge", 12);
        e = ybbVar13;
        ybb ybbVar14 = new ybb("TitleMedium", 13);
        ybb ybbVar15 = new ybb("TitleSmall", 14);
        f = ybbVar15;
        s = new ybb[]{ybbVar, ybbVar2, ybbVar3, ybbVar4, ybbVar5, ybbVar6, ybbVar7, ybbVar8, ybbVar9, ybbVar10, ybbVar11, ybbVar12, ybbVar13, ybbVar14, ybbVar15, new ybb("BodyLargeEmphasized", 15), new ybb("BodyMediumEmphasized", 16), new ybb("BodySmallEmphasized", 17), new ybb("DisplayLargeEmphasized", 18), new ybb("DisplayMediumEmphasized", 19), new ybb("DisplaySmallEmphasized", 20), new ybb("HeadlineLargeEmphasized", 21), new ybb("HeadlineMediumEmphasized", 22), new ybb("HeadlineSmallEmphasized", 23), new ybb("LabelLargeEmphasized", 24), new ybb("LabelMediumEmphasized", 25), new ybb("LabelSmallEmphasized", 26), new ybb("TitleLargeEmphasized", 27), new ybb("TitleMediumEmphasized", 28), new ybb("TitleSmallEmphasized", 29)};
    }

    public static ybb valueOf(String str) {
        return (ybb) Enum.valueOf(ybb.class, str);
    }

    public static ybb[] values() {
        return (ybb[]) s.clone();
    }
}
