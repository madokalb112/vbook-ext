package com.google.android.recaptcha.internal;

import android.content.Context;
import defpackage.fc1;
import defpackage.gc1;
import defpackage.iw9;
import defpackage.lc5;
import defpackage.mn5;
import defpackage.w21;
import defpackage.x21;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zzbm implements zzaq {
    private final Context zza;
    private final String zzb = "rce_";

    public zzbm(Context context) {
        this.zza = context;
        new zzcd(context);
    }

    @Override // com.google.android.recaptcha.internal.zzaq
    public final String zza(String str) {
        File file = new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str)));
        if (file.exists()) {
            return new String(zzcd.zza(file), StandardCharsets.UTF_8);
        }
        return null;
    }

    @Override // com.google.android.recaptcha.internal.zzaq
    public final void zzb() {
        try {
            File[] fileArrListFiles = this.zza.getCacheDir().listFiles();
            if (fileArrListFiles != null) {
                ArrayList arrayList = new ArrayList();
                int i = 0;
                for (File file : fileArrListFiles) {
                    if (iw9.K(file.getName(), this.zzb, false)) {
                        arrayList.add(file);
                    }
                }
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((File) obj).delete();
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.google.android.recaptcha.internal.zzaq
    public final void zzc(String str, String str2) {
        x21 x21Var = new x21('A', 'z');
        ArrayList arrayList = new ArrayList(gc1.M(x21Var, 10));
        Iterator it = x21Var.iterator();
        while (true) {
            w21 w21Var = (w21) it;
            boolean z = w21Var.d;
            if (!z) {
                List listC1 = fc1.c1(arrayList);
                Collections.shuffle(listC1);
                String strD0 = fc1.D0(((ArrayList) listC1).subList(0, 8), "", null, null, null, 62);
                File file = new File(this.zza.getCacheDir(), this.zzb.concat(strD0));
                zzcd.zzb(file, String.valueOf(str2).getBytes(StandardCharsets.UTF_8));
                file.renameTo(new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str))));
                return;
            }
            int i = w21Var.e;
            if (i != w21Var.c) {
                w21Var.e = w21Var.b + i;
            } else {
                if (!z) {
                    mn5.m();
                    return;
                }
                w21Var.d = false;
            }
            arrayList.add(Character.valueOf((char) i));
        }
    }

    @Override // com.google.android.recaptcha.internal.zzaq
    public final boolean zzd(String str) {
        File file;
        try {
            File[] fileArrListFiles = this.zza.getCacheDir().listFiles();
            file = null;
            if (fileArrListFiles != null) {
                int length = fileArrListFiles.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    File file2 = fileArrListFiles[i];
                    if (lc5.Q(file2.getName(), this.zzb + str)) {
                        file = file2;
                        break;
                    }
                    i++;
                }
            }
        } catch (Exception unused) {
        }
        return file != null;
    }
}
