package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class mra implements qa8 {
    public static final qt7 a;
    public static final mra b;
    public static final mra c;
    public static final /* synthetic */ mra[] d;

    static {
        mra mraVar = new mra("LIGHT", 0);
        b = mraVar;
        mra mraVar2 = new mra("DARK", 1);
        c = mraVar2;
        d = new mra[]{mraVar, mraVar2};
        a = new qt7(5);
    }

    public static mra valueOf(String str) {
        return (mra) Enum.valueOf(mra.class, str);
    }

    public static mra[] values() {
        return (mra[]) d.clone();
    }
}
