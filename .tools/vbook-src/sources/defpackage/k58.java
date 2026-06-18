package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class k58 implements vkb {
    public boolean a = false;
    public boolean b = false;
    public ru3 c;
    public final j58 d;

    public k58(j58 j58Var) {
        this.d = j58Var;
    }

    @Override // defpackage.vkb
    public final vkb add(String str) {
        if (this.a) {
            throw new cd3("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
        this.d.d(this.c, str, this.b);
        return this;
    }

    @Override // defpackage.vkb
    public final vkb add(boolean z) {
        if (!this.a) {
            this.a = true;
            this.d.b(this.c, z ? 1 : 0, this.b);
            return this;
        }
        throw new cd3("Cannot encode a second value in the ValueEncoderContext");
    }
}
