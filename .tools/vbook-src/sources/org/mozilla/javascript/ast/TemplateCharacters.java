package org.mozilla.javascript.ast;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class TemplateCharacters extends AstNode {
    private String rawValue;
    private String value;

    public TemplateCharacters() {
        this.type = Token.TEMPLATE_CHARS;
    }

    public String getRawValue() {
        return this.rawValue;
    }

    public String getValue() {
        return this.value;
    }

    public void setRawValue(String str) {
        assertNotNull(str);
        this.rawValue = str;
    }

    public void setValue(String str) {
        this.value = str;
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        return tw2.n(makeIndent(i), this.rawValue);
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        nodeVisitor.visit(this);
    }

    public TemplateCharacters(int i) {
        super(i);
        this.type = Token.TEMPLATE_CHARS;
    }

    public TemplateCharacters(int i, int i2) {
        super(i, i2);
        this.type = Token.TEMPLATE_CHARS;
    }
}
