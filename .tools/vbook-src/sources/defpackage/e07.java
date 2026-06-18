package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class e07 {
    public final ta5 a;
    public final jk9 b = new jk9();
    public final zm7 c = new zm7(16);

    public e07(ta5 ta5Var) {
        this.a = ta5Var;
    }

    public final void a(boolean z) {
        zm7 zm7Var = this.c;
        zm7Var.i((z ? 4 : 0) | (zm7Var.h() & (-5)));
    }

    public final void b(boolean z) {
        zm7 zm7Var = this.c;
        zm7Var.i((z ? 2 : 0) | (zm7Var.h() & (-3)));
    }

    public final void c(boolean z) {
        zm7 zm7Var = this.c;
        zm7Var.i((z ? 1 : 0) | (zm7Var.h() & (-2)));
    }
}
