package defpackage;

import java.io.File;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class pz extends o1a implements kb4 {
    public final /* synthetic */ String a;
    public final /* synthetic */ List b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pz(String str, List list, jt1 jt1Var) {
        super(1, jt1Var);
        this.a = str;
        this.b = list;
    }

    @Override // defpackage.vc0
    public final jt1 create(jt1 jt1Var) {
        return new pz(this.a, this.b, jt1Var);
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        return ((pz) create((jt1) obj)).invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) throws ab1 {
        e11.e0(obj);
        Path path = Paths.get(this.a, new String[0]);
        path.getClass();
        j46 j46Var = ah5.a;
        File file = path.toFile();
        file.getClass();
        File file2 = ah5.a(file) ? file : null;
        if (file2 == null) {
            throw new ab1(file);
        }
        Path path2 = file2.toPath();
        OpenOption[] openOptionArr = (OpenOption[]) this.b.toArray(new OpenOption[0]);
        return AsynchronousFileChannel.open(path2, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
    }
}
