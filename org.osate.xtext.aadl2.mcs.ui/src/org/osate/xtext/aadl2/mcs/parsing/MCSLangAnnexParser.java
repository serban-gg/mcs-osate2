package org.osate.xtext.aadl2.mcs.parsing;

import org.osate.aadl2.AnnexLibrary;
import org.osate.aadl2.AnnexSubclause;
import org.osate.aadl2.modelsupport.errorreporting.ParseErrorReporter;
import org.osate.annexsupport.AnnexParseUtil;
import org.osate.annexsupport.AnnexParser;
import org.osate.core.OsateCorePlugin;
import org.osate.xtext.aadl2.mcs.parser.antlr.MCSParser;
import org.osate.xtext.aadl2.mcs.services.MCSGrammarAccess;
import com.google.inject.Injector;
import antlr.RecognitionException;


public class MCSLangAnnexParser implements AnnexParser{

	private Injector injector = OsateCorePlugin.getDefault() .getInjector("org.osate.xtext.aadl2.mcs.MCS");
	private MCSParser theMCSParser ; 
	protected MCSParser getParser() 
		{ if (theMCSParser == null) 
			{ if (injector == null) 
				{ injector = OsateCorePlugin.getDefault() .getInjector("org.osate.xtext.aadl2.mcs.MCS"); } 
				theMCSParser = injector.getInstance(MCSParser.class); } 
			return theMCSParser; }
	protected MCSGrammarAccess getGrammarAccess() 
		{ return getParser().getGrammarAccess(); }
	@Override 
	public AnnexLibrary parseAnnexLibrary(String annexName, String source, String filename, 
										int line, int column, ParseErrorReporter errReporter) 
										throws RecognitionException 
						{ AnnexLibrary annex_lib_ast_root = (AnnexLibrary) AnnexParseUtil.parse(getParser(), source, getGrammarAccess().getMCSAnnexLibraryRule(), filename, line, column, errReporter); 
						  return annex_lib_ast_root; }
	 @Override 
	 public AnnexSubclause parseAnnexSubclause(String annexName, String source, String filename, 
			 							int line, int column, ParseErrorReporter errReporter) 
			 							throws RecognitionException 
	 					{ AnnexSubclause annex_clause_ast_root = (AnnexSubclause) AnnexParseUtil.parse(getParser(), source, getGrammarAccess().getMCSAnnexSubclauseRule(), filename, line, column, errReporter); 
	 					  return annex_clause_ast_root; } 
}
