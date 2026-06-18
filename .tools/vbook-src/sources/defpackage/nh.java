package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class nh {
    public final String a;
    public final int b;
    public final int c;

    public nh(int i, String str, int i2, int i3) {
        i = (i3 & 2) != 0 ? 0 : i;
        i2 = (i3 & 4) != 0 ? Integer.MAX_VALUE : i2;
        this.a = str;
        this.b = i;
        this.c = i2;
    }
}
