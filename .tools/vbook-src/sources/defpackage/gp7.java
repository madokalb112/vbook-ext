package defpackage;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class gp7 {
    public static final char a = File.separatorChar;

    public static final yn7 a(String str) {
        str.getClass();
        return new yn7(new File(str));
    }
}
