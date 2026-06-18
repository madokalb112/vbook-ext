package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class nka implements mka {
    public final m62 a;
    public final is4 b;
    public final e21 c;
    public final sv8 d;

    public nka(m62 m62Var, is4 is4Var, e21 e21Var, sv8 sv8Var) {
        this.a = m62Var;
        this.b = is4Var;
        this.c = e21Var;
        this.d = sv8Var;
    }

    public final kka a(int i, String str) {
        str.getClass();
        m62 m62Var = this.a;
        switch (i) {
            case 10:
                return new q97(str, m62Var, this.b, this.c, this.d);
            case 11:
                return new uf3(str, m62Var);
            case 12:
                return new xy2(str, m62Var, 3);
            case 13:
                return new pab(str, m62Var);
            case 14:
                return new xy2(str, m62Var, 2);
            case 15:
                return new xy2(str, m62Var, 0);
            case 16:
                return new xy2(str, m62Var, 1);
            case 17:
                return new xy2(str, m62Var, 5);
            case 18:
                return new xy2(str, m62Var, 4);
            default:
                k27.i("not support");
                return null;
        }
    }
}
