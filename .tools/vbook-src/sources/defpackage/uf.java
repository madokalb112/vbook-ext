package defpackage;

import com.reader.data.download.impl.AndroidDownloadService;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class uf implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AndroidDownloadService b;

    public /* synthetic */ uf(AndroidDownloadService androidDownloadService, int i) {
        this.a = i;
        this.b = androidDownloadService;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        AndroidDownloadService androidDownloadService = this.b;
        switch (i) {
            case 0:
                return vm7.U(androidDownloadService).d(ug8.a(h13.class), null);
            default:
                return vm7.U(androidDownloadService).d(ug8.a(i13.class), null);
        }
    }
}
