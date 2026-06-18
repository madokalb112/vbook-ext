package com.google.android.recaptcha.internal;

import android.content.Context;
import defpackage.fw;
import defpackage.kl8;
import defpackage.p7c;
import defpackage.sm3;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zzcd {
    public zzcd(Context context) {
    }

    public static final byte[] zza(File file) throws IOException {
        file.getClass();
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i = (int) length;
            byte[] bArrCopyOf = new byte[i];
            int i2 = i;
            int i3 = 0;
            while (i2 > 0) {
                int i4 = fileInputStream.read(bArrCopyOf, i3, i2);
                if (i4 < 0) {
                    break;
                }
                i2 -= i4;
                i3 += i4;
            }
            if (i2 > 0) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i3);
            } else {
                int i5 = fileInputStream.read();
                if (i5 != -1) {
                    sm3 sm3Var = new sm3(8193);
                    sm3Var.write(i5);
                    p7c.U(fileInputStream, sm3Var);
                    int size = sm3Var.size() + i;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrP = sm3Var.p();
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                    fw.R(bArrP, i, bArrCopyOf, 0, sm3Var.size());
                }
            }
            fileInputStream.close();
            return bArrCopyOf;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                kl8.S(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static final void zzb(File file, byte[] bArr) {
        if (file.exists() && !file.delete()) {
            sy3.m("Unable to delete existing encrypted file");
            return;
        }
        bArr.getClass();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.close();
        } finally {
        }
    }
}
