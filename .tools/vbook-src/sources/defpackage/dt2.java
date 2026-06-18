package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class dt2 implements Executor {
    public static final dt2 a;
    public static final /* synthetic */ dt2[] b;

    static {
        dt2 dt2Var = new dt2("INSTANCE", 0);
        a = dt2Var;
        b = new dt2[]{dt2Var};
    }

    public static dt2 valueOf(String str) {
        return (dt2) Enum.valueOf(dt2.class, str);
    }

    public static dt2[] values() {
        return (dt2[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
