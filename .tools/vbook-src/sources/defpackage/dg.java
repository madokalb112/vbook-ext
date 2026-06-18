package defpackage;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class dg extends t96 {
    public final File z;

    public dg(File file) {
        this.z = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dg) && this.z.equals(((dg) obj).z);
    }

    public final int hashCode() {
        return this.z.hashCode();
    }

    public final String toString() {
        return "FileWrapper(file=" + this.z + ")";
    }
}
