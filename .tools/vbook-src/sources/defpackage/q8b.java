package defpackage;

import android.content.Context;
import android.content.Intent;
import com.reader.data.reader.text.core.tts.AndroidTextToSpeechService;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class q8b {
    public final Context a;

    public q8b(Context context) {
        this.a = context;
    }

    public final void a(int i, int i2, String str) {
        str.getClass();
        Context context = this.a;
        Intent intent = new Intent(context, (Class<?>) AndroidTextToSpeechService.class);
        intent.setAction("com.reader.action.tts.START");
        intent.putExtra("ARGS_BOOK_ID", str);
        intent.putExtra("ARGS_CHAPTER_INDEX", i);
        intent.putExtra("ARGS_CHAR_INDEX", i2);
        hs1.startForegroundService(context, intent);
    }
}
