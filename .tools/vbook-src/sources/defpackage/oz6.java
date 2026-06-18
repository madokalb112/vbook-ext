package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class oz6 implements er7 {
    public final dr7 a;
    public final Context b;
    public final Activity c;
    public final kb4 d;
    public final String e;
    public final cn7 f;
    public q5 g;

    public oz6(dr7 dr7Var, Context context, Activity activity, kb4 kb4Var) {
        kb4Var.getClass();
        this.a = dr7Var;
        this.b = context;
        this.c = activity;
        this.d = kb4Var;
        nh nhVar = (nh) oh.a.get(dr7Var);
        String str = "";
        if (nhVar != null) {
            int i = Build.VERSION.SDK_INT;
            int i2 = nhVar.b;
            if (i <= nhVar.c && i2 <= i) {
                str = nhVar.a;
            }
        }
        this.e = str;
        this.f = dk9.x(b());
    }

    @Override // defpackage.er7
    public final void a() {
        String str = this.e;
        if (str.length() == 0) {
            this.f.setValue(b());
            this.d.invoke(Boolean.TRUE);
            return;
        }
        q5 q5Var = this.g;
        if (q5Var != null) {
            q5Var.a(str);
        } else {
            gp.j("ActivityResultLauncher cannot be null");
        }
    }

    public final jr7 b() {
        boolean zShouldShowRequestPermissionRationale;
        String str = this.e;
        if (str.length() != 0) {
            if (hs1.checkSelfPermission(this.b, str) != 0) {
                int i = Build.VERSION.SDK_INT;
                if (i >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
                    Activity activity = this.c;
                    if (i < 32 && i == 31) {
                        try {
                            zShouldShowRequestPermissionRationale = ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
                        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                            zShouldShowRequestPermissionRationale = activity.shouldShowRequestPermissionRationale(str);
                        }
                    } else {
                        zShouldShowRequestPermissionRationale = activity.shouldShowRequestPermissionRationale(str);
                    }
                } else {
                    zShouldShowRequestPermissionRationale = false;
                }
                return new hr7(zShouldShowRequestPermissionRationale);
            }
        }
        return ir7.a;
    }
}
