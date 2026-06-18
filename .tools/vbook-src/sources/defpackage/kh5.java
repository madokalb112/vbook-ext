package defpackage;

import java.nio.channels.CompletionHandler;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class kh5 implements CompletionHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ ng8 b;
    public final /* synthetic */ ay0 c;

    public /* synthetic */ kh5(ng8 ng8Var, ay0 ay0Var, int i) {
        this.a = i;
        this.b = ng8Var;
        this.c = ay0Var;
    }

    @Override // java.nio.channels.CompletionHandler
    public final void completed(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                if (!this.b.a) {
                    this.c.resumeWith(obj);
                }
                break;
            default:
                if (!this.b.a) {
                    this.c.resumeWith(obj);
                }
                break;
        }
    }

    @Override // java.nio.channels.CompletionHandler
    public final void failed(Throwable th, Object obj) {
        switch (this.a) {
            case 0:
                th.getClass();
                if (!this.b.a) {
                    this.c.resumeWith(new pm8(th));
                }
                break;
            default:
                th.getClass();
                if (!this.b.a) {
                    this.c.resumeWith(new pm8(th));
                }
                break;
        }
    }
}
