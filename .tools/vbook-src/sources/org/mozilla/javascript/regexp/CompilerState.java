package org.mozilla.javascript.regexp;

import org.mozilla.javascript.Context;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
class CompilerState {
    char[] cpbegin;
    int cpend;
    Context cx;
    int flags;
    int parenNesting;
    RENode result;
    int cp = 0;
    int backReferenceLimit = Integer.MAX_VALUE;
    int maxBackReference = 0;
    int parenCount = 0;
    int classCount = 0;
    int progLength = 0;

    public CompilerState(Context context, char[] cArr, int i, int i2) {
        this.cx = context;
        this.cpbegin = cArr;
        this.cpend = i;
        this.flags = i2;
    }
}
