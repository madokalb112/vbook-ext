package defpackage;

import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.io.File;
import java.util.List;
import org.publicvalue.multiplatform.oidc.appsupport.HandleRedirectActivity;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class se3 implements kb4 {
    public final /* synthetic */ int a;

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = 0;
        switch (this.a) {
            case 0:
                xl7 xl7Var = (xl7) obj;
                xl7Var.getClass();
                return tw2.o("<li><a href=\"", (String) xl7Var.a, "\">", ve3.x((String) xl7Var.b), "</a></li>");
            case 1:
                return Boolean.valueOf(((r2b) obj).b.c == 3);
            case 2:
                return Boolean.valueOf(((r2b) obj).b.c == 1);
            case 3:
                ((dx7) obj).getClass();
                return heb.a;
            case 4:
                ((qq5) obj).getClass();
                return new bi4(bx1.e(qq5.b));
            case 5:
                ((qq5) obj).getClass();
                return new bi4(bx1.e(qq5.b));
            case 6:
                ((qq5) obj).getClass();
                return new bi4(bx1.e(qq5.b));
            case 7:
                ((qq5) obj).getClass();
                return new bi4(bx1.e(qq5.b));
            case 8:
                el3 el3Var = (el3) obj;
                el3Var.getClass();
                String str = el3Var.e;
                return str.length() == 0 ? el3Var.a : str;
            case 9:
                el3 el3Var2 = (el3) obj;
                el3Var2.getClass();
                String str2 = el3Var2.e;
                return str2.length() == 0 ? el3Var2.a : str2;
            case 10:
                ((qq5) obj).getClass();
                return new bi4(bx1.e(qq5.b));
            case 11:
                el3 el3Var3 = (el3) obj;
                el3Var3.getClass();
                String str3 = el3Var3.e;
                return str3.length() == 0 ? el3Var3.a : str3;
            case 12:
                vu6 vu6Var = (vu6) obj;
                vu6Var.getClass();
                zg1 zg1Var = new zg1(23);
                ov9 ov9Var = s16.t;
                ck5 ck5Var = ck5.b;
                vu6Var.a(new jt3(new if0(ov9Var, ug8.a(sr3.class), zg1Var, ck5Var)));
                vu6Var.a(new jt3(new if0(ov9Var, ug8.a(wo3.class), new zg1(24), ck5Var)));
                vu6Var.a(new jt3(new if0(ov9Var, ug8.a(pp3.class), new zg1(25), ck5Var)));
                vu6Var.a(new jt3(new if0(ov9Var, ug8.a(do3.class), new zg1(26), ck5Var)));
                vu6Var.a(new jt3(new if0(ov9Var, ug8.a(yn3.class), new zg1(27), ck5Var)));
                vu6Var.a(new jt3(new if0(ov9Var, ug8.a(en3.class), new zg1(28), ck5Var)));
                vu6Var.a(new jt3(new if0(ov9Var, ug8.a(g95.class), new zg1(29), ck5Var)));
                vu6Var.a(new jt3(new if0(ov9Var, ug8.a(i95.class), new zo3(i), ck5Var)));
                return heb.a;
            case 13:
                ((qq5) obj).getClass();
                return new bi4(bx1.e(qq5.b));
            case 14:
                ((qq5) obj).getClass();
                return new bi4(bx1.e(qq5.b));
            case 15:
                ((qq5) obj).getClass();
                return new bi4(bx1.e(qq5.b));
            case 16:
                return dx1.f(((Integer) obj).intValue(), "load_");
            case 17:
                z12 z12Var = (z12) obj;
                z12Var.getClass();
                return "[" + z12Var + ']';
            case 18:
                File file = (File) obj;
                file.getClass();
                String absolutePath = file.getCanonicalFile().getAbsolutePath();
                absolutePath.getClass();
                return new rf9(absolutePath);
            case 19:
                ey1 ey1Var = (ey1) obj;
                ey1Var.getClass();
                Log.w("FirebaseSessions", "CorruptionException in session configs DataStore", ey1Var);
                return fu6.I;
            case 20:
                l29.f((n29) obj, 0);
                return heb.a;
            case 21:
                o54 o54Var = (o54) obj;
                o54Var.getClass();
                return o54Var.a;
            case 22:
                ((String) obj).getClass();
                return heb.a;
            case 23:
                q26 q26Var = (q26) obj;
                q26Var.getClass();
                return q26Var.b;
            case 24:
                ((qq5) obj).getClass();
                return new bi4(bx1.e(qq5.b));
            case 25:
                synchronized (vj9.c) {
                    List list = vj9.i;
                    int size = list.size();
                    while (i < size) {
                        ((kb4) list.get(i)).invoke(obj);
                        i++;
                    }
                }
                return heb.a;
            case 26:
                List list2 = (List) obj;
                list2.getClass();
                Object obj2 = list2.get(0);
                obj2.getClass();
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                Object obj3 = list2.get(1);
                obj3.getClass();
                return new ig4((String) obj3, zBooleanValue);
            case 27:
                se3 se3Var = HandleRedirectActivity.H;
                ((WebSettings) obj).getClass();
                return heb.a;
            case 28:
                WebView webView = (WebView) obj;
                se3 se3Var2 = HandleRedirectActivity.H;
                webView.getClass();
                WebSettings settings = webView.getSettings();
                settings.setJavaScriptCanOpenWindowsAutomatically(false);
                settings.setSupportMultipleWindows(false);
                HandleRedirectActivity.H.invoke(settings);
                return heb.a;
            default:
                se3 se3Var3 = HandleRedirectActivity.H;
                ((n22) obj).getClass();
                return heb.a;
        }
    }

    public /* synthetic */ se3(int i) {
        this.a = i;
    }
}
