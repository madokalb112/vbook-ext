package defpackage;

import android.os.HandlerThread;
import com.reader.data.reader.text.core.tts.AndroidTextToSpeechService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.mozilla.javascript.Context;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class fv4 implements bla {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;
    public Object d;
    public Object e;

    public fv4(byte[] bArr, int i) {
        this.a = 0;
        int i2 = (i & 1) != 0 ? Context.VERSION_ES6 : 400;
        bArr = (i & 8) != 0 ? null : bArr;
        this.b = i2;
        this.c = mc3.a;
        this.d = "application/json";
        this.e = bArr;
    }

    @Override // defpackage.bla
    public void a() {
        k9b k9bVar = (k9b) this.c;
        iw0 iw0Var = k9bVar.k;
        aj2 aj2Var = rw2.a;
        ah1.J(iw0Var, nh2.c, null, new y8b(k9bVar, null, 3), 2);
    }

    public String b() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.b + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((Object[]) this.d)[i2];
            if (obj instanceof m39) {
                m39 m39Var = (m39) obj;
                boolean zQ = lc5.Q(m39Var.e(), qw9.d);
                int[] iArr = (int[]) this.e;
                if (!zQ) {
                    int i3 = iArr[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(m39Var.g(i3));
                    }
                } else if (iArr[i2] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.e)[i2]);
                    sb.append("]");
                }
            } else if (obj == g83.s) {
                sb.append("[<debug info disabled>]");
            } else if (obj != lr3.t) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    public int c() {
        int i = this.b;
        if (i != 2) {
            return i != 3 ? 0 : 512;
        }
        return 2048;
    }

    public void d() {
        HandlerThread handlerThread;
        synchronized (this.c) {
            try {
                fx1.R(this.b > 0);
                int i = this.b - 1;
                this.b = i;
                if (i == 0 && (handlerThread = (HandlerThread) this.e) != null) {
                    handlerThread.quit();
                    this.e = null;
                    this.d = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e() {
        int i = this.b * 2;
        this.d = Arrays.copyOf((Object[]) this.d, i);
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = -1;
        }
        fw.V(0, 0, 14, (int[]) this.e, iArr);
        this.e = iArr;
    }

    @Override // defpackage.bla
    public void l(int i, int i2) {
        String str = (String) this.d;
        k9b k9bVar = (k9b) this.c;
        k9bVar.y = i;
        c85 c85Var = k9bVar.o;
        if (c85Var != null) {
            AndroidTextToSpeechService androidTextToSpeechService = (AndroidTextToSpeechService) c85Var.a;
            dp5 dp5Var = androidTextToSpeechService.s;
            int i3 = this.b;
            int length = str.length();
            iw0 iw0Var = androidTextToSpeechService.B;
            aj2 aj2Var = rw2.a;
            ah1.J(iw0Var, r76.a.f, null, new il(androidTextToSpeechService, i, i2, length, null), 2);
            ((h8b) dp5Var.getValue()).d(false, true);
            h8b h8bVar = (h8b) dp5Var.getValue();
            String str2 = (String) c85Var.b;
            h8bVar.getClass();
            str2.getClass();
            fr9 fr9Var = h8bVar.b;
            while (true) {
                Object value = fr9Var.getValue();
                ((f8b) value).getClass();
                int i4 = i3;
                if (fr9Var.j(value, new f8b(i4, i, i2, length, str2))) {
                    break;
                } else {
                    i3 = i4;
                }
            }
        }
        int i5 = i2;
        k9bVar.x = ((double) i5) / ((double) str.length());
        h8b h8bVar2 = k9bVar.i;
        String str3 = (String) this.e;
        int i6 = this.b;
        int length2 = str.length();
        h8bVar2.getClass();
        str3.getClass();
        fr9 fr9Var2 = h8bVar2.b;
        while (true) {
            Object value2 = fr9Var2.getValue();
            ((f8b) value2).getClass();
            if (fr9Var2.j(value2, new f8b(i6, i, i5, length2, str3))) {
                return;
            } else {
                i5 = i2;
            }
        }
    }

    @Override // defpackage.bla
    public void m() {
        c85 c85Var = ((k9b) this.c).o;
        if (c85Var != null) {
            ((h8b) ((AndroidTextToSpeechService) c85Var.a).s.getValue()).d(true, true);
        }
    }

    @Override // defpackage.bla
    public void q(String str) throws Throwable {
        str.getClass();
        k9b k9bVar = (k9b) this.c;
        c85 c85Var = k9bVar.o;
        if (c85Var != null) {
            c85Var.y(new a8b(str));
        }
        k9bVar.i.c();
        ah1.S(hc3.a, new y8b(k9bVar, null, 4));
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return b();
            default:
                return super.toString();
        }
    }

    public fv4() {
        this.a = 2;
        this.c = new Object();
        this.d = null;
        this.e = null;
        this.b = 0;
    }

    public fv4(int i, String str, int i2, ArrayList arrayList, byte[] bArr) {
        List listUnmodifiableList;
        this.a = 3;
        this.d = str;
        this.b = i2;
        if (arrayList == null) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.c = listUnmodifiableList;
        this.e = bArr;
    }

    public fv4(cf5 cf5Var) {
        this.a = 1;
        this.c = cf5Var;
        this.d = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        this.e = iArr;
        this.b = -1;
    }

    public fv4(k9b k9bVar, int i, String str, String str2) {
        this.a = 4;
        this.c = k9bVar;
        this.b = i;
        this.d = str;
        this.e = str2;
    }
}
