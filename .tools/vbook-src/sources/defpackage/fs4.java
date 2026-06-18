package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class fs4 implements wu4 {
    public final gu4 a;
    public final ngb b;
    public final on1 c;
    public final ik4 d;
    public final /* synthetic */ xu4 e;

    public fs4(xu4 xu4Var) {
        this.e = xu4Var;
        this.a = xu4Var.b;
        this.b = xu4Var.a.b();
        this.c = xu4Var.f;
        this.d = xu4Var.c.I();
    }

    @Override // defpackage.fu4
    public final ek4 a() {
        return this.d;
    }

    @Override // defpackage.wu4
    public final on1 getAttributes() {
        return this.c;
    }

    @Override // defpackage.wu4
    public final gu4 getMethod() {
        return this.a;
    }

    @Override // defpackage.wu4
    public final ngb getUrl() {
        return this.b;
    }

    @Override // defpackage.wu4
    public final wh7 p() {
        xu4 xu4Var = this.e;
        Object obj = xu4Var.d;
        wh7 wh7Var = obj instanceof wh7 ? (wh7) obj : null;
        if (wh7Var != null) {
            return wh7Var;
        }
        w58.t(xu4Var.d, "Content was not transformed to OutgoingContent yet. Current body is ");
        return null;
    }

    @Override // defpackage.wu4
    public final ks4 p0() {
        throw new IllegalStateException("Call is not initialized");
    }
}
