package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class e03 implements as2 {
    public final d03 a;
    public final String[] b;

    public e03(d03 d03Var, String[] strArr) {
        this.a = d03Var;
        this.b = strArr;
    }

    @Override // defpackage.as2
    public final Object a(CharSequence charSequence, String str) {
        charSequence.getClass();
        str.getClass();
        int iA = this.a.a(charSequence, 0, 0);
        if (iA < 0) {
            return null;
        }
        this.b[iA] = str;
        return str;
    }

    @Override // defpackage.as2
    public final Object b(int i, int i2, String str) {
        str.getClass();
        int iA = this.a.a(str, i, i2);
        if (iA >= 0) {
            return this.b[iA];
        }
        return null;
    }

    @Override // defpackage.as2
    public final Object c(CharSequence charSequence) {
        charSequence.getClass();
        int iA = this.a.a(charSequence, 0, 0);
        if (iA >= 0) {
            this.b[iA] = null;
        }
        return null;
    }

    @Override // defpackage.as2
    public final int size() {
        return this.b.length;
    }

    @Override // defpackage.as2
    public final void clear() {
    }
}
