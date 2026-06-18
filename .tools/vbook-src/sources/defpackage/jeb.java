package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class jeb {
    public static final jeb a;
    public static final jeb b;
    public static final jeb c;
    public static final /* synthetic */ jeb[] d;

    static {
        jeb jebVar = new jeb("PURE_ASCII", 0);
        a = jebVar;
        jeb jebVar2 = new jeb("ESC_ASCII", 1);
        b = jebVar2;
        jeb jebVar3 = new jeb("HIGHBYTE", 2);
        c = jebVar3;
        d = new jeb[]{jebVar, jebVar2, jebVar3};
    }

    public static jeb valueOf(String str) {
        return (jeb) Enum.valueOf(jeb.class, str);
    }

    public static jeb[] values() {
        return (jeb[]) d.clone();
    }
}
