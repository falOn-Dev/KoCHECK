// Generated from C:/Users/falon/Desktop/Programming/Java/Kotlin-Analyzer/grammar/Kotlin.g4 by ANTLR 4.13.1
package generated_code;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KotlinParser}.
 */
public interface KotlinListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KotlinParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(KotlinParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(KotlinParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(KotlinParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(KotlinParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(KotlinParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(KotlinParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(KotlinParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(KotlinParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(KotlinParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(KotlinParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(KotlinParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(KotlinParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(KotlinParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(KotlinParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(KotlinParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(KotlinParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(KotlinParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(KotlinParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(KotlinParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(KotlinParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(KotlinParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(KotlinParser.BlockContext ctx);
}