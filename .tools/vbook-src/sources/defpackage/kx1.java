package defpackage;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import java.util.concurrent.CancellationException;
import org.publicvalue.multiplatform.oidc.appsupport.HandleRedirectActivity;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class kx1 implements yb4 {
    public final /* synthetic */ int a;

    public /* synthetic */ kx1(int i) {
        this.a = 26;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 1:
                return ((jx1) obj).plus((hx1) obj2);
            case 2:
                return ((jx1) obj).plus((hx1) obj2);
            case 3:
                ((Integer) obj).intValue();
                sgb sgbVar = (sgb) obj2;
                sgbVar.getClass();
                return sgbVar.a;
            case 4:
                ff6 ff6Var = (ff6) obj;
                Throwable cancellationException = (Throwable) obj2;
                ff6Var.getClass();
                bi1 bi1Var = ff6Var.b;
                if (cancellationException == null) {
                    cancellationException = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                bi1Var.o0(cancellationException);
                return hebVar;
            case 5:
                pi2 pi2Var = (pi2) obj2;
                return gc1.Z(Integer.valueOf(pi2Var.k()), Float.valueOf(wx1.P(pi2Var.l(), -0.5f, 0.5f)), Integer.valueOf(pi2Var.o()));
            case 6:
                fn2 fn2Var = (fn2) obj2;
                ((ms8) obj).getClass();
                fn2Var.getClass();
                Boolean bool2 = (Boolean) fn2Var.a.getValue();
                bool2.booleanValue();
                return gc1.Z(bool2, (String) fn2Var.b.getValue(), (String) fn2Var.c.getValue());
            case 7:
                gn2 gn2Var = (gn2) obj2;
                ((ms8) obj).getClass();
                gn2Var.getClass();
                Boolean bool3 = (Boolean) gn2Var.a.getValue();
                bool3.booleanValue();
                return gc1.Z(bool3, (Long) gn2Var.b.getValue());
            case 8:
                kn2 kn2Var = (kn2) obj2;
                ((ms8) obj).getClass();
                kn2Var.getClass();
                Boolean bool4 = (Boolean) kn2Var.a.getValue();
                bool4.booleanValue();
                String str = (String) kn2Var.b.getValue();
                Boolean bool5 = (Boolean) kn2Var.c.getValue();
                bool5.booleanValue();
                return gc1.Z(bool4, str, bool5);
            case 9:
                ((qq5) obj).getClass();
                ((fn8) obj2).getClass();
                return new bi4(bx1.e(qq5.b));
            case 10:
                ev8 ev8Var = (ev8) obj;
                ev8Var.getClass();
                ((rm7) obj2).getClass();
                return new fv3((is4) ev8Var.d(ug8.a(is4.class), null));
            case 11:
                o83 o83Var = (o83) obj2;
                ((ms8) obj).getClass();
                o83Var.getClass();
                Boolean bool6 = (Boolean) o83Var.a.getValue();
                bool6.booleanValue();
                return gc1.Z(bool6, (String) o83Var.b.getValue(), (String) o83Var.c.getValue());
            case 12:
                p83 p83Var = (p83) obj2;
                ((ms8) obj).getClass();
                p83Var.getClass();
                Boolean bool7 = (Boolean) p83Var.a.getValue();
                bool7.booleanValue();
                return gc1.Z(bool7, (String) p83Var.b.getValue(), (String) p83Var.c.getValue(), (String) p83Var.d.getValue());
            case 13:
                q83 q83Var = (q83) obj2;
                ((ms8) obj).getClass();
                q83Var.getClass();
                Boolean bool8 = (Boolean) q83Var.a.getValue();
                bool8.booleanValue();
                return gc1.Z(bool8, (String) q83Var.b.getValue(), (String) q83Var.c.getValue());
            case 14:
                r83 r83Var = (r83) obj2;
                ((ms8) obj).getClass();
                r83Var.getClass();
                Boolean bool9 = (Boolean) r83Var.a.getValue();
                bool9.booleanValue();
                return gc1.Z(bool9, (String) r83Var.b.getValue(), (String) r83Var.c.getValue());
            case 15:
                s83 s83Var = (s83) obj2;
                ((ms8) obj).getClass();
                s83Var.getClass();
                Boolean bool10 = (Boolean) s83Var.a.getValue();
                bool10.booleanValue();
                String str2 = (String) s83Var.b.getValue();
                String str3 = (String) s83Var.c.getValue();
                Boolean bool11 = (Boolean) s83Var.d.getValue();
                bool11.booleanValue();
                return gc1.Z(bool10, str2, str3, bool11);
            case 16:
                t83 t83Var = (t83) obj2;
                ((ms8) obj).getClass();
                t83Var.getClass();
                Boolean bool12 = (Boolean) t83Var.a.getValue();
                bool12.booleanValue();
                return gc1.Z(bool12, (String) t83Var.b.getValue(), (String) t83Var.c.getValue(), (String) t83Var.d.getValue(), (String) t83Var.e.getValue());
            case 17:
                u83 u83Var = (u83) obj2;
                ((ms8) obj).getClass();
                u83Var.getClass();
                Boolean bool13 = (Boolean) u83Var.a.getValue();
                bool13.booleanValue();
                String str4 = (String) u83Var.b.getValue();
                String strA = u83Var.a();
                Boolean bool14 = (Boolean) u83Var.e.getValue();
                bool14.booleanValue();
                Boolean bool15 = (Boolean) u83Var.d.getValue();
                bool15.booleanValue();
                Boolean bool16 = (Boolean) u83Var.f.getValue();
                bool16.booleanValue();
                return gc1.Z(bool13, str4, strA, bool14, bool15, bool16);
            case 18:
                ((Integer) obj).intValue();
                w93 w93Var = (w93) obj2;
                w93Var.getClass();
                return w93Var.a;
            case 19:
                return Integer.valueOf(((String) obj2).length() - ((String) obj).length());
            case 20:
                ((Integer) obj).getClass();
                r2b r2bVar = (r2b) obj2;
                r2bVar.getClass();
                return new jc1(new jk3(r2bVar, (jt1) null, 1), 1);
            case 21:
                ((Integer) obj).getClass();
                r2b r2bVar2 = (r2b) obj2;
                r2bVar2.getClass();
                return new jc1(new jk3(r2bVar2, (jt1) null, 0), 1);
            case 22:
                ((Integer) obj).intValue();
                fr3 fr3Var = (fr3) obj2;
                fr3Var.getClass();
                return fr3Var.b;
            case 23:
                ((Integer) obj).intValue();
                to3 to3Var = (to3) obj2;
                to3Var.getClass();
                return ky0.r("update_", to3Var.a);
            case 24:
                ((Integer) obj).intValue();
                to3 to3Var2 = (to3) obj2;
                to3Var2.getClass();
                return ky0.r("installed_", to3Var2.a);
            case 25:
                ((Integer) obj).intValue();
                to3 to3Var3 = (to3) obj2;
                to3Var3.getClass();
                return to3Var3.a;
            case 26:
                ((Integer) obj2).getClass();
                wx1.l((dd4) obj, qu1.x0(1));
                return hebVar;
            case 27:
                ((Integer) obj).intValue();
                a64 a64Var = (a64) obj2;
                a64Var.getClass();
                return a64Var.a;
            case 28:
                ig4 ig4Var = (ig4) obj2;
                ((ms8) obj).getClass();
                ig4Var.getClass();
                Boolean bool17 = (Boolean) ig4Var.a.getValue();
                bool17.booleanValue();
                return gc1.Z(bool17, (String) ig4Var.b.getValue());
            default:
                zi1 zi1Var = (zi1) obj;
                se3 se3Var = HandleRedirectActivity.H;
                zi1Var.getClass();
                WebView webView = new WebView(zi1Var);
                HandleRedirectActivity.I.invoke(webView);
                webView.setWebChromeClient(new WebChromeClient());
                webView.setWebViewClient(new bj4((String) obj2, zi1Var, zi1Var));
                return webView;
        }
    }

    public /* synthetic */ kx1(int i, byte b) {
        this.a = i;
    }
}
