package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ft2 implements Executor {
    public static final ft2 b = new ft2(0);
    public static final /* synthetic */ ft2 c = new ft2(1);
    public final /* synthetic */ int a;

    public /* synthetic */ ft2(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
