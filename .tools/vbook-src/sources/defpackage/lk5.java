package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class lk5 {
    public final Set a = fw.Q0(new String[]{"if", "else", "when", "for", "while", "do", "return", "break", "continue", "package", "import", "class", "interface", "fun", "val", "var", "object", "companion", "data", "sealed", "enum", "annotation", "typealias", "abstract", "open", "override", "final", "private", "protected", "public", "internal", "lateinit", "const", "inline", "noinline", "crossinline", "reified", "suspend", "tailrec", "operator", "infix", "external", "expect", "actual", "this", "super", "null", "true", "false", "is", "in", "as", "try", "catch", "finally", "throw", "constructor", "init", "by", "where", "out", "get", "set", "field", "it"});
    public final Set b = fw.Q0(new String[]{"Unit", "Nothing", "Any", "Boolean", "Byte", "Short", "Int", "Long", "Float", "Double", "Char", "String", "Array", "List", "Set", "Map", "Pair", "Triple", "Sequence", "IntArray", "LongArray", "FloatArray", "DoubleArray", "BooleanArray", "CharArray", "ByteArray", "ShortArray", "Collection", "Iterable", "Iterator", "MutableList", "MutableSet", "MutableMap", "Number", "Comparable", "Throwable", "Exception", "Error"});

    public final xl7 a(String str, int i, char c) {
        int i2 = i + 1;
        boolean z = false;
        while (i2 < str.length()) {
            if (z) {
                z = false;
            } else if (str.charAt(i2) == '\\') {
                z = true;
            } else if (str.charAt(i2) == c) {
                return new xl7(Integer.valueOf(i2 + 1), Boolean.FALSE);
            }
            i2++;
        }
        return new xl7(Integer.valueOf(i2), Boolean.FALSE);
    }
}
