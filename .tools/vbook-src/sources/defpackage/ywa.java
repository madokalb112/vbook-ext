package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ywa {
    public static final ywa a;
    public static final ywa b;
    public static final ywa c;
    public static final ywa d;
    public static final ywa e;
    public static final ywa f;
    public static final ywa s;
    public static final ywa t;
    public static final ywa u;
    public static final /* synthetic */ ywa[] v;

    static {
        ywa ywaVar = new ywa("KEYWORD", 0);
        a = ywaVar;
        ywa ywaVar2 = new ywa("STRING", 1);
        b = ywaVar2;
        ywa ywaVar3 = new ywa("COMMENT", 2);
        c = ywaVar3;
        ywa ywaVar4 = new ywa("NUMBER", 3);
        d = ywaVar4;
        ywa ywaVar5 = new ywa("FUNCTION", 4);
        e = ywaVar5;
        ywa ywaVar6 = new ywa("TYPE", 5);
        f = ywaVar6;
        ywa ywaVar7 = new ywa("VARIABLE", 6);
        s = ywaVar7;
        ywa ywaVar8 = new ywa("OPERATOR", 7);
        t = ywaVar8;
        ywa ywaVar9 = new ywa("PUNCTUATION", 8);
        ywa ywaVar10 = new ywa("WHITESPACE", 9);
        u = ywaVar10;
        v = new ywa[]{ywaVar, ywaVar2, ywaVar3, ywaVar4, ywaVar5, ywaVar6, ywaVar7, ywaVar8, ywaVar9, ywaVar10};
    }

    public static ywa valueOf(String str) {
        return (ywa) Enum.valueOf(ywa.class, str);
    }

    public static ywa[] values() {
        return (ywa[]) v.clone();
    }
}
