package defpackage;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class gz extends Thread {
    public final /* synthetic */ int a = 0;

    public /* synthetic */ gz(String str) {
        super(str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        switch (this.a) {
            case 0:
                break;
            default:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
                break;
        }
        while (true) {
            try {
                ii1 ii1Var = hz.h;
                reentrantLock = hz.j;
                reentrantLock.lock();
            } catch (InterruptedException unused2) {
            }
            try {
                hz hzVarO = ra1.o();
                if (hzVarO == hz.i) {
                    hz.i = null;
                    reentrantLock.unlock();
                    return;
                } else {
                    reentrantLock.unlock();
                    if (hzVarO != null) {
                        hzVarO.l();
                    }
                }
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public /* synthetic */ gz(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
