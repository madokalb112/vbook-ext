package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.app.LocaleManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import android.os.Process;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class f38 {
    public static final f38 a = new f38();

    public static ArrayList a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        context.getClass();
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            runningAppProcesses = lc3.a;
        }
        ArrayList arrayListV0 = fc1.v0(runningAppProcesses);
        ArrayList arrayList = new ArrayList();
        int size = arrayListV0.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayListV0.get(i3);
            i3++;
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(gc1.M(arrayList, 10));
        int size2 = arrayList.size();
        while (i2 < size2) {
            Object obj2 = arrayList.get(i2);
            i2++;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj2;
            l70 l70Var = new l70();
            String str2 = runningAppProcessInfo.processName;
            if (str2 == null) {
                k27.n("Null processName");
                return null;
            }
            l70Var.a = str2;
            l70Var.b = runningAppProcessInfo.pid;
            byte b = (byte) (l70Var.e | 1);
            l70Var.c = runningAppProcessInfo.importance;
            l70Var.e = (byte) (b | 2);
            l70Var.d = lc5.Q(str2, str);
            l70Var.e = (byte) (l70Var.e | 4);
            arrayList2.add(l70Var.a());
        }
        return arrayList2;
    }

    public oz1 b(Context context) {
        Object obj;
        String processName;
        context.getClass();
        int iMyPid = Process.myPid();
        ArrayList arrayListA = a(context);
        int size = arrayListA.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayListA.get(i);
            i++;
            if (((m70) ((oz1) obj)).b == iMyPid) {
                break;
            }
        }
        oz1 oz1Var = (oz1) obj;
        if (oz1Var != null) {
            return oz1Var;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 > 33) {
            processName = Process.myProcessName();
            processName.getClass();
        } else if (i2 < 28 || (processName = Application.getProcessName()) == null) {
            processName = "";
        }
        l70 l70Var = new l70();
        l70Var.a = processName;
        l70Var.b = iMyPid;
        byte b = (byte) (l70Var.e | 1);
        l70Var.c = 0;
        l70Var.d = false;
        l70Var.e = (byte) (((byte) (b | 2)) | 4);
        return l70Var.a();
    }

    public void c(bbc bbcVar) {
        i36 i36VarA;
        LocaleList emptyLocaleList;
        Context context = kl8.D;
        context.getClass();
        String language = ((Locale) bbcVar.b).getLanguage();
        language.getClass();
        Locale locale = language.length() == 0 ? null : (Locale) bbcVar.b;
        Resources resources = context.getResources();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            LocaleManager localeManager = (LocaleManager) hs1.getSystemService(context, LocaleManager.class);
            if (localeManager != null) {
                if (locale == null || (emptyLocaleList = LocaleList.forLanguageTags(locale.toLanguageTag())) == null) {
                    emptyLocaleList = LocaleList.getEmptyLocaleList();
                }
                localeManager.setApplicationLocales(emptyLocaleList);
            }
        } else {
            Locale locale2 = locale == null ? Resources.getSystem().getConfiguration().getLocales().get(0) : locale;
            Locale.setDefault(locale2);
            Configuration configuration = resources.getConfiguration();
            configuration.setLocale(locale2);
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        }
        if (locale == null || (i36VarA = i36.a(locale.toLanguageTag())) == null) {
            i36VarA = i36.b;
            i36VarA.getClass();
        }
        i36 i36Var = js.a;
        if (i >= 33) {
            ew ewVar = js.b;
            ewVar.getClass();
            yv yvVar = new yv(ewVar);
            while (yvVar.hasNext()) {
                if (((WeakReference) yvVar.next()).get() != null) {
                    j31.j();
                    return;
                }
            }
            return;
        }
        if (i36VarA.equals(js.a)) {
            return;
        }
        synchronized (js.c) {
            js.a = i36VarA;
            ew ewVar2 = js.b;
            ewVar2.getClass();
            yv yvVar2 = new yv(ewVar2);
            while (yvVar2.hasNext()) {
                if (((WeakReference) yvVar2.next()).get() != null) {
                    throw new ClassCastException();
                }
            }
        }
    }
}
