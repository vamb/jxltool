package com.mh.jxltool.constant;

/**
 * 
 * @author jasonyao
 * @date 2014-08-06
 */
public class Const {

	public interface Node {
		public static final String IMPORT_CONFIG = "import-config";
		public static final String BEAN = "bean";
		public static final String FIELDS = "fields";
		public static final String FIELD = "field";
		public static final String RULE = "rule";
		public static final String EXPORT_CONFIG = "export-config";
		public static final String TITLES = "titles";
		public static final String TITLE = "title";
		public static final String FORMATS = "formats";
		public static final String FORMAT = "format";
		public static final String WIDTH = "width";
		public static final String HEIGHT = "height";
		public static final String ALIGN = "align";
		public static final String VERTICAL_ALIGN = "vertical";
		public static final String FONT_SIZE = "fontSize";
		public static final String FONT_NAME = "fontName";
		public static final String FONT_COLOR = "fontColor";
		public static final String BLOD = "blod";
		public static final String WRAP = "wrap";
		public static final String DATE_FORMAT = "dateFormat";
		public static final String DATA_FORMAT = "dataFormat";
		public static final String BACKGROUND_COLOR = "backColor";
	}

	public interface Attr {
		public static final String ID = "id";
		public static final String START_ROW = "startRow";
		public static final String TOTAL_COLS = "totalCols";
		public static final String SEQUENCE = "seq";
		public static final String NAME = "name";
		public static final String GETTER_METHOD = "getterMethod";
		public static final String REFERENCE = "ref";
		public static final String CLASS_NAME = "class";  
	}
	
	public interface ReturnType {
		public static final String INT = "int";
		public static final String INTEGER = "java.lang.Integer";
		public static final String DOUBLE = "double";
		public static final String DATE = "java.util.Date";
		public static final String BIG_DECIMAL = "java.math.BigDecimal";
		public static final String LONG = "long";
		public static final String STRING = "java.lang.String";
	}
	
	public interface Rule {
		public static final int MANDATORY = 1;
		public static final int MAX_LENGTH = 2;
		public static final int AMOUNT = 3;
		public static final int DATE = 4;
		public static final int NUMBER = 5;
		public static final int FIX_LENGTH = 6;
		public static final int BOOLEAN = 7;
	}

}
