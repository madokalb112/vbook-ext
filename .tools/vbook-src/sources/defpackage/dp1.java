package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class dp1 extends ea7 {
    public final String c;

    public dp1(String str) {
        super(Integer.valueOf(str.length()), "the predefined string ".concat(str));
        this.c = str;
    }

    @Override // defpackage.ea7
    public final fa7 a(int i, String str, Object obj, int i2) {
        String string = str.subSequence(i, i2).toString();
        String str2 = this.c;
        if (lc5.Q(string, str2)) {
            return null;
        }
        return new zy2(str2);
    }
}
