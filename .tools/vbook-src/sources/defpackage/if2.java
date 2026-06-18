package defpackage;

import android.util.Log;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.io.FileNotFoundException;
import java.lang.reflect.Constructor;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class if2 implements e06, fj1, a83, j3b, f06 {
    public final /* synthetic */ int a;

    public static /* synthetic */ void c() {
        throw new fi1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void d(int i, int i2, String str) {
        throw new IllegalArgumentException((str + i + ((char) i2)).toString());
    }

    public static /* synthetic */ void f(Object obj, String str) throws FileNotFoundException {
        throw new FileNotFoundException(str + obj);
    }

    public Constructor a() {
        switch (this.a) {
            case 12:
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(ls3.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(ls3.class).getConstructor(null);
        }
    }

    public Object apply(Object obj) {
        j59 j59Var = (j59) obj;
        String strP = k59.b.p(j59Var);
        strP.getClass();
        j59Var.getClass();
        Log.d("FirebaseSessions", "Session Event Type: SESSION_START");
        byte[] bytes = strP.getBytes(q31.a);
        bytes.getClass();
        return bytes;
    }

    public void b(Object obj, p04 p04Var) {
        ((vv7) obj).c(new uv7(p04Var));
    }

    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((ea) obj).getClass();
                break;
            case 1:
                ((ea) obj).getClass();
                break;
            case 2:
                ((ea) obj).getClass();
                break;
            case 3:
                ((ea) obj).getClass();
                break;
            case 4:
                ((ea) obj).getClass();
                break;
            case 5:
                ((ea) obj).getClass();
                break;
            case 6:
                ((ea) obj).getClass();
                break;
            case 7:
                ((ea) obj).getClass();
                break;
            case 8:
                ((ea) obj).getClass();
                break;
            case 9:
                ((ea) obj).getClass();
                break;
            case 10:
                ((ea) obj).getClass();
                break;
            case 11:
                ((ea) obj).getClass();
                break;
            case 26:
                ((vv7) obj).w(new gj3(2, new fi1("Player release timed out."), 1003));
                break;
            default:
                ((vv7) obj).x();
                break;
        }
    }

    @Override // defpackage.fj1
    public Object k(ks ksVar) {
        switch (this.a) {
            case 15:
                Set setB = ksVar.b(oa8.a(j80.class));
                uf4 uf4Var = uf4.c;
                if (uf4Var == null) {
                    synchronized (uf4.class) {
                        try {
                            uf4Var = uf4.c;
                            if (uf4Var == null) {
                                uf4Var = new uf4(0);
                                uf4.c = uf4Var;
                            }
                        } finally {
                        }
                        break;
                    }
                }
                return new xk2(setB, uf4Var);
            case 22:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.get();
            case 23:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            case 24:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.get();
            default:
                ep5 ep5Var = ExecutorsRegistrar.a;
                return hdb.a;
        }
    }

    public float e(float f) {
        return f;
    }
}
