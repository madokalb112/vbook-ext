package okhttp3.internal.connection;

import defpackage.ky0;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.platform.Platform;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class RealConnectionPool {
    public final long a;
    public final TaskQueue b;
    public final RealConnectionPool$cleanupTask$1 c;
    public final ConcurrentLinkedQueue d;

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class Companion {
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [okhttp3.internal.connection.RealConnectionPool$cleanupTask$1] */
    public RealConnectionPool(TaskRunner taskRunner) {
        taskRunner.getClass();
        TimeUnit.MINUTES.getClass();
        this.a = 300000000000L;
        this.b = taskRunner.d();
        final String strS = ky0.s(_UtilJvmKt.b, " ConnectionPool connection closer", new StringBuilder());
        this.c = new Task(strS) { // from class: okhttp3.internal.connection.RealConnectionPool$cleanupTask$1
            @Override // okhttp3.internal.concurrent.Task
            public final long a() {
                RealConnectionPool realConnectionPool = this.e;
                long jNanoTime = System.nanoTime();
                long j = (jNanoTime - realConnectionPool.a) + 1;
                Iterator it = realConnectionPool.d.iterator();
                it.getClass();
                RealConnection realConnection = null;
                long j2 = Long.MAX_VALUE;
                int i = 0;
                RealConnection realConnection2 = null;
                RealConnection realConnection3 = null;
                int i2 = 0;
                while (it.hasNext()) {
                    RealConnection realConnection4 = (RealConnection) it.next();
                    realConnection4.getClass();
                    synchronized (realConnection4) {
                        if (realConnectionPool.a(realConnection4, jNanoTime) > 0) {
                            i2++;
                        } else {
                            long j3 = realConnection4.C;
                            if (j3 < j) {
                                realConnection2 = realConnection4;
                                j = j3;
                            }
                            i++;
                            if (j3 < j2) {
                                realConnection3 = realConnection4;
                                j2 = j3;
                            }
                        }
                    }
                }
                if (realConnection2 != null) {
                    realConnection = realConnection2;
                } else if (i > 5) {
                    j = j2;
                    realConnection = realConnection3;
                } else {
                    j = -1;
                }
                if (realConnection == null) {
                    if (realConnection3 != null) {
                        return (j2 + realConnectionPool.a) - jNanoTime;
                    }
                    if (i2 > 0) {
                        return realConnectionPool.a;
                    }
                    return -1L;
                }
                synchronized (realConnection) {
                    if (!realConnection.B.isEmpty()) {
                        return 0L;
                    }
                    if (realConnection.C != j) {
                        return 0L;
                    }
                    realConnection.v = true;
                    realConnectionPool.d.remove(realConnection);
                    _UtilJvmKt.c(realConnection.e);
                    if (realConnectionPool.d.isEmpty()) {
                        realConnectionPool.b.a();
                    }
                    return 0L;
                }
            }
        };
        this.d = new ConcurrentLinkedQueue();
    }

    public final int a(RealConnection realConnection, long j) {
        TimeZone timeZone = _UtilJvmKt.a;
        ArrayList arrayList = realConnection.B;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + realConnection.c.a.h + " was leaked. Did you forget to close a response body?";
                Platform platform = Platform.a;
                Platform.a.k(((RealCall.CallReference) reference).a, str);
                arrayList.remove(i);
                if (arrayList.isEmpty()) {
                    realConnection.C = j - this.a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
