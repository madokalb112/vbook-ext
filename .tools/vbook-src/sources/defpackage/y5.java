package defpackage;

import android.util.Log;
import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextAction;
import org.mozilla.javascript.JavaAdapter;
import org.mozilla.javascript.Script;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class y5 implements j5, ll2, fj1, Continuation, e06, lk2, i77, ig0, rj8, OnSuccessListener, ContextAction, xo9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y5(da daVar, u06 u06Var, rc6 rc6Var, IOException iOException, boolean z) {
        this.a = 10;
        this.b = rc6Var;
    }

    public boolean a() {
        return ((yo9) ((zo9) ((vc8) this.b).H.getValue()).c.getValue()).a;
    }

    public void b(long j, hn7 hn7Var) {
        t96.y(j, hn7Var, ((ha4) this.b).K);
    }

    public void c(Object obj) {
        ((kb4) ((a07) this.b).getValue()).invoke(obj);
    }

    @Override // defpackage.ll2
    public void e(s58 s58Var) {
        zy1 zy1Var = (zy1) this.b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        zy1Var.b.set((zy1) s58Var.get());
    }

    public long f(long j) {
        o04 o04Var = (o04) this.b;
        return hjb.j((j * ((long) o04Var.e)) / 1000000, 0L, o04Var.j - 1);
    }

    public hh8 g(int i, z1b z1bVar, int[] iArr) {
        jk2 jk2Var = (jk2) this.b;
        v45 v45VarI = a55.i();
        for (int i2 = 0; i2 < z1bVar.a; i2++) {
            v45VarI.b(new gk2(i, z1bVar, i2, jk2Var, iArr[i2]));
        }
        return v45VarI.g();
    }

    public r01 h(y91 y91Var) throws IOException {
        s01 s01Var = (s01) this.b;
        URL url = (URL) y91Var.b;
        String strT = ex1.T("CctTransportBackend");
        if (Log.isLoggable(strT, 4)) {
            Log.i(strT, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(s01Var.g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.3.0 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) y91Var.d;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    lp8 lp8Var = s01Var.a;
                    j60 j60Var = (j60) y91Var.c;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    hf5 hf5Var = (hf5) lp8Var.b;
                    vg5 vg5Var = new vg5(bufferedWriter, hf5Var.a, hf5Var.b, hf5Var.c, hf5Var.d);
                    vg5Var.a(j60Var);
                    vg5Var.c();
                    vg5Var.b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer numValueOf = Integer.valueOf(responseCode);
                    String strT2 = ex1.T("CctTransportBackend");
                    if (Log.isLoggable(strT2, 4)) {
                        Log.i(strT2, String.format("Status Code: %d", numValueOf));
                    }
                    ex1.K(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                    ex1.K(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new r01(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new r01(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            r01 r01Var = new r01(responseCode, null, n80.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return r01Var;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (cd3 e) {
            e = e;
            ex1.M(e, "CctTransportBackend", "Couldn't encode request, returning with 400");
            return new r01(400, null, 0L);
        } catch (ConnectException e2) {
            e = e2;
            ex1.M(e, "CctTransportBackend", "Couldn't open connection, returning with 500");
            return new r01(500, null, 0L);
        } catch (UnknownHostException e3) {
            e = e3;
            ex1.M(e, "CctTransportBackend", "Couldn't open connection, returning with 500");
            return new r01(500, null, 0L);
        } catch (IOException e4) {
            e = e4;
            ex1.M(e, "CctTransportBackend", "Couldn't encode request, returning with 400");
            return new r01(400, null, 0L);
        }
    }

    public void invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 8:
                ((ea) obj).o = (gj3) obj2;
                break;
            case 9:
                ae2 ae2Var = (ae2) obj2;
                wc6 wc6Var = (ea) obj;
                wc6Var.y += ae2Var.g;
                wc6Var.z += ae2Var.e;
                break;
            case 10:
                wc6 wc6Var2 = (ea) obj;
                wc6Var2.getClass();
                wc6Var2.w = ((rc6) obj2).a;
                break;
            case 11:
            case 12:
            case 13:
            default:
                ((vv7) obj).D((mg6) obj2);
                break;
            case 14:
                ((vv7) obj).t((tc6) obj2);
                break;
            case 15:
                ((vv7) obj).f((j2b) obj2);
                break;
            case 16:
                ((vv7) obj).p((d22) obj2);
                break;
            case 17:
                ((vv7) obj).t(((tj3) obj2).a.S);
                break;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(35:6|(1:8)(1:10)|9|11|(1:13)|(1:15)(1:16)|17|(31:21|37|(1:39)|40|(1:42)|43|(3:45|(2:47|157)(1:158)|48)|156|49|149|50|51|(1:53)|54|(1:56)|(1:58)(1:59)|60|(4:63|(2:65|160)(1:161)|66|61)|159|67|(1:69)|162|70|(1:72)(1:73)|(1:75)(1:76)|77|(5:82|(1:84)|85|409|89)(1:81)|90|(12:101|102|(2:104|(1:106))(2:107|(2:134|163))|109|151|110|147|111|112|113|(3:128|(1:130)|131)(3:121|(1:123)|124)|133)(13:94|(1:96)(13:98|(1:100)|101|102|(0)(0)|109|151|110|147|111|112|113|(6:115|117|128|(0)|131|133)(0))|97|102|(0)(0)|109|151|110|147|111|112|113|(0)(0))|140|(2:142|(2:144|145)(1:165))(1:164))(3:22|(3:26|34|(1:36))(4:27|(2:30|28)|155|31)|32)|33|40|(0)|43|(0)|156|49|149|50|51|(0)|54|(0)|(0)(0)|60|(1:61)|159|67|(0)|162|70|(0)(0)|(0)(0)|77|(5:79|82|(0)|85|409)(0)|140|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0632, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0633, code lost:
    
        r10 = "FirebaseCrashlytics";
        android.util.Log.e(r10, "Error retrieving app package info.", r0);
        r15 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0587 A[Catch: Exception -> 0x05b4, TryCatch #2 {Exception -> 0x05b4, blocks: (B:110:0x0489, B:112:0x0557, B:113:0x055c, B:115:0x0587, B:117:0x058f, B:119:0x059d, B:121:0x05a3, B:123:0x05ac, B:124:0x05b0), top: B:151:0x0489 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x040a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0342 A[LOOP:3: B:68:0x0340->B:69:0x0342, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03ef  */
    @Override // defpackage.fj1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k(ks r47) {
        /*
            Method dump skipped, instruction units count: 1632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y5.k(ks):java.lang.Object");
    }

    public void onSuccess(Object obj) {
        int i = this.a;
        rl4 rl4Var = (rl4) this.b;
        switch (i) {
            case 22:
                int i2 = HiddenActivity.c;
                rl4Var.invoke(obj);
                break;
            case 23:
                int i3 = HiddenActivity.c;
                rl4Var.invoke(obj);
                break;
            case 24:
                int i4 = HiddenActivity.c;
                rl4Var.invoke(obj);
                break;
            default:
                int i5 = HiddenActivity.c;
                rl4Var.invoke(obj);
                break;
        }
    }

    @Override // org.mozilla.javascript.ContextAction
    public Object run(Context context) {
        return JavaAdapter.lambda$runScript$1((Script) this.b, context);
    }

    public Object then(Task task) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 6:
                return (Task) ((qy1) obj).call();
            default:
                ((Runnable) obj).run();
                return Tasks.forResult((Object) null);
        }
    }

    public void v(o67 o67Var, int i) {
        StringBuilder sb = (StringBuilder) this.b;
        if (o67Var instanceof w32) {
            sb.append(((w32) o67Var).G());
        } else if (o67Var instanceof ag1) {
            sb.append(((ag1) o67Var).G());
        } else if (o67Var instanceof hw0) {
            sb.append(((hw0) o67Var).G());
        }
    }

    public /* synthetic */ y5(da daVar, Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ y5(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
