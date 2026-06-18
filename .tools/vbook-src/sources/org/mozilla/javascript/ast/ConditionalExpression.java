package org.mozilla.javascript.ast;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class ConditionalExpression extends AstNode {
    private int colonPosition;
    private AstNode falseExpression;
    private int questionMarkPosition;
    private AstNode testExpression;
    private AstNode trueExpression;

    public ConditionalExpression() {
        this.questionMarkPosition = -1;
        this.colonPosition = -1;
        this.type = Token.HOOK;
    }

    public int getColonPosition() {
        return this.colonPosition;
    }

    public AstNode getFalseExpression() {
        return this.falseExpression;
    }

    public int getQuestionMarkPosition() {
        return this.questionMarkPosition;
    }

    public AstNode getTestExpression() {
        return this.testExpression;
    }

    public AstNode getTrueExpression() {
        return this.trueExpression;
    }

    @Override // org.mozilla.javascript.ast.AstNode, org.mozilla.javascript.Node
    public boolean hasSideEffects() {
        if (this.testExpression == null || this.trueExpression == null || this.falseExpression == null) {
            AstNode.codeBug();
        }
        return this.trueExpression.hasSideEffects() && this.falseExpression.hasSideEffects();
    }

    public void setColonPosition(int i) {
        this.colonPosition = i;
    }

    public void setFalseExpression(AstNode astNode) {
        assertNotNull(astNode);
        this.falseExpression = astNode;
        astNode.setParent(this);
    }

    public void setQuestionMarkPosition(int i) {
        this.questionMarkPosition = i;
    }

    public void setTestExpression(AstNode astNode) {
        assertNotNull(astNode);
        this.testExpression = astNode;
        astNode.setParent(this);
    }

    public void setTrueExpression(AstNode astNode) {
        assertNotNull(astNode);
        this.trueExpression = astNode;
        astNode.setParent(this);
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        return makeIndent(i) + this.testExpression.toSource(i) + " ? " + this.trueExpression.toSource(0) + " : " + this.falseExpression.toSource(0);
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.testExpression.visit(nodeVisitor);
            this.trueExpression.visit(nodeVisitor);
            this.falseExpression.visit(nodeVisitor);
        }
    }

    public ConditionalExpression(int i) {
        super(i);
        this.questionMarkPosition = -1;
        this.colonPosition = -1;
        this.type = Token.HOOK;
    }

    public ConditionalExpression(int i, int i2) {
        super(i, i2);
        this.questionMarkPosition = -1;
        this.colonPosition = -1;
        this.type = Token.HOOK;
    }
}
