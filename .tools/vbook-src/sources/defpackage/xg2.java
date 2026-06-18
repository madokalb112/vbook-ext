package defpackage;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class xg2 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yg2 b;

    public /* synthetic */ xg2(yg2 yg2Var, int i) {
        this.a = i;
        this.b = yg2Var;
    }

    private final Object a() {
        String string;
        yg2 yg2Var = this.b;
        synchronized (yg2Var) {
            try {
                cl4 cl4Var = (cl4) yg2Var.a.get();
                ArrayList arrayListA = cl4Var.a();
                synchronized (cl4Var) {
                    pd5 pd5Var = cl4Var.a;
                    rx2 rx2Var = new rx2(cl4Var, 16);
                    pd5Var.getClass();
                }
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < arrayListA.size(); i++) {
                    f80 f80Var = (f80) arrayListA.get(i);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", f80Var.a);
                    jSONObject.put("dates", new JSONArray((Collection) f80Var.b));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        string = byteArrayOutputStream.toString("UTF-8");
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Set setUnmodifiableSet;
        Set setUnmodifiableSet2;
        switch (this.a) {
            case 0:
                return a();
            default:
                yg2 yg2Var = this.b;
                synchronized (yg2Var) {
                    cl4 cl4Var = (cl4) yg2Var.a.get();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    xk2 xk2Var = (xk2) yg2Var.c.get();
                    uf4 uf4Var = xk2Var.b;
                    synchronized (((HashSet) uf4Var.b)) {
                        setUnmodifiableSet = Collections.unmodifiableSet((HashSet) uf4Var.b);
                        break;
                    }
                    boolean zIsEmpty = setUnmodifiableSet.isEmpty();
                    String string = xk2Var.a;
                    if (!zIsEmpty) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(string);
                        sb.append(' ');
                        synchronized (((HashSet) uf4Var.b)) {
                            setUnmodifiableSet2 = Collections.unmodifiableSet((HashSet) uf4Var.b);
                            break;
                        }
                        sb.append(xk2.a(setUnmodifiableSet2));
                        string = sb.toString();
                    }
                    synchronized (cl4Var) {
                        String strB = cl4Var.b(jCurrentTimeMillis);
                        e18 e18VarF0 = i12.f0(string);
                        pd5 pd5Var = cl4Var.a;
                        um umVar = new um(cl4Var, strB, string, e18VarF0, 10);
                        pd5Var.getClass();
                    }
                }
                return null;
        }
    }
}
