package okhttp3.internal.concurrent;

import defpackage.xv5;
import java.util.Arrays;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class TaskLoggerKt {
    public static final void a(Logger logger, Task task, TaskQueue taskQueue, String str) {
        logger.fine(taskQueue.b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + task.a);
    }

    public static final String b(long j) {
        String strN;
        if (j <= -999500000) {
            strN = xv5.n((j - 500000000) / 1000000000, " s ", new StringBuilder());
        } else if (j <= -999500) {
            strN = xv5.n((j - 500000) / 1000000, " ms", new StringBuilder());
        } else if (j <= 0) {
            strN = xv5.n((j - 500) / 1000, " µs", new StringBuilder());
        } else if (j < 999500) {
            strN = xv5.n((j + 500) / 1000, " µs", new StringBuilder());
        } else if (j < 999500000) {
            strN = xv5.n((j + 500000) / 1000000, " ms", new StringBuilder());
        } else {
            strN = xv5.n((j + 500000000) / 1000000000, " s ", new StringBuilder());
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{strN}, 1));
    }
}
