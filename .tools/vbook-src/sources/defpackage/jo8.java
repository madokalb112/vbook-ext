package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class jo8 extends k1 {
    public int c;
    public int d;
    public final /* synthetic */ ko8 e;

    public jo8(ko8 ko8Var) {
        this.e = ko8Var;
        this.c = ko8Var.d;
        this.d = ko8Var.c;
    }

    @Override // defpackage.k1
    public final void a() {
        int i = this.c;
        if (i == 0) {
            this.a = 2;
            return;
        }
        ko8 ko8Var = this.e;
        Object[] objArr = ko8Var.a;
        int i2 = this.d;
        this.b = objArr[i2];
        this.a = 1;
        this.d = (i2 + 1) % ko8Var.b;
        this.c = i - 1;
    }
}
