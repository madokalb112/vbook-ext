package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class gt2 implements Executor {
    public static final gt2 a;
    public static final /* synthetic */ gt2[] b;

    static {
        gt2 gt2Var = new gt2("INSTANCE", 0);
        a = gt2Var;
        b = new gt2[]{gt2Var};
    }

    public static gt2 valueOf(String str) {
        return (gt2) Enum.valueOf(gt2.class, str);
    }

    public static gt2[] values() {
        return (gt2[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
