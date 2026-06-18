package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class o8a {
    public final yc1 a;
    public final yc1 b;
    public final yc1 c;
    public final yc1 d;
    public final yc1 e;
    public final yc1 f;
    public final yc1 g;
    public final yc1 h;

    public o8a() {
        y72 y72Var = new y72(ah1.l(4281612364L), ah1.l(4281612364L));
        y72 y72Var2 = new y72(ah1.l(4282796902L), ah1.l(4282796902L));
        y72 y72Var3 = new y72(ah1.l(4294177021L), ah1.l(4294177021L));
        y72 y72Var4 = new y72(ah1.l(4290032070L), ah1.l(4290032070L));
        y72 y72Var5 = new y72(ah1.l(4291932102L), ah1.l(4291932102L));
        y72 y72Var6 = new y72(ah1.l(4281612364L), ah1.l(4281612364L));
        y72 y72Var7 = new y72(ah1.l(4284501349L), ah1.l(4284501349L));
        y72 y72Var8 = new y72(ah1.l(4283127174L), ah1.l(4283127174L));
        this.a = y72Var;
        this.b = y72Var2;
        this.c = y72Var3;
        this.d = y72Var4;
        this.e = y72Var5;
        this.f = y72Var6;
        this.g = y72Var7;
        this.h = y72Var8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8a)) {
            return false;
        }
        o8a o8aVar = (o8a) obj;
        return lc5.Q(this.a, o8aVar.a) && lc5.Q(this.b, o8aVar.b) && lc5.Q(this.c, o8aVar.c) && lc5.Q(this.d, o8aVar.d) && lc5.Q(this.e, o8aVar.e) && lc5.Q(this.f, o8aVar.f) && lc5.Q(this.g, o8aVar.g) && lc5.Q(this.h, o8aVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TTSWidgetPalette(surface=" + this.a + ", coverBg=" + this.b + ", onSurface=" + this.c + ", secondaryText=" + this.d + ", pinkPill=" + this.e + ", controlSurface=" + this.f + ", controlIcon=" + this.g + ", primaryIcon=" + this.h + ")";
    }
}
