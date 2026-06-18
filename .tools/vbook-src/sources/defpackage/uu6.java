package defpackage;

import org.mozilla.javascript.Token;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class uu6 {
    public static final mc8 b;
    public static final /* synthetic */ uu6[] c;
    public static final /* synthetic */ le3 d;
    public final int a;

    static {
        uu6[] uu6VarArr = {new uu6("PUBLIC", 0, 1), new uu6("PRIVATE", 1, 2), new uu6("PROTECTED", 2, 4), new uu6("STATIC", 3, 8), new uu6("FINAL", 4, 16), new uu6("SYNCHRONIZED", 5, 32), new uu6("VOLATILE", 6, 64), new uu6("TRANSIENT", 7, Token.CASE), new uu6("NATIVE", 8, 256), new uu6("INTERFACE", 9, 512), new uu6("ABSTRACT", 10, 1024), new uu6("STRICT", 11, 2048)};
        c = uu6VarArr;
        d = new le3(uu6VarArr);
        b = new mc8(28);
    }

    public uu6(String str, int i, int i2) {
        this.a = i2;
    }

    public static uu6 valueOf(String str) {
        return (uu6) Enum.valueOf(uu6.class, str);
    }

    public static uu6[] values() {
        return (uu6[]) c.clone();
    }
}
