package okhttp3;

import java.net.Socket;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RealConnectionPool;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ConnectionPool {
    public final RealConnectionPool a;

    public ConnectionPool() {
        TimeUnit.MINUTES.getClass();
        TaskRunner taskRunner = TaskRunner.x;
        taskRunner.getClass();
        this.a = new RealConnectionPool(taskRunner);
    }

    public final void a() {
        Socket socket;
        RealConnectionPool realConnectionPool = this.a;
        Iterator it = realConnectionPool.d.iterator();
        it.getClass();
        while (it.hasNext()) {
            RealConnection realConnection = (RealConnection) it.next();
            realConnection.getClass();
            synchronized (realConnection) {
                if (realConnection.B.isEmpty()) {
                    it.remove();
                    realConnection.v = true;
                    socket = realConnection.e;
                } else {
                    socket = null;
                }
            }
            if (socket != null) {
                _UtilJvmKt.c(socket);
            }
        }
        if (realConnectionPool.d.isEmpty()) {
            realConnectionPool.b.a();
        }
    }
}
